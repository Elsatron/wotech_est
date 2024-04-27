 /*
## 1. Fill the array with random numbers
## 2. Find the sum of all elements in the array.
For example in an array like this:
[2, 3, 5, 1]
Result: 11 (2 + 3 + 5 + 1)
  */
   
public class Main {
  public static void main(String[] args) {
    int[] numbers = {1, 3, -4, 2, 5, 8};

    int sum = 0;

    for (int i = 0; i < numbers.length; i++){
      sum += numbers[i];
    }
    System.out.println("The sum of the array is: " + sum);
  }
}


/*
## 3. Find all the elements in the array that is below 0
[-2, 3, -5, 1]
Result:
-2
-5

VERSION 1
  */
   
public class Main {
  public static void main(String[] args) {
    int[] numbers = {-2, 3, -5, 1};

    for (int i = 0; i < numbers.length; i++){
      if (numbers[i] < 0){
        System.out.println("Negative number in the array: " + numbers[i]);
      }
    }

  }
}


/*
## 3
VERSION 2
  */
 
public class Main {
    public static void main(String[] args) {
        int[] numbers = {-2, 3, -5, 1};

        boolean hasNegative = false;

        for (int num : numbers) { //The line for (int num : numbers) is an example of an enhanced for loop, also known as a for-each loop, in Java. It is used to iterate over elements in an array or a collection, providing a more concise and readable way to traverse through the elements.
            if (num < 0) {
                hasNegative = true;
                break;
            }
        }

        if (hasNegative) {
            System.out.println("Negative elements in the array:");
            for (int num : numbers) {
                if (num < 0) {
                    System.out.println(num);
                }
            }
        } else {
            System.out.println("No negative elements");
        }
    }
}


 /*
  4. Fill the party list with people you would like to invite to the party.
  Check whether or not "Anna" is in the array.
  Check whether or not "Maris" is in the array.
  ["Oskars", "Anna", "Andris"]
  Result: 
  "Anna is in the party list"
  "Maris is not in the party list"
      */  
      
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
    
      String [] guestList = {"Oskars", "Anna", "Andris"};
     
      System.out.println("Guest list check: ");
      
      Scanner scanner = new Scanner(System.in);
      String checkGuest = scanner.nextLine();
      
      boolean isInPartyList = false;
      
      for (int i = 0; i < guestList.length; i++) {
          if (guestList[i].equals(checkGuest)) { // when comparing strings: use == to check if they're exactly the same object in memory, and use .equals() to check if they have the same content.
              isInPartyList = true;
              break;
          }
      }

      if(isInPartyList == true){
        System.out.println(checkGuest + " is in the party list");
        }else{
        System.out.println(checkGuest + " is not in the party list");
        }

       scanner.close();
    }
}
