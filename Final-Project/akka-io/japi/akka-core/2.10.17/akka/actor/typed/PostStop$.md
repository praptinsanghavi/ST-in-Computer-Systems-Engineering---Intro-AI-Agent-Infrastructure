---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:32:23Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/typed/PostStop$.html
title: PostStop$
---

# PostStop$

## Content

Package [akka.actor.typed](package-summary.html)
## Class PostStop$

- java.lang.Object
- - [akka.actor.typed.PostStop](PostStop.html "class in akka.actor.typed")
	- - akka.actor.typed.PostStop$

- All Implemented Interfaces:
`[Signal](Signal.html "interface in akka.actor.typed")`, `java.io.Serializable`, `scala.Equals`, `scala.Product`

---

```
public class PostStop$
extends [PostStop](PostStop.html "class in akka.actor.typed")
implements scala.Product, java.io.Serializable
```

Lifecycle signal that is fired after this actor and all its child actors
 (transitively) have terminated. The [`Terminated`](Terminated.html "class in akka.actor.typed") signal is only sent to
 registered watchers after this signal has been processed.

See Also:
[Serialized Form](../../../serialized-form.html#akka.actor.typed.PostStop$)

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [PostStop$](PostStop$.html "class in akka.actor.typed")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[PostStop$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `boolean` | `[canEqual](#canEqual(java.lang.Object))​(java.lang.Object x$1)` |  |
	| `int` | `[hashCode](#hashCode())()` |  |
	| `[PostStop](PostStop.html "class in akka.actor.typed")` | `[instance](#instance())()` |  |
	| `int` | `[productArity](#productArity())()` |  |
	| `java.lang.Object` | `[productElement](#productElement(int))​(int x$1)` |  |
	| `scala.collection.Iterator<java.lang.Object>` | `[productIterator](#productIterator())()` |  |
	| `java.lang.String` | `[productPrefix](#productPrefix())()` |  |
	| `java.lang.String` | `[toString](#toString())()` |  |
	
	
		- ### Methods inherited from class akka.actor.typed.[PostStop](PostStop.html "class in akka.actor.typed")
		
		
		`[equals](PostStop.html#equals(java.lang.Object)), [productElementName](PostStop.html#productElementName(int)), [productElementNames](PostStop.html#productElementNames())`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, notify, notifyAll, wait, wait, wait`
		- ### Methods inherited from interface scala.Equals
		
		
		`equals`
		- ### Methods inherited from interface scala.Product
		
		
		`productElementName, productElementNames`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [PostStop$](PostStop$.html "class in akka.actor.typed") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### PostStop$
		
		
		
		```
		public PostStop$()
		```

	- ### Method Detail
	
	
	
		- #### instance
		
		
		
		```
		public [PostStop](PostStop.html "class in akka.actor.typed") instance()
		```
		
		
		Overrides:
		`[instance](PostStop.html#instance())` in class `[PostStop](PostStop.html "class in akka.actor.typed")`
		- #### productPrefix
		
		
		
		```
		public java.lang.String productPrefix()
		```
		
		
		Specified by:
		`productPrefix` in interface `scala.Product`
		Overrides:
		`[productPrefix](PostStop.html#productPrefix())` in class `[PostStop](PostStop.html "class in akka.actor.typed")`
		- #### productArity
		
		
		
		```
		public int productArity()
		```
		
		
		Specified by:
		`productArity` in interface `scala.Product`
		Overrides:
		`[productArity](PostStop.html#productArity())` in class `[PostStop](PostStop.html "class in akka.actor.typed")`
		- #### productElement
		
		
		
		```
		public java.lang.Object productElement​(int x$1)
		```
		
		
		Specified by:
		`productElement` in interface `scala.Product`
		Overrides:
		`[productElement](PostStop.html#productElement(int))` in class `[PostStop](PostStop.html "class in akka.actor.typed")`
		- #### productIterator
		
		
		
		```
		public scala.collection.Iterator<java.lang.Object> productIterator()
		```
		
		
		Specified by:
		`productIterator` in interface `scala.Product`
		Overrides:
		`[productIterator](PostStop.html#productIterator())` in class `[PostStop](PostStop.html "class in akka.actor.typed")`
		- #### canEqual
		
		
		
		```
		public boolean canEqual​(java.lang.Object x$1)
		```
		
		
		Specified by:
		`canEqual` in interface `scala.Equals`
		Overrides:
		`[canEqual](PostStop.html#canEqual(java.lang.Object))` in class `[PostStop](PostStop.html "class in akka.actor.typed")`
		- #### hashCode
		
		
		
		```
		public int hashCode()
		```
		
		
		Overrides:
		`[hashCode](PostStop.html#hashCode())` in class `[PostStop](PostStop.html "class in akka.actor.typed")`
		- #### toString
		
		
		
		```
		public java.lang.String toString()
		```
		
		
		Overrides:
		`[toString](PostStop.html#toString())` in class `[PostStop](PostStop.html "class in akka.actor.typed")`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/typed/PostStop$.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/typed/PostStop.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/typed/Signal.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/typed/Terminated.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/typed/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10.17/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/typed/PostStop$.html](https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/typed/PostStop$.html)*