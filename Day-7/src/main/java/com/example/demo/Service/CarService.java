package com.example.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Entity.Cars;
import com.example.demo.Repository.CarRepo;

@Service
public class CarService {
	
	@Autowired
	private CarRepo repo;

	public Cars addAll(Cars c) {
		return repo.save(c);
	}

	public List<Cars> getAll() {
		return repo.findAll();
	}

	public List<Cars> find(int own) {
		return repo.find(own);
	}
	public List<Cars> findadd(String add) {
		return repo.findadd(add);
	}
	public List<Cars> findct(String ct) {
		return repo.findct(ct);
	}
	public List<Cars> findownct(int own, String ct) {
		return repo.findownct(own,ct);
	}

}
