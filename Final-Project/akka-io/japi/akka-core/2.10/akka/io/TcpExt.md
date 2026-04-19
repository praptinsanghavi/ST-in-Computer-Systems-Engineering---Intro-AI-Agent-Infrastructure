---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T02:00:09Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/io/TcpExt.html
title: TcpExt
---

# TcpExt

## Content

Package [akka.io](package-summary.html)
## Class TcpExt

- java.lang.Object
- - akka.io.TcpExt

- All Implemented Interfaces:
`[Extension](../actor/Extension.html "interface in akka.actor")`, `[IO.Extension](IO.Extension.html "interface in akka.io")`

---

```
public class TcpExt
extends java.lang.Object
implements [IO.Extension](IO.Extension.html "interface in akka.io")
```

- - ### Nested Class Summary
	
	
	
	Nested Classes 
	| Modifier and Type | Class | Description |
	| `class` | `[TcpExt.Settings](TcpExt.Settings.html "class in akka.io")` |  |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[TcpExt](#%3Cinit%3E(akka.actor.ExtendedActorSystem))​([ExtendedActorSystem](../actor/ExtendedActorSystem.html "class in akka.actor") system)` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[BufferPool](BufferPool.html "interface in akka.io")` | `[bufferPool](#bufferPool())()` |  |
	| `[MessageDispatcher](../dispatch/MessageDispatcher.html "class in akka.dispatch")` | `[fileIoDispatcher](#fileIoDispatcher())()` |  |
	| `[ActorRef](../actor/ActorRef.html "class in akka.actor")` | `[getManager](#getManager())()` | Java API: retrieve a reference to the manager actor. |
	| `[ActorRef](../actor/ActorRef.html "class in akka.actor")` | `[manager](#manager())()` |  |
	| `[TcpExt.Settings](TcpExt.Settings.html "class in akka.io")` | `[Settings](#Settings())()` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### TcpExt
		
		
		
		```
		public TcpExt​([ExtendedActorSystem](../actor/ExtendedActorSystem.html "class in akka.actor") system)
		```

	- ### Method Detail
	
	
	
		- #### Settings
		
		
		
		```
		public [TcpExt.Settings](TcpExt.Settings.html "class in akka.io") Settings()
		```
		- #### bufferPool
		
		
		
		```
		public [BufferPool](BufferPool.html "interface in akka.io") bufferPool()
		```
		- #### fileIoDispatcher
		
		
		
		```
		public [MessageDispatcher](../dispatch/MessageDispatcher.html "class in akka.dispatch") fileIoDispatcher()
		```
		- #### getManager
		
		
		
		```
		public [ActorRef](../actor/ActorRef.html "class in akka.actor") getManager()
		```
		
		Java API: retrieve a reference to the manager actor.
		- #### manager
		
		
		
		```
		public [ActorRef](../actor/ActorRef.html "class in akka.actor") manager()
		```
		
		
		Specified by:
		`[manager](IO.Extension.html#manager())` in interface `[IO.Extension](IO.Extension.html "interface in akka.io")`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/actor/ActorRef.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/ExtendedActorSystem.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/Extension.html
- https://doc.akka.io/japi/akka-core/2.10/akka/dispatch/MessageDispatcher.html
- https://doc.akka.io/japi/akka-core/2.10/akka/io/BufferPool.html
- https://doc.akka.io/japi/akka-core/2.10/akka/io/IO.Extension.html
- https://doc.akka.io/japi/akka-core/2.10/akka/io/TcpExt.Settings.html
- https://doc.akka.io/japi/akka-core/2.10/akka/io/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/io/TcpExt.html](https://doc.akka.io/japi/akka-core/2.10/akka/io/TcpExt.html)*