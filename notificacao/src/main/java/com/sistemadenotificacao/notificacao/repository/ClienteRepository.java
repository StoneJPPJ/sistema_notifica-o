package com.sistemadenotificacao.notificacao.repository;

import com.sistemadenotificacao.notificacao.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Long> {
    // Aqui você pode adicionar métodos de busca personalizados, se quiser
}
