package com.ji.model.vo;

public class StudentVO {
	private int studentID;
	private String studentName;
	private String major;
	private String college;
	private int grade;
	private int semester;
	private int selectTrack;
	

	public StudentVO() {

	}

	public StudentVO(int studentId, String studentName, String major, String college, int grade, int semester,int selectTrack) {
		super();
		this.studentID = studentID;
		this.studentName = studentName;
		this.major = major;
		this.college = college;
		this.grade = grade;
		this.semester = semester;
		this.selectTrack = selectTrack;
	}

	   public StudentVO(String studentName, String major, int semester) {
		      super();
		      this.studentName = studentName;
		      this.major = major;
		      this.semester = semester;
		   }
	public int getStudentID() {
		return studentID;
	}

	public void setStudentID(int studentID) {
		this.studentID = studentID;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	public String getCollege() {
		return college;
	}

	public void setCollege(String college) {
		this.college = college;
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	public int getSemester() {
		return semester;
	}

	public void setSemester(int semester) {
		this.semester = semester;
	}
	public int getSelectTrack() {
		return semester;
	}

	public void setSelectTrack(int selectTrack) {
		this.selectTrack = selectTrack;
	}

	


} // StudentVO()

