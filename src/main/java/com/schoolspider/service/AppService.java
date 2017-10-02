package com.schoolspider.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.schoolspider.model.AppScreen;
import com.schoolspider.model.Apps;

public interface AppService {
	Apps getAppsDetailsById(Integer id);
	List<AppScreen> getAppScreens(Integer id);
}
