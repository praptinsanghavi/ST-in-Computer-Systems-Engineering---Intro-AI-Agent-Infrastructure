---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T23:32:29Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/parsing/HttpHeaderParser$.html
title: HttpHeaderParser$
---

# HttpHeaderParser$

## Content

Package [akka.http.impl.engine.parsing](package-summary.html)
## Class HttpHeaderParser$

- java.lang.Object
- - akka.http.impl.engine.parsing.HttpHeaderParser$

- ---

```
public class HttpHeaderParser$
extends java.lang.Object
```

INTERNAL API

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [HttpHeaderParser$](HttpHeaderParser$.html "class in akka.http.impl.engine.parsing")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[HttpHeaderParser$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[HttpHeaderParser](HttpHeaderParser.html "class in akka.http.impl.engine.parsing")` | `[apply](#apply(akka.http.impl.engine.parsing.HttpHeaderParser.Settings,akka.event.LoggingAdapter))​([HttpHeaderParser.Settings](HttpHeaderParser.Settings.html "class in akka.http.impl.engine.parsing") settings,  akka.event.LoggingAdapter log)` |  |
	| `scala.Function1<[ErrorInfo](../../../scaladsl/model/ErrorInfo.html "class in akka.http.scaladsl.model"),​scala.runtime.BoxedUnit>` | `[defaultIllegalHeaderHandler](#defaultIllegalHeaderHandler(akka.http.impl.engine.parsing.HttpHeaderParser.Settings,akka.event.LoggingAdapter))​([HttpHeaderParser.Settings](HttpHeaderParser.Settings.html "class in akka.http.impl.engine.parsing") settings,  akka.event.LoggingAdapter log)` |  |
	| `scala.runtime.Nothing$` | `[fail](#fail(java.lang.String,akka.http.scaladsl.model.StatusCode))​(java.lang.String summary,  [StatusCode](../../../scaladsl/model/StatusCode.html "class in akka.http.scaladsl.model") status)` |  |
	| `void` | `[insert](#insert(akka.http.impl.engine.parsing.HttpHeaderParser,akka.util.ByteString,java.lang.Object))​([HttpHeaderParser](HttpHeaderParser.html "class in akka.http.impl.engine.parsing") parser,  akka.util.ByteString input,  java.lang.Object value)` |  |
	| `void` | `[insertRemainingCharsAsNewNodes](#insertRemainingCharsAsNewNodes(akka.http.impl.engine.parsing.HttpHeaderParser,akka.util.ByteString,java.lang.Object))​([HttpHeaderParser](HttpHeaderParser.html "class in akka.http.impl.engine.parsing") parser,  akka.util.ByteString input,  java.lang.Object value)` |  |
	| `[HttpHeaderParser](HttpHeaderParser.html "class in akka.http.impl.engine.parsing")` | `[prime](#prime(akka.http.impl.engine.parsing.HttpHeaderParser))​([HttpHeaderParser](HttpHeaderParser.html "class in akka.http.impl.engine.parsing") parser)` |  |
	| `[HttpHeaderParser](HttpHeaderParser.html "class in akka.http.impl.engine.parsing")` | `[unprimed](#unprimed(akka.http.impl.engine.parsing.HttpHeaderParser.Settings,akka.event.LoggingAdapter,scala.Function1))​([HttpHeaderParser.Settings](HttpHeaderParser.Settings.html "class in akka.http.impl.engine.parsing") settings,  akka.event.LoggingAdapter log,  scala.Function1<[ErrorInfo](../../../scaladsl/model/ErrorInfo.html "class in akka.http.scaladsl.model"),​scala.runtime.BoxedUnit> warnOnIllegalHeader)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [HttpHeaderParser$](HttpHeaderParser$.html "class in akka.http.impl.engine.parsing") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### HttpHeaderParser$
		
		
		
		```
		public HttpHeaderParser$()
		```

	- ### Method Detail
	
	
	
		- #### apply
		
		
		
		```
		public [HttpHeaderParser](HttpHeaderParser.html "class in akka.http.impl.engine.parsing") apply​([HttpHeaderParser.Settings](HttpHeaderParser.Settings.html "class in akka.http.impl.engine.parsing") settings,
		                              akka.event.LoggingAdapter log)
		```
		- #### defaultIllegalHeaderHandler
		
		
		
		```
		public scala.Function1<[ErrorInfo](../../../scaladsl/model/ErrorInfo.html "class in akka.http.scaladsl.model"),​scala.runtime.BoxedUnit> defaultIllegalHeaderHandler​([HttpHeaderParser.Settings](HttpHeaderParser.Settings.html "class in akka.http.impl.engine.parsing") settings,
		                                                                                            akka.event.LoggingAdapter log)
		```
		- #### unprimed
		
		
		
		```
		public [HttpHeaderParser](HttpHeaderParser.html "class in akka.http.impl.engine.parsing") unprimed​([HttpHeaderParser.Settings](HttpHeaderParser.Settings.html "class in akka.http.impl.engine.parsing") settings,
		                                 akka.event.LoggingAdapter log,
		                                 scala.Function1<[ErrorInfo](../../../scaladsl/model/ErrorInfo.html "class in akka.http.scaladsl.model"),​scala.runtime.BoxedUnit> warnOnIllegalHeader)
		```
		- #### prime
		
		
		
		```
		public [HttpHeaderParser](HttpHeaderParser.html "class in akka.http.impl.engine.parsing") prime​([HttpHeaderParser](HttpHeaderParser.html "class in akka.http.impl.engine.parsing") parser)
		```
		- #### insert
		
		
		
		```
		public void insert​([HttpHeaderParser](HttpHeaderParser.html "class in akka.http.impl.engine.parsing") parser,
		                   akka.util.ByteString input,
		                   java.lang.Object value)
		```
		- #### insertRemainingCharsAsNewNodes
		
		
		
		```
		public void insertRemainingCharsAsNewNodes​([HttpHeaderParser](HttpHeaderParser.html "class in akka.http.impl.engine.parsing") parser,
		                                           akka.util.ByteString input,
		                                           java.lang.Object value)
		```
		- #### fail
		
		
		
		```
		public scala.runtime.Nothing$ fail​(java.lang.String summary,
		                                   [StatusCode](../../../scaladsl/model/StatusCode.html "class in akka.http.scaladsl.model") status)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/parsing/HttpHeaderParser$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/parsing/HttpHeaderParser.Settings.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/parsing/HttpHeaderParser.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/parsing/package-summary.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/ErrorInfo.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/StatusCode.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/parsing/HttpHeaderParser$.html](https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/parsing/HttpHeaderParser$.html)*