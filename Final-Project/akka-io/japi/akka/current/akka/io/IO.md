---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:17:05Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/io/IO.html
title: IO
---

# IO

## Content

Package [akka.io](package-summary.html)
## Class IO

- java.lang.Object
- - akka.io.IO

- ---

```
public class IO
extends java.lang.Object
```

Entry point to Akka\&rsquo;s IO layer.
 

See Also:
[the Akka online documentation](https://akka.io/docs/)

- - ### Nested Class Summary
	
	
	
	Nested Classes 
	| Modifier and Type | Class | Description |
	| `static interface` | `[IO.Extension](IO.Extension.html "interface in akka.io")` |  |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[IO](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `static <T extends [IO.Extension](IO.Extension.html "interface in akka.io")>[ActorRef](../actor/ActorRef.html "class in akka.actor")` | `[apply](#apply(akka.actor.ExtensionId,akka.actor.ActorSystem))​([ExtensionId](../actor/ExtensionId.html "interface in akka.actor")<T> key,  [ActorSystem](../actor/ActorSystem.html "class in akka.actor") system)` | Scala API: obtain a reference to the manager actor for the given IO extension,  for example [`Tcp`](Tcp.html "class in akka.io") or [`Udp`](Udp.html "class in akka.io"). |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### IO
		
		
		
		```
		public IO()
		```

	- ### Method Detail
	
	
	
		- #### apply
		
		
		
		```
		public static <T extends [IO.Extension](IO.Extension.html "interface in akka.io")> [ActorRef](../actor/ActorRef.html "class in akka.actor") apply​([ExtensionId](../actor/ExtensionId.html "interface in akka.actor")<T> key,
		                                                      [ActorSystem](../actor/ActorSystem.html "class in akka.actor") system)
		```
		
		Scala API: obtain a reference to the manager actor for the given IO extension,
		 for example [`Tcp`](Tcp.html "class in akka.io") or [`Udp`](Udp.html "class in akka.io").
		 
		 For the Java API please refer to the individual extensions directly.

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/actor/ActorRef.html
- https://doc.akka.io/japi/akka/current/akka/actor/ActorSystem.html
- https://doc.akka.io/japi/akka/current/akka/actor/ExtensionId.html
- https://doc.akka.io/japi/akka/current/akka/io/IO.Extension.html
- https://doc.akka.io/japi/akka/current/akka/io/Tcp.html
- https://doc.akka.io/japi/akka/current/akka/io/Udp.html
- https://doc.akka.io/japi/akka/current/akka/io/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/io/IO.html](https://doc.akka.io/japi/akka/current/akka/io/IO.html)*