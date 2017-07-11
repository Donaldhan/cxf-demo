package entity;

import java.util.List;

import com.thoughtworks.xstream.annotations.XStreamImplicit;

/**
 * 用Xstream注解的方式实现：一个标签下有多个同名标签
 * @author 
 * donald 
 * 2017年7月9日 
 * 下午10:48:40
 */
public class Friends {
	@XStreamImplicit(itemFieldName = "name") // itemFieldName定义重复字段的名称，
	/*
	 *  <friend>
		    <name>
		      <string>jamel</string>
		      <string>mark</string>
		      <string>lucy</string>
		    </name>
		</friend>
	 * 如果没有，则会变成 =====> 
	 * 
		 <friends>
		    <name>jamel</name>
		    <name>mark</name>
		    <name>lucy</name>
		 </friends>
	 */
	private List<String> name;

	public Friends(List<String> name) {
		super();
		this.name = name;
	}

	public List<String> getName() {
		return name;
	}

	public void setName(List<String> name) {
		this.name = name;
	}
}
