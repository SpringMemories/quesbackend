package com.hd.aweproject.repository;

import com.hd.aweproject.domain.Question;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface QuestionRepository extends JpaRepository<Question, Long> {
    Question findById(long id);
    Question findByUserId(String userId);
    List<Question> findAll();
}
