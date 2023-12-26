package org.mapa.MAPA.services;

import java.util.List;

public interface BaseService<T> {
    public List<T> findAll();
    public T findById(Long id);
    public void save(T entity);
    public void update(Long id, T entity);
    public void delete(T entity);
}
