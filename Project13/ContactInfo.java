
import java.util.ArrayList;

//This class's job is to create contact info for ONE contact
//there can be as many "ContactInfo" objects as possible
public class ContactInfo {
  //These variables create "properties" for each "ContactInfo object
  String name; //defults to "unknown"
  ArrayList<Phone> phoneNums;
  

  public ContactInfo(){
    name = "Unknown";
    phoneNums = new ArrayList<Phone>();
  } 
  
  public ContactInfo(String inputName, ArrayList<Phone> inputPhoneNumbers){
    this.name = inputName;
    phoneNums = inputPhoneNumbers;
  } 
  
  //returns the name saved under a cetrain contact COMMAND: (pp1.getName())
  public String getName(){
    return name;
  }
  
  //returns all the phone numbers saved under a cetrain contact COMMAND: (pp1.getPhones())
  public ArrayList<Phone> getPhones(){ 
    return phoneNums;
  }
  
  //This adds a phone number to a list of contacts
  public boolean addPhone(Phone newPhoneToAdd){
    boolean returnValue = true;
    for (int i = 0; i < phoneNums.size(); i++){ 
      //checking for similar phone numbers
      if (newPhoneToAdd.getPhonNum() == phoneNums.get(i).getPhonNum()) returnValue = false;
    }
    for (int i = 0; i < phoneNums.size(); i++){ 
      //checking for similar name labels
      if (newPhoneToAdd.getLabel() == phoneNums.get(i).getLabel()) returnValue = false;
    }
    
    //checks if size of ArrayList is at cappacity 
    if (phoneNums.size() >= 10) returnValue = false;
    
    if (returnValue == false) return false; //if false; adding failed
    else{ //if true; adding successful
      phoneNums.add(newPhoneToAdd);
      return true;
    }
  }
  
  //This removes a phone number from the list of contacts
  public boolean removePhone(String phoneToRemove){
    boolean returnValue = false;

    //searches for phone number in list
    for (int i = 0; i < phoneNums.size(); i++){ 
      //finding what "index" to remove
      if (phoneToRemove.equals(phoneNums.get(i).getPhonNum())){phoneNums.remove(i);returnValue = true; break;}
    }
    
    if (returnValue == true) return true; //if false; removing failed
    else return false;
  }
  
}

