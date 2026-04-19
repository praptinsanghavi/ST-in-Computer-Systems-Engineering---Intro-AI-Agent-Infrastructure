---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T16:00:46Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/actor/testkit/typed/scaladsl/SerializationTestKit.html
title: SerializationTestKit
---

# SerializationTestKit

## Content

Package [akka.actor.testkit.typed.scaladsl](package-summary.html)
## Class SerializationTestKit

- java.lang.Object
- - akka.actor.testkit.typed.scaladsl.SerializationTestKit

- ---

```
public class SerializationTestKit
extends java.lang.Object
```

Utilities to test serialization.

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[SerializationTestKit](#%3Cinit%3E(akka.actor.typed.ActorSystem))​([ActorSystem](../../../typed/ActorSystem.html "class in akka.actor.typed")<?> system)` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `<M> M` | `[verifySerialization](#verifySerialization(M))​(M obj)` | Verify serialization roundtrip. |
	| `<M> M` | `[verifySerialization](#verifySerialization(M,boolean))​(M obj,  boolean assertEquality)` | Verify serialization roundtrip. |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### SerializationTestKit
		
		
		
		```
		public SerializationTestKit​([ActorSystem](../../../typed/ActorSystem.html "class in akka.actor.typed")<?> system)
		```

	- ### Method Detail
	
	
	
		- #### verifySerialization
		
		
		
		```
		public <M> M verifySerialization​(M obj)
		```
		
		Verify serialization roundtrip.
		 Throws exception from serializer if `obj` can't be serialized and deserialized.
		 Also tests that the deserialized object is equal to `obj`, and if not an
		 `AssertionError` is thrown.
		 
		
		Parameters:
		`obj` \- the object to verify
		Returns:
		the deserialized object
		- #### verifySerialization
		
		
		
		```
		public <M> M verifySerialization​(M obj,
		                                 boolean assertEquality)
		```
		
		Verify serialization roundtrip.
		 Throws exception from serializer if `obj` can't be serialized and deserialized.
		 
		
		Parameters:
		`obj` \- the object to verify
		`assertEquality` \- if `true` the deserialized object is verified to be equal to `obj`,
		 and if not an `AssertionError` is thrown
		Returns:
		the deserialized object

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/actor/testkit/typed/scaladsl/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/ActorSystem.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/actor/testkit/typed/scaladsl/SerializationTestKit.html](https://doc.akka.io/japi/akka-core/2.10/akka/actor/testkit/typed/scaladsl/SerializationTestKit.html)*