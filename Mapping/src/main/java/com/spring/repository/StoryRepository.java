package com.spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spring.entity.Story;

@Repository
public interface StoryRepository extends JpaRepository<Story, String> {
}