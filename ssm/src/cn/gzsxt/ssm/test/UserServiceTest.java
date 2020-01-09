package cn.gzsxt.ssm.test;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import cn.gzsxt.ssm.pojo.User;
import cn.gzsxt.ssm.service.UserService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring.xml")
public class UserServiceTest {
    @Autowired
	private UserService userService;
	
	@Test
	public void testSelectByPrimaryKey() {
		User user = userService.selectByPrimaryKey(12);
		System.out.println(user);
	}
	
	@Test
	public void testSelectList() {
		List<User> users = userService.selectList();
		for (User user : users) {
			System.out.println(user);
		}
	}
	
	

}
