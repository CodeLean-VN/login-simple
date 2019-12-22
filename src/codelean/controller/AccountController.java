package codelean.controller;

import codelean.model.Account;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AccountController {

    @GetMapping("/home")
    public String login() {
        return "index";
    }

    @PostMapping("/login")
    public ModelAndView login(Model model, @RequestParam("username") String username, @RequestParam("password") String password) {
        Account account = new Account(username, password);
        model.addAttribute("message", "Dang nhap thanh cong");
        ModelAndView modelAndView = new ModelAndView("success", "account", account);
        return modelAndView;
    }
}
