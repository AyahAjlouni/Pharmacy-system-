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
public class medicine extends transaction {

     double cost ;
     boolean need_prescription;
     int num_of_medicine;
     transaction t;
    
  
 
    public int getNum_of_medicine() {
        return num_of_medicine;
    }

    public void setNum_of_medicine(int num_of_medicine) {
        this.num_of_medicine = num_of_medicine;
    }
    
    
    
    
    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public boolean isNeed_prescription() {
        return need_prescription;
    }

    public void setNeed_prescription(boolean need_prescription) {
        this.need_prescription = need_prescription;
    }

   
    
    public  medicine (){
       super();
        
         cost =0;
         need_prescription=false;
         num_of_medicine=0;
   
       
       
    }
    
     
     
     
    
}
