package learn.mvcDemo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
public class MVCController {
    @RequestMapping("/")
    public String index(){
        return "home";
    }
    @RequestMapping("/dynamic")
    public String dynamic(Model model){
        int n=100;
        model.addAttribute("variable",n);
        return "dynamic";
    }
    @RequestMapping("/add")
    public String add(){
        return "add";
    }
    @RequestMapping("/result")
    public String result(Model model ,HttpServletRequest request){
        int n1=Integer.parseInt(request.getParameter("First Number"));
        int n2 =Integer.parseInt(request.getParameter("Second Number"));
        int res=  n1 + n2;
        model.addAttribute("result",res);
        return "result";
    }



}
