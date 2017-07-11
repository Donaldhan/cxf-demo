package util;

import java.util.UUID;
/**
 * 
 * @author donald
 * 2017年7月10日
 * 下午1:13:19
 */
public class UuidUtil {
	/**
	 * 
	 * @return
	 */
	public static String get32UUID() {
		String uuid = UUID.randomUUID().toString().trim().replaceAll("-", "");
		return uuid;
	}
   /**
    * 
    * @return
    */
	public static String get5UUID() {
		String tmp = get32UUID();
		return tmp.substring(0, 5);
	}
    /**
     * 
     * @return
     */
	public static String get6UUID() {
		String tmp = get32UUID();
		return tmp.substring(0, 6);
	}
	/**
	 * 
	 * @return
	 */
	public static String get20UUID() {
		String tmp = get32UUID();
		return tmp.substring(0, 20);
	}
}
