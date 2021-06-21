package com.kodlama.io.hrmsPublic.api.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.kodlama.io.hrmsPublic.business.abtracts.LanguageService;
import com.kodlama.io.hrmsPublic.core.utilities.results.DataResult;
import com.kodlama.io.hrmsPublic.core.utilities.results.Result;
import com.kodlama.io.hrmsPublic.dtos.LanguageWithResumeDto;
import com.kodlama.io.hrmsPublic.entities.concrete.Language;

@RestController
@RequestMapping("/api/language")
public class LanguagesController {

	private LanguageService languageService;
	
	@Autowired
	public LanguagesController(LanguageService languageService) {
		this.languageService = languageService;
	}

	@GetMapping("/getall")
	public DataResult<List<Language>> getAll(){
		return this.languageService.getAll();
	}
	
	@PostMapping("/add")
	public Result add(@RequestBody Language language) {
		return this.languageService.add(language);
		
	}

	@GetMapping("/getLanguageDetailsWithResumeIdOrderByDesc")
	public DataResult<List<LanguageWithResumeDto>> getLanguageDetailsWithResumeIdOrderByDesc(@RequestParam int id){
		return this.languageService.getLanguageDetailsWithResumeIdOrderByDesc(id);
	}
}
