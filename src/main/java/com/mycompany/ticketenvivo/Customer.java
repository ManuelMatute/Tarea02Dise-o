/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ticketenvivo;

/**
 *
 * @author Manue
 */
import java.util.ArrayList;
import java.util.List;

public class Customer {
    private String contactInfo;
    private List<Reservation> reservations = new ArrayList<>();

    public Customer(String contactInfo) {
        this.contactInfo = contactInfo;
    }

    public void addReservation(Reservation reservation) {
        reservations.add(reservation);
    }

    public String getContactInfo() {
        return contactInfo;
    }

    public List<Reservation> getReservations() {
        return reservations;
    }
}