package com.springcore.spel;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.expression.Expression;
import org.springframework.expression.spel.standard.SpelExpressionParser;

public class TestSpel {

	public static void main(String[] args) {
		ApplicationContext context =  new ClassPathXmlApplicationContext("com/springcore/spel/spelconfig.xml");
		Demo demo = context.getBean("demo",Demo.class);
		System.out.println(demo);
		
		
//		Spel Expression Method
//		SpelExpressionParser temp = new SpelExpressionParser();
//		Expression expression = temp.parseExpression("60+40");
//		System.out.println(expression.getValue());
	}
}


//control+shift+t
