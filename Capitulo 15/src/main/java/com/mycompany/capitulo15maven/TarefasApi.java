package com.mycompany.capitulo15maven;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
@RestController
@RequestMapping("/api/tarefas")
public class TarefasApi {

    private final List< String> tarefas = new ArrayList<>();

    @GetMapping
    public List< String> listarTodasTarefas() {
        return tarefas;
    }

    @PostMapping
    public void criarTarefa(@RequestBody String tarefa) {
        tarefas.add(tarefa);
    }

    @DeleteMapping("/{index}")
    public void apagarTarefa(@PathVariable int id) {
        if (id >= 0 && id < tarefas.size()) {
            tarefas.remove(id);
        }
    }

    public static void main(String[] args) {
        SpringApplication.run(TarefasApi.class, args);
    }
}
