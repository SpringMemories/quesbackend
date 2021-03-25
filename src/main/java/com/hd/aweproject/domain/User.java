package com.hd.aweproject.domain;

import lombok.Data;
import lombok.ToString;
import org.springframework.stereotype.Component;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@ToString
@Data
@Component
@Entity
public class User {
    @Id
    private String userId;
    private String password;
    private String userName;
    private String signature;
}