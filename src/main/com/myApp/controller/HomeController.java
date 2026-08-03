package main.com.myApp.controller;



import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

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
    public String processform(@ModelAttribute("userData") UserData userDataObj, Model model){

        model.addAttribute("name",userDataObj);
        model.addAttribute("message","Data submitted successfully");
        return "result";
    }

    }

//


