package com.EstudandoSpring.henrique.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.EstudandoSpring.henrique.entities.Validations;
import com.EstudandoSpring.henrique.entities.Calculations;

@RestController
public class MathController {

    @Autowired
    private Validations validations;

    @Autowired
    private Calculations calculations;

    @RequestMapping(value = "/sum/{numberOne}/{numberTwo}", method = RequestMethod.GET)
    public Double sum(@PathVariable(value = "numberOne") String numberOne, @PathVariable(value = "numberTwo") String numberTwo) throws Exception {
        validations.isNumeric(numberOne, numberTwo);
        return calculations.sum(validations.convertToDouble(numberOne), validations.convertToDouble(numberTwo));
    }

    @RequestMapping(value = "/subtraction/{numberOne}/{numberTwo}", method = RequestMethod.GET)
    public Double sub(@PathVariable(value = "numberOne") String numberOne, @PathVariable(value = "numberTwo") String numberTwo) throws Exception {
        validations.isNumeric(numberOne, numberTwo);
        return calculations.sub(validations.convertToDouble(numberOne), validations.convertToDouble(numberTwo));
    }

    @RequestMapping(value = "/multiplication/{numberOne}/{numberTwo}", method = RequestMethod.GET)
    public Double mul(@PathVariable(value = "numberOne") String numberOne, @PathVariable(value = "numberTwo") String numberTwo) throws Exception {
        validations.isNumeric(numberOne, numberTwo);
        return calculations.mul(validations.convertToDouble(numberOne), validations.convertToDouble(numberTwo));
    }

    @RequestMapping(value = "/division/{numberOne}/{numberTwo}", method = RequestMethod.GET)
    public Double div(@PathVariable(value = "numberOne") String numberOne, @PathVariable(value = "numberTwo") String numberTwo) throws Exception {
        validations.isNumeric(numberOne, numberTwo);
        return calculations.div(validations.convertToDouble(numberOne), validations.convertToDouble(numberTwo));
    }

    @RequestMapping(value = "/media/{numberOne}/{numberTwo}", method = RequestMethod.GET)
    public Double media(@PathVariable(value = "numberOne") String numberOne, @PathVariable(value = "numberTwo") String numberTwo) throws Exception {
        validations.isNumeric(numberOne, numberTwo);
        return calculations.media(validations.convertToDouble(numberOne), validations.convertToDouble(numberTwo));
    }

    @RequestMapping(value = "/sqrt/{numberOne}", method = RequestMethod.GET)
    public Double sqrt(@PathVariable(value = "numberOne") String numberOne) throws Exception {
        validations.isNumeric(numberOne);
        return calculations.sqrt(validations.convertToDouble(numberOne));
    }

}
