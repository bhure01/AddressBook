package com.bridgelabz;
import  java.util.Scanner;

public class AddressBookMain {
    public static void main(String[] args) {
        System.out.println("Welcome to Address Book System problem");
        AddressBook addressBook = new AddressBook();
        Contacts contacts = addressBook.addNewContact();
        addressBook.showContactDetails(contacts);
    }
}
