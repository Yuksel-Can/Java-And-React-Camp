package com.kodlama.io.hrms.business.concrete;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kodlama.io.hrms.business.abstracts.JobTitleService;
import com.kodlama.io.hrms.dataAccess.abstracts.JobTitleDao;
import com.kodlama.io.hrms.entities.concrete.JobTitle;


@Service
public class JobTitleManager implements JobTitleService{

	private JobTitleDao jobTitleDao;
	
	@Autowired
	public JobTitleManager(JobTitleDao jobTitleDao) {
		this.jobTitleDao = jobTitleDao;
	}
	
	
	@Override
	public List<JobTitle> getAll() {
		
		return this.jobTitleDao.findAll();
	}

}
