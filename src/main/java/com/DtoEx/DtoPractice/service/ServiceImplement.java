package com.DtoEx.DtoPractice.service;

import java.util.List;

import com.DtoEx.DtoPractice.dto.WorkerDto;
import com.DtoEx.DtoPractice.entity.Worker;

public interface ServiceImplement {

	Worker post(WorkerDto dto);

	List<Worker> postall(List<Worker> dto);

	Worker get(int  id);

	List<WorkerDto> getall();

	Worker update(WorkerDto dto);

	String delete(int id);


}
