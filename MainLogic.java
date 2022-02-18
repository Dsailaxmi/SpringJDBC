package com.ex;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainLogic {

	public static void main(String[] args) {
		ApplicationContext ct= new AnnotationConfigApplicationContext(JdbcAnno.class);
		SpringJdbcSelect sj=ct.getBean(SpringJdbcSelect.class);
		//sj.insert();
		sj.selectEx();
		//sj.update();
		//sj.delete();
	}

}
