package entity;

import java.util.List;

import com.thoughtworks.xstream.annotations.XStreamImplicit;

/**
 * 测试同一标签下循环某一对象
 * @author donald 
 * 2017年7月9日 
 * 下午10:51:32
 */
public class Pets {
	//删除集合节点名称
	@XStreamImplicit(itemFieldName = "pet")
	private List<Animal> animalList;

	public Pets(List<Animal> animalList) {
		super();
		this.animalList = animalList;
	}

	public List<Animal> getAnimalList() {
		return animalList;
	}

	public void setAnimalList(List<Animal> animalList) {
		this.animalList = animalList;
	}
}
