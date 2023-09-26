public class ConversationIntro {

  /*
   *  Example A:  plusOne (warmup)
   *  To make sure everything it working, remove the comment
   *  from the line in the method below.  When you have done so,
   *  the program should be able to pass the first test.
   */
  
  /** Returns an integer one larger than its input */
  public int plusOne(int n) {
    n = n+1;
    return n;
  }

  /*
   *  Exercise 1:  timesTwo
   *  Here's a function similar to the one above.
   *  See if you can figure out how to make it work.
   */
  
  /** Returns an integer that is double its input */
  public int timesTwo(int n) {
    n=n*2;
    return n;
  }

  /*
   *  Exercise 2:  squared
   */
  
  /** Returns the square of its input */
  public int squared(int n) {
    n = (int) Math.pow(n,2);
    return n;
  }

  /*
   *  Exercise 3:  integer division
   */
  
  /** Divides its input by seven, dropping remainders */
  public int intDivideBy7(int n) {
    n = (int) Math.floorDiv(n,7);
    return n;
  }

  /*
   *  Exercise 4:  double precision floating point division
   */
  
  /** Divides its input by 7 */
  public double doubleDivideBy7(int n) {
    double d = n;
    d = d/7;
    return d;
  }

  /*
   *  Example B:  isPrime
   *  
   *  This function is completely written for you.
   *  Uncomment the loop to make it work, examining it as you do so.
   *  It contains an example of a loop, and also 
   *  the % operator, which computes the integer remainder
   */
  
  /** Returns true if its input is prime */
  public static boolean isPrime(int n) {
    boolean isPrime = (n > 1); // one, zero, and negatives not prime
    for (int i = 2; i <= Math.sqrt(n); i++) {
        if (n%i == 0) {
            isPrime = false;
        }
    }
    return isPrime;
  }

  /*
   *  Exercise 5:  isEven
   */
  
  /** Returns true if its input is even */
  public boolean isEven(int n) {
    boolean isEven = (n%2 == 0);
    // if (n%2 != 0) {
    //     boolean isEven = false;
    // }
    // else { 
    //     boolean isEven = true;
    // }
    
    return isEven;
  }

  /*
   *  Example C:  isComma
   *  
   *  Now we move to string processing.
   *  This function is meant to perform a string comparison
   *  but as written it uses the wrong equality test for strings.
   *  Replace the comparison with the commented line to make 
   *  it work properly.
   */
  
  /** Returns true if its input is a comma */
  public static boolean isComma(String s) {
    return s.equals(",");
    // return (s == ",");
  }

  /*
   *  Exercise 6:  isPunctuation
   */
  
  /** Returns true if its input is one of:  .,?! */
  public boolean isPunctuation(String s) {
    boolean isPunctuation = false;
    if (s.equals(".") || s.equals(",")
    || s.equals("?")|| s.equals("!")) {
      isPunctuation = true;
    }
    return isPunctuation;
  }

  /*
   *  Exercise 7:  mirrorWord
   */
  
  /** Returns its input, unless it is "I" or "you", which switch */
  // do things word by word - String[] words = u_i.split(" ")
  public String mirrorWord(String s) {
    String[] words = s.split(" ");
    for (int i = 0; i<words.length; i++) {
      if (words[i] == "I") {
        // element = "you";
        // element.replace("I", "you");
        words[i] = "you";
      }
      else if (words[i] == "you") {
        // element = "I";
        // element.replace("you", "I");
        words[i] = "I";
      }
    }
    String words_out = String.join(" ", words);
    return words_out;
  }

  /*
   *  Example D:  wholeNumbers
   *  
   *  This example shows the use of a loop to put
   *  values into an array.  Uncomment the loop to
   *  make the example work.
   */
  
  /** Returns an array of whole numbers up to n */
  public static int[] wholeNumbers(int n) {
    int[] arr = new int[n]; // allocate space for the array
    for (int i = 0; i < n; i++) {
     arr[i] = i+1;
    }
    return arr;
  }

  /*
   *  Exercise 7:  squares
   *  Write a loop here to match the description
   */
  
  /** Returns an array of squares from 1 to n*n */
  public static int[] squares(int n) {
    int[] arr = new int[n]; // allocate space for the array
    for (int i = 0; i < n; i++) {
      arr[i] = (i+1)*(i+1);
    }
    
    return arr;
  }
}
