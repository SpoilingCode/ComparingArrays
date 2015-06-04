/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrayscomparing;

/**
 *
 * @author User
 */
public class ArraysComparing {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int [] masFirst = {1,2,3,4,5,6,7,8,9,10};
        int [] masSecond = {10,9,8,7,6,5,4,3,2,1};
        int count=10;
        
         for(int i=0; i<count; i++)
         {
             for(int j=0; j<count; j++)
             {
              if(masFirst[i] == masSecond[j])
              {
                  System.out.println("Массивы совпадают");
                 
              } 
              else 
                  System.out.println("Массивы не совпадают");
             }
         }
    }
    
}
