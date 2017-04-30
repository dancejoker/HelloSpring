package com.factory;

import java.util.HashMap;
import java.util.Map;

/**
 * ʵ������������ʵ�������ķ�����������Ҫ���������ٵ��ù�����ʵ������������bean��ʵ��
 * Created by Administrator on 2017/2/1 0001.
 */
public class InstanceCarFactory {
    private Map<String,Car> cars = null;
    public InstanceCarFactory(){
        cars = new HashMap<String, Car>();
        cars.put("audi",new Car("Audi",300000));
        cars.put("ford",new Car("Ford",400000));
    }
    public Car getCar(String brand){
        return  cars.get(brand);
    }
}
