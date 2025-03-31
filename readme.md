# Coins Project Sprint 2 (Using Sprint 1 as a base)
## Version 0.1
* Created Classes for concrete implementations of abstract Coin class.
## Version 0.2
* Seperated all classes into their own .java files.
* Added toString() method to Coin abstract class.
## Version 0.3
* Added package declarations to each coin class so vscode can implement tests easier.
* Created CoinTest file.
* Made Coin abstract class public.
## Version 0.4
* Added to CoinTest
* Created test files for each concrete implementation of Coin abstract class.
* Fixed errors found in concrete implementations using the tests.
## Version 0.5
* removed some unused imports.

# Overview of Coins Project

We are an independent contractor for the U.S. Treasury Department. We have been tasked with implementing a Coin class in order to "test drive" new aspects of their coinage process. Sprint 1 started with us laying the ground work by implementing a Coin class that can create each different coin itself. Now, in sprint 2, we are seperating each individual coin from the Coin class and making them concrete implementations of the abstract Coin class, with new test files to go with each new class.

# Installation and Setup Guide

* First download the repository and if it is compressed extract the files into a folder.
* Make sure your terminal is within the repository but outside of the client, src, and tests folders. 
* Now we need to compile. In order to compile the .java files you must be have java installed on your computer. You can run this command to compile everything: javac src/main/Coin.java src/main/Penny.java src/main/Nickel.java src/main/Dime.java src/main/Quarter.java src/main/HalfDollar.java src/main/Dollar.java src/client/Demo.java

# Usage Instructions

* In order to run the Demo file uing the terminal, you must already have the terminal's path be the repository file. fter this you can run the command: java -cp src client.Demo

# Contribution Guidelines 
Maxwell Brown - Started conversion of Coin class. Created Dime, Dollar, HalfDollar, Nickel, Penny, and Quarter classes.