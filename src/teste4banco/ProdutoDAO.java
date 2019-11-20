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
 * @author 0781911047
 */
public class ProdutoDAO {

    boolean resp = false;

    public boolean buscarProdutos(Produto v) {

        try {
            ConexaoFab cf = new ConexaoFab();
            Connection con = cf.getCoConexao();
            PreparedStatement ps = con.prepareStatement("select nome, precoUnit from produtos where codigo = ?");
            ps.setInt(1, v.getCodigo());
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                String nome = rs.getString(1);
                v.setNome(nome);

                Double precoUnit = rs.getDouble(2);
                v.setPrecoUnit(precoUnit);
                resp = true;
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return resp;
    }

    public boolean excluirProdutos(Produto v) {

        try {
            ConexaoFab cf = new ConexaoFab();
            Connection con = cf.getCoConexao();
            PreparedStatement ps = con.prepareStatement("delete from produtos where codigo=?");
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

    public boolean alterarProdutos(Produto v) {
        try {
            Connection con = new ConexaoFab().getCoConexao();
            PreparedStatement ps = con.prepareStatement("update produtos set nome = ?, set precoUnit = ? where codigo=?");
            ps.setString(1, v.getNome());
            ps.setDouble(2, v.getPrecoUnit());
            ps.setInt(3, v.getCodigo());

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

    public boolean inserirProdutos(Produto v) {
        try {
            Connection con = new ConexaoFab().getCoConexao();
            PreparedStatement ps = con.prepareStatement("insert into produtos(codigo,nome,precoUnit) values (?, ?, ?)");
            ps.setString(2, v.getNome());

            ps.setInt(1, v.getCodigo());
            ps.setDouble(3, v.getPrecoUnit());

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
