package br.com.raul.micro_servicos.rs;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ServicesApi {
    @GetMapping(value ="/soma")
    public int GetSoma (){
        return 1+1;
    }
    @GetMapping(value = "/sub")
    public int GetSub (){
        return 1-1;
    }


}
