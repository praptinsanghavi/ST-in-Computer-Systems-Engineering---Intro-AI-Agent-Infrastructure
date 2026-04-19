---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T20:49:46Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/actor/Identify.html
title: Identify
---

# Identify

## Content

Package [akka.actor](package-summary.html)
## Class Identify

- java.lang.Object
- - akka.actor.Identify

- All Implemented Interfaces:
`[AutoReceivedMessage](AutoReceivedMessage.html "interface in akka.actor")`, `[NotInfluenceReceiveTimeout](NotInfluenceReceiveTimeout.html "interface in akka.actor")`, `java.io.Serializable`, `scala.Equals`, `scala.Product`

---

```
public final class Identify
extends java.lang.Object
implements [AutoReceivedMessage](AutoReceivedMessage.html "interface in akka.actor"), [NotInfluenceReceiveTimeout](NotInfluenceReceiveTimeout.html "interface in akka.actor"), scala.Product, java.io.Serializable
```

A message all Actors will understand, that when processed will reply with
 [`ActorIdentity`](ActorIdentity.html "class in akka.actor") containing the `ActorRef`. The `messageId`
 is returned in the `ActorIdentity` message as `correlationId`.

See Also:
[Serialized Form](../../serialized-form.html#akka.actor.Identify)

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[Identify](#%3Cinit%3E(java.lang.Object))​(java.lang.Object messageId)` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `static [Identify](Identify.html "class in akka.actor")` | `[apply](#apply(java.lang.Object))​(java.lang.Object messageId)` |  |
	| `boolean` | `[canEqual](#canEqual(java.lang.Object))​(java.lang.Object x$1)` |  |
	| `[Identify](Identify.html "class in akka.actor")` | `[copy](#copy(java.lang.Object))​(java.lang.Object messageId)` |  |
	| `java.lang.Object` | `[copy$default$1](#copy$default$1())()` |  |
	| `boolean` | `[equals](#equals(java.lang.Object))​(java.lang.Object x$1)` |  |
	| `int` | `[hashCode](#hashCode())()` |  |
	| `java.lang.Object` | `[messageId](#messageId())()` |  |
	| `int` | `[productArity](#productArity())()` |  |
	| `java.lang.Object` | `[productElement](#productElement(int))​(int x$1)` |  |
	| `java.lang.String` | `[productElementName](#productElementName(int))​(int x$1)` |  |
	| `scala.collection.Iterator<java.lang.Object>` | `[productIterator](#productIterator())()` |  |
	| `java.lang.String` | `[productPrefix](#productPrefix())()` |  |
	| `java.lang.String` | `[toString](#toString())()` |  |
	| `static scala.Option<java.lang.Object>` | `[unapply](#unapply(akka.actor.Identify))​([Identify](Identify.html "class in akka.actor") x$0)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, finalize, getClass, notify, notifyAll, wait, wait, wait`
		- ### Methods inherited from interface scala.Product
		
		
		`productElementNames`

- - ### Constructor Detail
	
	
	
		- #### Identify
		
		
		
		```
		public Identify​(java.lang.Object messageId)
		```

	- ### Method Detail
	
	
	
		- #### apply
		
		
		
		```
		public static [Identify](Identify.html "class in akka.actor") apply​(java.lang.Object messageId)
		```
		- #### unapply
		
		
		
		```
		public static scala.Option<java.lang.Object> unapply​([Identify](Identify.html "class in akka.actor") x$0)
		```
		- #### messageId
		
		
		
		```
		public java.lang.Object messageId()
		```
		- #### copy
		
		
		
		```
		public [Identify](Identify.html "class in akka.actor") copy​(java.lang.Object messageId)
		```
		- #### copy$default$1
		
		
		
		```
		public java.lang.Object copy$default$1()
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
- https://doc.akka.io/japi/akka/current/akka/actor/AutoReceivedMessage.html
- https://doc.akka.io/japi/akka/current/akka/actor/Identify.html
- https://doc.akka.io/japi/akka/current/akka/actor/NotInfluenceReceiveTimeout.html
- https://doc.akka.io/japi/akka/current/akka/actor/package-summary.html
- https://doc.akka.io/japi/akka/current/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/actor/Identify.html](https://doc.akka.io/japi/akka/current/akka/actor/Identify.html)*