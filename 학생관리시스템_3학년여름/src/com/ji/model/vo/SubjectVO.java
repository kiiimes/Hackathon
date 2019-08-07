package com.ji.model.vo;

//SubjectVO

public class SubjectVO{
	private String subjectNum;
	private String subjectName;
	
	public SubjectVO() {
		
	}
	
	public SubjectVO(String subjectNum,String subjectName) {
		super();
		this.subjectNum = subjectNum;
		this.subjectName = subjectName;
	}

	public String getSubjectNum() {
		return subjectNum;
	}

	public void setSubjectNum(String subjectNum) {
		this.subjectNum = subjectNum;
	}

	public String getSubjectName() {
		return subjectName;
	}

	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}
	
}
