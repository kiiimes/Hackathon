package com.ji.model.vo;


//TrackVO

public class TrackVO{
	private int trackNum;
	private String trackName;
	
	public TrackVO(){
		
	}
	
	public TrackVO(int trackNum, String trackName) {
		super();
		this.trackNum = trackNum;
		this.trackName = trackName;
	}

	public int getTrackNum() {
		return trackNum;
	}

	public void setTrackNum(int trackNum) {
		this.trackNum = trackNum;
	}

	public String getTrackName() {
		return trackName;
	}

	public void setTrackName(String trackName) {
		this.trackName = trackName;
	}
	
	
}
