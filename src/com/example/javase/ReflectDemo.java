package com.example.javase;

import java.io.File;
import java.io.FileInputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.security.Provider.Service;
import java.util.Properties;

import com.example.entities.Hero;
import com.example.interfaces.Services;
import com.example.interfaces.TestInterface;

public class ReflectDemo implements TestInterface{

    @Override
    public void test() {
        // TODO Auto-generated method stub
        String className = "com.example.entities.Hero";
        try {
            /**
             * 获取对象的方式有四种：
             * 1.new :需要调用构造方法
             * 2.Class对象获取：需要调用构造函数
             * 3.clone():不需要调用构造方法，涉及对象的深浅拷贝
             * 4.二进制流获取对象：不需要调用构造函数
             */
            //获取一个类的Class对象的方式有三种
            /* Class clazz1 = Hero.class;
            Class clazz2 = new Hero().getClass();
            Class clazz = Class.forName(className); */
            // 创建Hero对象的步骤
            /* Constructor co = clazz.getConstructor();
            Hero hero = (Hero)co.newInstance();
            hero.isOk(); */
            // 获取字段
            /* Field name = clazz.getField("name");
            name.set(hero, "jerry");//并不用调用set方法，而是直接赋值
            System.out.println(hero.name);
            System.out.println(name.get(hero)); */
            //获取方法
            /* Method m = clazz.getMethod("isOk");
            m.invoke(hero); */
            //如果获取的是静态方法，可以是null
            /* m = clazz.getMethod("isOkStatic");
            m.invoke(null); */
            /**
             * 下面是反射的应用案例，动态更新服务，在没有重新编译的情况下
             * 通过修改配置文件来到达切换服务的效果
             */
            while(true){
                try{
                File f = new File("resources/config.txt");
                Properties pros = new Properties();
                pros.load(new FileInputStream(f));
                String clazzName = pros.getProperty("class");
                String method = pros.getProperty("method");
                
                Class clz = Class.forName(clazzName);
                Constructor c = clz.getConstructor();
                Services ss = (Services)c.newInstance();
                Method mm = clz.getMethod(method);
                mm.invoke(ss);
                Thread.sleep(1000);}catch(Exception e){
                    System.out.println("class名称设置有误...");
                }
            }
            


        } catch (Exception e) {
            //TODO: handle exception
            
            e.printStackTrace();
        }
       
    }
    
}
