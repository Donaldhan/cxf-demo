package entity;

import com.thoughtworks.xstream.annotations.XStreamAlias;

/**
 * 
 * @author donald 
 * 2017年7月9日 
 * 下午10:55:28
 */
@XStreamAlias("address")
public class Address {
	private String postalCode;
	private String addInfo;

	public Address(String postalCode, String addInfo) {
		super();
		this.postalCode = postalCode;
		this.addInfo = addInfo;
	}

	public String getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

	public String getAddInfo() {
		return addInfo;
	}

	public void setAddInfo(String addInfo) {
		this.addInfo = addInfo;
	}
}
