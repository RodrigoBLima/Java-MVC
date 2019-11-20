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
public class ControleProduto {

    public Produto buscarPorCodigo(Integer cod) {
        Produto v = new Produto();
        v.setCodigo(cod);
        ProdutoDAO dao = new ProdutoDAO();
        boolean status = dao.buscarProdutos(v);
        if (status) {
            return v;
        } else {
            return null;
        }
    }

    public Produto excluirPorCodigo(Integer cod) {
        Produto v = new Produto();
        v.setCodigo(cod);
        ProdutoDAO dao = new ProdutoDAO();
        boolean status = dao.excluirProdutos(v);
        if (status) {
            return v;
        } else {
            return null;
        }
    }

    public Produto inserirPorCodigo(Integer cod, String nome, Double precoUnit) {
        Produto v = new Produto();
        v.setCodigo(cod);
        v.setNome(nome);
        ProdutoDAO dao = new ProdutoDAO();
        boolean status = dao.inserirProdutos(v);
        if (status) {
            return v;
        } else {
            return null;
        }
    }

    public Produto alterarPorCodigo(Integer cod, String nome, Double precoUnit) {
        Produto v = new Produto();
        v.setCodigo(cod);
        v.setNome(nome);
        ProdutoDAO dao = new ProdutoDAO();
        boolean status = dao.alterarProdutos(v);
        if (status) {
            return v;
        } else {
            return null;
        }
    }
}
