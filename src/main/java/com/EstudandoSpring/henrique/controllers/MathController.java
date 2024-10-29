package com.EstudandoSpring.henrique.controllers;

import com.EstudandoSpring.henrique.Exceptions.UnsuportedMathOperationException;
import jakarta.websocket.server.PathParam;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MathController {

    @RequestMapping(value = "/sum/{numberOne}/{numberTwo}", method = RequestMethod.GET)
    public Double sum(@PathVariable(value = "numberOne") String numberOne, @PathVariable(value = "numberTwo") String numberTwo) throws Exception {
        if (!isNumeric(numberOne) || !isNumeric(numberTwo)) {
            throw new UnsuportedMathOperationException("Please set a numeric value!");
        }
        return convertToDouble(numberOne) + convertToDouble(numberTwo);
    }

    @RequestMapping("sub/{numberOne}/{numberTwo}")
    public Double sub(@PathVariable(value = "numberOne") String numberOne, @PathVariable(value = "numberTwo") String numberTwo) throws Exception {
        if(!isNumeric(numberOne) || !isNumeric(numberTwo)) {
            throw new UnsuportedMathOperationException("Please set a numeric value!");
        }
        return convertToDouble(numberOne) - convertToDouble(numberTwo);
    }

    @RequestMapping("mul/{numberOne}/{numberTwo}")
    public Double mul(@PathVariable(value = "numberOne") String numberOne, @PathVariable(value = "numberTwo") String numberTwo) throws Exception {
        if (isNumeric(numberOne) || isNumeric(numberTwo)) {
            throw new UnsuportedMathOperationException("Please set a numeric value!");
        }
        return convertToDouble(numberOne) * convertToDouble(numberTwo);
    }

    @RequestMapping("div/{numberOne}/{numberTwo}")
    public Double div(@PathVariable(value = "numberOne") String numberOne, @PathVariable(value = "numberTwo") String numberTwo) throws Exception {
        if (!isNumeric(numberOne) || !isNumeric(numberTwo)) {
            throw new UnsuportedMathOperationException("Please set a numeric value!");
        }
       return convertToDouble(numberOne) / convertToDouble(numberTwo);
    }

    @RequestMapping("media/{numberOne}/{numberTwo}")
    public Double media(@PathParam(value = "numberOne") String numberOne, @PathVariable(value = "numberTwo") String numberTwo) throws Exception {
        if (!isNumeric(numberOne) || !isNumeric(numberTwo)) {
            throw new UnsuportedMathOperationException("Please set a numeric value!");
        }
        return (convertToDouble(numberOne) + convertToDouble(numberTwo)) / 2;
    }

    @RequestMapping("sqrt/{numberOne}/{numberTwo}")
    public String sqrt(@PathVariable(value = "numberOne") String numberOne, @PathVariable(value = "numberTwo") String numberTwo) throws Exception {
        if (!isNumeric(numberOne) || !isNumeric(numberTwo)) {
            throw new UnsuportedMathOperationException("Please set a numeric value!");
        }
        return "Number One:" + Math.sqrt(convertToDouble(numberOne)) + "\nNumber Two: " + Math.sqrt(convertToDouble(numberTwo));
    }

    private Double convertToDouble(String strNumber) throws Exception {
        if (strNumber == null) {
            throw new Exception();
        }
        String number = strNumber.replaceAll(",", ".");
        if (isNumeric(number)) return Double.parseDouble(number);
        return 0D;
    }

    private boolean isNumeric(String strNumber) throws Exception {
        if (strNumber == null) {
            throw new Exception();
        }
        String number = strNumber.replaceAll(",", ".");
        return number.matches("[-+]?[0-9]*\\.?[0-9]+");
    }
}
