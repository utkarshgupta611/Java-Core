package com.prvt;

public class Song {

	String sTitle;
	double duration;
	// ****************************************************constructor and getter setter ************************************************
	public Song() {
	}
	
	public Song(String sTitle, double duration) {
		super();
		this.sTitle = sTitle;
		this.duration = duration;
	}
	public String getsTitle() {
		return sTitle;
	}
	public void setsTitle(String sTitle) {
		this.sTitle = sTitle;
	}
	public double getDuration() {
		return duration;
	}
	public void setDuration(double duration) {
		this.duration = duration;
	}
	@Override
	public String toString() {
		return "Song [sTitle=" + sTitle + ", duration=" + duration + "]";
	}
}
