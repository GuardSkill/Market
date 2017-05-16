package cn.guardskill.dao;

import cn.guardskill.orm.User;

public interface UserDao extends BaseDao<User>{
	User getByNameAndPass(Class<User> entityClazz,String name,String pass);
	User getByName(Class<User> entityClazz,String name);
}