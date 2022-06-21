package contacts;

import util.Input;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;


public class ContactsApp {
    public static void main(String[] args) throws IOException {
//        Scanner scanner = new Scanner(System.in);
//
//        String userChoice = scanner.nextLine();

        Path contacts = Paths.get("data", "contacts.txt");

        List<String> contactsList = new ArrayList<>();

        contactsList.add("nooooooo");

        public static void getAllContactsFromNumber(String( number, Contacts[]contactsList){
            for (String contact : contactsList) {
//                for (Contacts contacts: contactsList){
                if (number.equals(contact.getNumber())) {
                    System.out.printf("%s -- %s%n", contact.getName(), contact.getNumber());
                }
            }
        }
//        leos code: public static void getAllMoviesFromCategory(String number;number, contacts[] contactsManager){
//            for (ContactsApp contacts: movies){
//                if (number.equals(contactsManager.getNumber())){
//                    System.out.printf("%s -- %s%n", contactsList.toArray(new String[0]));
//                }
//            }
//        }
        public static Contacts[] addContact (Contacts newContact, Contacts[]contactsList){
            Contacts[] newContactsArray = new Contacts[contactsList.length + 1];
            for (int i = 0; i < contactsList.length; i++) {
                newContactArray[i] = contactsList[i];
            }
            newContactArray[newContactArray.length - 1] = newContact;
            return newContactArray;
        }
//        try {
//            contactsList = Files.readAllLines(contacts);
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
        Input input = new Input();
        List<String> contacts = Files.readAllLines(Paths.get("contacts.txt"));
        int userChoice = -1;
        while (userChoice != 0) {
            System.out.println("");
            System.out.println("What would you like to do?");
        System.out.println("0. Exit.");
        System.out.println("1. View contacts.");
        System.out.println("2. Add a new contact.");
        System.out.println("3. Search a contact by name.");
        System.out.println("4. Search a contact by number.");
        System.out.println("5. Delete an existing contact.");
        System.out.println("Enter an option (0, 1, 2, 3, 4, or 5)");
            userChoice = input.getInt("Enter your choice: ");
            switch (userChoice) {
                case 0:
                    break;
                case 1:
                    for (Path contacts : contacts) {
                        System.out.printf("%s -- %s%n", contact.getName(),contact.getNumber());
                    }
                    break;
//                case 2:
//                    input.userChoice();
//                    String nameOfContactToAdd = input.getString("Enter the name of the contact you want to add: ");
//                    String numberOfContactToAdd = input.getString("Enter the number of the contact you want to add:");
//                    Contacts newContact = new Contacts(nameOfContactToAdd, numberOfContactToAdd);
//                    contacts = addContact(newContact, contacts);
//                    break;
//                case 3:
//                    getAllContactsFromName("Name", contacts);
//                    break;
//                case 4:
//                    getAllContactsFromNumber("Number",contacts);
//                    break;
//                case 5:
////                    delete contact
////                    getAllMoviesFromCategory("scifi", movies);
//                    break;
            } // end switch statement
        } // end while loop

    } // end main method


//        for(String contact: contactsList){
//            System.out.println(contact);
//



//


//
    } // end main method
//} // end class

