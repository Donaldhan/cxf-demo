package entity;

import com.thoughtworks.xstream.annotations.XStreamAlias;

/**
 * 测试同一标签下循环某一对象
 * @author donald 
 * 2017年7月9日 
 * 下午10:50:41
 */
public class Animal {
	@XStreamAlias("name")
	private String name;
	@XStreamAlias("age")
	private int age;

	public Animal(String name, int age) {
		this.name = name;
		this.age = age;
	}

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
}
