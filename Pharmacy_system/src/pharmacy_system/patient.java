/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pharmacy_system;

/**
 *
 * @author user
 */
public class patient extends transaction {

    String name ;
    int phone_num;
    boolean p_prescription ;
    int number_of_med;
    
    
    public int getNumber_of_med() {
        return number_of_med;
    }

    public void setNumber_of_med(int number_of_med) {
        this.number_of_med = number_of_med;
    }
    
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPhone_num() {
        return phone_num;
    }

    public void setPhone_num(int phone_num) {
        this.phone_num = phone_num;
    }

    public boolean isP_prescription() {
        return p_prescription;
    }

    public void setP_prescription(boolean p_prescription) {
        this.p_prescription = p_prescription;
    }
    
   public patient (){  
       super();
     name =null ;
     phone_num =0 ;
     p_prescription =true ;
     number_of_med =0;
    
   
   }
 
   
}
