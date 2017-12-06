package util.converter;

import com.thoughtworks.xstream.converters.basic.AbstractSingleValueConverter;

import util.StringHelper;

/**
 * @author donald
 * @date 2017-12-6
 * @time 下午2:55:55
 */
public class IntegerExtConverter extends AbstractSingleValueConverter {

	@SuppressWarnings("unchecked")
	public boolean canConvert(@SuppressWarnings("rawtypes") Class type) {
		return type.isAssignableFrom(Integer.class);
	}
	@Override
	public String toString(Object obj) {
		return obj != null ? String.valueOf(obj) : null;
	}
	@Override
	public Object fromString(String str) {
		Integer obj = null;
		if (StringHelper.isNotBlank(str)) {
			obj = Integer.valueOf(str);
		} 
		return obj;
	}
}
