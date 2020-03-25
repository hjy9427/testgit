package com.naver.dto;

import java.io.Serializable;

public class ReplyVO implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int rno;
	private int bno;
	private String replytext;
	private String replyer;
	private String regdate;
	private String updatedate;
	private int rreproot;
	private int rrepstep;
	private int rrepindent;
	
	public ReplyVO() {
		// TODO Auto-generated constructor stub
	}

	
	
	public ReplyVO(int rno, int bno, String replytext, String replyer, String regdate, String updatedate, int rreproot,
			int rrepstep, int rrepindent) {
		super();
		this.rno = rno;
		this.bno = bno;
		this.replytext = replytext;
		this.replyer = replyer;
		this.regdate = regdate;
		this.updatedate = updatedate;
		this.rreproot = rreproot;
		this.rrepstep = rrepstep;
		this.rrepindent = rrepindent;
	}



	public ReplyVO(int rno, int bno, String replytext, String replyer, String regdate, String updatedate) {
		super();
		this.rno = rno;
		this.bno = bno;
		this.replytext = replytext;
		this.replyer = replyer;
		this.regdate = regdate;
		this.updatedate = updatedate;
	}

	public int getRno() {
		return rno;
	}

	public void setRno(int rno) {
		this.rno = rno;
	}

	public int getBno() {
		return bno;
	}

	public void setBno(int bno) {
		this.bno = bno;
	}

	public String getReplytext() {
		return replytext;
	}

	public void setReplytext(String replytext) {
		this.replytext = replytext;
	}

	public String getReplyer() {
		return replyer;
	}

	public void setReplyer(String replyer) {
		this.replyer = replyer;
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
	
	

	public int getRreproot() {
		return rreproot;
	}



	public void setRreproot(int rreproot) {
		this.rreproot = rreproot;
	}



	public int getRrepstep() {
		return rrepstep;
	}



	public void setRrepstep(int rrepstep) {
		this.rrepstep = rrepstep;
	}



	public int getRrepindent() {
		return rrepindent;
	}



	public void setRrepindent(int rrepindent) {
		this.rrepindent = rrepindent;
	}



	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + bno;
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
		ReplyVO other = (ReplyVO) obj;
		if (bno != other.bno)
			return false;
		return true;
	}



	@Override
	public String toString() {
		return "ReplyVO [rno=" + rno + ", bno=" + bno + ", replytext=" + replytext + ", replyer=" + replyer
				+ ", regdate=" + regdate + ", updatedate=" + updatedate + ", rreproot=" + rreproot + ", rrepstep="
				+ rrepstep + ", rrepindent=" + rrepindent + "]";
	}


	
}
