package com.EstudandoSpring.henrique;

public class HelloWorld {

    private final Long id;
    private final String nome;

    public HelloWorld(Long id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }
}
