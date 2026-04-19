---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:38:25Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/routing/AddRoutee.html
title: AddRoutee
---

# AddRoutee

## Content

Package [akka.routing](package-summary.html)
## Class AddRoutee

- java.lang.Object
- - akka.routing.AddRoutee

- All Implemented Interfaces:
`[RouterManagementMesssage](RouterManagementMesssage.html "interface in akka.routing")`, `java.io.Serializable`, `scala.Equals`, `scala.Product`

---

```
public final class AddRoutee
extends java.lang.Object
implements [RouterManagementMesssage](RouterManagementMesssage.html "interface in akka.routing"), scala.Product, java.io.Serializable
```

Add a routee by sending this message to the router.
 It may be handled after other messages.

See Also:
[Serialized Form](../../serialized-form.html#akka.routing.AddRoutee)

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[AddRoutee](#%3Cinit%3E(akka.routing.Routee))​([Routee](Routee.html "interface in akka.routing") routee)` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `static [AddRoutee](AddRoutee.html "class in akka.routing")` | `[apply](#apply(akka.routing.Routee))​([Routee](Routee.html "interface in akka.routing") routee)` |  |
	| `boolean` | `[canEqual](#canEqual(java.lang.Object))​(java.lang.Object x$1)` |  |
	| `[AddRoutee](AddRoutee.html "class in akka.routing")` | `[copy](#copy(akka.routing.Routee))​([Routee](Routee.html "interface in akka.routing") routee)` |  |
	| `[Routee](Routee.html "interface in akka.routing")` | `[copy$default$1](#copy$default$1())()` |  |
	| `boolean` | `[equals](#equals(java.lang.Object))​(java.lang.Object x$1)` |  |
	| `int` | `[hashCode](#hashCode())()` |  |
	| `int` | `[productArity](#productArity())()` |  |
	| `java.lang.Object` | `[productElement](#productElement(int))​(int x$1)` |  |
	| `java.lang.String` | `[productElementName](#productElementName(int))​(int x$1)` |  |
	| `scala.collection.Iterator<java.lang.Object>` | `[productIterator](#productIterator())()` |  |
	| `java.lang.String` | `[productPrefix](#productPrefix())()` |  |
	| `[Routee](Routee.html "interface in akka.routing")` | `[routee](#routee())()` |  |
	| `java.lang.String` | `[toString](#toString())()` |  |
	| `static scala.Option<[Routee](Routee.html "interface in akka.routing")>` | `[unapply](#unapply(akka.routing.AddRoutee))​([AddRoutee](AddRoutee.html "class in akka.routing") x$0)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, finalize, getClass, notify, notifyAll, wait, wait, wait`
		- ### Methods inherited from interface scala.Product
		
		
		`productElementNames`

- - ### Constructor Detail
	
	
	
		- #### AddRoutee
		
		
		
		```
		public AddRoutee​([Routee](Routee.html "interface in akka.routing") routee)
		```

	- ### Method Detail
	
	
	
		- #### apply
		
		
		
		```
		public static [AddRoutee](AddRoutee.html "class in akka.routing") apply​([Routee](Routee.html "interface in akka.routing") routee)
		```
		- #### unapply
		
		
		
		```
		public static scala.Option<[Routee](Routee.html "interface in akka.routing")> unapply​([AddRoutee](AddRoutee.html "class in akka.routing") x$0)
		```
		- #### routee
		
		
		
		```
		public [Routee](Routee.html "interface in akka.routing") routee()
		```
		- #### copy
		
		
		
		```
		public [AddRoutee](AddRoutee.html "class in akka.routing") copy​([Routee](Routee.html "interface in akka.routing") routee)
		```
		- #### copy$default$1
		
		
		
		```
		public [Routee](Routee.html "interface in akka.routing") copy$default$1()
		```
		- #### productPrefix
		
		
		
		```
		public java.lang.String productPrefix()
		```
		
		
		Specified by:
		`productPrefix` in interface `scala.Product`
		- #### productArity
		
		
		
		```
		public int productArity()
		```
		
		
		Specified by:
		`productArity` in interface `scala.Product`
		- #### productElement
		
		
		
		```
		public java.lang.Object productElement​(int x$1)
		```
		
		
		Specified by:
		`productElement` in interface `scala.Product`
		- #### productIterator
		
		
		
		```
		public scala.collection.Iterator<java.lang.Object> productIterator()
		```
		
		
		Specified by:
		`productIterator` in interface `scala.Product`
		- #### canEqual
		
		
		
		```
		public boolean canEqual​(java.lang.Object x$1)
		```
		
		
		Specified by:
		`canEqual` in interface `scala.Equals`
		- #### productElementName
		
		
		
		```
		public java.lang.String productElementName​(int x$1)
		```
		
		
		Specified by:
		`productElementName` in interface `scala.Product`
		- #### hashCode
		
		
		
		```
		public int hashCode()
		```
		
		
		Overrides:
		`hashCode` in class `java.lang.Object`
		- #### toString
		
		
		
		```
		public java.lang.String toString()
		```
		
		
		Overrides:
		`toString` in class `java.lang.Object`
		- #### equals
		
		
		
		```
		public boolean equals​(java.lang.Object x$1)
		```
		
		
		Specified by:
		`equals` in interface `scala.Equals`
		Overrides:
		`equals` in class `java.lang.Object`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/routing/AddRoutee.html
- https://doc.akka.io/japi/akka/current/akka/routing/Routee.html
- https://doc.akka.io/japi/akka/current/akka/routing/RouterManagementMesssage.html
- https://doc.akka.io/japi/akka/current/akka/routing/package-summary.html
- https://doc.akka.io/japi/akka/current/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/routing/AddRoutee.html](https://doc.akka.io/japi/akka/current/akka/routing/AddRoutee.html)*