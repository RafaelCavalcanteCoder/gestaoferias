package gestao.ferias.com.pm.repository;

import gestao.ferias.com.pm.entity.Policial;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PolicialRepository extends JpaRepository<Policial, Long> {
    List<Policial> findByGraduacao(String graduacao);
}
