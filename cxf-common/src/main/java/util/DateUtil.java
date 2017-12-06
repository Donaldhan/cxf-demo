package util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


/**
 * @author donald
 * 2017年12月6日
 * 下午4:12:18
 */
public class DateUtil {
	private static final Logger log = LoggerFactory.getLogger(DateUtil.class);
	private final static SimpleDateFormat sdfDay = new SimpleDateFormat("yyyy-MM-dd");
	private final static SimpleDateFormat sdfTime = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	/**
	 * 获取YYYY-MM-DD HH:mm:ss格式
	 * 
	 * @return
	 */
	public static String getTime() {
		return sdfTime.format(new Date());
	}
	/**
	 * 获取YYYY-MM-DD HH:mm:ss格式
	 * @param date
	 * @return
	 */
	public static String getTime(Date date) {
		return sdfTime.format(date);
	}
	/**
	 * 格式化日期
	 * 
	 * @return
	 */
	public static Date formatDate(String date) {
		Date result = null;
		try {
			result = sdfDay.parse(date);
		} catch (ParseException e) {
			log.error("格式化日期出错",e);
		}
		return result;
	}
	/**
	 * @param date
	 * @return
	 */
	public static Date formatTime(String date) {
		Date result = null;
		try {
			result = sdfTime.parse(date);
		} catch (ParseException e) {
			log.error("格式化时间出错",e);
		}
		return result;
	}
}
