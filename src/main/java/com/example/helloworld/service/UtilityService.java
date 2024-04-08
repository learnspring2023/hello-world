package com.example.helloworld.service;

import org.springframework.stereotype.Service;

//@Service
public class UtilityService {

	int feeAmount;
	int donation;
	
    public UtilityService(int feeAmount, int donation) {
		super();
		this.feeAmount = feeAmount;
		this.donation = donation;
	}

	public int totalFee() {
    	return feeAmount + donation;
    }
	
}
