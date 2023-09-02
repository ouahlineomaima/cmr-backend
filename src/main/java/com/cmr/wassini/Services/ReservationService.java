package com.cmr.wassini.Services;

import com.cmr.wassini.Models.Reservation;
import com.cmr.wassini.Repo.ReservationRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReservationService {
    private final ReservationRepo reservationRepo;

    @Autowired
    public ReservationService(ReservationRepo reservationRepo) {
        this.reservationRepo = reservationRepo;
    }
    public List<Reservation> getAllReservations() {
        return reservationRepo.findAll();
    }

    public Reservation createReservation(Reservation reservation) {
        return reservationRepo.save(reservation);
    }
}
