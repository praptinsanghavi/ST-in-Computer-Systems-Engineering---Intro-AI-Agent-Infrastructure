---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T20:16:13Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/routing/ActorRefRoutee.html
title: ActorRefRoutee
---

# ActorRefRoutee

## Content

Package [akka.routing](package-summary.html)
## Class ActorRefRoutee

- java.lang.Object
- - akka.routing.ActorRefRoutee

- All Implemented Interfaces:
`[Routee](Routee.html "interface in akka.routing")`, `java.io.Serializable`, `scala.Equals`, `scala.Product`

---

```
public final class ActorRefRoutee
extends java.lang.Object
implements [Routee](Routee.html "interface in akka.routing"), scala.Product, java.io.Serializable
```

[`Routee`](Routee.html "interface in akka.routing") that sends the messages to an [`ActorRef`](../actor/ActorRef.html "class in akka.actor").

See Also:
[Serialized Form](../../serialized-form.html#akka.routing.ActorRefRoutee)

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[ActorRefRoutee](#%3Cinit%3E(akka.actor.ActorRef))​([ActorRef](../actor/ActorRef.html "class in akka.actor") ref)` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `static [ActorRefRoutee](ActorRefRoutee.html "class in akka.routing")` | `[apply](#apply(akka.actor.ActorRef))​([ActorRef](../actor/ActorRef.html "class in akka.actor") ref)` |  |
	| `boolean` | `[canEqual](#canEqual(java.lang.Object))​(java.lang.Object x$1)` |  |
	| `[ActorRefRoutee](ActorRefRoutee.html "class in akka.routing")` | `[copy](#copy(akka.actor.ActorRef))​([ActorRef](../actor/ActorRef.html "class in akka.actor") ref)` |  |
	| `[ActorRef](../actor/ActorRef.html "class in akka.actor")` | `[copy$default$1](#copy$default$1())()` |  |
	| `boolean` | `[equals](#equals(java.lang.Object))​(java.lang.Object x$1)` |  |
	| `int` | `[hashCode](#hashCode())()` |  |
	| `int` | `[productArity](#productArity())()` |  |
	| `java.lang.Object` | `[productElement](#productElement(int))​(int x$1)` |  |
	| `java.lang.String` | `[productElementName](#productElementName(int))​(int x$1)` |  |
	| `scala.collection.Iterator<java.lang.Object>` | `[productIterator](#productIterator())()` |  |
	| `java.lang.String` | `[productPrefix](#productPrefix())()` |  |
	| `[ActorRef](../actor/ActorRef.html "class in akka.actor")` | `[ref](#ref())()` |  |
	| `void` | `[send](#send(java.lang.Object,akka.actor.ActorRef))​(java.lang.Object message,  [ActorRef](../actor/ActorRef.html "class in akka.actor") sender)` |  |
	| `java.lang.String` | `[toString](#toString())()` |  |
	| `static scala.Option<[ActorRef](../actor/ActorRef.html "class in akka.actor")>` | `[unapply](#unapply(akka.routing.ActorRefRoutee))​([ActorRefRoutee](ActorRefRoutee.html "class in akka.routing") x$0)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, finalize, getClass, notify, notifyAll, wait, wait, wait`
		- ### Methods inherited from interface scala.Product
		
		
		`productElementNames`

- - ### Constructor Detail
	
	
	
		- #### ActorRefRoutee
		
		
		
		```
		public ActorRefRoutee​([ActorRef](../actor/ActorRef.html "class in akka.actor") ref)
		```

	- ### Method Detail
	
	
	
		- #### apply
		
		
		
		```
		public static [ActorRefRoutee](ActorRefRoutee.html "class in akka.routing") apply​([ActorRef](../actor/ActorRef.html "class in akka.actor") ref)
		```
		- #### unapply
		
		
		
		```
		public static scala.Option<[ActorRef](../actor/ActorRef.html "class in akka.actor")> unapply​([ActorRefRoutee](ActorRefRoutee.html "class in akka.routing") x$0)
		```
		- #### ref
		
		
		
		```
		public [ActorRef](../actor/ActorRef.html "class in akka.actor") ref()
		```
		- #### send
		
		
		
		```
		public void send​(java.lang.Object message,
		                 [ActorRef](../actor/ActorRef.html "class in akka.actor") sender)
		```
		
		
		Specified by:
		`[send](Routee.html#send(java.lang.Object,akka.actor.ActorRef))` in interface `[Routee](Routee.html "interface in akka.routing")`
		- #### copy
		
		
		
		```
		public [ActorRefRoutee](ActorRefRoutee.html "class in akka.routing") copy​([ActorRef](../actor/ActorRef.html "class in akka.actor") ref)
		```
		- #### copy$default$1
		
		
		
		```
		public [ActorRef](../actor/ActorRef.html "class in akka.actor") copy$default$1()
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

- https://doc.akka.io/japi/akka-core/2.10/akka/actor/ActorRef.html
- https://doc.akka.io/japi/akka-core/2.10/akka/routing/ActorRefRoutee.html
- https://doc.akka.io/japi/akka-core/2.10/akka/routing/Routee.html
- https://doc.akka.io/japi/akka-core/2.10/akka/routing/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/routing/ActorRefRoutee.html](https://doc.akka.io/japi/akka-core/2.10/akka/routing/ActorRefRoutee.html)*