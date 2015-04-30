package br.com.opinion.model;

import javax.xml.bind.annotation.XmlRootElement;
import java.util.Date;

/**
 * Created by arcosta on 30/04/15.
 */

@XmlRootElement
public class Curso {

    private String nome;
    private String descricao;
    private Date dataCriacao;

    public Curso(){ };

    public Curso(String nome, String descricao, Date dataCriacao) {
        this.nome = nome;
        this.descricao = descricao;
        this.dataCriacao = dataCriacao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Date getDataCriacao() {
        return dataCriacao;
    }

    public void setDataCriacao(Date dataCriacao) {
        this.dataCriacao = dataCriacao;
    }
}
