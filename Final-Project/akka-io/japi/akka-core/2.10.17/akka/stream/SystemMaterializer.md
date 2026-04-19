---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T01:29:00Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10.17/akka/stream/SystemMaterializer.html
title: SystemMaterializer
---

# SystemMaterializer

## Content

Package [akka.stream](package-summary.html)
## Class SystemMaterializer

- java.lang.Object
- - akka.stream.SystemMaterializer

- All Implemented Interfaces:
`[Extension](../actor/Extension.html "interface in akka.actor")`

---

```
public final class SystemMaterializer
extends java.lang.Object
implements [Extension](../actor/Extension.html "interface in akka.actor")
```

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[SystemMaterializer](#%3Cinit%3E(akka.actor.ExtendedActorSystem))​([ExtendedActorSystem](../actor/ExtendedActorSystem.html "class in akka.actor") system)` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `static T` | `[apply](#apply(akka.actor.ActorSystem))​([ActorSystem](../actor/ActorSystem.html "class in akka.actor") system)` |  |
	| `static T` | `[apply](#apply(akka.actor.ClassicActorSystemProvider))​([ClassicActorSystemProvider](../actor/ClassicActorSystemProvider.html "interface in akka.actor") system)` |  |
	| `static [SystemMaterializer](SystemMaterializer.html "class in akka.stream")` | `[createExtension](#createExtension(akka.actor.ExtendedActorSystem))​([ExtendedActorSystem](../actor/ExtendedActorSystem.html "class in akka.actor") system)` |  |
	| `static boolean` | `[equals](#equals(java.lang.Object))​(java.lang.Object other)` |  |
	| `static [SystemMaterializer](SystemMaterializer.html "class in akka.stream")` | `[get](#get(akka.actor.ActorSystem))​([ActorSystem](../actor/ActorSystem.html "class in akka.actor") system)` |  |
	| `static [SystemMaterializer](SystemMaterializer.html "class in akka.stream")` | `[get](#get(akka.actor.ClassicActorSystemProvider))​([ClassicActorSystemProvider](../actor/ClassicActorSystemProvider.html "interface in akka.actor") system)` |  |
	| `static int` | `[hashCode](#hashCode())()` |  |
	| `static [SystemMaterializer$](SystemMaterializer$.html "class in akka.stream")` | `[lookup](#lookup())()` |  |
	| `[Materializer](Materializer.html "class in akka.stream")` | `[materializer](#materializer())()` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### SystemMaterializer
		
		
		
		```
		public SystemMaterializer​([ExtendedActorSystem](../actor/ExtendedActorSystem.html "class in akka.actor") system)
		```

	- ### Method Detail
	
	
	
		- #### get
		
		
		
		```
		public static [SystemMaterializer](SystemMaterializer.html "class in akka.stream") get​([ActorSystem](../actor/ActorSystem.html "class in akka.actor") system)
		```
		- #### get
		
		
		
		```
		public static [SystemMaterializer](SystemMaterializer.html "class in akka.stream") get​([ClassicActorSystemProvider](../actor/ClassicActorSystemProvider.html "interface in akka.actor") system)
		```
		- #### lookup
		
		
		
		```
		public static [SystemMaterializer$](SystemMaterializer$.html "class in akka.stream") lookup()
		```
		- #### createExtension
		
		
		
		```
		public static [SystemMaterializer](SystemMaterializer.html "class in akka.stream") createExtension​([ExtendedActorSystem](../actor/ExtendedActorSystem.html "class in akka.actor") system)
		```
		- #### apply
		
		
		
		```
		public static T apply​([ActorSystem](../actor/ActorSystem.html "class in akka.actor") system)
		```
		- #### apply
		
		
		
		```
		public static T apply​([ClassicActorSystemProvider](../actor/ClassicActorSystemProvider.html "interface in akka.actor") system)
		```
		- #### hashCode
		
		
		
		```
		public static final int hashCode()
		```
		- #### equals
		
		
		
		```
		public static final boolean equals​(java.lang.Object other)
		```
		- #### materializer
		
		
		
		```
		public [Materializer](Materializer.html "class in akka.stream") materializer()
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/ActorSystem.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/ClassicActorSystemProvider.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/ExtendedActorSystem.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/Extension.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/stream/Materializer.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/stream/SystemMaterializer$.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/stream/SystemMaterializer.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/stream/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10.17/akka/stream/SystemMaterializer.html](https://doc.akka.io/japi/akka-core/2.10.17/akka/stream/SystemMaterializer.html)*