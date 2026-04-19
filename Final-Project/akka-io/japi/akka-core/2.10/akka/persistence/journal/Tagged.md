---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:00:03Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/persistence/journal/Tagged.html
title: Tagged
---

# Tagged

## Content

Package [akka.persistence.journal](package-summary.html)
## Class Tagged

- java.lang.Object
- - akka.persistence.journal.Tagged

- All Implemented Interfaces:
`java.io.Serializable`, `scala.Equals`, `scala.Product`

---

```
public class Tagged
extends java.lang.Object
implements scala.Product, java.io.Serializable
```

The journal may support tagging of events that are used by the
 `EventsByTag` query and it may support specifying the tags via an
 [`EventAdapter`](EventAdapter.html "interface in akka.persistence.journal") that wraps the events
 in a `Tagged` with the given `tags`. The journal may support other
 ways of doing tagging. Please consult the documentation of the specific
 journal implementation for more information.
 
 The journal will unwrap the event and store the `payload`.

See Also:
[Serialized Form](../../../serialized-form.html#akka.persistence.journal.Tagged)

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[Tagged](#%3Cinit%3E(java.lang.Object,java.util.Set))​(java.lang.Object payload,  java.util.Set<java.lang.String> tags)` | Java API |
	| `[Tagged](#%3Cinit%3E(java.lang.Object,scala.collection.immutable.Set))​(java.lang.Object payload,  scala.collection.immutable.Set<java.lang.String> tags)` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `static [Tagged](Tagged.html "class in akka.persistence.journal")` | `[apply](#apply(java.lang.Object,scala.collection.immutable.Set))​(java.lang.Object payload,  scala.collection.immutable.Set<java.lang.String> tags)` |  |
	| `boolean` | `[canEqual](#canEqual(java.lang.Object))​(java.lang.Object x$1)` |  |
	| `[Tagged](Tagged.html "class in akka.persistence.journal")` | `[copy](#copy(java.lang.Object,scala.collection.immutable.Set))​(java.lang.Object payload,  scala.collection.immutable.Set<java.lang.String> tags)` |  |
	| `java.lang.Object` | `[copy$default$1](#copy$default$1())()` |  |
	| `scala.collection.immutable.Set<java.lang.String>` | `[copy$default$2](#copy$default$2())()` |  |
	| `boolean` | `[equals](#equals(java.lang.Object))​(java.lang.Object x$1)` |  |
	| `int` | `[hashCode](#hashCode())()` |  |
	| `java.lang.Object` | `[payload](#payload())()` |  |
	| `int` | `[productArity](#productArity())()` |  |
	| `java.lang.Object` | `[productElement](#productElement(int))​(int x$1)` |  |
	| `java.lang.String` | `[productElementName](#productElementName(int))​(int x$1)` |  |
	| `scala.collection.Iterator<java.lang.Object>` | `[productIterator](#productIterator())()` |  |
	| `java.lang.String` | `[productPrefix](#productPrefix())()` |  |
	| `scala.collection.immutable.Set<java.lang.String>` | `[tags](#tags())()` |  |
	| `java.lang.String` | `[toString](#toString())()` |  |
	| `static scala.Option<scala.Tuple2<java.lang.Object,​scala.collection.immutable.Set<java.lang.String>>>` | `[unapply](#unapply(akka.persistence.journal.Tagged))​([Tagged](Tagged.html "class in akka.persistence.journal") x$0)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, finalize, getClass, notify, notifyAll, wait, wait, wait`
		- ### Methods inherited from interface scala.Product
		
		
		`productElementNames`

- - ### Constructor Detail
	
	
	
		- #### Tagged
		
		
		
		```
		public Tagged​(java.lang.Object payload,
		              scala.collection.immutable.Set<java.lang.String> tags)
		```
		- #### Tagged
		
		
		
		```
		public Tagged​(java.lang.Object payload,
		              java.util.Set<java.lang.String> tags)
		```
		
		Java API

	- ### Method Detail
	
	
	
		- #### apply
		
		
		
		```
		public static [Tagged](Tagged.html "class in akka.persistence.journal") apply​(java.lang.Object payload,
		                           scala.collection.immutable.Set<java.lang.String> tags)
		```
		- #### unapply
		
		
		
		```
		public static scala.Option<scala.Tuple2<java.lang.Object,​scala.collection.immutable.Set<java.lang.String>>> unapply​([Tagged](Tagged.html "class in akka.persistence.journal") x$0)
		```
		- #### payload
		
		
		
		```
		public java.lang.Object payload()
		```
		- #### tags
		
		
		
		```
		public scala.collection.immutable.Set<java.lang.String> tags()
		```
		- #### copy
		
		
		
		```
		public [Tagged](Tagged.html "class in akka.persistence.journal") copy​(java.lang.Object payload,
		                   scala.collection.immutable.Set<java.lang.String> tags)
		```
		- #### copy$default$1
		
		
		
		```
		public java.lang.Object copy$default$1()
		```
		- #### copy$default$2
		
		
		
		```
		public scala.collection.immutable.Set<java.lang.String> copy$default$2()
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

- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/journal/EventAdapter.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/journal/Tagged.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/journal/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/persistence/journal/Tagged.html](https://doc.akka.io/japi/akka-core/2.10/akka/persistence/journal/Tagged.html)*