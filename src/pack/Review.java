package pack;

import java.io.*;
import java.util.*;
public class Review {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your    class should be named Solution. */
        Scanner in= new Scanner(System.in);
        int T=in.nextInt();
        in.nextLine();
        for(int j=0;j<T;j++){
            String s = in.nextLine();
            char[] MyCharArray = s.toCharArray();
            String s1="";
            String s2="";
            for(int i = 0; i < s.length(); i++){
                if(i%2==0){ //even
                    s1+=MyCharArray[i];
                }else //odd
                {s2+=MyCharArray[i];}
            }
            System.out.print(s1+" "+s2);
            System.out.println();
        }
        in.close();
    }
}
