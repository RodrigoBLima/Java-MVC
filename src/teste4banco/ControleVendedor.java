/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teste4banco;

/**
 *
 * @author geraldo.filho
 */
public class ControleVendedor {

    public Vendedor buscarPorCodigo(Integer cod) {
        Vendedor v = new Vendedor();
        v.setCodigo(cod);
        VendedorDAO dao = new VendedorDAO();
        boolean status = dao.buscarVendedor(v);
        if (status) {
            return v;
        } else {
            return null;
        }
    }

    public Vendedor excluirPorCodigo(Integer cod) {
        Vendedor v = new Vendedor();
        v.setCodigo(cod);
        VendedorDAO dao = new VendedorDAO();
        boolean status = dao.excluirVendedor(v);
        if (status) {
            return v;
        } else {
            return null;
        }
    }

    public Vendedor inserirPorCodigo(Integer cod, String nome) {
        Vendedor v = new Vendedor();
        v.setCodigo(cod);
        v.setNome(nome);
        VendedorDAO dao = new VendedorDAO();
        boolean status = dao.inserirVendedor(v);
        if (status) {
            return v;
        } else {
            return null;
        }
    }
    
    public Vendedor alterarPorCodigo(Integer cod, String nome) {
        Vendedor v = new Vendedor();
        v.setCodigo(cod);
        v.setNome(nome);
        VendedorDAO dao = new VendedorDAO();
        boolean status = dao.alterarVendedor(v);
        if (status) {
            return v;
        } else {
            return null;
        }
    }
}
