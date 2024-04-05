My Android History App

This is an educational yet fun android app specifically designed for students which compares their ages with the ages of our historical figures. The age must only be between 20 and 100 years of age.It teaches the students about the death ages of some of our fallen historical figures.

In the app, a history themed background is used in order to enthral the student’s interests. The image used was extracted from the google website.
The app is designed in a way that the user is prompted to enter their age, using a button for execution of code and using an edit text tool to enable user input. Next to the edit text, a text view with “Enter age” as its text. This helps guide the user on providing input.


The full coding of the app went as follows :

First off, a button is  introduced to the computer, declared as a  private lateinit variable. The private lateinit function makes the button accessable to the user only in the class ageCollision, as it is declared under it.(reference for class info)
 A textview named txtEnterAge was also  declared under the same class as well as
editEnterAge, as an EditText and btnClear as a button. All the above mentioned variables were declared as private lateinit var 's making them only accessible int the ageCollision class for the app.

On to intialising my variables, all initialisations were done under the system override fun onCreate, in order to execute the code when the app is run is running and the constriant layout creates.
All four of my above declared variables were initialised using the findViewById() function.

For my button btnGenerate, owe used the setOnClickListener function to make the button clickable.
Inside the fuction a immutable variable "age" was ceated to prompt the age value from the user. The 'age' variable gets a text value from an editText,"editEnterAge',converts it to a string using the toString() function, also doing an integer or null check using the IntOrNull() function.
After I wrote code declaring a variable which will store user age when the user is prompted, I used an if statement to do a null check on my age variable and to check whether the age is between 20 and 100.
When both of those conditions are met, a variable named ‘historicalFigureName’ will be created to store the historical figure’s ages with their names and with the use of a when statement, I was able to compare the user age with the ages of historical figures.
If the user age does not match any of the ages, the variable “historicalFigureName” will return a null value. If the user age matches any of the available historical figure ages, a variable called “message” is created to display a suitable message for the user.
Inside the variable, an if statement was used to do a null check on the “historicalFigureName” variable. If ‘historicalFigureName’ variable is null, then a message informing the user that no ages compares to theirs will be displayed using a textview.

But if the variable is not null, a message informing the user about the historical figure name the users age compares to will be displayed using a textview called “txtEnterAge”.
