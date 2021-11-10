package com.phuongnt.main;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.io.IOException;

@ControllerAdvice
public class ExceptionControllerAdvice {

    @ExceptionHandler(MyException.class)
    public String handlingMyException(MyException mex, Model model) {
        model.addAttribute("msgException", mex.getMsgException());
        model.addAttribute("idException", mex.getIdException());
        return "/error/Error";
    }

    @ExceptionHandler(IOException.class)
    public String handlingException(Exception ex, Model model) {
        model.addAttribute("msgException", ex.getMessage());
        return "/error/Error";
    }
}
