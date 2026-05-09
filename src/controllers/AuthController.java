package controllers;

import views.AuthView;
import models.AuthModel;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class AuthController {

    private AuthView view;
    private AuthModel model;

    public AuthController() {

        model = new AuthModel();
        view = new AuthView();

        view.access_btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                login();
            }
        });
    }

    private void login() {

        String email = view.email_input.getText().trim();
        String password = view.password_input.getText().trim();

        boolean valid = true;

        if(email.equals("")) {
            view.email_input.setBorder(BorderFactory.createLineBorder(Color.red,3));
            valid = false;
        } else {
            view.email_input.setBorder(BorderFactory.createLineBorder(Color.green,3));
        }

        if(password.equals("") || password.length() < 6 || password.contains(" ")) {
            view.password_input.setBorder(BorderFactory.createLineBorder(Color.red,3));
            valid = false;
        } else {
            view.password_input.setBorder(BorderFactory.createLineBorder(Color.green,3));
        }

        if(valid){

            if(model.validarLogin(email, password)){

                JOptionPane.showMessageDialog(view,"Acceso correcto");

                view.dispose();

                new UsersController();

            } else {

                JOptionPane.showMessageDialog(view,"Error en credenciales");
            }
        }
    }
}