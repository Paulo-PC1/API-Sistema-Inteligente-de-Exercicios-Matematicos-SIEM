package br.com.devpaulo.siem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.devpaulo.siem.domain.model.Exercise;
import br.com.devpaulo.siem.repository.ExerciseRepository;
import br.com.devpaulo.siem.service.ExerciseService;

@RestController
@RequestMapping("/exercise")
public class ExerciseController {

	@Autowired
	private ExerciseRepository exerciseRepository;
	
	@Autowired
	private ExerciseService exerciseService;
	
	@GetMapping
	public List<Exercise> findAll(){
		return exerciseRepository.findAll();
	}
	
}
