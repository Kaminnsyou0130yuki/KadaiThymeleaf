package com.techacademy;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class inputController {

    @GetMapping("/input/{previous}")
    public String getInputPrevious(@PathVariable String previous, Model model) {
        model.addAttribute("previous",previous);
        return "input";
    }

    @GetMapping("/input")
    public String getInput() {
        return "input";
    }
}
