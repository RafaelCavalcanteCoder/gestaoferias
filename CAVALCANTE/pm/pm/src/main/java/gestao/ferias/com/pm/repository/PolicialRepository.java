package com.exemplo.repository;
import com.exemplo.model.Policial;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PolicialRepository extends JpaRepository<Policial, Long> {
}

