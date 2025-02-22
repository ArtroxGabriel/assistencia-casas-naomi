package casas.naomi.assistencia.entities;

import casas.naomi.assistencia.enums.CategoriaItemEstoque;
import casas.naomi.assistencia.enums.DisponibilidadeItemEstoque;
import jakarta.persistence.*;
import lombok.Getter;

@Entity
public class ItemEstoque {

    @Getter
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private String marca;
    private Integer quantidade;
    private String localizacao;

    @Enumerated(EnumType.STRING)
    private DisponibilidadeItemEstoque disponibilidade;

    private String descricao;

    @Enumerated(EnumType.STRING)
    private CategoriaItemEstoque categoria;

    private String fabricante;
    private String modeloCompativel;

    private String tipo;
    private String estado; // Nova, Usada, Quebrada

    public ItemEstoque() {}

    public ItemEstoque(String nome, String marca, Integer quantidade, String localizacao,
                       DisponibilidadeItemEstoque disponibilidade, String descricao, CategoriaItemEstoque categoria,
                       String fabricante, String modeloCompativel, String tipo, String estado) {
        this.nome = nome;
        this.marca = marca;
        this.quantidade = quantidade;
        this.localizacao = localizacao;
        this.disponibilidade = disponibilidade;
        this.descricao = descricao;
        this.categoria = categoria;
        this.fabricante = fabricante;
        this.modeloCompativel = modeloCompativel;
        this.tipo = tipo;
        this.estado = estado;
    }

    public void atualizarDados(ItemEstoque itemAtualizado) {
        this.nome = itemAtualizado.nome;
        this.marca = itemAtualizado.marca;
        this.quantidade = itemAtualizado.quantidade;
        this.localizacao = itemAtualizado.localizacao;
        this.disponibilidade = itemAtualizado.disponibilidade;
        this.descricao = itemAtualizado.descricao;
        this.categoria = itemAtualizado.categoria;
        this.fabricante = itemAtualizado.fabricante;
        this.modeloCompativel = itemAtualizado.modeloCompativel;
        this.tipo = itemAtualizado.tipo;
        this.estado = itemAtualizado.estado;
    }

    public boolean verificarDisponibilidade(int quantidadeSolicitada) {
        return this.quantidade >= quantidadeSolicitada;
    }

    public void reduzirQuantidade(int quantidadeSolicitada) {
        if (verificarDisponibilidade(quantidadeSolicitada)) {
            this.quantidade -= quantidadeSolicitada;
        }
    }
}

