package project.aquatech;

import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import project.aquatech.service.Userserv;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.beans.factory.annotation.Autowired;

@RestController 
public class MainController {
 @Autowired
  Repo1 userRepo;
  @Autowired
  Userserv userServ;
  @GetMapping("/all")
  public List<Form1> getByCategory() {
    return (ArrayList<Form1>) userRepo.findAll();
  }
  @PostMapping("/insert")
  public String insertUser(@RequestBody Form1 user) {
    userRepo.save(user);
    return "Success";
  }
  @GetMapping("display/user{id}")
  public Optional<Form1> getById(@PathVariable long id) {
    Optional<Form1> user = userServ.getUserById(id);
    return user;
  }
  @PutMapping("/update/user{id}")
  public String updateUser(@PathVariable long id, @RequestBody Form1 user) {
    user.setId(id);
    userServ.updateUser(id, user);
    return "Updated";
  }
  @DeleteMapping("/delete/user{id}")
  public String deleteUser(@PathVariable long id) {
    userServ.deleteUser(id);
    return "deleted";
  }}