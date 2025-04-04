/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iterator.persistencia;

import iterator.classededados.Piloto;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.*;

/**
 * @author pedro
 */
public class PilotoPersistencia {
    //Atributos
    private final String nomeDoArquivo;

    //Metodos
    public PilotoPersistencia(String nome) {
        nomeDoArquivo = nome;
    }

    public Iterator listagemDePilotosLinkedList() throws Exception {
        try {
            LinkedList<Piloto> lista = new LinkedList<>();
            FileReader fr = new FileReader(nomeDoArquivo);
            BufferedReader br = new BufferedReader(fr);
            String linha = "";
            while ((linha = br.readLine()) != null) {
                Piloto aux = new Piloto(linha);  // Aqui assume-se que o Piloto tem um construtor que recebe uma String
                lista.add(aux);  // Adiciona à LinkedList
            }
            br.close();
            return lista.iterator();  // Retorna um Iterator da LinkedList
        } catch (Exception erro) {
            throw erro;
        }
    }

    public Iterator listagemDePilotosTreeSet() throws Exception {
        try {
            TreeSet<Piloto> conjuntoOrdenado = new TreeSet<>(new Comparator<Piloto>() {
                public int compare(Piloto p1, Piloto p2) {
                    // Compara os pilotos pelo código, retornando em ordem alfabética
                    return p1.getNome().compareTo(p2.getNome());
                }
            });
            FileReader fr = new FileReader(nomeDoArquivo);
            BufferedReader br = new BufferedReader(fr);
            String linha = "";
            while ((linha = br.readLine()) != null) {
                Piloto aux = new Piloto(linha);
                conjuntoOrdenado.add(aux);  // Adiciona ao TreeSet
            }
            br.close();
            return conjuntoOrdenado.iterator();  // Retorna um Iterator do TreeSet
        } catch (Exception erro) {
            throw erro;
        }
    }

    public Iterator listagemDePilotosHashSet() throws Exception {
        try {
            HashSet<Piloto> conjuntoUnico = new HashSet<>();
            FileReader fr = new FileReader(nomeDoArquivo);
            BufferedReader br = new BufferedReader(fr);
            String linha = "";
            while ((linha = br.readLine()) != null) {
                Piloto aux = new Piloto(linha);
                conjuntoUnico.add(aux);  // Adiciona ao HashSet, mantendo unicidade
            }
            br.close();
            return conjuntoUnico.iterator();  // Retorna o Iterator do HashSet
        } catch (Exception erro) {
            throw erro;
        }
    }

    public Iterator listagemDePilotosPriorityQueue() throws Exception {
        try {
            PriorityQueue<Piloto> filaPrioritaria = new PriorityQueue<>(new Comparator<Piloto>() {
                public int compare(Piloto p1, Piloto p2) {
                    return p1.getCodigo().compareTo(p2.getCodigo()); // Pilotos com mais pontos têm maior prioridade
                }
            });
            FileReader fr = new FileReader(nomeDoArquivo);
            BufferedReader br = new BufferedReader(fr);
            String linha = "";
            while ((linha = br.readLine()) != null) {
                Piloto aux = new Piloto(linha);
                filaPrioritaria.add(aux);  // Adiciona à PriorityQueue
            }
            br.close();
            return filaPrioritaria.iterator();  // Retorna o Iterator da PriorityQueue
        } catch (Exception erro) {
            throw erro;
        }
    }

    public Iterator listagemDePilotosQueue() throws Exception {
        try {
            Queue<Piloto> fila = new LinkedList<>();
            FileReader fr = new FileReader(nomeDoArquivo);
            BufferedReader br = new BufferedReader(fr);
            String linha = "";
            while ((linha = br.readLine()) != null) {
                Piloto aux = new Piloto(linha);
                fila.add(aux);  // Adiciona à fila (LinkedList implementando Queue)
            }
            br.close();
            return fila.iterator();  // Retorna o Iterator da fila
        } catch (Exception erro) {
            throw erro;
        }
    }

}
