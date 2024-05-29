package wp.week03.session02;

import java.util.Arrays;

public class StringMethodPractice {

	public static void main(String[] args) {
		
		/*
		 * contains() - Checks whether the string contains a substring.
		 * 
		 * The contains() method checks whether the specified string (sequence of
		 * characters) is present or not.
		 * 
		 * If present then contains() method returns true
		 * 
		 * Syntax:
		 * string.contains(CharSequence ch);
		 * 
		 * contains() Return Value
		 * returns true if the string contains the specified character
		 * returns false if the string doesn't contain the specified characte 
		 * 
		 */
		
		String contain = "Java is a Progamming language";
		System.out.println(contain.contains("Java"));
		System.out.println(contain.contains("z"));
		 
		 /*
		  * join() - Joins the given strings using the delimiter
		  * 
		  * The join() method returns a new string with the given elements joined with the
		  * specified delimiter.
		  * 
		  * Syntax:
		  * String.join(CharSequence delimiter, Iterable elements);
		  * String.join(CharSequence delimiter, CharSequence... elements);
		  * 
		  * Here, ... signifies there can be one or more CharSequence.
		  * 
		  * Parameters:
		  * The join() method takes two parameters.
		  * 
		  * delimiter - the delimiter to be joined with the elements
		  * elements - elements to be joined
		  * 
		  * returns a string
		  * 
		  */
		
		String var1 = "My name";
		String var2 = "is";
		String var3 = "Karthikeyan";
		
		System.out.println(String.join("#", var1, var2, var3));
		  
		  /*
		   * substring() - Returns the substring of the string
		   * 
		   * The Java substring() method extracts a part of the string (substring) and returns it.
		   * 
		   * Syntax:
		   * string.substring(int startIndex, int endIndex);
		   * 
		   * Parameters:
		   * The substring() method can take a maximum of two arguments.
		   * 
		   * startIndex - the beginning index
		   * endIndex (optional) - the ending index
		   * 
		   * substring() Return Value
		   * The substring() method returns a substring from the given string.
		   * 
		   * The substring begins with the character at the startIndex and extends to the character 
		   * at index endIndex - 1
		   * 
		   * If the endIndex is not passed, the substring begins with the character at the specified 
		   * index and extends to the end of the string
		   * 
		   */
		
		String main = "Java is fun";
		System.out.println(main.substring(5));
		System.out.println(main.substring(5, 7));
		
		   /*
		    * replace() - Replaces the specified old character with the specified new character.
		    * 
		    * The replace() method replaces each matching occurrence of a character/text in the string 
		    * with the new character/text.
		    * 
		    * Syntax:
		    * The syntax of the replace() method is either
		    * 
		    * string.replace(char oldChar, char newChar)
		    * or
		    * string.replace(CharSequence oldText, CharSequence newText)
		    * 
		    * Parameters:
		    * To replace a single character, the replace() method takes these two parameters:
		    * 
		    * oldChar - the character to be replaced in the string
		    * newChar - matching characters are replaced with this character
		    * 
		    * To replace a substring, the replace() method takes these two parameters:
		    * 
		    * oldText - the substring to be replaced in the string
		    * newText - matching substrings are replaced with this string
		    * 
		    * Return Value:
		    * The replace() method returns a new string where each occurrence of the matching 
		    * character/text is replaced with the new character/text.
		    * 
		    */
		
		String string = "Rat Red";
		System.out.println(string.replace('R', 'C'));
		System.out.println(string.replace("Rat", "Bat"));
		
		    /*
		     * replaceAll() - Replaces all substrings matching the regex pattern.
		     * 
		     * The replaceAll() method replaces each substring that matches the regex of the string 
		     * with the specified text.
		     * 
		     * Syntax:
		     * The syntax of the replaceAll() method is:
		     * 
		     * string.replaceAll(String regex, String replacement)
		     * 
		     * Parameters:
		     * The replaceAll() method takes two parameters.
		     * 
		     * regex - a regex (can be a typical string) that is to be replaced
		     * replacement - matching substrings are replaced with this string
		     * 
		     * Return Value:
		     * The replaceAll() method returns a new string where each occurrence of the matching 
		     * substring is replaced with the replacement string.
		     * 
		     */
		
		     String var = "My Name is Karthikeyan";
		     System.out.println(var.replaceAll(" ", ""));
		     String var4 = "Java123is456fun";
		     System.out.println(var4.replaceAll("\\d+", ""));
		     System.out.println("Java String contains()".replaceAll("\\W+", ""));
		
		     /*
		      * replaceFirst() - Replaces the first matching substring.
		      * 
		      * Syntax:
		      * string.replaceFirst(String regex, String replacement);
		      * 
		      * Parameters:
		      * The replaceFirst() method takes two parameters.
		      * 
		      * regex - a regex (can be a typical string) that is to be replaced
		      * replacement - the first matching substring is replaced with this string
		      * 
		      * Return Value:
		      * The replaceFirst() method returns a new string where the first occurrence of the matching substring is 
		      * replaced with the replacement string.
		      * 
		      */
		     
		     String replace_first = "abbbaaac";
		     System.out.println(replace_first.replaceFirst("aa", "xz"));
		
		      /*
		       * charAt() - Returns the character present in the specified location.
		       * 
		       * Syntax:
		       * The syntax of the string charAt() method is:
		       * string.charAt(int index);
		       * 
		       * Parameter:
		       * index - the index of the character (an int value)
		       * 
		       * Return Value:
		       * returns the character at the specified index
		       * 
		       * Note: If the index passed to chartAt() is negative or out of bounds, 
		       * it throws an exception.
		       * 
		       */
		     
		     String char_at = "Karthik";
		     System.out.println(char_at.charAt(2));
		
               /*
                * indexOf() - Returns the position of the specified character in the string.
                * 
                * The indexOf() method returns the index of the first occurrence of the specified 
                * character/substring within the string.
                * 
                * Syntax:
                * The syntax of the String indexOf() method either
                * string.indexOf(int ch, int fromIndex)
                * or
                * string.indexOf(String str, int fromIndex)
                * 
                * Parameters:
                * To find the index of a character, indexOf() takes these two parameters:
                * 
                * ch - the character whose starting index is to be found
                * fromIndex (optional) - if fromIndex is passed, the ch character is searched starting 
                * from this index
                * 
                * To find the index of the specified substring within the string, indexOf() takes these 
                * two parameters:
                * 
                * str - the string whose starting index is to be found
                * fromIndex (optional) - if fromIndex is passed, the str string is searched starting 
                * from this index
                * 
                * Return Value:
                * 
                * returns the index of the first occurrence of the specified character/string
                * returns -1 if the specified character/string is not found.
                * 
                * Notes:
                * 
                * The character 'a' occurs multiple times in the "Learn Java" string. The indexOf() 
                * method returns the index of the first occurrence of 'a' (which is 2).
                * 
                * If the empty string is passed, indexOf() returns 0 (found at the first position.
                * It is because the empty string is a subset of every substring.
                * 
                * The first occurrence of 'a' in the "Learn Java programming" string is at index 2. 
                * However, the index of second 'a' is returned when str1.indexOf('a', 4) is used. 
                * It is because the search starts at index 4.
                * 
                * The "Java" string is in the "Learn Java programming" string. However, 
                * str1.indexOf("Java", 8) returns -1 (string not found). It is because 
                * the search starts at index 8 and there is no "Java" in "va programming".
                * 		
                */
		     
		     String str = "Javais";
		     System.out.println(str.indexOf("is"));
		
		        /*
		         * trim() - Removes any leading and trailing whitespaces.
		         * The trim() method removes any leading (starting) and trailing (ending) 
		         * whitespaces from the specified string.
		         * 
		         * Parameters:
		         * the trim() method doesn't take any parameters
		         * 
		         * Return Value:
		         * returns a string with leading and trailing whitespace removed
		         * returns the original string if there is no whitespace in the 
		         * start or the end of the string
		         * 
		         */
		     
		     String name = " My name is Karthik ";
		     System.out.println(name.trim());
		
		         /*
		          * split() - Breaks the string into an array of strings.
		          * The split() method divides the string at the specified regex 
		          * and returns an array of substrings.
		          * 
		          * Parameters:
		          * The string split() method can take two parameters:
		          * 
		          * regex - the string is divided at this regex (can be strings)
		          * limit (optional) - controls the number of resulting substrings
		          * 
		          *  If the limit parameter is not passed, split() returns all possible substrings.
		          *  
		          *  Return Value:
		          *  returns an array of substrings
		          *  
		          *  Note: If the regular expression passed to split() is invalid, the split() 
		          *  method raises PatternSyntaxExpression exception.
		          * 
		          */
		     String split = "Learning Java is fun";
		     String[] split2 = split.split(" ", 2);
		     System.out.println(Arrays.toString(split2));
		
		          /*
		           * toLowerCase() - Converts the string to lowercase.
		           * The toLowerCase() method converts all characters in the string to lowercase characters.
		           * 
		           * Syntax:
		           * The syntax of the string toLowerCase() method is:
		           * string.toLowerCase()
		           * Here, string is an object of the String class.
		           * 
		           * Parameters:
		           * The toLowerCase() method does not take any parameters.
		           * 
		           * Return Value:
		           * returns a string with all upper case letters converted to lowercase letters.
		           *  
		           */
		     System.out.println("KARTHIKYEAN".toLowerCase());
		
		           /*
		            * toUpperCase() - Converts the string to uppercase.
		            * 
		            * Syntax:
		            * The syntax of the string toUpperCase() method is:
		            * string.toUpperCase()
		            * Here, string is an object of the String class.
		            * 
		            * Parameters:
		            * doesn't take any parameters
		            * 
		            * Return Value:
		            * returns a string with all lower case letters converted to upper case
		            * 
		            */
		     System.out.println("karthikeyan".toUpperCase());
		
		            /*
		             * valueOf() - Returns the string representation of the specified argument.
		             * The valueOf() method returns the string representation of the argument passed.
                     * 
                     * Syntax:
                     * The syntax of the String valueOf() method for different data types is:
                     * String.valueOf(boolean b)
                     * String.valueOf(char c)
                     * String.valueOf(char[] data)
                     * String.valueOf(double d)
                     * String.valueOf(float f)
                     * String.valueOf(int b)
                     * String.valueOf(long l)
                     * String.valueOf(Object o)
                     * 
                     * Here, valueOf() is a static method. We call the valueof() method using 
                     * the class name like this: String.valueOf(b);
                     * 
                     * Parameters:
                     * The valueOf() method takes a single parameter.
                     * 
                     * data that is to be converted to a string
                     * 
                     * Return Value:
                     * returns the string representation of the argument passed 
                     * 
		             */
		     int a = 120;
		     System.out.println(String.valueOf(a));
		
		             /*
		              * toCharArray() - Converts the string to a char array.
                      * 
                      * Syntax:
                      * string.toCharArray()
                      * 
                      * Parameters:
                      * The toCharArray() method doesn't take any parameters.
                      * 
                      * Return Value:
                      * returns a char array
		              *  
		              */
		     String i = "Muthu";
		     char[] charArray = i.toCharArray();
		     System.out.println(Arrays.toString(charArray));
		     for (int j = charArray.length - 1; j >= 0; j--) {
				System.out.print(charArray[j]);
			 }
		     System.out.println("");
		     
		
		              /*
		               * startsWith() - Checks if the string begins with the given string.
                       * The startsWith() method checks whether the string begins with the 
                       * specified string or not.
                       * 
		               * Syntax:
		               * The syntax of the string startsWith() method is:
                       * string.startsWith(String str, int offset)
                       *
		               * Parameters:
		               * The startsWith() method can take two parameters.
		               * 
		               * str - check whether string starts with str or not
		               * offset (optional) - checks in a substring of string 
		               * starting from this index.
		               * 
		               * Return Value:
		               * returns true if the string begins with the given string
		               * returns false if the string doesn't begin with the given string
		               *  
		               */
		     String h = "QWERTY";
		     System.out.println(h.startsWith("QWET"));
		 
		               /*
		                * endsWith() - Checks if the string ends with the given string.
                        *
                        * Syntax:
                        * The syntax of the string endsWith() method is:
                        * string.endsWith(String str)
                        * 
                        * Parameters:
                        * The endsWith() method takes a single parameter.
                        * str - check whether string ends with str or not
                        * 
                        * Return Value:
                        * returns true if the string ends with the given string
                        * returns false if the string doesn't end with the given string   
		                * 
		                */
		     System.out.println("King".endsWith("g"));
		
		                /*
		                 * isEmpty() - Checks whether a string is empty or not.
                         *  
		                 * Syntax:
		                 * The syntax of the string isEmpty() method is:
		                 * string.isEmpty()
		                 * Here, string is an object of the String class.
		                 * 
		                 * Parameters:
		                 * The isEmpty() method does not take any parameters.
                         *
                         * Return Value:
                         * returns true if the string is empty (length is 0)
                         * returns false if the string is not empty
		                 * 
		                 */
		     
		     String empty = " ";
		     System.out.println(empty.isEmpty());
		     System.out.println(empty.isBlank());
		

	}

}