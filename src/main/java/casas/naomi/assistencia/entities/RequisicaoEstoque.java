package casas.naomi.assistencia.entities;

import java.time.LocalDateTime;

public class RequisicaoEstoque {

    private Long id;
    private Tecnico tecnico;
    private ItemEstoque item;
    private Integer quantidadeSolicitada;
    private LocalDateTime dataHoraRequisicao;

    public RequisicaoEstoque(Tecnico tecnico, ItemEstoque item, Integer quantidadeSolicitada) {
        this.tecnico = tecnico;
        this.item = item;
        this.quantidadeSolicitada = quantidadeSolicitada;
        this.dataHoraRequisicao = LocalDateTime.now();
    }

    private boolean verificarDisponibilidade() {
        // Método para verificar se há itens suficientes no estoque
        return false;
    }
}
