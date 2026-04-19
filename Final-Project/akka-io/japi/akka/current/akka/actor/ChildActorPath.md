---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T20:50:09Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/actor/ChildActorPath.html
title: ChildActorPath
---

# ChildActorPath

## Content

Package [akka.actor](package-summary.html)
## Class ChildActorPath

- java.lang.Object
- - akka.actor.ChildActorPath

- All Implemented Interfaces:
`[ActorPath](ActorPath.html "interface in akka.actor")`, `java.io.Serializable`, `java.lang.Comparable<[ActorPath](ActorPath.html "interface in akka.actor")>`

---

```
public final class ChildActorPath
extends java.lang.Object
implements [ActorPath](ActorPath.html "interface in akka.actor")
```

Not for user instantiation

See Also:
[Serialized Form](../../serialized-form.html#akka.actor.ChildActorPath)

- - ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[ActorPath](ActorPath.html "interface in akka.actor")` | `[$div](#$div(java.lang.String))​(java.lang.String child)` | Create a new child actor path. |
	| `[Address](Address.html "class in akka.actor")` | `[address](#address())()` | The Address under which this path can be reached; walks up the tree to  the RootActorPath. |
	| `int` | `[compareTo](#compareTo(akka.actor.ActorPath))​([ActorPath](ActorPath.html "interface in akka.actor") other)` |  |
	| `scala.collection.immutable.Iterable<java.lang.String>` | `[elements](#elements())()` | Sequence of names for this path from root to this. |
	| `boolean` | `[equals](#equals(java.lang.Object))​(java.lang.Object other)` |  |
	| `int` | `[hashCode](#hashCode())()` |  |
	| `java.lang.String` | `[name](#name())()` | The name of the actor that this path refers to. |
	| `[ActorPath](ActorPath.html "interface in akka.actor")` | `[parent](#parent())()` | The path for the parent actor. |
	| `[RootActorPath](RootActorPath.html "class in akka.actor")` | `[root](#root())()` | Walk up the tree to obtain and return the RootActorPath. |
	| `java.lang.String` | `[toSerializationFormat](#toSerializationFormat())()` | Generate full String representation including the  uid for the actor cell instance as URI fragment. |
	| `java.lang.String` | `[toSerializationFormatWithAddress](#toSerializationFormatWithAddress(akka.actor.Address))​([Address](Address.html "class in akka.actor") addr)` | Generate full String representation including the uid for the actor cell  instance as URI fragment, replacing the Address in the RootActor Path  with the given one unless this path\&rsquo;s address includes host and port  information. |
	| `java.lang.String` | `[toString](#toString())()` |  |
	| `java.lang.String` | `[toStringWithAddress](#toStringWithAddress(akka.actor.Address))​([Address](Address.html "class in akka.actor") addr)` | Generate String representation, replacing the Address in the RootActor  Path with the given one unless this path\&rsquo;s address includes host and port  information. |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, finalize, getClass, notify, notifyAll, wait, wait, wait`
		- ### Methods inherited from interface akka.actor.[ActorPath](ActorPath.html "interface in akka.actor")
		
		
		`[$div](ActorPath.html#$div(scala.collection.Iterable)), [child](ActorPath.html#child(java.lang.String)), [descendant](ActorPath.html#descendant(java.lang.Iterable)), [getElements](ActorPath.html#getElements()), [toStringWithoutAddress](ActorPath.html#toStringWithoutAddress())`

- - ### Method Detail
	
	
	
		- #### $div
		
		
		
		```
		public [ActorPath](ActorPath.html "interface in akka.actor") $div​(java.lang.String child)
		```
		
		Description copied from interface: `[ActorPath](ActorPath.html#$div(java.lang.String))`
		Create a new child actor path.
		
		Specified by:
		`[$div](ActorPath.html#$div(java.lang.String))` in interface `[ActorPath](ActorPath.html "interface in akka.actor")`
		- #### address
		
		
		
		```
		public [Address](Address.html "class in akka.actor") address()
		```
		
		Description copied from interface: `[ActorPath](ActorPath.html#address())`
		The Address under which this path can be reached; walks up the tree to
		 the RootActorPath.
		
		Specified by:
		`[address](ActorPath.html#address())` in interface `[ActorPath](ActorPath.html "interface in akka.actor")`
		- #### compareTo
		
		
		
		```
		public int compareTo​([ActorPath](ActorPath.html "interface in akka.actor") other)
		```
		
		
		Specified by:
		`compareTo` in interface `java.lang.Comparable<[ActorPath](ActorPath.html "interface in akka.actor")>`
		- #### elements
		
		
		
		```
		public scala.collection.immutable.Iterable<java.lang.String> elements()
		```
		
		Description copied from interface: `[ActorPath](ActorPath.html#elements())`
		Sequence of names for this path from root to this. Performance implication: has to allocate a list.
		
		Specified by:
		`[elements](ActorPath.html#elements())` in interface `[ActorPath](ActorPath.html "interface in akka.actor")`
		- #### equals
		
		
		
		```
		public boolean equals​(java.lang.Object other)
		```
		
		
		Overrides:
		`equals` in class `java.lang.Object`
		- #### hashCode
		
		
		
		```
		public int hashCode()
		```
		
		
		Overrides:
		`hashCode` in class `java.lang.Object`
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
		- #### toString
		
		
		
		```
		public java.lang.String toString()
		```
		
		
		Overrides:
		`toString` in class `java.lang.Object`
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

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/actor/ActorPath.html
- https://doc.akka.io/japi/akka/current/akka/actor/Address.html
- https://doc.akka.io/japi/akka/current/akka/actor/RootActorPath.html
- https://doc.akka.io/japi/akka/current/akka/actor/package-summary.html
- https://doc.akka.io/japi/akka/current/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/actor/ChildActorPath.html](https://doc.akka.io/japi/akka/current/akka/actor/ChildActorPath.html)*