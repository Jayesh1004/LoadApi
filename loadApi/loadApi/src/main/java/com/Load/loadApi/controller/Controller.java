package com.Load.loadApi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.Load.loadApi.dao.LoadDao;
import com.Load.loadApi.entity.LoadApi;
import com.Load.loadApi.service.LoadService;
import com.Load.loadApi.util.ResponseStructure;

@RestController
public class Controller {

	@Autowired
	private LoadService loadService;
	@Autowired
	private LoadDao loadDao;

	@PostMapping("/load")
	public ResponseStructure<LoadApi> payLoad(@RequestBody LoadApi loadApi) {
		return loadService.payLoad(loadApi);
	}

	@GetMapping("/load")
	public ResponseStructure<LoadApi> LoadsDetails(@RequestParam("shipperId") String shipperId) {
		return loadService.LoadsDetails(shipperId);
	}

	@GetMapping("/load/{loadId}")
	public ResponseStructure<LoadApi> LoadsDetailsById(@PathVariable Long loadId) {
		return loadService.LoadsDetailsById(loadId);
	}

	@PutMapping("/load/{loadId}")
	public ResponseStructure<LoadApi> UpdateLoad(@PathVariable Long loadId,@RequestBody LoadApi loadApi ) {
		return loadService.UpdateLoad(loadId, loadApi);
	}
    
	@DeleteMapping("/load/{loadId}")
	public ResponseStructure<LoadApi> DeleteById(@PathVariable Long loadId) {
		return loadService.DeleteById(loadId);
	}

}
