package project.aquatech.service;

import java.util.List;
import java.util.Optional;

import project.aquatech.Form1;

public interface Implserv {
        List<Form1> getAll();
        void deleteUser(long id);
        void addUser(Form1 user);
        void updateUser(long id, Form1 user);
        Optional<Form1> getUserById(long id);
}
