package InterviewA;

/* IMPORTANT: Multiple classes and nested static classes are supported */

/*
 * uncomment this if you want to read input.
//imports for BufferedReader
import java.io.BufferedReader;
import java.io.InputStreamReader;

//import for Scanner and other utility classes
import java.util.*;
*/
import java.io.BufferedReader;
import java.io.InputStreamReader;

//import for Scanner and other utility classes
import java.util.*;
// Warning: Printing unwanted or ill-formatted data to output will cause the test cases to fail

class TestClass {
            // Write your code here
        public static int min(String[] list)
        {
            int minnum = Integer.valueOf(list[0]);
            for(String number : list)
            {
                if(minnum>Integer.valueOf(number))
                {
                    minnum=Integer.valueOf(number);
                }
            }
            return minnum;
        }
    public static void main(String args[] ) throws Exception {
        /* Sample code to perform I/O:
         * Use either of these methods for input

       //BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] numbersStream = br.readLine();                // Reading input from STDIN
        int result = TestClass.min(numbersStream);
        System.out.println(result);
        // System.out.println("Hi, " + name + ".");    // Writing output to STDOUT

        //Scanner
        // Scanner s = new Scanner(System.in);
        // String name = s.nextLine();                 // Reading input from STDIN
        // System.out.println("Hi, " + name + ".");    // Writing output to STDOUT

        */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String numbersStream = br.readLine();                // Reading input from STDIN
        String numbersStream2 = br.readLine();
        String[] strs = numbersStream2.trim().split(" ");
        int result = TestClass.min(strs);
        System.out.println(result);





    }
}

