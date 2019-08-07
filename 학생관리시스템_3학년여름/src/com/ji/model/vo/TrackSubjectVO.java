package com.ji.model.vo;

//TrackSubjectVO
public class TrackSubjectVO{
	private int trackKey;
	private String subjectNum;
	private int flag;

	public TrackSubjectVO() {
		
	}

	public TrackSubjectVO(int trackKey,String subjectNum,int flag) {
		super();
		this.trackKey = trackKey;
		this.subjectNum = subjectNum;
		this.flag = flag;
	}

	public int getTrackKey() {
		return trackKey;
	}

	public void setTrackKey(int trackKey) {
		this.trackKey = trackKey;
	}

	public String getSubjectNum() {
		return subjectNum;
	}

	public void setSubjectNum(String subjectNum) {
		this.subjectNum = subjectNum;
	}

	public int getFlag() {
		return flag;
	}

	public void setFlag(int flag) {
		this.flag = flag;
	}
	
	
}
