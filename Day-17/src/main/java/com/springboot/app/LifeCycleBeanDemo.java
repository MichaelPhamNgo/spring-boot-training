package com.beaconfire;

import com.beaconfire.controller.QuestionController;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class LifeCycleBeanDemo {
    public static void main(String[] args) {
        // eager initialization
        ApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
        LifeCycleBean bean = ac.getBean("bean",LifeCycleBean.class);


        //lazy initialization
        //BeanFactory beanFactory = new XmlBeanFactory(new ClassPathResource("bean.xml"));
        //LifeCycleBean bean = beanFactory.getBean("bean",LifeCycleBean.class);

        //destroy the application context
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("bean.xml");
        classPathXmlApplicationContext.destroy();



    }
}
