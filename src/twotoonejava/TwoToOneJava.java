package twotoonejava;

import java.util.Arrays;

/**
 *
 * @author Mike Brooks
 */
public class TwoToOneJava {    
    public static void main(String[] args) {
        System.out.println("Printing out longest string for: \"aretheyhere\", \"yestheyarehere\"");
        System.out.println(TwoToOneJava.longest("aretheyhere","yestheyarehere"));
    }
    
    public static String longest (String s1, String s2) {
      String[] concat = (s1 + s2).split("");
      concat = Arrays.stream(concat).distinct().sorted().toArray(String[]::new);
      return String.join("", concat);
    }    
}
