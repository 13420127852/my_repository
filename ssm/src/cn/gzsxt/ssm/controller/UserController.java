package cn.gzsxt.ssm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.gzsxt.ssm.pojo.User;
import cn.gzsxt.ssm.service.UserService;

@Controller
@RequestMapping("/userController")
public class UserController {
    
	//注入service层
	@Autowired
	private UserService userService;
	
	//查询列表
	@RequestMapping("/list")
	public String list(Model model) {
		List<User> users = userService.selectList();
		//共享数据
		model.addAttribute("users", users);
		return "UserList";	
	}
	
	//删除user
	@RequestMapping("/deleteUser")
	public String deleteUser(Model model,Integer id) {
        userService.deleteByPrimaryKey(id);
        
		return "redirect:/userController/list.do";	
	}
		
}
