package com.linkedin.learning.convertor;
import com.linkedin.learning.entity.RoomEntity;
import com.linkedin.learning.model.Links;
import com.linkedin.learning.model.Self;
import com.linkedin.learning.model.response.ReservableRoomResponse;
import com.linkedin.learning.rest.ResourceConstants;
import org.springframework.core.convert.converter.Converter;
/**
 * @author Vasiliy Kylik on(Rocket) on 10.03.2018.
 */
public class RoomEntityToReservableRoomResponseConverter implements Converter<RoomEntity, ReservableRoomResponse>{

  @Override
  public ReservableRoomResponse convert(RoomEntity source) {

    ReservableRoomResponse reservationResponse = new ReservableRoomResponse();
    reservationResponse.setRoomNumber(source.getRoomNumber());
    reservationResponse.setPrice( Integer.valueOf(source.getPrice()) );

    Links links = new Links();
    Self self = new Self();
    self.setRef(ResourceConstants.ROOM_RESERVATION_V1 + "/" + source.getId());
    links.setSelf(self);

    reservationResponse.setLinks(links);

    return reservationResponse;
  }



}

