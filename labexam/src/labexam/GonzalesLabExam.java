
package labexam;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;



public class GonzalesLabExam {
	
	static Scanner input = new Scanner(System.in);
	static Queue<String> queue = new LinkedList<>();
	
	public static void addElements() {
			System.out.print("Enter five element (seperated by space): ");
			
			for (int i = 0; i < 5; i++) {
				queue.add(input.next());
			}
			System.out.println("\nQueue: " + queue);
			System.out.println("\nDequeuing two elemets...");
			
			queue.poll();
			queue.poll();
			
			System.out.println("\nUpdated Queue: " + queue);
		}
	public static void generatePermutation() {

	    if (queue.isEmpty()) {

	      System.out.println("Queue is empty!");

	      return;

	    }

	    String[] elements = queue.toArray(new String[0]);

	    System.out.print("Enter number of elements to arrange: ");

	    int r = input.nextInt();

	    if (r < 1 || r > elements.length) {

	      System.out.println("Invalid number!");

	      return;

	    }


	    int num = 0;

	    int n = elements.length;

	    System.out.println("Generated Permutations:");

	    for (int i = 0; i < n; i++) {

	      if (r == 1) {

	        System.out.println(elements[i] + " ");

	        num++;

	      } else {

	        for (int j = 0; j < n; j++) {

	          if (j == i) continue;

	          if (r == 2) {

	            System.out.println(elements[i] + elements[j] + " ");

	            num++;

	          } else {

	            for (int k = 0; k < n; k++) {

	              if (k == i || k == j) continue;

	              if (r == 3) {

	                System.out.println(elements[i] + elements[j] + elements[k] + " ");

	                num++;

	              }

	            }

	          }

	        }

	      }

	    }

	    System.out.println("\nTotal Permutations: " + num);

	  }
	
	public static void main(String[] args) {
		
		  int choice;

		    do {

		      System.out.println("PERMUTATION");

		      System.out.println("[1] Add Elements to Queue");
		      System.out.println("[2] Generate Permutations");
		      System.out.println("[3] Exit");
		      System.out.print("Enter choice: ");


		      choice = input.nextInt();

		      switch (choice) {

		        case 1:

		          addElements();

		          break;
		          
		        case 2:
		        	
		         generatePermutation();
		        
		         break;
		        
		        case 3:

		          System.out.println("Program closed.");

		          break;

		        default:

		          System.out.println("Invalid choice!");

		      }

		    } while (choice != 3);

		  }
	}


