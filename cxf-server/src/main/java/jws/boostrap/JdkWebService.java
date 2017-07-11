package jws.boostrap;

import javax.jws.WebParam;
import javax.jws.WebService;
import javax.xml.ws.Endpoint;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
/**
 * 
 * @author donald
 * 2017年7月8日
 * 上午12:08:00
 */
@WebService   
public class JdkWebService {   
	private static final Logger log = LoggerFactory.getLogger(JdkWebService.class);
	public static void main(String[] args) {   
        Endpoint.publish("http://localhost:9092/jdk_ws_demo", new JdkWebService());   
        log.info("======JAX-WS Server start！======");
	}   
    public String login(@WebParam(name="userName", targetNamespace = "http://demo/", mode = WebParam.Mode.IN)String userName) {   
        return "Hello " + userName + "!";   
    }         
}  