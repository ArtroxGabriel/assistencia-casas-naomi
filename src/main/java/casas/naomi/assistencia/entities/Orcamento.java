package casas.naomi.assistencia.entities;

import jakarta.persistence.*;

@Entity
public class Orcamento {
    @Id
    private Long id;

    @Column(name = "valor")
    private float valor;

    @Column(name = "descricao")
    private String descricao;

    @ManyToOne(targetEntity = Pedido.class, cascade = CascadeType.ALL)
    private Pedido pedidoID;
}
