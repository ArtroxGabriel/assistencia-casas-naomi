package casas.naomi.assistencia.controllers;

import casas.naomi.assistencia.entities.ItemEstoque;
import casas.naomi.assistencia.entities.RequisicaoEstoque;
import casas.naomi.assistencia.entities.Tecnico;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/requisicoes")
public class ControllerRequisicaoEstoque {

    private final List<RequisicaoEstoque> requisicoes = new ArrayList<>();

    @PostMapping
    public String requisitarItem(@RequestBody Tecnico tecnico, @RequestParam Long itemId, @RequestParam int quantidade, @RequestBody List<ItemEstoque> estoque) {
        for (ItemEstoque item : estoque) {
            if (item.getId().equals(itemId)) {
                if (item.verificarDisponibilidade(quantidade)) {
                    item.reduzirQuantidade(quantidade);
                    RequisicaoEstoque requisicao = new RequisicaoEstoque(tecnico, item, quantidade);
                    requisicoes.add(requisicao);
                    return "Requisição realizada com sucesso!";
                } else {
                    return "Item insuficiente no estoque. Uma reposição será solicitada.";
                }
            }
        }
        return "Item não encontrado.";
    }

    @GetMapping
    public List<RequisicaoEstoque> listarRequisicoes() {
        return requisicoes;
    }
}
