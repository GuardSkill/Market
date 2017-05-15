package cn.guardskill.service;

import cn.guardskill.orm.User;

public interface UserService
{
	Integer  addUser(User user);
	User findByKey(Integer uName);
	User findByName(String uName);
	User  loginUser(User user);
}