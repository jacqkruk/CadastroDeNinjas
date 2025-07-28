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
    private Long id;

    private String nome;

    private String email;

    private int idade;

    //@ManyToOne muitos ninjas podem ter uma única missão
    @ManyToOne
    @JoinColumn(name = "missoes_id") // foreign key ou chave estrangeira
    private MissoesModel missoes;


}