package cn.guardskill.service;

import cn.guardskill.orm.Good;

public interface GoodService {
	Integer  addGood(Good good);
	Good findByKey(Integer uName);
	Good findByName(String uName);
}
