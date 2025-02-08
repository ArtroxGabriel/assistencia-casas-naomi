package casas.naomi.assistencia.entities;

import casas.naomi.assistencia.enums.StatusPedido;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;

import java.util.List;

@Entity
public class Pedido extends Eletronico {
    @Column(name = "descricao_problema")
    private String descricaoProblema;

    @Column(name = "status")
    private StatusPedido status;

    @Column(name = "prazo_de_entrega")
    private int prazoDeEntrega;

    @OneToMany(targetEntity = Orcamento.class, mappedBy = "pedidoID", cascade = CascadeType.ALL)
    private List<Orcamento> orcamento;

    public float calcularOrcamento() {
        return 0;
    }
}
