package com.phuongnt.main;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.io.IOException;
import java.sql.SQLException;

@Controller
public class WelcomeController {

    @GetMapping(value = "/exception/{type}")
    public String getType(@PathVariable(name = "type") String type) throws IOException {

        if (type.equalsIgnoreCase("error")) {
            throw new MyException("This is a error of MyException", "A001");
        } else if (type.equalsIgnoreCase("io-error")) {
            throw new IOException("This is a error of IOException");
        }
        return "hello";
    }
}
