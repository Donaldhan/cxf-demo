package jws.boostrap;

import java.net.MalformedURLException;
import java.net.URL;

import javax.xml.namespace.QName;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jws.service.impl.JwsIService;
import jws.service.impl.JwsServiceImplService;
import util.JsonUtil;

/**
 * JAX-WS 客户端；
 * 通过JAX-WS的API创建一个代理（用本地对象来替代远程的服务），
 * 来实现对于远程服务器端的调用；
 * wsimport命令用于生成本地代理（即本地对象）：
 * 在client项目的src下执行
 * wsimport -d . -keep -encoding UTF-8 -verbose http://localhost:9091/ns?wsdl
 * @author donald
 * 2017年7月7日
 * 下午11:41:37
 */
public class JwsClient {
	private static final Logger log = LoggerFactory.getLogger(JwsClient.class);
	/**
	 * @param args
	 * @throws MalformedURLException 
	 */
	public static void main(String[] args) throws MalformedURLException {
		log.info("======JAX-WS Client start！======");
		//创建访问wsdl服务地址的url
		URL url = new URL("http://localhost:9091/ns?wsdl");
		//通过Qname指明服务的具体信息
		QName sname = new QName("http://impl.service.jws/", "JwsServiceImplService");
		JwsServiceImplService msis = new JwsServiceImplService(url,sname);
		JwsIService ms = msis.getJwsServiceImplPort();
		log.info("=======sumResult:"+ms.sum(17,8));
		log.info("=======multiplyResult:"+ms.multiply(17,8));
		log.info("=======loginUserInfo:"+JsonUtil.toJson(ms.login("donald","123456")));
	}

}