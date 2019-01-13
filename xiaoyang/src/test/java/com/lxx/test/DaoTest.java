package com.lxx.test;

import java.util.List;

import javax.annotation.Resource;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.lxx.dao.UserDao;
import com.lxx.entity.User;
import com.lxx.service.UserServiceImp;

public class DaoTest {
	@Resource
	UserServiceImp usi;

	@Test
	public void findAllTest() {
		// ָ�������Ǵ��Ǹ��ļ���ã�����Ƕ������������ֱ��д������
		String[] conf = { "conf/spring-mybatis.xml", "conf/spring-mvc.xml" };
		ApplicationContext ac = new ClassPathXmlApplicationContext(conf);
//				DataSource dbcp = ac.getBean("dbcp",DataSource.class);
//				System.out.println(dbcp.getConnection());
//				SqlSessionFactory ssf = ac.getBean("ssf",SqlSessionFactory.class);
//				System.out.println(ssf.openSession());
		UserDao dao = ac.getBean("userDao", UserDao.class);
		List<User> users = dao.findAll();

		for (User user : users) {
			System.out.println(user);
		}
		if (users != null) {
			System.out.println("�û�����");
		} else {
			System.out.println("�û�������");
		}
	}
}
