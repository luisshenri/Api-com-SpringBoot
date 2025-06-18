package com.solero.solero.repository;


import org.springframework.stereotype.Repository;

@Repository
public class MensagemRepository {
    public String obterMensagem(){
        return "Ola do repositorio";
    }
}
