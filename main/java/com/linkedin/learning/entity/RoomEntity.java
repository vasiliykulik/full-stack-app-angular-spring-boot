package com.linkedin.learning.entity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

/**
 * @author Vasiliy Kylik on(Rocket) on 10.03.2018.
 */
@Entity
@Table(name="Room")
public class RoomEntity {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;

  @NotNull
  private Integer roomNumber;

  @NotNull
  private String price;

  public RoomEntity() {
    super();
  }

  public RoomEntity(@NotNull Integer roomNumber, @NotNull String price) {
    this.roomNumber = roomNumber;
    this.price = price;
  }

  public Integer getRoomNumber() {
    return roomNumber;
  }

  public void setRoomNumber(Integer roomNumber) {
    this.roomNumber = roomNumber;
  }

  public String getPrice() {
    return price;
  }

  public void setPrice(String price) {
    this.price = price;
  }
}
