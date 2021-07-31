package com.example.log.container;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.log.dao.LogRepo;
import com.example.log.model.Log;

@RestController
public class LogController {

	@Autowired
	LogRepo repo;
	
	@GetMapping(path = "/checkIn")
	public Log add(@RequestParam("name") String name ) {
		Log l = new Log();
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd");
		LocalDateTime now = LocalDateTime.now();
		l.setDate(dtf.format(now).toString());
		l.setTime(java.time.LocalTime.now().toString());  
		l.setName(name);
		l.setLogType("IN");
		l.setId(name+java.time.LocalTime.now().toString());
		repo.save(l);
		return l;
	}
	
	@GetMapping(path = "/checkOut")
	public Log Out(@RequestParam("name") String name ) {
		Log l = new Log();
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd");
		LocalDateTime now = LocalDateTime.now();
		l.setDate(dtf.format(now).toString());
		l.setTime(java.time.LocalTime.now().toString());  
		l.setName(name);
		l.setLogType("OUT");
		l.setId(name+java.time.LocalTime.now().toString());
		repo.save(l);
		return l;
	}
	
	@GetMapping(path = "/getLogByDate")
	public List<Log> getLogDate(@RequestParam("date") String date) {
		
		return repo.findAllByDate(date);
	}
	
	@GetMapping(path = "/getAllLog") 
	public List<Log> getLog() {
		
		return repo.findAll();
	}
}
