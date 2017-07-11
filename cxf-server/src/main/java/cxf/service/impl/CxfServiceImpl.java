package cxf.service.impl;

import javax.jws.WebService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import cxf.service.CxfIService;
import entity.User;
/**
 * Service implementation Bean（SIB）
 * RPC接口实现
 * @author donald
 * 2017年7月7日
 * 下午5:11:49
 */
@WebService(
		endpointInterface="cxf.service.CxfIService"
//		,portName = "CxfServiceImplPort",
//	    serviceName = "CxfServiceImplService",
//	    targetNamespace = "http://www.tmp.com/services/CxfIServiceImpl"
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