package NotaDoctor.NotADoctor.controllers;

import NotaDoctor.NotADoctor.models.User;
import NotaDoctor.NotADoctor.repositories.UserRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class UserController {

    @Resource
    private UserRepository userRepo;

//    @GetMapping("/user/{id}")



}
