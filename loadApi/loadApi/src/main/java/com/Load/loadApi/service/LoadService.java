package com.Load.loadApi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Load.loadApi.dao.LoadDao;
import com.Load.loadApi.entity.LoadApi;
import com.Load.loadApi.util.ResponseStructure;

@Service
public class LoadService {
	@Autowired
	private LoadDao loadDao;

	ResponseStructure<LoadApi> responseStructure = new ResponseStructure<>();

	public ResponseStructure<LoadApi> payLoad(LoadApi loadApi) {
		responseStructure.setMessage("loads details added successfully ");
		responseStructure.setData(loadDao.payLoad(loadApi));
		return responseStructure;

	}

	public ResponseStructure<LoadApi> LoadsDetails(String shipperId) {

		responseStructure.setMessage("list of loads with this shipperId");
		responseStructure.setData(loadDao.LoadsDetails(shipperId));
		return responseStructure;

	}

	public ResponseStructure<LoadApi> LoadsDetailsById(Long loadId) {

		responseStructure.setMessage("list of loads with this load Id");
		responseStructure.setData(loadDao.LoadsDetailsById(loadId));
		return responseStructure;

	}

	public ResponseStructure<LoadApi> UpdateLoad(Long loadId, LoadApi loadApi) {
		responseStructure.setMessage("Load Upadte successfully");
		responseStructure.setData(loadDao.UpdateLoad(loadId, loadApi));
		return responseStructure;

	}

	public ResponseStructure<LoadApi> DeleteById(Long loadId) {
		responseStructure.setMessage("Deta Delete successfully");
		responseStructure.setData1(loadDao.DeletebyId(loadId));
		return responseStructure;

	}

}
