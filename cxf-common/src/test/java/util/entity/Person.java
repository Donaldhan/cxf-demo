package util.entity;

import java.io.Serializable;
import java.util.Date;

import com.thoughtworks.xstream.annotations.XStreamAlias;
@XStreamAlias("person")
public class Person implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -5680738148261277921L;
	private String name;
	private Integer age;
	private Date birthDay;
	private Double stature;
	
	public Person(String name, Integer age, Date birthDay, Double stature) {
		super();
		this.name = name;
		this.age = age;
		this.birthDay = birthDay;
		this.stature = stature;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public Date getBirthDay() {
		return birthDay;
	}
	public void setBirthDay(Date birthDay) {
		this.birthDay = birthDay;
	}
	public Double getStature() {
		return stature;
	}
	public void setStature(Double stature) {
		this.stature = stature;
	}
}
