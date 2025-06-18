package com.solero.solero.service;


import com.solero.solero.excepitions.RecursoNaoEncontradoExcepition;
import com.solero.solero.model.Produto;
import com.solero.solero.repository.ProdutoRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProdutoService {
    private final ProdutoRepository produtoRepository;

    public ProdutoService(ProdutoRepository produtoRepository){
        this.produtoRepository = produtoRepository;
    }

    public List<Produto> listarProduto(){
        return produtoRepository.findAll();
    }

    public Produto buscarPorId(Long id){
        return produtoRepository.findById(id)
                .orElseThrow(() -> new RecursoNaoEncontradoExcepition("Produto com ID "+id+" não encontrado"));
    }

    public Produto salvarProduto(Produto produto){
        return produtoRepository.save(produto);
    }

    public void deletarProduto(Long id){
        if (!produtoRepository.existsById(id)) {
            throw new RecursoNaoEncontradoExcepition("Produto com ID "+id+" não encontrado");
        }

        produtoRepository.deleteById(id);
    }
}
