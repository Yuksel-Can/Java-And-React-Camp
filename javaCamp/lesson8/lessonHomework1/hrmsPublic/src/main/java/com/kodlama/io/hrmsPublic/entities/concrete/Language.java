//package com.kodlama.io.hrmsPublic.entities.concrete;
//
//import java.sql.Date;
//
//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.FetchType;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//import javax.persistence.JoinColumn;
//import javax.persistence.ManyToOne;
//import javax.persistence.Table;
//import javax.validation.constraints.NotBlank;
//
//import lombok.AllArgsConstructor;
//import lombok.Data;
//import lombok.NoArgsConstructor;
//
//@Entity
//@Data
//@AllArgsConstructor
//@NoArgsConstructor
//@Table(name="resume_langs")
//public class Language {
//
//	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
//	@Column(name="id")
//	private int id;
//	
//	@ManyToOne(targetEntity=Resume.class, fetch = FetchType.LAZY,optional = false)
//	@JoinColumn(name="resume_id", referencedColumnName="id", nullable=false)
//	@Column(name="resume_id")
//	private Resume resume;
//	
//	@NotBlank(message="Boş geçilemez")
//	@Column(name="language")
//	private String language;
//	
//	@NotBlank(message="Boş geçilemez")
//	@Column(name="lang_level")
//	private char langLevel;
//	
//	@Column(name="created_date")
//	private Date createdDate;
//}
