/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package suprajava.model;

import suprajava.model.TipoUnidadeMedida;

/**
 *
 * @author benicio
 */
public class UnidadeMedida {
    private String nome;
    private String sigla;
    private TipoUnidadeMedida tipoUnidadeMedida; // Composição

    // Construtor
    public UnidadeMedida(String nome, String sigla, TipoUnidadeMedida tipoUnidadeMedida) {
        setNome(nome);
        setSigla(sigla);
        setTipoUnidadeMedida(tipoUnidadeMedida);
    }

    // Getters e Setters
    private String getNome() {
        return nome;
    }

    private String getSigla() {
        return sigla;
    }

    private void setNome(String nome) {
        this.nome = nome;
    }

    private void setSigla(String sigla) {
        this.sigla = sigla;
    }

    private void setTipoUnidadeMedida(TipoUnidadeMedida tipoUnidadeMedida) {
        if (this.getTipoUnidadeMedida() == null)
            this.tipoUnidadeMedida = tipoUnidadeMedida;
        else if (this.getTipoUnidadeMedida() != null)
            throw new IllegalArgumentException("O tipo do produto não pode ser trocado.");
    }

    private TipoUnidadeMedida getTipoUnidadeMedida() {
        return this.tipoUnidadeMedida;
    }

    public String toString() {
        return "Nome: " + this.getNome() + ";\nSigla: " + getSigla() + ";\nTipo de unidade de medida: "
                + this.getTipoUnidadeMedida().getDescricao();
    }
}
