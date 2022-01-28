package com.ppzeff.dehssisfs.fire.controller;

import com.ppzeff.dehssisfs.LOTO.models.WorkSitesModel;
import com.ppzeff.dehssisfs.LOTO.repository.WorkSitesRepository;
import com.ppzeff.dehssisfs.fire.model.AppearanceModel;
import com.ppzeff.dehssisfs.fire.model.CheckStringModel;
import com.ppzeff.dehssisfs.fire.model.ExtinguisherModel;
import com.ppzeff.dehssisfs.fire.model.StateOfNodesModel;
import com.ppzeff.dehssisfs.fire.repository.AppearanceRepo;
import com.ppzeff.dehssisfs.fire.repository.CheckStringRepo;
import com.ppzeff.dehssisfs.fire.repository.ExtinguisherRepo;
import com.ppzeff.dehssisfs.fire.repository.StateOfNodesRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RequestMapping("/fire/")
@Controller
public class FireController {

    @Autowired
    ExtinguisherRepo extinguisherRepo;

    @Autowired
    CheckStringRepo checkStringRepo;

    @GetMapping("/addextinguisher")
    public String fireHome(Model model) {
        Iterable<WorkSitesModel> workSites = workSitesRepository.findAll();
        ExtinguisherModel extinguisher = new ExtinguisherModel();
        model.addAttribute("extinguisher", extinguisher);
        model.addAttribute("workSites", workSites);
        model.addAttribute("title", "Раздел FIRE");
        return "fire/add_extinguisher";
    }

    @GetMapping("/extinguishers")
    public String extinguishers(Model model) {

        Iterable<ExtinguisherModel> extinguishers = extinguisherRepo.findAll();
        model.addAttribute("extinguishers", extinguishers);
        model.addAttribute("title", "Раздел FIRE");
        return "fire/extinguishers";
    }

    @PostMapping("/addextinguisher")
    public String addextinguisher(Model model
            , @ModelAttribute("extinguisher") ExtinguisherModel extinguisherModel
    ) {
        extinguisherRepo.save(extinguisherModel);

        model.addAttribute("title", "Раздел FIRE");
        model.addAttribute("extinguisher", extinguisherModel);
        return "redirect:/fire/extinguishers/" + extinguisherModel.getId();
    }

    @GetMapping("/extinguishers/{id}")
    public String viewExtinguisher(@PathVariable("id") Long id, Model model) {
        Optional<ExtinguisherModel> e = extinguisherRepo.findById(id);
//        Optional<ExtinguisherModel> e = extinguisherRepo.findByNumber(number);

        model.addAttribute("title", "Раздел FIRE");
        System.out.println(e.get().getListCheckString());
        model.addAttribute("extinguisher", e.get());
        CheckStringModel checkString = new CheckStringModel();


        Iterable<AppearanceModel> appearance = appearanceRepo.findAll();
        Iterable<StateOfNodesModel> stateOfNodes = stateOfNodesRepo.findAll();

        model.addAttribute("appearance", appearance);
        model.addAttribute("stateOfNodes", stateOfNodes);
        model.addAttribute("checkstring", checkString);
        return "fire/view_extinguisher";
    }

    @PostMapping("/{id}/addcheckstring")
    public String addcheckstring(@PathVariable("id") Long id, @ModelAttribute("checkstring") CheckStringModel checkString) {
        System.out.println("{id}/addcheckstring");
        Optional<ExtinguisherModel> optional = extinguisherRepo.findById(id);
        checkStringRepo.save(checkString);
        ExtinguisherModel extinguisher = optional.get();
        extinguisher.addcheckstring(checkString);
        extinguisherRepo.save(extinguisher);
        return "redirect:/fire/extinguishers/" + extinguisher.getId();
    }

    @Autowired
    AppearanceRepo appearanceRepo;

    @Autowired
    StateOfNodesRepo stateOfNodesRepo;

    @Autowired
    WorkSitesRepository workSitesRepository;

    @ResponseBody
    @GetMapping("/addtype")
    public String addtype() {

        System.out.println("add type");
        AppearanceModel ap = new AppearanceModel();
        ap.setType("удовлетворитель");
        appearanceRepo.save(new AppearanceModel("удовлетворитель"));
        appearanceRepo.save(new AppearanceModel("не удовлетварительно"));

        stateOfNodesRepo.save(new StateOfNodesModel("удовлетворитель"));
        stateOfNodesRepo.save(new StateOfNodesModel("не удовлетварительно"));

        return "Ok";
    }

    @ResponseBody
    @GetMapping("/test")
    public String test(){
        System.out.println("TEST!!!");
        return "Ok";
    }


}


































