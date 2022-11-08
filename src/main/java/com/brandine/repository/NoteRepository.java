package com.brandine.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.brandine.model.Note;

@Repository
public interface NoteRepository extends JpaRepository<Note, Long> {

 
}
