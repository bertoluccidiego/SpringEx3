package org.example.config;

import org.example.services.CommentService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;

@Configuration
@ComponentScan(basePackages = "org.example")
public class ProjectConfiguration {

    @Bean
    @Lazy
    public CommentService commentService() {
        return new CommentService();
    }
}
