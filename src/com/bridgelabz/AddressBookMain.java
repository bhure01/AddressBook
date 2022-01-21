package com.bridgelabz;

import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;

public class AddressBookMain {



    public static void main(String[] args) {

        System.out.println("Welcome to Address Book System Program");

        int choice = AddressBookFile.userInput();

        do {
                //Displaying AddressBOok Menu to users for selecting the choices
            System.out.println("------ ADDRESS BOOK SYSTEM -------");
            System.out.println("1.Add New Address Book\n2. Edit Address Book\n3. Delete Address Book" +
                    "\n4. Display Address Book\n5. Select Address Book\n6. Exit");
            System.out.println("Please Select the Choices : ");


            switch (choice) {
                case 1:
                    AddressBookFile.addNewAddressBook();    //Adding New Address Book to System
                    break;
                case 2:
                    break;
                case 3:
                    AddressBookFile.deleteAddressBook();    //Delete the Address Book Details
                    break;
                case 4:
                    AddressBookFile.displayAddressBooks();  //Show Contact Details
                    break;
                case 5:
                    AddressBookFile.selectAddressBook();
                    break;
                case 6:
                    System.out.println("Thanks for using Address Book");
                    break;
                default:
                    System.out.println("Please select your choices between only 1 to 6");
                    break;
            }
        }
        while( choice != 6 );
    }
}