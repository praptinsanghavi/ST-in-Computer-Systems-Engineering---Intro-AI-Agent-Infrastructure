---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T02:00:13Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/io/UdpConnectedExt.html
title: UdpConnectedExt
---

# UdpConnectedExt

## Content

Package [akka.io](package-summary.html)
## Class UdpConnectedExt

- java.lang.Object
- - akka.io.UdpConnectedExt

- All Implemented Interfaces:
`[Extension](../actor/Extension.html "interface in akka.actor")`, `[IO.Extension](IO.Extension.html "interface in akka.io")`

---

```
public class UdpConnectedExt
extends java.lang.Object
implements [IO.Extension](IO.Extension.html "interface in akka.io")
```

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[UdpConnectedExt](#%3Cinit%3E(akka.actor.ExtendedActorSystem))​([ExtendedActorSystem](../actor/ExtendedActorSystem.html "class in akka.actor") system)` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[BufferPool](BufferPool.html "interface in akka.io")` | `[bufferPool](#bufferPool())()` |  |
	| `[ActorRef](../actor/ActorRef.html "class in akka.actor")` | `[getManager](#getManager())()` | Java API: retrieve the UDP manager actor\&rsquo;s reference. |
	| `[ActorRef](../actor/ActorRef.html "class in akka.actor")` | `[manager](#manager())()` |  |
	| `akka.io.Udp.UdpSettings` | `[settings](#settings())()` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### UdpConnectedExt
		
		
		
		```
		public UdpConnectedExt​([ExtendedActorSystem](../actor/ExtendedActorSystem.html "class in akka.actor") system)
		```

	- ### Method Detail
	
	
	
		- #### bufferPool
		
		
		
		```
		public [BufferPool](BufferPool.html "interface in akka.io") bufferPool()
		```
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

- https://doc.akka.io/japi/akka-core/2.10/akka/actor/ActorRef.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/ExtendedActorSystem.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/Extension.html
- https://doc.akka.io/japi/akka-core/2.10/akka/io/BufferPool.html
- https://doc.akka.io/japi/akka-core/2.10/akka/io/IO.Extension.html
- https://doc.akka.io/japi/akka-core/2.10/akka/io/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/io/UdpConnectedExt.html](https://doc.akka.io/japi/akka-core/2.10/akka/io/UdpConnectedExt.html)*