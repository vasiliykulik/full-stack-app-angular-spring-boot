package com.linkedin.learning.repository;


import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.linkedin.learning.entity.RoomEntity;

/**
 * @author Vasiliy Kylik on(Rocket) on 10.03.2018.
 */
public interface RoomRepository extends CrudRepository<RoomEntity, Long> {

  RoomEntity findById(Long id);
}

