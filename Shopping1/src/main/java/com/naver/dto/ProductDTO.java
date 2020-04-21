package com.naver.dto;

import java.io.Serializable;

public class ProductDTO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private int pno;
	private String title;
	private int price;
	private int sale;
	private String color;
	private String sizes;
	private String filename;
	private String type;
	
	public ProductDTO() {
		// TODO Auto-generated constructor stub
	}

	public ProductDTO(int pno, String title, int price, int sale, String color, String sizes, String filename,
			String type) {
		super();
		this.pno = pno;
		this.title = title;
		this.price = price;
		this.sale = sale;
		this.color = color;
		this.sizes = sizes;
		this.filename = filename;
		this.type = type;
	}

	public int getPno() {
		return pno;
	}

	public void setPno(int pno) {
		this.pno = pno;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getSale() {
		return sale;
	}

	public void setSale(int sale) {
		this.sale = sale;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getSizes() {
		return sizes;
	}

	public void setSizes(String sizes) {
		this.sizes = sizes;
	}

	public String getFilename() {
		return filename;
	}

	public void setFilename(String filename) {
		this.filename = filename;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + pno;
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
		ProductDTO other = (ProductDTO) obj;
		if (pno != other.pno)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "ProductDTO [pno=" + pno + ", title=" + title + ", price=" + price + ", sale=" + sale + ", color="
				+ color + ", sizes=" + sizes + ", filename=" + filename + ", type=" + type + "]";
	}
	
	
	
	
}
