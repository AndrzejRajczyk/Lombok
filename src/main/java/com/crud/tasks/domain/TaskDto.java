package com.crud.tasks.domain;

import lombok.Data;

@Data
public class TaskDto {
    private Long id;
    private String title;
    private String content;


    public TaskDto(long i, String test_title, String s) {
    }
}
