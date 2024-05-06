package com.labdessoft.roteiro01.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.labdessoft.roteiro01.entity.Task;
import org.springframework.stereotype.Repository;


@Repository
public interface TaskRepository extends JpaRepository<Task, Long> {
}