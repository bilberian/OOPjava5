package OOPjava.HW5.PhoneBook;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Map<String, String> contacts = new TreeMap<>();
        Commands.listContacts(contacts);
        Menu.showCommands();
        
        Scanner input = new Scanner(System.in);
        String command = input.nextLine();

        if (!command.equals("q")) {
            switch (command) {
                case "1":
                    Commands.listContacts(contacts);
                    break;
                case "2":
                    Commands.searchContact(contacts, input);
                    break;
                case "3":
                    Commands.addContact(contacts, input);
                    break;
                case "4":
                    Commands.editContact(contacts, input);
                    break;
                case "5":
                    Commands.deleteContact(contacts, input);
                    break;
                default:
                    System.out.println("Invalid command");
                    break;
            }
            command = input.nextLine();
        }
        else if(command.equals("q")) {
            System.out.println("Goodbye");
        };
    }
}
