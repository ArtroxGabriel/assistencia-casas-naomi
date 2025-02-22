package casas.naomi.assistencia.forms;

import casas.naomi.assistencia.enums.CategoriaItemEstoque;
import casas.naomi.assistencia.enums.DisponibilidadeItemEstoque;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class FormFiltrarItemEstoque {

    private String localizacao;
    private DisponibilidadeItemEstoque disponibilidade;
    private CategoriaItemEstoque categoria;
    private String nome;
    private String marca;
    private Integer quantidadeMinima;
}
