package casas.naomi.assistencia.forms;

import casas.naomi.assistencia.controllers.ControllerAvaliacao;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public class FormSolicitacaoAvaliacao {
    private final ControllerAvaliacao ControllerSolicitacaoAvaliacao;

    private String informacoesEletronico;
    private String informacoesCliente;
}
