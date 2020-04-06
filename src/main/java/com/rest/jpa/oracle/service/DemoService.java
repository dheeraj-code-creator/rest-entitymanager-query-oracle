package com.rest.jpa.oracle.service;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rest.jpa.oracle.entity.Demo;
import com.rest.jpa.oracle.util.QueryUtil;


@Service
public class DemoService {
	
	@Autowired
	private EntityManagerFactory em;

	public List<Demo> getSalaryDetailsForUsers(int fromSalary, int toSalary) {
		QueryUtil queryUtil = new QueryUtil();
		EntityManager entityManager = em.createEntityManager();
		String queryString = queryUtil.createQueryForRange(fromSalary, toSalary);
		Query query = entityManager.createQuery(queryString);
		List<Demo> demoList = query.getResultList();
		return demoList;
	}
	
	public List<Demo> getAllDetailsForUsers() {
		QueryUtil queryUtil = new QueryUtil();
		EntityManager entityManager = em.createEntityManager();
		String queryString = queryUtil.createQueryForAll();
		Query query = entityManager.createQuery(queryString);
		List<Demo> demoList = query.getResultList();
		return demoList;
	}

	public List<Demo> getUserDetailsById(int id) {
		QueryUtil queryUtil = new QueryUtil();
		EntityManager entityManager = em.createEntityManager();
		String queryString = queryUtil.createQueryForId(id);
		Query query = entityManager.createQuery(queryString);
		query.setParameter("id", id);
		List<Demo> demoList = query.getResultList();
		return demoList;
	}

}

