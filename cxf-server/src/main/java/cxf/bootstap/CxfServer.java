package cxf.bootstap;

import org.apache.cxf.jaxws.JaxWsServerFactoryBean;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import cxf.service.CxfIService;
import cxf.service.impl.CxfServiceImpl;

/**
 * wsdl地址：http://localhost:9093/cxf_services?wsdl
 * @author donald
 * 2017年7月8日
 * 下午6:03:07
 */
public class CxfServer {
	private static final Logger log = LoggerFactory.getLogger(CxfServer.class);
	private static final String CXF_WS_URI = "http://localhost:9093/cxf_services";
	public static void main(String[] args) {
        JaxWsServerFactoryBean jwsServerfactory = new JaxWsServerFactoryBean();
        jwsServerfactory.setServiceClass(CxfIService.class);//SEI
        jwsServerfactory.setAddress(CXF_WS_URI);
        jwsServerfactory.setServiceBean(new CxfServiceImpl());//SIB
        jwsServerfactory.create();
        log.info("======CFX-WS Server start！======");
    }
}
