package com.ppzeff.dehssisfs.LOTO.controllers;

import com.ppzeff.dehssisfs.LOTO.models.LOTONdModel;
import com.ppzeff.dehssisfs.LOTO.repository.LOTONdRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class MyRestController {
    @Autowired
    LOTONdRepository lotoNdRepository;

    @GetMapping("/workpermit/loto/api/allview")
    public Iterable<LOTONdModel> allLOTOND(Model model) {

        Iterable<LOTONdModel> lotoNds = lotoNdRepository.findAll();

        return lotoNds;
    }

}
