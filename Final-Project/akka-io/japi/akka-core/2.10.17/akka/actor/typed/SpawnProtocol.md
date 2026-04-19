---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:32:28Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/typed/SpawnProtocol.Spawn.html
title: SpawnProtocol.Spawn
---

# SpawnProtocol.Spawn

## Content

Package [akka.actor.typed](package-summary.html)
## Class SpawnProtocol.Spawn\<T\>

- java.lang.Object
- - akka.actor.typed.SpawnProtocol.Spawn\<T\>

- All Implemented Interfaces:
`[SpawnProtocol.Command](SpawnProtocol.Command.html "interface in akka.actor.typed")`, `java.io.Serializable`, `scala.Equals`, `scala.Product`

Enclosing class:
[SpawnProtocol](SpawnProtocol.html "class in akka.actor.typed")

---

```
public static final class SpawnProtocol.Spawn<T>
extends java.lang.Object
implements [SpawnProtocol.Command](SpawnProtocol.Command.html "interface in akka.actor.typed"), scala.Product, java.io.Serializable
```

Spawn a child actor with the given `behavior` and send back the `ActorRef` of that child to the given
 `replyTo` destination.
 
 If `name` is an empty string an anonymous actor (with automatically generated name) will be created.
 

 If the `name` is already taken of an existing actor a unique name will be used by appending a suffix
 to the the `name`. The exact format or value of the suffix is an implementation detail that is
 undefined. This means that reusing the same name for several actors will not result in
 `InvalidActorNameException`, but it's better to use unique names to begin with.

