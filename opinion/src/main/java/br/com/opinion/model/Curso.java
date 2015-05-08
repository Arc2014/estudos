package br.com.opinion.model;

import javax.persistence.*;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.Collection;
import java.util.Date;

/**
 * Created by arcosta on 30/04/15.
 */

@XmlRootElement
@Entity
@Table(name = "tb_curso")
public class Curso {

    public Curso() {
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String nome;

    private String descricao;

    private Date dataCriacao;

    public Curso(String nome, String descricao, Date dataCriacao) {
        this.nome = nome;
        this.descricao = descricao;
        this.dataCriacao = dataCriacao;
    }


}
