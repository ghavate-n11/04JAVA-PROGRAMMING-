package PracticaL08;
// Write a Java program to demonstrate string handling using String, StringBuffer, and StringBuilder.

public class StringHandlingDemo {
    public static void main(String[] args) {

        // String
        String str = "Hello Java";
        String str1 = " Hello AIDS ";
        System.out.println("\nString:\n");
        System.out.println("Original String: " + str);
        System.out.println("Length: " + str.length());
        System.out.println("Uppercase: " + str.toUpperCase());
        System.out.println("Substring: " + str.substring(6));
        System.out.println("Lowercase:"+str.toLowerCase());
        System.out.println("equals:"+(str.equals(str1)));
        System.out.println("charAt:"+str.charAt(4));
        System.out.println("trim:"+str.trim());
        System.out.println("equalIgnoreCase:"+str.equalsIgnoreCase(str1));
        
        // StringBuffer
          System.out.println("\nStringBuffer:\n");
        StringBuffer sb = new StringBuffer("Hello");
        sb.append(" World");
        System.out.println(sb);
        sb.insert(5, " Java");
        System.out.println(sb);
        sb.replace(0, 5, "Hi");
        System.out.println(sb);
        sb.delete(2, 7);
        System.out.println(sb);

      
        System.out.println(sb);

        // StringBuilder
        StringBuilder sbd = new StringBuilder("Programming");
        sbd.append(" in Java");
        sbd.insert(11, " Language");
        sbd.reverse();

        System.out.println("\nStringBuilder:");
        System.out.println(sbd);
    }
}