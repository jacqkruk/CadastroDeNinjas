package com.estudos.CadastroDeNinjas.Ninjas;

import com.estudos.CadastroDeNinjas.Missoes.MissoesModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

// Entity ele tranforma uma classe em uma entidade do BD
@Entity
@Table(name= "tb_cadastro")
// Da biblioteca lombok:
@Data
@NoArgsConstructor
@AllArgsConstructor
public class NinjaModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "nome")
    private String nome;

    @Column(unique = true)
    private String email;

    @Column(name = "img_url")
    private String imgUrl;

    @Column(name = "idade")
    private int idade;

    // criar essa coluna somente se estiver usando DTO
    // a coluna já existia no banco de dados (criada via migration)
    @Column(name = "rank")
    private String rank;

    //@ManyToOne muitos ninjas podem ter uma única missão
    @ManyToOne
    @JoinColumn(name = "missoes_id") // foreign key ou chave estrangeira
    private MissoesModel missoes;


}