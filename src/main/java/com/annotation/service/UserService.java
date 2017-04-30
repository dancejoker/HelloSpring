package com.annotation.service;

import com.annotation.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

/**
 * Created by Administrator on 2017/2/1 0001.
 */
//ҵ���
@Service
public class UserService {
 /**
    �Զ�װ����м������͵ĵ���Bean���ԣ���������
    ��ͨ�ֶΣ���ʹ�Ƿ�public��,һ�о��в����ķ���
    ����ʹ��@Autowiredע������Զ���Ҫ�����ã���Spring�Ҳ���
    ƥ���Beanװ������ʱ�����׳��쳣��
    ��ĳһ�������������ã���������@Autowiredע���required
    ����Ϊfalse��eg:@Autowired(required=false)
    @Autowired
    @Qualifier("userJdbcRepository")
  **/
// @Autowired
// @Qualifier("userJdbcRepository")
    private UserRepository userRepository;

    /**
     * ��IOC��������ڶ�����ͼ��ݵ�Beanʱ��ͨ�����͵��Զ�װ��
     * ���޷���������ʱ������@Qualifierע�����ṩbean�����ƣ�
     * Spring����Է�������α�ע@Qualifier��ָ��ע��bean������
     */
    @Autowired
    @Qualifier("userJdbcRepository")
    public void setUserRepository(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public  void add(){
        System.out.println("UserService add...");
        userRepository.save();
    }
}
