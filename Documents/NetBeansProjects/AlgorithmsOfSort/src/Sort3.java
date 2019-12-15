import java.util.Arrays;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Alen
 */
public class Sort3 {
    
    
    public static void main(String[] args) {
        int[] unsort = {1, 2, 4, 6, 8, 3, 9, 5, 7};
        //choiceSort(unsort);                   //сортировка выбором
        //bubbleSort(unsort);                   //сортировка пызырём
        //System.out.println(efcNod(165, 45));  //алгоритм Евклида
        //System.out.println(unsort.length);
    }
               //сортировка выбором
     public static void choiceSort (int[] arrayToSort){
                int min;         
                for (int i = 0; i < arrayToSort.length; i++) { 
                    min = i;
                    for (int j = i; j < arrayToSort.length; j++) {
                        if (arrayToSort[min] > arrayToSort[j]) {
                            min = j; 
                        }
                    }                    
                    //===замена места двух значений=======
                    int tmp = arrayToSort[i];
                    arrayToSort[i]=arrayToSort[min];
                    arrayToSort[min]=tmp;  
                    //====================================
                 }
                System.out.println(Arrays.toString(arrayToSort));                    
        }   
  //=======================================================================  
                     
     //сортировка пызырём
     public static void bubbleSort(int[] arrayToSort) {
        //пройти по массиву
        //сравнить два соседа
        //повторить это действо пока отсортируется
        
        int chCo;
                 
         do {             
             chCo = 0;
              for (int i = 0; i < arrayToSort.length-1; i++) {
//==========если значение в массиве под индексом i больше соседа ==============
             if (arrayToSort[i] > arrayToSort[i+1]) {

//============== то меняются они местами ======================================
                    int tmp = arrayToSort[i];
                    arrayToSort[i]=arrayToSort[i+1];
                    arrayToSort[i+1]=tmp;
                    chCo++;
//=============================================================================

             }
         }
             
         } while (chCo > 0);
         System.out.println(Arrays.toString(arrayToSort));
     }
 
//=============================================================================    
//========================алгоритм Евклида=====================================
     public static int efcNod(int a, int b) {
         if (b == 0) return a;
         int c = a%b;
         return efcNod(b, c);         
     }
 //========================================================================
}
//--------