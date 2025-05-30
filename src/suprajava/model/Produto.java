/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package suprajava.model;

import suprajava.model.UnidadeMedida;

/**
 *
 * @author benicio
 */
public class Produto {
    private String nome;
    private UnidadeMedida unidadeMedida;

    // Construtor
    public Produto(String nome, UnidadeMedida unidadeMedida) {
        setNome(nome);
        setUnidadeMedida(unidadeMedida);
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public UnidadeMedida getUnidadeMedida() {
        return unidadeMedida;
    }

    public void setUnidadeMedida(UnidadeMedida unidadeMedida) {
        if (this.getUnidadeMedida() == null) {
            this.unidadeMedida = unidadeMedida;
        } else if (this.getUnidadeMedida() != null)
            throw new IllegalArgumentException("O tipo do produto não pode ser trocado.");
    }

    public String toString() {
        return "Nome: " + this.getNome() + ";\n\nUnidade de medida:\n" + getUnidadeMedida();
    }
}
