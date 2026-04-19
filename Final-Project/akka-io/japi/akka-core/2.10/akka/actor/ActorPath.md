---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:31:51Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/actor/ActorPath.html
title: ActorPath
---

# ActorPath

## Content

Package [akka.actor](package-summary.html)
## Interface ActorPath

- All Superinterfaces:
`java.lang.Comparable<[ActorPath](ActorPath.html "interface in akka.actor")>`, `java.io.Serializable`

All Known Implementing Classes:
`[ChildActorPath](ChildActorPath.html "class in akka.actor")`, `[RootActorPath](RootActorPath.html "class in akka.actor")`

---

```
public interface ActorPath
extends java.lang.Comparable<[ActorPath](ActorPath.html "interface in akka.actor")>, java.io.Serializable
```

Actor path is a unique path to an actor that shows the creation path
 up through the actor tree to the root actor.
 
 ActorPath defines a natural ordering (so that ActorRefs can be put into
 collections with this requirement); this ordering is intended to be as fast
 as possible, which owing to the bottom\-up recursive nature of ActorPath
 is sorted by path elements FROM RIGHT TO LEFT, where RootActorPath \>
 ChildActorPath in case the number of elements is different.
 

 Two actor paths are compared equal when they have the same name and parent
 elements, including the root address information. That does not necessarily
 mean that they point to the same incarnation of the actor if the actor is
 re\-created with the same path. In other words, in contrast to how actor
 references are compared the unique id of the actor is not taken into account
 when comparing actor paths.

- - ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `[ActorPath](ActorPath.html "interface in akka.actor")` | `[$div](#$div(java.lang.String))​(java.lang.String child)` | Create a new child actor path. |
	| `[ActorPath](ActorPath.html "interface in akka.actor")` | `[$div](#$div(scala.collection.Iterable))​(scala.collection.Iterable<java.lang.String> child)` | Recursively create a descendant\&rsquo;s path by appending all child names. |
	| `[Address](Address.html "class in akka.actor")` | `[address](#address())()` | The Address under which this path can be reached; walks up the tree to  the RootActorPath. |
	| `[ActorPath](ActorPath.html "interface in akka.actor")` | `[child](#child(java.lang.String))​(java.lang.String child)` | Java API: Create a new child actor path. |
	| `[ActorPath](ActorPath.html "interface in akka.actor")` | `[descendant](#descendant(java.lang.Iterable))​(java.lang.Iterable<java.lang.String> names)` | Java API: Recursively create a descendant\&rsquo;s path by appending all child names. |
	| `scala.collection.immutable.Iterable<java.lang.String>` | `[elements](#elements())()` | Sequence of names for this path from root to this. |
	| `java.lang.Iterable<java.lang.String>` | `[getElements](#getElements())()` | Java API: Sequence of names for this path from root to this. |
	| `java.lang.String` | `[name](#name())()` | The name of the actor that this path refers to. |
	| `[ActorPath](ActorPath.html "interface in akka.actor")` | `[parent](#parent())()` | The path for the parent actor. |
	| `[RootActorPath](RootActorPath.html "class in akka.actor")` | `[root](#root())()` | Walk up the tree to obtain and return the RootActorPath. |
	| `java.lang.String` | `[toSerializationFormat](#toSerializationFormat())()` | Generate full String representation including the  uid for the actor cell instance as URI fragment. |
	| `java.lang.String` | `[toSerializationFormatWithAddress](#toSerializationFormatWithAddress(akka.actor.Address))​([Address](Address.html "class in akka.actor") address)` | Generate full String representation including the uid for the actor cell  instance as URI fragment, replacing the Address in the RootActor Path  with the given one unless this path\&rsquo;s address includes host and port  information. |
	| `java.lang.String` | `[toStringWithAddress](#toStringWithAddress(akka.actor.Address))​([Address](Address.html "class in akka.actor") address)` | Generate String representation, replacing the Address in the RootActor  Path with the given one unless this path\&rsquo;s address includes host and port  information. |
	| `java.lang.String` | `[toStringWithoutAddress](#toStringWithoutAddress())()` | String representation of the path elements, excluding the address  information. |
	| `int` | `[uid](#uid())()` | INTERNAL API  Unique identifier of the actor. |
	| `[ActorPath](ActorPath.html "interface in akka.actor")` | `[withUid](#withUid(int))​(int uid)` | INTERNAL API  Creates a new ActorPath with same elements but with the specified `uid`. |
	
	
		- ### Methods inherited from interface java.lang.Comparable
		
		
		`compareTo`

