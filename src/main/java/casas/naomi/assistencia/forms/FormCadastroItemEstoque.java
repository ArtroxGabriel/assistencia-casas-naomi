package casas.naomi.assistencia.forms;

import casas.naomi.assistencia.enums.CategoriaItemEstoque;
import casas.naomi.assistencia.enums.DisponibilidadeItemEstoque;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class FormCadastroItemEstoque {

    private String nome;
    private Integer quantidade;
    private String localizacao;
    private String descricao;
    private CategoriaItemEstoque categoria;
}
