package com.cmepps.dotareas.core.usecase;

import java.util.Optional;

import com.cmepps.dotareas.core.domain.Task;

public interface UpdateTaskUseCase {
	Optional<Task> updateTask(Long id);
}
