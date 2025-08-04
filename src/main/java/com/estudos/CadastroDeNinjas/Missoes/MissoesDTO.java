package com.estudos.CadastroDeNinjas.Missoes;

import com.estudos.CadastroDeNinjas.Ninjas.NinjaModel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class MissoesDTO {

    private Long id;
    private String nome;
    private char dificuldade;
    private List<NinjaModel> ninjas;

}
