package com.schoolspider.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedStoredProcedureQuery;
import javax.persistence.StoredProcedureParameter;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.persistence.ParameterMode;


@NamedStoredProcedureQuery(
	name="GetAllAppsIn",
	procedureName="GET_APPSIN",
	resultClasses = { AppScreen.class },
	parameters={
			@StoredProcedureParameter(name="appId", type=Integer.class, mode=ParameterMode.IN)
	}
)

@Entity
@Table(name = "AppScreen")
public class AppScreen implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer app_id;
    
    @NotNull
    private String app_name;
    
    public Integer getApp_id() {
		return app_id;
	}

	public void setApp_id(Integer app_id) {
		this.app_id = app_id;
	}

	public String getApp_name() {
		return app_name;
	}

	public void setApp_name(String app_name) {
		this.app_name = app_name;
	}

	

}
