/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teste4banco;

/**
 *
 * @author 0781911047
 */
public class ControleCliente {
  public Cliente buscarPorCodigo(Integer cod) {
        Cliente v = new Cliente();
        v.setCodigo(cod);
        ClienteDAO dao = new ClienteDAO();
        boolean status = dao.buscarCliente(v);
        if (status) {
            return v;
        } else {
            return null;
        }
    }

    public Cliente excluirPorCodigo(Integer cod) {
        Cliente v = new Cliente();
        v.setCodigo(cod);
        ClienteDAO dao = new ClienteDAO();
        boolean status = dao.excluirCliente(v);
        if (status) {
            return v;
        } else {
            return null;
        }
    }

    public Cliente inserirPorCodigo(Integer cod, String nome) {
        Cliente v = new Cliente();
        v.setCodigo(cod);
        v.setNome(nome);
       ClienteDAO dao = new ClienteDAO();
        boolean status = dao.inserirCliente(v);
        if (status) {
            return v;
        } else {
            return null;
        }
    }
    
    public Cliente alterarPorCodigo(Integer cod, String nome) {
        Cliente v = new Cliente();
        v.setCodigo(cod);
        v.setNome(nome);
       ClienteDAO dao = new ClienteDAO();
        boolean status = dao.alterarCliente(v);
        if (status) {
            return v;
        } else {
            return null;
        }
    }
}
