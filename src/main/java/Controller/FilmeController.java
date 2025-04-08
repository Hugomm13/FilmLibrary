package Controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello-world")
public class FilmeController {
//post ,get,delete ,put,patch,options , head metodos http


    @GetMapping // GET / hello world
    public String teste (){
        return "teste";
    }












}
