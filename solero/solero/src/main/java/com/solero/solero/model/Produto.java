package com.solero.solero.model;

import jakarta.persistence.*;

@Table(name = "produtos")
@Entity
public class Produto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String nome;
    private Double preco;

    public Produto(){}

    public Produto(String nome, Double preco){
        this.nome = nome;
        this.preco = preco;
    }

    public long getId(){
        return id;
    }

    public String getNome(){
        return nome;
    }

    public Double getPreco(){
        return preco;
    }

    public void setId(Long id){
        this.id = id;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setPreco(Double preco){
        this.preco = preco;
    }


}
