package com.annotation.repository;

import org.springframework.stereotype.Repository;

/**
 * Created by Administrator on 2017/2/1 0001.
 */

/**
 *
 * ����ɨ�赽�������Spring��Ĭ�ϵ��������ԣ�ʹ�÷��޶���������һ����ĸСд��
 * Ҳ������ע����ͨ��value����ֵ��ʶ���������
 */
//�־û���
@Repository("userRepository")
public class UserRepositoryImpl implements UserRepository {
    public void save() {
        System.out.println("UserRepository Save....");
    }
}
