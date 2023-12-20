package com.cmepps.dotareas.core.driven_ports;

import java.util.List;
import java.util.Optional;

import com.cmepps.dotareas.core.domain.Task;

public interface TaskRepository {
	Optional<Task> update(long id);
	
	Optional<Task> findById(Long id);
	
	List<Task> findAll();
}
