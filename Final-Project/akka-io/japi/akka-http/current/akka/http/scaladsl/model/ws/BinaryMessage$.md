---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T00:33:53Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/ws/BinaryMessage$.html
title: BinaryMessage$
---

# BinaryMessage$

## Content

Package [akka.http.scaladsl.model.ws](package-summary.html)
## Class BinaryMessage$

- java.lang.Object
- - akka.http.scaladsl.model.ws.BinaryMessage$

- ---

```
public class BinaryMessage$
extends java.lang.Object
```

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [BinaryMessage$](BinaryMessage$.html "class in akka.http.scaladsl.model.ws")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[BinaryMessage$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[BinaryMessage](BinaryMessage.html "interface in akka.http.scaladsl.model.ws")` | `[apply](#apply(akka.stream.scaladsl.Source))​(akka.stream.scaladsl.Source<akka.util.ByteString,​java.lang.Object> dataStream)` |  |
	| `[BinaryMessage.Strict](BinaryMessage.Strict.html "class in akka.http.scaladsl.model.ws")` | `[apply](#apply(akka.util.ByteString))​(akka.util.ByteString data)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [BinaryMessage$](BinaryMessage$.html "class in akka.http.scaladsl.model.ws") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### BinaryMessage$
		
		
		
		```
		public BinaryMessage$()
		```

	- ### Method Detail
	
	
	
		- #### apply
		
		
		
		```
		public [BinaryMessage.Strict](BinaryMessage.Strict.html "class in akka.http.scaladsl.model.ws") apply​(akka.util.ByteString data)
		```
		- #### apply
		
		
		
		```
		public [BinaryMessage](BinaryMessage.html "interface in akka.http.scaladsl.model.ws") apply​(akka.stream.scaladsl.Source<akka.util.ByteString,​java.lang.Object> dataStream)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/ws/BinaryMessage$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/ws/BinaryMessage.Strict.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/ws/BinaryMessage.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/ws/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/ws/BinaryMessage$.html](https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/ws/BinaryMessage$.html)*