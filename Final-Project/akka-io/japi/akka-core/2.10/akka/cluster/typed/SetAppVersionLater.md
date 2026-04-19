---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:19:52Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/cluster/typed/SetAppVersionLater.html
title: SetAppVersionLater
---

# SetAppVersionLater

## Content

Package [akka.cluster.typed](package-summary.html)
## Class SetAppVersionLater

- java.lang.Object
- - akka.cluster.typed.SetAppVersionLater

- All Implemented Interfaces:
`[ClusterCommand](ClusterCommand.html "interface in akka.cluster.typed")`, `java.io.Serializable`, `scala.Equals`, `scala.Product`

---

```
public final class SetAppVersionLater
extends java.lang.Object
implements [ClusterCommand](ClusterCommand.html "interface in akka.cluster.typed"), scala.Product, java.io.Serializable
```

Scala API: If the `appVersion` is read from an external system (e.g. Kubernetes) it can be defined after
 system startup but before joining by completing the `appVersion` `Future`. In that case,
 `SetAppVersionLater` should be sent before [`Join`](Join.html "class in akka.cluster.typed") or [`JoinSeedNodes`](JoinSeedNodes.html "class in akka.cluster.typed") It's fine to send
 `Join` or `JoinSeedNodes` immediately afterwards (before the `Future` is completed. The join will
 then wait for the `appVersion` to be completed.

See Also:
[Serialized Form](../../../serialized-form.html#akka.cluster.typed.SetAppVersionLater)

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[SetAppVersionLater](#%3Cinit%3E(scala.concurrent.Future))​(scala.concurrent.Future<[Version](../../util/Version.html "class in akka.util")> appVersion)` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `static [SetAppVersionLater](SetAppVersionLater.html "class in akka.cluster.typed")` | `[apply](#apply(scala.concurrent.Future))​(scala.concurrent.Future<[Version](../../util/Version.html "class in akka.util")> appVersion)` |  |
	| `scala.concurrent.Future<[Version](../../util/Version.html "class in akka.util")>` | `[appVersion](#appVersion())()` |  |
	| `boolean` | `[canEqual](#canEqual(java.lang.Object))​(java.lang.Object x$1)` |  |
	| `[SetAppVersionLater](SetAppVersionLater.html "class in akka.cluster.typed")` | `[copy](#copy(scala.concurrent.Future))​(scala.concurrent.Future<[Version](../../util/Version.html "class in akka.util")> appVersion)` |  |
	| `scala.concurrent.Future<[Version](../../util/Version.html "class in akka.util")>` | `[copy$default$1](#copy$default$1())()` |  |
	| `static [SetAppVersionLater](SetAppVersionLater.html "class in akka.cluster.typed")` | `[create](#create(java.util.concurrent.CompletionStage))​(java.util.concurrent.CompletionStage<[Version](../../util/Version.html "class in akka.util")> appVersion)` | Java API: If the `appVersion` is read from an external system (e.g. |
	| `boolean` | `[equals](#equals(java.lang.Object))​(java.lang.Object x$1)` |  |
	| `int` | `[hashCode](#hashCode())()` |  |
	| `int` | `[productArity](#productArity())()` |  |
	| `java.lang.Object` | `[productElement](#productElement(int))​(int x$1)` |  |
	| `java.lang.String` | `[productElementName](#productElementName(int))​(int x$1)` |  |
	| `scala.collection.Iterator<java.lang.Object>` | `[productIterator](#productIterator())()` |  |
	| `java.lang.String` | `[productPrefix](#productPrefix())()` |  |
	| `java.lang.String` | `[toString](#toString())()` |  |
	| `static scala.Option<scala.concurrent.Future<[Version](../../util/Version.html "class in akka.util")>>` | `[unapply](#unapply(akka.cluster.typed.SetAppVersionLater))​([SetAppVersionLater](SetAppVersionLater.html "class in akka.cluster.typed") x$0)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, finalize, getClass, notify, notifyAll, wait, wait, wait`
		- ### Methods inherited from interface scala.Product
		
		
		`productElementNames`

- - ### Constructor Detail
	
	
	
		- #### SetAppVersionLater
		
		
		
		```
		public SetAppVersionLater​(scala.concurrent.Future<[Version](../../util/Version.html "class in akka.util")> appVersion)
		```

	- ### Method Detail
	
	
	
		- #### create
		
		
		
		```
		public static [SetAppVersionLater](SetAppVersionLater.html "class in akka.cluster.typed") create​(java.util.concurrent.CompletionStage<[Version](../../util/Version.html "class in akka.util")> appVersion)
		```
		
		Java API: If the `appVersion` is read from an external system (e.g. Kubernetes) it can be defined after
		 system startup but before joining by completing the `appVersion` `CompletionStage`. In that case,
		 `SetAppVersionLater` should be sent before [`Join`](Join.html "class in akka.cluster.typed") or [`JoinSeedNodes`](JoinSeedNodes.html "class in akka.cluster.typed") It's fine to send
		 `Join` or `JoinSeedNodes` immediately afterwards (before the `CompletionStage` is completed. The join will
		 then wait for the `appVersion` to be completed.
		- #### apply
		
		
		
		```
		public static [SetAppVersionLater](SetAppVersionLater.html "class in akka.cluster.typed") apply​(scala.concurrent.Future<[Version](../../util/Version.html "class in akka.util")> appVersion)
		```
		- #### unapply
		
		
		
		```
		public static scala.Option<scala.concurrent.Future<[Version](../../util/Version.html "class in akka.util")>> unapply​([SetAppVersionLater](SetAppVersionLater.html "class in akka.cluster.typed") x$0)
		```
		- #### appVersion
		
		
		
		```
		public scala.concurrent.Future<[Version](../../util/Version.html "class in akka.util")> appVersion()
		```
		- #### copy
		
		
		
		```
		public [SetAppVersionLater](SetAppVersionLater.html "class in akka.cluster.typed") copy​(scala.concurrent.Future<[Version](../../util/Version.html "class in akka.util")> appVersion)
		```
		- #### copy$default$1
		
		
		
		```
		public scala.concurrent.Future<[Version](../../util/Version.html "class in akka.util")> copy$default$1()
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

- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/typed/ClusterCommand.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/typed/Join.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/typed/JoinSeedNodes.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/typed/SetAppVersionLater.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/typed/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10/akka/util/Version.html
- https://doc.akka.io/japi/akka-core/2.10/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/cluster/typed/SetAppVersionLater.html](https://doc.akka.io/japi/akka-core/2.10/akka/cluster/typed/SetAppVersionLater.html)*