package util.converter;

import java.util.Date;

import com.thoughtworks.xstream.converters.basic.AbstractSingleValueConverter;

import util.DateUtil;
import util.StringHelper;

/**
 * @author donald
 * @date 2017-12-6
 * @time 下午2:55:48
 */
public class DateExtConverter extends AbstractSingleValueConverter {

	@SuppressWarnings({ "unchecked", "rawtypes" })
	@Override
	public boolean canConvert(Class type) {
		return type.isAssignableFrom(Date.class);
	}
	@Override
	public String toString(Object obj) {
		return obj != null ? DateUtil.getTime((Date)obj) : null;
	}

	@Override
	public Object fromString(String str) {
		Date date = null;
		if (StringHelper.isNotBlank(str)) {
			date = DateUtil.formatTime(str);
		} 
		return date;
	}

}
