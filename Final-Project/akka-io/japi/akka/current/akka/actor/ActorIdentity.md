---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T20:49:44Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/actor/ActorIdentity.html
title: ActorIdentity
---

# ActorIdentity

## Content

Package [akka.actor](package-summary.html)
## Class ActorIdentity

- java.lang.Object
- - akka.actor.ActorIdentity

- All Implemented Interfaces:
`java.io.Serializable`, `scala.Equals`, `scala.Product`

---

```
public final class ActorIdentity
extends java.lang.Object
implements scala.Product, java.io.Serializable
```

Reply to [`Identify`](Identify.html "class in akka.actor"). Contains
 `Some(ref)` with the `ActorRef` of the actor replying to the request or
 `None` if no actor matched the request.
 The `correlationId` is taken from the `messageId` in
 the `Identify` message.

See Also:
[Serialized Form](../../serialized-form.html#akka.actor.ActorIdentity)

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[ActorIdentity](#%3Cinit%3E(java.lang.Object,scala.Option))​(java.lang.Object correlationId,  scala.Option<[ActorRef](ActorRef.html "class in akka.actor")> ref)` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `static [ActorIdentity](ActorIdentity.html "class in akka.actor")` | `[apply](#apply(java.lang.Object,scala.Option))​(java.lang.Object correlationId,  scala.Option<[ActorRef](ActorRef.html "class in akka.actor")> ref)` |  |
	| `boolean` | `[canEqual](#canEqual(java.lang.Object))​(java.lang.Object x$1)` |  |
	| `[ActorIdentity](ActorIdentity.html "class in akka.actor")` | `[copy](#copy(java.lang.Object,scala.Option))​(java.lang.Object correlationId,  scala.Option<[ActorRef](ActorRef.html "class in akka.actor")> ref)` |  |
	| `java.lang.Object` | `[copy$default$1](#copy$default$1())()` |  |
	| `scala.Option<[ActorRef](ActorRef.html "class in akka.actor")>` | `[copy$default$2](#copy$default$2())()` |  |
	| `java.lang.Object` | `[correlationId](#correlationId())()` |  |
	| `boolean` | `[equals](#equals(java.lang.Object))​(java.lang.Object x$1)` |  |
	| `java.util.Optional<[ActorRef](ActorRef.html "class in akka.actor")>` | `[getActorRef](#getActorRef())()` | Java API: `ActorRef` of the actor replying to the request or  not defined if no actor matched the request. |
	| `int` | `[hashCode](#hashCode())()` |  |
	| `int` | `[productArity](#productArity())()` |  |
	| `java.lang.Object` | `[productElement](#productElement(int))​(int x$1)` |  |
	| `java.lang.String` | `[productElementName](#productElementName(int))​(int x$1)` |  |
	| `scala.collection.Iterator<java.lang.Object>` | `[productIterator](#productIterator())()` |  |
	| `java.lang.String` | `[productPrefix](#productPrefix())()` |  |
	| `scala.Option<[ActorRef](ActorRef.html "class in akka.actor")>` | `[ref](#ref())()` |  |
	| `java.lang.String` | `[toString](#toString())()` |  |
	| `static scala.Option<scala.Tuple2<java.lang.Object,​scala.Option<[ActorRef](ActorRef.html "class in akka.actor")>>>` | `[unapply](#unapply(akka.actor.ActorIdentity))​([ActorIdentity](ActorIdentity.html "class in akka.actor") x$0)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, finalize, getClass, notify, notifyAll, wait, wait, wait`
		- ### Methods inherited from interface scala.Product
		
		
		`productElementNames`

- - ### Constructor Detail
	
	
	
		- #### ActorIdentity
		
		
		
		```
		public ActorIdentity​(java.lang.Object correlationId,
		                     scala.Option<[ActorRef](ActorRef.html "class in akka.actor")> ref)
		```

	- ### Method Detail
	
	
	
		- #### apply
		
		
		
		```
		public static [ActorIdentity](ActorIdentity.html "class in akka.actor") apply​(java.lang.Object correlationId,
		                                  scala.Option<[ActorRef](ActorRef.html "class in akka.actor")> ref)
		```
		- #### unapply
		
		
		
		```
		public static scala.Option<scala.Tuple2<java.lang.Object,​scala.Option<[ActorRef](ActorRef.html "class in akka.actor")>>> unapply​([ActorIdentity](ActorIdentity.html "class in akka.actor") x$0)
		```
		- #### correlationId
		
		
		
		```
		public java.lang.Object correlationId()
		```
		- #### ref
		
		
		
		```
		public scala.Option<[ActorRef](ActorRef.html "class in akka.actor")> ref()
		```
		- #### getActorRef
		
		
		
		```
		public java.util.Optional<[ActorRef](ActorRef.html "class in akka.actor")> getActorRef()
		```
		
		Java API: `ActorRef` of the actor replying to the request or
		 not defined if no actor matched the request.
		- #### copy
		
		
		
		```
		public [ActorIdentity](ActorIdentity.html "class in akka.actor") copy​(java.lang.Object correlationId,
		                          scala.Option<[ActorRef](ActorRef.html "class in akka.actor")> ref)
		```
		- #### copy$default$1
		
		
		
		```
		public java.lang.Object copy$default$1()
		```
		- #### copy$default$2
		
		
		
		```
		public scala.Option<[ActorRef](ActorRef.html "class in akka.actor")> copy$default$2()
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

- https://doc.akka.io/japi/akka/current/akka/actor/ActorIdentity.html
- https://doc.akka.io/japi/akka/current/akka/actor/ActorRef.html
- https://doc.akka.io/japi/akka/current/akka/actor/Identify.html
- https://doc.akka.io/japi/akka/current/akka/actor/package-summary.html
- https://doc.akka.io/japi/akka/current/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/actor/ActorIdentity.html](https://doc.akka.io/japi/akka/current/akka/actor/ActorIdentity.html)*