package com.bridgelabz;

import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;


public class AddressBookFile {

    static Map<String, AddressBook> addressBookMap = new HashMap<>();

    static Scanner sc = new Scanner(System.in);


    public static void addNewAddressBook() {
        System.out.println("Enter the Name of Address Book:");
        String addressbookName = sc.next();
        if(addressBookMap.containsKey(addressbookName)) {
            System.out.println("Entered AddressBook is already available in the system");
        } else {
            AddressBook addressBook = new AddressBook();
            addressBookMap.put(addressbookName,addressBook);
        }
    }

    public static void displayAddressBooks() {
        for(String key: addressBookMap.keySet()){
            System.out.println(key);
        }
    }

    public static void selectAddressBook() {
        displayAddressBooks();
        System.out.println("Enter the name of AddressBook:");
        String addressbookName = sc.next();
        if(addressBookMap.containsKey(addressbookName)) {
            addressBookMap.get(addressbookName).contactOptions(addressBookMap.get(addressbookName));
        } else {
            System.out.println("Entered AddressBook name is not available");
        }
    }

    public static void editAddressBook() {
        displayAddressBooks();
        System.out.println("Enter the name of AddressBook :");
        String addressbookName = sc.next();
        if(addressBookMap.containsKey(addressbookName)) {
        } else {
            System.out.println("Entered AddressBook name is not available");
        }
    }

    public static void deleteAddressBook() {
        displayAddressBooks();
        System.out.println("Enter the AddressBook Name :");
        String addressbookName = sc.next();
        if(addressBookMap.containsKey(addressbookName)) {
            addressBookMap.remove(addressbookName);
            System.out.println("AddressBook is deleted");
        } else {
            System.out.println("Entered AddressBook name is not available");
        }
    }
    public static final int userInput() {
        return sc.nextInt();
    }
}