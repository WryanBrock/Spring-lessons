package com.in28minutes.springboot.myfirstwebapp;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class LoginController {

//    private Logger logger = LoggerFactory.getLogger(getClass());
//        logger.debug("Request param is {}, name");
////        logger.info("I want this printed st info level");
////        logger.warn("I want this printed st warn level");
    @RequestMapping(value="login",method= RequestMethod.GET)
    public String goToLoginPage(@RequestParam String name, ModelMap model){
        model.put("name", name);
        return "login";
    }
}
