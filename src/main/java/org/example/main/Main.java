package org.example.main;

import org.example.config.ProjectConfiguration;
import org.example.models.Comment;
import org.example.services.CommentService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfiguration.class);

        var cs1 = context.getBean(CommentService.class);
        var cs2 = context.getBean(CommentService.class);

        System.out.println("cs1 == cs2: " + (cs1 == cs2));
    }
}
