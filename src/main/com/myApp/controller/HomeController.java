package main.com.myApp.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import java.time.LocalDate;

@Controller
public class HomeController
{

    @RequestMapping("/")
    public String showHomePage()
    {
        //business logic@
        return "home";
    }
    @RequestMapping("/processform")
    public String processform(HttpServletRequest request ,Model model){
       String year = request.getParameter("yearParam");
       String month = request.getParameter("monthParam");
       String day = request.getParameter("dayParam");
       int userAge = calculateAge(Integer.parseInt(year),Integer.parseInt(month),Integer.parseInt(day));
        model.addAttribute("userAge",userAge);
        return "result";
    }
    private int calculateAge(int year,int month,int day){
        LocalDate dataOfBirth = LocalDate.of(year,month,day);
        LocalDate now =LocalDate.now();
        return now.getYear() - dataOfBirth.getYear();
    }
    }



