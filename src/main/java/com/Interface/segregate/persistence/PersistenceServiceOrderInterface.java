package com.Interface.segregate.persistence;

import com.Interface.segregate.entity.Entity;

public interface PersistenceServiceOrderInterface<T extends Entity> {

	public void save(T entity);

	public void delete(T entity);

	public T findById(Long id);

}
