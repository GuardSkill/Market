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
	public Integer addUser(User user) {	
		//subtract " " and calculate  if empty
		User test=userDao.getByname(User.class,user.getuName());
		if(test!=null) return null;  //already exist
		else return (Integer) userDao.save(user);
		
	}
	public User loginUser(User user) {
		User userdata=userDao.getByname(User.class,user.getuName());
		if(userdata==null||!(userdata.getuPassword().equals(user.getuPassword()))) return null;
		//用户名或密码错误
		else return userdata;
		
	}

	@Override
	public User findByKey(Integer uId) {
		return userDao.get(User.class,uId);
	}
	public User findByName(String uName)
	{
		return userDao.getByname(User.class, uName);
	}


}
