package com.naver.dto;

import java.io.Serializable;
import java.util.Arrays;

public class QNABoardVO implements Serializable{
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int bno;
	private int secretno;
	private String qnatype;
	private String title;
	private String content;
	private String writer;
	private String regdate;
	private String updatedate;
	private int readcnt;
	private String[] filename;//파일 여러개 넘겨야하니까
	
	private int reproot;
	private int repstep;
	private int repindent;
	
	public QNABoardVO() {
		// TODO Auto-generated constructor stub
	}

	public QNABoardVO(int bno, int secretno, String qnatype, String title, String content, String writer, String regdate,
			String updatedate, int readcnt, String[] filename, int reproot, int repstep, int repindent) {
		super();
		this.bno = bno;
		this.secretno = secretno;
		this.qnatype = qnatype;
		this.title = title;
		this.content = content;
		this.writer = writer;
		this.regdate = regdate;
		this.updatedate = updatedate;
		this.readcnt = readcnt;
		this.filename = filename;
		this.reproot = reproot;
		this.repstep = repstep;
		this.repindent = repindent;
	}


	public QNABoardVO(int bno, int secretno, String qnatype, String title, String content, String writer, String regdate,
			String updatedate, int readcnt, String[] filename) {
		super();
		this.bno = bno;
		this.secretno = secretno;
		this.qnatype = qnatype;
		this.title = title;
		this.content = content;
		this.writer = writer;
		this.regdate = regdate;
		this.updatedate = updatedate;
		this.readcnt = readcnt;
		this.filename = filename;
	}









	public QNABoardVO(int bno, String title, String content, String writer, String regdate, String updatedate,
			int readcnt) {
		super();
		this.bno = bno;
		this.title = title;
		this.content = content;
		this.writer = writer;
		this.regdate = regdate;
		this.updatedate = updatedate;
		this.readcnt = readcnt;
	}
	
	


	public QNABoardVO(int bno, int secretno, String title, String content, String writer, String regdate,
			String updatedate, int readcnt, String[] filename) {
		super();
		this.bno = bno;
		this.secretno = secretno;
		this.title = title;
		this.content = content;
		this.writer = writer;
		this.regdate = regdate;
		this.updatedate = updatedate;
		this.readcnt = readcnt;
		this.filename = filename;
	}


	public QNABoardVO(int bno, String title, String content, String writer, String regdate, String updatedate, int readcnt,
			String[] filename) {
		super();
		this.bno = bno;
		this.title = title;
		this.content = content;
		this.writer = writer;
		this.regdate = regdate;
		this.updatedate = updatedate;
		this.readcnt = readcnt;
		this.filename = filename;
	}


	public int getBno() {
		return bno;
	}

	public void setBno(int bno) {
		this.bno = bno;
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

	public static long getSerialversionuid() {
		return serialVersionUID;
	}


	public String[] getFilename() {
		return filename;
	}


	public void setFilename(String[] filename) {
		this.filename = filename;
	}

	

	public int getSecretno() {
		return secretno;
	}


	public void setSecretno(int secretno) {
		this.secretno = secretno;
	}

	public String getQnatype() {
		return qnatype;
	}

	public void setQnatype(String qnatype) {
		this.qnatype = qnatype;
	}

	public int getReproot() {
		return reproot;
	}

	public void setReproot(int reproot) {
		this.reproot = reproot;
	}

	public int getRepstep() {
		return repstep;
	}

	public void setRepstep(int repstep) {
		this.repstep = repstep;
	}

	public int getRepindent() {
		return repindent;
	}

	public void setRepindent(int repindent) {
		this.repindent = repindent;
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
		QNABoardVO other = (QNABoardVO) obj;
		if (bno != other.bno)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "BoardVO [bno=" + bno + ", secretno=" + secretno + ", qnatype=" + qnatype + ", title=" + title
				+ ", content=" + content + ", writer=" + writer + ", regdate=" + regdate + ", updatedate=" + updatedate
				+ ", readcnt=" + readcnt + ", filename=" + Arrays.toString(filename) + ", reproot=" + reproot
				+ ", repstep=" + repstep + ", repindent=" + repindent + "]";
	}

}
