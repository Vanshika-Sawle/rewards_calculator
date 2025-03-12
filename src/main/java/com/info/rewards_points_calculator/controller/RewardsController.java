package com.info.rewards_points_calculator.controller;

import com.info.rewards_points_calculator.model.Transaction;
import com.info.rewards_points_calculator.dto.RewardsResponse;
import com.info.rewards_points_calculator.service.RewardsService;
import org.springframework.web.bind.annotation.*;
import java.time.LocalDate;

import java.util.List;

@RestController
@RequestMapping("/api/rewards")
public class RewardsController {

    private final RewardsService rewardsService;

    public RewardsController(RewardsService rewardsService) {
        this.rewardsService = rewardsService;
    }

    @PostMapping("/calculate")
    public RewardsResponse calculateRewards(@RequestBody List<Transaction> transactions) {
        return rewardsService.calculateRewards(transactions);
    }
    
//    @GetMapping("/sample")
//    public RewardsResponse getSampleRewards() {
//    List<Transaction> sampleTransactions = List.of(
//        new Transaction("Vanshika", 120, LocalDate.of(2025, 1, 15)),
//        new Transaction("Vanshika", 75, LocalDate.of(2025, 2, 10)),
//        new Transaction("Vanshika", 150, LocalDate.of(2025, 3, 5)),
//        new Transaction("Vanshika", 50, LocalDate.of(2025, 3, 15)),
//        new Transaction("Vanshika", 130, LocalDate.of(2025, 3, 16))
//    );
//
//    return rewardsService.calculateRewards(sampleTransactions);
//    }
//    
    
}
