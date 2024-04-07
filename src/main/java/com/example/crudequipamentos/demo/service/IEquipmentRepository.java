package com.example.crudequipamentos.demo.service;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.crudequipamentos.demo.model.Equipment;

@Repository
public interface IEquipmentRepository extends CrudRepository<Equipment, Long> {

	List<Equipment> findAll();

}
