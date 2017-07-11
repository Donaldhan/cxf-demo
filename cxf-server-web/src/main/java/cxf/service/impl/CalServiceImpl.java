package cxf.service.impl;

import javax.jws.WebService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import constant.BussConstant;
import cxf.service.CaIService;
import entity.calculate.CaculateResult;
import entity.calculate.CalculateHeader;
import entity.calculate.CalculateReponse;
import entity.calculate.CalculateRequest;
import entity.calculate.OperateNum;
import entity.calculate.ResultData;
import util.XmlUtil;
/**
 * Service implementation Bean（SIB）
 * RPC接口实现
 * 注意这里的targetNamespace的命名空间为SEI对应的命名空间targetNamespace，
 * 注意最后要加/，否则利用CXF动态客户端调用时，会找不到抛出如下异常：
 * Exception in thread "main" org.apache.cxf.common.i18n.UncheckedException: 
 * No operation was found with the name {http://impl.service.jws/}sum.
 * @author donald
 * 2017年7月7日
 * 下午5:11:49
 */
@WebService(
		endpointInterface="cxf.service.CaIService",
		serviceName = "calService",
		portName = "calPort",
	    targetNamespace = "http://www.donald.service/cxf_service/"
		)
public class CalServiceImpl implements CaIService {
	private static final Logger log = LoggerFactory.getLogger(CalServiceImpl.class);

	@Override
	public String calculate(String xmlData) {
		log.info("======calculate protocol:"+xmlData);
		CalculateRequest calRequest = XmlUtil.toBean(xmlData, CalculateRequest.class);
		String resultXml = "";
		CalculateReponse calResponse = null;
		CalculateHeader header = calRequest.getCalHeader();
		//token有效
		if(valideToken(header.getToken())){
			OperateNum body = calRequest.getOperateNum();
			int calResultVal = 0;
			//加法
			if(header.getBusCode().equals(BussConstant.BUSS_CODE_SUM)){
				calResultVal  = body.getFirstNum() + body.getSecondNum();
			}
			if(header.getBusCode().equals(BussConstant.BUSS_CODE_MULTI)){
				calResultVal  = body.getFirstNum() + body.getSecondNum();
			}
			header.setTimes(System.currentTimeMillis());
			header.setSignature("rose_signature");
			calResponse = new CalculateReponse();
			calResponse.setCalHeader(header);
			CaculateResult calResult = new CaculateResult();
			calResult.setCode(BussConstant.RESULT_SUCCESS);
			calResult.setMessage("处理成功！");
			calResult.setResultData(new ResultData(calResultVal));
			calResponse.setCalResult(calResult);
		}
		else{
			header.setTimes(System.currentTimeMillis());
			header.setSignature("rose_signature");
			calResponse = new CalculateReponse();
			calResponse.setCalHeader(header);
			CaculateResult calResult = new CaculateResult();
			calResult.setCode(BussConstant.RESULT_FAIL);
			calResult.setMessage("处理失败，校验Token失败！");
			calResult.setResultData(new ResultData());
			calResponse.setCalResult(calResult);
		}
		resultXml = XmlUtil.toXml(calResponse);
		log.info("======calculate reuslt:"+resultXml);
		return resultXml;
	}
	/**
	 * 验证token
	 * @param token
	 * @return
	 */
	private boolean valideToken(String token){
		return true;
	}

	
}