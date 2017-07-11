package entity;

import com.thoughtworks.xstream.annotations.XStreamAlias;
/**
 * 
 * @author donald
 * 2017年7月9日
 * 下午10:49:03
 */
public  class FaxInfo{
    @XStreamAlias("code")
    private String faxCode;
    @XStreamAlias("number")
    private String faxnumber;
    
	public FaxInfo(String faxCode, String faxnumber) {
		super();
		this.faxCode = faxCode;
		this.faxnumber = faxnumber;
	}

	public String getFaxCode() {
		return faxCode;
	}

	public void setFaxCode(String faxCode) {
		this.faxCode = faxCode;
	}

	public String getFaxnumber() {
		return faxnumber;
	}

	public void setFaxnumber(String faxnumber) {
		this.faxnumber = faxnumber;
	}
 
}
