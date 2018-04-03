/**
 * 
 */
package com.qhit.lh.g3.gsl.exam.common.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.qhit.lh.g3.gsl.exam.common.utils.HibernateSessionFactory;

/**
 * @author 
 */
public class BaseDao {

	public Session getSession(){
		return HibernateSessionFactory.getSession();
	}
}
