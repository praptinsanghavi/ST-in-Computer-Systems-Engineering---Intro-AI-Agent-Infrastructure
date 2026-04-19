---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T23:45:41Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/ws/TextMessage$.html
title: TextMessage$
---

# TextMessage$

## Content

Package [akka.http.javadsl.model.ws](package-summary.html)
## Class TextMessage$

- java.lang.Object
- - akka.http.javadsl.model.ws.TextMessage$

- ---

```
public class TextMessage$
extends java.lang.Object
```

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [TextMessage$](TextMessage$.html "class in akka.http.javadsl.model.ws")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[TextMessage$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[TextMessage](TextMessage.html "class in akka.http.javadsl.model.ws")` | `[adapt](#adapt(akka.http.scaladsl.model.ws.TextMessage))​([TextMessage](../../../scaladsl/model/ws/TextMessage.html "interface in akka.http.scaladsl.model.ws") msg)` |  |
	| `[TextMessage](TextMessage.html "class in akka.http.javadsl.model.ws")` | `[create](#create(akka.stream.javadsl.Source))​(akka.stream.javadsl.Source<java.lang.String,​?> textStream)` | Creates a streamed text message. |
	| `[TextMessage](TextMessage.html "class in akka.http.javadsl.model.ws")` | `[create](#create(java.lang.String))​(java.lang.String text)` | Creates a strict text message. |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [TextMessage$](TextMessage$.html "class in akka.http.javadsl.model.ws") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### TextMessage$
		
		
		
		```
		public TextMessage$()
		```

	- ### Method Detail
	
	
	
		- #### create
		
		
		
		```
		public [TextMessage](TextMessage.html "class in akka.http.javadsl.model.ws") create​(java.lang.String text)
		```
		
		Creates a strict text message.
		
		Parameters:
		`text` \- (undocumented)
		Returns:
		(undocumented)
		- #### create
		
		
		
		```
		public [TextMessage](TextMessage.html "class in akka.http.javadsl.model.ws") create​(akka.stream.javadsl.Source<java.lang.String,​?> textStream)
		```
		
		Creates a streamed text message.
		
		Parameters:
		`textStream` \- (undocumented)
		Returns:
		(undocumented)
		- #### adapt
		
		
		
		```
		public [TextMessage](TextMessage.html "class in akka.http.javadsl.model.ws") adapt​([TextMessage](../../../scaladsl/model/ws/TextMessage.html "interface in akka.http.scaladsl.model.ws") msg)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/ws/TextMessage$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/ws/TextMessage.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/ws/package-summary.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/ws/TextMessage.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/ws/TextMessage$.html](https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/ws/TextMessage$.html)*