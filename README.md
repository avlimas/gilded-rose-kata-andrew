# Gilded-rose-kata-andrew

This kata was originally created by [emilybache](https://github.com/emilybache/GildedRose-Refactoring-Kata).
Please look into ["Gilded Rose Requirements"](https://github.com/emilybache/GildedRose-Refactoring-Kata/tree/master/GildedRoseRequirements.txt) for explanation about what is the purpose of this application.

## How to use this Kata

To use this kata, please [clone or download the git repository](git@github.com:avlimas/gilded-rose-kata-andrew.git) to your computer.

Go to the folder and run gradle command to compile the application:
``` 
cd path/to/your/gilded-rose-kata-andrew-folder
gradlew clean build
``` 

After you have finished compiling the application, go to the following path and run the application using java -jar with the following parameter ('-days').
``` 
cd path/to/your/gilded-rose-kata-andrew-folder/build/libs
java -jar gilded-rose-kata-0.0.1-SNAPSHOT.jar -days=3
```

### Variables supported by this application
- **days** - Set how many days that you want to simulate in the application