package com.brandine.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.brandine.model.Activity;
import com.brandine.repository.ActivityRepository;

@RestController
@RequestMapping("/apiActivity")
public class ActivityController {
	
	@Autowired
	private ActivityRepository  activityReposiory; 
	

	@GetMapping("/getActivity")
	public List <Activity> listar() {
		return activityReposiory.findAll(); 
	}
	
 
	@PostMapping("/addActivity")
	public Activity adicionar (@RequestBody Activity notas) {
		return activityReposiory.save(notas); 
	} 
	
	

}
