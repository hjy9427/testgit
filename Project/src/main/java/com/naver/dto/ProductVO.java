package com.naver.dto;

import java.io.Serializable;

public class ProductVO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int pr_id;
	private String pr_name;
	private String pr_cate;
	private int pr_price;
	private String pr_date;
	private String pr_col;
	private String pr_size;
	private String pr_thu;
	private String pr_img;
	
	public ProductVO() {
		// TODO Auto-generated constructor stub
	}

	public ProductVO(int pr_id, String pr_name, String pr_cate, int pr_price, String pr_date, String pr_col,
			String pr_size, String pr_thu, String pr_img) {
		super();
		this.pr_id = pr_id;
		this.pr_name = pr_name;
		this.pr_cate = pr_cate;
		this.pr_price = pr_price;
		this.pr_date = pr_date;
		this.pr_col = pr_col;
		this.pr_size = pr_size;
		this.pr_thu = pr_thu;
		this.pr_img = pr_img;
	}

	public int getPr_id() {
		return pr_id;
	}

	public void setPr_id(int pr_id) {
		this.pr_id = pr_id;
	}

	public String getPr_name() {
		return pr_name;
	}

	public void setPr_name(String pr_name) {
		this.pr_name = pr_name;
	}

	public String getPr_cate() {
		return pr_cate;
	}

	public void setPr_cate(String pr_cate) {
		this.pr_cate = pr_cate;
	}

	public int getPr_price() {
		return pr_price;
	}

	public void setPr_price(int pr_price) {
		this.pr_price = pr_price;
	}

	public String getPr_date() {
		return pr_date;
	}

	public void setPr_date(String pr_date) {
		this.pr_date = pr_date;
	}

	public String getPr_col() {
		return pr_col;
	}

	public void setPr_col(String pr_col) {
		this.pr_col = pr_col;
	}

	public String getPr_size() {
		return pr_size;
	}

	public void setPr_size(String pr_size) {
		this.pr_size = pr_size;
	}

	public String getPr_thu() {
		return pr_thu;
	}

	public void setPr_thu(String pr_thu) {
		this.pr_thu = pr_thu;
	}

	public String getPr_img() {
		return pr_img;
	}

	public void setPr_img(String pr_img) {
		this.pr_img = pr_img;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + pr_id;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ProductVO other = (ProductVO) obj;
		if (pr_id != other.pr_id)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "ProductVO [pr_id=" + pr_id + ", pr_name=" + pr_name + ", pr_cate=" + pr_cate + ", pr_price=" + pr_price
				+ ", pr_date=" + pr_date + ", pr_col=" + pr_col + ", pr_size=" + pr_size + ", pr_thu=" + pr_thu
				+ ", pr_img=" + pr_img + "]";
	}
	
	
	
}
