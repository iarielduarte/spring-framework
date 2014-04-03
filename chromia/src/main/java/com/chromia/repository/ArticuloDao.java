package com.chromia.repository;


/**
 * @author Ariel Duarte
 * @since 29-Marzo-2014
 * @version 1.0.0
 */


import java.io.Serializable;
import java.util.List;


import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.chromia.model.Articulo;

@Repository("ArticuloDao")
public class ArticuloDao implements IArticuloDao, Serializable {

	
	private static final long serialVersionUID = 1L;
	
	@Autowired
	private SessionFactory sessionFactory;
	

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Override
	public void addArticulo(Articulo articulo) {
		getSessionFactory().getCurrentSession().save(articulo);
		
	}

	@Override
	public void updateArticulo(Articulo articulo) {
		getSessionFactory().getCurrentSession().update(articulo);
		
	}

	@Override
	public void deleteArticulo(Articulo articulo) {
		getSessionFactory().getCurrentSession().delete(articulo);
		
	}

	@Override
	public Articulo getArticuloById(int id) {
		Query query = getSessionFactory().getCurrentSession().getNamedQuery(Articulo.GET_ARTICULO_BY_ID).setInteger("id", id);
		return (Articulo) query.uniqueResult();
	}

	@Override
	public List<Articulo> getArticulos() {
		Query query = getSessionFactory().getCurrentSession().getNamedQuery(Articulo.GET_ALL_ARTICULOS);
		return (List<Articulo>) query.list();
	}
	
	
}
