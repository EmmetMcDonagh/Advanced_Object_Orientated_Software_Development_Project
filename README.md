# Advanced_Object_Orientated_Software_Development_Project
# GENERATING A WORD CLOUD FROM TEXT V0.1

Submitted by: Emmet McDonagh (G00222864)
Submitted to: Dr. John Healy

## CONTENTS OF THIS FILE

* Introduction

* Requirements

* Installation

* Configuration

* FAQ

* References



## INTRODUCTION

Word-clouds are a mechanism for generating a visual representation of text and are used to display a visual summary of the most prominent words used on a web page, a news forum or a social media web site. 
A word-cloud is comprised of a set of tags, with each tag representing a single word. 
The prominence of a word is typically estimated from its occurrence frequency in a text and is visualised using a large font size or different font colour.
This Java Word-Cloud API can parse a text file to generate a PNG (portable network graphics) file with a word-cloud displaying the most prominent words in decreasing font size, style and colour.
Note that this API can ignore frequently occurring words generated from the text file (TagCloud.txt). A list of common words is provided in the file ignorewords.txt.


## REQUIREMENTS

* As the project comes inside a zip compressed folder, all the files need to be extracted to a secure location in the user's machine.

* This program requires to be opened from a Terminal.


## INSTALLATION

A Java archive contains the Word Cloud API and runner class with a main() method.
The application once compiled can be run from the Runner class (where the main method lies) using a command prompt using the following syntax: 
java -cp ./wcloud.jar ie.gmit.dip.Runner


## CONFIGURATION

* Once the main menu is showing in the terminal there will be eight options to choose from:


1) Load a new file: The user will be able to select a text file from its own machine, typing the full path

and entering a name to save the new file. This file will be saved in a folder called << Output >>, which is located in the src folder. 

2) Ignore Words: Java class that removes ignore words listed in ignorewords.txt from the file (TagCloud.txt) and returns non-stop words in an array

3) Word Frequency: Java class that displays the words of the file (TagCloud.txt) in a frequency table in descending order (using a Tree Set)

4) Word Frequency with Ignore Words: Java Class that removes ignore words listed in ignorewords.txt from the file (TagCloud.txt) and produces a table of the most frequent words found in the text (file.txt). 
The output is in decreasing usage of words. 

5) Word Cloud: Generate a PNG (portable network graphics) file with a word-cloud displaying the most frequent words in decreasing font size, style and colour from the file (TagCloud.txt) with ignorewords removed. 
The text is drawn directly to a Canvas. The font size can be changed when drawing with a java.awt.Graphicsobject.
This file will be saved in a folder called << Output >>, which is located in the src folder.

6) [Extra] Word Frequency: Java class that displays the words of the file (TagCloud.txt) in a frequency table in descending order (using a Hash Map)

7) [Extra] Draw random text with fontSize based on word frequency (from TagCloud.txt) on the BufferedImage. Uses Graphics2D for rendering images. 

8) Quit: Option used to terminate the program.


## FAQ

Q: After running the program where can I find the new PNG image with the word-cloud?
A: The new image will be located inside the << Output >> folder, located in the program main folder.


## REFERENCES:
1) Code stubs - assignment brief - John Healy
2) https://github.com/VMarisevs/A-Java-Word-Cloud-API/blob/master/ReadMe.md
3) https://www.baeldung.com/java-string-remove-stopwords
4) https://www.baeldung.com/java-count-duplicate-elements-arraylist
5) https://stackoverflow.com/questions/34690321/java-graphics-random-text/34691463
6) https://stackoverflow.com/questions/12469332/how-to-remove-stop-words-in-java
7) https://stackoverflow.com/questions/69544709/adding-text-to-an-image-and-make-it-fit-into-a-rectangular-region-in-java
8) https://stackoverflow.com/questions/39389735/stop-words-removal-method-in-java-not-working
9) https://stackoverflow.com/questions/48834463/how-to-make-a-frequency-table-from-file-content-using-fileinputstream
10) https://stackoverflow.com/questions/5819772/java-parsing-text-file
11)https://stackoverflow.com/questions/50887600/reading-in-text-files-and-removing-words-using-sets-and-lists
