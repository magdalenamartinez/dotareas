package com.cmepps.dotareas.core.usecase;

import java.util.List;
import java.util.Optional;

import com.cmepps.dotareas.core.domain.Task;

public interface ReadTaskUseCase {

	Optional<Task> readById(Long id);
	
	List<Task> readAll();
}
