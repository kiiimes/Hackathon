package com.ji.model.vo;

public class SelectTrackCntVO {
	private int selectTrack;
	private int count;

	public SelectTrackCntVO() {

	}

	public SelectTrackCntVO(int selectTrack,int count) {
		super();
		this.selectTrack = selectTrack;
		this.count = count;

	}

	public int getSelectTrack() {
		return selectTrack;
	}

	public void setSelectTrack(int selectTrack) {
		this.selectTrack = selectTrack;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	
}

