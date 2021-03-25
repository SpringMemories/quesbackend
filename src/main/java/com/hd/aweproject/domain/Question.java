package com.hd.aweproject.domain;

import lombok.Data;
import lombok.ToString;
import org.springframework.stereotype.Component;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

@ToString
@Data
@Component
@Entity
public class Question {
    @Id
    @GeneratedValue
    private long quesId;
    private String title;
    private String optionA;
    private String optionB;
    private String optionC;
    private String optionD;
    private String answer;
    private String quesType;
    private long quesSetId;
    private String description;
    private int result;
    private boolean star;
    private int errNum;
    private int exeNum;
    private String subject;
    private String lastAnswer;
    private Date createdTime;
    private Date modifiedTime;
    private String userId;
}