package com.ltts.prod.model;

public class Production {
	private int productionid;
	private String productionname;
	private String address;
	private String dateofstart;
	private String ownername;
	
	public Production() {
		super();
	}
	
	public Production(int productionid, String productionname, String address, String dateofstart, String ownername) {
		super();
		this.productionid = productionid;
		this.productionname = productionname;
		this.address = address;
		this.dateofstart = dateofstart;
		this.ownername = ownername;
	}

	public int getProductionid() {
		return productionid;
	}

	public void setProductionid(int productionid) {
		this.productionid = productionid;
	}

	public String getProductionname() {
		return productionname;
	}

	public void setProductionname(String productionname) {
		this.productionname = productionname;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getDateofstart() {
		return dateofstart;
	}

	public void setDateofstart(String dateofstart) {
		this.dateofstart = dateofstart;
	}

	public String getOwnername() {
		return ownername;
	}

	public void setOwnername(String ownername) {
		this.ownername = ownername;
	}
	
	public String toString() {
		return "Production ID= " +productionid+ "Produciton Name= " +productionname+ "Address= " +address+ "Date of Start= " +dateofstart+ "Owner Name= "+ ownername;
	}
}
