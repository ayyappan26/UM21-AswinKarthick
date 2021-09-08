package com.aircraft.mapops;

import java.sql.Date;

public class SectorDTO {
	
	String sectorID;
	String aircraftCode;
	String fromStation;
	String toStation;
	Date scheduleDate;
	int scheduleTime;
	public String getSectorID() {
		return sectorID;
	}
	public void setSectorID(String sectorID) {
		this.sectorID = sectorID;
	}
	public String getAircraftCode() {
		return aircraftCode;
	}
	public void setAircraftCode(String aircraftCode) {
		this.aircraftCode = aircraftCode;
	}
	public String getFromStation() {
		return fromStation;
	}
	public void setFromStation(String fromStation) {
		this.fromStation = fromStation;
	}
	public String getToStation() {
		return toStation;
	}
	public void setToStation(String toStation) {
		this.toStation = toStation;
	}
	public Date getScheduleDate() {
		return scheduleDate;
	}
	public void setScheduleDate(Date scheduleDate) {
		this.scheduleDate = scheduleDate;
	}
	public int getScheduleTime() {
		return scheduleTime;
	}
	public void setScheduleTime(int scheduleTime) {
		this.scheduleTime = scheduleTime;
	}
	
	

}
