package NotaDoctor.NotADoctor.controllers;

import NotaDoctor.NotADoctor.models.Symptoms;
import NotaDoctor.NotADoctor.repositories.SymptomsRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Optional;

@RestController
public class SymptomsController {
    @Resource
    private SymptomsRepository symptomsRepo;

    @RequestMapping({"/symptoms"})
    public String displaySymptoms(Model model){
        model.addAttribute("symptoms", symptomsRepo.findAll());
        return "symptomsTemplate";
    }

    @GetMapping("/symptoms/{id}")
    public String displaySingleSymptom(@PathVariable Long id, Model model){
        Optional<Symptoms> retrievedSymptoms = symptomsRepo.findSymptomsById(id);
        model.addAttribute("symptoms", retrievedSymptoms);
        return "symptomTemplate";
    }

}
