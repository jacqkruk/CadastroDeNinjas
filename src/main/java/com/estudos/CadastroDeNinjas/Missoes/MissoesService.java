package com.estudos.CadastroDeNinjas.Missoes;

import com.estudos.CadastroDeNinjas.Ninjas.NinjaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MissoesService {
    private MissoesRepository missoesRepository;

    public MissoesService(MissoesRepository missoesRepository) {
        this.missoesRepository = missoesRepository;
    }

    // Listar todas as missões
    public List<MissoesModel> listarMissoes() {
        return missoesRepository.findAll();
    }

    //

}
