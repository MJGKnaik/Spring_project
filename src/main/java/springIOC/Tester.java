package springIOC;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class Tester {
   public static void main(String[] args) {
	   ClassPathResource resource=new ClassPathResource("/`springIOC/MyConfig.xml");
	BeanFactory factory=new XmlBeanFactory(resource);
	bike b=(bike) factory.getBean("x");
	System.out.println("b");
}
}
