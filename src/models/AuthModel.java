package models;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class AuthModel {

    public boolean validarLogin(String email, String password) {

        String sql = "SELECT * FROM usuarios WHERE username = ? AND password = ?";

        try (Connection conn = Conexion.conectar();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            System.out.println("SELECT * FROM usuarios WHERE username = '" 
                + email + "' AND password = '" + password + "'");

            stmt.setString(1, email);
            stmt.setString(2, password);

            ResultSet rs = stmt.executeQuery();

            return rs.next();

        } catch (Exception e) {
            System.out.println("Error login: " + e.getMessage());
            return false;
        }
    }
}