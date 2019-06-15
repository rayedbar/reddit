package com.karjokalap.reddit;

import com.karjokalap.reddit.entity.Comment;
import com.karjokalap.reddit.entity.Link;
import com.karjokalap.reddit.repository.CommentRepository;
import com.karjokalap.reddit.repository.LinkRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class RedditApplication {

    public static void main(String[] args) {
        SpringApplication.run(RedditApplication.class, args);
    }

    @Bean
    CommandLineRunner runner(LinkRepository linkRepository, CommentRepository commentRepository) {
        return args -> {
            Link link = new Link();
            link.setUrl("http://www.google.com");
            link.setTitle("Spring boot 2 is fun");

            link = linkRepository.save(link);

            Comment comment = new Comment();
            comment.setBody("Fist comment to Spring boot 2 is fun");
            link.addComment(comment);

            linkRepository.save(link);
            commentRepository.save(comment);
        };
    }

}
