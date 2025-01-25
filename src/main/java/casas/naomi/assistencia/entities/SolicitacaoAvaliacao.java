package casas.naomi.assistencia.entities;

import casas.naomi.assistencia.enums.DiaSemana;
import casas.naomi.assistencia.enums.StatusSolicitacaoAvaliacao;
import jakarta.persistence.*;

import java.util.Date;
import java.util.List;

@Entity
public class SolicitacaoAvaliacao extends Eletronico {
    @Column(name = "numero_da_solicitacao")
    private Integer numeroDaSolicitacao;

    @Column(name = "preferencia_dia_visita")
    @ElementCollection
    private List<DiaSemana> preferenciaDiaVisita;

    @Column(name = "data_solicitacao")
    @Temporal(TemporalType.DATE)
    private Date dataSolicitacao;

    @Column(name = "status_solicitacao")
    private StatusSolicitacaoAvaliacao statusSolicitacao;

    public void mudarStatusSolicitacao(StatusSolicitacaoAvaliacao novoStatus) {
    }
}
