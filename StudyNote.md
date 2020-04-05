# Java Study Note
Some assumption from leaning Java :)

## IntilliJ Code Tips

IntilliJ code tips for window system.

### Code Snippet

* Alt + Insert: Generate function(including Constructure, getter and setter, toSting, equals, etc).
* F2, then Alt + Enter: Press F2 to specify the error, the press Alt + Enter for potential fix.
* .var: instanlize a parameter(e.g. new People().var => People people = new People()).
* Ctrl + Shift + Up or Down: Move code up or down.
* Ctrl + K: Commit changes window.
* Ctrl + Shift + N: navigation.
* Ctrl + Shift + Backspace: pervious step.
* Ctrl + F12: view file structre.
* iter: Iterate the the object.
* [More additional info](http://allaboutscala.com/tutorials/chapter-1-getting-familiar-intellij-ide/intellij-keyboard-shortcuts-navigation/)

### Build Object Class Quickly

1. Define the private variable.
2. Alt + Insert => Constructure.
3. Alt + Insert => getter and setter.
4. etc..

## Java Note

General Java note while learning and doing.

### Interface

* If the there is the same name of method/filed, it will take the first one from impletmeted interface.

### Inheritance

* If child instance cast as parent class and using the override method, java smart enough to use method from child class.
* If child instance cast as parent class and using the method only in child class, java cannot recongnize and indicate error.


### Exception Type

* ArithmeticException: e.g. divided by 0.
* ClassNotFoundException
* IllegalArgumentException
* IndexOutOfBoundsException
* IOException