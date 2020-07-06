package com.springboot.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.springboot.model.WoodsModel;

@Service
public class WoodService {

	/*  we can't add new list here as Arrays is Immutable */
//	private List<WoodsModel> woodsModelList=Arrays.asList(
//			new WoodsModel("hwood", "hollywood", "English content in US", "USA"),
//			new WoodsModel("bwood", "bollywood", "Hindi content in India", "INDIA"),
//			new WoodsModel("twood", "tollywood", "Telugu content in India", "INDIA(SOUTH)"));
	
	private List<WoodsModel> woodsModelList=new ArrayList<WoodsModel>(Arrays.asList(
			new WoodsModel("hwood", "hollywood", "English content in US", "USA"),
			new WoodsModel("bwood", "bollywood", "Hindi content in India", "INDIA"),
			new WoodsModel("twood", "tollywood", "Telugu content in India", "INDIA(SOUTH)")));
	
	
	public void addWood(WoodsModel woodsModel) {
		woodsModelList.add(woodsModel);
	}

	public List<WoodsModel> getAllWoods() {
		return woodsModelList;
	}

	public WoodsModel getWood(String id) {
		return woodsModelList.stream().filter(woodId->id.equals(woodId.getId())).findFirst().orElse(null);
	}

	public void updateWood(String id, WoodsModel woodsModel) {
		int count=-1;
		for(WoodsModel model:woodsModelList) {
			count++;
			if(model.getId().equals(id)) {
				woodsModelList.set(count, woodsModel);
			}
		}
	}

	public void deleteWood(String id) {
		woodsModelList.removeIf(wood -> wood.getId().equals(id));
	}

	

}
