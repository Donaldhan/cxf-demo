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
 * CXF 动态代理模式，不同生成本地WS代理类，
 * 通过反射调用WS 的对应的方法，传入相应的参数
 * 访问cxf-server-web项目下的webservice
 * 测试Cxf发布WebService web方式的接口：
 * http://localhost:8080/cxf-server-web/services服务下,
 * http://localhost:8080/cxf-server-web/services/cxf_service?wsdl
 * @author donald
 * 2017年7月8日
 * 下午7:24:12
 */
public class CxfDynamicClientOnCxfWeb2 {
	private static final Logger log = LoggerFactory.getLogger(CxfClient.class);
	private static final String CXF_WSDL_URI = "http://localhost:8080/cxf-server-web/services/jws_service?wsdl";
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
