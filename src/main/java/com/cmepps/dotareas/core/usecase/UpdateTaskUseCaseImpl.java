package com.cmepps.dotareas.core.usecase;

import java.util.Optional;

import com.cmepps.dotareas.core.domain.Task;
import com.cmepps.dotareas.core.driven_ports.TaskRepository;


public class UpdateTaskUseCaseImpl implements UpdateTaskUseCase {
	
	private final TaskRepository taskRepository;

	
	public UpdateTaskUseCaseImpl(TaskRepository taskRepository)
	{
		this.taskRepository = taskRepository;
	}
	
	@Override
	public Optional<Task> updateTask(Long id) {
		return taskRepository.update(id);
	}
}
	
