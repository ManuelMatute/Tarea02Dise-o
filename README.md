# Tarea02Diseño


Diagrama de casos de uso
![Imagen de WhatsApp 2025-06-22 a las 11 33 07_a22fa55b](https://github.com/user-attachments/assets/0df8a757-505b-4cd5-a8a8-0ab3fb50f1c3)

Diagrama de Clases
![Diagrama De clases TicketsEnVivo - Página 2](https://github.com/user-attachments/assets/83f26426-c0d4-4114-b595-639b2d972e06)

Diagrama de Secuencias



Proyecto en java:
EnVivoTickets

Este proyecto implementa un prototipo funcional del sistema EnVivoTickets, basado en los casos de uso, los diagramas de clases y de secuencias proporcionados. El sistema permite a los usuarios reservar entradas para eventos en vivo, como obras de teatro y espectáculos de stand-up, utilizando una arquitectura orientada a objetos en Java.

1. Clases principales del modelo

   Event, Show, Selection, Seat: representan la estructura del espectáculo y sus funciones.

   Customer, Reservation, Ticket: manejan el proceso de reserva y compra.

   Option: agrega extras como bebidas o estacionamiento.

   SupportTicket: gestiona incidentes reportados por los usuarios.

2. Interfaces clave

   PricePolicy: estrategia para calcular precios según reserva.

   PaymentProcessor: simula pagos.

   NotificationService: notifica al cliente.

   ReservationTimer: define lógica para liberar reservas temporales (no implementada aún).

3. Enumeraciones
   
   EventType, IssueType, TicketStatus: clasifican tipos de eventos, problemas de soporte, y  estados de ticket.


Ejecución del programa

   El archivo Main.java simula un escenario completo:

   Creación de un evento y función

   Selección de asientos y opciones adicionales

   Reserva, pago y generación de ticket

   Notificación al cliente

   Registro de un incidente de soporte
