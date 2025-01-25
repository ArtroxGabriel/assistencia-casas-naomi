package casas.naomi.assistencia.entities;

import casas.naomi.assistencia.enums.TipoDispositivo;
import jakarta.persistence.*;
import org.springframework.context.annotation.Conditional;

import java.util.List;

@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public abstract class Eletronico {
    @Id
    private Long id;

    @Column(name = "numero_de_serie")
    private String numeroDeSerie;

    @Column(name = "nome_cliente")
    private String nomeCliente;

    @Column(name = "endereco")
    private String endereco;

    @Column(name = "telefone")
    private String telefone;

    @Column(name = "email")
    private String email;

    @Column(name = "tipo_dispositivo")
    private TipoDispositivo tipoDispositivo;

    @Column(name = "marca_eletronico")
    private String marcaEletronico;

    @Column(name = "modelo_eletronico")
    private String modeloEletronico;

    @Column(name = "temp_de_uso")
    private String tempoDeUso;

    @Column(name = "voltagem")
    private Float voltagem;

    @Column(name = "peso")
    private Float peso;

    @ElementCollection
    @Column(name = "dimensao")
    private List<Float> dimensoes;
}
