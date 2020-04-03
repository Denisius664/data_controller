package com.sneid.inc.data_controller.repositories;

import com.sneid.inc.data_controller.entity.Data;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface DataRepository extends JpaRepository<Data, Long> {

    List<Data> findByContentContains(String piece_content);

    List<Data> findByTitleContains(String piece_title);

    List<Data> findFirst10ByContentContains(String piece_content);

    List<Data> findFirst10ByTitleContains(String piece_title);

}
