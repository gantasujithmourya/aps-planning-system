package com.aps;

import org.springframework.stereotype.Service;

@Service
public class PlanningService {

    public String runPlanningCycle() {
        System.out.println("Running planning logic...");
        return "Planning completed";
    }
}
