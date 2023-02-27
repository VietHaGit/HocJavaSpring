package stackjava.com.springioc.applicationcontext;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		DataResource obj = (DataResource) context.getBean("dataResource");
		obj.printConnection();
	}
}
