package com.ltts.demoSpring1.Dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.LogicalExpression;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;

import com.ltts.demoSpring1.model.Production;

@Repository
public class ProductionDao {
	
	@Autowired
	SessionFactory sf;
	
	public boolean insertProduction(Production p) {
		boolean b = false;
		Session s = null;
		try {
			s=sf.openSession();
			s.beginTransaction();
			
			s.save(p);
			//System.out.println(st);
			s.getTransaction().commit();
			
		}
		catch(Exception e) {
			System.out.println("Exception "+e);
			b=true;
		}
		finally {
			//sf.close();
		}
		
		return b;
	}
	
	public List<Production> getAllProduction() {
		Session session = sf.openSession();
		session.beginTransaction();
		
		//List<Production> li = sf.openSession().createCriteria(Production.class).list();
	//	List<Production> product = session.createCriteria(Production.class).list();
		//List<Production> product = session.
		Query query = session.createQuery("from Production");
		List<Production> li = query.getResultList();
		session.getTransaction().commit();
		//sf.close();
		return li;
	}
	
	public Production getProductionid(int id) {
		Session sess = sf.openSession();
		sess.beginTransaction();
		Production p = sess.get(Production.class, id);
		System.out.println("Inside Dao"+p);
		sess.getTransaction().commit();
		return p;
	}
	
	public boolean updateProduction(Production p) {
		boolean b = false;
		Session s = null;
		try {
			s=sf.openSession();
			s.beginTransaction();
			
			//s.saveOrUpdate(p);
			s.update(p);
			//System.out.println(st);
			s.getTransaction().commit();
			
		}
		catch(Exception e) {
			System.out.println("Exception "+e);
			b=true;
		}
		finally {
			//sf.close();
		}
		
		return b;
	}
	
	/*public List<Production> getAllProductionByOwnername(int pno, String pname) {
		List<Production> li = null;
		Session sess = sf.openSession();
		sess.beginTransaction();
		Criteria c = sess.createCriteria(Production.class);
		
		Criterion productionid = Restrictions.eq("productionid", pno);
		Criterion ownername = Restrictions.gt("ownername", pname);
		LogicalExpression le = Restrictions.and(pno, pname);
		c.add(le);
		li=c.list();
		return li;
	}*/
	
}

