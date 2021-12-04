package model;

import java.util.ArrayList;

public class BlackSnail {
	private String nit;
	private String adress;
	private String website;
	private Subscriber[] subs;
	private Product[] products;
	
	
	public BlackSnail(String nit, String adress, String website) {
		super();
		this.nit = nit;
		this.adress = adress;
		this.website = website;
		subs =  new Subscriber[50];
		products = new Product[85];
	}


	public Subscriber getSpecialCase() {
		Subscriber aux = null;
		
		for (int i = 0; i < subs.length; i++) {
			if (subs[i] != null) {
				if (subs[i].getAge()<18) {
					if (aux == null) aux = subs[i];
					else if (subs[i].getHours() > aux.getHours()) aux = subs[i];
				}
			}else break;
		}
		
		return aux;
	}
	
	public boolean addProduct(Product n) {
		boolean complete = false;
		for (int i = 0; i < 85 && !complete; i++) {
			if (products[i] != null) {
				products[i] = n;
				complete = true;
			}
		}
		return complete;
	}
	
	public boolean addSub(String name, String id, int age,int hours, boolean status, int subscription) {
		int index = 0;
		
		for (int i = 0; i < 50; i++) {
			if (subs[i] == null) {
				index = i;
				break;
			}else if (subs[i].getId().equals(id)) return false;
		}
		
		subs[index] = new Subscriber(name, id, age, hours, status, subscription);
		return true;
	}
	
	
	public String getNit() {
		return nit;
	}


	public void setNit(String nit) {
		this.nit = nit;
	}


	public String getAdress() {
		return adress;
	}


	public void setAdress(String adress) {
		this.adress = adress;
	}


	public String getWebsite() {
		return website;
	}


	public void setWebsite(String website) {
		this.website = website;
	}


	public Subscriber[] getSubs() {
		return subs;
	}


	public void setSubs(Subscriber[] subs) {
		this.subs = subs;
	}


	public Product[] getProducts() {
		return products;
	}


	public void setProducts( Product[] products) {
		this.products = products;
	}
	
	
	
	
	
	

}
