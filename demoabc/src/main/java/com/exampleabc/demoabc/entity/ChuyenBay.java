package com.exampleabc.demoabc.entity;

import java.sql.Time;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name ="chuyenbay")
public class ChuyenBay {
	@Id
	@Column(columnDefinition = "varchar(5)")
	private String maCB;
	@Column(columnDefinition = "varchar(50)")
	private String gaDi;
	@Column(columnDefinition = "varchar(50)")
	private String gaDen;
	private Long doDai;
	private Time gioDi;
	private Time gioDen;
	private double chiPhi;
	
}
