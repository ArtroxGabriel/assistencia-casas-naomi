package casas.naomi.assistencia.forms;

import casas.naomi.assistencia.enums.DisponibilidadeItemEstoque;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class FormAtualizarItemEstoque {
    private Integer quantidade;
    private String localizacao;
    private DisponibilidadeItemEstoque disponibilidade;
}
