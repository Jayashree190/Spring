package com.example.log.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.log.model.Log;

public interface LogRepo extends JpaRepository<Log, String>{

	List<Log> findAllByDate(String date);
	

}
