package com.linkedin.learning.entity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;

/**
 * @author Vasiliy Kylik on(Rocket) on 10.03.2018.
 */
@Entity
@Table(name = "Reservation")
public class ReservationEntity {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;

  @NotNull
  @NotNull
  private LocalDate checkin;

  @NotNull
  private LocalDate checkout;

  @ManyToOne
  private RoomEntity roomEntity;

  public ReservationEntity() {
    super();
  }

  public ReservationEntity(@NotNull @NotNull LocalDate checkin, @NotNull LocalDate checkout) {
    this.checkin = checkin;
    this.checkout = checkout;
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public LocalDate getCheckin() {
    return checkin;
  }

  public void setCheckin(LocalDate checkin) {
    this.checkin = checkin;
  }

  public LocalDate getCheckout() {
    return checkout;
  }

  public void setCheckout(LocalDate checkout) {
    this.checkout = checkout;
  }

  public RoomEntity getRoomEntity() {
    return roomEntity;
  }

  public void setRoomEntity(RoomEntity roomEntity) {
    this.roomEntity = roomEntity;
  }
}