- - ### Method Detail
	
	
	
		- #### address
		
		
		
		```
		[Address](Address.html "class in akka.actor") address()
		```
		
		The Address under which this path can be reached; walks up the tree to
		 the RootActorPath.
		- #### name
		
		
		
		```
		java.lang.String name()
		```
		
		The name of the actor that this path refers to.
		- #### parent
		
		
		
		```
		[ActorPath](ActorPath.html "interface in akka.actor") parent()
		```
		
		The path for the parent actor.
		- #### $div
		
		
		
		```
		[ActorPath](ActorPath.html "interface in akka.actor") $div​(java.lang.String child)
		```
		
		Create a new child actor path.
		- #### child
		
		
		
		```
		[ActorPath](ActorPath.html "interface in akka.actor") child​(java.lang.String child)
		```
		
		Java API: Create a new child actor path.
		- #### $div
		
		
		
		```
		[ActorPath](ActorPath.html "interface in akka.actor") $div​(scala.collection.Iterable<java.lang.String> child)
		```
		
		Recursively create a descendant\&rsquo;s path by appending all child names.
		- #### descendant
		
		
		
		```
		[ActorPath](ActorPath.html "interface in akka.actor") descendant​(java.lang.Iterable<java.lang.String> names)
		```
		
		Java API: Recursively create a descendant\&rsquo;s path by appending all child names.
		- #### elements
		
		
		
		```
		scala.collection.immutable.Iterable<java.lang.String> elements()
		```
		
		Sequence of names for this path from root to this. Performance implication: has to allocate a list.
		- #### getElements
		
		
		
		```
		java.lang.Iterable<java.lang.String> getElements()
		```
		
		Java API: Sequence of names for this path from root to this. Performance implication: has to allocate a list.
		- #### root
		
		
		
		```
		[RootActorPath](RootActorPath.html "class in akka.actor") root()
		```
		
		Walk up the tree to obtain and return the RootActorPath.
		- #### toStringWithoutAddress
		
		
		
		```
		java.lang.String toStringWithoutAddress()
		```
		
		String representation of the path elements, excluding the address
		 information. The elements are separated with "/" and starts with "/",
		 e.g. "/user/a/b".
		- #### toStringWithAddress
		
		
		
		```
		java.lang.String toStringWithAddress​([Address](Address.html "class in akka.actor") address)
		```
		
		Generate String representation, replacing the Address in the RootActor
		 Path with the given one unless this path\&rsquo;s address includes host and port
		 information.
		- #### toSerializationFormat
		
		
		
		```
		java.lang.String toSerializationFormat()
		```
		
		Generate full String representation including the
		 uid for the actor cell instance as URI fragment.
		 This representation should be used as serialized
		 representation instead of `toString`.
		- #### toSerializationFormatWithAddress
		
		
		
		```
		java.lang.String toSerializationFormatWithAddress​([Address](Address.html "class in akka.actor") address)
		```
		
		Generate full String representation including the uid for the actor cell
		 instance as URI fragment, replacing the Address in the RootActor Path
		 with the given one unless this path\&rsquo;s address includes host and port
		 information. This representation should be used as serialized
		 representation instead of `toStringWithAddress`.
		- #### uid
		
		
		
		```
		int uid()
		```
		
		INTERNAL API
		 Unique identifier of the actor. Used for distinguishing
		 different incarnations of actors with same path (name elements).
		- #### withUid
		
		
		
		```
		[ActorPath](ActorPath.html "interface in akka.actor") withUid​(int uid)
		```
		
		INTERNAL API
		 Creates a new ActorPath with same elements but with the specified `uid`.

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/actor/ActorPath.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/Address.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/ChildActorPath.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/RootActorPath.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/actor/ActorPath.html](https://doc.akka.io/japi/akka-core/2.10/akka/actor/ActorPath.html)*