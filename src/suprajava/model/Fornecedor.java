/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package suprajava.model;

/**
 *
 * @author benicio
 */
public class Fornecedor {
    private String nome;
    private String cnpj;

    // Construtor
    public Fornecedor(String nome, String cnpj){
        setNome(nome);
        setCnpj(cnpj);
    }
    
    // Getters e Setters
    private void setNome(String nome){
        this.nome = nome;
    }

    private String getNome(){
        return this.nome;
    }

    private void setCnpj(String cnpj){
        this.cnpj = cnpj;
    }

    private String getCnpj(){
        return this.cnpj;
    }
}
