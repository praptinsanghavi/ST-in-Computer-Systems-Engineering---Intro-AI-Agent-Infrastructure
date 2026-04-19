---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T03:02:41Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/2.10/akka/stream/javadsl/FramingTruncation.html
title: FramingTruncation
---

# FramingTruncation

## Content

Package [akka.stream.javadsl](package-summary.html)
## Enum FramingTruncation

- java.lang.Object
- - java.lang.Enum\<[FramingTruncation](FramingTruncation.html "enum in akka.stream.javadsl")\>
	- - akka.stream.javadsl.FramingTruncation

- All Implemented Interfaces:
`java.io.Serializable`, `java.lang.Comparable<[FramingTruncation](FramingTruncation.html "enum in akka.stream.javadsl")>`

---

```
public enum FramingTruncation
extends java.lang.Enum<[FramingTruncation](FramingTruncation.html "enum in akka.stream.javadsl")>
```

Determines mode in which \[\[Framing]] operates.

- - ### Enum Constant Summary
	
	
	
	Enum Constants 
	| Enum Constant | Description |
	| `[ALLOW](#ALLOW)` |  |
	| `[DISALLOW](#DISALLOW)` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `static [FramingTruncation](FramingTruncation.html "enum in akka.stream.javadsl")` | `[valueOf](#valueOf(java.lang.String))​(java.lang.String name)` | Returns the enum constant of this type with the specified name. |
	| `static [FramingTruncation](FramingTruncation.html "enum in akka.stream.javadsl")[]` | `[values](#values())()` | Returns an array containing the constants of this enum type, in the order they are declared. |
	
	
		- ### Methods inherited from class java.lang.Enum
		
		
		`clone, compareTo, equals, finalize, getDeclaringClass, hashCode, name, ordinal, toString, valueOf`
		- ### Methods inherited from class java.lang.Object
		
		
		`getClass, notify, notifyAll, wait, wait, wait`

- - ### Enum Constant Detail
	
	
	
		- #### ALLOW
		
		
		
		```
		public static final [FramingTruncation](FramingTruncation.html "enum in akka.stream.javadsl") ALLOW
		```
		- #### DISALLOW
		
		
		
		```
		public static final [FramingTruncation](FramingTruncation.html "enum in akka.stream.javadsl") DISALLOW
		```

	- ### Method Detail
	
	
	
		- #### values
		
		
		
		```
		public static [FramingTruncation](FramingTruncation.html "enum in akka.stream.javadsl")[] values()
		```
		
		Returns an array containing the constants of this enum type, in
		the order they are declared. This method may be used to iterate
		over the constants as follows:
		
		```
		
		for (FramingTruncation c : FramingTruncation.values())
		    System.out.println(c);
		
		```
		
		
		Returns:
		an array containing the constants of this enum type, in the order they are declared
		- #### valueOf
		
		
		
		```
		public static [FramingTruncation](FramingTruncation.html "enum in akka.stream.javadsl") valueOf​(java.lang.String name)
		```
		
		Returns the enum constant of this type with the specified name.
		The string must match *exactly* an identifier used to declare an
		enum constant in this type. (Extraneous whitespace characters are 
		not permitted.)
		
		Parameters:
		`name` \- the name of the enum constant to be returned.
		Returns:
		the enum constant with the specified name
		Throws:
		`java.lang.IllegalArgumentException` \- if this enum type has no constant with the specified name
		`java.lang.NullPointerException` \- if the argument is null

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/2.10/akka/stream/javadsl/FramingTruncation.html
- https://doc.akka.io/japi/akka/2.10/akka/stream/javadsl/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/2.10/akka/stream/javadsl/FramingTruncation.html](https://doc.akka.io/japi/akka/2.10/akka/stream/javadsl/FramingTruncation.html)*