


public class Task7 {
    
  public static void main(String[] args) {
        short year = 2016; 
        String firstName = "Елиан"; 
        String lastName = "Куртев";
        short yearOfBirth =  1997;
        double weight = 72d;
        short height = 182;
        String proffesion = "Студент";
        int age = year - yearOfBirth;
        boolean isAdult = (age >= 18);

        System.out.println(firstName + " " + lastName + " " + yearOfBirth + " " + weight + " "  + height + "cm " + proffesion + " " + isAdult);
        if (year - yearOfBirth >=18){                               //Втори начин за проверка :)
            System.out.println("Лицето е пълнолетно!");
        }else
            System.out.println("Лицето НЕ е пълнолетно!");
            
    }
    
    
}

