package cn.guardskill.dao;

import java.io.Serializable;
import java.util.List;
public interface BaseDao<T> {
	T getByname(Class<T> entityClazz,String name);
	//query by name
	T get(Class<T> entityClazz,Serializable id);
	Serializable save(T entity);
	void update(T entity);
	void delete(T entity);
	void delet(Class<T> entityClazz,Serializable id);
	List<T> findAll(Class<T> entityClazz);
	long findCount(Class<T> entityClazz);
}
