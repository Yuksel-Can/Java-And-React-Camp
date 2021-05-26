package com.kodlama.io.hrms.business.abstracts;

import java.util.List;

import com.kodlama.io.hrms.entities.concrete.JobTitle;

public interface JobTitleService {
	List<JobTitle> getAll();

}
