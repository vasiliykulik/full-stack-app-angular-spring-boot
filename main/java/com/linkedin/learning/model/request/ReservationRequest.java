package com.linkedin.learning.model.request;

import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;

/**
 * Created by Vasiliy Kylik (Lightning) on 09.03.2018.
 */
public class ReservationRequest {
    private Long id;
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    private LocalDate checkin;
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    private LocalDate checkout;

    // parameter list constructor
    public ReservationRequest() {
        super();
    }

    public ReservationRequest(Long id, LocalDate checkin, LocalDate checkout) {
        this.id = id;
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
}
