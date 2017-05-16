package cn.guardskill.dao;

import java.util.List;

import cn.guardskill.orm.User;


public class UserHibernate extends MarketDao<User> implements UserDao
{
	@SuppressWarnings("unchecked")
	public User getByName(Class<User> entityClazz,String name)
	{
		/*
		String hql = "from User where uName = ? ";  
        Query query = getSessionFactory().getCurrentSession().createQuery(hql);  
        query.setParameter(0, name);  
        return (User)query.uniqueResult();  */
		List<User> users=find("from User where uName = ?0 ",name);
		if(users!=null&&users.size()==1)
		{
			return users.get(0);
		}
        return null;
	}
	public User getByNameAndPass(Class<User> entityClazz,String name,String pass)
	{
		/*
		String hql = "from User where uName = ? and uPassword = pass";  
        Query query = getSessionFactory().getCurrentSession().createQuery(hql);  
        query.setParameter(0, name);  
        query.setParameter(0, pass);
        return (User)query.uniqueResult();  */	
		List<User> users=find("from User where uName = ?0 and uPassword =?1 "
				,name,pass);
		if(users!=null&&users.size()==1)
		{
			return users.get(0);
		}
		
		else return null;
	}
}
