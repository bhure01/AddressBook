package com.bridgelabz;

import java.util.Scanner;

public class AddressBook {

    Scanner sc = new Scanner(System.in);    // screated scanner class object for user input

    Contacts contacts = new Contacts();     // created object for Contacts class for getter setter methods

    //creating method to add a new contact into addree book

    public Contacts addNewContact() {

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
        System.out.println("Enter the phone number ; ");
        String phoneNo = sc.next();
        contacts.setPhoneNo(phoneNo);
        System.out.println("Enter the email ID : ");
        String eMail = sc.next();
        contacts.seteMail(eMail);

        return contacts;
    }

    // created method to display the added contact details
    public void showContactDetails(Contacts contacts) {
        System.out.println("Display Contact Details :- ");
        System.out.println("First Name :- " +contacts.getFirstName());
        System.out.println("Last Name :- " +contacts.getLastName());
        System.out.println("Address :- " + contacts.getAddress());
        System.out.println("City :- " +contacts.getCity());
        System.out.println("Zip Code :- " +contacts.getZipCode());
        System.out.println("State :- " +contacts.getState());
        System.out.println("Phone Number :- " +contacts.getPhoneNo());
        System.out.println("Email ID :- " +contacts.geteMail());
    }
}
