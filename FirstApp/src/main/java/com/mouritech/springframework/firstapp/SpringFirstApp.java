package com.mouritech.springframework.firstapp;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class SpringFirstApp {

	public static void main(String[] args) {
		
		//Loading container with definition(configuration) given in XML file
		ApplicationContext container = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Quotation qu = (Quotation) container.getBean("quotationService");
		String quoteForDay = qu.getQuote();
		System.out.println(quoteForDay);
		
		Greetings gr = (Greetings) container.getBean("greetingsService");
		String wish = gr.getGreet();
		System.out.println(wish);
		
		Employee emp = (Employee) container.getBean("emp");
		System.out.println(emp);
		System.out.println(emp.getEmpId());
		emp.setEmpId(456);
		System.out.println(emp.getEmpId());
		
		System.out.println("===========================================");
		@SuppressWarnings("deprecation")
		XmlBeanFactory factory = 
				new XmlBeanFactory
					(new ClassPathResource("applicationContext.xml"));
		
		Quotation qu1 = (Quotation) factory.getBean("quotationService");
		String quoteForDay1 = qu1.getQuote();
		System.out.println(quoteForDay1);
		
		Greetings gr1 = (Greetings) factory.getBean("greetingsService");
		String wish1 = gr1.getGreet();
		System.out.println(wish1);
		
		Employee emp1= (Employee) factory.getBean("emp");
		System.out.println(emp1);
		System.out.println(emp.getEmpId());
		emp.setEmpId(45622);
		System.out.println(emp.getEmpId());

	}
	

}
