---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:45:56Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/RootActorPath.html
title: RootActorPath
---

# RootActorPath

## Content

Package [akka.actor](package-summary.html)
## Class RootActorPath

- java.lang.Object
- - akka.actor.RootActorPath

- All Implemented Interfaces:
`[ActorPath](ActorPath.html "interface in akka.actor")`, `java.io.Serializable`, `java.lang.Comparable<[ActorPath](ActorPath.html "interface in akka.actor")>`, `scala.Equals`, `scala.Product`

---

```
public final class RootActorPath
extends java.lang.Object
implements [ActorPath](ActorPath.html "interface in akka.actor"), scala.Product, java.io.Serializable
```

Root of the hierarchy of ActorPaths. There is exactly root per ActorSystem
 and node (for remote\-enabled or clustered systems).

See Also:
[Serialized Form](../../serialized-form.html#akka.actor.RootActorPath)

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[RootActorPath](#%3Cinit%3E(akka.actor.Address,java.lang.String))​([Address](Address.html "class in akka.actor") address,  java.lang.String name)` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[ActorPath](ActorPath.html "interface in akka.actor")` | `[$div](#$div(java.lang.String))​(java.lang.String child)` | Create a new child actor path. |
	| `static java.lang.String` | `[$lessinit$greater$default$2](#$lessinit$greater$default$2())()` |  |
	| `[Address](Address.html "class in akka.actor")` | `[address](#address())()` | The Address under which this path can be reached; walks up the tree to  the RootActorPath. |
	| `static [RootActorPath](RootActorPath.html "class in akka.actor")` | `[apply](#apply(akka.actor.Address,java.lang.String))​([Address](Address.html "class in akka.actor") address,  java.lang.String name)` |  |
	| `static java.lang.String` | `[apply$default$2](#apply$default$2())()` |  |
	| `boolean` | `[canEqual](#canEqual(java.lang.Object))​(java.lang.Object x$1)` |  |
	| `int` | `[compareTo](#compareTo(akka.actor.ActorPath))​([ActorPath](ActorPath.html "interface in akka.actor") other)` |  |
	| `[RootActorPath](RootActorPath.html "class in akka.actor")` | `[copy](#copy(akka.actor.Address,java.lang.String))​([Address](Address.html "class in akka.actor") address,  java.lang.String name)` |  |
	| `[Address](Address.html "class in akka.actor")` | `[copy$default$1](#copy$default$1())()` |  |
	| `java.lang.String` | `[copy$default$2](#copy$default$2())()` |  |
	| `scala.collection.immutable.Iterable<java.lang.String>` | `[elements](#elements())()` | Sequence of names for this path from root to this. |
	| `boolean` | `[equals](#equals(java.lang.Object))​(java.lang.Object x$1)` |  |
	| `int` | `[hashCode](#hashCode())()` |  |
	| `java.lang.String` | `[name](#name())()` | The name of the actor that this path refers to. |
	| `[ActorPath](ActorPath.html "interface in akka.actor")` | `[parent](#parent())()` | The path for the parent actor. |
	| `int` | `[productArity](#productArity())()` |  |
	| `java.lang.Object` | `[productElement](#productElement(int))​(int x$1)` |  |
	| `java.lang.String` | `[productElementName](#productElementName(int))​(int x$1)` |  |
	| `scala.collection.Iterator<java.lang.Object>` | `[productIterator](#productIterator())()` |  |
	| `java.lang.String` | `[productPrefix](#productPrefix())()` |  |
	| `[RootActorPath](RootActorPath.html "class in akka.actor")` | `[root](#root())()` | Walk up the tree to obtain and return the RootActorPath. |
	| `java.lang.String` | `[toSerializationFormat](#toSerializationFormat())()` | Generate full String representation including the  uid for the actor cell instance as URI fragment. |
	| `java.lang.String` | `[toSerializationFormatWithAddress](#toSerializationFormatWithAddress(akka.actor.Address))​([Address](Address.html "class in akka.actor") addr)` | Generate full String representation including the uid for the actor cell  instance as URI fragment, replacing the Address in the RootActor Path  with the given one unless this path\&rsquo;s address includes host and port  information. |
	| `java.lang.String` | `[toString](#toString())()` |  |
	| `java.lang.String` | `[toStringWithAddress](#toStringWithAddress(akka.actor.Address))​([Address](Address.html "class in akka.actor") addr)` | Generate String representation, replacing the Address in the RootActor  Path with the given one unless this path\&rsquo;s address includes host and port  information. |
	| `static scala.Option<scala.Tuple2<[Address](Address.html "class in akka.actor"),​java.lang.String>>` | `[unapply](#unapply(akka.actor.RootActorPath))​([RootActorPath](RootActorPath.html "class in akka.actor") x$0)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, finalize, getClass, notify, notifyAll, wait, wait, wait`
		- ### Methods inherited from interface akka.actor.[ActorPath](ActorPath.html "interface in akka.actor")
		
		
		`[$div](ActorPath.html#$div(scala.collection.Iterable)), [child](ActorPath.html#child(java.lang.String)), [descendant](ActorPath.html#descendant(java.lang.Iterable)), [getElements](ActorPath.html#getElements()), [toStringWithoutAddress](ActorPath.html#toStringWithoutAddress())`
		- ### Methods inherited from interface scala.Product
		
		
		`productElementNames`

- - ### Constructor Detail
	
	
	
		- #### RootActorPath
		
		
		
		```
		public RootActorPath​([Address](Address.html "class in akka.actor") address,
		                     java.lang.String name)
		```

	- ### Method Detail
	
	
	
		- #### $lessinit$greater$default$2
		
		
		
		```
		public static java.lang.String $lessinit$greater$default$2()
		```
		- #### apply
		
		
		
		```
		public static [RootActorPath](RootActorPath.html "class in akka.actor") apply​([Address](Address.html "class in akka.actor") address,
		                                  java.lang.String name)
		```
		- #### apply$default$2
		
		
		
		```
		public static java.lang.String apply$default$2()
		```
		- #### unapply
		
		
		
		```
		public static scala.Option<scala.Tuple2<[Address](Address.html "class in akka.actor"),​java.lang.String>> unapply​([RootActorPath](RootActorPath.html "class in akka.actor") x$0)
		```
		- #### address
		
		
		
		```
		public [Address](Address.html "class in akka.actor") address()
		```
		
		Description copied from interface: `[ActorPath](ActorPath.html#address())`
		The Address under which this path can be reached; walks up the tree to
		 the RootActorPath.
		
		Specified by:
		`[address](ActorPath.html#address())` in interface `[ActorPath](ActorPath.html "interface in akka.actor")`
		- #### name
		
		
		
		```
		public java.lang.String name()
		```
		
		Description copied from interface: `[ActorPath](ActorPath.html#name())`
		The name of the actor that this path refers to.
		
		Specified by:
		`[name](ActorPath.html#name())` in interface `[ActorPath](ActorPath.html "interface in akka.actor")`
		- #### parent
		
		
		
		```
		public [ActorPath](ActorPath.html "interface in akka.actor") parent()
		```
		
		Description copied from interface: `[ActorPath](ActorPath.html#parent())`
		The path for the parent actor.
		
		Specified by:
		`[parent](ActorPath.html#parent())` in interface `[ActorPath](ActorPath.html "interface in akka.actor")`
		- #### root
		
		
		
		```
		public [RootActorPath](RootActorPath.html "class in akka.actor") root()
		```
		
		Description copied from interface: `[ActorPath](ActorPath.html#root())`
		Walk up the tree to obtain and return the RootActorPath.
		
		Specified by:
		`[root](ActorPath.html#root())` in interface `[ActorPath](ActorPath.html "interface in akka.actor")`
		- #### $div
		
		
		
		```
		public [ActorPath](ActorPath.html "interface in akka.actor") $div​(java.lang.String child)
		```
		
		Description copied from interface: `[ActorPath](ActorPath.html#$div(java.lang.String))`
		Create a new child actor path.
		
		Specified by:
		`[$div](ActorPath.html#$div(java.lang.String))` in interface `[ActorPath](ActorPath.html "interface in akka.actor")`
		- #### elements
		
		
		
		```
		public scala.collection.immutable.Iterable<java.lang.String> elements()
		```
		
		Description copied from interface: `[ActorPath](ActorPath.html#elements())`
		Sequence of names for this path from root to this. Performance implication: has to allocate a list.
		
		Specified by:
		`[elements](ActorPath.html#elements())` in interface `[ActorPath](ActorPath.html "interface in akka.actor")`
		- #### toString
		
		
		
		```
		public java.lang.String toString()
		```
		
		
		Overrides:
		`toString` in class `java.lang.Object`
		- #### toSerializationFormat
		
		
		
		```
		public java.lang.String toSerializationFormat()
		```
		
		Description copied from interface: `[ActorPath](ActorPath.html#toSerializationFormat())`
		Generate full String representation including the
		 uid for the actor cell instance as URI fragment.
		 This representation should be used as serialized
		 representation instead of `toString`.
		
		Specified by:
		`[toSerializationFormat](ActorPath.html#toSerializationFormat())` in interface `[ActorPath](ActorPath.html "interface in akka.actor")`
		- #### toStringWithAddress
		
		
		
		```
		public java.lang.String toStringWithAddress​([Address](Address.html "class in akka.actor") addr)
		```
		
		Description copied from interface: `[ActorPath](ActorPath.html#toStringWithAddress(akka.actor.Address))`
		Generate String representation, replacing the Address in the RootActor
		 Path with the given one unless this path\&rsquo;s address includes host and port
		 information.
		
		Specified by:
		`[toStringWithAddress](ActorPath.html#toStringWithAddress(akka.actor.Address))` in interface `[ActorPath](ActorPath.html "interface in akka.actor")`
		- #### toSerializationFormatWithAddress
		
		
		
		```
		public java.lang.String toSerializationFormatWithAddress​([Address](Address.html "class in akka.actor") addr)
		```
		
		Description copied from interface: `[ActorPath](ActorPath.html#toSerializationFormatWithAddress(akka.actor.Address))`
		Generate full String representation including the uid for the actor cell
		 instance as URI fragment, replacing the Address in the RootActor Path
		 with the given one unless this path\&rsquo;s address includes host and port
		 information. This representation should be used as serialized
		 representation instead of `toStringWithAddress`.
		
		Specified by:
		`[toSerializationFormatWithAddress](ActorPath.html#toSerializationFormatWithAddress(akka.actor.Address))` in interface `[ActorPath](ActorPath.html "interface in akka.actor")`
		- #### compareTo
		
		
		
		```
		public int compareTo​([ActorPath](ActorPath.html "interface in akka.actor") other)
		```
		
		
		Specified by:
		`compareTo` in interface `java.lang.Comparable<[ActorPath](ActorPath.html "interface in akka.actor")>`
		- #### copy
		
		
		
		```
		public [RootActorPath](RootActorPath.html "class in akka.actor") copy​([Address](Address.html "class in akka.actor") address,
		                          java.lang.String name)
		```
		- #### copy$default$1
		
		
		
		```
		public [Address](Address.html "class in akka.actor") copy$default$1()
		```
		- #### copy$default$2
		
		
		
		```
		public java.lang.String copy$default$2()
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

- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/ActorPath.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/Address.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/RootActorPath.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10.17/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/RootActorPath.html](https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/RootActorPath.html)*