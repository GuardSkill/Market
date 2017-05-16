package cn.guardskill.service;

import cn.guardskill.dao.GoodDao;
import cn.guardskill.dao.UserDao;
import cn.guardskill.orm.Good;
import cn.guardskill.orm.User;

public class GoodServiceIm  implements  GoodService{
	private GoodDao goodDao;
	private UserDao userDao;
	private User user;
	@Override
	public Integer  addGood(Good good,Integer uId) {
		user=userDao.get(User.class, uId);
		if(user==null)
		{
			System.out.println("uId Error|database error,No  user with the uId");
			return null;
		}
		good.setgBuilder(user);
		return (Integer) goodDao.save(good);
	}

	@Override
	public Good findByKey(Integer uName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Good findByName(String uName) {
		// TODO Auto-generated method stub
		return null;
		
	}
	public void setGoodDao(GoodDao goodDao) {
		this.goodDao = goodDao;
	}

	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}


}
