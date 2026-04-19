---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:35:40Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/remote/artery/HeaderBuilder$.html
title: HeaderBuilder$
---

# HeaderBuilder$

## Content

Package [akka.remote.artery](package-summary.html)
## Class HeaderBuilder$

- java.lang.Object
- - akka.remote.artery.HeaderBuilder$

- ---

```
public class HeaderBuilder$
extends java.lang.Object
```

INTERNAL API

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [HeaderBuilder$](HeaderBuilder$.html "class in akka.remote.artery")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[HeaderBuilder$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `int` | `[DeadLettersCode](#DeadLettersCode())()` |  |
	| `[HeaderBuilder](HeaderBuilder.html "interface in akka.remote.artery")` | `[in](#in(akka.remote.artery.compress.InboundCompressions))​([InboundCompressions](compress/InboundCompressions.html "interface in akka.remote.artery.compress") compression)` |  |
	| `[HeaderBuilder](HeaderBuilder.html "interface in akka.remote.artery")` | `[out](#out())()` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [HeaderBuilder$](HeaderBuilder$.html "class in akka.remote.artery") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### HeaderBuilder$
		
		
		
		```
		public HeaderBuilder$()
		```

	- ### Method Detail
	
	
	
		- #### in
		
		
		
		```
		public [HeaderBuilder](HeaderBuilder.html "interface in akka.remote.artery") in​([InboundCompressions](compress/InboundCompressions.html "interface in akka.remote.artery.compress") compression)
		```
		- #### out
		
		
		
		```
		public [HeaderBuilder](HeaderBuilder.html "interface in akka.remote.artery") out()
		```
		- #### DeadLettersCode
		
		
		
		```
		public final int DeadLettersCode()
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/remote/artery/HeaderBuilder$.html
- https://doc.akka.io/japi/akka/current/akka/remote/artery/HeaderBuilder.html
- https://doc.akka.io/japi/akka/current/akka/remote/artery/compress/InboundCompressions.html
- https://doc.akka.io/japi/akka/current/akka/remote/artery/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/remote/artery/HeaderBuilder$.html](https://doc.akka.io/japi/akka/current/akka/remote/artery/HeaderBuilder$.html)*