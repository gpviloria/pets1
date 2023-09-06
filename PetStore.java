
package pets1;

import java.util.Scanner;

class PetStore {
    public static void main(String[] args) {
        System.out.println("Petstore v1.0");
        
        Scanner myPet = new Scanner(System.in);  // Create a Scanner object
	    System.out.println("Select Pet (Dog, Cat, Fish, Bird): ");
	    
        String myPetStr = myPet.nextLine();  // Read user input
         
        // Create a Scanner object
	    if (myPetStr.equalsIgnoreCase("Dog")) {
	        System.out.println("Select Breed (Bulldog, Poodle, Dalmation, Golden Retriever, Labrador Retriever, Chihuahua): ");
	    } else if (myPetStr.equalsIgnoreCase("Cat")) {
	        System.out.println("Select Breed (Manx, Persian): ");
	    } else if (myPetStr.equalsIgnoreCase("Fish")) {
	    	System.out.println("Select Breed (Angelfish, Tigershark, Koi, Goldfish): ");
	    } else if (myPetStr.equalsIgnoreCase("Reptiles")) {
	    	System.out.println("Select Breed (Rattlesnake, Iguana):");
	    } else if (myPetStr.equalsIgnoreCase("Bird")) {
	    	System.out.println("Select Breed (Amazon Parrot, Finch): ");
	    } else {
            System.out.println("Not Existing Pet");
        }
	    	Scanner myBreed = new Scanner(System.in); 
	    	String myBreedStr = myBreed.nextLine();
	    	 
        	if (myBreedStr.equalsIgnoreCase("Bulldog")) {
        		System.out.println("Item ID  Product ID          Description               List Price");    
        		System.out.println("EST-6    K9-BD-01          Male Adult Bulldog            $18.50" );
        		System.out.println("EST-7    K9-BD-01          Female Puppy Bulldog          $18.50");
        	}
        	else if (myBreedStr.equalsIgnoreCase("Poodle")) {
        		System.out.println("Item ID  Product ID          Description               List Price");    
        		System.out.println("EST-8    K9-PO-02          Male Puppy Poodle            $18.50" );	
        	}
        	else if (myBreedStr.equalsIgnoreCase("Dalmation")) {
        		System.out.println("Item ID  Product ID          Description               List Price");    
        		System.out.println("EST-9     K9-DL-01   Spotless Male Puppy Dlamation        $18.50" );
        		System.out.println("EST-10    K9-DL-01        Spotted Adult Female            $18.50");
        	}
        	else if (myBreedStr.equalsIgnoreCase("Golden Retriever")) {
        		System.out.println("Item ID  Product ID          Description                List Price");    
        		System.out.println("EST-28    K9-RT-01   Adult Female Golden Retriever        $155.29" );	
        	}
        	else if (myBreedStr.equalsIgnoreCase("Labrador Retriever")) {
        		System.out.println("Item ID  Product ID          Description               List Price");    
        		System.out.println("EST-22    K9-RT-02    Adult Male Labrador Retriever      $135.50" );
        		System.out.println("EST-23    K9-RT-02    Adult Female Labrador Retriever    $145.49");
        		System.out.println("EST-24    K9-RT-02    Male Puppy Labrador Retriever      $255.50" );
        		System.out.println("EST-25    K9-RT-02    Female Puppy Labrador Retriever    $325.29");
        	}
        	else if (myBreedStr.equalsIgnoreCase("Chihuahua")) {
        		System.out.println("Item ID  Product ID          Description               List Price");    
        		System.out.println("EST-26    K9-CW-01       Adult Male Chihuahua            $125.50" );
        		System.out.println("EST-27    K9-CW-01      Adult Female Chihuahua           $155.29" );
        	}
        	else if (myBreedStr.equalsIgnoreCase("Manx")) {
        		System.out.println("Item ID  Product ID          Description               List Price");    
        		System.out.println("EST-14    FL-DSH-01         Tailless Manx                 $58.50" );
        		System.out.println("EST-15    FL-DSH-01         With Tail Manx                $23.50" );
        	}
        	else if (myBreedStr.equalsIgnoreCase("Persian")) {
        		System.out.println("Item ID  Product ID          Description               List Price");    
        		System.out.println("EST-16    FL-DLH-02       Adult Female Persian            $93.50" );
        		System.out.println("EST-17    FL-DLH-02        Adult Male Persian             $93.50" );
        	}
        	else if (myBreedStr.equalsIgnoreCase("Angelfish")) {
        		System.out.println("Item ID  Product ID          Description               List Price");    
        		System.out.println("EST-1    FI-SW-01          Large Angel Fish              $16.50" );
        		System.out.println("EST-2    FI-SW-01          Small Angel Fish              $16.50" );
        	}
        	else if (myBreedStr.equalsIgnoreCase("TigerShark")) {
        		System.out.println("Item ID  Product ID          Description                 List Price");    
        		System.out.println("EST-3    FI-SW-02       Toothless Tiger Shark              $18.50" );
        	}
        	else if (myBreedStr.equalsIgnoreCase("Koi")) {
        		System.out.println("Item ID  Product ID          Description                List Price");    
        		System.out.println("EST-4    FI-FW-01            Spotted Koi                  $18.50" );
        		System.out.println("EST-5    FI-FW-01            Spotless Koi                 $18.50" );
        	}
        	else if (myBreedStr.equalsIgnoreCase("Goldfish")) {
        		System.out.println("Item ID  Product ID          Description                List Price");    
        		System.out.println("EST-20    FI-FW-02       Adult Male Goldfish               $5.50" );
        		System.out.println("EST-21    FI-FW-02      Adult Female Goldfish              $5.29" );
    		}
        	else if (myBreedStr.equalsIgnoreCase("Goldfish")) {
        		System.out.println("Item ID  Product ID          Description                List Price");    
        		System.out.println("EST-20    FI-FW-02       Adult Male Goldfish               $5.50" );
        		System.out.println("EST-21    FI-FW-02      Adult Female Goldfish              $5.29" );
    		}
        	else if (myBreedStr.equalsIgnoreCase("Rattlesnake")) {
        		System.out.println("Item ID  Product ID          Description                List Price");    
        		System.out.println("EST-11    RP-SN-01       Venomless Rattlesnake             $18.50" );
        		System.out.println("EST-11    RP-SN-01       Rattlesnake Rattlesnake           $18.50" );
        	}
        	else if (myBreedStr.equalsIgnoreCase("Iguana")) {
        		System.out.println("Item ID  Product ID          Description                List Price");    
        		System.out.println("EST-13    RP-LI-02       Green Adult Iguana               $18.50" );	
        	}
        	else if (myBreedStr.equalsIgnoreCase("Amazon Parrot")) {
        		System.out.println("			Great Companion for up to 75 years					  ");    
        		System.out.println("EST-18  														  ");
        		System.out.println("Adult Male Amazon Parrot" );
        		System.out.println("Amazon Parrot													  ");    
        		System.out.println("Black Ordered. 													  ");
        		System.out.println("$193.50															  ");
        	}
        	else if (myBreedStr.equalsIgnoreCase("Finch")) {
        		System.out.println("			Great Stress Reliever			  ");    
        		System.out.println("EST-18  									  ");
        		System.out.println("Adult Male Finch							  ");
        		System.out.println("Finch										  ");												 
        		System.out.println("Black Ordered. 								  ");
        		System.out.println("$15.50										  ");
        	}
    }
}
        	
       
    










