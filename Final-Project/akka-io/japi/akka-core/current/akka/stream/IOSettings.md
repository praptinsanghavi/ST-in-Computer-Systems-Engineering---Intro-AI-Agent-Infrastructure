---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T14:01:53Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/current/akka/stream/IOSettings.html
title: IOSettings
---

# IOSettings

## Content

Package [akka.stream](package-summary.html)
## Class IOSettings

- java.lang.Object
- - akka.stream.IOSettings

- ---

```
public final class IOSettings
extends java.lang.Object
```

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[IOSettings](#%3Cinit%3E(int))​(int tcpWriteBufferSize)` | Deprecated. Use attribute 'TcpAttributes.TcpWriteBufferSize' to read the concrete setting value. |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) [Deprecated Methods](javascript:show(32);) 
	| Modifier and Type | Method | Description |
	| `static [IOSettings](IOSettings.html "class in akka.stream")` | `[apply](#apply(int))​(int tcpWriteBufferSize)` | Deprecated. Use setting 'akka.stream.materializer.io.tcp.write\-buffer\-size' or attribute TcpAttributes.writeBufferSize instead. |
	| `static [IOSettings](IOSettings.html "class in akka.stream")` | `[apply](#apply(akka.actor.ActorSystem))​([ActorSystem](../actor/ActorSystem.html "class in akka.actor") system)` | Deprecated. Use setting 'akka.stream.materializer.io.tcp.write\-buffer\-size' or attribute TcpAttributes.writeBufferSize instead. |
	| `static [IOSettings](IOSettings.html "class in akka.stream")` | `[apply](#apply(com.typesafe.config.Config))​(com.typesafe.config.Config config)` | Deprecated. Use setting 'akka.stream.materializer.io.tcp.write\-buffer\-size' or attribute TcpAttributes.writeBufferSize instead. |
	| `int` | `[coalesceWrites](#coalesceWrites())()` |  |
	| `static [IOSettings](IOSettings.html "class in akka.stream")` | `[create](#create(int))​(int tcpWriteBufferSize)` | Deprecated. Use setting 'akka.stream.materializer.io.tcp.write\-buffer\-size' or attribute TcpAttributes.writeBufferSize instead. |
	| `static [IOSettings](IOSettings.html "class in akka.stream")` | `[create](#create(akka.actor.ActorSystem))​([ActorSystem](../actor/ActorSystem.html "class in akka.actor") system)` | Deprecated. Use setting 'akka.stream.materializer.io.tcp.write\-buffer\-size' or attribute TcpAttributes.writeBufferSize instead. |
	| `static [IOSettings](IOSettings.html "class in akka.stream")` | `[create](#create(com.typesafe.config.Config))​(com.typesafe.config.Config config)` | Deprecated. Use setting 'akka.stream.materializer.io.tcp.write\-buffer\-size' or attribute TcpAttributes.writeBufferSize instead. |
	| `boolean` | `[equals](#equals(java.lang.Object))​(java.lang.Object other)` |  |
	| `int` | `[hashCode](#hashCode())()` |  |
	| `int` | `[tcpWriteBufferSize](#tcpWriteBufferSize())()` | Deprecated. Use attribute 'TcpAttributes.TcpWriteBufferSize' to read the concrete setting value. |
	| `java.lang.String` | `[toString](#toString())()` |  |
	| `[IOSettings](IOSettings.html "class in akka.stream")` | `[withCoalesceWrites](#withCoalesceWrites(int))​(int value)` |  |
	| `[IOSettings](IOSettings.html "class in akka.stream")` | `[withTcpWriteBufferSize](#withTcpWriteBufferSize(int))​(int value)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, finalize, getClass, notify, notifyAll, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### IOSettings
		
		
		
		```
		public IOSettings​(int tcpWriteBufferSize)
		```
		
		Deprecated.
		Use attribute 'TcpAttributes.TcpWriteBufferSize' to read the concrete setting value. Since 2\.6\.0\.

	- ### Method Detail
	
	
	
		- #### apply
		
		
		
		```
		public static [IOSettings](IOSettings.html "class in akka.stream") apply​([ActorSystem](../actor/ActorSystem.html "class in akka.actor") system)
		```
		
		Deprecated.
		Use setting 'akka.stream.materializer.io.tcp.write\-buffer\-size' or attribute TcpAttributes.writeBufferSize instead. Since 2\.6\.0\.
		- #### apply
		
		
		
		```
		public static [IOSettings](IOSettings.html "class in akka.stream") apply​(com.typesafe.config.Config config)
		```
		
		Deprecated.
		Use setting 'akka.stream.materializer.io.tcp.write\-buffer\-size' or attribute TcpAttributes.writeBufferSize instead. Since 2\.6\.0\.
		- #### apply
		
		
		
		```
		public static [IOSettings](IOSettings.html "class in akka.stream") apply​(int tcpWriteBufferSize)
		```
		
		Deprecated.
		Use setting 'akka.stream.materializer.io.tcp.write\-buffer\-size' or attribute TcpAttributes.writeBufferSize instead. Since 2\.6\.0\.
		- #### create
		
		
		
		```
		public static [IOSettings](IOSettings.html "class in akka.stream") create​(com.typesafe.config.Config config)
		```
		
		Deprecated.
		Use setting 'akka.stream.materializer.io.tcp.write\-buffer\-size' or attribute TcpAttributes.writeBufferSize instead. Since 2\.6\.0\.
		- #### create
		
		
		
		```
		public static [IOSettings](IOSettings.html "class in akka.stream") create​([ActorSystem](../actor/ActorSystem.html "class in akka.actor") system)
		```
		
		Deprecated.
		Use setting 'akka.stream.materializer.io.tcp.write\-buffer\-size' or attribute TcpAttributes.writeBufferSize instead. Since 2\.6\.0\.
		- #### create
		
		
		
		```
		public static [IOSettings](IOSettings.html "class in akka.stream") create​(int tcpWriteBufferSize)
		```
		
		Deprecated.
		Use setting 'akka.stream.materializer.io.tcp.write\-buffer\-size' or attribute TcpAttributes.writeBufferSize instead. Since 2\.6\.0\.
		- #### tcpWriteBufferSize
		
		
		
		```
		public int tcpWriteBufferSize()
		```
		
		Deprecated.
		Use attribute 'TcpAttributes.TcpWriteBufferSize' to read the concrete setting value. Since 2\.6\.0\.
		- #### coalesceWrites
		
		
		
		```
		public int coalesceWrites()
		```
		- #### withTcpWriteBufferSize
		
		
		
		```
		public [IOSettings](IOSettings.html "class in akka.stream") withTcpWriteBufferSize​(int value)
		```
		- #### withCoalesceWrites
		
		
		
		```
		public [IOSettings](IOSettings.html "class in akka.stream") withCoalesceWrites​(int value)
		```
		- #### equals
		
		
		
		```
		public boolean equals​(java.lang.Object other)
		```
		
		
		Overrides:
		`equals` in class `java.lang.Object`
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

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/current/akka/actor/ActorSystem.html
- https://doc.akka.io/japi/akka-core/current/akka/stream/IOSettings.html
- https://doc.akka.io/japi/akka-core/current/akka/stream/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/current/akka/stream/IOSettings.html](https://doc.akka.io/japi/akka-core/current/akka/stream/IOSettings.html)*