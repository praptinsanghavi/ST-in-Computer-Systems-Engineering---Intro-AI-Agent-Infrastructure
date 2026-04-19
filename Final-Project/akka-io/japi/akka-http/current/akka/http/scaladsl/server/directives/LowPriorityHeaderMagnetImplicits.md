---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T00:39:59Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/directives/LowPriorityHeaderMagnetImplicits.html
title: LowPriorityHeaderMagnetImplicits
---

# LowPriorityHeaderMagnetImplicits

## Content

Package [akka.http.scaladsl.server.directives](package-summary.html)
## Interface LowPriorityHeaderMagnetImplicits

- All Known Implementing Classes:
`[HeaderMagnet$](HeaderMagnet$.html "class in akka.http.scaladsl.server.directives")`

---

```
public interface LowPriorityHeaderMagnetImplicits
```

- - ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) [Deprecated Methods](javascript:show(32);) 
	| Modifier and Type | Method | Description |
	| `<T extends [HttpHeader](../../model/HttpHeader.html "class in akka.http.scaladsl.model")>[HeaderMagnet](HeaderMagnet.html "interface in akka.http.scaladsl.server.directives")<T>` | `[fromClassNormalHeader](#fromClassNormalHeader(java.lang.Class))​(java.lang.Class<T> clazz)` |  |
	| `<T extends [HttpHeader](../../../javadsl/model/HttpHeader.html "class in akka.http.javadsl.model")>[HeaderMagnet](HeaderMagnet.html "interface in akka.http.scaladsl.server.directives")<T>` | `[fromClassNormalJavaHeader](#fromClassNormalJavaHeader(java.lang.Class))​(java.lang.Class<T> clazz)` |  |
	| `<T extends [HttpHeader](../../model/HttpHeader.html "class in akka.http.scaladsl.model")>[HeaderMagnet](HeaderMagnet.html "interface in akka.http.scaladsl.server.directives")<T>` | `[fromClassTagNormalHeader](#fromClassTagNormalHeader(scala.reflect.ClassTag))​(scala.reflect.ClassTag<T> tag)` |  |
	| `<T extends [HttpHeader](../../model/HttpHeader.html "class in akka.http.scaladsl.model")>[HeaderMagnet](HeaderMagnet.html "interface in akka.http.scaladsl.server.directives")<T>` | `[fromCompanionNormalHeader](#fromCompanionNormalHeader(akka.http.scaladsl.model.headers.ModeledCompanion,scala.reflect.ClassTag))​([ModeledCompanion](../../model/headers/ModeledCompanion.html "class in akka.http.scaladsl.model.headers")<T> companion,  scala.reflect.ClassTag<T> tag)` |  |
	| `<T extends [HttpHeader](../../model/HttpHeader.html "class in akka.http.scaladsl.model")>[HeaderMagnet](HeaderMagnet.html "interface in akka.http.scaladsl.server.directives")<T>` | `[fromUnitNormalHeader](#fromUnitNormalHeader(scala.runtime.BoxedUnit,scala.reflect.ClassTag))​(scala.runtime.BoxedUnit u,  scala.reflect.ClassTag<T> tag)` | Deprecated. Pass the companion object to headerValueByType as a parameter instead, e.g. |

- - ### Method Detail
	
	
	
		- #### fromClassNormalHeader
		
		
		
		```
		<T extends [HttpHeader](../../model/HttpHeader.html "class in akka.http.scaladsl.model")> [HeaderMagnet](HeaderMagnet.html "interface in akka.http.scaladsl.server.directives")<T> fromClassNormalHeader​(java.lang.Class<T> clazz)
		```
		- #### fromClassNormalJavaHeader
		
		
		
		```
		<T extends [HttpHeader](../../../javadsl/model/HttpHeader.html "class in akka.http.javadsl.model")> [HeaderMagnet](HeaderMagnet.html "interface in akka.http.scaladsl.server.directives")<T> fromClassNormalJavaHeader​(java.lang.Class<T> clazz)
		```
		- #### fromClassTagNormalHeader
		
		
		
		```
		<T extends [HttpHeader](../../model/HttpHeader.html "class in akka.http.scaladsl.model")> [HeaderMagnet](HeaderMagnet.html "interface in akka.http.scaladsl.server.directives")<T> fromClassTagNormalHeader​(scala.reflect.ClassTag<T> tag)
		```
		- #### fromCompanionNormalHeader
		
		
		
		```
		<T extends [HttpHeader](../../model/HttpHeader.html "class in akka.http.scaladsl.model")> [HeaderMagnet](HeaderMagnet.html "interface in akka.http.scaladsl.server.directives")<T> fromCompanionNormalHeader​([ModeledCompanion](../../model/headers/ModeledCompanion.html "class in akka.http.scaladsl.model.headers")<T> companion,
		                                                                 scala.reflect.ClassTag<T> tag)
		```
		- #### fromUnitNormalHeader
		
		
		
		```
		<T extends [HttpHeader](../../model/HttpHeader.html "class in akka.http.scaladsl.model")> [HeaderMagnet](HeaderMagnet.html "interface in akka.http.scaladsl.server.directives")<T> fromUnitNormalHeader​(scala.runtime.BoxedUnit u,
		                                                            scala.reflect.ClassTag<T> tag)
		```
		
		Deprecated.
		Pass the companion object to headerValueByType as a parameter instead, e.g. \`headerValueByType(Origin)\` instead of \`headerValueByType\[Origin](())\`. Since 10\.2\.0\.

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/HttpHeader.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/HttpHeader.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/ModeledCompanion.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/directives/HeaderMagnet$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/directives/HeaderMagnet.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/directives/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/directives/LowPriorityHeaderMagnetImplicits.html](https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/directives/LowPriorityHeaderMagnetImplicits.html)*