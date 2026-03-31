package com.zup.pizzaria.reporsitory;

import com.zup.pizzaria.models.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {

}
