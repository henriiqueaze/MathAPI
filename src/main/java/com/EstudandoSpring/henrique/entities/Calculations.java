package com.EstudandoSpring.henrique.entities;

import org.springframework.stereotype.Service;

@Service
public class Calculations {

    public Calculations() {}

    public Double sum(Double numberOne, Double numberTwo) {
        return numberOne + numberTwo;
    }

    public Double sub(Double numberOne, Double numberTwo) {
        return numberOne - numberTwo;
    }

    public Double mul(Double numberOne, Double numberTwo) {
        return numberOne * numberTwo;
    }

    public Double div(Double numberOne, Double numberTwo) {
        return numberOne / numberTwo;
    }

    public Double media(Double numberOne, Double numberTwo) {
        return (numberOne + numberTwo) / 2;
    }

    public Double sqrt(Double number) {
        return Math.sqrt(number);
    }
}
