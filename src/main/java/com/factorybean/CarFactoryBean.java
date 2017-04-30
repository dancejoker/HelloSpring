package com.factorybean;

import com.factory.Car;
import org.springframework.beans.factory.FactoryBean;

/**
 * Created by Administrator on 2017/2/1 0001.
 */
//�Զ����FactoryBean��Ҫʵ��FactoryBean�ӿ�
public class CarFactoryBean implements FactoryBean<Car> {
    private String brand;

    public void setBrand(String brand){
        this.brand = brand;
    }
    //����bean�Ķ���
    public Car getObject() throws Exception {
        return new Car(brand,500000);
    }

    //����bean������
    public Class<?> getObjectType() {
        return Car.class;
    }

    public boolean isSingleton() {
        return true;
    }
}
