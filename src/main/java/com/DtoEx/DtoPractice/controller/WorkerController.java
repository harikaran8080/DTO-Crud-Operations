package com.DtoEx.DtoPractice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.DtoEx.DtoPractice.dto.WorkerDto;
import com.DtoEx.DtoPractice.entity.Worker;
import com.DtoEx.DtoPractice.service.ServiceImplement;

@RestController
@RequestMapping("worker/api")
public class WorkerController {
	
	@Autowired
	private ServiceImplement implement;
	
	
	@PostMapping("/post")
	public Worker post(@RequestBody WorkerDto dto) {
		return implement.post(dto);
		
	}
	
	
	@PostMapping("/postall")
	public List<Worker> postall(@RequestBody List<Worker> dto){
		return implement.postall(dto);
		
	}
	
	@GetMapping("/get")
	public Worker get(@RequestParam("id") int id) {
		return implement.get(id);
	}
	
	@GetMapping("/getall")
	public List<WorkerDto> getall() {
		return implement.getall();
	}
	
	@PutMapping("/update")
	public Worker update(@RequestBody WorkerDto dto) {
		return implement.update(dto);
	}
	
	@DeleteMapping("/delete/{id}")
	public String delete(@PathVariable int id) {
		return implement.delete(id);
		 
	}
	

}
