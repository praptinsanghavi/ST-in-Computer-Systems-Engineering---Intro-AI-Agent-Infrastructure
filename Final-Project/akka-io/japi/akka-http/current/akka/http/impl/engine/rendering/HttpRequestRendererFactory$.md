---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T23:32:56Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/rendering/HttpRequestRendererFactory$.html
title: HttpRequestRendererFactory$
---

# HttpRequestRendererFactory$

## Content

Package [akka.http.impl.engine.rendering](package-summary.html)
## Class HttpRequestRendererFactory$

- java.lang.Object
- - akka.http.impl.engine.rendering.HttpRequestRendererFactory$

- ---

```
public class HttpRequestRendererFactory$
extends java.lang.Object
```

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [HttpRequestRendererFactory$](HttpRequestRendererFactory$.html "class in akka.http.impl.engine.rendering")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[HttpRequestRendererFactory$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `akka.util.ByteString` | `[renderStrict](#renderStrict(akka.http.impl.engine.rendering.RequestRenderingContext,akka.http.scaladsl.settings.ClientConnectionSettings,akka.event.LoggingAdapter))​([RequestRenderingContext](RequestRenderingContext.html "class in akka.http.impl.engine.rendering") ctx,  [ClientConnectionSettings](../../../scaladsl/settings/ClientConnectionSettings.html "class in akka.http.scaladsl.settings") settings,  akka.event.LoggingAdapter log)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [HttpRequestRendererFactory$](HttpRequestRendererFactory$.html "class in akka.http.impl.engine.rendering") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### HttpRequestRendererFactory$
		
		
		
		```
		public HttpRequestRendererFactory$()
		```

	- ### Method Detail
	
	
	
		- #### renderStrict
		
		
		
		```
		public akka.util.ByteString renderStrict​([RequestRenderingContext](RequestRenderingContext.html "class in akka.http.impl.engine.rendering") ctx,
		                                         [ClientConnectionSettings](../../../scaladsl/settings/ClientConnectionSettings.html "class in akka.http.scaladsl.settings") settings,
		                                         akka.event.LoggingAdapter log)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/rendering/HttpRequestRendererFactory$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/rendering/RequestRenderingContext.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/rendering/package-summary.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/settings/ClientConnectionSettings.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/rendering/HttpRequestRendererFactory$.html](https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/rendering/HttpRequestRendererFactory$.html)*