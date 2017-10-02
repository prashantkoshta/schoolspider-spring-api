package com.schoolspider.service;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.schoolspider.model.Terms;
import com.schoolspider.repositories.BooksRepository;

@Service
public class BookServiceImpl implements BookService {
	
	@PersistenceContext
	EntityManager entityManager;
	
	@Autowired
	private BooksRepository booksRepository;
	
	@Override
	public List<Terms> getTerms(String s_class) {
		List<Terms> list = (List<Terms>) this.booksRepository.findAll();
		return list;
	}

	@Override
	public List<Terms> getSClass(int school_id) {
		String sqlString = "SELECT book_id,s_class,s_class_title,term,term_title FROM BOOKS  WHERE SCHOOL_ID=:school_id ORDER BY S_CLASS ASC, TERM ASC";
		Query query = entityManager.createNativeQuery(sqlString,Terms.class);
        query.setParameter("school_id", school_id);
        List<Terms> list = query.getResultList();
        return list;
	}
	

}
