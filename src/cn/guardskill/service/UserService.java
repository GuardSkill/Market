package cn.guardskill.service;

import cn.guardskill.orm.User;

public interface UserService
{
	String  addUser(User user);
	User findByKey(String uName);
	User  loginUser(User user);
}