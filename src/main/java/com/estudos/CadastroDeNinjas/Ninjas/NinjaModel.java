package com.estudos.CadastroDeNinjas.Ninjas;

import com.estudos.CadastroDeNinjas.Missoes.MissoesModel;
import jakarta.persistence.*;
import java.util.List;

// Entity ele tranforma uma classe em uma entidade do BD
@Entity
@Table(name= "tb_cadastro")
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

    public NinjaModel() {
    }

    public NinjaModel(String nome, String email, int idade) {
        this.nome = nome;
        this.email = email;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
