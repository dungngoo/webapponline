package com.exampleabc.demoabc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.exampleabc.demoabc.entity.ChuyenBay;
import com.exampleabc.demoabc.repository.ChuyenBayRepository;
@RestController
public class ChuyenBayController {
	@Autowired
	private ChuyenBayRepository chuyenBayRePository;
	@RequestMapping("cau1")
	public List<ChuyenBay> cau1(){
		return  chuyenBayRePository.findByGaDen("DAD");
	}
      
}
