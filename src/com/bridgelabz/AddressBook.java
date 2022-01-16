package com.bridgelabz;

import java.util.ArrayList;
import javax.management.AttributeList;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class AddressBook {

    Scanner sc = new Scanner(System.in);    // screated scanner class object for user input
    Contacts contacts = new Contacts();   // created object for Contacts class for getter setter methods
    Contacts contacts = new Contacts();     // created object for Contacts class for getter setter methods

    ArrayList<Contacts> contactList = new ArrayList<Contacts>();

    int choice;


    //creating method to add a new contact into addree book

    public void addNewContact() {
        System.out.println("Please enter the below contact details");
        System.out.println("Enter the first name : ");
        String firstName = sc.nextLine();
        contacts.setFirstName(firstName);
        System.out.println("Enter last name : ");
        String lastName = sc.nextLine();
        contacts.setLastName(lastName);
        System.out.println("Enter the address : ");
        String address = sc.nextLine();
        contacts.setAddress(address);
        System.out.println("Enter the city : ");
        String city = sc.next();
        contacts.setCity(city);
        System.out.println("Enter the zip code : ");
        String zipCode = sc.next();
        contacts.setZipCode(zipCode);
        System.out.println("Enter the state : ");
        String state = sc.next();
        contacts.setState(state);
        System.out.println("Enter the phone number : ");
        String phoneNo = sc.next();
        contacts.setPhoneNo(phoneNo);
        System.out.println("Enter the email ID : ");
        String eMail = sc.next();
        contacts.seteMail(eMail);
      
        contactList.add(contacts);

}

    // UC-2 created method to display the added contact details
    public void showContactDetails(Contacts contacts) {

        for (Contacts contact : contactList) {

            System.out.println("Display Contact Details :- ");
            System.out.println("First Name :- " + contacts.getFirstName());
            System.out.println("Last Name :- " + contacts.getLastName());
            System.out.println("Address :- " + contacts.getAddress());
            System.out.println("City :- " + contacts.getCity());
            System.out.println("Zip Code :- " + contacts.getZipCode());
            System.out.println("State :- " + contacts.getState());
            System.out.println("Phone Number :- " + contacts.getPhoneNo());
            System.out.println("Email ID :- " + contacts.geteMail());
        }
    }


    // UC2-created method to display the added contact details
    public void showContactDetails() {
       for (Contacts contact:contactlist) {
           System.out.println("Display Contact Details :- ");
           System.out.println("First Name :- " + contact.getFirstName());
           System.out.println("Last Name :- " + contact.getLastName());
           System.out.println("Address :- " + contact.getAddress());
           System.out.println("City :- " + contact.getCity());
           System.out.println("Zip Code :- " + contact.getZipCode());
           System.out.println("State :- " + contact.getState());
           System.out.println("Phone Number :- " + contact.getPhoneNo());
           System.out.println("Email ID :- " + contact.geteMail());
       }
    }


    // UC3-Creating method to edit an existing contact
    public void editContactDetail() {
        // use first name to edit the contact
        System.out.println("Enter the first name :- ");
        String firstName = sc.nextLine();

        // checking for valid user input

        boolean isAvailable = false;
        for(Contacts contact : contactList) {
            if (firstName.equalsIgnoreCase(contact.getFirstName())) {
                isAvailable = true;

            System.out.println("Enter last name :- ");
            contacts.setLastName(sc.nextLine());
            System.out.println("Enter Address ;-");
            contacts.setAddress(sc.nextLine());
            System.out.println("Enter City :");
            contacts.setCity(sc.nextLine());
            System.out.println("Enter ZipCode:");
            contacts.setZipCode(sc.next());
            System.out.println("Enter State: ");
            contacts.setState(sc.next());
            System.out.println("Enter Phone Number: -");
            contacts.setPhoneNo(sc.next());
            System.out.println("Enter mail ID : ");
            contacts.seteMail(sc.next());
            break;
        }
    }
        if(!isAvailable) {
            System.out.println("Contact Number Not Found.");
        }
    }

    // uc4- created method to delete an existing contact
    public void deteleContact() {
        System.out.println("Enter first neme : ");  // use first name of contact to delete
        String firstName = sc.nextLine();
        // check for user input with first name whether available or not
        boolean isAvailable = false;
        for(Contacts contact : contactList) {
            if (firstName.equalsIgnoreCase(contact.getFirstName())) {
                isAvailable = true;
                contactList.remove(contact);
                System.out.println("Contact Deleted.");
                break;
            }
        }
        if(!isAvailable) {
            System.out.println("Contact Number Not Found.");
        }
    }

    public void contactOptions(AddressBook addressBook) {
        //Show Menu for user to Select Operation on AddressBook
        do {
            System.out.println("***** ADDRESS BOOK MANAGEMENT *****");
            System.out.println("1. ADD NEW CONTACT\n 2. EDIT CONTACT\n 3. DELETE CONTACT" +
                    "\n 4. DISPLAY CONTACT\n 5. EXIT");
            System.out.println("Please Select the Operation Number : ");
            choice = addressBook.sc.nextInt();

            switch (choice) {
                case 1:
                    addressBook.addNewContact();    //Adding New Contact Details
                    break;
                case 2:
                    addressBook.editContactDetail();  //Edit Contact Details
                    break;
                case 3:
                    addressBook.deteleContact();    //Delete the Contact Details
                    break;
                case 4:
                    addressBook.showContactDetails(contacts);   //Show Contact Details
                    break;
                case 5:
                    System.out.println("Thank You for Using Address Book.");
                    break;
                default:
                    System.out.println("Please Select the Operation between 1 to 5 only.");
                    break;
            }
        }
        while( choice != 5 );
    }
}
