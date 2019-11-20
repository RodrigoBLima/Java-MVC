/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teste4banco;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author geraldo.filho
 */
public class ConexaoFab {
    public Connection getCoConexao() {
      Connection con = null;
      try {
        Class.forName("com.mysql.jdbc.Driver");
        con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/bancoVendas", "root", "root");
      } catch(Exception e) {
        System.out.println(e.getMessage());
      }
      return con;
    }
}
