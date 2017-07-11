package cxf.service;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

import entity.User;
/**
 * service endpoint interface（SEI）
 * RPC接口
 * @author donald
 * 2017年7月7日
 * 下午5:11:53
 */
@WebService
//(
//		name = "CxfIService",
//        targetNamespace = "http://www.donald.com/services/CxfIService")
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