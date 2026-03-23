package com.gerenciamento.fornecedores.models;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name = "tb_fornecedores")
public class FornecedorModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "nome_fantasia")
    private String nome;
    @Column(name = "cnpj_fornecedor")
    private String cnpj;
    private String contato;

    public FornecedorModel() {
    }

    public FornecedorModel(Long id, String nome, String cnpj, String contato) {
        this.id = id;
        this.nome = nome;
        this.cnpj = cnpj;
        this.contato = contato;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getContato() {
        return contato;
    }

    public void setContato(String contato) {
        this.contato = contato;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        FornecedorModel that = (FornecedorModel) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}
