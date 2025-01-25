package casas.naomi.assistencia.controllers;

import casas.naomi.assistencia.entities.SolicitacaoAvaliacao;
import casas.naomi.assistencia.forms.FormSolicitacaoAvaliacao;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
@RequiredArgsConstructor
public class ControllerAvaliacao {
    private final SolicitacaoAvaliacao solicitacaoAvaliacao;

    public SolicitacaoAvaliacao getDetalhesSolcitacaoAvaliacao() {
        return null;
    }

    public void registraSolicitaçãoAvaliacao(FormSolicitacaoAvaliacao novaSolicitacao) {
    }

    public void notificarAlterarDeStatus() {
    }

    public SolicitacaoAvaliacao pesquisarSolicitacaoAvaliacao(Integer numSolitacao) {
        return null;
    }

    public List<SolicitacaoAvaliacao> listarSolicitacao(){
        return null;
    }
}
