package com.String;

public class ReverseString{
 public static void main(String[] args) {

  String input = "abc";
  //create Method and pass input string as parameter
  String reversed = reverseString(input);
  System.out.println("The reversed string is: " + reversed);
  
 }
 
 //Method take string parameter and check string is empty or not
 public static String reverseString(String input)
 {
  if (input.isEmpty()){
   return input;
  }
  //Calling Function Recursively
  return reverseString(input.substring(1)) + input.charAt(0);
  
// Alternate method  
//  if ((str==null)||(str.length() <= 1)) 
//      System.out.println(str); 
//   else
//   { 
//       System.out.print(str.charAt(str.length()-1)); 
//       reverse(str.substring(0,str.length()-1)); 
//   } 
  
  
 }
 
}

