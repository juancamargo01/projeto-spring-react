package com.juancamargo.dsvendas.dto;

import java.io.Serializable;

import com.juancamargo.dsvendas.entities.Seller;

public class SaleSumDTO implements Serializable{	
	private static final long serialVersionUID = 1L;
	
	private String sellerName;
	private Double sun;
	
	
	public SaleSumDTO() {
		
	}


	public SaleSumDTO(Seller seller, Double sun) {
		super();
		this.sellerName = seller.getName();
		this.sun = sun;
	}


	public String getSellerName() {return sellerName;	}


	public void setSellerName(String sellerName) {this.sellerName = sellerName;	}


	public Double getSun() {return sun;	}


	public void setSun(Double sun) {this.sun = sun;	}
	

}
