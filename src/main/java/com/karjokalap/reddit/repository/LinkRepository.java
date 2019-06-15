package com.karjokalap.reddit.repository;

import com.karjokalap.reddit.entity.Link;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LinkRepository extends JpaRepository<Link, Long> {
}
