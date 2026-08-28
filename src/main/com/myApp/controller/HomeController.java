package main.com.myApp.controller;

import main.com.myApp.model.UserData;
import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import javax.validation.Valid;

@Controller
public class HomeController
{
    @RequestMapping("/")
    public String showHomePage(Model model)
    {
    UserData userData = new UserData();
    model.addAttribute("userData",userData);
        //business logic@
        return "home";
    }
    @RequestMapping("/processform")
    public String processform(@Valid @ModelAttribute("userData") UserData userDataObj, BindingResult bindingResult, Model model){
        if (bindingResult.hasErrors())
            return "home";
        model.addAttribute("name",userDataObj);
        return "result";
    }
    @InitBinder
    public void initBinder(WebDataBinder dataBinder){
        StringTrimmerEditor stringTrimmerEditor = new StringTrimmerEditor(true);
        dataBinder.registerCustomEditor(String.class , stringTrimmerEditor);
    }

    }




