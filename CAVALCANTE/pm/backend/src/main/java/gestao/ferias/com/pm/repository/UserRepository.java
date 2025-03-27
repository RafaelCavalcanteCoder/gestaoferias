package gestao.ferias.com.pm.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import gestao.ferias.com.pm.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {
    boolean existsByUsername(String username);
}
