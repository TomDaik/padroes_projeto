/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iterator.classededados;

/**
 * @author pedro
 */
public class Piloto {
    //Atributos
    private String codigo;
    private String nome;
    private String pais;
    private String idade;
    private String equipe;
    private String fabricanteMotor;
    private String pontos;
    //Metodos


    public Piloto(String codigo, String nome, String pais, String idade, String equipe, String fabricanteMotor, String pontos) {
        this.codigo = codigo;
        this.nome = nome;
        this.pais = pais;
        this.idade = idade;
        this.equipe = equipe;
        this.fabricanteMotor = fabricanteMotor;
        this.pontos = pontos;
    }

    public Piloto(String str) {
        String[] vetor = str.split(",");
        this.codigo = vetor[0];
        this.nome = vetor[1];
        this.pais = vetor[2];
        this.idade = vetor[3];
        this.equipe = vetor[4];
        this.fabricanteMotor = vetor[5];
        this.pontos = vetor[6];
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getIdade() {
        return idade;
    }

    public void setIdade(String idade) {
        this.idade = idade;
    }

    public String getEquipe() {
        return equipe;
    }

    public void setEquipe(String equipe) {
        this.equipe = equipe;
    }

    public String getFabricanteMotor() {
        return fabricanteMotor;
    }

    public void setFabricanteMotor(String fabricanteMotor) {
        this.fabricanteMotor = fabricanteMotor;
    }

    public String getPontos() {
        return pontos;
    }

    public void setPontos(String pontos) {
        this.pontos = pontos;
    }
}
