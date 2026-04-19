---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T15:15:46Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10.17/akka/io/UdpExt.html
title: UdpExt
---

# UdpExt

## Content

Package [akka.io](package-summary.html)
## Class UdpExt

- java.lang.Object
- - akka.io.UdpExt

- All Implemented Interfaces:
`[Extension](../actor/Extension.html "interface in akka.actor")`, `[IO.Extension](IO.Extension.html "interface in akka.io")`

---

```
public class UdpExt
extends java.lang.Object
implements [IO.Extension](IO.Extension.html "interface in akka.io")
```

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[UdpExt](#%3Cinit%3E(akka.actor.ExtendedActorSystem))​([ExtendedActorSystem](../actor/ExtendedActorSystem.html "class in akka.actor") system)` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[ActorRef](../actor/ActorRef.html "class in akka.actor")` | `[getManager](#getManager())()` | Java API: retrieve the UDP manager actor\&rsquo;s reference. |
	| `[ActorRef](../actor/ActorRef.html "class in akka.actor")` | `[manager](#manager())()` |  |
	| `akka.io.Udp.UdpSettings` | `[settings](#settings())()` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### UdpExt
		
		
		
		```
		public UdpExt​([ExtendedActorSystem](../actor/ExtendedActorSystem.html "class in akka.actor") system)
		```

	- ### Method Detail
	
	
	
		- #### getManager
		
		
		
		```
		public [ActorRef](../actor/ActorRef.html "class in akka.actor") getManager()
		```
		
		Java API: retrieve the UDP manager actor\&rsquo;s reference.
		- #### manager
		
		
		
		```
		public [ActorRef](../actor/ActorRef.html "class in akka.actor") manager()
		```
		
		
		Specified by:
		`[manager](IO.Extension.html#manager())` in interface `[IO.Extension](IO.Extension.html "interface in akka.io")`
		- #### settings
		
		
		
		```
		public akka.io.Udp.UdpSettings settings()
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/ActorRef.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/ExtendedActorSystem.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/Extension.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/io/IO.Extension.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/io/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10.17/akka/io/UdpExt.html](https://doc.akka.io/japi/akka-core/2.10.17/akka/io/UdpExt.html)*