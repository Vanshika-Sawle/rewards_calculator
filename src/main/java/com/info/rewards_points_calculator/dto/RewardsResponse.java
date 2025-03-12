package com.info.rewards_points_calculator.dto;

import lombok.Data;
import java.util.Map;

@Data
public class RewardsResponse {
    private String customerId;
    private Map<String, Integer> monthlyPoints;  // e.g., { "Jan": 120, "Feb": 90 }
    private int totalPoints;
    
    public String getCustomerId() {
		return customerId;
	}
	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}
	
	public int getTotalPoints() {
		return totalPoints;
	}
	public void setTotalPoints(int totalPoints) {
		this.totalPoints = totalPoints;
	}
	
	public Map<String, Integer> getMonthlyPoints() {
		return monthlyPoints;
	}
	public void setMonthlyPoints(Map<String, Integer> monthlyPoints) {
		this.monthlyPoints = monthlyPoints;
	}
    
}
