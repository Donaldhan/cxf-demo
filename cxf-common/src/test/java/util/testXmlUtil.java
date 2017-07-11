package util;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import entity.Address;
import entity.Animal;
import entity.FaxInfo;
import entity.Friends;
import entity.Person;
import entity.Pets;
import entity.Phone;
/**
 * 测试XmlUtil工具类
 * @author donald
 * 2017年7月10日
 * 上午9:34:59
 */
public class testXmlUtil {
	private static final Logger log = LoggerFactory.getLogger(testXmlUtil.class);
	public static void main(String[] args) {
		testObjToXml();
		testXmlToObj();
	}
	/**
	 * 测试转换对象为XML
	 */
	private static void testObjToXml(){
		Person donald = new Person();
		donald.setName("donald_draper");
		donald.setAge(28);
		donald.setSex("female");
		donald.setHealth("good");
		List<Address> addressList = new ArrayList<Address>(2);
		addressList.add(new Address("236000","安徽省西湖新区"));
		addressList.add(new Address("440000","广东省广州市天河区"));
		donald.setAddress(addressList);
		donald.setTel(new Phone("020","86453666"));
		donald.setFax(new FaxInfo("031","86458888"));
		List<String> friendList = new ArrayList<String>(3);
		friendList.add("jamel");
		friendList.add("mark");
		friendList.add("lucy");
		donald.setFriend(new Friends(friendList));
		List<Animal> animalList = new ArrayList<Animal>(2);
		animalList.add(new Animal("dog",1));
		animalList.add(new Animal("cat",2));
		donald.setPet(new Pets(animalList));
		log.info("====person to xml:");
		System.out.println(XmlUtil.toXml(donald));
	}
	/**
	 *测试xml字符串转换为对象
	 */
	private static void testXmlToObj(){
		String personXml = 
				"<person name=\"donald_draper\">"+
				  "<age>28</age>"+
				  "<sex>female</sex>"+
				  "<addresses>"+
				    "<address>"+
				      "<postalCode>236000</postalCode>"+
				      "<addInfo>安徽省西湖新区</addInfo>"+
				    "</address>"+
				    "<address>"+
				      "<postalCode>440000</postalCode>"+
				      "<addInfo>广东省广州市天河区</addInfo>"+
				    "</address>"+
				  "</addresses>"+
				  "<telphone>"+
				    "<code>020</code>"+
				    "<number>86453666</number>"+
				  "</telphone>"+
				  "<fax>"+
				    "<code>031</code>"+
				    "<number>86458888</number>"+
				  "</fax>"+
				  "<friends>"+
				    "<name>jamel</name>"+
				    "<name>mark</name>"+
				    "<name>lucy</name>"+
				  "</friends>"+
				  "<pets>"+
				    "<pet>"+
				      "<name>dog</name>"+
				      "<age>1</age>"+
				    "</pet>"+
				    "<pet>"+
				      "<name>cat</name>"+
				      "<age>2</age>"+
				    "</pet>"+
				  "</pets>"+
				"</person>";
		Person donald = (Person) XmlUtil.toBean(personXml,Person.class);
		log.info("====xml to person:"+JsonUtil.toJson(donald));
	}
}
