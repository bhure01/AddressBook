package com.bridgelabz;

import javax.management.AttributeList;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class AddressBook {

    Scanner sc = new Scanner(System.in);    // screated scanner class object for user input
    Contacts contacts = new Contacts();   // created object for Contacts class for getter setter methods

    List<Contacts> list = new ArrayList<Contacts>();
//    LinkedList list1 = new LinkedList();

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

        list.add(contacts);
    }

    // UC2-created method to display the added contact details
    public void showContactDetails() {
       for (Contacts contact:list) {
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
        if(!firstName.equalsIgnoreCase(contacts.getFirstName())) {
            System.out.println("Entered First Name details is not available in AddressBook");
        } else {
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
        }
    }
}
