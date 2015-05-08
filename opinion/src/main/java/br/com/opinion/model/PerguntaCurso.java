package br.com.opinion.model;

import javax.persistence.*;

/**
 * Created by arcosta on 01/05/15.
 */
@Entity
public class PerguntaCurso {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String resposta;

}
