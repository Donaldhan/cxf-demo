package util;

import static org.junit.Assert.*;

import java.util.Date;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import util.entity.Person;

/**
 * @author donald
 * 2017年12月6日
 * 下午9:48:29
 */
public class XmlUtilTests {
	private static final Logger log = LoggerFactory.getLogger(XmlUtilTests.class);
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testToXml() {
		Person person = new Person("donald",23,new Date(),178.6);
		String result = XmlUtil.toXmlWithHeader(person);
		log.info("person to xml:\n{}",result);
		/*
		String expXml = 
		"<?xml version=\"1.0\" encoding=\"utf-8\"?>"+
		"<person>"+
		  "<name>donald</name>"+
		  "<age>23</age>"+
		  "<birthDay>2017-12-06 21:50:25</birthDay>"+
		  "<stature>178.6</stature>"+
		"</person>";
		Assert.assertEquals("转换失败", expXml, result);
		*/
	}
	@Test
	public void testToBean() {
		String orgXml = 
		"<?xml version=\"1.0\" encoding=\"utf-8\"?>"+
		"<person>"+
		  "<name>donald</name>"+
		  "<age></age>"+
		  "<birthDay>2017-12-06 21:50:25</birthDay>"+
		  "<stature></stature>"+
		"</person>";
		Person person = XmlUtil.toBean(orgXml, Person.class);
		log.info("to bean person:\n{}",XmlUtil.toXmlWithHeader(person));
	}
}
