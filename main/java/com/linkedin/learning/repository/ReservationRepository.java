package com.linkedin.learning.repository;

import com.linkedin.learning.entity.ReservationEntity;
import org.springframework.data.repository.CrudRepository;

/**
 * @author Vasiliy Kylik on(Rocket) on 10.03.2018.
 */
public interface ReservationRepository extends CrudRepository<ReservationEntity, Long> {
}
