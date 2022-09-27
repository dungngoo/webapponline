package com.exampleabc.demoabc.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "NHANVIEN")
@Data
public class NhanVien {
   
	@Id
    private String manv;
    private String ten;
    private Double luong;
}