package com.linkedin.learning.convertor;

import com.linkedin.learning.entity.ReservationEntity;
import com.linkedin.learning.model.response.ReservationResponse;
import org.springframework.core.convert.converter.Converter;
import org.springframework.lang.Nullable;

import javax.validation.constraints.NotNull;

/**
 * @author Vasiliy Kylik on(Rocket) on 10.03.2018.
 */
public class ReservationEntityToReservationResponseConverter extends Converter<ReservationEntity, ReservationResponse> {


  @Override
  public ReservationResponse convert(ReservationEntity source) {

    ReservationResponse reservationResponse = new ReservationResponse();
    reservationResponse.setCheckin(source.getCheckin());
    reservationResponse.setCheckout(source.getCheckout());

    return reservationResponse;
  }
}
