package com.rocketseat.certificacion_nlw;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/primeiraController")
public class PrimeiraController {

    @GetMapping("/retornarPrimeiraController")
    public Usuario retornoPrimeiraController() {
        var usuario = new Usuario("Daniele", 34);
        return usuario;
    }

    @PostMapping("/meuPrimeiroPost")
    public String meuPrimeiroPost() {
        return "Meu primeiro post";
    }

    record Usuario(String nome, int idade) {
    }

}
