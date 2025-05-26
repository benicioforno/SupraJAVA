/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package suprajava.model;

/**
 *
 * @author benicio
 */
public enum TipoUnidadeMedida {
    INTEIRA("Inteira."),
    FRACIONARIA("Fracionária."),
    TEMPO("Tempo.");

    private final String descricao;

    // Construtor para a linguagem java
    private TipoUnidadeMedida(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return this.descricao;
    }
}
