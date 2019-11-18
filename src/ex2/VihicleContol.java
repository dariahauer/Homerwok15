package ex2;

import java.util.InputMismatchException;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class VihicleContol {
    public static void main(String[] args) {
        Queue<Vehicle> vehicleQueue = new LinkedList<>();
        vehicleQueue.offer(new Vehicle("tir", "Iveco", "model1", 2010, 500000, "SDFDSG56576"));
        vehicleQueue.offer(new Vehicle("osobowy", "KIA", "Picasso", 2008, 780000, "TUTYU6868868"));
        vehicleQueue.offer(new Vehicle("osobowy", "Fiat", "Punto", 2011, 459998, "GJTGHK5756858"));

        vehicleControlQueeMainenance(vehicleQueue);
    }

    private static void vehicleControlQueeMainenance(Queue<Vehicle> vehicleQueue) {

        Scanner scanner = new Scanner(System.in);
        System.out.println(" Please enter the program options : 1 - add new vehicle to the quee, 2 - select vehicle from the quee, 0 - End the program ");
        int userSelection = scanner.nextInt();
        switch (userSelection) {
            case 0:
                System.out.println("Program closed");
                break;
            case 1:
                addVehicle(vehicleQueue);
                break;
            case 2:
                takeToDiagnostic(vehicleQueue);
                break;
            default:
                System.out.println("Selected option is incorrect, please enter the correct option listed on the list below");
        }
    }

    private static void addVehicle(Queue vehicleQueue) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter vehicle type: ");
        try {
            String type = scan.nextLine();
            System.out.println("Enter producer: ");
            String producer = scan.nextLine();
            System.out.println("Enter model: ");
            String model = scan.nextLine();
            System.out.println("Enter production year: ");
            int year = scan.nextInt();
            scan.nextLine();
            System.out.println("Enter distance: ");
            int distance = scan.nextInt();
            scan.nextLine();
            System.out.println("Enter VIN: ");
            String vin = scan.nextLine();
            vehicleQueue.offer(new Vehicle(type, producer, model, year, distance, vin));
        } catch (InputMismatchException ex) {
            System.err.println("Incorect value entered");
        }
    }

    private static void takeToDiagnostic(Queue vehicleQueue) {
        System.out.println("Vehicle is taken to diagnostic: " + vehicleQueue.poll());
    }
}


