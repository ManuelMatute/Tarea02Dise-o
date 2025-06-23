/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ticketenvivo;

/**
 *
 * @author Manue
 */
public class PaymentResult {
    private boolean success;

    public PaymentResult(boolean success) {
        this.success = success;
    }

    public boolean isSuccess() {
        return success;
    }
}

