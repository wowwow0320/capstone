package com.example.demo.domain;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.text.SimpleDateFormat;
import java.util.Date;

@Data
@Getter
@Setter
public class Entity {
    private Long pid;
    private String content;
    private Date time;
    private Boolean check;

}
