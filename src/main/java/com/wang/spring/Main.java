package com.wang.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by hadoop on 2017/1/4 0004.
 */
public class Main {
    public static void main(String[] args) {
/*
    Spring �ṩ��2�����͵�IOC����ʵ��
    BeanFactory
    ApplicationContext(����ʵ����������2��,)
    ClassPathXmlApplicationContext ����·���¼��������ļ�
    FileSystemXmlApplicationContext ���ļ����м��������ļ�
 */

        //����Spring��IOC��������
        //AplicationContext�ڳ�ʼ��������ʱ��ʵ�������е�����Bean
        //ApplicationContext����IOC������
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");

        //��IOC  �����л�ȡBeanʵ��
        //����id��λ��IOC�����е�bean
        HelloSpring helloSpring = (HelloSpring) ctx.getBean("hellospring");
        //�������ͷ���IOC�����е�Bean����Ҫ��IOC�����б���ֻ����һ�������͵�bean
        //  HelloSpring helloSpring = ctx.getBean(HelloSpring.class);
        //����hello����
        helloSpring.hello();


        Car car = (Car) ctx.getBean("car");
        System.out.println(car);

        car = (Car) ctx.getBean("car2");
        System.out.println(car);

        Person person = (Person) ctx.getBean("person");
        System.out.println(person);

        Person person2 = (Person) ctx.getBean("person2");
        System.out.println(person2);

//        Person person3 = (Person) ctx.getBean("person3");
//        System.out.println(person3);

        DataSource dataSource = (DataSource) ctx.getBean("dataSource");
        System.out.println(dataSource);

    }

}
