package entity.calculate;

import com.thoughtworks.xstream.annotations.XStreamAlias;

/**
 * 计算结果
 * @author donald
 * 2017年7月10日
 * 上午9:57:15
 */
@XStreamAlias("services")
public class CalculateReponse {
	@XStreamAlias("header")
	private CalculateHeader calHeader;
	@XStreamAlias("body")
	private CaculateResult calResult;
	public CalculateReponse() {
		super();
	}
	public CalculateReponse(CalculateHeader calHeader, CaculateResult calResult) {
		super();
		this.calHeader = calHeader;
		this.calResult = calResult;
	}
	public CalculateHeader getCalHeader() {
		return calHeader;
	}
	public void setCalHeader(CalculateHeader calHeader) {
		this.calHeader = calHeader;
	}
	public CaculateResult getCalResult() {
		return calResult;
	}
	public void setCalResult(CaculateResult calResult) {
		this.calResult = calResult;
	}
	
}
