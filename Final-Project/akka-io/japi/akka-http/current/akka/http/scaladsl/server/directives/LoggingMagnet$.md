---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T00:40:42Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/directives/LoggingMagnet$.html
title: LoggingMagnet$
---

# LoggingMagnet$

## Content

Package [akka.http.scaladsl.server.directives](package-summary.html)
## Class LoggingMagnet$

- java.lang.Object
- - akka.http.scaladsl.server.directives.LoggingMagnet$

- All Implemented Interfaces:
`java.io.Serializable`

---

```
public class LoggingMagnet$
extends java.lang.Object
implements java.io.Serializable
```

See Also:
[Serialized Form](../../../../../serialized-form.html#akka.http.scaladsl.server.directives.LoggingMagnet$)

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [LoggingMagnet$](LoggingMagnet$.html "class in akka.http.scaladsl.server.directives")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[LoggingMagnet$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `<T> [LoggingMagnet](LoggingMagnet.html "class in akka.http.scaladsl.server.directives")<scala.Function1<T,​scala.runtime.BoxedUnit>>` | `[forMessageFromFullShow](#forMessageFromFullShow(scala.Function1))​(scala.Function1<T,​[LogEntry](LogEntry.html "class in akka.http.scaladsl.server.directives")> show)` |  |
	| `<T> [LoggingMagnet](LoggingMagnet.html "class in akka.http.scaladsl.server.directives")<scala.Function1<T,​scala.runtime.BoxedUnit>>` | `[forMessageFromMarker](#forMessageFromMarker(java.lang.String))​(java.lang.String marker)` |  |
	| `<T> [LoggingMagnet](LoggingMagnet.html "class in akka.http.scaladsl.server.directives")<scala.Function1<T,​scala.runtime.BoxedUnit>>` | `[forMessageFromMarkerAndLevel](#forMessageFromMarkerAndLevel(scala.Tuple2))​(scala.Tuple2<java.lang.String,​akka.event.Logging.LogLevel> markerAndLevel)` |  |
	| `<T> [LoggingMagnet](LoggingMagnet.html "class in akka.http.scaladsl.server.directives")<scala.Function1<T,​scala.runtime.BoxedUnit>>` | `[forMessageFromShow](#forMessageFromShow(scala.Function1))​(scala.Function1<T,​java.lang.String> show)` |  |
	| `[LoggingMagnet](LoggingMagnet.html "class in akka.http.scaladsl.server.directives")<scala.Function1<[HttpRequest](../../model/HttpRequest.html "class in akka.http.scaladsl.model"),​scala.Function1<[RouteResult](../RouteResult.html "interface in akka.http.scaladsl.server"),​scala.runtime.BoxedUnit>>>` | `[forRequestResponseFromFullShow](#forRequestResponseFromFullShow(scala.Function1))​(scala.Function1<[HttpRequest](../../model/HttpRequest.html "class in akka.http.scaladsl.model"),​scala.Function1<[RouteResult](../RouteResult.html "interface in akka.http.scaladsl.server"),​scala.Option<[LogEntry](LogEntry.html "class in akka.http.scaladsl.server.directives")>>> show)` |  |
	| `[LoggingMagnet](LoggingMagnet.html "class in akka.http.scaladsl.server.directives")<scala.Function1<[HttpRequest](../../model/HttpRequest.html "class in akka.http.scaladsl.model"),​scala.Function1<[RouteResult](../RouteResult.html "interface in akka.http.scaladsl.server"),​scala.runtime.BoxedUnit>>>` | `[forRequestResponseFromMarker](#forRequestResponseFromMarker(java.lang.String))​(java.lang.String marker)` |  |
	| `[LoggingMagnet](LoggingMagnet.html "class in akka.http.scaladsl.server.directives")<scala.Function1<[HttpRequest](../../model/HttpRequest.html "class in akka.http.scaladsl.model"),​scala.Function1<[RouteResult](../RouteResult.html "interface in akka.http.scaladsl.server"),​scala.runtime.BoxedUnit>>>` | `[forRequestResponseFromMarkerAndLevel](#forRequestResponseFromMarkerAndLevel(scala.Tuple2))​(scala.Tuple2<java.lang.String,​akka.event.Logging.LogLevel> markerAndLevel)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [LoggingMagnet$](LoggingMagnet$.html "class in akka.http.scaladsl.server.directives") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### LoggingMagnet$
		
		
		
		```
		public LoggingMagnet$()
		```

	- ### Method Detail
	
	
	
		- #### forMessageFromMarker
		
		
		
		```
		public <T> [LoggingMagnet](LoggingMagnet.html "class in akka.http.scaladsl.server.directives")<scala.Function1<T,​scala.runtime.BoxedUnit>> forMessageFromMarker​(java.lang.String marker)
		```
		- #### forMessageFromMarkerAndLevel
		
		
		
		```
		public <T> [LoggingMagnet](LoggingMagnet.html "class in akka.http.scaladsl.server.directives")<scala.Function1<T,​scala.runtime.BoxedUnit>> forMessageFromMarkerAndLevel​(scala.Tuple2<java.lang.String,​akka.event.Logging.LogLevel> markerAndLevel)
		```
		- #### forMessageFromShow
		
		
		
		```
		public <T> [LoggingMagnet](LoggingMagnet.html "class in akka.http.scaladsl.server.directives")<scala.Function1<T,​scala.runtime.BoxedUnit>> forMessageFromShow​(scala.Function1<T,​java.lang.String> show)
		```
		- #### forMessageFromFullShow
		
		
		
		```
		public <T> [LoggingMagnet](LoggingMagnet.html "class in akka.http.scaladsl.server.directives")<scala.Function1<T,​scala.runtime.BoxedUnit>> forMessageFromFullShow​(scala.Function1<T,​[LogEntry](LogEntry.html "class in akka.http.scaladsl.server.directives")> show)
		```
		- #### forRequestResponseFromMarker
		
		
		
		```
		public [LoggingMagnet](LoggingMagnet.html "class in akka.http.scaladsl.server.directives")<scala.Function1<[HttpRequest](../../model/HttpRequest.html "class in akka.http.scaladsl.model"),​scala.Function1<[RouteResult](../RouteResult.html "interface in akka.http.scaladsl.server"),​scala.runtime.BoxedUnit>>> forRequestResponseFromMarker​(java.lang.String marker)
		```
		- #### forRequestResponseFromMarkerAndLevel
		
		
		
		```
		public [LoggingMagnet](LoggingMagnet.html "class in akka.http.scaladsl.server.directives")<scala.Function1<[HttpRequest](../../model/HttpRequest.html "class in akka.http.scaladsl.model"),​scala.Function1<[RouteResult](../RouteResult.html "interface in akka.http.scaladsl.server"),​scala.runtime.BoxedUnit>>> forRequestResponseFromMarkerAndLevel​(scala.Tuple2<java.lang.String,​akka.event.Logging.LogLevel> markerAndLevel)
		```
		- #### forRequestResponseFromFullShow
		
		
		
		```
		public [LoggingMagnet](LoggingMagnet.html "class in akka.http.scaladsl.server.directives")<scala.Function1<[HttpRequest](../../model/HttpRequest.html "class in akka.http.scaladsl.model"),​scala.Function1<[RouteResult](../RouteResult.html "interface in akka.http.scaladsl.server"),​scala.runtime.BoxedUnit>>> forRequestResponseFromFullShow​(scala.Function1<[HttpRequest](../../model/HttpRequest.html "class in akka.http.scaladsl.model"),​scala.Function1<[RouteResult](../RouteResult.html "interface in akka.http.scaladsl.server"),​scala.Option<[LogEntry](LogEntry.html "class in akka.http.scaladsl.server.directives")>>> show)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/HttpRequest.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/RouteResult.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/directives/LogEntry.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/directives/LoggingMagnet$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/directives/LoggingMagnet.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/directives/package-summary.html
- https://doc.akka.io/japi/akka-http/current/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/directives/LoggingMagnet$.html](https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/directives/LoggingMagnet$.html)*