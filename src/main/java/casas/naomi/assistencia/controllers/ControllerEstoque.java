package casas.naomi.assistencia.controllers;

import casas.naomi.assistencia.entities.ItemEstoque;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/estoque")
public class ControllerEstoque {

    private static ControllerEstoque instancia;
    private final List<ItemEstoque> estoque = new ArrayList<>();

    private ControllerEstoque() {} // Construtor privado evita múltiplas instâncias

    public static ControllerEstoque getInstance() {
        if (instancia == null) {
            instancia = new ControllerEstoque();
        }
        return instancia;
    }

    @PostMapping
    public void adicionarItem(@RequestBody ItemEstoque item) {
        estoque.add(item);
    }

    @PutMapping("/{id}")
    public void atualizarItem(@PathVariable Long id, @RequestBody ItemEstoque itemAtualizado) {
        for (ItemEstoque item : estoque) {
            if (item.getId().equals(id)) {
                item.atualizarDados(itemAtualizado);
                break;
            }
        }
    }

    @DeleteMapping("/{id}")
    public void removerItem(@PathVariable Long id) {
        estoque.removeIf(item -> item.getId().equals(id));
    }

    @GetMapping
    public List<ItemEstoque> visualizarItens() {
        return estoque;
    }
}
