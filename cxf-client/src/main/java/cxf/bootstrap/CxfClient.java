package cxf.bootstrap;


import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import cxf.service.CxfIService;
import util.JsonUtil;

/**
 * 代理工程模式调用WS接口，要本地生成代理类 wsimport -d . -keep -encoding UTF-8 -verbose
 * http://localhost:9093/cxf_services?wsdl
 * 
 * @author donald 2017年7月8日 下午7:09:23
 */
public class CxfClient {
	private static final Logger log = LoggerFactory.getLogger(CxfClient.class);
	private static final String CXF_WS_URI = "http://localhost:9093/cxf_services";

	public static void main(String[] args) {
		log.info("======CXF-WS Client start！======");
		JaxWsProxyFactoryBean factory = new JaxWsProxyFactoryBean();
		factory.setServiceClass(CxfIService.class);
		factory.setAddress(CXF_WS_URI);
		CxfIService cxfService = factory.create(CxfIService.class);
		log.info("=======sumResult:" + cxfService.sum(17, 8));
		log.info("=======multiplyResult:" + cxfService.multiply(17, 8));
		log.info("=======loginUserInfo:" + JsonUtil.toJson(cxfService.login("donald", "123456")));
	}
}
