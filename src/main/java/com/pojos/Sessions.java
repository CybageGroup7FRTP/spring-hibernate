package com.pojos;

import java.util.Date;

import javax.persistence.Embeddable;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Embeddable
public class Sessions 
{
	
	private int sessionNo;
	@Temporal(TemporalType.DATE)
	private Date date;
	private Date startTime;
	@Temporal(TemporalType.TIME)
	private Date endTime;
	private String venue;
	
	public int getSessionNo() {
		return sessionNo;
	}
	public void setSessionNo(int sessionNo) {
		this.sessionNo = sessionNo;
	}
	
	public Date getDate() {
		return date;
	}
	
	public void setDate(Date date) {
		this.date = date;
	}
	
	
	public Date getStartTime() {
		return startTime;
	}
	
	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}
	
	
	public Date getEndTime() {
		return endTime;
	}
	
	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}
	
	public String getVenue() {
		return venue;
	}
	
	public void setVenue(String venue) 
	{
		this.venue = venue;
	}

}
