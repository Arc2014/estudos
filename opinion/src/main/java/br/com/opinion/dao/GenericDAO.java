package br.com.opinion.dao;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;
import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.util.List;
import java.util.Objects;

/**
 * Created by arcosta on 04/05/15.
 */
public class GenericDAO implements Serializable{

    @PersistenceContext(unitName = "opinion")
    private EntityManager entityManager;

    public GenericDAO(){
    }

    public EntityManager getEntityManager() {
        return entityManager;
    }

    public Object getById(int id) {
        return (Object) entityManager.find(getTypeClass(), id);
    }

    public void save(Object entity) {
        entityManager.persist(entity);
    }

    public void update(Object entity) {
        entityManager.merge(entity);
    }

    public void delete(Object entity) {
        entityManager.remove(entity);
    }

    public List<Object> findAll() {
        return entityManager.createQuery(("FROM " + getTypeClass().getName())).getResultList();
    }

    private Class getTypeClass() {
        Class  clazz = (Class) ((ParameterizedType) this.getClass().getGenericSuperclass()).getActualTypeArguments()[1];
        return clazz;
    }

}
