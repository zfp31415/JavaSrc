package com.zfp.Action;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloWorldImplTest {

	@Test
	public final void testSayHello() {
		//��ȡ�����ļ�ʵ����һ��IOC����
		ApplicationContext context = new ClassPathXmlApplicationContext("HelloWorld.xml");
		//ʹ��xml�����û�ȡhelloworldimpl�Ķ��� ������ӿڣ�
		HelloWorldImpl hwi = context.getBean("helloWorld",HelloWorldImpl.class);
		//���Խӿں���
		hwi.sayHello();
	}

}
