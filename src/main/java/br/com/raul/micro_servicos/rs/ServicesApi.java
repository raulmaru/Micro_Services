package br.com.raul.micro_servicos.rs;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ServicesApi {
    int retorno = 0;
    @GetMapping(value ="/soma")
    public int GetSoma (){

        return ++retorno;
    }
    @GetMapping(value = "/sub")
    public int GetSub (){
        return --retorno;
    }


}
