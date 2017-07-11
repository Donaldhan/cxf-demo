
package jws.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>loginResponse complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="loginResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="loginUserInfo" type="{http://service.jws/}user" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "loginResponse", propOrder = {
    "loginUserInfo"
})
public class LoginResponse {

    protected User loginUserInfo;

    /**
     * 获取loginUserInfo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link User }
     *     
     */
    public User getLoginUserInfo() {
        return loginUserInfo;
    }

    /**
     * 设置loginUserInfo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link User }
     *     
     */
    public void setLoginUserInfo(User value) {
        this.loginUserInfo = value;
    }

}
