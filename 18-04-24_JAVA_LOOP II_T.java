public class Main {
  public static void main(String[] args) {

   /*
## 1. Fill the array with random numbers
## 2. Find the sum of all elements in the array.
For example in an array like this:
[2, 3, 5, 1]
Result: 11 (2 + 3 + 5 + 1)
  */
   
    int[] numbers = {1, 3, -4, 2, 5, 8};

    int sum = 0;

    for (int i = 0; i < numbers.length; i++){
      sum += numbers[i];
    }
    System.out.println("The sum of the array is: " + sum);
  }
}


public class Main {
  public static void main(String[] args) {

   /*
## 3. Find all the elements in the array that is below 0
[-2, 3, -5, 1]
Result:
-2
-5

VER 1
  */
   
    int[] numbers = {-2, 3, -5, 1};

    for (int i = 0; i < numbers.length; i++){
      if (numbers[i] < 0){
        System.out.println("Negative number in the array: " + numbers[i]);
      }
    }

  }
}


/*
VER 2
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
