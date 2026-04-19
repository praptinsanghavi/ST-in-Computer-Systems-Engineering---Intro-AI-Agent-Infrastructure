---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:39:44Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/routing/WithListeners.html
title: WithListeners
---

# WithListeners

## Content

Package [akka.routing](package-summary.html)
## Class WithListeners

- java.lang.Object
- - akka.routing.WithListeners

- All Implemented Interfaces:
`[ListenerMessage](ListenerMessage.html "interface in akka.routing")`, `java.io.Serializable`, `scala.Equals`, `scala.Product`

---

```
public final class WithListeners
extends java.lang.Object
implements [ListenerMessage](ListenerMessage.html "interface in akka.routing"), scala.Product, java.io.Serializable
```

See Also:
[Serialized Form](../../serialized-form.html#akka.routing.WithListeners)

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[WithListeners](#%3Cinit%3E(scala.Function1))​(scala.Function1<[ActorRef](../actor/ActorRef.html "class in akka.actor"),​scala.runtime.BoxedUnit> f)` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `static [WithListeners](WithListeners.html "class in akka.routing")` | `[apply](#apply(scala.Function1))​(scala.Function1<[ActorRef](../actor/ActorRef.html "class in akka.actor"),​scala.runtime.BoxedUnit> f)` |  |
	| `boolean` | `[canEqual](#canEqual(java.lang.Object))​(java.lang.Object x$1)` |  |
	| `[WithListeners](WithListeners.html "class in akka.routing")` | `[copy](#copy(scala.Function1))​(scala.Function1<[ActorRef](../actor/ActorRef.html "class in akka.actor"),​scala.runtime.BoxedUnit> f)` |  |
	| `scala.Function1<[ActorRef](../actor/ActorRef.html "class in akka.actor"),​scala.runtime.BoxedUnit>` | `[copy$default$1](#copy$default$1())()` |  |
	| `boolean` | `[equals](#equals(java.lang.Object))​(java.lang.Object x$1)` |  |
	| `scala.Function1<[ActorRef](../actor/ActorRef.html "class in akka.actor"),​scala.runtime.BoxedUnit>` | `[f](#f())()` |  |
	| `int` | `[hashCode](#hashCode())()` |  |
	| `int` | `[productArity](#productArity())()` |  |
	| `java.lang.Object` | `[productElement](#productElement(int))​(int x$1)` |  |
	| `java.lang.String` | `[productElementName](#productElementName(int))​(int x$1)` |  |
	| `scala.collection.Iterator<java.lang.Object>` | `[productIterator](#productIterator())()` |  |
	| `java.lang.String` | `[productPrefix](#productPrefix())()` |  |
	| `java.lang.String` | `[toString](#toString())()` |  |
	| `static scala.Option<scala.Function1<[ActorRef](../actor/ActorRef.html "class in akka.actor"),​scala.runtime.BoxedUnit>>` | `[unapply](#unapply(akka.routing.WithListeners))​([WithListeners](WithListeners.html "class in akka.routing") x$0)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, finalize, getClass, notify, notifyAll, wait, wait, wait`
		- ### Methods inherited from interface scala.Product
		
		
		`productElementNames`

- - ### Constructor Detail
	
	
	
		- #### WithListeners
		
		
		
		```
		public WithListeners​(scala.Function1<[ActorRef](../actor/ActorRef.html "class in akka.actor"),​scala.runtime.BoxedUnit> f)
		```

	- ### Method Detail
	
	
	
		- #### apply
		
		
		
		```
		public static [WithListeners](WithListeners.html "class in akka.routing") apply​(scala.Function1<[ActorRef](../actor/ActorRef.html "class in akka.actor"),​scala.runtime.BoxedUnit> f)
		```
		- #### unapply
		
		
		
		```
		public static scala.Option<scala.Function1<[ActorRef](../actor/ActorRef.html "class in akka.actor"),​scala.runtime.BoxedUnit>> unapply​([WithListeners](WithListeners.html "class in akka.routing") x$0)
		```
		- #### f
		
		
		
		```
		public scala.Function1<[ActorRef](../actor/ActorRef.html "class in akka.actor"),​scala.runtime.BoxedUnit> f()
		```
		- #### copy
		
		
		
		```
		public [WithListeners](WithListeners.html "class in akka.routing") copy​(scala.Function1<[ActorRef](../actor/ActorRef.html "class in akka.actor"),​scala.runtime.BoxedUnit> f)
		```
		- #### copy$default$1
		
		
		
		```
		public scala.Function1<[ActorRef](../actor/ActorRef.html "class in akka.actor"),​scala.runtime.BoxedUnit> copy$default$1()
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

- https://doc.akka.io/japi/akka/current/akka/actor/ActorRef.html
- https://doc.akka.io/japi/akka/current/akka/routing/ListenerMessage.html
- https://doc.akka.io/japi/akka/current/akka/routing/WithListeners.html
- https://doc.akka.io/japi/akka/current/akka/routing/package-summary.html
- https://doc.akka.io/japi/akka/current/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/routing/WithListeners.html](https://doc.akka.io/japi/akka/current/akka/routing/WithListeners.html)*