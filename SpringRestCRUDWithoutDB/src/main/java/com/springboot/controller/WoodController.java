package com.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.model.WoodsModel;
import com.springboot.service.WoodService;

@RestController
public class WoodController {

	@Autowired
	private WoodService woodService;

	@PostMapping("/movies")
	public void addWood(@RequestBody WoodsModel woodsModel) {
		woodService.addWood(woodsModel);
	}

	@GetMapping("/movies/allWoods")
	public List<WoodsModel> getAllWoods() {
		return woodService.getAllWoods();
	}

	@GetMapping("/movies/getWood/{id}")
	public WoodsModel getWood(@PathVariable String id) {
		return woodService.getWood(id);
	}

	@PutMapping("/movies/{id}")
	public void updateWood(@PathVariable String id, @RequestBody WoodsModel woodsModel) {
		woodService.updateWood(id,woodsModel);
	}
	
	@DeleteMapping("/movies/{id}")
	public void deleteWood(@PathVariable String id) {
		woodService.deleteWood(id);
	}
	 
}
