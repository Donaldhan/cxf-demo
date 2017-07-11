package util;

import java.util.Map;
import java.util.Map.Entry;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;
/**
 * 对象与Xml字符串转化工具
 * @author donald
 * 2017年7月8日
 * 下午5:15:19
 */
public class XmlUtil {
	private static final XStream xstream;
	static {
		xstream = new XStream(new DomDriver("utf-8"));
	}
	/**
	 * xml文件头
	 */
	public static final String XML_HEADER =  "<?xml version=\"1.0\" encoding=\"utf-8\"?>";
	/**
	 * 转化对象为Xml字符串
	 * @param obj
	 * @return
	 */
	public static String toXml(Object obj) {
		xstream.processAnnotations(obj.getClass()); //处理XSteam注解
		return xstream.toXML(obj);
	}
	/**
	 * 转化对象为Xml字符串，并添加字符串
	 * @param obj
	 * @return
	 */
	public static String toXmlWithHeader(Object obj) {
		return XML_HEADER + toXml(obj);
	}
    /**
     * 转化XML为指定类
     * @param xmlStr
     * @param cls
     * @return
     */
	@SuppressWarnings("unchecked")
	public static <T> T toBean(String xmlStr, Class<T> clazz) {
		xstream.processAnnotations(clazz);
		T obj = (T) xstream.fromXML(xmlStr);
		return obj;
	}
    /**
     * 转化XML为指定类，并将转换别与类的映射关系
     * @param xmlStr
     * @param clazz
     * @param aliasMap,别名与类的映射，将别名转换为类
     * @return
     */
	public static <T> T toBeanWithAlias(String xmlStr, Class<T> clazz, Map<String, Class<?>> aliasMap) {
		xstream.processAnnotations(clazz);
		if(null != aliasMap && 0 < aliasMap.size()) {
			for (Entry<String, Class<?>> entry : aliasMap.entrySet()) {
				xstream.alias(entry.getKey(), entry.getValue());
			}
		}
		@SuppressWarnings("unchecked")
		T obj = (T) xstream.fromXML(xmlStr);
		return obj;
	}
	

}

