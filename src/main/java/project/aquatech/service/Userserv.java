package project.aquatech.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import project.aquatech.Form1;
import project.aquatech.Repo1;

@Service
public class Userserv implements Implserv{
    @Autowired
  Repo1 userRepo;
    @Override
       public Optional<Form1> getUserById(long id) {
        return userRepo.findById(id);
    }
    @Override
    public void updateUser(long id, Form1 user) {
        userRepo.save(user);
    }
    @Override
    public void deleteUser(long id) {
        userRepo.deleteById(id);
    }
    @Override
    public List<Form1> getAll() {
        return (List<Form1>) userRepo.findAll();
    }
    @Override
    public void addUser(Form1 user) {
        userRepo.save(user);
    }
}
