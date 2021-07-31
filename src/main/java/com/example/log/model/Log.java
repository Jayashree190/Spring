package com.example.log.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Log {
	@Id
	@Column(unique=true,columnDefinition="VARCHAR(64)")
	private String id;
	private String name;
	private String logType;
	private String date;
	private String time;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLogType() {
		return logType;
	}
	public void setLogType(String logType) {
		
		this.logType = logType;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public Log() {
		super();
	}
	public Log(String id, String name, String logType, String date, String time) {
		super();
		this.id = id;
		this.name = name;
		this.logType = logType;
		this.date = date;
		this.time = time;
	}
	public Log(String name, String logType, String date, String time) {
		super();
		this.name = name;
		this.logType = logType;
		this.date = date;
		this.time = time;
	}
	@Override
	public String toString() {
		return "Log [id=" + id + ", name=" + name + ", logType=" + logType + ", date=" + date + ", time=" + time + "]";
	}
	
	
	
}
