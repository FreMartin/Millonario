package com.example.juego.modelo;

import java.sql.ResultSet;
import java.sql.SQLException;

public class UserDAO {

    private Conexion con = null;

    public UserDAO() {
        this.con = new Conexion();
    }

    public int consulta(User user){
        String sql= String.format("select *  from usuario where usu_nombre = '%s' and usu_clave = '%s';", user.getNombre(), user.getClave());
        int r = 0;
        ResultSet rs = this.con.consultar(sql);
        try {
            if (rs.next()) {
                return r = rs.getInt("id_usuario");
            }
        } catch (SQLException e){
            e.printStackTrace();
        }
        return r;
    }

}
