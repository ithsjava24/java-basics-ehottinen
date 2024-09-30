package se.iths.Week2;

//odo: Skapa en klass Employee
//odo: Ge den namn, lön och datum som attribut
//odo: Skapa en metod med lämplig konstruktor
//odo: Skapa get och set metoder för varje attribut förutom datum (den ska inte kunna ändras på)
//odo: Lägg till 3 metoder som heter employmentTime
    //odo: en som saknar parameterar
        //odo: ska beräkna tiden till nuvarande datum LocalDate.now()
    //odo: en som man kan skicka in ett datum till av typen LocalDate
        //odo: beräkna tiden mellan anställning och det inskickade datumet
    //odo: en som tar en String
        //odo: Vad ska göras om inte den innehåller ett giltigt datum?
//odo: alla metoderna ska returnera hur länge anställningen varat
//odo: upprepa inte kod i metoderna, metoderna får anropa varandra

import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.time.temporal.ChronoUnit;

public class Employee {
    static class Employee {
        private final String name;
        private int pay;
        private final LocalDate startDate;

        public Employee(String name, int pay, LocalDate startDate) {
            if (name.isBlank())
                throw new IllegalArgumentException("Name cannot be empty.");
            this.name = name;
            this.pay = pay;
            this.startDate = startDate;
        }
        public String getName() {
            return name;
        }
        public int getPay() {
            return pay;
        }
        public void setPay(int pay) {
            this.pay = pay;
        }
        public int employmentTime(LocalDate d) {
            return (int) startDate.until(d, ChronoUnit.DAYS);
        }
        public int employmentTime() {
            return employmentTime(LocalDate.now());
        }
        public int employmentTime(String bla) {
            try {
                return employmentTime(LocalDate.parse(bla));
            } catch(DateTimeParseException e) {
                System.out.println("Wrong, try again; ");
                throw e;
            }
        }
    }
    public static void main(String[] args) {
        Employee employee = new Employee("James", 5, LocalDate.of(1990, 1, 1));
        System.out.println(employee.employmentTime(LocalDate.now()));
        System.out.println(employee.employmentTime("2021-03-14"));

        System.out.println(employee.getPay());
        employee.setPay(1000);
        System.out.println(employee.getPay());
    }
}
