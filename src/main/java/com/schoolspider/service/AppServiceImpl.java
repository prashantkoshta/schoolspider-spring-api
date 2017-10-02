package com.schoolspider.service;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.schoolspider.model.AppScreen;
import com.schoolspider.model.Apps;
import com.schoolspider.repositories.AppRepository;
import com.schoolspider.utils.AppConstants;

@Service
public class AppServiceImpl implements AppService{
	
	@PersistenceContext
	EntityManager entityManager;

	private AppRepository appRepository;
	
	@Autowired
    public void setAppRepository(AppRepository appRepository) {
        this.appRepository = appRepository;
    }
	
	@Override
	public Apps getAppsDetailsById(Integer id) {
		return appRepository.findOne(id);
	}
	
	@Override
	public List<AppScreen> getAppScreens(Integer id) {
		Query query = entityManager.createNamedStoredProcedureQuery(AppConstants.GetAllAppsIn);
        query.setParameter("appId", id);
        return (List<AppScreen>) query.getResultList();
	} 

	
}
