package com.hd.aweproject.service;

import com.hd.aweproject.domain.Question;

import java.util.List;

public interface QuestionService {
    void addQuestion(Question question);
    Question searchId(long id);
    Question searchUserId(String userId);
    List<Question> searchAll();
}
