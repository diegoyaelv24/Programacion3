package controllers;

import models.User;
import models.UserModel;
import views.UsersView;

import javax.swing.*;
import java.util.ArrayList;

public class UsersController {

    private UsersView view;
    private UserModel model;

    public UsersController() {

        view = new UsersView();

        model = new UserModel();

        cargarUsuarios();

        view.add_button.addActionListener(e -> agregarUsuario());
    }

    public void cargarUsuarios() {

        view.model.setRowCount(0);

        ArrayList<User> listaUsuarios = model.obtenerUsuarios();

        for(User user : listaUsuarios){

            view.model.addRow(new Object[]{
                    user.getId(),
                    user.getUsername(),
                    user.getPassword(),
                    user.getNombreCompleto()
            });
        }
    }

    public void agregarUsuario() {

        String username = JOptionPane.showInputDialog("Username");

        String password = JOptionPane.showInputDialog("Password");

        String nombre = JOptionPane.showInputDialog("Nombre completo");

        if(username == null || password == null || nombre == null){
            return;
        }

        boolean agregado = model.agregarUsuario(username,password,nombre);

        if(agregado){

            JOptionPane.showMessageDialog(view,"Usuario agregado");

            cargarUsuarios();

        } else {

            JOptionPane.showMessageDialog(view,"Error");
        }
    }
}