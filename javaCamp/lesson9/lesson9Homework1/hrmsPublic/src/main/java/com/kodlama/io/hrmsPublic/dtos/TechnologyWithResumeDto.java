package com.kodlama.io.hrmsPublic.dtos;

import java.util.Date;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TechnologyWithResumeDto {

	private int id;	//user id
	private String technologyName;
	private Date updateDate;

}
