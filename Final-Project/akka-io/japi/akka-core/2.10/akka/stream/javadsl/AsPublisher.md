---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:35:39Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/AsPublisher.html
title: AsPublisher
---

# AsPublisher

## Content

Package [akka.stream.javadsl](package-summary.html)
## Enum AsPublisher

- java.lang.Object
- - java.lang.Enum\<[AsPublisher](AsPublisher.html "enum in akka.stream.javadsl")\>
	- - akka.stream.javadsl.AsPublisher

- All Implemented Interfaces:
`java.io.Serializable`, `java.lang.Comparable<[AsPublisher](AsPublisher.html "enum in akka.stream.javadsl")>`

---

```
public enum AsPublisher
extends java.lang.Enum<[AsPublisher](AsPublisher.html "enum in akka.stream.javadsl")>
```

- - ### Enum Constant Summary
	
	
	
	Enum Constants 
	| Enum Constant | Description |
	| `[WITH_FANOUT](#WITH_FANOUT)` |  |
	| `[WITHOUT_FANOUT](#WITHOUT_FANOUT)` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `static [AsPublisher](AsPublisher.html "enum in akka.stream.javadsl")` | `[valueOf](#valueOf(java.lang.String))​(java.lang.String name)` | Returns the enum constant of this type with the specified name. |
	| `static [AsPublisher](AsPublisher.html "enum in akka.stream.javadsl")[]` | `[values](#values())()` | Returns an array containing the constants of this enum type, in the order they are declared. |
	
	
		- ### Methods inherited from class java.lang.Enum
		
		
		`clone, compareTo, equals, finalize, getDeclaringClass, hashCode, name, ordinal, toString, valueOf`
		- ### Methods inherited from class java.lang.Object
		
		
		`getClass, notify, notifyAll, wait, wait, wait`

- - ### Enum Constant Detail
	
	
	
		- #### WITH\_FANOUT
		
		
		
		```
		public static final [AsPublisher](AsPublisher.html "enum in akka.stream.javadsl") WITH_FANOUT
		```
		- #### WITHOUT\_FANOUT
		
		
		
		```
		public static final [AsPublisher](AsPublisher.html "enum in akka.stream.javadsl") WITHOUT_FANOUT
		```

	- ### Method Detail
	
	
	
		- #### values
		
		
		
		```
		public static [AsPublisher](AsPublisher.html "enum in akka.stream.javadsl")[] values()
		```
		
		Returns an array containing the constants of this enum type, in
		the order they are declared. This method may be used to iterate
		over the constants as follows:
		
		```
		
		for (AsPublisher c : AsPublisher.values())
		    System.out.println(c);
		
		```
		
		
		Returns:
		an array containing the constants of this enum type, in the order they are declared
		- #### valueOf
		
		
		
		```
		public static [AsPublisher](AsPublisher.html "enum in akka.stream.javadsl") valueOf​(java.lang.String name)
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

- https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/AsPublisher.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/AsPublisher.html](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/AsPublisher.html)*