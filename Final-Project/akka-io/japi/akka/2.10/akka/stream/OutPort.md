---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T17:03:13Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/2.10/akka/stream/OutPort.html
title: OutPort
---

# OutPort

## Content

Package [akka.stream](package-summary.html)
## Class OutPort

- java.lang.Object
- - akka.stream.OutPort

- Direct Known Subclasses:
`[Outlet](Outlet.html "class in akka.stream")`

---

```
public abstract class OutPort
extends java.lang.Object
```

An output port of a StreamLayout.Module. This type logically belongs
 into the impl package but must live here due to how `sealed` works.
 It is also used in the Java DSL for \&ldquo;classic Outlets\&rdquo; as a work\-around
 for otherwise unreasonable existential types.

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[OutPort](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `boolean` | `[equals](#equals(java.lang.Object))​(java.lang.Object that)` |  |
	| `int` | `[hashCode](#hashCode())()` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, finalize, getClass, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### OutPort
		
		
		
		```
		public OutPort()
		```

	- ### Method Detail
	
	
	
		- #### equals
		
		
		
		```
		public final boolean equals​(java.lang.Object that)
		```
		
		
		Overrides:
		`equals` in class `java.lang.Object`
		- #### hashCode
		
		
		
		```
		public final int hashCode()
		```
		
		
		Overrides:
		`hashCode` in class `java.lang.Object`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/2.10/akka/stream/Outlet.html
- https://doc.akka.io/japi/akka/2.10/akka/stream/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/2.10/akka/stream/OutPort.html](https://doc.akka.io/japi/akka/2.10/akka/stream/OutPort.html)*