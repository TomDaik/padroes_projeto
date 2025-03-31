/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package singleton;

import java.util.ArrayList;

/**
 *
 * @author pedro
 */
public class Caderno {

    private ArrayList<Anotacao> anotacoes = new ArrayList();

    private static Caderno cadernoUnico = null;

    private Caderno() {
    }

    public static Caderno getInstanciaDoCaderno() {
        if (cadernoUnico == null) {
            cadernoUnico = new Caderno();
        }
        return cadernoUnico;
    }

    public void adicionarAnotacao(String descricao) {
        Anotacao novaAnotacao = new Anotacao(descricao, this);
        anotacoes.add(novaAnotacao);
    }

    public ArrayList<Anotacao> getAnotacoes() {
        return anotacoes;
    }

}