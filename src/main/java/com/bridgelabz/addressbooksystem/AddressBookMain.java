package com.bridgelabz.addressbooksystem;

import java.util.Scanner;

public class AddressBookMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        AddressBook addressBook = new AddressBook();
        System.out.println("Welcome to Address Book System");

        while (true) {
            System.out.println("1. Add Contact");
            System.out.println("2. Display Contacts");
            System.out.println("3. Edit Contact");
            System.out.println("4. Exit");
            System.out.println("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    addressBook.addContactToAddressBook();
                    break;
                case 2:
                    addressBook.displayContactDetails();
                    break;
                case 3:
                    addressBook.editExistingContact();
                    break;
                case 4:
                    break;
                default:
                    System.out.println("Invalid Choice");
                    break;
            }
        }
    }
}