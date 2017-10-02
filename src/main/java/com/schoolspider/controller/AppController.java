package com.schoolspider.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.schoolspider.model.AppScreen;
import com.schoolspider.model.Apps;
import com.schoolspider.service.AppService;

@Controller
public class AppController {
	
	private AppService appService;
	
	

    @Autowired
    public void setProductService(AppService appService) {
        this.appService = appService;
    }
    
    @RequestMapping(value = "app/{id}",method = RequestMethod.GET)
    public @ResponseBody Apps showAppConfig(@PathVariable Integer id){
        return  appService.getAppsDetailsById(id);
    }
    
    @RequestMapping(value = "appscreen/{id}",method = RequestMethod.GET)
    public @ResponseBody List<AppScreen> showAppScreenConfig(@PathVariable Integer id){
        return appService.getAppScreens(id);
    }

}
