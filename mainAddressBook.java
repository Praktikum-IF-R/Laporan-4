
package addressbook;

import java.util.Scanner;

public class mainAddressBook {

    public static void main(String[] args) {
       
        Scanner in = new Scanner(System.in);
        Scanner in2 = new Scanner(System.in);
        
        
        String n,a,e,p;
        long pn;
        boolean cek = true;
        
        AddressBook ab = new AddressBook();
        
                do{
                    System.out.print("Masukan nama          :");
                    n = in.nextLine();
                    System.out.print("Masukan alamat        :");
                    a = in.nextLine();
                    System.out.print("Masukan nomor telepon :");
                    pn = in2.nextLong();
                    System.out.print("Masukan alamat email  :");
                    e = in.nextLine();
                 
                    ab.setName(n);
                    ab.setAddress(a);
                    ab.setPhoneNumber(pn);
                    ab.setEmail(e);
                
                    System.out.println("\nNew Entry :");
                    System.out.println("Name          :"+ab.getName());
                    System.out.println("Address       :"+ab.getAddress());
                    System.out.println("Phone Number  :"+ab.getPhoneNumber());
                    System.out.println("Email         :"+ab.getEmail());
                
                
                    System.out.print("\nInput Data Lagi ?(y/n) :");
                    p = in.nextLine();
     
                    if(p.equalsIgnoreCase("y"))
                        cek = true;
                    else
                        cek = false;
                
                    System.out.println("");
                
                }while(cek!=false);
        
        }
    
}
