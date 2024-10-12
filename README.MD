**Android app** using **Android Studio**
========================================


**Convert the chosen web app into an Android app —** [https://calda-4a.web.app/](https://calda-4a.web.app/)

[https://github.com/jpablico20/Android-Apps.git](https://github.com/jpablico20/Android-Apps.git)

Main Activity
=============

![captionless image](https://miro.medium.com/v2/resize:fit:622/format:webp/1*kXgIOHAIKX7F6HdYFinmOQ.png)

Buttons Declaration
-------------------

The buttons are declared as member variables in the activity class. Each button represents a feature or an action such as BMI Solver, Character Counter, etc.

```
Button btnDisplayHelloWorld, btnshowHelloButton, btnDisplayname, btnCounter, 
// and many more buttons
```

Button Initialization
---------------------

Each button is initialized using `findViewById`, connecting the Java code to the UI elements defined in the layout file.

```
btnDisplayHelloWorld = findViewById(R.id.btn_displayhelloworld);
// other buttons are similarly initialized
```

Button Click Listeners, and Intent and Activity Launching
---------------------------------------------------------

Each button is assigned a click listener that triggers an intent. This intent opens a new activity representing a specific feature. The `Intent` object is used to navigate between different activities within the app. For each button, an intent is created to open the respective class (e.g., `BmiSolver`, `Calculator`, etc.).

```
btnDisplayHelloWorld.setOnClickListener(v -> {
    Intent intent = new Intent(MainActivity.this, DisplayHelloWorld.class);
    startActivity(intent);
});
```

This `MainActivity` serves as a hub, linking different functionalities via buttons. Each button is connected to a specific activity through intents, making it easy for users to navigate through various features.

Display Hello World
===================

![captionless image](https://miro.medium.com/v2/resize:fit:622/format:webp/1*p1RKnBIugYzmrCT6vKQ4NA.png)

TextView Declaration and Initialization
---------------------------------------

A `TextView` named `helloWorld` is declared to display a simple text message to the user. The `TextView` is initialized by finding its ID (`hello_world`) from the XML layout. `**findViewById(R.id.hello_world)**`: This method links the `helloWorld` variable in Java to the UI element with ID `hello_world` in the XML layout.

```
TextView helloWorld;
helloWorld = findViewById(R.id.hello_world);
```

Setting Text
------------

The `setText()` method is called to change the text displayed by the `TextView` to "Hello World".

```
helloWorld.setText("Hello World");
```

This simple activity displays the message “Hello World” in a `TextView`. When this activity is launched, the user sees the text "Hello World" on the screen. It demonstrates basic text manipulation in Android using the `TextView` widget.

Show Hello Button
=================

![captionless image](https://miro.medium.com/v2/resize:fit:624/format:webp/1*D4yRPe-gHrn-XFYWonQYtw.png)

Button Click Listener
---------------------

The `setOnClickListener` method is used to define what happens when the button is clicked. In this case, it updates the `TextView` text.

```
btn_showHello.setOnClickListener(v -> {
    showHello.setText("Hello World");
});
```

*   `**btn_showHello.setOnClickListener**`: Attaches a click listener to the button `btn_showHello`.
*   **Lambda Expression (**`**v -> {...}**`**)**: Defines the action to take when the button is clicked. In this case, it sets the text of the `TextView`.

Setting Text
------------

The `showHello.setText("Hello World")` method is called inside the click listener to update the `TextView` content.

*   `**showHello.setText("Hello World")**`: Changes the displayed text of the `TextView` `showHello` to "Hello World".

When the user clicks the button `btn_showHello`, the text in the `TextView` `showHello` is updated to display "Hello World". It's a straightforward interaction where a button click dynamically changes text on the screen.

Display Name
============

![captionless image](https://miro.medium.com/v2/resize:fit:624/format:webp/1*Po7ux6uhr4-eXp7jHiTkGw.png)

Retrieving Text from EditText
-----------------------------

The `getText()` method fetches the input from the `EditText` field, and `toString()` converts it into a string.

```
String getName = inputName.getText().toString();
```

*   `**inputName.getText().toString()**`: Retrieves the user's input from the `EditText` field `inputName` as a string and stores it in the `getName` variable.

Displaying the Name
-------------------

The `setText()` method is called to set the retrieved name in the `TextView` (`showName`).

```
showName.setText(getName);
```

*   `**showName.setText(getName)**`: Updates the `TextView` `showName` with the name inputted by the user.

When the user types their name into `inputName` and clicks the button `btnShowName`, the entered name is displayed in the `TextView` `showName`. This provides a simple way for users to input and see their name on the screen.

Counter
=======

![captionless image](https://miro.medium.com/v2/resize:fit:628/format:webp/1*uKSwM5axeGetwz58p6KxQQ.png)

Counter Variable
----------------

A variable `counter` is initialized to 0 and will keep track of the number of times the button is clicked.

```
int counter = 0;
``````
btnAddCount.setOnClickListener(v -> {
    counter++;
    showCounter.setText("Counter: " + counter);
});
```

`**counter++**`: Increments the value of `counter` by 1 each time the button is clicked.

The `setText()` method is called to update the `TextView` (`showCounter`) with the current count.

`**showCounter.setText("Counter: " + counter)**`: Updates the `TextView` to show the current value of the `counter` variable.

Each time the user clicks the button `btnAddCount`, the counter increments by 1, and the updated value is displayed in the `TextView`.

Simple Form
===========

![captionless image](https://miro.medium.com/v2/resize:fit:628/format:webp/1*3wfhwYJhSJBwZEATos2G_w.png)

1. Retrieving User Input
-------------------------

When the button `btnSubmit` is clicked, the `setOnClickListener` method captures the input from the `EditText` fields.

```
btnSubmit.setOnClickListener(v -> {
    getName = enterName.getText().toString();
    getEmail = enterEmail.getText().toString();
```

*   `**getName**`: Retrieves the text entered in the `enterName` field and converts it to a `String`.
*   `**getEmail**`: Retrieves the text entered in the `enterEmail` field and converts it to a `String`.

2. Displaying the Data
-----------------------

The captured data (`getName` and `getEmail`) is displayed in the `TextView` (`showData`).

```
showData.setText("Submitted Data: \n" + "Name: " + getName + "\nEmail: " + getEmail);
```

*   `**showData.setText(...)**`: Updates the `TextView` to display the submitted data, including the name and email.

Complete Process
----------------

1.  User enters their name and email in the `EditText` fields (`enterName` and `enterEmail`).
2.  Clicking the `btnSubmit` retrieves the input data using `getText().toString()`.
3.  The data is displayed in the `TextView` as formatted text.

User Age
========

![captionless image](https://miro.medium.com/v2/resize:fit:608/format:webp/1*9GzqpzEpk9O9LZ3L34swww.png)

1. Button Click Listener
-------------------------

When the `btnSubmitBirthYear` button is clicked, the `setOnClickListener` is triggered.

```
btnSubmitBirthYear.setOnClickListener(v -> {
    getBirthYear = Integer.parseInt(enterBirthYear.getText().toString());
    currentYear = LocalDate.now().getYear();
    totalAge = currentYear - getBirthYear;
    showAge.setText("Your age is: " + totalAge);
});
```

2. Retrieving and Parsing Input
--------------------------------

The birth year entered by the user in the `enterBirthYear` `EditText` field is captured and converted from a string to an integer.

```
getBirthYear = Integer.parseInt(enterBirthYear.getText().toString());
```

*   `**enterBirthYear.getText().toString()**`: Retrieves the birth year as a string from the `EditText` field.
*   `**Integer.parseInt()**`: Converts the string input to an integer.

3. Getting the Current Year
----------------------------

The `LocalDate.now().getYear()` method is used to get the current year.

```
currentYear = LocalDate.now().getYear();
```

*   `**LocalDate.now().getYear()**`: Retrieves the current year using the `LocalDate` class.

4. Calculating the Age
-----------------------

The age is calculated by subtracting the entered birth year from the current year.

```
totalAge = currentYear - getBirthYear;
```

*   `**totalAge**`: Stores the result of the subtraction (i.e., the user's age).

5. Displaying the Age
----------------------

Finally, the calculated age is displayed in the `TextView` (`showAge`).

```
showAge.setText("Your age is: " + totalAge);
```

*   `**showAge.setText(...)**`: Updates the `TextView` with the calculated age.

Complete Flow
-------------

1.  The user enters their birth year in the `EditText` field.
2.  Clicking the `btnSubmitBirthYear` button retrieves the birth year and calculates the user's age.
3.  The current year is retrieved using `LocalDate`.
4.  The user’s age is displayed in the `TextView`.

User Greeting
=============

![captionless image](https://miro.medium.com/v2/resize:fit:636/format:webp/1*IN3zzZHyGpWdwyw_n3oWVA.png)

**Handle Button Click**: When the button `btnSubmitGreeting` is clicked, the following actions occur:

```
btnSubmitGreeting.setOnClickListener(v -> {
```

**Retrieve User Input**: The username is retrieved from an `EditText` named `enterUserName`. The input string is stored in the variable `getName`.

```
getName = enterUserName.getText().toString();
```

**Display Greeting**: A greeting message is created by concatenating “Hello, “ with the retrieved username, followed by an exclamation mark. This message is then displayed in a `TextView` named `showGreet`.

```
showGreet.setText("Hello, " + getName + "!");
```

Summary
-------

When the user enters their name and clicks the `btnSubmitGreeting`, the app responds with a personalized greeting.

Calculator
==========

![captionless image](https://miro.medium.com/v2/resize:fit:624/format:webp/1*7k-RrqKJcoG2hV5n-sgNXQ.png)

This code handles basic arithmetic operations (addition, subtraction, multiplication, and division) using button click events. Each operation captures user input, processes it, and displays the result.

```
        btnAdd.setOnClickListener((view) -> {
            getFirstNum = Integer.parseInt(enterFirstNum.getText().toString());
            getSecondNum = Integer.parseInt(enterSecondNum.getText().toString());
            result = getFirstNum + getSecondNum;
            showResult.setText("Result: " + result);
        });
        btnSubtract.setOnClickListener((view) -> {
            getFirstNum = Integer.parseInt(enterFirstNum.getText().toString());
            getSecondNum = Integer.parseInt(enterSecondNum.getText().toString());
            result = getFirstNum - getSecondNum;
            showResult.setText("Result: " + result);
        });
        btnMultiply.setOnClickListener((view) -> {
            getFirstNum = Integer.parseInt(enterFirstNum.getText().toString());
            getSecondNum = Integer.parseInt(enterSecondNum.getText().toString());
            result = getFirstNum * getSecondNum;
            showResult.setText("Result: " + result);
        });
        btnDivide.setOnClickListener((view) -> {
            num1 = Double.parseDouble(enterFirstNum.getText().toString());
            num2 = Integer.parseInt(enterSecondNum.getText().toString());
            result1 = num1 / num2;
            String formattedNumber = String.format("%.2f", result1);
            showResult.setText("Result: " + formattedNumber);
        });
```

Each operation have adds, subtracts, multiplies, and divides the `getFirstNum` and `getSecondNum`.

Shows the result in `showResult`.

Each button click listener retrieves user input from `EditText` fields, parses the input, performs the respective arithmetic operation, and displays the result in the `TextView`.

Text Length
===========

![captionless image](https://miro.medium.com/v2/resize:fit:630/format:webp/1*ghu2xB-rlgZKm8bSANRBZA.png)

The button `btnCalculateLength` is set up to respond to click events. When the button is clicked, it performs the following actions:

**Retrieve Input**: It gets the string entered by the user from an `EditText` field named `enterString`.

```
getString = enterString.getText().toString();
```

**Calculate Length**: It calculates the length of the retrieved string using the `.length()` method.

```
getLength = getString.length();
```

**Display Result**: Finally, it updates a `TextView` named `showLength` to display the length of the string.

```
showLength.setText("Length of the String: " + getLength);
```

Summary
-------

When the user enters a string and clicks the `btnCalculateLength`, the app calculates the length of that string and displays it in the `TextView`, providing instant feedback to the user. This is a straightforward way to show how user input can be processed in an Android application.

Currency Converter
==================

![captionless image](https://miro.medium.com/v2/resize:fit:620/format:webp/1*lHN7_beK6KOb2tWave1NKQ.png)

**Define Conversion Rate**: The conversion rate from the foreign currency to PHP is defined at the beginning.

```
double pesoRate = 56.21; // Rate to convert to PHP
```

**Handle Button Click**: When the button `btnConvert` is clicked, the following actions occur:

```
btnConvert.setOnClickListener(v -> {
```

**Retrieve Input Amount**: The amount to be converted is retrieved from an `EditText` named `inputAmount`. The input string is parsed into a `double` for numerical calculations.

```
getAmount = Double.parseDouble(inputAmount.getText().toString();
```

**Convert to PHP**: The retrieved amount is multiplied by the conversion rate to calculate the equivalent amount in PHP.

```
phpAmount = getAmount * pesoRate;
```

**Display Converted Amount**: The result is displayed in a `TextView` named `showAmount`, showing the user the converted amount.

```
showAmount.setText("Amount in PHP: " + phpAmount);
```

Summary
-------

When the user inputs an amount and clicks the `btnConvert`, the app calculates the equivalent value in Philippine Pesos based on the specified conversion rate and displays it.

Even Odd Checker
================

![captionless image](https://miro.medium.com/v2/resize:fit:604/format:webp/1*C2z0HhktfAzZvw6_j3-5GQ.png)

*   **Retrieve User Input**: The code retrieves the number input by the user from an `EditText` named `enterNum` and converts it from a string to an integer, storing it in the variable `getNum`.

```
getNum = Integer.parseInt(enterNum.getText().toString());
```

*   **Check Even or Odd**: The code checks if the number is even or odd by using the modulus operator `%`. If the remainder of `getNum` divided by 2 is zero, the number is even; otherwise, it's odd.

```
if (getNum % 2 == 0) {     
  resultEvenOdd.setText("The number is Even"); 
} else {
  resultEvenOdd.setText("The number is Odd"); 
}
```

*   **Display Result**: The result is displayed in a `TextView` named `resultEvenOdd`, informing the user whether the number they entered is even or odd.

Word Reverser
=============

![captionless image](https://miro.medium.com/v2/resize:fit:636/format:webp/1*O3bq8EDWUBuP8ZVtVu7ysg.png)

**Button Click Listener**: The `btnReverse` button has an `OnClickListener` that triggers when the button is clicked:

```
btnReverse.setOnClickListener(v -> {
```

**Retrieve User Input**: It gets the word entered by the user from an `EditText` named `enterWord` and stores it in `getWord`.

```
getWord = enterWord.getText().toString();
```

**Reverse the Word**:

*   A `StringBuilder` object named `input` is created.
*   The input word is appended to this `StringBuilder`.
*   The `reverse()` method is called to reverse the content, which is then converted back to a string.

```
StringBuilder input = new StringBuilder(); 
input.append(getWord); 
reverseWord = input.reverse().toString();
```

**Display Result**: The reversed word is displayed in a `TextView` named `resultReverse`.

```
resultReverse.setText(reverseWord);
```

**Show Date**
=============

![captionless image](https://miro.medium.com/v2/resize:fit:626/format:webp/1*IPBEWIoh0fAOmpfQkHW1kA.png)

**Get Current Date and Time**:

*   `currentDate` retrieves the current date using `LocalDate.now().toString()`.
*   `currentTime` retrieves the current time using `LocalTime.now().toString()`.

```
currentDate = LocalDate.now().toString(); 
currentTime = LocalTime.now().toString();
```

**Display Result**: The current date and time are concatenated and displayed in a `TextView` named `showDate`.

```
showDate.setText(currentDate + " " + currentTime);
```

Show Username
=============

![captionless image](https://miro.medium.com/v2/resize:fit:618/format:webp/1*6ucJyz8mcuaQWZ3BMK4LBw.png)

**Retrieve Username**: It retrieves the text input from `inputUsername` (presumably an `EditText`) and converts it to a string:

```
String getUsername = inputUsername.getText().toString();
```

**Display Username**: The retrieved username is then displayed in a `TextView` called `showUsername` with a message:

```
showUsername.setText("Your username is: " + getUsername);
```

Multiplication Table
====================

![captionless image](https://miro.medium.com/v2/resize:fit:620/format:webp/1*J-wA1WbkY-zNK3UuebxLwQ.png)

**Retrieve Input Number**: It retrieves the number entered in `inputNum` (an `EditText`) and converts it to an integer:

```
getNum = Integer.parseInt(inputNum.getText().toString());
```

**Generate Multiplication Table**: A `for` loop runs from 1 to 10. For each iteration:

*   It multiplies `getNum` by the loop index `i`.
*   The result (`getOutput`) is calculated and formatted into a string.
*   Each multiplication result is appended to `showTable` (likely a `TextView`):

```
for (int i = 1; i <= 10; i++) {
     getOutput = getNum * i;
     showTable.append(getNum + " x " + i + " = " + getOutput + "\n"); 
}
```

Simple Login
============

![captionless image](https://miro.medium.com/v2/resize:fit:626/format:webp/1*Tm_sQk9TnTRm9DcO_HkaNw.png)

**Retrieve User Input**: It retrieves the values entered in the `EditText` fields for email and password:

```
getEmail = enterEmail.getText().toString(); 
getPassword = enterPassword.getText().toString();
```

**Input Validation**: It checks if either the email or password fields are empty:

```
if (getEmail.isEmpty() || getPassword.isEmpty()) {
```

**Display Messages**:

*   If any field is empty, it shows a message prompting the user to fill both fields:

```
loginConfirmation.setText("Please enter both email and password");
```

*   If both fields are filled, it displays a success message with the entered email:

```
loginConfirmation.setText("Login successful for email: \n" + getEmail);
```

Fahrenheit to Celsius
=====================

![captionless image](https://miro.medium.com/v2/resize:fit:634/format:webp/1*0Lr9W9mdEB3On2PkPW8a4A.png)

**Decimal Formatting**: It creates an instance of `DecimalFormat` to format the output temperature to two decimal places:

```
DecimalFormat df = new DecimalFormat("#.00");
```

**Retrieve User Input**: It retrieves the temperature entered by the user from the `EditText` field:

```
getTemperature = Double.parseDouble(enterTemperature.getText().toString());
```

**Temperature Conversion**: The code converts the Fahrenheit temperature to Celsius using the formula:

*   Celsius=(Fahrenheit−32)×(5/9)

```
convertCelsius = (getTemperature - 32) * (5.0 / 9.0);
```

**Display Result**: Finally, it updates the `TextView` to show the converted temperature, formatted to two decimal places:

```
showCelsius.setText("Temperature in Celsius: " + df.format(convertCelsius)
```

Bookmark List
=============

![captionless image](https://miro.medium.com/v2/resize:fit:642/format:webp/1*OinfN-UyJI_xIlRYInNzRA.png)

**Button Click Listener**: The listener is attached to `btnAdd`, which triggers the following actions when clicked:

```
btnAdd.setOnClickListener(v -> {
     String url = inputUrl.getText().toString();
     if (!url.isEmpty()) {
         addBookmark(url);
         inputUrl.setText("");
     }
 });
```

*   It retrieves the URL entered in the `inputUrl` field.
*   If the URL is not empty, it calls the `addBookmark` method to add the bookmark and clears the input field.

**Add Bookmark Method**: This method creates a new `TextView` for the bookmark:

```
private void addBookmark(String url) {
     TextView bookmarkText = new TextView(this);
     bookmarkText.setText(url);
     bookmarkText.setTextSize(18);
     bookmarkText.setPadding(0, 10, 0, 10);
```

*   It sets the text, size, and padding for the `TextView`.

**Make the Bookmark Clickable**: The code makes the bookmark clickable by using `Linkify`:

```
bookmarkText.setMovementMethod(LinkMovementMethod.getInstance());
 Linkify.addLinks(bookmarkText, Linkify.WEB_URLS);
```

**Remove Button**: A button is created to allow the user to remove the bookmark:

```
Button btnRemove = new Button(this); btnRemove.setText("Remove");
```

**Remove Bookmark Action**: When the remove button is clicked, both the bookmark text and the button are removed from the `bookmarkContainer`:

```
btnRemove.setOnClickListener(v -> {
     bookmarkContainer.removeView(bookmarkText);
     bookmarkContainer.removeView(btnRemove); 
});
```

**Add to Container**: Finally, both the `TextView` and the remove button are added to a container (like a `LinearLayout`):

```
bookmarkContainer.addView(bookmarkText); 
bookmarkContainer.addView(btnRemove);
```

Character Counter
=================

![captionless image](https://miro.medium.com/v2/resize:fit:614/format:webp/1*ATtWOKuh5V6R45rHIpDR1A.png)

**Adding a TextWatcher**: The `addTextChangedListener` method is called on the `inputString` `EditText` to monitor changes in its text content:

```
inputString.addTextChangedListener(new TextWatcher() {
```

**onTextChanged Method**: This method is triggered every time the text in the `EditText` changes:

```
@Override public void onTextChanged(CharSequence s, int start, int before, int count) {
     charCount.setText("Character Count: " + s.length());
 }
```

**beforeTextChanged Method**: This method is called before the text is changed. It can be left empty if no action is needed before the text changes:

```
@Override public void beforeTextChanged(CharSequence s, int start, int count, int after) 
{ }
```

**afterTextChanged Method**: This method is called after the text has been changed. It can also be left empty if no action is needed afterward:

```
@Override public void afterTextChanged(Editable s) { }
```

Palindrome Checker
==================

![captionless image](https://miro.medium.com/v2/resize:fit:640/format:webp/1*f5DbPjsL6n5tX-Ut6Szndw.png)

**Get Input**: The input from an `EditText` field (assumed to be `inputWord`) is retrieved as a string:

```
getInput = inputWord.getText().toString();
```

**Reverse the Input**: A `StringBuilder` is used to reverse the input string:

```
StringBuilder input = new StringBuilder();
input.append(inputWord.getText().toString());
getReverse = input.reverse().toString();
```

**Check for Palindrome**: The original input is compared with the reversed string to check if they are the same:

```
if (getInput.equals(getReverse)) {
     resultPalindrome.setText(getInput + " is a palindrome"); 
} else {
     resultPalindrome.setText(getInput + " is NOT a palindrome"); 
}
```

Temperature Converter
=====================

![captionless image](https://miro.medium.com/v2/resize:fit:614/format:webp/1*om0_tXyjZiYYAlf3GX8Zqw.png)

*   **Spinner for Conversion Types**: An array of conversion types is created and used to populate a spinner (dropdown menu):

```
String[] conversionTypes = {"Fahrenheit to Celsius", "Celsius to Fahrenheit"};
ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, conversionTypes);
adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item); 
conversionTypeSpinner.setAdapter(adapter);
```

*   **Button Click Listener**: A click listener is set on the `convertButton`, which executes the following logic when clicked:

```
convertButton.setOnClickListener(v -> {
```

*   **Input Validation**: The code checks if the user has entered a temperature value. If not, an error message is displayed:

```
if (tempInput.isEmpty()) {
     inputTemperature.setError("Please enter a temperature"); 
} else {
     inputTemperature.setError(null);
```

*   **Temperature Conversion**: The entered temperature value is parsed to a double, and the selected conversion type is determined:

```
double tempValue = Double.parseDouble(tempInput); 
String conversionType = conversionTypeSpinner.getSelectedItem().toString(); 
double convertedTemp = 0.0;
```

*   Depending on the conversion type selected, the temperature is converted using the appropriate formula:
*   **Fahrenheit to Celsius**:

```
if (conversionType.equals("Fahrenheit to Celsius")) {
     convertedTemp = (tempValue - 32) * 5 / 9; 
}
```

*   **Celsius to Fahrenheit**:

```
else if (conversionType.equals("Celsius to Fahrenheit")) {
     convertedTemp = (tempValue * 9 / 5) + 32; 
}
```

*   **Display Result**: Finally, the converted temperature is formatted to two decimal places and displayed in a `TextView`:

```
resultTextView.setText("Converted Temperature: " + String.format("%.2f", convertedTemp));
```

Shopping List
=============

![captionless image](https://miro.medium.com/v2/resize:fit:664/format:webp/1*VlwDhPW8RIVJKpymwLiuOg.png)

**Button Click Listener**: The `btnAdd` button is set up with a click listener that handles the addition of new items. When the button is clicked, it retrieves the text input from `itemInput`:

```
btnAdd.setOnClickListener(v -> {
    String itemName = itemInput.getText().toString();
    if (!itemName.isEmpty()) {
        addItem(itemName);
        itemInput.setText("");
    }
});
```

**Item Addition**: If the input is not empty, the `addItem` method is called, passing the entered item name as an argument. The input field is then cleared:

```
if (!itemName.isEmpty()) {
    addItem(itemName);
    itemInput.setText("");
}
```

**Creating Item Layout**: The `addItem` method creates a new horizontal layout (`LinearLayout`) for each item, which contains a `TextView` displaying the item name and a `Button` for removing the item:

```
private void addItem(String itemName) {
    LinearLayout itemLayout = new LinearLayout(this);
    itemLayout.setOrientation(LinearLayout.HORIZONTAL);
    TextView itemText = new TextView(this);
    itemText.setText(itemName);
    itemText.setTextSize(18);
```

**Remove Button**: A “Remove” button is added, which, when clicked, will remove the entire item layout from the container:

```
Button btnRemove = new Button(this);
btnRemove.setText("Remove");
btnRemove.setOnClickListener(v -> itemContainer.removeView(itemLayout));
```

**Adding Views to Layout**: The `TextView` and the remove button are added to the horizontal layout, which is then added to the main container (`itemContainer`):

```
itemLayout.addView(itemText);
itemLayout.addView(btnRemove);
itemContainer.addView(itemLayout);
```

Factorial Calculator
====================

![captionless image](https://miro.medium.com/v2/resize:fit:634/format:webp/1*VZSiDHhAebmJpPFimN5h4A.png)

**Button Click Listener**: The `btnCalculateFactorial` button has a click listener that triggers when the button is pressed. It retrieves an integer from the input field `enterNum`:

```
btnCalculateFactorial.setOnClickListener(v -> {
    int getNum = Integer.parseInt(enterNum.getText().toString());
```

**Initial Result Setup**: A variable `result` is initialized to `1`, which will be used to store the factorial result:

```
int result = 1;
```

**Factorial Calculation**:

**Base Case**: If the input number is `0` or `1`, the factorial is `1`, and this value is displayed:

```
if (getNum == 0 || getNum == 1){
    showFactorial.setText("Factorial: " + result);
```

**Loop for Calculation**: For numbers greater than `1`, a loop calculates the factorial by multiplying `result` by each integer up to `getNum`. The result is updated in the UI for each iteration (although this will result in multiple updates):

```
else {
    for (int i = 2; i <= getNum; i++){
        result *= i;
        showFactorial.setText("Factorial: " + result);
    }
}
```

To-do Manager
=============

![captionless image](https://miro.medium.com/v2/resize:fit:646/format:webp/1*MSCTCAC0prBS6kWET44FDQ.png)

**Button Click Listener**: The `btnAddTask` button has a click listener that triggers when the button is pressed. It retrieves the task name from the input field `todoInput`:

```
btnAddTask.setOnClickListener(v -> {
    String taskName = todoInput.getText().toString();
    if (!taskName.isEmpty()) {
        addTask(taskName);
        todoInput.setText("");
    }
});
```

**Adding a Task**: The `addTask` method is called if the input is not empty. It creates a new layout for the task:

```
private void addTask(String itemName) {
    LinearLayout taskLayout = new LinearLayout(this);
    taskLayout.setOrientation(LinearLayout.HORIZONTAL);
```

**Task TextView**: A `TextView` is created to display the task name, and its text size is set:

```
TextView taskText = new TextView(this);
taskText.setText(itemName);
taskText.setTextSize(18);
```

**Remove Button**: A button labeled “Remove” is created. When clicked, it removes the task layout from the `todoContainer`:

```
Button btnRemove = new Button(this);
btnRemove.setText("Remove");
btnRemove.setOnClickListener(v -> todoContainer.removeView(taskLayout));
```

**Adding Views**: The task text and remove button are added to the `taskLayout`, which is then added to the `todoContainer`:

```
taskLayout.addView(taskText);
taskLayout.addView(btnRemove);
todoContainer.addView(taskLayout);
```

Guess Number Game
=================

![captionless image](https://miro.medium.com/v2/resize:fit:616/format:webp/1*NMDzeXxFG9T1c1mVSNfkAA.png)

**Random Number Generation**: The game starts by generating a random number between 1 and 100 using the `Random` class. This is done by calling the `generatedNewRandomNumber()` method:

```
random = new Random();
generatedNewRandomNumber();
```

**Button Click Listener**: The `btnCheckGuess` button has a click listener that processes the user's guess. When clicked, it retrieves the user's input, converts it to an integer, and compares it to the generated number (`guessNum`):

```
btnCheckGuess.setOnClickListener(v -> {
    int getNum = Integer.parseInt(inputGuess.getText().toString());
```

**Guess Comparison**: The code checks if the guess is too high, too low, or correct:

*   If the guess is too high, a message prompts the user to try again:

```
if (getNum > guessNum) {
    showGuess.setText("Too high! Try again");
```

*   If the guess is too low, a different message is shown:

```
} else if (getNum < guessNum) {
    showGuess.setText("Too low! Try again");
```

*   If the guess is correct, a congratulatory message is displayed, and a new random number is generated for another round:

```
} else if (getNum == guessNum) {
    showGuess.setText("Congratulations! You guessed the number!");
    generatedNewRandomNumber();
}
```

**New Random Number Generation**: The `generatedNewRandomNumber()` method generates a new random number and clears the input field:

```
private void generatedNewRandomNumber(){
    guessNum = random.nextInt(100) + 1;
    inputGuess.setText("");
}
```

Word Counter
============

![captionless image](https://miro.medium.com/v2/resize:fit:638/format:webp/1*ZtRK_4qNGIwMk9rKSR0LrQ.png)

**Trim Input**: The input string is trimmed to remove any leading or trailing whitespace:

```
getString = inputWords.getText().toString().trim();
```

**Initial Check**: If the input string is not empty, it initializes the word counter to 1:

```
if (!getString.isEmpty()) {
    counter = 1;
```

**Counting Words**: The code iterates through the string character by character. It checks for spaces and increments the counter when it finds a space followed by a non-space character:

```
for (int i = 0; i < getString.length() - 1; i++) {
    if (getString.charAt(i) == ' ' && getString.charAt(i + 1) != ' ') {
        counter++;
    }
}
```

**Display Word Count**: Finally, the word count is displayed in the `wordCount` TextView:

```
wordCount.setText("Word count: " + counter);
```

Random Number Generator
=======================

![captionless image](https://miro.medium.com/v2/resize:fit:632/format:webp/1*skGX8t1i7mkSUTv7RcbSXA.png)

**Random Number Generation**:

*   An instance of the `Random` class is created to facilitate random number generation:

```
Random random = new Random();
```

**Button Click Listener**:

*   The `btnGenerateRandomNumber` button has an `OnClickListener` that executes the following when clicked:

```
btnGenerateRandomNumber.setOnClickListener(v -> {
```

**Getting Minimum and Maximum Values**:

*   The code retrieves the maximum and minimum values entered by the user, converting them from strings to integers:

```
getMaxValue = Integer.parseInt(maximumValue.getText().toString());
getMinValue = Integer.parseInt(minimumValue.getText().toString());
```

**Generating a Random Number**:

*   A random number is generated within the specified range:

```
int generateRandomNumber = random.nextInt((getMaxValue - getMinValue) + 1) + getMinValue;
```

**Displaying the Result**:

*   The generated random number is displayed in the `randomNumber` TextView:

```
randomNumber.setText("Random Number: " + generateRandomNumber);
```

Multiple Checker
================

![captionless image](https://miro.medium.com/v2/resize:fit:624/format:webp/1*eAvBn8VfJJ2EJrdWGct1Kg.png)

**Button Click Listener**:

*   The `btnCheck` button has an `OnClickListener` that executes the following code when clicked:

```
btnCheck.setOnClickListener(v -> {
```

**Input Retrieval**:

*   The code retrieves the numbers entered by the user, converting them from strings to integers:

```
getNum1 = Integer.parseInt(firstNum.getText().toString());
getNum2 = Integer.parseInt(secondNum.getText().toString());
```

**Multiple Check**:

*   The code checks if `getNum1` is a multiple of `getNum2` using the modulus operator:

```
if (getNum1 % getNum2 == 0) {
    showResult.setText(getNum1 + " is a multiple of " + getNum2);
} else {
    showResult.setText(getNum1 + " is not a multiple of " + getNum2);
}
```

Uppercase converter
===================

![captionless image](https://miro.medium.com/v2/resize:fit:640/format:webp/1*VAianAgR9Ii0tzEoSsftiQ.png)

*   **Button Click Listener**:
*   The `btnUppercase` button has an `OnClickListener` that executes the following code when clicked:

```
btnUppercase.setOnClickListener(v -> {
```

**Text Retrieval**:

*   The code retrieves the text from the input field (`inputText`):

```
String getText = inputText.getText().toString();
```

**Uppercase Conversion**:

*   The retrieved text is converted to uppercase using the `toUpperCase()` method:

```
convertUppercase.setText(getText.toUpperCase());
```

Word Shuffler
=============

![captionless image](https://miro.medium.com/v2/resize:fit:618/format:webp/1*QxDUHd5xN3lN47S0PHaGfQ.png)

**Button Click Listener**:

*   When the `btnShuffle` button is clicked, it retrieves the text from the `enterWord` input field:

```
btnShuffle.setOnClickListener(v -> {
    String getText = enterWord.getText().toString();
    String shuffledWord = shuffleString(getText);
    showShuffle.setText(shuffledWord);
});
```

**String Shuffling**:

*   The `shuffleString` method takes the input string and shuffles its characters:

```
public String shuffleString(String input) {
    List<Character> characters = new ArrayList<>();
    for (char c : input.toCharArray()) {
        characters.add(c);
    }
    Collections.shuffle(characters);
    StringBuilder shuffledString = new StringBuilder();
    for (char c : characters) {
        shuffledString.append(c);
    }
    return shuffledString.toString();
}
```

BMI Solver
==========

![captionless image](https://miro.medium.com/v2/resize:fit:630/format:webp/1*s8Pg--IuMM2NqeMip2nwTA.png)

**Button Click Listener**:

*   When the `btnCalculate` button is clicked, it retrieves the values entered for height and weight:

```
btnCalculate.setOnClickListener(v -> {
    String heightStr = etHeight.getText().toString();
    String weightStr = etWeight.getText().toString();
```

**Input Validation**:

*   It checks if both the height and weight inputs are non-empty:

```
if (!heightStr.isEmpty() && !weightStr.isEmpty()) {
```

**BMI Calculation**:

*   If both inputs are valid, it parses the values to doubles and calculates the BMI:

```
double height = Double.parseDouble(heightStr);
double weight = Double.parseDouble(weightStr);
double bmi = weight / (height * height);
```

**Display Result**:

*   The result is formatted to two decimal places and displayed in a TextView:

```
tvResult.setText(String.format("Your BMI is: %.2f", bmi));
```

**Error Handling**:

*   If either input is empty, it prompts the user to enter valid values:

```
tvResult.setText("Please enter valid height and weight.");
```

Username Validator
==================

![captionless image](https://miro.medium.com/v2/resize:fit:622/format:webp/1*mjhLVYwT_3nbk6jilc6beQ.png)

**Button Click Listener**:

*   When the `btnValidate` button is clicked, it retrieves the username entered by the user:

```
btnValidate.setOnClickListener(v -> {
    String username = etUsername.getText().toString();
```

**Username Validation**:

*   It checks if the username is valid using the `isValidUsername` method:

```
if (isValidUsername(username)) {
    tvResult.setText("Valid Username");
} else {
    tvResult.setText("Invalid Username: Only letters, numbers, '_', '@' are allowed. No special characters like %, (), {}, *, !");
}
```

**Regex Validation**:

*   The `isValidUsername` method uses a regular expression to ensure the username only contains letters, numbers, underscores, and the '@' character:

```
private boolean isValidUsername(String username) {
    String regex = "^[a-zA-Z0-9_@]+$";
    return username.matches(regex);
}
```

Interest Calculator
===================

![captionless image](https://miro.medium.com/v2/resize:fit:614/format:webp/1*004e3tM8jxft_o2Ky3p3Kw.png)

**Button Click Listener**:

*   When the `btnCalculate` button is clicked, the code retrieves values from the input fields for principal, rate, and time:

```
btnCalculate.setOnClickListener(v -> {
    String principalStr = etPrincipal.getText().toString();
    String rateStr = etRate.getText().toString();
    String timeStr = etTime.getText().toString();
```

**Input Validation**:

*   It checks if any of the input fields are empty before proceeding to calculations:

```
if (!principalStr.isEmpty() && !rateStr.isEmpty() && !timeStr.isEmpty()) {
```

**Simple Interest Calculation**:

*   It calculates simple interest using the formula: Simple Interest=Principal×(1+Rate×Time)
*   The rate is divided by 100 to convert the percentage into a decimal:

```
double simpleInterest = principal * (1 + (rate * time));
```

**Display Result**:

*   The result is formatted and displayed to the user:

```
tvResult.setText(String.format("Simple Interest: %.2f", simpleInterest));
```

Compound Interest Calculator
============================

![captionless image](https://miro.medium.com/v2/resize:fit:622/format:webp/1*-lYY3qUEC1UByNgXHx4W3g.png)

**Compounding Frequencies**:

*   A list of compounding frequencies is created and set to a spinner (dropdown menu):

```
List<String> frequencies = new ArrayList<>();
frequencies.add("Annually");
frequencies.add("Quarterly");
frequencies.add("Monthly");
frequencies.add("Daily");
```

**Adapter for Spinner**:

*   An `ArrayAdapter` is used to bind the frequency options to the spinner:

```
ArrayAdapter<String> adapter = new ArrayAdapter<>(this,
        android.R.layout.simple_spinner_item, frequencies);
adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
spinnerFrequency.setAdapter(adapter);
```

**Button Click Listener**:

*   When the `btnCalculate` is clicked, it retrieves values from input fields and the selected frequency:

```
btnCalculate.setOnClickListener(v -> {
    String principalStr = etPrincipal.getText().toString();
    String rateStr = etRate.getText().toString();
    String timeStr = etTime.getText().toString();
    String frequencyStr = spinnerFrequency.getSelectedItem().toString();
```

**Compound Interest Calculation**:

*   Compound interest is calculated using the formula: A=P(1+r/n)^nt
*   Where:
*   P = principal amount
*   r = annual interest rate (decimal)
*   n = number of times interest is compounded per year
*   t = time in years
*   The total amount and compound interest are displayed to the user:

```
double compoundInterest = principal * Math.pow((1 + (rate / frequency)), (frequency * time));
double totalAmount = principal + compoundInterest;
```

**Compounding Frequency Method**:

*   The method `getCompoundingFrequency` translates the selected frequency string into an integer:

```
private int getCompoundingFrequency(String frequencyStr) {
    switch (frequencyStr) {
        case "Annually":
            return 1;
        case "Quarterly":
            return 4;
        case "Monthly":
            return 12;
        case "Daily":
            return 365;
        default:
            return 1;
    }
}
```

Fibonacci Generator
===================

![captionless image](https://miro.medium.com/v2/resize:fit:626/format:webp/1*SKg4wQA3phuy7B7pYjXE3A.png)

**Button Click Listener**:

*   The `btnGenerate` button triggers the `generateFibonacci` method when clicked:

```
btnGenerate.setOnClickListener(v -> generateFibonacci());
```

**Fibonacci Sequence Generation**:

*   The `generateFibonacci` method retrieves the number of terms from an EditText and generates the Fibonacci series:

```
private void generateFibonacci() {
    String termsStr = etTerms.getText().toString();
    if (!termsStr.isEmpty()) {
        int terms = Integer.parseInt(termsStr);
        ArrayList<Integer> fibonacciSeries = new ArrayList<>();
```

**Fibonacci Calculation Logic**:

*   A loop runs for the specified number of terms, using the logic for Fibonacci:
*   The first two terms are hardcoded (0 and 1).
*   Subsequent terms are calculated by adding the two preceding terms:

```
for (int i = 0; i < terms; i++) {
    if (i == 0) {
        fibonacciSeries.add(0);
    } else if (i == 1) {
        fibonacciSeries.add(1);
    } else {
        int nextTerm = fibonacciSeries.get(i - 1) + fibonacciSeries.get(i - 2);
        fibonacciSeries.add(nextTerm);
    }
}
```

**Result Display**:

*   The resulting Fibonacci series is converted to a string and displayed in a TextView:

```
tvResult.setText(fibonacciSeries.toString());
```

**Input Validation**:

*   If the input field is empty, a prompt is shown:

```
} else {
    tvResult.setText("Please enter a number.");
}
```

Odd Sum Calculator
==================

![captionless image](https://miro.medium.com/v2/resize:fit:638/format:webp/1*HaLme2XcfDbZ8ZhUanwcvA.png)

**Button Click Listener**:

*   The `btnCalculate` button triggers the sum calculation when clicked:

```
btnCalculate.setOnClickListener(v -> {
    int getNum = Integer.parseInt(etNumber.getText().toString());
    int getSum = 0;
```

**Sum Calculation Logic**:

*   A loop iterates from 1 to the entered number (`getNum`), checking if each number is odd:
*   If the number is odd (`i % 2 == 1`), it is added to `getSum`:

```
for (int i = 1; i <= getNum; i++){
    if (i % 2 == 1) {
        getSum += i;
    }
}
```

**Result Display**:

*   The result is formatted and displayed in a TextView:

```
tvResult.setText(String.format("Sum of odd numbers up to %d is: %d", getNum, getSum));
```

Currency Formatter
==================

![captionless image](https://miro.medium.com/v2/resize:fit:644/format:webp/1*SeQbkIs6K5oxJ7jNlgzZig.png)

**Currency Selection**:

*   A list of currencies is created, and an `ArrayAdapter` is used to populate a spinner (dropdown) with these currencies:

```
List<String> currencies = new ArrayList<>();
currencies.add("Dollar (USD)");
currencies.add("Philippine peso (PHP)");
currencies.add("Euro (EUR)");
ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, currencies);
adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
spinnerCurrencies.setAdapter(adapter);
```

**Button Click Listener**:

*   When the `btnFormat` button is clicked, it retrieves the entered amount and the selected currency, formats the amount, and displays it:

```
btnFormat.setOnClickListener(v -> {
    double getAmount = Double.parseDouble(etAmount.getText().toString());
    String currencyStr = spinnerCurrencies.getSelectedItem().toString();
    String currency = getCurrency(currencyStr);
    tvResult.setText(String.format("Formatted Amount: %s%.2f", currency, getAmount));
});
```

**Currency Symbol Retrieval**:

*   The method `getCurrency` returns the appropriate currency symbol based on the user's selection:

```
private String getCurrency (String currencyStr) {
    switch (currencyStr) {
        case "Dollar (USD)":
            return "$";
        case "Philippine peso (PHP)":
            return "₱";
        case "Euro (EUR)":
            return "€";
        default:
            return "Unknown currency";
    }
}
```

Random Quote Display
====================

![captionless image](https://miro.medium.com/v2/resize:fit:638/format:webp/1*k7FPvX08dUN6R2EVwQoZXw.png)

**Quote List Initialization**:

*   A list of random quotes is created and populated:

```
List<String> randomStrings = new ArrayList<>();
randomStrings.add("The only thing we have to fear is fear itself. — Franklin D. Roosevelt");
randomStrings.add("In the middle of difficulty lies opportunity. — Albert Einstein");
randomStrings.add("The greatest glory in living lies not in never falling, but in rising every time we fall. — Nelson Mandela");
randomStrings.add("Be the change that you wish to see in the world. — Mahatma Gandhi");
randomStrings.add("Success is not final, failure is not fatal: It is the courage to continue that counts. — Winston Churchill");
randomStrings.add("It always seems impossible until it’s done. — Nelson Mandela");
randomStrings.add("Life is what happens when you’re busy making other plans. — John Lennon");
randomStrings.add("Bossing!! Kamusta and buhay-buhay! — Boss");
```

**Random Quote Generation**:

*   When the `btnRandom` button is clicked, a random index is generated, and the corresponding quote is displayed in a `TextView`:

```
btnRandom.setOnClickListener(v -> {
    Random rand = new Random();
    int randomIndex = rand.nextInt(randomStrings.size());
    tvResult.setText(randomStrings.get(randomIndex));
});
```

Uppercase Greeting
==================

![captionless image](https://miro.medium.com/v2/resize:fit:624/format:webp/1*ZNJXddLZvJWTFuS3bshXeA.png)

**User Input**:

*   The user enters text into an input field (represented by `inputText`).

**Uppercase Conversion**:

*   When the `btnUppercase` button is clicked, the application retrieves the text from the input field, converts it to uppercase, and displays the result in another TextView (`convertUppercase`).

Divisible Checker
=================

![captionless image](https://miro.medium.com/v2/resize:fit:640/format:webp/1*H3CCdkunkM4mW8pQuyB9bw.png)

**User Input**:

*   The user enters two integers in two EditText fields (`etFirstNumber` and `etSecondNumber`).

**Divisibility Check**:

*   When the `btnDivisibility` button is clicked, the application retrieves the numbers, checks if the first number is divisible by the second, and displays the result in a TextView (`tvResult`).

```
btnDivisibility.setOnClickListener(v -> {
    int getNum1 = Integer.parseInt(etFirstNumber.getText().toString()); // Get the first number
    int getNum2 = Integer.parseInt(etSecondNumber.getText().toString()); // Get the second number
    if (getNum1 % getNum2 == 0) {
        tvResult.setText(getNum1 + " is divisible by " + getNum2); // Display result if divisible
    } else {
        tvResult.setText(getNum1 + " is not divisible by " + getNum2); // Display result if not divisible
    }
});
```

Random Color Generator
======================

![captionless image](https://miro.medium.com/v2/resize:fit:622/format:webp/1*rhRomnWerHWYG9I26jvT7A.png)

**Button Click**:

*   When the button is clicked, it generates a random color.

**Display Color**:

*   The generated color is used to change the background color of a TextView (`tvColorDisplay`).
*   The hexadecimal representation of the color is displayed as text.

Code Explanation
----------------

Here’s the provided code:

```
btnRandomColor.setOnClickListener(v -> {
    int color = generateRandomColor(); // Generate a random color
    tvColorDisplay.setBackgroundColor(color); // Set the background color
    String hexColor = String.format("#%06X", (0xFFFFFF & color)); // Convert to hex format
    tvColorDisplay.setText(hexColor); // Display the hex color
});
// Method to generate a random color
private int generateRandomColor() {
    Random random = new Random();
    int red = random.nextInt(256); // Random red value
    int green = random.nextInt(256); // Random green value
    int blue = random.nextInt(256); // Random blue value
    return Color.rgb(red, green, blue); // Return the color
}
```

Quote of the Day
================

![captionless image](https://miro.medium.com/v2/resize:fit:618/format:webp/1*RsIoKlhO4GPsYLyJDMz_dQ.png)

**List Initialization**:

*   A list of quotes (`randomStrings`) is created, which includes motivational and insightful sayings from various figures.

**Button Click Listener**:

*   When the button is clicked, a random index is generated, and the corresponding quote from the list is displayed in a TextView (`tvResult`).

Code Explanation
----------------

Here’s the provided code:

```
List<String> randomStrings = new ArrayList<>();
randomStrings.add("The only thing we have to fear is fear itself. — Franklin D. Roosevelt");
randomStrings.add("In the middle of difficulty lies opportunity. — Albert Einstein");
randomStrings.add("The greatest glory in living lies not in never falling, but in rising every time we fall. — Nelson Mandela");
randomStrings.add("Be the change that you wish to see in the world. — Mahatma Gandhi");
randomStrings.add("Success is not final, failure is not fatal: It is the courage to continue that counts. — Winston Churchill");
randomStrings.add("It always seems impossible until it’s done. — Nelson Mandela");
randomStrings.add("Life is what happens when you’re busy making other plans. — John Lennon");
randomStrings.add("Bossing!! Kamusta and buhay-buhay! — Boss");
btnRandom.setOnClickListener(v -> {
    Random rand = new Random();
    int randomIndex = rand.nextInt(randomStrings.size());
    tvResult.setText(randomStrings.get(randomIndex));
});
```

Image Carousel
==============

![captionless image](https://miro.medium.com/v2/resize:fit:644/format:webp/1*WvoxGNGYTlK40wJLWYE3lw.png)

**Text Initialization**:

*   `tvImage` displays the current text associated with an image based on the `currentIndex`.

**Button Click Listeners**:

*   **Previous Button**: Decreases `currentIndex` by one (if it's greater than zero) and updates the displayed text.
*   **Next Button**: Increases `currentIndex` by one (if it's less than the last index) and updates the displayed text.

**Update Method**:

*   `updateImageContent()` method sets the text of `tvImage` based on the `currentIndex`.

Code Explanation
----------------

Here’s the provided code:

```
tvImage.setText(imageTexts[currentIndex]);
btnPrevious.setOnClickListener(v -> {
    if (currentIndex > 0) {
        currentIndex--;
        updateImageContent();
    }
});
btnNext.setOnClickListener(v -> {
    if (currentIndex < imageTexts.length - 1) {
        currentIndex++;
        updateImageContent();
    }
});
private void updateImageContent() {
    tvImage.setText(imageTexts[currentIndex]);
}
```

Stopwatch
=========

![captionless image](https://miro.medium.com/v2/resize:fit:626/format:webp/1*Ss7CMSZS437yjk5bsRPRXQ.png)

**Start Button**:

*   Starts the timer if it isn’t already running, capturing the current time minus any elapsed time.

**Stop Button**:

*   Stops the timer and calculates the total elapsed time when pressed.

**Reset Button**:

*   Resets the timer and display to “00:00”. If the timer is running, it stops first.

**Runnable for Timer Update**:

*   A `Runnable` updates the timer display every second by calculating the difference between the current time and the `startTime`.

Code Explanation
----------------

Here’s the provided code:

```
btnStart.setOnClickListener(v -> {
    if (!isRunning) {
        startTime = System.currentTimeMillis() - elapsedTime;
        handler.postDelayed(updateTimer, 0);
        isRunning = true;
    }
});
btnStop.setOnClickListener(v -> {
    if (isRunning) {
        handler.removeCallbacks(updateTimer);
        elapsedTime = System.currentTimeMillis() - startTime;
        isRunning = false;
    }
});
btnReset.setOnClickListener(v -> {
    if (isRunning) {
        handler.removeCallbacks(updateTimer);
        isRunning = false;
    }
    startTime = 0;
    elapsedTime = 0;
    tvTimer.setText("00:00");
});
private Runnable updateTimer = new Runnable() {
    @Override
    public void run() {
        long millis = System.currentTimeMillis() - startTime;
        int seconds = (int) (millis / 1000);
        int minutes = seconds / 60;
        seconds = seconds % 60;
        tvTimer.setText(String.format("%02d:%02d", minutes, seconds));
        handler.postDelayed(this, 1000);
    }
};
```

Password Strength Checker
=========================

![captionless image](https://miro.medium.com/v2/resize:fit:634/format:webp/1*IBbO2q0LM1grMBGvJUIfpw.png)

**TextWatcher Implementation**:

*   Listens for changes in the password input field.
*   Calls `getPasswordStrength()` to evaluate the password strength and updates the `tvResult`.

**Password Strength Evaluation**:

*   A method that assigns points based on various criteria such as:
*   Length (minimum 6 characters)
*   Presence of lowercase letters
*   Presence of uppercase letters
*   Presence of digits
*   Presence of special characters
*   Additional points for length greater than 10

**Strength Categories**:

*   Returns “Weak,” “Moderate,” or “Strong” based on the total points calculated.

Code Explanation
----------------

Here’s the provided code:

```
etPassword.addTextChangedListener(new TextWatcher() {
    @Override
    public void onTextChanged(CharSequence s, int start, int before, int count) {
        tvResult.setText("Strength: " + getPasswordStrength(s.toString()));
    }
    @Override
    public void beforeTextChanged(CharSequence s, int start, int count, int after) {
    }
    @Override
    public void afterTextChanged(Editable s) {
    }
});
public String getPasswordStrength(String password) {
    int strengthPoints = 0;
    if (password.length() < 6) {
        return "Weak";
    }
    if (password.matches(".*[a-z].*")) {
        strengthPoints++;
    }
    if (password.matches(".*[A-Z].*")) {
        strengthPoints++;
    }
    if (password.matches(".*[0-9].*")) {
        strengthPoints++;
    }
    if (password.matches(".*[!@#\\$%^&*()-+=].*")) {
        strengthPoints++;
    }
    if (password.length() > 10) {
        strengthPoints++;
    }
    if (strengthPoints <= 2) {
        return "Weak";
    } else if (strengthPoints == 3) {
        return "Moderate";
    } else {
        return "Strong";
    }
}
```

Quiz Game
=========

![captionless image](https://miro.medium.com/v2/resize:fit:622/format:webp/1*H7g1sUVbk7iuB34jOLdxoQ.png)

**Submit Button Logic**:

*   When the user clicks the submit button (`btnSubmit`), the code checks which radio button is selected.
*   If no button is selected, it prompts the user to choose an answer.
*   If a button is selected, it retrieves the selected button’s text and checks if it matches the correct answer (“Paris”).
*   It then updates a TextView (`tvResult`) with either "Correct!" or "Wrong answer. Try again!"

**Reset Button Logic**:

*   When the reset button (`btnReset`) is clicked, it clears the user's selection in the radio group (`radioGroup`).

Code Implementation
-------------------

Here’s the provided code snippet:

```
btnSubmit.setOnClickListener(v -> {
    int selectedId = radioGroup.getCheckedRadioButtonId();
    if (selectedId == -1) {
        tvResult.setText("Please choose an answer.");
    } else {
        selectedRadioButton = findViewById(selectedId);
        String getText = selectedRadioButton.getText().toString();
        if (getText.equals("Paris")) {
            tvResult.setText("Correct!");
        } else {
            tvResult.setText("Wrong answer. Try again!");
        }
    }
});
btnReset.setOnClickListener(v -> {
    radioGroup.clearCheck();
});
```

Timer
=====

![captionless image](https://miro.medium.com/v2/resize:fit:614/format:webp/1*nnveF_qTKUpCwQC__Mk4Sw.png)

**Start Button Logic:**

When the user clicks the start button (`btnStart`), the code retrieves the input from the EditText (`etTime`). If no input is provided, it prompts the user to enter a valid number.
If the timer is not already running, it converts the input time (in seconds) to milliseconds and starts the countdown timer by calling `startTimer()`.

**Pause Button Logic:**

When the pause button (`btnPause`) is clicked, the countdown is paused by canceling the current `CountDownTimer`, and the `isRunning` flag is set to false.

**Reset Button Logic:**

When the reset button (`btnReset`) is clicked, the countdown is stopped if it's running, and the remaining time is reset to 0. It also clears the EditText (`etTime`) and updates the timer display (`tvTimer`) to "0".

Code Implementation:
--------------------

```
btnStart.setOnClickListener(v -> {
    String input = etTime.getText().toString();
    if (input.isEmpty()) {
        etTime.setError("Please enter a valid number");
        return;
    }
    int setTime = Integer.parseInt(input);
    if (!isRunning) {
        if (timeLeftInMillis == 0) {
            timeLeftInMillis = setTime * 1000;
        }
        startTimer(timeLeftInMillis);
        isRunning = true;
    }
});
btnPause.setOnClickListener(v -> {
    if (isRunning) {
        countDownTimer.cancel();
        isRunning = false;
    }
});
btnReset.setOnClickListener(v -> {
    if (isRunning) {
        countDownTimer.cancel();
        isRunning = false;
    }
    timeLeftInMillis = 0;
    tvTimer.setText("0");
    etTime.setText("");
});
private void startTimer(long millisInFuture) {
    countDownTimer = new CountDownTimer(millisInFuture, 1000) {
        @Override
        public void onTick(long millisUntilFinished) {
            timeLeftInMillis = millisUntilFinished;
            int secondsLeft = (int) (millisUntilFinished / 1000);
            tvTimer.setText(String.format("%02d", secondsLeft));
        }
        @Override
        public void onFinish() {
            tvTimer.setText("0");
            isRunning = false;
            timeLeftInMillis = 0;
        }
    }.start();
}
```

Color Picker
============

![captionless image](https://miro.medium.com/v2/resize:fit:632/format:webp/1*dnslPTQ17XYAGcY9mVNOww.png)

**Button Logic:**

Each button (e.g., `btnRed`, `btnGreen`, `btnBlue`, etc.) calls the `setColor()` method with a specific color name and its associated color code when clicked.

**setColor() Logic:**

The `setColor()` method updates a TextView (`tvSelectedColor`) to display the selected color's name. It also changes the background color of another view (`tvSample`) to reflect the chosen color code.

Code Implementation:
--------------------

```
btnRed.setOnClickListener(v -> {
    setColor("Red", Color.RED);
});
btnGreen.setOnClickListener(v -> {
    setColor("Green", Color.GREEN);
});
btnBlue.setOnClickListener(v -> {
    setColor("Blue", Color.BLUE);
});
btnYellow.setOnClickListener(v -> {
    setColor("Yellow", Color.YELLOW);
});
btnOrange.setOnClickListener(v -> {
    setColor("Orange", Color.parseColor("#FFA500"));
});
btnPurple.setOnClickListener(v -> {
    setColor("Purple", Color.parseColor("#800080"));
});
btnPink.setOnClickListener(v -> {
    setColor("Pink", Color.parseColor("#FFC0CB"));
});
private void setColor(String colorName, int colorCode) {
    tvSelectedColor.setText("Selected Color: " + colorName);
    tvSample.setBackgroundColor(colorCode);
}
```

Weather Widget
==============

![captionless image](https://miro.medium.com/v2/resize:fit:632/format:webp/1*DmN0xYec0j5pcHexC_S39Q.png)

**Button Logic:**

When the user clicks the “Get Weather” button, the app fetches the weather data for the entered city from the OpenWeatherMap API and displays the temperature and weather conditions. If the city name is empty, it prompts the user to enter a valid city.

Code Implementation:
--------------------

```
btnGetWeather.setOnClickListener(v -> {
    String city = etCity.getText().toString().trim();
    if (!city.isEmpty()) {
        fetchWeatherData(city);
    } else {
        Toast.makeText(WeatherWidget.this, "Please enter a city name", Toast.LENGTH_SHORT).show();
    }
});
```

**API Fetching Logic:**

The app uses `ExecutorService` to fetch data from the OpenWeatherMap API in the background and updates the UI on the main thread using a `Handler`.

Code Implementation:
--------------------

```
private void fetchWeatherData(String cityName) {
    executorService.execute(() -> {
        String result = "";
        String urlString = "http://api.openweathermap.org/data/2.5/weather?q=" + cityName + "&appid=" + apiKey + "&units=metric";
        try {
            URL url = new URL(urlString);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");
            BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            StringBuilder sb = new StringBuilder();
            String line;
            while ((line = reader.readLine()) != null) {
                sb.append(line);
            }
            result = sb.toString();
        } catch (Exception e) {
            Log.e("WeatherWidget", "Error fetching weather data", e);
            result = null;
        }
        String finalResult = result;
        handler.post(() -> displayWeatherData(finalResult));
    });
}
```

**Displaying Data Logic:**

The app parses the fetched JSON data to display the temperature and weather conditions. If an error occurs or the city is not found, it shows an error message.

Code Implementation:
--------------------

```
private void displayWeatherData(String result) {
    if (result == null) {
        Toast.makeText(WeatherWidget.this, "City not found", Toast.LENGTH_SHORT).show();
        return;
    }
    try {
        JSONObject jsonObject = new JSONObject(result);
        JSONObject main = jsonObject.getJSONObject("main");
        double temp = main.getDouble("temp");
        String condition = jsonObject.getJSONArray("weather").getJSONObject(0).getString("description");
        tvWeatherInfo.setText(String.format("Weather in %s", jsonObject.getString("name")));
        tvTemperature.setText(String.format("Temperature: %.2f °C", temp));
        tvCondition.setText(String.format("Condition: %s", condition));
    } catch (Exception e) {
        Toast.makeText(WeatherWidget.this, "City not found", Toast.LENGTH_SHORT).show();
        Log.e("WeatherWidget", "Error parsing weather data", e);
    }
}
```

Mood Tracker
============

![captionless image](https://miro.medium.com/v2/resize:fit:616/format:webp/1*nojjBLXiZpYErPBdcMoo7A.png)

**Spinner Setup Logic:**

The mood spinner allows the user to select a mood from a list. The first item, “Select your mood,” is disabled to force the user to choose a valid mood. The spinner’s appearance is adjusted to gray out the first item.

Code Implementation:
--------------------

```
ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, 
        android.R.layout.simple_spinner_item, mood) {
    @Override
    public boolean isEnabled(int position) {
        return position != 0;  // Disable first item
    }
    @Override
    public View getDropDownView(int position, View convertView, ViewGroup parent) {
        View view = super.getDropDownView(position, convertView, parent);
        if (position == 0) {
            view.setEnabled(false);  // Gray out first item
            view.setAlpha(0.5f);
        }
        return view;
    }
};
adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
spinnerMood.setAdapter(adapter);
```

**Submit Button Logic:**

When the user clicks the submit button, the app checks if a valid mood is selected. If not, it displays an error message. If valid, it records the current mood along with the date and time, displaying it in a new `TextView`.

Code Implementation:
--------------------

```
btnSubmit.setOnClickListener(v -> {
    String getMood = spinnerMood.getSelectedItem().toString();
    if (getMood.equals("Select your mood")) {
        Toast.makeText(MoodTracker.this, "Please select a valid mood", Toast.LENGTH_SHORT).show();
        return;  
    }
    addMood(getMood);
});
```

**Add Mood Logic:**

This method creates a horizontal layout with the selected mood and current date/time. It adds a `TextView` to display the data and appends it to the parent container.

Code Implementation:
--------------------

```
private void addMood(String moodName) {
    LinearLayout moodLayout = new LinearLayout(this);
    moodLayout.setOrientation(LinearLayout.HORIZONTAL);
    LocalDate localDate = LocalDate.now();
    LocalTime localTime = LocalTime.now();
    TextView taskText = new TextView(this);
    taskText.setText(moodName + " - " + localDate + ", " + localTime);
    taskText.setTextSize(18);
    moodLayout.addView(taskText);
    moodContainer.addView(moodLayout);
}
```
