---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T17:03:03Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/2.10/akka/stream/IOSettings$.html
title: IOSettings$
---

# IOSettings$

## Content

Package [akka.stream](package-summary.html)
## Class IOSettings$

- java.lang.Object
- - akka.stream.IOSettings$

- ---

```
public class IOSettings$
extends java.lang.Object
```

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [IOSettings$](IOSettings$.html "class in akka.stream")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[IOSettings$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) [Deprecated Methods](javascript:show(32);) 
	| Modifier and Type | Method | Description |
	| `[IOSettings](IOSettings.html "class in akka.stream")` | `[apply](#apply(int))​(int tcpWriteBufferSize)` | Deprecated. Use setting 'akka.stream.materializer.io.tcp.write\-buffer\-size' or attribute TcpAttributes.writeBufferSize instead. |
	| `[IOSettings](IOSettings.html "class in akka.stream")` | `[apply](#apply(akka.actor.ActorSystem))​([ActorSystem](../actor/ActorSystem.html "class in akka.actor") system)` | Deprecated. Use setting 'akka.stream.materializer.io.tcp.write\-buffer\-size' or attribute TcpAttributes.writeBufferSize instead. |
	| `[IOSettings](IOSettings.html "class in akka.stream")` | `[apply](#apply(com.typesafe.config.Config))​(com.typesafe.config.Config config)` | Deprecated. Use setting 'akka.stream.materializer.io.tcp.write\-buffer\-size' or attribute TcpAttributes.writeBufferSize instead. |
	| `[IOSettings](IOSettings.html "class in akka.stream")` | `[create](#create(int))​(int tcpWriteBufferSize)` | Deprecated. Use setting 'akka.stream.materializer.io.tcp.write\-buffer\-size' or attribute TcpAttributes.writeBufferSize instead. |
	| `[IOSettings](IOSettings.html "class in akka.stream")` | `[create](#create(akka.actor.ActorSystem))​([ActorSystem](../actor/ActorSystem.html "class in akka.actor") system)` | Deprecated. Use setting 'akka.stream.materializer.io.tcp.write\-buffer\-size' or attribute TcpAttributes.writeBufferSize instead. |
	| `[IOSettings](IOSettings.html "class in akka.stream")` | `[create](#create(com.typesafe.config.Config))​(com.typesafe.config.Config config)` | Deprecated. Use setting 'akka.stream.materializer.io.tcp.write\-buffer\-size' or attribute TcpAttributes.writeBufferSize instead. |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [IOSettings$](IOSettings$.html "class in akka.stream") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### IOSettings$
		
		
		
		```
		public IOSettings$()
		```

	- ### Method Detail
	
	
	
		- #### apply
		
		
		
		```
		public [IOSettings](IOSettings.html "class in akka.stream") apply​([ActorSystem](../actor/ActorSystem.html "class in akka.actor") system)
		```
		
		Deprecated.
		Use setting 'akka.stream.materializer.io.tcp.write\-buffer\-size' or attribute TcpAttributes.writeBufferSize instead. Since 2\.6\.0\.
		- #### apply
		
		
		
		```
		public [IOSettings](IOSettings.html "class in akka.stream") apply​(com.typesafe.config.Config config)
		```
		
		Deprecated.
		Use setting 'akka.stream.materializer.io.tcp.write\-buffer\-size' or attribute TcpAttributes.writeBufferSize instead. Since 2\.6\.0\.
		- #### apply
		
		
		
		```
		public [IOSettings](IOSettings.html "class in akka.stream") apply​(int tcpWriteBufferSize)
		```
		
		Deprecated.
		Use setting 'akka.stream.materializer.io.tcp.write\-buffer\-size' or attribute TcpAttributes.writeBufferSize instead. Since 2\.6\.0\.
		- #### create
		
		
		
		```
		public [IOSettings](IOSettings.html "class in akka.stream") create​(com.typesafe.config.Config config)
		```
		
		Deprecated.
		Use setting 'akka.stream.materializer.io.tcp.write\-buffer\-size' or attribute TcpAttributes.writeBufferSize instead. Since 2\.6\.0\.
		- #### create
		
		
		
		```
		public [IOSettings](IOSettings.html "class in akka.stream") create​([ActorSystem](../actor/ActorSystem.html "class in akka.actor") system)
		```
		
		Deprecated.
		Use setting 'akka.stream.materializer.io.tcp.write\-buffer\-size' or attribute TcpAttributes.writeBufferSize instead. Since 2\.6\.0\.
		- #### create
		
		
		
		```
		public [IOSettings](IOSettings.html "class in akka.stream") create​(int tcpWriteBufferSize)
		```
		
		Deprecated.
		Use setting 'akka.stream.materializer.io.tcp.write\-buffer\-size' or attribute TcpAttributes.writeBufferSize instead. Since 2\.6\.0\.

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/2.10/akka/actor/ActorSystem.html
- https://doc.akka.io/japi/akka/2.10/akka/stream/IOSettings$.html
- https://doc.akka.io/japi/akka/2.10/akka/stream/IOSettings.html
- https://doc.akka.io/japi/akka/2.10/akka/stream/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/2.10/akka/stream/IOSettings$.html](https://doc.akka.io/japi/akka/2.10/akka/stream/IOSettings$.html)*