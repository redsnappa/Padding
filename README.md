# Padding
This was an interview question I had recently, I used the example to write a solution in Scala and Java to compare the languages.

#Interview Question
Given a string, write a method that will pad it with "0" characters so that it ends 12 digits. If it already ends in digits the "0"'s must be padded before the digits.

#Examples

"abc" => "abc000000000000"

"" => "000000000000"

"abc123" => "abc000000000123"

#Conclusions

The scala version was more consise in terms of lines, easier to write, and much easier to read!

For the future, maybe I should try java 8's features to solve this as the new library functions would help.
