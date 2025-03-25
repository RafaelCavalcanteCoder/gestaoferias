package com.exemplo.service;

import com.exemplo.model.Policial;
import com.exemplo.repository.PolicialRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PolicialService {

    @Autowired
    private PolicialRepository policialRepository;

    // Salvar policial
    public Policial salvarPolicial(Policial policial) {
        return policialRepository.save(policial);
    }

    // Listar todos os policiais
    public List<Policial> listarPoliciais() {
        return policialRepository.findAll();
    }
}