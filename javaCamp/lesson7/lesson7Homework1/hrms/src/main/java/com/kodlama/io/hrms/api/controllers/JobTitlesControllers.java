package com.kodlama.io.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kodlama.io.hrms.business.abstracts.JobTitleService;
import com.kodlama.io.hrms.entities.concrete.JobTitle;

@RestController
@RequestMapping("/api/jobtitle")
public class JobTitlesControllers {

	private JobTitleService jobTitleService;

	@Autowired
	public JobTitlesControllers(JobTitleService jobTitleService) {
		this.jobTitleService = jobTitleService;
	}

	@GetMapping("/getall")
	public List<JobTitle> getAll() {
		return this.jobTitleService.getAll();
	}
	
}
