// Dimitria Deveaux, Course:COP 3330 CRN 24680, Date: 04-01-2024
//Purpose: The GreetingController handles request related to greeting.
package com.example.handlingformsubmission;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;


@Controller
public class GreetingController {
    @GetMapping("/greeting")
    public String greetingForm( Model model) throws InvalidDateException {
        model.addAttribute("greeting", new Greeting(0,0,0));
        return "greeting";
    }

    @PostMapping("/greeting")
    public String greetingSubmit(@ModelAttribute Greeting greeting, Model model) {
        model.addAttribute("greeting", greeting);
        return "result";
    }
}
