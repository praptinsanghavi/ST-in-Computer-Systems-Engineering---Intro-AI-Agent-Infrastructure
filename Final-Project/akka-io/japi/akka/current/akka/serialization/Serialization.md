---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:39:59Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/serialization/Serialization.Information.html
title: Serialization.Information
---

# Serialization.Information

## Content

Package [akka.serialization](package-summary.html)
## Class Serialization.Information

- java.lang.Object
- - akka.serialization.Serialization.Information

- All Implemented Interfaces:
`java.io.Serializable`, `scala.Equals`, `scala.Product`

Enclosing class:
[Serialization](Serialization.html "class in akka.serialization")

---

```
public static final class Serialization.Information
extends java.lang.Object
implements scala.Product, java.io.Serializable
```

Serialization information needed for serializing local actor refs,
 or if serializer library e.g. custom serializer/deserializer in Jackson need
 access to the current `ActorSystem`.

See Also:
[Serialized Form](../../serialized-form.html#akka.serialization.Serialization.Information)

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[Information](#%3Cinit%3E(akka.actor.Address,akka.actor.ActorSystem))​([Address](../actor/Address.html "class in akka.actor") address,  [ActorSystem](../actor/ActorSystem.html "class in akka.actor") system)` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[Address](../actor/Address.html "class in akka.actor")` | `[address](#address())()` |  |
	| `boolean` | `[canEqual](#canEqual(java.lang.Object))​(java.lang.Object x$1)` |  |
	| `[Serialization.Information](Serialization.Information.html "class in akka.serialization")` | `[copy](#copy(akka.actor.Address,akka.actor.ActorSystem))​([Address](../actor/Address.html "class in akka.actor") address,  [ActorSystem](../actor/ActorSystem.html "class in akka.actor") system)` |  |
	| `[Address](../actor/Address.html "class in akka.actor")` | `[copy$default$1](#copy$default$1())()` |  |
	| `[ActorSystem](../actor/ActorSystem.html "class in akka.actor")` | `[copy$default$2](#copy$default$2())()` |  |
	| `boolean` | `[equals](#equals(java.lang.Object))​(java.lang.Object x$1)` |  |
	| `int` | `[hashCode](#hashCode())()` |  |
	| `int` | `[productArity](#productArity())()` |  |
	| `java.lang.Object` | `[productElement](#productElement(int))​(int x$1)` |  |
	| `java.lang.String` | `[productElementName](#productElementName(int))​(int x$1)` |  |
	| `scala.collection.Iterator<java.lang.Object>` | `[productIterator](#productIterator())()` |  |
	| `java.lang.String` | `[productPrefix](#productPrefix())()` |  |
	| `[ActorSystem](../actor/ActorSystem.html "class in akka.actor")` | `[system](#system())()` |  |
	| `java.lang.String` | `[toString](#toString())()` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, finalize, getClass, notify, notifyAll, wait, wait, wait`
		- ### Methods inherited from interface scala.Product
		
		
		`productElementNames`

- - ### Constructor Detail
	
	
	
		- #### Information
		
		
		
		```
		public Information​([Address](../actor/Address.html "class in akka.actor") address,
		                   [ActorSystem](../actor/ActorSystem.html "class in akka.actor") system)
		```

	- ### Method Detail
	
	
	
		- #### address
		
		
		
		```
		public [Address](../actor/Address.html "class in akka.actor") address()
		```
		- #### system
		
		
		
		```
		public [ActorSystem](../actor/ActorSystem.html "class in akka.actor") system()
		```
		- #### copy
		
		
		
		```
		public [Serialization.Information](Serialization.Information.html "class in akka.serialization") copy​([Address](../actor/Address.html "class in akka.actor") address,
		                                      [ActorSystem](../actor/ActorSystem.html "class in akka.actor") system)
		```
		- #### copy$default$1
		
		
		
		```
		public [Address](../actor/Address.html "class in akka.actor") copy$default$1()
		```
		- #### copy$default$2
		
		
		
		```
		public [ActorSystem](../actor/ActorSystem.html "class in akka.actor") copy$default$2()
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

- https://doc.akka.io/japi/akka/current/akka/actor/ActorSystem.html
- https://doc.akka.io/japi/akka/current/akka/actor/Address.html
- https://doc.akka.io/japi/akka/current/akka/serialization/Serialization.Information.html
- https://doc.akka.io/japi/akka/current/akka/serialization/Serialization.html
- https://doc.akka.io/japi/akka/current/akka/serialization/package-summary.html
- https://doc.akka.io/japi/akka/current/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/serialization/Serialization.Information.html](https://doc.akka.io/japi/akka/current/akka/serialization/Serialization.Information.html)*