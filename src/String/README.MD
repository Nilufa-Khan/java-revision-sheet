Write a Java program to check if a vowel is present in a string.
=================================================================

ip:  Hi Welcome to my world!"
op: iska ulta ok

1.take input string from user.
2.take a for loop from 0 to string length
3.take if condition check str.charAt(i) == 'a'|| like that
print the vowel and also print its index.

-------------------------------------------------------------------
How do you check whether a string is a palindrome in Java?
============================================================
What is an example of a palindrome?
=>noon, civic, racecar, level, and mom

1.take a string from user
2.take two variable
we define the isPalindrome() function. In this function, we initiate two indexes, left and right, and give the values 0 and str.length()-1, repectively.

Then, we run a while loop until the left index is less than the right index, and compare the character at the left index and the character at the right.

If the characters are not equal at any point, we return false; otherwise, we return true.
inside the main function, we create a Scanner object to take the input string from the user and store that input in a String input variable.

we call the isPalindrome() function, which returns true if the input is actually a palindrome.