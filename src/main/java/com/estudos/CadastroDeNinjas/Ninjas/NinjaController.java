package com.estudos.CadastroDeNinjas.Ninjas;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ninjas")
public class NinjaController {

    private NinjaService ninjaService;

    public NinjaController(NinjaService ninjaService) {
        this.ninjaService = ninjaService;
    }

    @GetMapping("/boasvindas") // mapeamento do get de HTTP
    public String boasVindas() {
        return "Essa é a minha primeira mensagem nessa rota!";
    }

    // Adicionar ninja (CREATE)
    @PostMapping("/criar")
    public NinjaModel criarNinja(@RequestBody NinjaModel ninja) {
        return ninjaService.criarNinja(ninja);
    }

    // Mostrar todos os ninjas (READ)
    @GetMapping("/listar")
    public List<NinjaModel> listarNinjas() {
        return ninjaService.listarNinjas();
    }

    // Mostrar ninja por ID (READ)
    @GetMapping("/listar/{id}")
    public NinjaModel listarNinjasPorId(@PathVariable Long id) { //variável de caminho passada pelo usuario
        return ninjaService.listarNinjaPorId(id);
    }

    // Alterar dados dos ninjas (UPDATE)
    @PutMapping("/alterar/{id}")
    public NinjaModel alterarNinjaPorId(@PathVariable Long id) {
        return ninjaService.alterarNinjaPorId(id);
    }

    // Deletar ninja (DELETE)
    @DeleteMapping("/deletar/{id}")
    public void deletarNinjaPorId(@PathVariable Long id) {
        ninjaService.deletarNinjaPorId(id);
    }
}
