package gestao.ferias.com.pm.service;

import gestao.ferias.com.pm.entity.Ferias;
import gestao.ferias.com.pm.repository.FeriasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FeriasService {

    @Autowired
    private FeriasRepository feriasRepository;

    public Ferias solicitarFerias(Ferias ferias) {
        return feriasRepository.save(ferias);
    }

    public List<Ferias> listarFeriasPorPolicial(Long policialId) {
        return feriasRepository.findByPolicialId(policialId);
    }
}
