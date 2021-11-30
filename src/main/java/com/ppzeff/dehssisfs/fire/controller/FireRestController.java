package com.ppzeff.dehssisfs.fire.controller;


import com.ppzeff.dehssisfs.fire.model.ExtinguisherModel;
import com.ppzeff.dehssisfs.fire.repository.ExtinguisherRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FireRestController {
    @Autowired
    ExtinguisherRepo extinguisherRepo;

    @GetMapping("/fire/api/allview")
    public Iterable<ExtinguisherModel> allLOTOND() {

        Iterable<ExtinguisherModel> extinguishers = extinguisherRepo.findAll();

        return extinguishers;
    }

}
