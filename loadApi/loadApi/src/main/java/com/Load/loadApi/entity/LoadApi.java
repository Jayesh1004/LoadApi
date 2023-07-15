package com.Load.loadApi.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class LoadApi {
	   @Id
	   @GeneratedValue(strategy = GenerationType.AUTO)
	    private Long loadId;
	    private String loadingPoint;
	    private String unloadingPoint;
	    private String productType;
	    private String truckType;
	    private int noOfTrucks;
	    private int weight;
	    private String comment;
	    private String date;
	    private String shipperId;
	    
	    
		public Long getLoadId() {
			return loadId;
		}
		public void setLoadId(Long loadId) {
			this.loadId = loadId;
		}
		public String getLoadingPoint() {
			return loadingPoint;
		}
		public void setLoadingPoint(String loadingPoint) {
			this.loadingPoint = loadingPoint;
		}
		public String getUnloadingPoint() {
			return unloadingPoint;
		}
		public void setUnloadingPoint(String unloadingPoint) {
			this.unloadingPoint = unloadingPoint;
		}
		public String getProductType() {
			return productType;
		}
		public void setProductType(String productType) {
			this.productType = productType;
		}
		public String getTruckType() {
			return truckType;
		}
		public void setTruckType(String truckType) {
			this.truckType = truckType;
		}
		public int getNoOfTrucks() {
			return noOfTrucks;
		}
		public void setNoOfTrucks(int noOfTrucks) {
			this.noOfTrucks = noOfTrucks;
		}
		public int getWeight() {
			return weight;
		}
		public void setWeight(int weight) {
			this.weight = weight;
		}
		public String getComment() {
			return comment;
		}
		public void setComment(String comment) {
			this.comment = comment;
		}
		public String getDate() {
			return date;
		}
		public void setDate(String date) {
			this.date = date;
		}
		public String getShipperId() {
			return shipperId;
		}
		public void setShipperId(String shipperId) {
			this.shipperId = shipperId;
		}
		@Override
		public String toString() {
			return "Load [loadId=" + loadId + ", loadingPoint=" + loadingPoint + ", unloadingPoint=" + unloadingPoint
					+ ", productType=" + productType + ", truckType=" + truckType + ", noOfTrucks=" + noOfTrucks
					+ ", weight=" + weight + ", comment=" + comment + ", date=" + date + ", shipperId=" + shipperId
					+ "]";
		}
	    
	
	    
}
