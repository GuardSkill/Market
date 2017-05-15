package cn.guardskill.service;

import org.springframework.transaction.annotation.Transactional;

import cn.guardskill.dao.UserDao;
import cn.guardskill.orm.User;
@Transactional
public class UserServiceIm implements UserService{
	private UserDao userDao;  //userDao interface implement reply UserHibernate by spring bean
	public UserDao getUserDao() {
		return userDao;
	}

	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

	@Override
	public String addUser(User user) {	
		if(user.getuName().trim().isEmpty()||user.getuName().length()>10
				||user.getuPassword().length()>10
				||user.getuPassword().trim().isEmpty()
				||user.getuPhone().trim().isEmpty()) return null;
		//subtract " " and calculate  if empty
		User test=userDao.get(User.class,user.getuName());
		if(test!=null) return null;  //already exist
		else return (String) userDao.save(user);
		
	}
	public User loginUser(User user) {
		User userdata=userDao.get(User.class,user.getuName());
		if(userdata==null||!(userdata.getuPassword().equals(user.getuPassword()))) return null;
		//用户名或密码错误
		else return userdata;
		
	}

	@Override
	public User findByKey(String uName) {
		return userDao.get(User.class,uName);
	}


}
