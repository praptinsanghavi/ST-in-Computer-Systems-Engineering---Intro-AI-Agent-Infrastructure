---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:12:48Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/cluster/typed/SetAppVersionLater$.html
title: SetAppVersionLater$
---

# SetAppVersionLater$

## Content

Package [akka.cluster.typed](package-summary.html)
## Class SetAppVersionLater$

- java.lang.Object
- - akka.cluster.typed.SetAppVersionLater$

- All Implemented Interfaces:
`java.io.Serializable`

---

```
public class SetAppVersionLater$
extends java.lang.Object
implements java.io.Serializable
```

See Also:
[Serialized Form](../../../serialized-form.html#akka.cluster.typed.SetAppVersionLater$)

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [SetAppVersionLater$](SetAppVersionLater$.html "class in akka.cluster.typed")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[SetAppVersionLater$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[SetAppVersionLater](SetAppVersionLater.html "class in akka.cluster.typed")` | `[apply](#apply(scala.concurrent.Future))​(scala.concurrent.Future<[Version](../../util/Version.html "class in akka.util")> appVersion)` |  |
	| `[SetAppVersionLater](SetAppVersionLater.html "class in akka.cluster.typed")` | `[create](#create(java.util.concurrent.CompletionStage))​(java.util.concurrent.CompletionStage<[Version](../../util/Version.html "class in akka.util")> appVersion)` | Java API: If the `appVersion` is read from an external system (e.g. |
	| `scala.Option<scala.concurrent.Future<[Version](../../util/Version.html "class in akka.util")>>` | `[unapply](#unapply(akka.cluster.typed.SetAppVersionLater))​([SetAppVersionLater](SetAppVersionLater.html "class in akka.cluster.typed") x$0)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [SetAppVersionLater$](SetAppVersionLater$.html "class in akka.cluster.typed") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### SetAppVersionLater$
		
		
		
		```
		public SetAppVersionLater$()
		```

	- ### Method Detail
	
	
	
		- #### create
		
		
		
		```
		public [SetAppVersionLater](SetAppVersionLater.html "class in akka.cluster.typed") create​(java.util.concurrent.CompletionStage<[Version](../../util/Version.html "class in akka.util")> appVersion)
		```
		
		Java API: If the `appVersion` is read from an external system (e.g. Kubernetes) it can be defined after
		 system startup but before joining by completing the `appVersion` `CompletionStage`. In that case,
		 `SetAppVersionLater` should be sent before [`Join`](Join.html "class in akka.cluster.typed") or [`JoinSeedNodes`](JoinSeedNodes.html "class in akka.cluster.typed") It's fine to send
		 `Join` or `JoinSeedNodes` immediately afterwards (before the `CompletionStage` is completed. The join will
		 then wait for the `appVersion` to be completed.
		- #### apply
		
		
		
		```
		public [SetAppVersionLater](SetAppVersionLater.html "class in akka.cluster.typed") apply​(scala.concurrent.Future<[Version](../../util/Version.html "class in akka.util")> appVersion)
		```
		- #### unapply
		
		
		
		```
		public scala.Option<scala.concurrent.Future<[Version](../../util/Version.html "class in akka.util")>> unapply​([SetAppVersionLater](SetAppVersionLater.html "class in akka.cluster.typed") x$0)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/cluster/typed/Join.html
- https://doc.akka.io/japi/akka/current/akka/cluster/typed/JoinSeedNodes.html
- https://doc.akka.io/japi/akka/current/akka/cluster/typed/SetAppVersionLater$.html
- https://doc.akka.io/japi/akka/current/akka/cluster/typed/SetAppVersionLater.html
- https://doc.akka.io/japi/akka/current/akka/cluster/typed/package-summary.html
- https://doc.akka.io/japi/akka/current/akka/util/Version.html
- https://doc.akka.io/japi/akka/current/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/cluster/typed/SetAppVersionLater$.html](https://doc.akka.io/japi/akka/current/akka/cluster/typed/SetAppVersionLater$.html)*