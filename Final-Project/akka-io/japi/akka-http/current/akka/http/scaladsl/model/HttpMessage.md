---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T00:31:26Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/HttpMessage.HttpMessageScalaDSLSugar.html
title: HttpMessage.HttpMessageScalaDSLSugar
---

# HttpMessage.HttpMessageScalaDSLSugar

## Content

Package [akka.http.scaladsl.model](package-summary.html)
## Class HttpMessage.HttpMessageScalaDSLSugar

- java.lang.Object
- - scala.AnyVal
	- - akka.http.scaladsl.model.HttpMessage.HttpMessageScalaDSLSugar

- Enclosing interface:
[HttpMessage](HttpMessage.html "interface in akka.http.scaladsl.model")

---

```
public static final class HttpMessage.HttpMessageScalaDSLSugar
extends scala.AnyVal
```

Adds Scala DSL idiomatic methods to [`HttpMessage`](HttpMessage.html "interface in akka.http.scaladsl.model"), e.g. versions of methods with an implicit `Materializer`.

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[HttpMessageScalaDSLSugar](#%3Cinit%3E(akka.http.scaladsl.model.HttpMessage))​([HttpMessage](HttpMessage.html "interface in akka.http.scaladsl.model") httpMessage)` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[HttpMessage.DiscardedEntity](HttpMessage.DiscardedEntity.html "class in akka.http.scaladsl.model")` | `[discardEntityBytes](#discardEntityBytes(akka.stream.Materializer))​(akka.stream.Materializer mat)` | Discards the entities data bytes by running the `dataBytes` Source contained by the `entity` of this HTTP message. |
	| `[HttpMessage](HttpMessage.html "interface in akka.http.scaladsl.model")` | `[httpMessage](#httpMessage())()` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### HttpMessageScalaDSLSugar
		
		
		
		```
		public HttpMessageScalaDSLSugar​([HttpMessage](HttpMessage.html "interface in akka.http.scaladsl.model") httpMessage)
		```

	- ### Method Detail
	
	
	
		- #### httpMessage
		
		
		
		```
		public [HttpMessage](HttpMessage.html "interface in akka.http.scaladsl.model") httpMessage()
		```
		- #### discardEntityBytes
		
		
		
		```
		public [HttpMessage.DiscardedEntity](HttpMessage.DiscardedEntity.html "class in akka.http.scaladsl.model") discardEntityBytes​(akka.stream.Materializer mat)
		```
		
		Discards the entities data bytes by running the `dataBytes` Source contained by the `entity` of this HTTP message.
		 
		 Note: It is crucial that entities are either discarded, or consumed by running the underlying `Source`
		 as otherwise the lack of consuming of the data will trigger back\-pressure to the underlying TCP connection
		 (as designed), however possibly leading to an idle\-timeout that will close the connection, instead of
		 just having ignored the data.
		 
		
		
		 Warning: It is not allowed to discard and/or consume the `entity.dataBytes` more than once
		 as the stream is directly attached to the "live" incoming data source from the underlying TCP connection.
		 Allowing it to be consumable twice would require buffering the incoming data, thus defeating the purpose
		 of its streaming nature. If the dataBytes source is materialized a second time, it will fail with an
		 "stream can cannot be materialized more than once" exception.
		 
		
		
		 When called on `Strict` entities or sources whose values can be buffered in memory,
		 the above warnings can be ignored. Repeated materialization is not necessary in this case, avoiding
		 the mentioned exceptions due to the data being held in memory.
		 
		
		
		 In future versions, more automatic ways to warn or resolve these situations may be introduced, see issue \#18716\.
		
		
		
		Parameters:
		`mat` \- (undocumented)
		Returns:
		(undocumented)

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/HttpMessage.DiscardedEntity.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/HttpMessage.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/HttpMessage.HttpMessageScalaDSLSugar.html](https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/HttpMessage.HttpMessageScalaDSLSugar.html)*