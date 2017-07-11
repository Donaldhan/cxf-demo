package entity.calculate;

import com.thoughtworks.xstream.annotations.XStreamAlias;

/**
 * 
 * @author donald
 * 2017年7月10日
 * 上午10:07:18
 */
public class CaculateResult {
	private String code;//代码，001处理成功，000处理失败
	private String message;//消息与代码对应
	@XStreamAlias("data")
	private ResultData resultData;
	public CaculateResult(String code, String message, ResultData resultData) {
		super();
		this.code = code;
		this.message = message;
		this.resultData = resultData;
	}
	public CaculateResult() {
		super();
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public ResultData getResultData() {
		return resultData;
	}
	public void setResultData(ResultData resultData) {
		this.resultData = resultData;
	}
}
