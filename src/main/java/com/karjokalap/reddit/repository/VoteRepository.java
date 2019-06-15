package com.karjokalap.reddit.repository;

import com.karjokalap.reddit.entity.Vote;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VoteRepository extends JpaRepository<Vote, Long> {
}
