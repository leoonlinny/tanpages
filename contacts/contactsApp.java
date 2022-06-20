package contacts;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class contactsApp {
    public static void main(String[] args) {

        System.out.println("1. View contacts.");
        System.out.println("2. Add a new contact.");
        System.out.println("3. Search a contact by name.");
        System.out.println("4. Delete an existing contact.");
        System.out.println("5. Exit");
        System.out.println("Enter an option (1, 2, 3, 4, or 5)");

        Scanner scanner = new Scanner(System.in);

        String userChoice = scanner.nextLine();

        Path contacts = Paths.get("data","contacts.txt");

        List<String> contactsList = new ArrayList<>();


        try{
          contactsList = Files.readAllLines(contacts);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        for(String contact: contactsList){
            System.out.println(contact);


        }



    }

}
