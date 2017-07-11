package cxf.service;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

import entity.User;
/**
 * service endpoint interface（SEI）
 * RPC接口
 * 如果返回结果时实例类，则targetNamespace必须用http://service.jws/，即http://+SEI倒序报名+/
 * 没有的话可以，targetNamespace可任意指定http://www.donald.service/jws_service/
 * @author donald
 * 2017年7月7日
 * 下午5:11:53
 */
@WebService(
		targetNamespace = "http://service.cxf/"
//		targetNamespace = "http://www.donald.service/cxf_service/"
)
public interface CxfIService {
	//@WebMethod注解可写可不写
//	@WebMethod 
	@WebResult(name="sumResult")
	public int sum(@WebParam(name="firstNum")int firstNum,
			@WebParam(name="secondNum")int secondNum);
	
	@WebResult(name="multiplyResult")
	public int multiply(@WebParam(name="firstNum")int firstNum,
			@WebParam(name="secondNum")int secondNum);
	
	@WebResult(name="loginUserInfo")
	public User login(@WebParam(name="userName")String userName,
			@WebParam(name="password")String password);

}