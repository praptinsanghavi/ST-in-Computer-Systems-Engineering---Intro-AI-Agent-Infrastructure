---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T23:45:39Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/ws/BinaryMessage.html
title: BinaryMessage
---

# BinaryMessage

## Content

Package [akka.http.javadsl.model.ws](package-summary.html)
## Class BinaryMessage

- java.lang.Object
- - [akka.http.javadsl.model.ws.Message](Message.html "class in akka.http.javadsl.model.ws")
	- - akka.http.javadsl.model.ws.BinaryMessage

- Direct Known Subclasses:
`[BinaryMessage.Streamed](../../../scaladsl/model/ws/BinaryMessage.Streamed.html "class in akka.http.scaladsl.model.ws")`, `[BinaryMessage.Strict](../../../scaladsl/model/ws/BinaryMessage.Strict.html "class in akka.http.scaladsl.model.ws")`

---

```
public abstract class BinaryMessage
extends [Message](Message.html "class in akka.http.javadsl.model.ws")
```

Represents a WebSocket binary message. A binary message can either be strict in which case
 the complete data is already available or it can be streamed in which case [`getStreamedData()`](#getStreamedData())
 will return a Source streaming the data as it comes in.

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[BinaryMessage](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `static [BinaryMessage](BinaryMessage.html "class in akka.http.javadsl.model.ws")` | `[adapt](#adapt(akka.http.scaladsl.model.ws.BinaryMessage))​([BinaryMessage](../../../scaladsl/model/ws/BinaryMessage.html "interface in akka.http.scaladsl.model.ws") msg)` |  |
	| `[BinaryMessage](BinaryMessage.html "class in akka.http.javadsl.model.ws")` | `[asBinaryMessage](#asBinaryMessage())()` | Returns this BinaryMessage if it is a binary message, throws otherwise. |
	| `abstract [BinaryMessage](../../../scaladsl/model/ws/BinaryMessage.html "interface in akka.http.scaladsl.model.ws")` | `[asScala](#asScala())()` |  |
	| `[TextMessage](TextMessage.html "class in akka.http.javadsl.model.ws")` | `[asTextMessage](#asTextMessage())()` | Returns this TextMessage if it is a text message, throws otherwise. |
	| `static [BinaryMessage](BinaryMessage.html "class in akka.http.javadsl.model.ws")` | `[create](#create(akka.stream.javadsl.Source))​(akka.stream.javadsl.Source<akka.util.ByteString,​?> dataStream)` | Creates a streamed binary message. |
	| `static [BinaryMessage](BinaryMessage.html "class in akka.http.javadsl.model.ws")` | `[create](#create(akka.util.ByteString))​(akka.util.ByteString data)` | Creates a strict binary message. |
	| `abstract akka.stream.javadsl.Source<akka.util.ByteString,​?>` | `[getStreamedData](#getStreamedData())()` | Returns a source of the binary message data. |
	| `abstract akka.util.ByteString` | `[getStrictData](#getStrictData())()` | Returns the strict message data if this message is strict, throws otherwise. |
	| `boolean` | `[isText](#isText())()` | Is this message a text message? |
	| `abstract java.util.concurrent.CompletionStage<[BinaryMessage.Strict](../../../scaladsl/model/ws/BinaryMessage.Strict.html "class in akka.http.scaladsl.model.ws")>` | `[toStrict](#toStrict(long,akka.stream.Materializer))​(long timeoutMillis,  akka.stream.Materializer materializer)` |  |
	
	
		- ### Methods inherited from class akka.http.javadsl.model.ws.[Message](Message.html "class in akka.http.javadsl.model.ws")
		
		
		`[adapt](Message.html#adapt(akka.http.scaladsl.model.ws.Message)), [isStrict](Message.html#isStrict())`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### BinaryMessage
		
		
		
		```
		public BinaryMessage()
		```

	- ### Method Detail
	
	
	
		- #### create
		
		
		
		```
		public static [BinaryMessage](BinaryMessage.html "class in akka.http.javadsl.model.ws") create​(akka.util.ByteString data)
		```
		
		Creates a strict binary message.
		
		Parameters:
		`data` \- (undocumented)
		Returns:
		(undocumented)
		- #### create
		
		
		
		```
		public static [BinaryMessage](BinaryMessage.html "class in akka.http.javadsl.model.ws") create​(akka.stream.javadsl.Source<akka.util.ByteString,​?> dataStream)
		```
		
		Creates a streamed binary message.
		
		Parameters:
		`dataStream` \- (undocumented)
		Returns:
		(undocumented)
		- #### adapt
		
		
		
		```
		public static [BinaryMessage](BinaryMessage.html "class in akka.http.javadsl.model.ws") adapt​([BinaryMessage](../../../scaladsl/model/ws/BinaryMessage.html "interface in akka.http.scaladsl.model.ws") msg)
		```
		- #### getStreamedData
		
		
		
		```
		public abstract akka.stream.javadsl.Source<akka.util.ByteString,​?> getStreamedData()
		```
		
		Returns a source of the binary message data.
		
		Returns:
		(undocumented)
		- #### getStrictData
		
		
		
		```
		public abstract akka.util.ByteString getStrictData()
		```
		
		Returns the strict message data if this message is strict, throws otherwise.
		
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
		public abstract [BinaryMessage](../../../scaladsl/model/ws/BinaryMessage.html "interface in akka.http.scaladsl.model.ws") asScala()
		```
		
		
		Specified by:
		`[asScala](Message.html#asScala())` in class `[Message](Message.html "class in akka.http.javadsl.model.ws")`
		- #### toStrict
		
		
		
		```
		public abstract java.util.concurrent.CompletionStage<[BinaryMessage.Strict](../../../scaladsl/model/ws/BinaryMessage.Strict.html "class in akka.http.scaladsl.model.ws")> toStrict​(long timeoutMillis,
		                                                                                    akka.stream.Materializer materializer)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/ws/BinaryMessage.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/ws/Message.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/ws/TextMessage.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/ws/package-summary.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/ws/BinaryMessage.Streamed.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/ws/BinaryMessage.Strict.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/ws/BinaryMessage.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/ws/BinaryMessage.html](https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/ws/BinaryMessage.html)*