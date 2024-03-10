# Session 2

## Data types and control flow

### Primitive types (data types)

| Type    | Description | Values examples | Default value |
|---------|:-----------:|----------------:|:--------------|
| int     |   4 bytes   |             127 | 0             |
| float   |   4 bytes   |           127.5 | 0f            |
| boolean |    1 bit    |   true or false | false         |
| double  |   8 bytes   |       127.00001 | 0d            |
| long    |   8 bytes   |   9999999999999 | 0L            |
| short   |   2 bytes   |             127 | 0             |
| char    |   2 bytes   |               a | \u0000        |
| byte    |   1 byte    |             127 | 0             |

Primitive types are not objects, they do not start by a capital, they are not created with new, and they don't have any
methods to call

To change the value of a primitive type juste use =

```java
int value1 = 1;
value1 =2;
```

To check equality use == it returns a boolean

```java
int value1 = 1;

boolean isZero = (value1 == 0); // false
boolean isOne = (value1 == 1);  // true

// Paranthesis are not mandatory but just here for readability
```

> **Note**
> Primitive types in Java have their corresponding object representation but it's more for advanced usages. For ex.
> Integer, Double, Long etc.

### String

String is a Java object but that can be initialized like a data type with = and concatenate with +

```java
String value1String = "Hello";
String value2String = new String("World"); // Never used expression, it's better to use = "World"

String value3String = "Hello" + " world!"; // Concatanation with +
```

The default value of String, like other objets is null
Because it's an object String has methods on it:

```java
String value = "Hello";

int length = value.length(); // Number of chars in the string here: 5

value.

toUpperCase(); // HELLO
value.

isEmpty(); // false

value.

contains("el"); // true
value.

replace("H",""); // ello, empty String car be written ""
```

### Arrays

Arrays can be defined with primitive types or objects. The size of an array can't be changed and must be explicited at
creation

```java
String[] arrayOfString = new String[10]; // Array of String of size 10
int[] arrayOfInt = new int[5]; // Array of String of size 5

String[] anotherStringArray = {"value1", "value2"}; // Array of size 2
int[] anotherIntArray = {10, 11}; // Array of size 2

System.out.

println(anotherStringArray[0]); // Access a value (index start at 0)

anotherStringArray[1]="value3"; //  Change a value (last index is length - 1)
```

### Operators

| Operator |               Description               |
|:---------|:---------------------------------------:|
| +        |        Adds together two values         |
| -        |    Subtracts one value from another     |
| *        |          Multiplies two values          |
| /        |      Divides one value by another       |
| %        |     Returns the division remainder      |
| ++       | Increases the value of a variable by 1	 |
| --       | Decreases the value of a variable by 1	 |
| =        |              Assign value	              |
| +=       |      Equivalent to x = x + value	      |
| -=       |      Equivalent to x = x - value	      |
| ==       |                Equal to	                |
| !=       |               Not equal	                |
| \>       |              Greater than	              |
| <        |               Less than	                |
| \>=      |        Greater than or equal to	        |
| <=       |         Less than or equal to	          |
| &&       |              Logical and	               |
| \|\|     |               Logical or	               |
| !        |              Logical not	               |

### Control flow
#### if/else/elseif
```java
int value = 0;

if(value ==0){
    // Value is 0, this block of code will be executed
}else if(value ==1){
    // Value is not 0 and is 1, this block of code will be executed
}else{
    // Value is not 0 and not 1, this block of code will be executed
}

```

#### for
```java
int[] values = {1, 2, 3};

for (int value : values) {
    System.out.println(value);
}

// If we need the index
for (int i = 0; i < values.length; i++) {
    System.out.println(values[i]);
}
```

#### while
```java
int i = 0;

while (i <= 5) {
    System.out.println("The current value is at: " + i);
    i++;
}
```

#### switch
```java
int choice = 2
        ;
switch (choice) {
    case 1:
        System.out.println("Bonjour");
        break;
    case 2:
        System.out.println("Hello");
        break;
    default:
        System.out.println("Invalid choice");
        break;
}
```

## Summarize
When learn the data types, the String object, arrays and control flows with for loop, if statement, while and switch.


## Exercises

- Fizz buzz:
Write a program that prints the numbers from 1 to 100. But for multiples of three print “Fizz” instead of the number and for the multiples of five print “Buzz”. For numbers which are multiples of both three and five print “FizzBuzz “.

- Sum of elements:
Write a function that takes an integer as input and return the sum of all the whole numbers from 1 to this input

- Degree to Fahrenheit convertor:
Write a program that ask the user for a value and that convert the value from degree to Fahrenheit.
To read a value from the a user input in the console use Scanner:
```java
Scanner scanner = new Scanner(System.in);
String value = scanner.next(); // Wait for an input that ends with the return key.
String valueDouble = scanner.nextDouble(); // Wait for a double value
```
