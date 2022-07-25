import java.util.ArrayList;
import java.util.Scanner;
import java.util.Arrays;

/* 
 * PhoneBook class
 * CSE 174 fall 2019
 * ETHAN GUTKNECHT
 * SECTION G
 * 
 * The PhoneBook class simulates a simple phone book application.
 * Copyright(C) Nov 2019
 */

public class PhoneBook {
  public static void add(ArrayList<ContactInfo> list, String name, String label, String pNum) {
    boolean contactFound = false;
    for (int i = 0; i < list.size(); i++){
      if (name.equals(list.get(i).getName())) contactFound = true;
    }

    if (contactFound == false){
      Phone newPhone = new Phone(label, pNum);
      ArrayList<Phone> newContactPhoneNumbers = new ArrayList<Phone>();
      newContactPhoneNumbers.add(newPhone);
      ContactInfo newContact = new ContactInfo();
      newContact = new ContactInfo(name, newContactPhoneNumbers);
      list.add(newContact);
      System.out.println("*The contact has been added successfully*");
    }
    else System.out.println("The name already exists!");
  } 
  
  
  public static void append(ArrayList<ContactInfo> list, String name, String label, String pNum) { 
    boolean foundName = false;
    boolean duplicates = false;
    for (int i = 0; i < list.size(); i++){ //finds contact in list of contacts
      if (name.equalsIgnoreCase(list.get(i).getName())) { //Finds name
        foundName = true;
        for (int b = 0; b < list.get(i).getPhones().size(); b++){ //lists phone numbers for duplicates
          if (label.equalsIgnoreCase(list.get(i).getPhones().get(b).getLabel())) duplicates = true;
          if ( pNum.equalsIgnoreCase(list.get(i).getPhones().get(b).getPhonNum())) duplicates = true;
        }
        if (duplicates == true) break; //break loops if there are duplicates
        else {
          Phone newPhoneToAdd = new Phone(label, pNum);
          list.get(i).getPhones().add(newPhoneToAdd);
          System.out.println("*The number has been added successfully*");
        }
      }
    }
    if (foundName ==  false) System.out.println("Couldn't find the name"); //failed
    if (duplicates == true) System.out.println("The label/number already exists for this person!"); //failed
  } 
  
  
  public static void display(ArrayList<ContactInfo> list, String name) { 
    boolean successful = false;
      
    for (int i = 0; i < list.size(); i++){ //finds contact in list of contacts

      if (name.equalsIgnoreCase(list.get(i).getName())) { //checks if contacts match
        successful = true;
        for (int b = 0; b < list.get(i).getPhones().size(); b++){ //lists phone numbers
          System.out.printf("%10s: %s %n", list.get(i).getPhones().get(b).getLabel(), list.get(i).getPhones().get(b).getPhonNum());
        } 
      }
    }
    if (successful == false) System.out.println("Couldn't find the name");
    
  } 
  
  
  public static void displayAll(ArrayList<ContactInfo> l){ 
    System.out.println("---Display all");
    for (int i = 0; i < l.size(); i++){
      System.out.println(l.get(i).getName()); //print name
      for (int b = 0; b < l.get(i).getPhones().size(); b++){
        System.out.printf("%10s: %s %n", l.get(i).getPhones().get(b).getLabel(), l.get(i).getPhones().get(b).getPhonNum());
      }
    }
    if (l.size() == 0) System.out.println("The list is empty");
  } 

  
  public static void remove(ArrayList<ContactInfo> list, String name) { 
    for (int i = 0; i < list.size(); i++){ //finds contact in list of contacts
      if (name.equalsIgnoreCase(list.get(i).getName())) { //finds name
          list.remove(i);
          System.out.println("*Contact is removed successfully*");
          break;
        }
      else if (i == list.size() - 1)
        System.out.println("Couldn't find the name!");
      }
    }

  
  // main method
  public static void main(String[] args) {
    ArrayList<ContactInfo> contacts = new ArrayList<ContactInfo>();
    Scanner scan = new Scanner(System.in);
    int userChoice;
    while (true){
      // This is how you need to define your list.
      // Use this list.
      
      System.out.println(" ");
      System.out.println("1. Add a contact");
      System.out.println("2. Add a new number to an old contact");
      System.out.println("3. Display a contact");
      System.out.println("4. Display All");
      System.out.println("5. Remove a contact");
      System.out.println("6. Exit");
      System.out.println("Enter your choice:");
      userChoice = scan.nextInt();
      
      if (userChoice == 1){ //Add a contact
        System.out.println("---Add a contact");
        System.out.print("Name:");
        String userInputContactName = scan.next()+ " " + scan.next();
        System.out.print("Label:");
        String userInputLabel = scan.next();
        System.out.print("Phone number (i.e. (513)111-1111):");
        String userInputPhoneNumber = scan.next();
        
        ArrayList<Phone> newContactPhoneNumbers = new ArrayList<Phone>();
        add(contacts, userInputContactName, userInputLabel, userInputPhoneNumber);
      }
      
      
      else if (userChoice == 2){ //Add a new number to an old contact
        System.out.println("---Add a new number");
        System.out.print("Name:");
        String contactToFind = scan.next() + " " + scan.next();
        System.out.print("Label:");
        String labelToAdd = scan.next();
        System.out.print("Phone number (i.e. (513)111-1111):");
        String phoneNumberToAdd = scan.next();
        append(contacts, contactToFind, labelToAdd, phoneNumberToAdd);
        
        
      }
      
      else if (userChoice == 3){ //Display a contact
        System.out.print("Name:");
        String contactToFind = scan.next() + " " + scan.next();
        display(contacts, contactToFind);
      }
      
      else if (userChoice == 4){ //Display All
        displayAll(contacts);
      }
      
      else if (userChoice == 5){ //Remove a contact
        System.out.println("---Remove a contact:");
        System.out.println("Name:");
        String contactToRemove = scan.next() + " " + scan.next();
        remove(contacts, contactToRemove);
      }
      else if (userChoice == 6){ //Exit
        break;
      }
      else{ //invalid input
        System.out.println("Invalid Input!");
      }
    }
  }
}

