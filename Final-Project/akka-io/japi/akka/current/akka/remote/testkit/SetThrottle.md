---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:38:05Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/remote/testkit/SetThrottle.html
title: SetThrottle
---

# SetThrottle

## Content

Package [akka.remote.testkit](package-summary.html)
## Class SetThrottle

- java.lang.Object
- - akka.remote.testkit.SetThrottle

- All Implemented Interfaces:
`java.io.Serializable`, `scala.Equals`, `scala.Product`

---

```
public final class SetThrottle
extends java.lang.Object
implements scala.Product, java.io.Serializable
```

See Also:
[Serialized Form](../../../serialized-form.html#akka.remote.testkit.SetThrottle)

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[SetThrottle](#%3Cinit%3E(akka.actor.Address,akka.remote.testkit.Direction,akka.remote.testkit.ThrottleMode))​([Address](../../actor/Address.html "class in akka.actor") address,  [Direction](Direction.html "interface in akka.remote.testkit") direction,  [ThrottleMode](ThrottleMode.html "interface in akka.remote.testkit") mode)` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[Address](../../actor/Address.html "class in akka.actor")` | `[address](#address())()` |  |
	| `static [SetThrottle](SetThrottle.html "class in akka.remote.testkit")` | `[apply](#apply(akka.actor.Address,akka.remote.testkit.Direction,akka.remote.testkit.ThrottleMode))​([Address](../../actor/Address.html "class in akka.actor") address,  [Direction](Direction.html "interface in akka.remote.testkit") direction,  [ThrottleMode](ThrottleMode.html "interface in akka.remote.testkit") mode)` |  |
	| `boolean` | `[canEqual](#canEqual(java.lang.Object))​(java.lang.Object x$1)` |  |
	| `[SetThrottle](SetThrottle.html "class in akka.remote.testkit")` | `[copy](#copy(akka.actor.Address,akka.remote.testkit.Direction,akka.remote.testkit.ThrottleMode))​([Address](../../actor/Address.html "class in akka.actor") address,  [Direction](Direction.html "interface in akka.remote.testkit") direction,  [ThrottleMode](ThrottleMode.html "interface in akka.remote.testkit") mode)` |  |
	| `[Address](../../actor/Address.html "class in akka.actor")` | `[copy$default$1](#copy$default$1())()` |  |
	| `[Direction](Direction.html "interface in akka.remote.testkit")` | `[copy$default$2](#copy$default$2())()` |  |
	| `[ThrottleMode](ThrottleMode.html "interface in akka.remote.testkit")` | `[copy$default$3](#copy$default$3())()` |  |
	| `[Direction](Direction.html "interface in akka.remote.testkit")` | `[direction](#direction())()` |  |
	| `boolean` | `[equals](#equals(java.lang.Object))​(java.lang.Object x$1)` |  |
	| `int` | `[hashCode](#hashCode())()` |  |
	| `[ThrottleMode](ThrottleMode.html "interface in akka.remote.testkit")` | `[mode](#mode())()` |  |
	| `int` | `[productArity](#productArity())()` |  |
	| `java.lang.Object` | `[productElement](#productElement(int))​(int x$1)` |  |
	| `java.lang.String` | `[productElementName](#productElementName(int))​(int x$1)` |  |
	| `scala.collection.Iterator<java.lang.Object>` | `[productIterator](#productIterator())()` |  |
	| `java.lang.String` | `[productPrefix](#productPrefix())()` |  |
	| `java.lang.String` | `[toString](#toString())()` |  |
	| `static scala.Option<scala.Tuple3<[Address](../../actor/Address.html "class in akka.actor"),​[Direction](Direction.html "interface in akka.remote.testkit"),​[ThrottleMode](ThrottleMode.html "interface in akka.remote.testkit")>>` | `[unapply](#unapply(akka.remote.testkit.SetThrottle))​([SetThrottle](SetThrottle.html "class in akka.remote.testkit") x$0)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, finalize, getClass, notify, notifyAll, wait, wait, wait`
		- ### Methods inherited from interface scala.Product
		
		
		`productElementNames`

- - ### Constructor Detail
	
	
	
		- #### SetThrottle
		
		
		
		```
		public SetThrottle​([Address](../../actor/Address.html "class in akka.actor") address,
		                   [Direction](Direction.html "interface in akka.remote.testkit") direction,
		                   [ThrottleMode](ThrottleMode.html "interface in akka.remote.testkit") mode)
		```

	- ### Method Detail
	
	
	
		- #### apply
		
		
		
		```
		public static [SetThrottle](SetThrottle.html "class in akka.remote.testkit") apply​([Address](../../actor/Address.html "class in akka.actor") address,
		                                [Direction](Direction.html "interface in akka.remote.testkit") direction,
		                                [ThrottleMode](ThrottleMode.html "interface in akka.remote.testkit") mode)
		```
		- #### unapply
		
		
		
		```
		public static scala.Option<scala.Tuple3<[Address](../../actor/Address.html "class in akka.actor"),​[Direction](Direction.html "interface in akka.remote.testkit"),​[ThrottleMode](ThrottleMode.html "interface in akka.remote.testkit")>> unapply​([SetThrottle](SetThrottle.html "class in akka.remote.testkit") x$0)
		```
		- #### address
		
		
		
		```
		public [Address](../../actor/Address.html "class in akka.actor") address()
		```
		- #### direction
		
		
		
		```
		public [Direction](Direction.html "interface in akka.remote.testkit") direction()
		```
		- #### mode
		
		
		
		```
		public [ThrottleMode](ThrottleMode.html "interface in akka.remote.testkit") mode()
		```
		- #### copy
		
		
		
		```
		public [SetThrottle](SetThrottle.html "class in akka.remote.testkit") copy​([Address](../../actor/Address.html "class in akka.actor") address,
		                        [Direction](Direction.html "interface in akka.remote.testkit") direction,
		                        [ThrottleMode](ThrottleMode.html "interface in akka.remote.testkit") mode)
		```
		- #### copy$default$1
		
		
		
		```
		public [Address](../../actor/Address.html "class in akka.actor") copy$default$1()
		```
		- #### copy$default$2
		
		
		
		```
		public [Direction](Direction.html "interface in akka.remote.testkit") copy$default$2()
		```
		- #### copy$default$3
		
		
		
		```
		public [ThrottleMode](ThrottleMode.html "interface in akka.remote.testkit") copy$default$3()
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

- https://doc.akka.io/japi/akka/current/akka/actor/Address.html
- https://doc.akka.io/japi/akka/current/akka/remote/testkit/Direction.html
- https://doc.akka.io/japi/akka/current/akka/remote/testkit/SetThrottle.html
- https://doc.akka.io/japi/akka/current/akka/remote/testkit/ThrottleMode.html
- https://doc.akka.io/japi/akka/current/akka/remote/testkit/package-summary.html
- https://doc.akka.io/japi/akka/current/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/remote/testkit/SetThrottle.html](https://doc.akka.io/japi/akka/current/akka/remote/testkit/SetThrottle.html)*