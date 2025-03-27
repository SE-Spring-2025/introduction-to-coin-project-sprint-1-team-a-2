# Coins Project
## Version 0.1
* Folder and tool infrastructure.
* Basic Coin class with tests and demo.
## Version 0.2
* Added properties to coin.java.
## Version 0.3
* Created Coin constructor.
## Version 0.4
* Completed Coin constructor.
## Version 0.5
* Completed Second Coin constructor.
## Version 0.6
* Implemented third Coin constructor.
## Version 0.7
* Added Coin value constants and changed Coin constructors to use them.
## Version 0.8
* Added Coin attribute getters and created toString.
## Version 0.9
* Fully implemented toString function.

# Coin Class

### Coin Constructors
* Coin(): set's all String fields to empty Strings, number fields to 0, and boolean values to false.
* Coin(double value): set's all fields to their appropriate value for the specific coin the value matches, with the manufacture year being the current year.
* Coin(double value, int year): same as one-arg constructor, but sets the manufaxcture year of the coin to the year entered in the constructor.
### Coin getters
* getValue(): returns a double containing the value of the Coin object.
* getFamiliarName(): returns a String containing the common name of the Coin object.
* getFrontMotto(): returns a String containing the front motto of the Coin object.
* getYear(): returns an integer containing the manufacture year of the Coin object.
* getFrontImage(): returns a String describing the front image of the Coin object.
* getBackImage(): returns a String describing the back image of the Coin object.
* getBackMotto(): returns a String containing the back motto of the Coin object.
* getFrontLabel(): returns a String containing the front label of the Coin object.
* getBackLabel(): returns a String containing the back label of the Coin object.
* getValueDescription(): returns a String containing the value description of the Coin object.
* getRidgedEdge(): returns a boolean that is true when there are ridged edges on the Coin object.
* getMetallurgy: returns a String containing the metal composition of the Coin object.
### Other methods
* toString(): returns a String listing all the attributes of the Coin object
