package com.crud.tasks;

import com.crud.tasks.domain.TaskDto;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;

@EnableAutoConfiguration//gdzie ma być servlet
public class TasksApplication extends SpringBootServletInitializer {
    // public class TasksApplication{
    public static void main(String[] args) {


        TaskDto taskDto = new TaskDto( 1, "Test title", "I want to be a coder!");

        String title = taskDto.getTitle();
        String content = taskDto.getContent();
        Long id = taskDto.getId();


        System.out.println(id + " " + title + " " + content);
        SpringApplication.run(TasksApplication.class, args);
    }

  //  @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(TasksApplication.class);
    }
}

