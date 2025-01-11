package com.springboot.app.dao;

/**
 * static proxy
 * needs to implement same interface
 */
public class PersonDaoProxy implements IPersonDao{

    private IPersonDao target;
    public PersonDaoProxy(IPersonDao target) {
        this.target = target;
    }

    @Override
    public void save() {
        System.out.println("before saving data");
        long time1 = System.currentTimeMillis();
        target.save();
        long time2 = System.currentTimeMillis();
        System.out.println(time2 - time1);
        System.out.println("after saving data");
    }

}
