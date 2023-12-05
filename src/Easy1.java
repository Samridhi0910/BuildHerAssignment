//First question Easy-1

//Algorithm
//         1: Taking the string as input.
//         2: Trimming the leading and trailing spaces of the string.
//         3: Splitting the given string using the split method.
//         4: Checking whether the input given is empty or not and returning 0 if it is empty.
//         5: Retrieving the length of the last word from the array.
//         6: Returning the length of the last word hence obtained.


public class Easy1 {
    public static void main(String[] args) {
        String s = "";
        System.out.println(StrSize(s));
    }
    public static int StrSize(String s){
        //First we create an array of strings which stores the individual words of the string given to us as input.
        String[] c = s.trim().split( "\\s+");

        //This check is kept to see if empty string is given to us
        if(c.length == 0){
            return 0;
        }

        //Here the length of the last word of the array is stored in a variable which is returned as the answer.
        int n = c[c.length-1].length();
        return n;
    }
}