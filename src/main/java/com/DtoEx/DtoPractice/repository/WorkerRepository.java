package com.DtoEx.DtoPractice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.DtoEx.DtoPractice.entity.Worker;

@Repository
public interface WorkerRepository  extends JpaRepository<Worker, Integer>{

}
