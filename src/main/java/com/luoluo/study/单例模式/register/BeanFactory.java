package com.luoluo.study.单例模式.register;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class BeanFactory {

    private static Map<String, Object> IOC = new ConcurrentHashMap<>();


    public static Object getBean(String className) {

        if (IOC.get(className) == null) {
            Object obj = null;
            try {
                Class.forName(className).newInstance();
                obj = IOC.put(className, obj);
            } catch (ClassNotFoundException | InstantiationException | IllegalAccessException e) {
                e.printStackTrace();
            }
            return obj;
        } else {
            return IOC.get(className);
        }

    }

}
