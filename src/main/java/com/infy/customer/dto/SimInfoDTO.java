package com.infy.customer.dto;

public class SimInfoDTO {
	private Integer simId;
	private Long serviceNumber;
	private Long simNumber;
	private String simStatus;
	public Integer getSimId() {
		return simId;
	}
	public void setSimId(Integer simId) {
		this.simId = simId;
	}
	public Long getServiceNumber() {
		return serviceNumber;
	}
	public void setServiceNumber(Long serviceNumber) {
		this.serviceNumber = serviceNumber;
	}
	public Long getSimNumber() {
		return simNumber;
	}
	public void setSimNumber(Long simNumber) {
		this.simNumber = simNumber;
	}
	public String getSimStatus() {
		return simStatus;
	}
	public void setSimStatus(String simStatus) {
		this.simStatus = simStatus;
	}
}
