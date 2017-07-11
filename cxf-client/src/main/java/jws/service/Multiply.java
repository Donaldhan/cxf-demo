
package jws.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>multiply complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="multiply">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="firstNum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="secondNum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "multiply", propOrder = {
    "firstNum",
    "secondNum"
})
public class Multiply {

    protected int firstNum;
    protected int secondNum;

    /**
     * 获取firstNum属性的值。
     * 
     */
    public int getFirstNum() {
        return firstNum;
    }

    /**
     * 设置firstNum属性的值。
     * 
     */
    public void setFirstNum(int value) {
        this.firstNum = value;
    }

    /**
     * 获取secondNum属性的值。
     * 
     */
    public int getSecondNum() {
        return secondNum;
    }

    /**
     * 设置secondNum属性的值。
     * 
     */
    public void setSecondNum(int value) {
        this.secondNum = value;
    }

}
