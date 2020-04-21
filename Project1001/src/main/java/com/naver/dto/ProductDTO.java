package com.naver.dto;

import java.io.Serializable;
import java.util.Arrays;

public class ProductDTO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int pno;
	private String title;
	private String content;
	private String writer;
	private String regdate;
	private String updatedate;
	private int readcnt;
	private int price;
	private String foption;
	private String soption;
	private String toption;
	private String[] filename;
	
	public ProductDTO() {
		// TODO Auto-generated constructor stub
	}


	public ProductDTO(int pno, String title, String content, String writer, String regdate, String updatedate, int readcnt,
			int price, String foption, String soption, String toption) {
		super();
		this.pno = pno;
		this.title = title;
		this.content = content;
		this.writer = writer;
		this.regdate = regdate;
		this.updatedate = updatedate;
		this.readcnt = readcnt;
		this.price = price;
		this.foption = foption;
		this.soption = soption;
		this.toption = toption;
	}


	public ProductDTO(int pno, String title, String content, String writer, String regdate, String updatedate,
			int readcnt, int price, String foption, String soption, String toption, String[] filename) {
		super();
		this.pno = pno;
		this.title = title;
		this.content = content;
		this.writer = writer;
		this.regdate = regdate;
		this.updatedate = updatedate;
		this.readcnt = readcnt;
		this.price = price;
		this.foption = foption;
		this.soption = soption;
		this.toption = toption;
		this.filename = filename;
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

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	public String getRegdate() {
		return regdate;
	}

	public void setRegdate(String regdate) {
		this.regdate = regdate;
	}

	public String getUpdatedate() {
		return updatedate;
	}

	public void setUpdatedate(String updatedate) {
		this.updatedate = updatedate;
	}

	public int getReadcnt() {
		return readcnt;
	}

	public void setReadcnt(int readcnt) {
		this.readcnt = readcnt;
	}

	

	public int getPrice() {
		return price;
	}


	public void setPrice(int price) {
		this.price = price;
	}


	public String getFoption() {
		return foption;
	}


	public void setFoption(String foption) {
		this.foption = foption;
	}


	public String getSoption() {
		return soption;
	}


	public void setSoption(String soption) {
		this.soption = soption;
	}


	public String getToption() {
		return toption;
	}


	public void setToption(String toption) {
		this.toption = toption;
	}

	public String[] getFilename() {
		return filename;
	}


	public void setFilename(String[] filename) {
		this.filename = filename;
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
		return "ProductDTO [pno=" + pno + ", title=" + title + ", content=" + content + ", writer=" + writer
				+ ", regdate=" + regdate + ", updatedate=" + updatedate + ", readcnt=" + readcnt + ", price=" + price
				+ ", foption=" + foption + ", soption=" + soption + ", toption=" + toption + ", filename="
				+ Arrays.toString(filename) + "]";
	}





	
}
