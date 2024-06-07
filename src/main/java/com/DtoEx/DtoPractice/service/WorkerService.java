package com.DtoEx.DtoPractice.service;

import java.lang.StackWalker.Option;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.DtoEx.DtoPractice.dto.WorkerDto;
import com.DtoEx.DtoPractice.entity.Worker;
import com.DtoEx.DtoPractice.repository.WorkerRepository;

@Service
public class WorkerService implements ServiceImplement {

	@Autowired
	private WorkerRepository repository;

	@Override
	public Worker post(WorkerDto dto) {
		Worker worker = new Worker();
		worker.setId(dto.getId());
		worker.setName(dto.getName());
		worker.setRoll(dto.getRoll());
		worker.setSalary(dto.getSalary());
		return repository.save(worker);

	}

	@Override
	public List<Worker> postall(List<Worker> dto) {
		List<Worker> list = repository.saveAll(dto);
		return list;

	}

	@Override
	public Worker get(int id) {
		Optional<Worker> optional = repository.findById(id);
		Worker worker = optional.get();
		WorkerDto dto = new WorkerDto();
		dto.setId(worker.getId());
		dto.setName(worker.getName());
		dto.setRoll(worker.getRoll());
		dto.setSalary(worker.getSalary());
		return repository.save(worker);

	}

	{
	}

	@Override
	public List<WorkerDto> getall() {
		List<Worker>list=repository.findAll();
		List<WorkerDto> workers=new ArrayList<>();
		for(Worker worker:list) {
        WorkerDto dto=new WorkerDto();
		dto.setId(worker.getId());
		dto.setName(worker.getName());
		dto.setRoll(worker.getRoll());
		dto.setSalary(worker.getSalary());
		workers.add(dto);
		}
		return workers;
	
	}

	@Override
	public Worker update(WorkerDto dto) {
		Optional<Worker>optional=repository.findById(dto.getId());
		Worker worker=optional.get();
		worker.setId(dto.getId());
		worker.setName(dto.getName());
		worker.setRoll(dto.getRoll());
		worker.setSalary(dto.getSalary());
		return repository.save(worker);
		
		
	}

	@Override
	public String delete(int id) {
		repository.deleteById(id);
		return "Successfully Deleted";
	}
	
	
}
