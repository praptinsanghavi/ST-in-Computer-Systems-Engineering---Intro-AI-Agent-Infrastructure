---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T23:45:41Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/ws/Message.html
title: Message
---

# Message

## Content

Package [akka.http.javadsl.model.ws](package-summary.html)
## Class Message

- java.lang.Object
- - akka.http.javadsl.model.ws.Message

- Direct Known Subclasses:
`[BinaryMessage](BinaryMessage.html "class in akka.http.javadsl.model.ws")`, `[TextMessage](TextMessage.html "class in akka.http.javadsl.model.ws")`

---

```
public abstract class Message
extends java.lang.Object
```

Represents a WebSocket message. A message can either be a binary message or a text message.

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[Message](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `static [Message](Message.html "class in akka.http.javadsl.model.ws")` | `[adapt](#adapt(akka.http.scaladsl.model.ws.Message))​([Message](../../../scaladsl/model/ws/Message.html "interface in akka.http.scaladsl.model.ws") msg)` |  |
	| `abstract [BinaryMessage](BinaryMessage.html "class in akka.http.javadsl.model.ws")` | `[asBinaryMessage](#asBinaryMessage())()` | Returns this BinaryMessage if it is a binary message, throws otherwise. |
	| `abstract [Message](../../../scaladsl/model/ws/Message.html "interface in akka.http.scaladsl.model.ws")` | `[asScala](#asScala())()` |  |
	| `abstract [TextMessage](TextMessage.html "class in akka.http.javadsl.model.ws")` | `[asTextMessage](#asTextMessage())()` | Returns this TextMessage if it is a text message, throws otherwise. |
	| `abstract boolean` | `[isStrict](#isStrict())()` | Is this message a strict one? |
	| `abstract boolean` | `[isText](#isText())()` | Is this message a text message? |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### Message
		
		
		
		```
		public Message()
		```

	- ### Method Detail
	
	
	
		- #### adapt
		
		
		
		```
		public static [Message](Message.html "class in akka.http.javadsl.model.ws") adapt​([Message](../../../scaladsl/model/ws/Message.html "interface in akka.http.scaladsl.model.ws") msg)
		```
		- #### isText
		
		
		
		```
		public abstract boolean isText()
		```
		
		Is this message a text message? If true, [`asTextMessage()`](#asTextMessage()) will return this
		 text message, if false, [`asBinaryMessage()`](#asBinaryMessage()) will return this binary message.
		
		Returns:
		(undocumented)
		- #### isStrict
		
		
		
		```
		public abstract boolean isStrict()
		```
		
		Is this message a strict one?
		- #### asTextMessage
		
		
		
		```
		public abstract [TextMessage](TextMessage.html "class in akka.http.javadsl.model.ws") asTextMessage()
		```
		
		Returns this TextMessage if it is a text message, throws otherwise.
		
		Returns:
		(undocumented)
		- #### asBinaryMessage
		
		
		
		```
		public abstract [BinaryMessage](BinaryMessage.html "class in akka.http.javadsl.model.ws") asBinaryMessage()
		```
		
		Returns this BinaryMessage if it is a binary message, throws otherwise.
		
		Returns:
		(undocumented)
		- #### asScala
		
		
		
		```
		public abstract [Message](../../../scaladsl/model/ws/Message.html "interface in akka.http.scaladsl.model.ws") asScala()
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/ws/BinaryMessage.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/ws/Message.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/ws/TextMessage.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/ws/package-summary.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/ws/Message.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/ws/Message.html](https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/ws/Message.html)*