---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T15:56:31Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10.17/akka/util/ByteString.ByteStrings$.html
title: ByteString.ByteStrings$
---

# ByteString.ByteStrings$

## Content

Package [akka.util](package-summary.html)
## Class ByteString.ByteStrings$

- java.lang.Object
- - akka.util.ByteString.ByteStrings$

- All Implemented Interfaces:
`[ByteString.Companion](ByteString.Companion.html "interface in akka.util")`, `java.io.Serializable`

Enclosing class:
[ByteString](ByteString.html "class in akka.util")

---

```
public static class ByteString.ByteStrings$
extends java.lang.Object
implements [ByteString.Companion](ByteString.Companion.html "interface in akka.util"), java.io.Serializable
```

See Also:
[Serialized Form](../../serialized-form.html#akka.util.ByteString.ByteStrings$)

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [ByteString.ByteStrings$](ByteString.ByteStrings$.html "class in akka.util")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[ByteStrings$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[ByteString](ByteString.html "class in akka.util")` | `[apply](#apply(akka.util.ByteString.ByteString1,akka.util.ByteString.ByteString1))​([ByteString.ByteString1](ByteString.ByteString1.html "class in akka.util") b1,  [ByteString.ByteString1](ByteString.ByteString1.html "class in akka.util") b2)` |  |
	| `[ByteString](ByteString.html "class in akka.util")` | `[apply](#apply(akka.util.ByteString.ByteString1,akka.util.ByteString.ByteStrings))​([ByteString.ByteString1](ByteString.ByteString1.html "class in akka.util") b,  [ByteString.ByteStrings](ByteString.ByteStrings.html "class in akka.util") bs)` |  |
	| `[ByteString](ByteString.html "class in akka.util")` | `[apply](#apply(akka.util.ByteString.ByteStrings,akka.util.ByteString.ByteString1))​([ByteString.ByteStrings](ByteString.ByteStrings.html "class in akka.util") bs,  [ByteString.ByteString1](ByteString.ByteString1.html "class in akka.util") b)` |  |
	| `[ByteString](ByteString.html "class in akka.util")` | `[apply](#apply(akka.util.ByteString.ByteStrings,akka.util.ByteString.ByteStrings))​([ByteString.ByteStrings](ByteString.ByteStrings.html "class in akka.util") bs1,  [ByteString.ByteStrings](ByteString.ByteStrings.html "class in akka.util") bs2)` |  |
	| `[ByteString](ByteString.html "class in akka.util")` | `[apply](#apply(scala.collection.immutable.Vector))​(scala.collection.immutable.Vector<[ByteString.ByteString1](ByteString.ByteString1.html "class in akka.util")> bytestrings)` |  |
	| `[ByteString](ByteString.html "class in akka.util")` | `[apply](#apply(scala.collection.immutable.Vector,int))​(scala.collection.immutable.Vector<[ByteString.ByteString1](ByteString.ByteString1.html "class in akka.util")> bytestrings,  int length)` |  |
	| `int` | `[compare](#compare(akka.util.ByteString,akka.util.ByteString))​([ByteString](ByteString.html "class in akka.util") b1,  [ByteString](ByteString.html "class in akka.util") b2)` |  |
	| `[ByteString.ByteStrings](ByteString.ByteStrings.html "class in akka.util")` | `[readFromInputStream](#readFromInputStream(java.io.ObjectInputStream))​(java.io.ObjectInputStream is)` |  |
	| `byte` | `[SerializationIdentity](#SerializationIdentity())()` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [ByteString.ByteStrings$](ByteString.ByteStrings$.html "class in akka.util") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### ByteStrings$
		
		
		
		```
		public ByteStrings$()
		```

	- ### Method Detail
	
	
	
		- #### apply
		
		
		
		```
		public [ByteString](ByteString.html "class in akka.util") apply​(scala.collection.immutable.Vector<[ByteString.ByteString1](ByteString.ByteString1.html "class in akka.util")> bytestrings)
		```
		- #### apply
		
		
		
		```
		public [ByteString](ByteString.html "class in akka.util") apply​(scala.collection.immutable.Vector<[ByteString.ByteString1](ByteString.ByteString1.html "class in akka.util")> bytestrings,
		                        int length)
		```
		- #### apply
		
		
		
		```
		public [ByteString](ByteString.html "class in akka.util") apply​([ByteString.ByteString1](ByteString.ByteString1.html "class in akka.util") b1,
		                        [ByteString.ByteString1](ByteString.ByteString1.html "class in akka.util") b2)
		```
		- #### apply
		
		
		
		```
		public [ByteString](ByteString.html "class in akka.util") apply​([ByteString.ByteString1](ByteString.ByteString1.html "class in akka.util") b,
		                        [ByteString.ByteStrings](ByteString.ByteStrings.html "class in akka.util") bs)
		```
		- #### apply
		
		
		
		```
		public [ByteString](ByteString.html "class in akka.util") apply​([ByteString.ByteStrings](ByteString.ByteStrings.html "class in akka.util") bs,
		                        [ByteString.ByteString1](ByteString.ByteString1.html "class in akka.util") b)
		```
		- #### apply
		
		
		
		```
		public [ByteString](ByteString.html "class in akka.util") apply​([ByteString.ByteStrings](ByteString.ByteStrings.html "class in akka.util") bs1,
		                        [ByteString.ByteStrings](ByteString.ByteStrings.html "class in akka.util") bs2)
		```
		- #### compare
		
		
		
		```
		public int compare​([ByteString](ByteString.html "class in akka.util") b1,
		                   [ByteString](ByteString.html "class in akka.util") b2)
		```
		- #### SerializationIdentity
		
		
		
		```
		public byte SerializationIdentity()
		```
		
		
		Specified by:
		`[SerializationIdentity](ByteString.Companion.html#SerializationIdentity())` in interface `[ByteString.Companion](ByteString.Companion.html "interface in akka.util")`
		- #### readFromInputStream
		
		
		
		```
		public [ByteString.ByteStrings](ByteString.ByteStrings.html "class in akka.util") readFromInputStream​(java.io.ObjectInputStream is)
		```
		
		
		Specified by:
		`[readFromInputStream](ByteString.Companion.html#readFromInputStream(java.io.ObjectInputStream))` in interface `[ByteString.Companion](ByteString.Companion.html "interface in akka.util")`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10.17/akka/util/ByteString.ByteString1.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/util/ByteString.ByteStrings$.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/util/ByteString.ByteStrings.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/util/ByteString.Companion.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/util/ByteString.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/util/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10.17/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10.17/akka/util/ByteString.ByteStrings$.html](https://doc.akka.io/japi/akka-core/2.10.17/akka/util/ByteString.ByteStrings$.html)*