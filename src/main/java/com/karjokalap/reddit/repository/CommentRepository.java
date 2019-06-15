package com.karjokalap.reddit.repository;

import com.karjokalap.reddit.entity.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommentRepository extends JpaRepository<Comment, Long> {
}
