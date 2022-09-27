package com.exampleabc.demoabc.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.exampleabc.demoabc.entity.ChuyenBay;

public interface ChuyenBayRepository  extends JpaRepository<ChuyenBay, String>{
	public List<ChuyenBay> findByGaDen(String gaden);
	
}
