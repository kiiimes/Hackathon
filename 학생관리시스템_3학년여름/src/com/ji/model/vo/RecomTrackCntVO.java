package com.ji.model.vo;

public class RecomTrackCntVO {
	private int trackKey;
	private int count;

	public RecomTrackCntVO() {

	}

	public RecomTrackCntVO(int trackKey,int count) {
		super();
		this.trackKey = trackKey;
		this.count = count;

	}
	   public RecomTrackCntVO(int count) {
		      super();
		      this.count = count;

		   }
	public int getTrackKey() {
		return trackKey;
	}

	public void setTrackKey(int trackKey) {
		this.trackKey = trackKey;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	
}
