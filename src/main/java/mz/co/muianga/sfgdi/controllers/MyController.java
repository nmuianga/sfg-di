package mz.co.muianga.sfgdi.controllers;

import org.springframework.stereotype.Controller;

/**
 * Created by Nilvandro Muianga on 6/14/2020
 */
@Controller
public class MyController {

    public String sayHello() {
        System.out.println("Hello world!!!");

        return "Hi Folks!";
    }
}
