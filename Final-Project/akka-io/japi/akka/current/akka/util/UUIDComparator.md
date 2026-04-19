---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:50:30Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/util/UUIDComparator.html
title: UUIDComparator
---

# UUIDComparator

## Content

Package [akka.util](package-summary.html)
## Class UUIDComparator

- java.lang.Object
- - akka.util.UUIDComparator

- All Implemented Interfaces:
`java.util.Comparator<java.util.UUID>`

---

```
public class UUIDComparator
extends java.lang.Object
implements java.util.Comparator<java.util.UUID>
```

Scala implementation of UUIDComparator in
 https://github.com/cowtowncoder/java\-uuid\-generator
 Apache License 2\.0\.

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[UUIDComparator](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `static [UUIDComparator](UUIDComparator.html "class in akka.util")` | `[comparator](#comparator())()` |  |
	| `int` | `[compare](#compare(java.util.UUID,java.util.UUID))​(java.util.UUID u1,  java.util.UUID u2)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`
		- ### Methods inherited from interface java.util.Comparator
		
		
		`equals, reversed, thenComparing, thenComparing, thenComparing, thenComparingDouble, thenComparingInt, thenComparingLong`

- - ### Constructor Detail
	
	
	
		- #### UUIDComparator
		
		
		
		```
		public UUIDComparator()
		```

	- ### Method Detail
	
	
	
		- #### comparator
		
		
		
		```
		public static [UUIDComparator](UUIDComparator.html "class in akka.util") comparator()
		```
		- #### compare
		
		
		
		```
		public int compare​(java.util.UUID u1,
		                   java.util.UUID u2)
		```
		
		
		Specified by:
		`compare` in interface `java.util.Comparator<java.util.UUID>`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/util/UUIDComparator.html
- https://doc.akka.io/japi/akka/current/akka/util/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/util/UUIDComparator.html](https://doc.akka.io/japi/akka/current/akka/util/UUIDComparator.html)*