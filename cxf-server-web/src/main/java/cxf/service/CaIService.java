package cxf.service;

import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

/**
 * 
 * @author donald
 * 2017年7月10日
 * 上午10:10:39
 */
@WebService(
		targetNamespace = "http://www.donald.service/cal_service/"
)
public interface CaIService {
	@WebResult(name="result")
	public String calculate(@WebParam(name="xmlData")String xmlData);
	
}
