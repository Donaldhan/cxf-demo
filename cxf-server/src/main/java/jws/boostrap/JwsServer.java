package jws.boostrap;

import javax.xml.ws.Endpoint;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jws.service.impl.JwsServiceImpl;

/**
 * JAX-WS服务端
 * 通过Java语言定义远程调用接口SEI（service endpoint interface），
 * 并提供相关的RPC接口实现类SIB(Service implementation Bean)。
 * wsdl地址：http://localhost:9091/ns?wsdl
 * @author donald
 * 2017年7月7日
 * 下午5:11:45
 */
public class JwsServer {
	private static final Logger log = LoggerFactory.getLogger(JwsServer.class);
	public static void main(String[] args) {
		String address = "http://localhost:9091/ns";
		//通过JAX-WS的“服务发布接口-api”就可以将其发布为WebService接口
		Endpoint.publish(address, new JwsServiceImpl());
		log.info("======JAX-WS Server start！======");
	}
}