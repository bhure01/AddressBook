package com.bridgelabz;
import  java.util.Scanner;

public class AddressBookMain {
    public static void main(String[] args) {
        System.out.println("Welcome to Address Book System problem");
        AddressBook addressBook = new AddressBook();  //object of addressbook class for managing contacts

        int choice;     //variable for users choice

//         // show menu for user input to select choices
        do {
            System.out.println("****AddressBook Management****");
            System.out.println("1.Add New AddressBook\n 2.Edit AddressBook\n 3.Delete AddressBook" + "\n 4.Display AddressBook \n 5.Select AddressBook\n 6. Exit");
            System.out.println("Please select the choice: ");
            choice = AddressBookFile.userInput();

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
                    System.out.println("Thank You for using Address Book System.");
                    break;
                default:
                    System.out.println("Please Select choice only between 1 to 6");
                    break;
            }
        }
        while( choice != 6 );
    }
}