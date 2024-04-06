# Website Generator Using Domain-Specific Language

A full-stack website generator using Java and JavaScript for users to design, generate, and maintain their own webpages with human-familiar language.

Utilized Antlr library to tokenize and parse user inputs according to grammar, then implemented dynamic webpage rendering using React framework. Utilized Axios to asynchronously fetch remote resources through HTTP requests.



### Please enter the inputs in the following format



**TITLE**: "TitleName"

**THEME**: "themeA" (Please choose between [themeA, themeB, themeC])

**SECTION**: "SectionName" (Allows multiple sections)

**ITEM**: "ItemName" **from** "InputPath" **cost** "Price" 
(price should be a number with up to 2 decimal places)(allows multiple items)



**NAME**: "ContactName"

**EMAIL**: "ContactEmail"


### Note

- Input is stored as the "input" file in this repo (modify the above inside the input file)
- Output is stored as "output.html" after running the program
- Please refer to UserStudy.md for detailed user studies that we have conducted
