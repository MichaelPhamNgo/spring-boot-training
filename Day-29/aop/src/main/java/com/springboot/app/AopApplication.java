package com.springboot.app;


import com.springboot.app.dao.DynamicProxy;
import com.springboot.app.dao.IPersonDao;
import com.springboot.app.dao.PersonDao;
import com.springboot.app.dao.PersonDaoProxy;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
@EnableAspectJAutoProxy
public class AopApplication {

    public static void main(String[] args) {
        SpringApplication.run(AopApplication.class, args);
        //staticProxy();
        //dynamicProxy();
    }

    public static void staticProxy() {
        //target object
        IPersonDao target = new PersonDao();
        //proxy object
        PersonDaoProxy proxy = new PersonDaoProxy(target);
        proxy.save();
    }

    public static void dynamicProxy() {
        IPersonDao target = new PersonDao();
        System.out.println(target.getClass());  //print out target class
        IPersonDao proxy = (IPersonDao) new DynamicProxy(target).getProxyInstance();
        System.out.println(proxy.getClass());  //print out proxy class
        proxy.save();  //invoke proxy method
    }

}
