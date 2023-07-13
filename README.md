# Anagram-Checker-
Anagram-Checker By Aisha Amin

An anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.
For example: 
gram = ragm
eat = tea

### AnagramChecker
The AnagramChecker class provides functionality to determine whether two strings are anagrams of each other. 
This method returns true if the given strings are anagrams of each other, and false otherwise.
String text1 = "beyonnex";
String text2 = "xeyebonn";
If both strings are anagrams then the console will print:  
beyonnex and xeyebonn are anagrams.

### Implementation Details

The areAnagrams() method takes two strings as input parameters and returns a boolean value indicating whether the strings are anagrams.

The method removes whitespace characters from the strings and converts them to lowercase to ensure case-insensitive and whitespace-insensitive comparison.

It compares the lengths of the formatted strings. If the lengths are different, the method immediately returns false since two strings of different lengths cannot be anagrams.

The method initializes an integer array, countOfChar, of size 256 (assuming the input strings contain ASCII characters) to keep track of the count of each character in the strings.

It iterates over the characters of the formatted strings, incrementing the count for characters in the first string and decrementing the count for characters in the second string.

Finally, the method checks if there are any non-zero counts in the countOfChar array using the Java Stream API. If any non-zero value is found, it means the strings have different character counts and are not anagrams.
Otherwise, the method returns true, indicating that the strings are anagrams.

## Time Complexity:
 The time complexity of the areAnagrams() method is O(n), where n is the length of the input strings.

## Space Complexity:
 The space complexity of the areAnagrams() method is O(n), where n is the length of the input strings.

## AnagramCheckerTest
The project also contains AnagramCheckerTest with Junit test cases handling the following:
testAnagramSucess
testAnagramFailure
testAnagramWithDifferentLength
testAreAnagramEmptyStrings
testAreAnagramWhitespaceStrings
