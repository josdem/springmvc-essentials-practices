package com.makingdevs.repositories;

import org.springframework.data.repository.CrudRepository;

import com.makingdevs.model.Task;

public interface TaskRepository extends CrudRepository<Task, Long> {
  // List<Task> findAllByDescriptionLike(String description);
  // List<Task> findAllByUserStoryAndStatusEquals(UserStory userStory,
  // TaskStatus taskStatus);
  // List<Task> findAllByUser(User user);
}