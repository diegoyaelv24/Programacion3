package models;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class UserModel {

    public ArrayList<User> obtenerUsuarios() {

        ArrayList<User> listaUsuarios = new ArrayList<>();

        String sql = "SELECT * FROM usuarios";

        try (
                Connection conn = Conexion.conectar();
                PreparedStatement stmt = conn.prepareStatement(sql);
                ResultSet rs = stmt.executeQuery()
        ) {

            while(rs.next()){

                User user = new User(
                        rs.getInt("id"),
                        rs.getString("username"),
                        rs.getString("password"),
                        rs.getString("nombre_completo")
                );

                listaUsuarios.add(user);
            }

        } catch (Exception e) {

            System.out.println(e.getMessage());
        }

        return listaUsuarios;
    }

    public boolean agregarUsuario(String username, String password, String nombreCompleto) {

        String sql = "INSERT INTO usuarios(username,password,nombre_completo) VALUES(?,?,?)";

        try (
                Connection conn = Conexion.conectar();
                PreparedStatement stmt = conn.prepareStatement(sql)
        ) {

            stmt.setString(1, username);
            stmt.setString(2, password);
            stmt.setString(3, nombreCompleto);

            stmt.executeUpdate();

            return true;

        } catch (Exception e) {

            System.out.println(e.getMessage());

            return false;
        }
    }
}