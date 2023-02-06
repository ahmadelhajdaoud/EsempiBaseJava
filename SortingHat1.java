/* - "quanti studenti totale?"
   - con input da tastiera rimpire array
   - creare un array di stringhe con nome e cognome
   - modificare nome e cognome levando lo spazio e mettere tutte le lettere minuscole
   - per ogni nomecognome genera un numero intero 
     (dato da il codice del primo carattere + il codice del secondo * 7 + codice del terzo * 7^2 + etc..)
   - genero un numero casuale tra 0 e 4, se esce 3 lo aggiungo al totale, altrimenti niente
   - dividere il totale per 4:~ se resto 0 (Gryffindor)
                              ~ se resto 1 (Slythering)
                              ~ se resto 2 (Hufflepuff)
                              ~ se resto 3 (Ravenclaw)
   - calcolare numero max di una casa, se una raggiunge il numero massimo la esclude 
     dalle assegnazioni e la persona viene assegnata alla prima casa libera in ordine.
     se le case son tutte piene gli ultimi rimasti vengono assegnati a caso (max uno per casa)
*/
import java.util.ArrayList;

public class SortingHat1{
   
   public static java.util.Scanner console = new java.util.Scanner(System.in);
   
   public static void main(String[] args){
      int numeroTot = askNumber("quanti siete?");
      int max = numeroTot/4;
      int Gryffindor = 0;
      int Slythering = 0;
      int Hufflepuff = 0;
      int Ravenclaw = 0;
      ArrayList<String> arrGryffindor = new ArrayList<String>();
      ArrayList<String> arrSlythering = new ArrayList<String>();
      ArrayList<String> arrHufflepuff = new ArrayList<String>();
      ArrayList<String> arrRavenclaw = new ArrayList<String>();
      int restanti = numeroTot % 4;
      
      for(int i = 0; i < max*4; i++){
           String s = ask("Scrivi nome e cognome");
           int c = hashName(s) + random(0,4);
           if(c % 4 == 0 && Gryffindor != max){
              arrGryffindor.add(s);
              Gryffindor ++;
              System.out.println("Grande, sei in Gryffindor!");
              continue;  
           } 
           if(c % 4 == 0 && Gryffindor == max && Slythering != max){
              arrSlythering.add(s);
              Slythering ++;
              System.out.println("Grande, sei in Slythering!");
              continue;               
           } 
           if(c % 4 == 0 && Gryffindor == max && Slythering == max && Hufflepuff != max){
              arrHufflepuff.add(s);
              Hufflepuff ++;
              System.out.println("Grande, sei in Hufflepuff!"); 
              continue; 
           } 
           if(c % 4 == 0 && Gryffindor == max && Slythering == max && Hufflepuff == max && Ravenclaw != max){
              arrRavenclaw.add(s);
              Ravenclaw ++;
              System.out.println("Grande, sei in Ravenclaw!"); 
              continue; 
           }
           if(c % 4 == 1 && Slythering != max){
              arrSlythering.add(s);
              Slythering ++;
              System.out.println("Grande, sei in Slythering!");
              continue;  
           } 
           if(c % 4 == 1 && Slythering == max && Hufflepuff != max){
              arrHufflepuff.add(s);
              Hufflepuff ++;
              System.out.println("Grande, sei in Hufflepuff!");
              continue;               
           } 
           if(c % 4 == 1 && Hufflepuff == max && Slythering == max && Ravenclaw != max){
              arrRavenclaw.add(s);
              Ravenclaw ++;
              System.out.println("Grande, sei in Ravenclaw!"); 
              continue; 
           } 
           if(c % 4 == 1 && Ravenclaw == max && Slythering == max && Hufflepuff == max && Gryffindor != max){
              arrGryffindor.add(s);
              Gryffindor ++;
              System.out.println("Grande, sei in Gryffindor!"); 
              continue;
           } 
           if(c % 4 == 2 && Hufflepuff != max){
              arrHufflepuff.add(s);
              Hufflepuff ++;
              System.out.println("Grande, sei in Hufflepuff!");
              continue;  
           } 
           if(c % 4 == 2 && Hufflepuff == max && Ravenclaw != max){
              arrRavenclaw.add(s);
              Ravenclaw ++;
              System.out.println("Grande, sei in Ravenclaw!");
              continue;               
           } 
           if(c % 4 == 2 && Hufflepuff == max && Ravenclaw == max && Gryffindor != max){
              arrGryffindor.add(s);
              Gryffindor ++;
              System.out.println("Grande, sei in Gryffindor!"); 
              continue; 
           } 
           if(c % 4 == 2 && Hufflepuff == max && Ravenclaw == max && Gryffindor == max && Slythering != max){
              arrSlythering.add(s);
              Slythering ++;
              System.out.println("Grande, sei in Slythering!"); 
              continue;
           } 
           if(c % 4 == 3 && Ravenclaw != max){
              arrRavenclaw.add(s);
              Ravenclaw ++;
              System.out.println("Grande, sei in Ravenclaw!");
              continue;  
           } 
           if(c % 4 == 3 && Ravenclaw == max && Gryffindor != max){
              arrGryffindor.add(s);
              Gryffindor ++;
              System.out.println("Grande, sei in Gryffindor!");
              continue;               
           } 
           if(c % 4 == 3 && Ravenclaw == max && Gryffindor == max && Slythering != max){
              arrSlythering.add(s);
              Slythering ++;
              System.out.println("Grande, sei in Slythering!"); 
              continue; 
           } 
           if(c % 4 == 3 && Ravenclaw == max && Gryffindor == max && Slythering == max && Hufflepuff != max){
              arrHufflepuff.add(s);
              Hufflepuff ++;
              System.out.println("Grande, sei in Hufflepuff!"); 
              continue;       
           }
        }
        for(int j = 0; j < restanti; j++){
           int random = random(0,4);
           String s = ask("Scrivi nome e cognome");
           if(random == 0 && Gryffindor != max+1){
              arrGryffindor.add(s);
              Gryffindor++;
              System.out.println("Grande, sei in Gryffindor");
              continue;
           }
           if(random == 0 && Gryffindor == max+1 && Slythering != max+1){
              arrSlythering.add(s);
              Slythering ++;
              System.out.println("Grande, sei in Slythering!");
              continue;               
           } 
           if(random == 0 && Gryffindor == max+1 && Slythering == max+1 && Hufflepuff != max+1){
              arrHufflepuff.add(s);
              Hufflepuff ++;
              System.out.println("Grande, sei in Hufflepuff!"); 
              continue; 
           } 
           if(random == 0 && Gryffindor == max+1 && Slythering == max+1 && Hufflepuff == max+1 && Ravenclaw != max+1){
              arrRavenclaw.add(s);
              Ravenclaw ++;
              System.out.println("Grande, sei in Ravenclaw!"); 
              continue; 
           }
           if(random == 1 && Slythering != max+1){
              arrSlythering.add(s);
              Slythering ++;
              System.out.println("Grande, sei in Slythering!");
              continue;  
           } 
           if(random == 1 && Slythering == max+1 && Hufflepuff != max+1){
              arrHufflepuff.add(s);
              Hufflepuff ++;
              System.out.println("Grande, sei in Hufflepuff!");
              continue;               
           } 
           if(random == 1 && Hufflepuff == max+1 && Slythering == max+1 && Ravenclaw != max+1){
              arrRavenclaw.add(s);
              Ravenclaw ++;
              System.out.println("Grande, sei in Ravenclaw!"); 
              continue; 
           } 
           if(random == 1 && Ravenclaw == max+1 && Slythering == max+1 && Hufflepuff == max+1 && Gryffindor != max+1){
              arrGryffindor.add(s);
              Gryffindor ++;
              System.out.println("Grande, sei in Gryffindor!"); 
              continue;
           } 
           if(random == 2 && Hufflepuff != max+1){
              arrHufflepuff.add(s);
              Hufflepuff ++;
              System.out.println("Grande, sei in Hufflepuff!");
              continue;  
           } 
           if(random == 2 && Hufflepuff == max+1 && Ravenclaw != max+1){
              arrRavenclaw.add(s);
              Ravenclaw ++;
              System.out.println("Grande, sei in Ravenclaw!");
              continue;               
           } 
           if(random == 2 && Hufflepuff == max+1 && Ravenclaw == max+1 && Gryffindor != max+1){
              arrGryffindor.add(s);
              Gryffindor ++;
              System.out.println("Grande, sei in Gryffindor!"); 
              continue; 
           } 
           if(random == 2 && Hufflepuff == max+1 && Ravenclaw == max+1 && Gryffindor == max+1 && Slythering != max+1){
              arrSlythering.add(s);
              Slythering ++;
              System.out.println("Grande, sei in Slythering!"); 
              continue;
           } 
           if(random == 3 && Ravenclaw != max+1){
              arrRavenclaw.add(s);
              Ravenclaw ++;
              System.out.println("Grande, sei in Ravenclaw!");
              continue;  
           } 
           if(random == 3 && Ravenclaw == max+1 && Gryffindor != max+1){
              arrGryffindor.add(s);
              Gryffindor ++;
              System.out.println("Grande, sei in Gryffindor!");
              continue;               
           } 
           if(random == 3 && Ravenclaw == max+1 && Gryffindor == max+1 && Slythering != max+1){
              arrSlythering.add(s);
              Slythering ++;
              System.out.println("Grande, sei in Slythering!"); 
              continue; 
           } 
           if(random == 3 && Ravenclaw == max+1 && Gryffindor == max+1 && Slythering == max+1 && Hufflepuff != max+1){
              arrHufflepuff.add(s);
              Hufflepuff ++;
              System.out.println("Grande, sei in Hufflepuff!"); 
              continue;       
           }

        }
        System.out.println("GRYFFINDOR: ");
        printArray(arrGryffindor);
        System.out.println("SLYTHERING: ");
        printArray(arrSlythering);
        System.out.println("HUFFLEPUFF: ");
        printArray(arrHufflepuff);
        System.out.println("RAVENCLAW: ");
        printArray(arrRavenclaw);             
   }


 public static  void printArray(ArrayList<String> arr){

	for(int i=0; i<arr.size();i++){

		System.out.println(" " + arr.get(i));
	}

}

   public static String ask(String prompt){ //stringa di parole
      System.out.print(prompt + ": ");
      String answer = console.nextLine();
      return answer;
   }

   public static int askNumber(String prompt){ // numero
      System.out.print(prompt + " ");
      String answer = console.nextLine();
      int n = Integer.parseInt(answer);
      return n;
   }

   public static int hashName(String name){ //leva spazi, tutto minuscolo, trova valore stringa
      String noSpace = name.replace(" ","").toLowerCase();
      int hash = 0;
      for(int i = 0; i < noSpace.length(); i++){        
         hash = hash + noSpace.codePointAt(i) * (int)Math.pow(7,i);         
      }
      return hash;
   }
   
   public static int random(int min, int max){
      int random = (int)(Math.random()*max-min) + min; 
      int y = 0;     
      if(random == 3){
         y = 3;
      }
      return y;
   }
}
