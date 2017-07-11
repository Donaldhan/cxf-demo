package entity;

import java.util.List;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;
import com.thoughtworks.xstream.annotations.XStreamImplicit;
import com.thoughtworks.xstream.annotations.XStreamOmitField;
@XStreamAlias("person")
public class Person {
	//将name设置为XML person 元素的 attribute  
	@XStreamAsAttribute()
    private String name;
    @XStreamAlias("age")
    private int age;
    private String sex;
    //将此字段名在XML中去掉 ，忽略字段
    @XStreamOmitField  
    private String health;
    @XStreamAlias("addresses")
	private List<Address> address;
    @XStreamAlias("telphone")
    private Phone tel;
    private FaxInfo fax;
    //测试一个标签下有多个同名标签
    @XStreamAlias("friends")
    private Friends friend;
    //测试一个标签下循环对象
    @XStreamAlias("pets")
    private Pets pet;
    public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getHealth() {
		return health;
	}
	public void setHealth(String health) {
		this.health = health;
	}
	public List<Address> getAddress() {
		return address;
	}
	public void setAddress(List<Address> address) {
		this.address = address;
	}
	public Phone getTel() {
		return tel;
	}
	public void setTel(Phone tel) {
		this.tel = tel;
	}
	public FaxInfo getFax() {
		return fax;
	}
	public void setFax(FaxInfo fax) {
		this.fax = fax;
	}
	public Friends getFriend() {
		return friend;
	}
	public void setFriend(Friends friend) {
		this.friend = friend;
	}
	public Pets getPet() {
		return pet;
	}
	public void setPet(Pets pet) {
		this.pet = pet;
	} 
}
