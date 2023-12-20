package com.cmepps.dotareas.core.usecase;

import java.util.List;
import java.util.Optional;

import com.cmepps.dotareas.core.domain.Task;
import com.cmepps.dotareas.core.driven_ports.TaskRepository;

public class ReadTaskUseCaseImpl implements ReadTaskUseCase{
	private final TaskRepository taskRepository;
	
	public ReadTaskUseCaseImpl(TaskRepository taskRepository) {
		this.taskRepository = taskRepository;
	}

	@Override
	public Optional<Task> readById(Long id) {
		// TODO Auto-generated method stub
		return taskRepository.findById(id);
	}

	@Override
	public List<Task> readAll() {
		// TODO Auto-generated method stub
		return taskRepository.findAll();
	}
	
	
}
