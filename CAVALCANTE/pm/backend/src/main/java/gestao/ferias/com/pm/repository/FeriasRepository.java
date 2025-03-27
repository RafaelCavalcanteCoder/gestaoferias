package gestao.ferias.com.pm.repository;

import gestao.ferias.com.pm.entity.Ferias;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface FeriasRepository extends JpaRepository<Ferias, Long> {
    List<Ferias> findByPolicialId(Long policialId);
}
