---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T00:40:41Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/directives/LoggingMagnet.html
title: LoggingMagnet
---

# LoggingMagnet

## Content

Package [akka.http.scaladsl.server.directives](package-summary.html)
## Class LoggingMagnet\<T\>

- java.lang.Object
- - akka.http.scaladsl.server.directives.LoggingMagnet\<T\>

- All Implemented Interfaces:
`java.io.Serializable`, `scala.Equals`, `scala.Product`

---

```
public class LoggingMagnet<T>
extends java.lang.Object
implements scala.Product, java.io.Serializable
```

See Also:
[Serialized Form](../../../../../serialized-form.html#akka.http.scaladsl.server.directives.LoggingMagnet)

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[LoggingMagnet](#%3Cinit%3E(scala.Function1))​(scala.Function1<akka.event.LoggingAdapter,​[T](LoggingMagnet.html "type parameter in LoggingMagnet")> f)` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `scala.Function1<akka.event.LoggingAdapter,​[T](LoggingMagnet.html "type parameter in LoggingMagnet")>` | `[f](#f())()` |  |
	| `static <T> [LoggingMagnet](LoggingMagnet.html "class in akka.http.scaladsl.server.directives")<scala.Function1<T,​scala.runtime.BoxedUnit>>` | `[forMessageFromFullShow](#forMessageFromFullShow(scala.Function1))​(scala.Function1<T,​[LogEntry](LogEntry.html "class in akka.http.scaladsl.server.directives")> show)` |  |
	| `static <T> [LoggingMagnet](LoggingMagnet.html "class in akka.http.scaladsl.server.directives")<scala.Function1<T,​scala.runtime.BoxedUnit>>` | `[forMessageFromMarker](#forMessageFromMarker(java.lang.String))​(java.lang.String marker)` |  |
	| `static <T> [LoggingMagnet](LoggingMagnet.html "class in akka.http.scaladsl.server.directives")<scala.Function1<T,​scala.runtime.BoxedUnit>>` | `[forMessageFromMarkerAndLevel](#forMessageFromMarkerAndLevel(scala.Tuple2))​(scala.Tuple2<java.lang.String,​akka.event.Logging.LogLevel> markerAndLevel)` |  |
	| `static <T> [LoggingMagnet](LoggingMagnet.html "class in akka.http.scaladsl.server.directives")<scala.Function1<T,​scala.runtime.BoxedUnit>>` | `[forMessageFromShow](#forMessageFromShow(scala.Function1))​(scala.Function1<T,​java.lang.String> show)` |  |
	| `static [LoggingMagnet](LoggingMagnet.html "class in akka.http.scaladsl.server.directives")<scala.Function1<[HttpRequest](../../model/HttpRequest.html "class in akka.http.scaladsl.model"),​scala.Function1<[RouteResult](../RouteResult.html "interface in akka.http.scaladsl.server"),​scala.runtime.BoxedUnit>>>` | `[forRequestResponseFromFullShow](#forRequestResponseFromFullShow(scala.Function1))​(scala.Function1<[HttpRequest](../../model/HttpRequest.html "class in akka.http.scaladsl.model"),​scala.Function1<[RouteResult](../RouteResult.html "interface in akka.http.scaladsl.server"),​scala.Option<[LogEntry](LogEntry.html "class in akka.http.scaladsl.server.directives")>>> show)` |  |
	| `static [LoggingMagnet](LoggingMagnet.html "class in akka.http.scaladsl.server.directives")<scala.Function1<[HttpRequest](../../model/HttpRequest.html "class in akka.http.scaladsl.model"),​scala.Function1<[RouteResult](../RouteResult.html "interface in akka.http.scaladsl.server"),​scala.runtime.BoxedUnit>>>` | `[forRequestResponseFromMarker](#forRequestResponseFromMarker(java.lang.String))​(java.lang.String marker)` |  |
	| `static [LoggingMagnet](LoggingMagnet.html "class in akka.http.scaladsl.server.directives")<scala.Function1<[HttpRequest](../../model/HttpRequest.html "class in akka.http.scaladsl.model"),​scala.Function1<[RouteResult](../RouteResult.html "interface in akka.http.scaladsl.server"),​scala.runtime.BoxedUnit>>>` | `[forRequestResponseFromMarkerAndLevel](#forRequestResponseFromMarkerAndLevel(scala.Tuple2))​(scala.Tuple2<java.lang.String,​akka.event.Logging.LogLevel> markerAndLevel)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`
		- ### Methods inherited from interface scala.Equals
		
		
		`canEqual, equals`
		- ### Methods inherited from interface scala.Product
		
		
		`productArity, productElement, productElementName, productElementNames, productIterator, productPrefix`

- - ### Constructor Detail
	
	
	
		- #### LoggingMagnet
		
		
		
		```
		public LoggingMagnet​(scala.Function1<akka.event.LoggingAdapter,​[T](LoggingMagnet.html "type parameter in LoggingMagnet")> f)
		```

	- ### Method Detail
	
	
	
		- #### forMessageFromMarker
		
		
		
		```
		public static <T> [LoggingMagnet](LoggingMagnet.html "class in akka.http.scaladsl.server.directives")<scala.Function1<T,​scala.runtime.BoxedUnit>> forMessageFromMarker​(java.lang.String marker)
		```
		- #### forMessageFromMarkerAndLevel
		
		
		
		```
		public static <T> [LoggingMagnet](LoggingMagnet.html "class in akka.http.scaladsl.server.directives")<scala.Function1<T,​scala.runtime.BoxedUnit>> forMessageFromMarkerAndLevel​(scala.Tuple2<java.lang.String,​akka.event.Logging.LogLevel> markerAndLevel)
		```
		- #### forMessageFromShow
		
		
		
		```
		public static <T> [LoggingMagnet](LoggingMagnet.html "class in akka.http.scaladsl.server.directives")<scala.Function1<T,​scala.runtime.BoxedUnit>> forMessageFromShow​(scala.Function1<T,​java.lang.String> show)
		```
		- #### forMessageFromFullShow
		
		
		
		```
		public static <T> [LoggingMagnet](LoggingMagnet.html "class in akka.http.scaladsl.server.directives")<scala.Function1<T,​scala.runtime.BoxedUnit>> forMessageFromFullShow​(scala.Function1<T,​[LogEntry](LogEntry.html "class in akka.http.scaladsl.server.directives")> show)
		```
		- #### forRequestResponseFromMarker
		
		
		
		```
		public static [LoggingMagnet](LoggingMagnet.html "class in akka.http.scaladsl.server.directives")<scala.Function1<[HttpRequest](../../model/HttpRequest.html "class in akka.http.scaladsl.model"),​scala.Function1<[RouteResult](../RouteResult.html "interface in akka.http.scaladsl.server"),​scala.runtime.BoxedUnit>>> forRequestResponseFromMarker​(java.lang.String marker)
		```
		- #### forRequestResponseFromMarkerAndLevel
		
		
		
		```
		public static [LoggingMagnet](LoggingMagnet.html "class in akka.http.scaladsl.server.directives")<scala.Function1<[HttpRequest](../../model/HttpRequest.html "class in akka.http.scaladsl.model"),​scala.Function1<[RouteResult](../RouteResult.html "interface in akka.http.scaladsl.server"),​scala.runtime.BoxedUnit>>> forRequestResponseFromMarkerAndLevel​(scala.Tuple2<java.lang.String,​akka.event.Logging.LogLevel> markerAndLevel)
		```
		- #### forRequestResponseFromFullShow
		
		
		
		```
		public static [LoggingMagnet](LoggingMagnet.html "class in akka.http.scaladsl.server.directives")<scala.Function1<[HttpRequest](../../model/HttpRequest.html "class in akka.http.scaladsl.model"),​scala.Function1<[RouteResult](../RouteResult.html "interface in akka.http.scaladsl.server"),​scala.runtime.BoxedUnit>>> forRequestResponseFromFullShow​(scala.Function1<[HttpRequest](../../model/HttpRequest.html "class in akka.http.scaladsl.model"),​scala.Function1<[RouteResult](../RouteResult.html "interface in akka.http.scaladsl.server"),​scala.Option<[LogEntry](LogEntry.html "class in akka.http.scaladsl.server.directives")>>> show)
		```
		- #### f
		
		
		
		```
		public scala.Function1<akka.event.LoggingAdapter,​[T](LoggingMagnet.html "type parameter in LoggingMagnet")> f()
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/HttpRequest.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/RouteResult.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/directives/LogEntry.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/directives/LoggingMagnet.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/directives/package-summary.html
- https://doc.akka.io/japi/akka-http/current/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/directives/LoggingMagnet.html](https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/directives/LoggingMagnet.html)*