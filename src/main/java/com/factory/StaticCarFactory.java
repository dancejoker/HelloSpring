package com.factory;

import java.util.HashMap;
import java.util.Map;

/**
 * ��̬����������ֱ�ӵ���ĳһ����ľ�̬�����Ϳ��Է���Bean��ʵ��
 * Created by Administrator on 2017/2/1 0001.
 */
public class StaticCarFactory {
    public static Map<String,Car> cars = new HashMap<String, Car>();
    static{
        cars.put("audi",new Car("audi",300000));
        cars.put("fo",new Car("ford",400000));
    }
    public static Car getCar(String name){
        return cars.get(name);
    }
}
