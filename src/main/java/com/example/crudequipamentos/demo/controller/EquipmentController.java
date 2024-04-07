package com.example.crudequipamentos.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.crudequipamentos.demo.model.Equipment;
import com.example.crudequipamentos.demo.service.IEquipmentRepository;

@RestController
public class EquipmentController {

	@Autowired
	private IEquipmentRepository equipmentRepository;

	@GetMapping
	public List<Equipment> getEquipments() {

		List<Equipment> resultEquipments = this.equipmentRepository.findAll();
		return resultEquipments;
	}

	@PostMapping
	public void addEquipment(@RequestBody EquipmentDTO equipmentDto) {

		Equipment equipment = new Equipment(equipmentDto.name, equipmentDto.type);

		Equipment resultEquipment = this.equipmentRepository.save(equipment);

		return;
	}

}
