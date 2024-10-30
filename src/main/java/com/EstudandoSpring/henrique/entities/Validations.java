package com.EstudandoSpring.henrique.entities;

import com.EstudandoSpring.henrique.exceptions.UnsuportedMathOperationException;
import org.springframework.stereotype.Service;

@Service
public class Validations {

    public Validations() {}

    public Double convertToDouble(String strNumber) throws Exception {
        if (strNumber == null) {
            throw new Exception();
        }
        String number = strNumber.replaceAll(",", ".");
        if (isNumeric(number)) return Double.parseDouble(number);
        return 0D;
    }

    public boolean isNumeric(String strNumber) throws Exception {
        if (strNumber == null) {
            throw new Exception();
        }
        String number = strNumber.replaceAll(",", ".");
        return number.matches("[-+]?[0-9]*\\.?[0-9]+");
    }

    public boolean isNumeric(String numberOne, String numberTwo) throws Exception {
        if (!isNumeric(numberOne) || !isNumeric(numberTwo)) {
            throw new UnsuportedMathOperationException("Please set a numeric value!");
        }
        return true;
    }
}
