package cxf.service.impl;

import javax.jws.WebService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import cxf.service.CxfIService;
import entity.User;
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
		endpointInterface="cxf.service.CxfIService",
		serviceName = "cxfService",
		portName = "cxfPort",
	    targetNamespace = "http://service.cxf/"
//	    targetNamespace = "http://www.donald.service/cxf_service/"
		)
public class CxfServiceImpl implements CxfIService {
	private static final Logger log = LoggerFactory.getLogger(CxfServiceImpl.class);
	@Override
	public int sum(int firstNum, int secondNum) {
		int result = firstNum+secondNum;
		log.info("======"+firstNum+"+"+secondNum+"="+result);
		return result;
	}

	@Override
	public int multiply(int firstNum, int secondNum) {
		int result = firstNum*secondNum;
		log.info("======"+firstNum+"x"+secondNum+"="+result);
		return result;
	}

	@Override
	public User login(String userName, String password) {
		log.info("======"+userName+" is logining");
		User user = new User();
		user.setId(1);
		user.setUserName(userName);
		user.setPassword(password);
		return user;
	}

}