---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T20:16:38Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/routing/GetRoutees.html
title: GetRoutees
---

# GetRoutees

## Content

Package [akka.routing](package-summary.html)
## Class GetRoutees

- java.lang.Object
- - akka.routing.GetRoutees

- All Implemented Interfaces:
`[RouterManagementMesssage](RouterManagementMesssage.html "interface in akka.routing")`

Direct Known Subclasses:
`[GetRoutees$](GetRoutees$.html "class in akka.routing")`

---

```
public abstract class GetRoutees
extends java.lang.Object
implements [RouterManagementMesssage](RouterManagementMesssage.html "interface in akka.routing")
```

Sending this message to a router will make it send back its currently used routees.
 A [`Routees`](Routees.html "class in akka.routing") message is sent asynchronously to the "requester" containing information
 about what routees the router is routing over.

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[GetRoutees](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Abstract Methods](javascript:show(4);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `static boolean` | `[canEqual](#canEqual(java.lang.Object))​(java.lang.Object x$1)` |  |
	| `abstract static boolean` | `[equals](#equals(java.lang.Object))​(java.lang.Object that)` |  |
	| `static [GetRoutees$](GetRoutees$.html "class in akka.routing")` | `[getInstance](#getInstance())()` | Java API: get the singleton instance |
	| `static int` | `[hashCode](#hashCode())()` |  |
	| `static int` | `[productArity](#productArity())()` |  |
	| `static java.lang.Object` | `[productElement](#productElement(int))​(int x$1)` |  |
	| `static java.lang.String` | `[productElementName](#productElementName(int))​(int n)` |  |
	| `static scala.collection.Iterator<java.lang.String>` | `[productElementNames](#productElementNames())()` |  |
	| `static scala.collection.Iterator<java.lang.Object>` | `[productIterator](#productIterator())()` |  |
	| `static java.lang.String` | `[productPrefix](#productPrefix())()` |  |
	| `static java.lang.String` | `[toString](#toString())()` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### GetRoutees
		
		
		
		```
		public GetRoutees()
		```

	- ### Method Detail
	
	
	
		- #### getInstance
		
		
		
		```
		public static [GetRoutees$](GetRoutees$.html "class in akka.routing") getInstance()
		```
		
		Java API: get the singleton instance
		- #### productPrefix
		
		
		
		```
		public static java.lang.String productPrefix()
		```
		- #### productArity
		
		
		
		```
		public static int productArity()
		```
		- #### productElement
		
		
		
		```
		public static java.lang.Object productElement​(int x$1)
		```
		- #### productIterator
		
		
		
		```
		public static scala.collection.Iterator<java.lang.Object> productIterator()
		```
		- #### canEqual
		
		
		
		```
		public static boolean canEqual​(java.lang.Object x$1)
		```
		- #### hashCode
		
		
		
		```
		public static int hashCode()
		```
		- #### toString
		
		
		
		```
		public static java.lang.String toString()
		```
		- #### equals
		
		
		
		```
		public abstract static boolean equals​(java.lang.Object that)
		```
		- #### productElementName
		
		
		
		```
		public static java.lang.String productElementName​(int n)
		```
		- #### productElementNames
		
		
		
		```
		public static scala.collection.Iterator<java.lang.String> productElementNames()
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/routing/GetRoutees$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/routing/Routees.html
- https://doc.akka.io/japi/akka-core/2.10/akka/routing/RouterManagementMesssage.html
- https://doc.akka.io/japi/akka-core/2.10/akka/routing/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/routing/GetRoutees.html](https://doc.akka.io/japi/akka-core/2.10/akka/routing/GetRoutees.html)*