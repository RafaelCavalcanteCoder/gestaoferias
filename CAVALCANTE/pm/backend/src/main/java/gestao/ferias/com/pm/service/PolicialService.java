package gestao.ferias.com.pm.service;

import gestao.ferias.com.pm.entity.Policial;
import gestao.ferias.com.pm.repository.PolicialRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PolicialService {

    @Autowired
    private PolicialRepository policialRepository;

    public Policial cadastrarPolicial(Policial policial) {
        return policialRepository.save(policial);
    }

    public List<Policial> listarTodosPoliciais() {
        return policialRepository.findAll();
    }

    public List<Policial> listarPoliciaisPorGraduacao(String graduacao) {
        return policialRepository.findByGraduacao(graduacao);
    }

    public Policial buscarPolicialPorId(Long id) {
        return policialRepository.findById(id).orElseThrow(() -> new RuntimeException("Policial não encontrado"));
    }
}
