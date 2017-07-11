package entity.calculate;
/**
 * 
 * @author donald
 * 2017年7月10日
 * 上午9:48:05
 */
public class CalculateHeader {
	private String busNo;//业务流水号
	private String busCode;//业务编码
	private Long times;//时间戳
	private String version;
	private String token;//令牌
	private String signature;//数字签名
	
	public CalculateHeader(String busNo, String busCode, Long times, String version,
			String token, String signature) {
		super();
		this.busNo = busNo;
		this.busCode = busCode;
		this.times = times;
		this.version = version;
		this.token = token;
		this.signature = signature;
	}
	public CalculateHeader() {
		super();
	}
	public String getBusNo() {
		return busNo;
	}
	public void setBusNo(String busNo) {
		this.busNo = busNo;
	}
	public String getBusCode() {
		return busCode;
	}
	public void setBusCode(String busCode) {
		this.busCode = busCode;
	}
	public Long getTimes() {
		return times;
	}
	public void setTimes(Long times) {
		this.times = times;
	}
	public String getVersion() {
		return version;
	}
	public void setVersion(String version) {
		this.version = version;
	}
	public String getToken() {
		return token;
	}
	public void setToken(String token) {
		this.token = token;
	}
	public String getSignature() {
		return signature;
	}
	public void setSignature(String signature) {
		this.signature = signature;
	}
}
