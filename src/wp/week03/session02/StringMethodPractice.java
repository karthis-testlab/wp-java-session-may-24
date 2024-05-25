package wp.week03.session02;

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

	}

}