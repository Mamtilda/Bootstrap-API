package org.example;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class mainController {

    @GetMapping("/")
    public String home() {
        return "index";
    }

    @PostMapping("/submitForm")
    public String submitForm(
        @RequestParam String firstname,
        @RequestParam String lastname,
        @RequestParam String email,
        @RequestParam String number,
        @RequestParam String comments
    ) {
        System.out.println("Received form submission:");
        System.out.println("First name: " + firstname);
        System.out.println("Last name: " + lastname);
        System.out.println("Email: " + email);
        System.out.println("Number: " + number);
        System.out.println("Comments: " + comments);

        return "index";
    }

}
