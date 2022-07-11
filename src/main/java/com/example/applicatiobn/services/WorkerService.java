package com.example.applicatiobn.services;

import com.example.applicatiobn.models.Worker;
import com.example.applicatiobn.repositories.WorkerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

import java.util.List;
import java.util.Optional;

@Service
@Transactional(readOnly = true)
public class WorkerService {

    private final WorkerRepository workerRepository;

    public WorkerService(WorkerRepository workerRepository) {
        this.workerRepository = workerRepository;
    }
    public List<Worker> findall(){
        return workerRepository.findAll();
    }

    public Worker findone(int id){
        Optional<Worker> foundPerson = workerRepository.findById(id);
        return foundPerson.orElse(null);
    }

    @Transactional
    public void save(Worker worker){
        workerRepository.save(worker);
    }
    @Transactional
    public void update(int id , Worker worker){
        worker.setId( id);
        workerRepository.save(worker);
    }
    @Transactional
    public void delete(int id){
        workerRepository.deleteById(id);
    }
}
