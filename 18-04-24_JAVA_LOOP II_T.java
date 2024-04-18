```java
/*

## 1. Fill the array with random numbers
#DONE

#3 2. Find the sum of all elements in the array.
For example in an array like this:
[2, 3, 5, 1]
Result: 11 (2 + 3 + 5 + 1)
#DONE

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



//import java.util.Scanner;


/*

## 3. Find all the elements in the array that is below 0
[-2, 3, -5, 1]
Result:
-2
-5

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
```
