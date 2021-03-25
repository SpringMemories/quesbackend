package com.hd.aweproject.controller;

import com.hd.aweproject.domain.Question;
import com.hd.aweproject.domain.User;
import com.hd.aweproject.service.QuestionService;
import com.hd.aweproject.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MyController {
    @Autowired
    private QuestionService questionService;
    @GetMapping("/sq")
    public Question searchQuestion(@RequestParam("id") long id) {
        return questionService.searchId(id);
    }
    @GetMapping("/suq")
    public Question searchuQuestion(@RequestParam("userId") String userId) {
        return questionService.searchUserId(userId);
    }
    @GetMapping("/saq")
    public List<Question> searchAll() {
        return questionService.searchAll();
    }
//    @GetMapping("aq")
//    public void addQuestion(@RequestParam("title") String title, @RequestParam("answer") String answer, @RequestParam("userId") String userId){
//        Question question = new Question();
//        question.setTitle(title);
//        question.setAnswer(answer);
//        question.setUserId(userId);
//        myService.addQuestion(question);
//    }
    
    @PostMapping("aq")
    public void addQuestion(@RequestBody Question question) {
        questionService.addQuestion(question);
    }

    @Autowired
    private UserService userService;
    @GetMapping("/su")
    public User searchUser(@RequestParam("userId") String userId) {
        return userService.searchUserId(userId);
    }
    @GetMapping("/au")
    public void addUser(@RequestParam("userId") String userId, @RequestParam("password") String password, @RequestParam("userName") String userName, @RequestParam("signature") String signature){
        User user = new User();
        user.setUserId(userId);
        user.setPassword(password);
        user.setUserName(userName);
        user.setSignature(signature);
        userService.addUser(user);
    }
    @GetMapping("/eu")
    public boolean existUser(@RequestParam("userId") String userId){
        return userService.existUserId(userId);
    }
}