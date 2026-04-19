---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T23:45:39Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/ws/BinaryMessage$.html
title: BinaryMessage$
---

# BinaryMessage$

## Content

Package [akka.http.javadsl.model.ws](package-summary.html)
## Class BinaryMessage$

- java.lang.Object
- - akka.http.javadsl.model.ws.BinaryMessage$

- ---

```
public class BinaryMessage$
extends java.lang.Object
```

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [BinaryMessage$](BinaryMessage$.html "class in akka.http.javadsl.model.ws")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[BinaryMessage$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[BinaryMessage](BinaryMessage.html "class in akka.http.javadsl.model.ws")` | `[adapt](#adapt(akka.http.scaladsl.model.ws.BinaryMessage))​([BinaryMessage](../../../scaladsl/model/ws/BinaryMessage.html "interface in akka.http.scaladsl.model.ws") msg)` |  |
	| `[BinaryMessage](BinaryMessage.html "class in akka.http.javadsl.model.ws")` | `[create](#create(akka.stream.javadsl.Source))​(akka.stream.javadsl.Source<akka.util.ByteString,​?> dataStream)` | Creates a streamed binary message. |
	| `[BinaryMessage](BinaryMessage.html "class in akka.http.javadsl.model.ws")` | `[create](#create(akka.util.ByteString))​(akka.util.ByteString data)` | Creates a strict binary message. |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [BinaryMessage$](BinaryMessage$.html "class in akka.http.javadsl.model.ws") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### BinaryMessage$
		
		
		
		```
		public BinaryMessage$()
		```

	- ### Method Detail
	
	
	
		- #### create
		
		
		
		```
		public [BinaryMessage](BinaryMessage.html "class in akka.http.javadsl.model.ws") create​(akka.util.ByteString data)
		```
		
		Creates a strict binary message.
		
		Parameters:
		`data` \- (undocumented)
		Returns:
		(undocumented)
		- #### create
		
		
		
		```
		public [BinaryMessage](BinaryMessage.html "class in akka.http.javadsl.model.ws") create​(akka.stream.javadsl.Source<akka.util.ByteString,​?> dataStream)
		```
		
		Creates a streamed binary message.
		
		Parameters:
		`dataStream` \- (undocumented)
		Returns:
		(undocumented)
		- #### adapt
		
		
		
		```
		public [BinaryMessage](BinaryMessage.html "class in akka.http.javadsl.model.ws") adapt​([BinaryMessage](../../../scaladsl/model/ws/BinaryMessage.html "interface in akka.http.scaladsl.model.ws") msg)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/ws/BinaryMessage$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/ws/BinaryMessage.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/ws/package-summary.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/ws/BinaryMessage.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/ws/BinaryMessage$.html](https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/ws/BinaryMessage$.html)*