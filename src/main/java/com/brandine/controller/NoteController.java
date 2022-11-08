package com.brandine.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.brandine.model.Note;
import com.brandine.repository.NoteRepository;

@RestController
@RequestMapping("/apiNote")
public class NoteController {

	@Autowired
	private NoteRepository noteReposiory; 


	@GetMapping("/getNote")
	public List <Note> listar() {
		return noteReposiory.findAll(); 
	}


	@PostMapping("/addNote")
	public Note adicionar (@RequestBody Note note) {
		return noteReposiory.save(note); 
	} 

 
}
