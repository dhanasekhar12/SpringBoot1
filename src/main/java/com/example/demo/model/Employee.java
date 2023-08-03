package com.example.demo.model;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="employeee")
public class Employee {
	
	

	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long emp_id;
	    
	    private String emp_name;
	    
	    @Column(name = "emp_dob")
	    private Date dateOfBirth;
	    
	    @ManyToOne
	    @JoinColumn(name = "dept_id")
	    private Department department;
	    
	    private BigDecimal salary;
	    
	    @ManyToOne
	    @JoinColumn(name = "manager_id")
	    private Employee manager;
	    
	    private String mobile;

	    
	


}
