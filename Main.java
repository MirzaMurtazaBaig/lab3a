package task3;

import java.util.Date;

//Interface with common booking functions
interface CommonFunctions {
 void searchTicket();
 void bookTicket();
 void cancelTicket();
 void makePayment();
 void fillDetails();
}

//Customer class with attributes and methods to add and modify details
class Customer {
 private String customerId;
 private String name;
 private String address;
 private String phoneNo;
 private int age;

 public Customer(String customerId, String name, String address, String phoneNo, int age) {
     this.customerId = customerId;
     this.name = name;
     this.address = address;
     this.phoneNo = phoneNo;
     this.age = age;
 }

 public void addDetails() {
     System.out.println("Customer details added for " + name);
 }

 public void modifyDetails() {
     System.out.println("Customer details modified for " + name);
 }

 // Getters and Setters
 public String getCustomerId() {
     return customerId;
 }

 public void setCustomerId(String customerId) {
     this.customerId = customerId;
 }

 public String getName() {
     return name;
 }

 public void setName(String name) {
     this.name = name;
 }

 // Additional getters and setters can be added for other fields as needed
}

//Agent class implementing common booking functions
class Agent implements CommonFunctions {
 private int id;
 private String name;

 public Agent(int id, String name) {
     this.id = id;
     this.name = name;
 }

 @Override
 public void searchTicket() {
     System.out.println("Searching ticket by agent " + name);
 }

 @Override
 public void bookTicket() {
     System.out.println("Booking ticket by agent " + name);
 }

 @Override
 public void cancelTicket() {
     System.out.println("Cancelling ticket by agent " + name);
 }

 @Override
 public void makePayment() {
     System.out.println("Processing payment by agent " + name);
 }

 @Override
 public void fillDetails() {
     System.out.println("Filling details by agent " + name);
 }

 // Getters and Setters
 public int getId() {
     return id;
 }

 public void setId(int id) {
     this.id = id;
 }

 public String getName() {
     return name;
 }

 public void setName(String name) {
     this.name = name;
 }
}

//Ticket class with ticket details
class Ticket {
 private String source;
 private String destination;
 private Date dateOfJourney;
 private String time;
 private String busNo;
 private String seatNo;

 public Ticket(String source, String destination, Date dateOfJourney, String time, String busNo, String seatNo) {
     this.source = source;
     this.destination = destination;
     this.dateOfJourney = dateOfJourney;
     this.time = time;
     this.busNo = busNo;
     this.seatNo = seatNo;
 }

 // Getters and Setters
 public String getSource() {
     return source;
 }

 public void setSource(String source) {
     this.source = source;
 }

 public String getDestination() {
     return destination;
 }

 public void setDestination(String destination) {
     this.destination = destination;
 }

 // Additional getters and setters can be added for other fields as needed
}

//BookingCounter class to manage booking operations
class BookingCounter {
 public void processBooking(Ticket ticket) {
     System.out.println("Booking processed for ticket from " + ticket.getSource() + " to " + ticket.getDestination());
 }
}

//Refund class to handle refunds
class Refund {
 private float amount;
 private String customerId;

 public Refund(float amount, String customerId) {
     this.amount = amount;
     this.customerId = customerId;
 }

 public void refundAmount() {
     System.out.println("Refunding amount: " + amount + " to customer ID: " + customerId);
 }

 // Getters and Setters
 public float getAmount() {
     return amount;
 }

 public void setAmount(float amount) {
     this.amount = amount;
 }

 public String getCustomerId() {
     return customerId;
 }

 public void setCustomerId(String customerId) {
     this.customerId = customerId;
 }
}

public class Main {
 public static void main(String[] args) {
     // Create a Customer
     Customer customer = new Customer("C001", "John Doe", "123 Main St", "1234567890", 30);
     customer.addDetails();
     customer.modifyDetails();

     // Create an Agent
     Agent agent = new Agent(1, "Agent Smith");
     agent.searchTicket();
     agent.bookTicket();
     agent.cancelTicket();
     agent.makePayment();
     agent.fillDetails();

     // Create a Ticket
     Ticket ticket = new Ticket("City A", "City B", new Date(), "10:00 AM", "B123", "12A");

     // Process booking using BookingCounter
     BookingCounter bookingCounter = new BookingCounter();
     bookingCounter.processBooking(ticket);

     // Create a Refund
     Refund refund = new Refund(50.0f, customer.getCustomerId());
     refund.refundAmount();

     System.out.println("Ticket booking process completed.");
 }
}
