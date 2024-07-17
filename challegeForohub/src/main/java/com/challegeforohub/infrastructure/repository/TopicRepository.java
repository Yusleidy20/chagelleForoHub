package com.challegeforohub.infrastructure.repository;

import com.forohub.api.domain.entity.Topic;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.UUID;

@Repository
public interface TopicRepository extends JpaRepository<Topic, UUID> {

    @Override
    Optional<Topic> findById(UUID uuid);
}
