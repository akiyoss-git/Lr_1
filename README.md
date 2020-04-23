# laboratory work N1

### Authors: Kramnik Ilya (f0rs4ken), Burmistrov Alexey (foxlf), Kuptsov Andrey (Reowlin), Serebryanskiy Alexander (akiyoss)

This program works like a parser of .txt files with a specific type of content

Example: 

> type: tank name: Pudge

> type: melee name: BountyHunter

> type: range name: Techies

> type: hit name: Sven

> type: tank name: Misha

This list can be very long

We divided the program into parts: Class descriptions, Parser, Counter
Main class App.java contains necessary minimum of code. It reads filename of file that we need to parse and starts up modules like parser and counter

Class Parser - parses .txt file and creating array of objects
Class Counter - counts how many objects of any type exists
