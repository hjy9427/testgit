package com.naver.dto;

import java.io.Serializable;
import java.util.Arrays;

public class CartDTO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private int cid;
	private int[] pno;
	private String id;
	
	public CartDTO() {
		// TODO Auto-generated constructor stub
	}


	public CartDTO(int cid, int[] pno, String id) {
		super();
		this.cid = cid;
		this.pno = pno;
		this.id = id;
	}


	public int[] getPno() {
		return pno;
	}

	public void setPno(int[] pno) {
		this.pno = pno;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	
	
	public static long getSerialversionuid() {
		return serialVersionUID;
	}


	public int getCid() {
		return cid;
	}


	public void setCid(int cid) {
		this.cid = cid;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + cid;
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
		CartDTO other = (CartDTO) obj;
		if (cid != other.cid)
			return false;
		return true;
	}


	@Override
	public String toString() {
		return "CartDTO [cid=" + cid + ", pno=" + Arrays.toString(pno) + ", id=" + id + "]";
	}



}
