package cn.gzsxt.ssm.service;

import java.util.List;

import cn.gzsxt.ssm.pojo.User;

public interface UserService {
	//插入一个user
		int insert(User user);
		//单行查询
		User selectByPrimaryKey(Integer id);
		//多行查询
		List<User> selectList();
		//修改
		int updateByPrimaryKey(User user);
		//删除
		int deleteByPrimaryKey(Integer id);
}
