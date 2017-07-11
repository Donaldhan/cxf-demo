package cxf.bootstrap;


import org.apache.cxf.endpoint.Client;
import org.apache.cxf.jaxws.endpoint.dynamic.JaxWsDynamicClientFactory;
import org.apache.cxf.transport.http.HTTPConduit;
import org.apache.cxf.transports.http.configuration.HTTPClientPolicy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jws.service.User;
import util.JsonUtil;

/**
 * CXF 动态代理模式，不用生成本地WS代理类，
 * 通过反射调用 WS 的对应的方法，传入相应的参数
 * 访问cxf-server-web项目下的webservice;
 * 测试jaxws-ri发布WebService web方式。
 * 此测试实例，用于测试SEI和SIB的targetNamespace指定的webService接口：
 * http://localhost:8080/cxf-server-web/jws_services?wsdl；
 * @author donald
 * 2017年7月8日
 * 下午7:24:12
 */
public class CxfDynamicClientOnJwsRiWeb {
	private static final Logger log = LoggerFactory.getLogger(CxfClient.class);
	private static final String JWS_RT_WSDL_URI = "http://localhost:8080/cxf-server-web/jws_services?wsdl";
	public static void main(String[] args) throws Exception {
		log.info("======CXF-WS Dynamic Client start！======");
		JaxWsDynamicClientFactory dcf = JaxWsDynamicClientFactory.newInstance();
		Client client =  dcf.createClient(JWS_RT_WSDL_URI);
		HTTPConduit conduit = (HTTPConduit)client.getConduit(); 
		HTTPClientPolicy policy = new HTTPClientPolicy(); 
		policy.setConnectionTimeout(10000); 
		policy.setAllowChunking(false); 
		policy.setReceiveTimeout(10000); 
		conduit.setClient(policy);	
		Object[] invokeResult = client.invoke("sum", 17,8);
		log.info("=======sumResult:" + invokeResult[0]);
		invokeResult = client.invoke("multiply", 17,8);
		log.info("=======multiplyResult:" + invokeResult[0]);
		invokeResult = client.invoke("login", "donald","123456");
//		import jws.service.User;注意User必须为jws.service.User
		User userInfo = (User)invokeResult[0];
		log.info("=======loginUserInfo:" + JsonUtil.toJson(userInfo));
	}
}
