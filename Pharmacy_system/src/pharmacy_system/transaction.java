/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pharmacy_system;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author user
 */
public class transaction {
     int quantity ;
     int expiry_date_year;
     int expiry_date_month;
     double final_cost ;
     
     
    public double getFinal_cost() {
        return final_cost;
    }

    public void setFinal_cost(double final_cost) {
        this.final_cost += final_cost;
    }
    
    
    public int getExpiry_date_year() {
        return expiry_date_year;
    }

    public void setExpiry_date_year(int expiry_date_year) {
        this.expiry_date_year = expiry_date_year;
    }

    public int getExpiry_date_month() {
        return expiry_date_month;
    }

    public void setExpiry_date_month(int expiry_date_month) {
        this.expiry_date_month = expiry_date_month;
    }
  
    
 

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public  String check_avibility(){
        String s=  "        available ";
        if(this.quantity==0 )
        s= "      not    available  ";
        
         DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy");
         DateTimeFormatter dtff = DateTimeFormatter.ofPattern("MM");
         LocalDateTime now = LocalDateTime.now();
       //  System.out.println(avibility);
          int y = Integer.parseInt(dtf.format(now));
          int m = Integer.parseInt(dtff.format(now));
          if (this.expiry_date_year< y)
                 s= "      not    available  ";
              
           if (this.expiry_date_year== y)
              
              
               if (this.expiry_date_month< m)
          {      s= "      not    available  "; }
          
        
    return s;
    }
  public  transaction(){
   this.quantity =0;
   this.expiry_date_month = 0;
    this.expiry_date_year = 0;
    
}
 //   public void  print_message(){}
    
    
    public boolean chek_aviability(String num){
    if (this.quantity==0)
        return false;
                else 
        return true;
    
    }
       public void  set_date(int m , int y){
       setExpiry_date_year(y);
       setExpiry_date_month(m);
       }
      
    
      
      public void  view_files(){}
          public double calculate_bill (double b){
              setFinal_cost(b);
              
          return getFinal_cost() ;
             
          }
}
