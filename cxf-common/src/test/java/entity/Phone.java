package entity;

import com.thoughtworks.xstream.annotations.XStreamAlias;
/**
 * 
 * @author donald
 * 2017年7月9日
 * 下午10:49:03
 */
@XStreamAlias("Phone")
public  class Phone{
    @XStreamAlias("code")
    private String code;
    @XStreamAlias("number")
    private String number;
    
	public Phone(String code, String number) {
		super();
		this.code = code;
		this.number = number;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
 
}
