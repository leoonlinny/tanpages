package contacts;
import java.util.Scanner;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;


public class contactsApp {
    public static void main(String[] args) {

        String filename = "contacts.txt";
        try {
            // Check for contacts.txt and create if it does not exist
            Path dataFile = Paths.get(filename);
            if (!Files.exists(dataFile)) {
                System.out.println("Your new file has been created ");
                Files.createFile(dataFile);
            }
        } catch (IOException iox) {
            iox.printStackTrace();
        }
//        Path contacts = Paths.get("data", "contacts.txt");
//
//        List<String> contactsList = new ArrayList<>();

//        contactsList.add("nooooooo");


//        leos code: public static void getAllMoviesFromCategory(String number;number, contacts[] contactsManager){
//            for (ContactsApp contacts: movies){
//                if (number.equals(contactsManager.getNumber())){
//                    System.out.printf("%s -- %s%n", contactsList.toArray(new String[0]));
//                }
//            }
//        }
//        public static Contacts[] addContact (Contacts newContact, Contacts[]contactsList){
//            Contacts[] newContactsArray = new Contacts[contactsList.length + 1];
//            for (int i = 0; i < contactsList.length; i++) {
//                newContactArray[i] = contactsList[i];
//            }
//            newContactArray[newContactArray.length - 1] = newContact;
//            return newContactArray;
//        }
//        try {
//            contactsList = Files.readAllLines(contacts);
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
//        Input input = new Input();
//        List<String> contacts = Files.readAllLines(Paths.get("contacts.txt"));
//        int userChoice = -1;
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("");
            System.out.println("What would you like to do?");
            System.out.println("0. Exit.");
            System.out.println("1. View contacts.");
            System.out.println("2. Add a new contact.");
            System.out.println("3. Search a contact by name.");
            System.out.println("4. Search a contact by number.");
            System.out.println("5. Delete an existing contact.");
            System.out.println("Enter an option (0, 1, 2, 3, 4, or 5)");

            String userChoice = scanner.nextLine();

            if (userChoice.equals("0")) {
                System.out.println("Exiting out");
                break;
            }
            switch (userChoice) {
//                case "1":
////                    getAllContacts();
////                    break;
//                case "2":
//                    input.userChoice();
//                    String nameOfContactToAdd = input.getString("Enter the name of the contact you want to add: ");
//                    String numberOfContactToAdd = input.getString("Enter the number of the contact you want to add:");
//                    Contacts newContact = new Contacts(nameOfContactToAdd, numberOfContactToAdd);
//                    contacts = addContact(newContact, contacts);
//                    break;
//                case "3":
//                    getAllContactsFromName("Name", contacts);
//                    break;
                case "4":
                    getAllContactsFromNumber();
                    break;
//                case "5":
////                    delete contact
////                    getAllMoviesFromCategory("scifi", movies);
//                    break;
            } // end switch statement
            // end while loop

        }
    }

    // number 1
//    private static void getAllContacts() {
//        List<String> contactList = Files.readAllLines(Paths.get("contacts.txt"));
//    }


    // number 4.
    private static void getAllContactsFromNumber() {
        try{
            List<String> contact = Files.readAllLines(Paths.get("contacts.txt"));
            for (String contacts : contact) {
                System.out.println(contact);
//                for (Contacts contacts: contactsList){
//                if (number.equals(contact.getNumber())) {
////                    System.out.printf("%s -- %s%n", contactsList.getName(), contactsList.getNumber());
//                }
            }
        }catch (IOException iox) {
            iox.printStackTrace();
        }
    }
} // end main method





