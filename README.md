# Tarea02 SOLID


Diagrama de casos de uso
![Imagen de WhatsApp 2025-06-22 a las 11 33 07_a22fa55b](https://github.com/user-attachments/assets/0df8a757-505b-4cd5-a8a8-0ab3fb50f1c3)

Diagrama de Clases
![Diagrama De clases TicketsEnVivo - Página 2](https://github.com/user-attachments/assets/83f26426-c0d4-4114-b595-639b2d972e06)

Diagrama de Secuencias
Caso 1
![image](https://github.com/user-attachments/assets/8fc1935f-5c65-4b97-96b6-0ac348910148)

Caso 2
![image](https://github.com/user-attachments/assets/f5182213-73db-4e02-91d2-1ce84041fee2)

Caso 3
![image](https://github.com/user-attachments/assets/fef060c1-c685-4fd6-ae38-a9d0ef99e70f)

Caso 4
![image](https://github.com/user-attachments/assets/6170cfde-149d-4858-b92b-92f5660a8a1c)




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

   * Creación de un evento y función

   * Selección de asientos y opciones adicionales

   * Reserva, pago y generación de ticket

   * Notificación al cliente

   * Registro de un incidente de soporte

