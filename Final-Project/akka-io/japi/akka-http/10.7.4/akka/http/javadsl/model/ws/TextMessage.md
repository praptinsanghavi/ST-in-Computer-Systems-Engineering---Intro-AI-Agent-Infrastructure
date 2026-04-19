---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T02:11:36Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/ws/TextMessage.html
title: TextMessage
---

# TextMessage

## Content

Package [akka.http.javadsl.model.ws](package-summary.html)
## Class TextMessage

- java.lang.Object
- - [akka.http.javadsl.model.ws.Message](Message.html "class in akka.http.javadsl.model.ws")
	- - akka.http.javadsl.model.ws.TextMessage

- Direct Known Subclasses:
`[TextMessage.Streamed](../../../scaladsl/model/ws/TextMessage.Streamed.html "class in akka.http.scaladsl.model.ws")`, `[TextMessage.Strict](../../../scaladsl/model/ws/TextMessage.Strict.html "class in akka.http.scaladsl.model.ws")`

---

```
public abstract class TextMessage
extends [Message](Message.html "class in akka.http.javadsl.model.ws")
```

Represents a WebSocket text message. A text message can either be strict in which case
 the complete data is already available or it can be streamed in which case [`getStreamedText()`](#getStreamedText())
 will return a Source streaming the data as it comes in.

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[TextMessage](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `static [TextMessage](TextMessage.html "class in akka.http.javadsl.model.ws")` | `[adapt](#adapt(akka.http.scaladsl.model.ws.TextMessage))​([TextMessage](../../../scaladsl/model/ws/TextMessage.html "interface in akka.http.scaladsl.model.ws") msg)` |  |
	| `[BinaryMessage](BinaryMessage.html "class in akka.http.javadsl.model.ws")` | `[asBinaryMessage](#asBinaryMessage())()` | Returns this BinaryMessage if it is a binary message, throws otherwise. |
	| `abstract [TextMessage](../../../scaladsl/model/ws/TextMessage.html "interface in akka.http.scaladsl.model.ws")` | `[asScala](#asScala())()` |  |
	| `[TextMessage](TextMessage.html "class in akka.http.javadsl.model.ws")` | `[asTextMessage](#asTextMessage())()` | Returns this TextMessage if it is a text message, throws otherwise. |
	| `static [TextMessage](TextMessage.html "class in akka.http.javadsl.model.ws")` | `[create](#create(akka.stream.javadsl.Source))​(akka.stream.javadsl.Source<java.lang.String,​?> textStream)` | Creates a streamed text message. |
	| `static [TextMessage](TextMessage.html "class in akka.http.javadsl.model.ws")` | `[create](#create(java.lang.String))​(java.lang.String text)` | Creates a strict text message. |
	| `abstract akka.stream.javadsl.Source<java.lang.String,​?>` | `[getStreamedText](#getStreamedText())()` | Returns a source of the text message data. |
	| `abstract java.lang.String` | `[getStrictText](#getStrictText())()` | Returns the strict message text if this message is strict, throws otherwise. |
	| `boolean` | `[isText](#isText())()` | Is this message a text message? |
	| `abstract java.util.concurrent.CompletionStage<[TextMessage.Strict](../../../scaladsl/model/ws/TextMessage.Strict.html "class in akka.http.scaladsl.model.ws")>` | `[toStrict](#toStrict(long,akka.stream.Materializer))​(long timeoutMillis,  akka.stream.Materializer materializer)` |  |
	
	
		- ### Methods inherited from class akka.http.javadsl.model.ws.[Message](Message.html "class in akka.http.javadsl.model.ws")
		
		
		`[adapt](Message.html#adapt(akka.http.scaladsl.model.ws.Message)), [isStrict](Message.html#isStrict())`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### TextMessage
		
		
		
		```
		public TextMessage()
		```

	- ### Method Detail
	
	
	
		- #### create
		
		
		
		```
		public static [TextMessage](TextMessage.html "class in akka.http.javadsl.model.ws") create​(java.lang.String text)
		```
		
		Creates a strict text message.
		
		Parameters:
		`text` \- (undocumented)
		Returns:
		(undocumented)
		- #### create
		
		
		
		```
		public static [TextMessage](TextMessage.html "class in akka.http.javadsl.model.ws") create​(akka.stream.javadsl.Source<java.lang.String,​?> textStream)
		```
		
		Creates a streamed text message.
		
		Parameters:
		`textStream` \- (undocumented)
		Returns:
		(undocumented)
		- #### adapt
		
		
		
		```
		public static [TextMessage](TextMessage.html "class in akka.http.javadsl.model.ws") adapt​([TextMessage](../../../scaladsl/model/ws/TextMessage.html "interface in akka.http.scaladsl.model.ws") msg)
		```
		- #### getStreamedText
		
		
		
		```
		public abstract akka.stream.javadsl.Source<java.lang.String,​?> getStreamedText()
		```
		
		Returns a source of the text message data.
		
		Returns:
		(undocumented)
		- #### getStrictText
		
		
		
		```
		public abstract java.lang.String getStrictText()
		```
		
		Returns the strict message text if this message is strict, throws otherwise.
		
		Returns:
		(undocumented)
		- #### isText
		
		
		
		```
		public boolean isText()
		```
		
		Description copied from class: `[Message](Message.html#isText())`
		Is this message a text message? If true, [`Message.asTextMessage()`](Message.html#asTextMessage()) will return this
		 text message, if false, [`Message.asBinaryMessage()`](Message.html#asBinaryMessage()) will return this binary message.
		
		Specified by:
		`[isText](Message.html#isText())` in class `[Message](Message.html "class in akka.http.javadsl.model.ws")`
		Returns:
		(undocumented)
		- #### asTextMessage
		
		
		
		```
		public [TextMessage](TextMessage.html "class in akka.http.javadsl.model.ws") asTextMessage()
		```
		
		Description copied from class: `[Message](Message.html#asTextMessage())`
		Returns this TextMessage if it is a text message, throws otherwise.
		
		Specified by:
		`[asTextMessage](Message.html#asTextMessage())` in class `[Message](Message.html "class in akka.http.javadsl.model.ws")`
		Returns:
		(undocumented)
		- #### asBinaryMessage
		
		
		
		```
		public [BinaryMessage](BinaryMessage.html "class in akka.http.javadsl.model.ws") asBinaryMessage()
		```
		
		Description copied from class: `[Message](Message.html#asBinaryMessage())`
		Returns this BinaryMessage if it is a binary message, throws otherwise.
		
		Specified by:
		`[asBinaryMessage](Message.html#asBinaryMessage())` in class `[Message](Message.html "class in akka.http.javadsl.model.ws")`
		Returns:
		(undocumented)
		- #### asScala
		
		
		
		```
		public abstract [TextMessage](../../../scaladsl/model/ws/TextMessage.html "interface in akka.http.scaladsl.model.ws") asScala()
		```
		
		
		Specified by:
		`[asScala](Message.html#asScala())` in class `[Message](Message.html "class in akka.http.javadsl.model.ws")`
		- #### toStrict
		
		
		
		```
		public abstract java.util.concurrent.CompletionStage<[TextMessage.Strict](../../../scaladsl/model/ws/TextMessage.Strict.html "class in akka.http.scaladsl.model.ws")> toStrict​(long timeoutMillis,
		                                                                                  akka.stream.Materializer materializer)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/ws/BinaryMessage.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/ws/Message.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/ws/TextMessage.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/ws/package-summary.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/model/ws/TextMessage.Streamed.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/model/ws/TextMessage.Strict.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/model/ws/TextMessage.html

---
*Source: [https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/ws/TextMessage.html](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/ws/TextMessage.html)*