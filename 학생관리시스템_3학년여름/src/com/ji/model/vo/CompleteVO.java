package com.ji.model.vo;

//CompleteVO

public class CompleteVO{
	private int studentID;
	private String subjectNum;
	
	public CompleteVO(){
		
	}
	
	public CompleteVO(int studentID,String subjectNum) {
		super();
		this.studentID = studentID;
		this.subjectNum = subjectNum;
	}
}