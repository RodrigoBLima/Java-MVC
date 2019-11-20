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
public class Produto {
   private int codigo;
    private String nome;  
    private Double precoUnit; 

    public Double getPrecoUnit() {
        return precoUnit;
    }

    public void setPrecoUnit(Double precoUnit) {
        this.precoUnit = precoUnit;
    }
    
     public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
