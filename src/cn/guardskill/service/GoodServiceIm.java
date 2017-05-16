package cn.guardskill.service;

import cn.guardskill.dao.GoodDao;
import cn.guardskill.orm.Good;

public class GoodServiceIm  implements  GoodService{
	private GoodDao goodDao;

	@Override
	public Integer addGood(Good good) {
		
		
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


}
