package cxf.bootstrap;


import org.apache.cxf.endpoint.Client;
import org.apache.cxf.jaxws.endpoint.dynamic.JaxWsDynamicClientFactory;
import org.apache.cxf.transport.http.HTTPConduit;
import org.apache.cxf.transports.http.configuration.HTTPClientPolicy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import constant.BussConstant;
import entity.calculate.CalculateHeader;
import entity.calculate.CalculateReponse;
import entity.calculate.CalculateRequest;
import entity.calculate.OperateNum;
import util.UuidUtil;
import util.XmlUtil;

/**
 * 测试CaIService接口
 * @author donald
 * 2017年7月10日
 * 下午12:57:29
 */
public class CalCulateClient {
	private static final Logger log = LoggerFactory.getLogger(CxfClient.class);
	private static final String CXF_WSDL_URI = "http://localhost:8080/cxf-server-web/services/cal_service?wsdl";
	public static void main(String[] args) throws Exception {
		log.info("======CXF-WS Dynamic Client start！======");
		JaxWsDynamicClientFactory dcf = JaxWsDynamicClientFactory.newInstance();
		Client client =  dcf.createClient(CXF_WSDL_URI);
		HTTPConduit conduit = (HTTPConduit)client.getConduit(); 
		HTTPClientPolicy policy = new HTTPClientPolicy(); 
		policy.setConnectionTimeout(10000); 
		policy.setAllowChunking(false); 
		policy.setReceiveTimeout(10000); 
		conduit.setClient(policy);	
		CalculateRequest calRequest = new CalculateRequest();
		CalculateHeader calHeader = new CalculateHeader();
		calHeader.setBusNo(UuidUtil.get32UUID());
		calHeader.setBusCode(BussConstant.BUSS_CODE_SUM);
		calHeader.setVersion(BussConstant.BUSS_VERSION);
		calHeader.setToken("jack_token");
		calHeader.setSignature("jack_signature");
		calHeader.setTimes(System.currentTimeMillis());
		calRequest.setCalHeader(calHeader);
		calRequest.setOperateNum(new OperateNum(17,8));
		String xmlData = XmlUtil.toXml(calRequest);
		log.info("=======request Xml:"+xmlData);
		Object[] invokeResult = client.invoke("calculate",xmlData);
		String reponseXml = (String) invokeResult[0];
		log.info("=======response Xml:"+reponseXml);
		CalculateReponse calResponse = XmlUtil.toBean(reponseXml, CalculateReponse.class);
		log.info("=======calclulate Result:"+calResponse.getCalResult().getResultData().getResult());
	}
}
