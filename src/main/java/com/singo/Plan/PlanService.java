package com.singo.Plan;

import java.sql.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PlanService {

    @Autowired
    private PlanRepository planRepository;

    //add Day
    public void addPlan(String planType,int planEventId,int planDayId){
        List<PlanModel> modelList = planRepository.getAllPlan(planDayId);
        int planName = modelList.size() + 1;
        planRepository.insertPlan(planName,planType,planEventId,planDayId);
    }

    //get all plan
    public List<PlanModel> getAllPlan(int dayId){
        return planRepository.getAllPlan(dayId);
    }

    //update Plan
    public void changePlan(String planType,int planEventId,int planId){
        planRepository.updatePlan(planType,planEventId,planId);
    }

    //delete Plan
    public void deletePlan(int planId){
        planRepository.deletePlan(planId);
    }
}
