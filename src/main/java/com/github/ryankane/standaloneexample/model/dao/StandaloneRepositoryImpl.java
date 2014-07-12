package com.github.ryankane.standaloneexample.model.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.github.ryankane.standaloneexample.model.entity.Standalone;

@Repository
@Transactional
public class StandaloneRepositoryImpl implements StandaloneRepository {

	private EntityManager em;

	@PersistenceContext
    public void setEntityManager(EntityManager entityManager) {
        this.em = entityManager;
    }
	
	@SuppressWarnings("unchecked")
	public List<Standalone> findAll() {
		
		
		Session session = em.unwrap(Session.class);
		Query query = session.createQuery("from Standalone");
		List<Standalone> rs = query.list();

		return rs;
	}

	public Standalone save(Standalone standalone) {
		Session session = em.unwrap(Session.class);

		session.save(standalone);
		
		return standalone;
	}
}