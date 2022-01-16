package com.bridgelabz;
import  java.util.Scanner;
import java.util.HashMap;

public class AddressBookMain {

    public static void main(String[] args) {

        System.out.println("Welcome to Address Book System problem");
        AddressBook addressBook = new AddressBook();  //object of addressbook class for managing contacts
        Contacts contacts = addressBook.addNewContact();
        addressBook.showContactDetails(contacts);

        System.out.println("Enter Yes or No");

        int choice;     //variable for users choice

 // show menu for user input to select choices

        AddressBook addressBook = new AddressBook(); //object of addressbook class for managing contacts
         // show menu for user input to select choices

        do {
            System.out.println("****AddressBook Management****");
            System.out.println("1.Add New Contact \n 2.Edit Contact Details \n 3.Delete Contact Details" + "\n 4.Display Contact Details \n 5.Exit");
            System.out.println("Please select the choice: ");
            choice = addressBook.sc.nextInt();

            switch (choice) {
                case 1:
                    addressBook.addNewContact(); // adding new contact detail
                    break;
                case 2:
                    addressBook.editContactDetail(); // editing existing contact detail
                    break;
                case 3:
                    addressBook.deteleContact();    // delete contact details from address book
                    break;
                case 4:
                    addressBook.showContactDetails(); // displaying contact details
                    break;
                case 5:
                    System.out.println("Thanks for using AddressBook");
                default:
                    System.out.println("Please select choice between 1 to 5");
                    break;
            }
        }
        while(choice != 5);
    }
}
