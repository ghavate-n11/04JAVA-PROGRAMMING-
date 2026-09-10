package PracticaL08;
//
class StringHandlingDemo
{
    public static void main(String[] args) 
    {
            System.out.println("\n #### String Handling ### \n");

            String s = " University ";
            String s1 = "ParulUniversity";
            System.out.println("Original String : "+ s);
            
            //1.length()
            System.out.println("Length of String: "+ s.length());

            //2.subStirng()
            System.out.println("SubStirng of String: "+s.substring(1,7));

            //3.charAt(index)
            System.out.println("Character at index: "+s.charAt(4));

            //4.toUpperCase()
            System.out.println("String in Uppercase: "+s.toUpperCase());

            //5.toLowerCase
            System.out.println("String in Lowercase: "+s.toLowerCase());

            //6.startsWith()
            System.out.println("Startwith U: "+s.startsWith("U"));

            //7.endsWith()
            System.out.println("EndsWith y: "+s.endsWith("y"));

            //8.trim()
            System.out.println("Without Leading & Trailing Spaces String: "+s.trim());

            //9. equals()
            System.out.println("Comparing content in the bothe string:  "+s.equals(s1));

            //10.equalsIgnorecase()
            System.out.println(s.equalsIgnoreCase(s1));

            //11.replace()
            System.out.println(s.replace("n","r"));

            //12.contains()
            System.out.println(s.contains("java"));


            System.out.println("\n###  StringBudder Handling ###\n");

            StringBuffer sb = new StringBuffer("WILDFIRE");
            
            //1.append()
            System.out.println("Adds another string after main Stirng: "+sb.append("Coding"));

            //2.length()
            System.out.println(sb.length());

            //3.capacity()
            System.out.println(sb.capacity());

            //4.insert()
            System.out.println(sb.insert(0,"Java"));

            //5.reverse()
            System.out.println(sb.reverse());

            //6.delete()
            System.out.println(sb.delete(4,17));

            //7.replace()
            System.out.println(sb.replace(4,7,"Coding"));

            //8.charAt(index)
            System.out.println(sb.charAt(4));

           //9.setCharAt(index, char)
           sb.setCharAt(4,'C');
           System.out.println(sb);
           
           //10.subString()
           System.out.println(sb.substring(4,10));          


           System.out.println("\n###  StringBuilder Handling ###\n");
           StringBuilder sb1 = new StringBuilder("WILDFIRE");       

           //1.append()
            System.out.println("Adds another string after main Stirng: "+sb1.append("Coding"));

            //2.length()
            System.out.println(sb1.length());

            //3.capacity()
            System.out.println(sb1.capacity());

            //4.insert()
            System.out.println(sb1.insert(0,"Java"));

            //5.reverse()
            System.out.println(sb1.reverse());

            //6.delete()
            System.out.println(sb1.delete(4,17));

            //7.replace()
            System.out.println(sb1.replace(4,7,"Coding"));

            //8.charAt(index)
            System.out.println(sb1.charAt(4));

            //9.setCharAt(index, char)
            sb1.setCharAt(4,'C');
            System.out.println(sb1);        

            //10.subString()        
            System.out.println(sb1.substring(4,10));
           


    }
}