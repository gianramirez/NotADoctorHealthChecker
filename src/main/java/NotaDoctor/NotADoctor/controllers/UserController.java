package NotaDoctor.NotADoctor.controllers;

import NotaDoctor.NotADoctor.repositories.UserRepository;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class UserController {

    @Resource
    private UserRepository userRepo;


    @GetMapping("/user/{id}")
    public String displayUser(Model model){
        model.addAttribute("users", userRepo.findAll());
        return "usersTemplate";
    }




}
