package entity.calculate;

import com.thoughtworks.xstream.annotations.XStreamAlias;

/**
 * 计算请求
 * @author donald
 * 2017年7月10日
 * 上午9:57:15
 */
@XStreamAlias("services")
public class CalculateRequest {
	@XStreamAlias("header")
	private CalculateHeader calHeader;
	@XStreamAlias("body")
	private OperateNum operateNum;
	public CalculateRequest(CalculateHeader calHeader, OperateNum operateNum) {
		super();
		this.calHeader = calHeader;
		this.operateNum = operateNum;
	}
	public CalculateRequest() {
		super();
	}
	public CalculateHeader getCalHeader() {
		return calHeader;
	}
	public void setCalHeader(CalculateHeader calHeader) {
		this.calHeader = calHeader;
	}
	public OperateNum getOperateNum() {
		return operateNum;
	}
	public void setOperateNum(OperateNum operateNum) {
		this.operateNum = operateNum;
	}
}
