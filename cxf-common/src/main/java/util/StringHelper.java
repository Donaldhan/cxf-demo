package util;

/**
 * @author donald
 * @date 2017-12-6
 * @time 下午2:52:01
 */
public class StringHelper {
	/**
	 * @param value
	 * @return
	 */
	public static boolean isBlank(String value){
		boolean isBlank = false;
		if(value == null || value.equals("")){
			isBlank = true;
		}
		return isBlank;
	}
	/**
	 * @param value
	 * @return
	 */
	public static boolean isNotBlank(String value){
		return !isBlank(value);
	}
}
