package com.bridgelabz.addressbooksystem;

import java.util.ArrayList;
import java.util.*;

public class AddressBook {
    Contact contact = new Contact();
    ArrayList<Contact> contactArrayList = new ArrayList<>();

    public void addContactToAddressBook() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Contact First Name");
        String firstName = scanner.next();

        System.out.println("Enter Contact Last Name");
        String lastName = scanner.next();

        System.out.println("Enter Contact Address Details");
        String address = scanner.next();

        System.out.println("Enter Contact City Name");
        String city = scanner.next();

        System.out.println("Enter Contact State Name");
        String state = scanner.next();

        System.out.println("Enter Contact Zip");
        String zip = scanner.next();

        System.out.println("Enter Contact Phone Number");
        String phoneNumber = scanner.next();

        System.out.println("Enter Contact Email");
        String email = scanner.next();

        Contact contact1 = new Contact(firstName, lastName, address, city, state, zip, phoneNumber, email);
        contactArrayList.add(contact1);

        System.out.println("Contact Details Added Successfully");
    }

    public void displayContactDetails() {
        if (contactArrayList.size() == 0) {
            System.out.println("No contacts in Address Book");
            System.out.println("");
        } else {
            for (Contact c : contactArrayList) {
                System.out.print("");
                System.out.print("");
                System.out.println("First Name : " + c.getFirstName());
                System.out.println("Last Name : " + c.getLastName());
                System.out.println("Address : " + c.getAddress());
                System.out.println("City : " + c.getCity());
                System.out.println("State : " + c.getState());
                System.out.println("Zip : " + c.getZip());
                System.out.println("Phone Number : " + c.getPhoneNumber());
                System.out.println("Email : " + c.getEmail());
                System.out.println("");
                System.out.print("");

            }
        }
    }

    public Contact findContact(String firstName) {
        for (Contact contact : contactArrayList) {
            if (contact.getFirstName().equals(firstName)) {
                return contact;
            }
        }
        return null;
    }

    public void deleteContact() {
        Scanner sd = new Scanner(System.in);
        String firstName = sd.next();
        Contact contact = findContact(firstName);
        if (contact != null) {
            contactArrayList.remove(contact);
            System.out.println("Contact deleted successfully!");
        } else {
            System.out.println("Contact not found!");
        }
    }
}

    public void editExistingContact() {
        if (contactArrayList.size() == 0) {
            System.out.println("No contacts in Address Book to edit");
        } else {
            Scanner se = new Scanner(System.in);
            System.out.println("Enter First Name Edit Contact Details");
            String firstName = se.next();
            for (Contact c : contactArrayList) {
                if (c.getFirstName().equalsIgnoreCase(firstName)) {
                    System.out.print("\t1. First Name");
                    System.out.print("\t2. Last Name");
                    System.out.print("\t3. Address");
                    System.out.print("\t4. City");
                    System.out.print("\t5. State");
                    System.out.print("\t6. Zip");
                    System.out.print("\t7. Phone Number");
                    System.out.print("\t8. Mail");
                    System.out.print("\t9. All");
                    System.out.print("\t10. Exit\n");
                    System.out.println("Enter your choice to edit respective details: ");
                    int editOption = se.nextInt();
                    switch (editOption) {
                        case 1:
                            System.out.println("Enter new First Name ");
                            Scanner sf = new Scanner(System.in);
                            String newFirstName = sf.next();
                            c.setFirstName(newFirstName);
                            System.out.println("First Name Edited Successfully");
                            break;
                        case 2:
                            System.out.println("Enter new Last Name ");
                            Scanner sl = new Scanner(System.in);
                            String newLastName = sl.next();
                            c.setLastName(newLastName);
                            System.out.println("Last Name Edited Successfully");
                            break;
                        case 3:
                            System.out.println("Enter new Address ");
                            Scanner sa = new Scanner(System.in);
                            String newAddress = sa.next();
                            c.setAddress(newAddress);
                            System.out.println("Address Edited Successfully");
                            break;
                        case 4:
                            System.out.println("Enter new City ");
                            Scanner sc = new Scanner(System.in);
                            String newCity = sc.next();
                            c.setCity(newCity);
                            System.out.println("City Edited Successfully");
                            break;
                        case 5:
                            System.out.println("Enter new State ");
                            Scanner ss = new Scanner(System.in);
                            String newState = ss.next();
                            c.setState(newState);
                            System.out.println("State Edited Successfully");
                            break;
                        case 6:
                            System.out.println("Enter new Zip ");
                            Scanner sz = new Scanner(System.in);
                            String newZip = sz.next();
                            c.setZip(newZip);
                            System.out.println("Zip Edited Successfully");
                            break;
                        case 7:
                            System.out.println("Enter new Phone Number ");
                            Scanner sp = new Scanner(System.in);
                            String newPhone = sp.next();
                            c.setPhoneNumber(newPhone);
                            System.out.println("Phone Number Edited Successfully");
                            break;

                        case 8:
                            System.out.println("Enter new Email ");
                            Scanner sem = new Scanner(System.in);
                            String newEmail = sem.next();
                            c.setPhoneNumber(newEmail);
                            System.out.println("Email Edited Successfully");
                            break;

                        case 9:
                            Scanner sall = new Scanner(System.in);

                            System.out.println("Enter Contact New First Name");
                            String newFirstname = sall.next();
                            c.setFirstName(newFirstname);

                            System.out.println("Enter Contact New Last Name");
                            String lastName = sall.next();
                            c.setLastName(lastName);

                            System.out.println("Enter Contact New Address Details");
                            String address = sall.next();
                            c.setAddress(address);

                            System.out.println("Enter Contact New City Name");
                            String city = sall.next();
                            c.setCity(city);

                            System.out.println("Enter Contact New State Name");
                            String state = sall.next();
                            c.setState(state);

                            System.out.println("Enter Contact New Zip");
                            String zip = sall.next();
                            c.setZip(zip);

                            System.out.println("Enter Contact Phone Number");
                            String phoneNumber = sall.next();
                            c.setPhoneNumber(phoneNumber);

                            System.out.println("Enter Contact New Email");
                            String email = sall.next();
                            c.setEmail(email);
                            break;
                        case 10:
                            System.exit(1);
                            break;
                        default:
                            System.out.println("Invalid option");
                            break;
                    }
                }
            }
        }
    }
}
