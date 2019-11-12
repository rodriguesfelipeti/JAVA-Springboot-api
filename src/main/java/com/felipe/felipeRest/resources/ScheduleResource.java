package com.felipe.felipeRest.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.felipe.felipeRest.models.Schedule;
import com.felipe.felipeRest.repository.ScheduleRepository;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping(value="/api")
public class ScheduleResource {
	
	@Autowired
	ScheduleRepository scheduleRepository;
	
	@GetMapping("/schedule")
	public List<Schedule> listaProdutos(){
		return scheduleRepository.findAll();
	}
	
	@GetMapping("/schedule/{id}")
	public Schedule listaScheduleUnico(@PathVariable(value = "id") long id) {
		return scheduleRepository.findById(id);
	}
	
	@PostMapping("/schedule")
	public Schedule salvarSchedule(@RequestBody Schedule schedule) {
		return scheduleRepository.save(schedule);
	}
	
}
