package entity.calculate;
/**
 * 
 * @author donald
 * 2017年7月10日
 * 上午9:55:47
 */
public class OperateNum {
	private int firstNum;//操作数1
	private int secondNum;//操作数2
	public OperateNum() {
		super();
	}
	public OperateNum(int firstNum, int secondNum) {
		super();
		this.firstNum = firstNum;
		this.secondNum = secondNum;
	}
	public int getFirstNum() {
		return firstNum;
	}
	public void setFirstNum(int firstNum) {
		this.firstNum = firstNum;
	}
	public int getSecondNum() {
		return secondNum;
	}
	public void setSecondNum(int secondNum) {
		this.secondNum = secondNum;
	}
	
}
