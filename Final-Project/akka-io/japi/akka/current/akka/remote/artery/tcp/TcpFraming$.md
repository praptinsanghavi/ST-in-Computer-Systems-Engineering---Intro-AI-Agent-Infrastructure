---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:36:45Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/remote/artery/tcp/TcpFraming$.html
title: TcpFraming$
---

# TcpFraming$

## Content

Package [akka.remote.artery.tcp](package-summary.html)
## Class TcpFraming$

- java.lang.Object
- - akka.remote.artery.tcp.TcpFraming$

- ---

```
public class TcpFraming$
extends java.lang.Object
```

INTERNAL API

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [TcpFraming$](TcpFraming$.html "class in akka.remote.artery.tcp")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[TcpFraming$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[ByteString](../../../util/ByteString.html "class in akka.util")` | `[encodeConnectionHeader](#encodeConnectionHeader(int))​(int streamId)` | When establishing the connection this header is sent first. |
	| `[ByteString](../../../util/ByteString.html "class in akka.util")` | `[encodeFrameHeader](#encodeFrameHeader(int))​(int frameLength)` | Each frame starts with the frame header that contains the length  of the frame. |
	| `[ByteString](../../../util/ByteString.html "class in akka.util")` | `[Magic](#Magic())()` | The first 4 bytes of a new connection must be these `0x64 0x75 0x75 0x64` (AKKA). |
	| `int` | `[Undefined](#Undefined())()` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [TcpFraming$](TcpFraming$.html "class in akka.remote.artery.tcp") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### TcpFraming$
		
		
		
		```
		public TcpFraming$()
		```

	- ### Method Detail
	
	
	
		- #### Undefined
		
		
		
		```
		public int Undefined()
		```
		- #### Magic
		
		
		
		```
		public [ByteString](../../../util/ByteString.html "class in akka.util") Magic()
		```
		
		The first 4 bytes of a new connection must be these `0x64 0x75 0x75 0x64` (AKKA).
		 The purpose of the "magic" is to detect and reject weird (accidental) accesses.
		- #### encodeConnectionHeader
		
		
		
		```
		public [ByteString](../../../util/ByteString.html "class in akka.util") encodeConnectionHeader​(int streamId)
		```
		
		When establishing the connection this header is sent first.
		 It contains a "magic" and the stream identifier for selecting control, ordinary, large
		 inbound streams.
		 
		 The purpose of the "magic" is to detect and reject weird (accidental) accesses.
		 The magic 4 bytes are `0x64 0x75 0x75 0x64` (AKKA).
		 
		
		
		 The streamId `is encoded as 1 byte.`
		- #### encodeFrameHeader
		
		
		
		```
		public [ByteString](../../../util/ByteString.html "class in akka.util") encodeFrameHeader​(int frameLength)
		```
		
		Each frame starts with the frame header that contains the length
		 of the frame. The `frameLength` is encoded as 4 bytes (little endian).

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/remote/artery/tcp/TcpFraming$.html
- https://doc.akka.io/japi/akka/current/akka/remote/artery/tcp/package-summary.html
- https://doc.akka.io/japi/akka/current/akka/util/ByteString.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/remote/artery/tcp/TcpFraming$.html](https://doc.akka.io/japi/akka/current/akka/remote/artery/tcp/TcpFraming$.html)*