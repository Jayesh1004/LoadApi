package com.Load.loadApi.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.Load.loadApi.entity.LoadApi;

public interface LoadRepo extends JpaRepository<LoadApi,Long>{
//    @Query("select l from LoadApi l Where l.shipperId=?1")
	public List<LoadApi> findByShipperId(String shipperId);
	
	public List<LoadApi> findByLoadId(Long loadId);
	
	public LoadApi deleteByloadId(Long loadId);
	
	
	
}
