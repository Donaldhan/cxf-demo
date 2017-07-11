
package cxf.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>multiplyResponse complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="multiplyResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="multiplyResult" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "multiplyResponse", propOrder = {
    "multiplyResult"
})
public class MultiplyResponse {

    protected int multiplyResult;

    /**
     * 获取multiplyResult属性的值。
     * 
     */
    public int getMultiplyResult() {
        return multiplyResult;
    }

    /**
     * 设置multiplyResult属性的值。
     * 
     */
    public void setMultiplyResult(int value) {
        this.multiplyResult = value;
    }

}
