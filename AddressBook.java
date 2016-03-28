package addressbook;
public class AddressBook {
    private String name;
    private String address;
    private long phoneNumber;
    private String email;
    
    //default constructor
    public AddressBook(){
        name = null;
        address = null;
        phoneNumber = 0;
        email = null;
    }
    
    //overloading constructor
    public AddressBook(String n, String a, long pn, String e){
        name = n;
        address = a;
        phoneNumber = pn;
        email = e;
    }
    
    //mutator method name
    public void setName(String name){
        this.name = name;
    }
    
    //mutator method address
    public void setAddress(String address){
        this.address = address;
    }
    
    //mutator method phoneNumber
    public void setPhoneNumber(long pn){
        phoneNumber = pn;
    }
    
    //mutator method email
    public void setEmail(String e){
        email = e;
    }
    
    //accessor method name
    public String getName(){
        return name;
    }
    
    //accessor method address
    public String getAddress(){
        return address;
    }
    
    //accessor method phoneNumber
    public long getPhoneNumber(){
        return phoneNumber;
    }
    
    //accessor method email
    public String getEmail(){
        return email;
    }
     
}
