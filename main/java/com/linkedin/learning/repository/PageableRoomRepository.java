package com.linkedin.learning.repository;

import com.linkedin.learning.entity.RoomEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;


/**
 * @author Vasiliy Kylik on(Rocket) on 10.03.2018.
 */
public interface PageableRoomRepository extends PagingAndSortingRepository<RoomEntity,Long> {

  Page<RoomEntity> findById(Long id, Pageable page);

}
