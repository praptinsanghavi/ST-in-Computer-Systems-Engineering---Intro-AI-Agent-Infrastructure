---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:35:29Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/remote/artery/ArteryTransport$.html
title: ArteryTransport$
---

# ArteryTransport$

## Content

Package [akka.remote.artery](package-summary.html)
## Class ArteryTransport$

- java.lang.Object
- - akka.remote.artery.ArteryTransport$

- ---

```
public class ArteryTransport$
extends java.lang.Object
```

INTERNAL API

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [ArteryTransport$](ArteryTransport$.html "class in akka.remote.artery")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[ArteryTransport$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `int` | `[ControlStreamId](#ControlStreamId())()` |  |
	| `long` | `[generateSystemUid](#generateSystemUid(java.lang.String,int,long))​(java.lang.String hostname,  int port,  long timestamp1)` |  |
	| `byte` | `[HighestVersion](#HighestVersion())()` |  |
	| `int` | `[LargeStreamId](#LargeStreamId())()` |  |
	| `int` | `[OrdinaryStreamId](#OrdinaryStreamId())()` |  |
	| `java.lang.String` | `[ProtocolName](#ProtocolName())()` |  |
	| `java.lang.String` | `[streamName](#streamName(int))​(int streamId)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [ArteryTransport$](ArteryTransport$.html "class in akka.remote.artery") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### ArteryTransport$
		
		
		
		```
		public ArteryTransport$()
		```

	- ### Method Detail
	
	
	
		- #### ProtocolName
		
		
		
		```
		public java.lang.String ProtocolName()
		```
		- #### HighestVersion
		
		
		
		```
		public byte HighestVersion()
		```
		- #### ControlStreamId
		
		
		
		```
		public int ControlStreamId()
		```
		- #### OrdinaryStreamId
		
		
		
		```
		public int OrdinaryStreamId()
		```
		- #### LargeStreamId
		
		
		
		```
		public int LargeStreamId()
		```
		- #### streamName
		
		
		
		```
		public java.lang.String streamName​(int streamId)
		```
		- #### generateSystemUid
		
		
		
		```
		public long generateSystemUid​(java.lang.String hostname,
		                              int port,
		                              long timestamp1)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/remote/artery/ArteryTransport$.html
- https://doc.akka.io/japi/akka/current/akka/remote/artery/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/remote/artery/ArteryTransport$.html](https://doc.akka.io/japi/akka/current/akka/remote/artery/ArteryTransport$.html)*