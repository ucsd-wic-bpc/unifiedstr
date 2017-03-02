unifiedstr
==========
A library for several languages which converts various types into strings using
their Python string representation.

For instance, Java prints booleans as "true" and "false". `unifiedstr` changes
this. 
```java
bool a = true;
System.out.println(a); // => "true"
System.out.println(Unifiedstr.ToString(a)); // => "True"
```
