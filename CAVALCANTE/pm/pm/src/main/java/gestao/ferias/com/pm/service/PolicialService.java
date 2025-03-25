package gestao.ferias.com.pm.service;

import gestao.ferias.com.pm.model.Policial;
import gestao.ferias.com.pm.repository.PolicialRepository;
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