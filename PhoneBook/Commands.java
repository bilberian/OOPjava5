package OOPjava.HW5.PhoneBook;

import java.util.*;

public class Commands {

    public static void saveContacts(Map<String, String> contacts) {
        for (Map.Entry<String, String> entry : contacts.entrySet()) {
            String line = String.format("%s,\"%s\"",
                            entry.getKey(), entry.getValue().toString().replaceAll("\\[|]", ""));
            System.out.println(line);
        }
    }

    public static void listContacts(Map<String, String> contacts) {
        if (!contacts.isEmpty()) {
            for (Map.Entry<String, String> contact : contacts.entrySet()) {
                System.out.print(contact.getKey() + " (phone number: " + contact.getValue() + ")\n");
            }
        } else {
            System.out.println("No records/contacts found");
        }
        System.out.println("\nEnter command: ");
    }

    public static void searchContact(Map<String, String> contacts, Scanner input) {
        System.out.println("Enter contact name: ");
        String name = input.nextLine();

        if (contacts.containsKey(name)) {
            System.out.print("Found contact: " + name + " (phone number: " + contacts.get(name) + ")\n");
        } else {
            System.out.println("Contact not found");
        }
        System.out.println("\nEnter command: ");
    }

    public static void addContact(Map<String, String> contacts, Scanner input) {
        String name;
        String number;

        System.out.println("Enter contact name:");
        name = input.nextLine();

        if (contacts.containsKey(name)) {
            System.out.println("Enter contact number: ");
            number = input.nextLine();
        } else {
            System.out.println("Enter contact number: ");
            number = input.nextLine();
            contacts.put(name, number);
            saveContacts(contacts);
            System.out.printf("Successfully added '%s' in the phone book\n", name);
        }
        System.out.println("\nEnter command: ");
    }

    public static void editContact(Map<String, String> contacts, Scanner input) {
        System.out.println("Enter contact name to edit: ");
        String name = input.nextLine().trim();

        if (contacts.containsKey(name)) {
            System.out.println("\nEnter new number:");
            String number = input.nextLine();
            contacts.remove(name);
            contacts.put(name, number);
            saveContacts(contacts);
            System.out.printf("Number %s successfully added\n", number);
        } else {
            System.out.printf("Sorry, contact (%s) not found!", name);
        }
        System.out.println("\nEnter command: ");
    }

    public static void deleteContact(Map<String, String> contacts, Scanner input) {
        System.out.println("Enter contact name to delete contact: ");
        String name = input.nextLine();

        if (contacts.containsKey(name)) {
            contacts.remove(name);
            saveContacts(contacts);
            System.out.printf("Contact (%s) successfully deleted", name);
        } else {
            System.out.printf("Sorry, contact (%s) not found", name);
        }
        System.out.println("\nEnter command: ");
    }
}
