package casas.naomi.assistencia.entities;

public class Tecnico {

    private Long id;
    private String nome;
    private String registro;

    public Tecnico(String nome, String registro) {
        this.nome = nome;
        this.registro = registro;
    }
}
