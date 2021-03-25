package com.hd.aweproject.service.impl;

import com.hd.aweproject.domain.Question;
import com.hd.aweproject.repository.QuestionRepository;
import com.hd.aweproject.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuestionServiceImpl implements QuestionService {
    @Autowired
    private QuestionRepository myRepository;
    @Override
    public void addQuestion(Question question) {
        myRepository.save(question);
    }
    @Override
    public Question searchId(long id) {
        return myRepository.findById(id);
    }
    @Override
    public Question searchUserId(String userId) {
        return myRepository.findByUserId(userId);
    }
    @Override
    public List<Question> searchAll() { return myRepository.findAll(); }
}
