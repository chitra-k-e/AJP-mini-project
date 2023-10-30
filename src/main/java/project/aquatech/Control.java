package project.aquatech;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;


@Controller
public class Control {
    @Autowired
    Repo1 r;
    @Autowired
    Repo2 r1;
    @Autowired
    Repo3 r2;
    @GetMapping("")
    public String index()
    {
        return "index";
    }
    @GetMapping("/aboutUs")
    public String aboutus()
    {
        return "AboutUs";
    }
    @GetMapping("/home")
    public String home()
    {
        return "index";
    }
    @GetMapping("/shop")
    public String shop(Model model)
    {
        model.addAttribute("form3",new Form3());
        return "Shop";
    }
    @PostMapping("/form3")
    public String form3(Model model,Form3 form3)
    {
        r2.save(form3);
        return "index";
    }
    @GetMapping("/sign")
    public String sign(Model model)   
    {  
       model.addAttribute("form2",new Form2());
        return "Sign";
    }
    @PostMapping("/form2")
    public String sign(Model model,Form2 form2)
    {
        r1.save(form2);
        return "index";
    }
    @GetMapping("/contact")
    public String contact(Model model)
    {
        model.addAttribute("form1",new Form1());
        return "Contact";
    }
    @PostMapping("/form1")
    public String form1(Model model,Form1 form1)
    {
        r.save(form1);
        return "index";
    }
    @GetMapping("/cart")
    public String cart()
    {
        return "cart";
    }

}
