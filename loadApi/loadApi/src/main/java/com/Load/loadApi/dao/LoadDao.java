package com.Load.loadApi.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.Load.loadApi.entity.LoadApi;
import com.Load.loadApi.repo.LoadRepo;

@Repository
public class LoadDao {

	@Autowired
	private LoadRepo loadRepo;

	public LoadApi payLoad(LoadApi load) {
		return loadRepo.save(load);

	}

	public List<LoadApi> LoadsDetails(String shipperId) {
		return loadRepo.findByShipperId(shipperId);

	}

	public List<LoadApi> LoadsDetailsById(Long loadId) {
		return loadRepo.findByLoadId(loadId);

	}

	public LoadApi UpdateLoad(Long loadId, LoadApi loadApi) {

		Optional<LoadApi> optional = loadRepo.findById(loadId);
		if (optional.isPresent()) {
			loadApi.setLoadId(loadId);
			return loadRepo.save(loadApi);
		}
		return null;

	}
	
	public LoadApi DeletebyId(Long loadId) {
		Optional<LoadApi> optional = loadRepo.findById(loadId);
		if (optional.isEmpty()) {
			return null;
		}
		loadRepo.deleteById(loadId);
		return optional.get();
	}

}
