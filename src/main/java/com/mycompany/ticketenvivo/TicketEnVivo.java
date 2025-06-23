/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ticketenvivo;

/**
 *
 * @author Manue
 */
import java.util.*;
public class TicketEnVivo {

    public static void main(String[] args) {
        // Crear un evento con tipo y show
        Event event = new Event(EventType.THEATRE);
        Show show = new Show();
        event.addShow(show);

        // Crear sección y asientos
        Selection platea = new Selection();
        for (int i = 0; i < 5; i++) {
            platea.addSeat(new Seat());
        }
        show.addSection(platea);

        // Crear cliente
        Customer customer = new Customer("cliente@email.com");

        // Seleccionar dos asientos disponibles
        List<Seat> selectedSeats = platea.getAvailableSeats().subList(0, 2);

        // Crear opciones adicionales
        Option bebida = new Option("Bebida", 5.0);
        Option estacionamiento = new Option("Estacionamiento", 10.0);

        //Reservar
        ReservationService reservationService = new ReservationService();
        Reservation reservation = reservationService.reserveSeats(customer, selectedSeats);
        reservation.addOption(bebida);
        reservation.addOption(estacionamiento);

        // Simular política de precios: $100 por asiento + opciones
        PricePolicy pricePolicy = r -> {
            double base = r.getSeats().size() * 100;
            for (Option o : r.getOptions()) {
                base += o.getPrice();
            }
            return base;
        };

        // Simular procesador de pago
        PaymentProcessor paymentProcessor = amount -> {
            System.out.println("Procesando pago por $" + amount + "...");
            return new PaymentResult(true);
        };

        // Crear ticket service y comprar
        TicketService ticketService = new TicketService(paymentProcessor, pricePolicy);
        Ticket ticket = ticketService.purchase(reservation);

        // Simular envío de notificación
        NotificationService notificationService = (to, message) ->
            System.out.println("NOTIFICACION a " + to + ": " + message);

        if (ticket != null) {
            notificationService.sendNotification(customer.getContactInfo(), "Compra confirmada.");
            System.out.println("Ticket generado: " + ticket.getETicket());
        } else {
            System.out.println("Error en la compra. No se genero ticket.");
        }

        // Simular reporte a soporte
        SupportTicket soporte = new SupportTicket(IssueType.PAYMENT, customer);
        System.out.println("Soporte creado. Estado: " + soporte.getStatus());
        soporte.escalate();
        System.out.println("Estado despues de escalar: " + soporte.getStatus());
    }
}
