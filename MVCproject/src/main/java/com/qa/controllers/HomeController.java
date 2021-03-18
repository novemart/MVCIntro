package com.qa.controllers;

import com.qa.models.Person;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

@Controller
@SessionAttributes("person")
public class HomeController {
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String home(){
        return "home";
    }

    @RequestMapping(value = "/", method = RequestMethod.POST)
    public ModelAndView handleForm(
            @RequestParam(value="fname") String firstName,
            @RequestParam(value="lname") String lastName,
            @RequestParam(value="email") String email,
            @RequestParam(value="age") int age
    ){
        Person person = new Person(firstName, lastName, email, Integer.valueOf(age));
        return new ModelAndView("afterForm", "person", person);
    }

    @RequestMapping(value = "/nextPage", method = RequestMethod.GET)
    public String goToNextPage(){
        return "nextPage";
    }
}
