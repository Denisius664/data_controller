package com.sneid.inc.data_controller.repositories;

import com.sneid.inc.data_controller.entity.Data;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DataRepositories extends JpaRepository<Data, Long> {
}
