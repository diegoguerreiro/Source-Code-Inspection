package br.calebe.ticketmachine.core;

/**
 *
 * @author Diego Araujo
 */
public class PapelMoeda {

    protected int valor = 0;
    protected int quantidade = 0;

    public PapelMoeda(int valor, int quantidade) {
        this.valor = valor;
        this.quantidade = quantidade;
    }

    public int getValor() {
        return valor;
    }

    public int getQuantidade() {
        return quantidade;
    }
}
