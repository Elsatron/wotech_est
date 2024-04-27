public class Main {
  public static void main(String[] args) {
    
    // winter, spring, summer, autumn
    // warm jacket, t-shirt, swimmin suit, rain coat

    var season = "salkh"; // var asemel võib olla ka string

    if (season == "winter") {
      System.out.println("Wear a warm jacket!");
    }
    else if (season == "spring") {
      System.out.println("Wear a T-shirt!");
    }
    else if (season == "summer") {
      System.out.println("Wear a swimming suite!");
    }
    else if (season == "autumn") {
      System.out.println("Wear a rain coat!");
    }
    else {
      System.out.println("Invalid season");
    }

    // +5 wear super warm
    // +5 to +15 warm
    // +15 to +30 normal
    // +30+ cooling
    // var temperature

    var temperature = 6;

      if(temperature <= 5){
          System.out.println("Super warm clothes needed");
      }
      else if(temperature >= 5.1 && temperature <=15){
          System.out.println("Regular warm clothes needed");
      }
      else if(temperature > 15.1 && temperature <=30){
          System.out.println("Normal clothes needed");
      }
      else if(temperature > 30.1){
          System.out.println("No clothes needed");
      }
      else{
          System.out.println("Error");
      }
  }
}
