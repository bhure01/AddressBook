package com.bridgelabz;

import java.util.Scanner;
import java.util.ArrayList;

public class AddressBook {

    //Scanner object for User Input
    Scanner sc = new Scanner(System.in);
    Contacts contacts = new Contacts();   // created object for Contacts class for getter setter methods
    int choice;
    ArrayList<Contacts> contactList = new ArrayList<>();

    //Method to Add New Contact to AddressBook
    public void addNewContact() {
        System.out.println("Enter the following Contact Details -");
        System.out.println("Enter the First Name :");
        contacts.setFirstName(sc.next());
        System.out.println("Enter the Last Name :");
        contacts.setLastname(sc.next());
        System.out.println("Enter the Address :");
        contacts.setAddress(sc.next());
        System.out.println("Enter the City :");
        contacts.setCity(sc.next());
        System.out.println("Enter the State :");
        contacts.setState(sc.next());
        System.out.println("Enter the Zip Code :");
        contacts.setZip(sc.next());
        System.out.println("Enter the Phone Number :");
        contacts.setPhoneNo(sc.next());
        System.out.println("Enter the EMail ID :");
        contacts.setEmailID(sc.next());
        contactList.add(contacts);
    }

    //Method to Show the Contact Details
    public void displayContact() {
        for(Contacts contact : contactList) {
            if (contact.getFirstName() == null) {
                System.out.println("Contact Details Not Available");
            } else {
                System.out.println("Contact Details -");
                System.out.println("First Name : " + contact.getFirstName());
                System.out.println("Last Name : " + contact.getLastname());
                System.out.println("Address : " + contact.getAddress());
                System.out.println("City : " + contact.getCity());
                System.out.println("State : " + contact.getState());
                System.out.println("Zip Code : " + contact.getZip());
                System.out.println("Phone Number : " + contact.getPhoneNo());
                System.out.println("EMail ID : " + contact.getEmailID());
            }
        }
    }


    //Method to Edit the Existing Contact
    public void editContact() {
        //Get First Name to Edit the Contact
        System.out.println("Enter the First Name : ");
        String firstName = sc.next();

        //check if the Given User with First Name
        boolean isAvailable = false;
        for(Contacts contact : contactList) {
            if (firstName.equalsIgnoreCase(contact.getFirstName())) {
                isAvailable = true;
                System.out.println("Enter the Last Name :");
                contact.setLastname(sc.next());
                System.out.println("Enter the Address :");
                contact.setAddress(sc.next());
                System.out.println("Enter the City :");
                contact.setCity(sc.next());
                System.out.println("Enter the State :");
                contact.setState(sc.next());
                System.out.println("Enter the Zip Code :");
                contact.setZip(sc.next());
                System.out.println("Enter the Phone Number :");
                contact.setPhoneNo(sc.next());
                System.out.println("Enter the EMail ID :");
                contact.setEmailID(sc.next());
                break;
            }
        }
        if(!isAvailable) {
            System.out.println("Contact Number Not Found.");
        }
    }

    //Method to Delete the Existing Contact
    public void deleteContact() {
        //Get First Name to Edit the Contact
        System.out.println("Enter the First Name : ");
        String firstName = sc.next();

        //check if the Given User with First Name
        boolean isAvailable = false;
        for(Contacts contact : contactList) {
            if (firstName.equalsIgnoreCase(contact.getFirstName())) {
                isAvailable = true;
                contactList.remove(contact);
                System.out.println("Contact deleted");
                break;
            }
        }
        if(!isAvailable) {
            System.out.println("Contact number is not available");
         }
    }

    public void contactOptions(AddressBook addressBook) {
        //Show Menu for user to Select Operation on AddressBook
        do {

            System.out.println("----- ADDRESS BOOK SYSTEM ------");
            System.out.println("1. Add New Contact\n2. Edit Contact Details\n3. Delete Contact" +
                    "\n4. Display Contact\n5. Exit");
            System.out.println("Please select your choices: ");

            choice = addressBook.sc.nextInt();

            switch (choice) {
                case 1:
                    addressBook.addNewContact();       //Adding the new contact details
                    break;
                case 2:
                    addressBook.editContact();        //Editing the contact details
                    break;
                case 3:
                    addressBook.deleteContact();      //Deleting the contact details
                    break;
                case 4:
                    addressBook.displayContact();     //Displaying the contact details
                    break;
                case 5:
                    System.out.println("Thanks for using the Address Book");
                    break;
                default:
                    System.out.println("Please select the choices between only 1 to 5 only");
                    break;
              
            }
        }
        while( choice != 5 );
    }
}