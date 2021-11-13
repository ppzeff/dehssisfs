package com.ppzeff.dehssisfs.tinkoff.service;


import com.ppzeff.dehssisfs.tinkoff.model.Model;
import com.ppzeff.dehssisfs.tinkoff.repo.ModelRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class InitDAOImp implements InitDAO {

    @Autowired
    ModelRepo modelRepo;


    public Map<Integer, Model> initMap() {
//        System.out.println("initMap:" + System.currentTimeMillis());
        Map<Integer, Model> modelMap = new HashMap<>();
        List<Integer> listCode = modelRepo.findAllCode();
        for (Integer elCode : listCode) {
            List<Model> modelList = modelRepo.findLastDataByCode(elCode);
            for (Model elModel : modelList) {
                modelMap.put(elModel.getCode(), elModel);
            }
        }
        return modelMap;
    }
}
