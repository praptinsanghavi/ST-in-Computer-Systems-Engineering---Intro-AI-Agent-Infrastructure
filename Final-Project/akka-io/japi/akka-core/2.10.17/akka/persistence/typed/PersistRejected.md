---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:02:22Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/typed/PersistRejected.html
title: PersistRejected
---

# PersistRejected

## Content

Package [akka.persistence.typed](package-summary.html)
## Class PersistRejected\<Command,​Event\>

- java.lang.Object
- - akka.persistence.typed.PersistRejected\<Command,​Event\>

- All Implemented Interfaces:
`[Signal](../../actor/typed/Signal.html "interface in akka.actor.typed")`, `[EventSourcedSignal](EventSourcedSignal.html "interface in akka.persistence.typed")`, `java.io.Serializable`, `scala.Equals`, `scala.Product`

---

```
public final class PersistRejected<Command,​Event>
extends java.lang.Object
implements [EventSourcedSignal](EventSourcedSignal.html "interface in akka.persistence.typed"), scala.Product, java.io.Serializable
```

param: failure the original cause
 param: command the command that persisted the event, may be undefined if it is a replicated event

See Also:
[Serialized Form](../../../serialized-form.html#akka.persistence.typed.PersistRejected)

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[PersistRejected](#%3Cinit%3E(java.lang.Throwable,scala.Option))​(java.lang.Throwable failure,  scala.Option<[Command](PersistRejected.html "type parameter in PersistRejected")> command)` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `static <Command,​Event>[PersistRejected](PersistRejected.html "class in akka.persistence.typed")<Command,​Event>` | `[apply](#apply(java.lang.Throwable,scala.Option))​(java.lang.Throwable failure,  scala.Option<Command> command)` |  |
	| `boolean` | `[canEqual](#canEqual(java.lang.Object))​(java.lang.Object x$1)` |  |
	| `scala.Option<[Command](PersistRejected.html "type parameter in PersistRejected")>` | `[command](#command())()` |  |
	| `<Command,​Event>[PersistRejected](PersistRejected.html "class in akka.persistence.typed")<Command,​Event>` | `[copy](#copy(java.lang.Throwable,scala.Option))​(java.lang.Throwable failure,  scala.Option<Command> command)` |  |
	| `<Command,​Event>java.lang.Throwable` | `[copy$default$1](#copy$default$1())()` |  |
	| `<Command,​Event>scala.Option<Command>` | `[copy$default$2](#copy$default$2())()` |  |
	| `boolean` | `[equals](#equals(java.lang.Object))​(java.lang.Object x$1)` |  |
	| `java.lang.Throwable` | `[failure](#failure())()` |  |
	| `java.util.Optional<[Command](PersistRejected.html "type parameter in PersistRejected")>` | `[getCommand](#getCommand())()` | Java API: the command that persisted the event, may be undefined if it is a replicated event |
	| `java.lang.Throwable` | `[getFailure](#getFailure())()` | Java API: the original cause |
	| `int` | `[hashCode](#hashCode())()` |  |
	| `int` | `[productArity](#productArity())()` |  |
	| `java.lang.Object` | `[productElement](#productElement(int))​(int x$1)` |  |
	| `java.lang.String` | `[productElementName](#productElementName(int))​(int x$1)` |  |
	| `scala.collection.Iterator<java.lang.Object>` | `[productIterator](#productIterator())()` |  |
	| `java.lang.String` | `[productPrefix](#productPrefix())()` |  |
	| `java.lang.String` | `[toString](#toString())()` |  |
	| `static <Command,​Event>scala.Option<scala.Tuple2<java.lang.Throwable,​scala.Option<Command>>>` | `[unapply](#unapply(akka.persistence.typed.PersistRejected))​([PersistRejected](PersistRejected.html "class in akka.persistence.typed")<Command,​Event> x$0)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, finalize, getClass, notify, notifyAll, wait, wait, wait`
		- ### Methods inherited from interface scala.Product
		
		
		`productElementNames`

- - ### Constructor Detail
	
	
	
		- #### PersistRejected
		
		
		
		```
		public PersistRejected​(java.lang.Throwable failure,
		                       scala.Option<[Command](PersistRejected.html "type parameter in PersistRejected")> command)
		```

	- ### Method Detail
	
	
	
		- #### apply
		
		
		
		```
		public static <Command,​Event> [PersistRejected](PersistRejected.html "class in akka.persistence.typed")<Command,​Event> apply​(java.lang.Throwable failure,
		                                                                               scala.Option<Command> command)
		```
		- #### unapply
		
		
		
		```
		public static <Command,​Event> scala.Option<scala.Tuple2<java.lang.Throwable,​scala.Option<Command>>> unapply​([PersistRejected](PersistRejected.html "class in akka.persistence.typed")<Command,​Event> x$0)
		```
		- #### failure
		
		
		
		```
		public java.lang.Throwable failure()
		```
		- #### command
		
		
		
		```
		public scala.Option<[Command](PersistRejected.html "type parameter in PersistRejected")> command()
		```
		- #### getFailure
		
		
		
		```
		public java.lang.Throwable getFailure()
		```
		
		Java API: the original cause
		- #### getCommand
		
		
		
		```
		public java.util.Optional<[Command](PersistRejected.html "type parameter in PersistRejected")> getCommand()
		```
		
		Java API: the command that persisted the event, may be undefined if it is a replicated event
		- #### toString
		
		
		
		```
		public java.lang.String toString()
		```
		
		
		Overrides:
		`toString` in class `java.lang.Object`
		- #### copy
		
		
		
		```
		public <Command,​Event> [PersistRejected](PersistRejected.html "class in akka.persistence.typed")<Command,​Event> copy​(java.lang.Throwable failure,
		                                                                       scala.Option<Command> command)
		```
		- #### copy$default$1
		
		
		
		```
		public <Command,​Event> java.lang.Throwable copy$default$1()
		```
		- #### copy$default$2
		
		
		
		```
		public <Command,​Event> scala.Option<Command> copy$default$2()
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
		- #### equals
		
		
		
		```
		public boolean equals​(java.lang.Object x$1)
		```
		
		
		Specified by:
		`equals` in interface `scala.Equals`
		Overrides:
		`equals` in class `java.lang.Object`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/typed/Signal.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/typed/EventSourcedSignal.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/typed/PersistRejected.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/typed/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10.17/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/typed/PersistRejected.html](https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/typed/PersistRejected.html)*