package com.example.trial;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class TrialController {
    @GetMapping
    String getHello() {
        return "view";
    }

    //ポイント1
    @PostMapping("resultCtrl")
    //ポイント2
    String postResult(@RequestParam("val") String responseVal, Model model) {
        //ポイント3
        model.addAttribute("responseVal", responseVal);
        return "result";
    }
}