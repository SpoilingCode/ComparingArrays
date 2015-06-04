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
        int [] masSecond = {1,2,3,4,5,6,7,8,9,10};
        equals(masFirst,masSecond);
        
        
        if(equals(masFirst,masSecond) == false)
        {
            System.out.println("Массивы не совпадают");
        }else
        {
            System.out.println("Массивы совпадают");
        }
       
        
    }
         static boolean equals(int first[],int second[])
         {
            if( first.length != second.length)
            {
               return false;
            }
            int count = first.length;
            
              for(int i=0; i<count; i++)
              {
                  if(first[i] != second[i])
                      return false;
              }
              return true;
              
              
              
         }
    
}