See Also:
[Serialized Form](../../../serialized-form.html#akka.actor.typed.SpawnProtocol.Spawn)

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[Spawn](#%3Cinit%3E(akka.actor.typed.Behavior,java.lang.String,akka.actor.typed.Props,akka.actor.typed.ActorRef))​([Behavior](Behavior.html "class in akka.actor.typed")<[T](SpawnProtocol.Spawn.html "type parameter in SpawnProtocol.Spawn")> behavior,  java.lang.String name,  [Props](Props.html "class in akka.actor.typed") props,  [ActorRef](ActorRef.html "interface in akka.actor.typed")<[ActorRef](ActorRef.html "interface in akka.actor.typed")<[T](SpawnProtocol.Spawn.html "type parameter in SpawnProtocol.Spawn")>> replyTo)` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[Behavior](Behavior.html "class in akka.actor.typed")<[T](SpawnProtocol.Spawn.html "type parameter in SpawnProtocol.Spawn")>` | `[behavior](#behavior())()` |  |
	| `boolean` | `[canEqual](#canEqual(java.lang.Object))​(java.lang.Object x$1)` |  |
	| `<T> [SpawnProtocol.Spawn](SpawnProtocol.Spawn.html "class in akka.actor.typed")<T>` | `[copy](#copy(akka.actor.typed.Behavior,java.lang.String,akka.actor.typed.Props,akka.actor.typed.ActorRef))​([Behavior](Behavior.html "class in akka.actor.typed")<T> behavior,  java.lang.String name,  [Props](Props.html "class in akka.actor.typed") props,  [ActorRef](ActorRef.html "interface in akka.actor.typed")<[ActorRef](ActorRef.html "interface in akka.actor.typed")<T>> replyTo)` |  |
	| `<T> [Behavior](Behavior.html "class in akka.actor.typed")<T>` | `[copy$default$1](#copy$default$1())()` |  |
	| `<T> java.lang.String` | `[copy$default$2](#copy$default$2())()` |  |
	| `<T> [Props](Props.html "class in akka.actor.typed")` | `[copy$default$3](#copy$default$3())()` |  |
	| `<T> [ActorRef](ActorRef.html "interface in akka.actor.typed")<[ActorRef](ActorRef.html "interface in akka.actor.typed")<T>>` | `[copy$default$4](#copy$default$4())()` |  |
	| `boolean` | `[equals](#equals(java.lang.Object))​(java.lang.Object x$1)` |  |
	| `int` | `[hashCode](#hashCode())()` |  |
	| `java.lang.String` | `[name](#name())()` |  |
	| `int` | `[productArity](#productArity())()` |  |
	| `java.lang.Object` | `[productElement](#productElement(int))​(int x$1)` |  |
	| `java.lang.String` | `[productElementName](#productElementName(int))​(int x$1)` |  |
	| `scala.collection.Iterator<java.lang.Object>` | `[productIterator](#productIterator())()` |  |
	| `java.lang.String` | `[productPrefix](#productPrefix())()` |  |
	| `[Props](Props.html "class in akka.actor.typed")` | `[props](#props())()` |  |
	| `[ActorRef](ActorRef.html "interface in akka.actor.typed")<[ActorRef](ActorRef.html "interface in akka.actor.typed")<[T](SpawnProtocol.Spawn.html "type parameter in SpawnProtocol.Spawn")>>` | `[replyTo](#replyTo())()` |  |
	| `java.lang.String` | `[toString](#toString())()` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, finalize, getClass, notify, notifyAll, wait, wait, wait`
		- ### Methods inherited from interface scala.Product
		
		
		`productElementNames`

- - ### Constructor Detail
	
	
	
		- #### Spawn
		
		
		
		```
		public Spawn​([Behavior](Behavior.html "class in akka.actor.typed")<[T](SpawnProtocol.Spawn.html "type parameter in SpawnProtocol.Spawn")> behavior,
		             java.lang.String name,
		             [Props](Props.html "class in akka.actor.typed") props,
		             [ActorRef](ActorRef.html "interface in akka.actor.typed")<[ActorRef](ActorRef.html "interface in akka.actor.typed")<[T](SpawnProtocol.Spawn.html "type parameter in SpawnProtocol.Spawn")>> replyTo)
		```

	- ### Method Detail
	
	
	
		- #### behavior
		
		
		
		```
		public [Behavior](Behavior.html "class in akka.actor.typed")<[T](SpawnProtocol.Spawn.html "type parameter in SpawnProtocol.Spawn")> behavior()
		```
		- #### name
		
		
		
		```
		public java.lang.String name()
		```
		- #### props
		
		
		
		```
		public [Props](Props.html "class in akka.actor.typed") props()
		```
		- #### replyTo
		
		
		
		```
		public [ActorRef](ActorRef.html "interface in akka.actor.typed")<[ActorRef](ActorRef.html "interface in akka.actor.typed")<[T](SpawnProtocol.Spawn.html "type parameter in SpawnProtocol.Spawn")>> replyTo()
		```
		- #### copy
		
		
		
		```
		public <T> [SpawnProtocol.Spawn](SpawnProtocol.Spawn.html "class in akka.actor.typed")<T> copy​([Behavior](Behavior.html "class in akka.actor.typed")<T> behavior,
		                                       java.lang.String name,
		                                       [Props](Props.html "class in akka.actor.typed") props,
		                                       [ActorRef](ActorRef.html "interface in akka.actor.typed")<[ActorRef](ActorRef.html "interface in akka.actor.typed")<T>> replyTo)
		```
		- #### copy$default$1
		
		
		
		```
		public <T> [Behavior](Behavior.html "class in akka.actor.typed")<T> copy$default$1()
		```
		- #### copy$default$2
		
		
		
		```
		public <T> java.lang.String copy$default$2()
		```
		- #### copy$default$3
		
		
		
		```
		public <T> [Props](Props.html "class in akka.actor.typed") copy$default$3()
		```
		- #### copy$default$4
		
		
		
		```
		public <T> [ActorRef](ActorRef.html "interface in akka.actor.typed")<[ActorRef](ActorRef.html "interface in akka.actor.typed")<T>> copy$default$4()
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

- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/typed/ActorRef.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/typed/Behavior.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/typed/Props.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/typed/SpawnProtocol.Command.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/typed/SpawnProtocol.Spawn.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/typed/SpawnProtocol.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/typed/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10.17/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/typed/SpawnProtocol.Spawn.html](https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/typed/SpawnProtocol.Spawn.html)*