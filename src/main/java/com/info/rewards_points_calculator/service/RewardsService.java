package com.info.rewards_points_calculator.service;

import com.info.rewards_points_calculator.model.Transaction;
import com.info.rewards_points_calculator.dto.RewardsResponse;
import org.springframework.stereotype.Service;
import java.time.Month;
import java.util.*;
import java.util.stream.Collectors;

@Service
public class RewardsService {

    public RewardsResponse calculateRewards(List<Transaction> transactions) {
        Map<String, Integer> monthlyPoints = new HashMap<>();
        int totalPoints = 0;
        String customerId = transactions.get(0).getCustomerId();

        for (Transaction txn : transactions) {
            int points = calculatePoints(txn.getAmount());
            String month = txn.getDate().getMonth().toString();
            monthlyPoints.put(month, monthlyPoints.getOrDefault(month, 0) + points);
            totalPoints += points;
        }

        RewardsResponse response = new RewardsResponse();
        response.setCustomerId(customerId);
        response.setMonthlyPoints(monthlyPoints);
        response.setTotalPoints(totalPoints);
        return response;
    }

    private int calculatePoints(double amount) {
        int points = 0;
        if (amount > 100) {
        	points = (int)((amount-100)*2  + 50);       
        }
        else if (amount > 50) {
            points = (int) ((amount-50)*1);  
      }
        return points;
    }
}
