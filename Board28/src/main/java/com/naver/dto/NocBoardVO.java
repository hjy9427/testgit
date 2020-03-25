package com.naver.dto;

import java.io.Serializable;

public class NocBoardVO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int noc_no;
	private String noc_title;
	private String noc_content;
	private String noc_writer;
	private String noc_regdate;
	private String noc_updatedate;
	private int noc_readcnt;
	private String noc_filename;
	
	public NocBoardVO() {
		// TODO Auto-generated constructor stub
	}

	public NocBoardVO(int noc_no, String noc_title, String noc_content, String noc_writer, String noc_regdate,
			String noc_updatedate, int noc_readcnt, String noc_filename) {
		super();
		this.noc_no = noc_no;
		this.noc_title = noc_title;
		this.noc_content = noc_content;
		this.noc_writer = noc_writer;
		this.noc_regdate = noc_regdate;
		this.noc_updatedate = noc_updatedate;
		this.noc_readcnt = noc_readcnt;
		this.noc_filename = noc_filename;
	}

	public int getNoc_no() {
		return noc_no;
	}

	public void setNoc_no(int noc_no) {
		this.noc_no = noc_no;
	}

	public String getNoc_title() {
		return noc_title;
	}

	public void setNoc_title(String noc_title) {
		this.noc_title = noc_title;
	}

	public String getNoc_content() {
		return noc_content;
	}

	public void setNoc_content(String noc_content) {
		this.noc_content = noc_content;
	}

	public String getNoc_writer() {
		return noc_writer;
	}

	public void setNoc_writer(String noc_writer) {
		this.noc_writer = noc_writer;
	}

	public String getNoc_regdate() {
		return noc_regdate;
	}

	public void setNoc_regdate(String noc_regdate) {
		this.noc_regdate = noc_regdate;
	}

	public String getNoc_updatedate() {
		return noc_updatedate;
	}

	public void setNoc_updatedate(String noc_updatedate) {
		this.noc_updatedate = noc_updatedate;
	}

	public int getNoc_readcnt() {
		return noc_readcnt;
	}

	public void setNoc_readcnt(int noc_readcnt) {
		this.noc_readcnt = noc_readcnt;
	}

	public String getNoc_filename() {
		return noc_filename;
	}

	public void setNoc_filename(String noc_filename) {
		this.noc_filename = noc_filename;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + noc_no;
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
		NocBoardVO other = (NocBoardVO) obj;
		if (noc_no != other.noc_no)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Noc_boardVO [noc_no=" + noc_no + ", noc_title=" + noc_title + ", noc_content=" + noc_content
				+ ", noc_writer=" + noc_writer + ", noc_regdate=" + noc_regdate + ", noc_updatedate=" + noc_updatedate
				+ ", noc_readcnt=" + noc_readcnt + ", noc_filename=" + noc_filename + "]";
	}
	
	
}
