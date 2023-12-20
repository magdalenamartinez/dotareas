package com.cmepps.dotareas.driven_adapter.jpa;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cmepps.dotareas.driven_adapter.domain.TaskEntity;

public interface JpaTaskRepository extends JpaRepository<TaskEntity, Long>{

}
