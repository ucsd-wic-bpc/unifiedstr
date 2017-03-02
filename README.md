unifiedstr
==========
A library for several languages which converts various types into strings using
their Python string representation.

This library was initially developed for 
[jsonstubber](https://github.com/ucsd-wic-bpc/jsonstubber) to use in generating
stubcode that prints the same style output for different languages.

For instance, Java prints booleans as "true" and "false". `unifiedstr` changes
this. 
```java
bool a = true;
System.out.println(a); // => "true"
System.out.println(Unifiedstr.ToString(a)); // => "True"
```
