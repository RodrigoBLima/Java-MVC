/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teste4banco;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author geraldo.filho
 */
public class VendedorDAO {

    boolean resp = false;

    public boolean buscarVendedor(Vendedor v) {

        try {
            ConexaoFab cf = new ConexaoFab();
            Connection con = cf.getCoConexao();
            PreparedStatement ps = con.prepareStatement("select nome from vendedores where codigo = ?");
            ps.setInt(1, v.getCodigo());
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                String nome = rs.getString(1);
                v.setNome(nome);
                resp = true;
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return resp;
    }

    public boolean excluirVendedor(Vendedor v) {

        try {
            ConexaoFab cf = new ConexaoFab();
            Connection con = cf.getCoConexao();
            PreparedStatement ps = con.prepareStatement("delete from vendedores where codigo=?");
            ps.setInt(1, v.getCodigo());
            int rs = ps.executeUpdate();

            if (rs == 1) {
                resp = true;
            }
            con.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return resp;

    }

    public boolean alterarVendedor(Vendedor v) {
        try {
            Connection con = new ConexaoFab().getCoConexao();
            PreparedStatement ps = con.prepareStatement("update vendedores set nome = ? where codigo=?");
            ps.setString(1, v.getNome());
            ps.setInt(2, v.getCodigo());

            int rs = ps.executeUpdate();
            if (rs == 1) {
                resp = true;
            } 

            con.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
        return resp;

    }

    public boolean inserirVendedor(Vendedor v) {
       try {
            Connection con = new ConexaoFab().getCoConexao();
            PreparedStatement ps = con.prepareStatement("insert into vendedores(codigo,nome) values (?, ?)");
           ps.setString(2, v.getNome());

            ps.setInt(1, v.getCodigo());        
            int rs = ps.executeUpdate();
            if (rs == 1) {
                resp = true;
            } 

            con.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
       return resp;
    }

}
