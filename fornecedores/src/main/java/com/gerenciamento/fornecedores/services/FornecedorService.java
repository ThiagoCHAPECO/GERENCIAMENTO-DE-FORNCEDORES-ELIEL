package com.gerenciamento.fornecedores.services;

import com.gerenciamento.fornecedores.models.FornecedorModel;
import com.gerenciamento.fornecedores.repositories.FornecedorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FornecedorService {

    @Autowired
    private FornecedorRepository fornecedorRepository;

    public List<FornecedorModel> findAll(){
        return fornecedorRepository.findAll();
    }

    public Optional<FornecedorModel> findById(Long id){
        return fornecedorRepository.findById(id);
    }

    public void delete(Long id){
        fornecedorRepository.deleteById(id);
    }

    public FornecedorModel save(FornecedorModel pedidoModel){
        return fornecedorRepository.save(pedidoModel);
    }
}
