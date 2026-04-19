---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T23:30:35Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/http2/GenericOutletSupport.html
title: GenericOutletSupport
---

# GenericOutletSupport

## Content

Package [akka.http.impl.engine.http2](package-summary.html)
## Interface GenericOutletSupport

- ---

```
public interface GenericOutletSupport
```

INTERNAL API

- - ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `<T> [GenericOutlet](GenericOutlet.html "interface in akka.http.impl.engine.http2")<T>` | `[fromOutlet](#fromOutlet(akka.stream.Outlet))​(akka.stream.Outlet<T> outlet)` |  |
	| `<T> [GenericOutlet](GenericOutlet.html "interface in akka.http.impl.engine.http2")<T>` | `[fromSubSourceOutlet](#fromSubSourceOutlet(akka.stream.stage.GraphStageLogic.SubSourceOutlet))​(akka.stream.stage.GraphStageLogic.SubSourceOutlet<T> subSourceOutlet)` |  |

- - ### Method Detail
	
	
	
		- #### fromOutlet
		
		
		
		```
		<T> [GenericOutlet](GenericOutlet.html "interface in akka.http.impl.engine.http2")<T> fromOutlet​(akka.stream.Outlet<T> outlet)
		```
		- #### fromSubSourceOutlet
		
		
		
		```
		<T> [GenericOutlet](GenericOutlet.html "interface in akka.http.impl.engine.http2")<T> fromSubSourceOutlet​(akka.stream.stage.GraphStageLogic.SubSourceOutlet<T> subSourceOutlet)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/http2/GenericOutlet.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/http2/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/http2/GenericOutletSupport.html](https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/http2/GenericOutletSupport.html)*