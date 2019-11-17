package ex1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Map;
import java.util.Scanner;

public class CountriesTest {
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new FileReader(new File("countries.csv")))) {
            Map<String, Country> countryMap = getCountry(br);
            System.out.println("Kody krajów dostępne w bazie: " + countryMap.keySet());
        } catch (IOException | InputMismatchException | ArrayIndexOutOfBoundsException ex) {
            System.err.println(ex);
        }
    }

    private static void printCountry(Map<String, Country> customerMap) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj kod kraju,o którym chcesz wyświetlić informacje");
        int indeks = scanner.nextInt();
        if (customerMap.containsKey(indeks)) {
            System.out.println(customerMap.get(indeks));
        } else {
            System.out.println("Podany kod kraju nie istnieje");
        }
    }


    private static Map<String, Country> getCountry(BufferedReader br) throws IOException {
        Map<String, Country> countryMap = new HashMap<>();
        String line;
        while ((line = br.readLine()) != null) {
            String[] country = line.split(";");
            String code = country[0];
            int population = Integer.parseInt(country[2]);
            countryMap.put(code, new Country(code, country[1], population));
        }
        return countryMap;
    }
}
