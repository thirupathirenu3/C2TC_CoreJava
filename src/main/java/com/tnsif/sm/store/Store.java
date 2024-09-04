package com.tnsif.sm.store;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
@Table(name="Store")
public class Store {
	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Integer storeid;
	    @Column(name="name")
	    private String name;
	    @Column(name="category")
	    private String category;
	    @Column(name="contactinfo")
	    private String contactinfo;
	    @Column(name="location")
	    private String location;
	    @Column(name="operatinghours")
	    private String operatinghours;
	    public Store() 
	    {
	    	
	    }

	    public Store(Integer storeid, String name, String category, String contactinfo, String location,
	            String operatinghours) {
	        super();
	        this.storeid = storeid;
	        this.name = name;
	        this.category = category;
	        this.contactinfo = contactinfo;
	        this.location = location;
	        this.operatinghours = operatinghours;
	    }

	    public Integer getStoreid() {
	        return storeid;
	    }

	    public String getName() {
	        return name;
	    }

	    public String getCategory() {
	        return category;
	    }

	    public String getContactinfo() {
	        return contactinfo;
	    }

	    public String getLocation() {
	        return location;
	    }

	    public String getOperatinghours() {
	        return operatinghours;
	    }

	    public void setStoreid(Integer storeid) {
	        this.storeid = storeid;
	    }

	    public void setName(String name) {
	        this.name = name;
	    }

	    public void setCategory(String category) {
	        this.category = category;
	    }

	    public void setContactinfo(String contactinfo) {
	        this.contactinfo = contactinfo;
	    }

	    public void setLocation(String location) {
	        this.location = location;
	    }

	    public void setOperatinghours(String operatinghours) {
	        this.operatinghours = operatinghours;
	    }
	}
