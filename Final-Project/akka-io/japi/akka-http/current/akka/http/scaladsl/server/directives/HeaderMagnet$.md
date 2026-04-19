---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T00:40:39Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/directives/HeaderMagnet$.html
title: HeaderMagnet$
---

# HeaderMagnet$

## Content

Package [akka.http.scaladsl.server.directives](package-summary.html)
## Class HeaderMagnet$

- java.lang.Object
- - akka.http.scaladsl.server.directives.HeaderMagnet$

- All Implemented Interfaces:
`[LowPriorityHeaderMagnetImplicits](LowPriorityHeaderMagnetImplicits.html "interface in akka.http.scaladsl.server.directives")`

---

```
public class HeaderMagnet$
extends java.lang.Object
implements [LowPriorityHeaderMagnetImplicits](LowPriorityHeaderMagnetImplicits.html "interface in akka.http.scaladsl.server.directives")
```

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [HeaderMagnet$](HeaderMagnet$.html "class in akka.http.scaladsl.server.directives")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[HeaderMagnet$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) [Deprecated Methods](javascript:show(32);) 
	| Modifier and Type | Method | Description |
	| `<T extends [ModeledCustomHeader](../../model/headers/ModeledCustomHeader.html "class in akka.http.scaladsl.model.headers")<T>,​H extends [ModeledCustomHeaderCompanion](../../model/headers/ModeledCustomHeaderCompanion.html "class in akka.http.scaladsl.model.headers")<T>>[HeaderMagnet](HeaderMagnet.html "interface in akka.http.scaladsl.server.directives")<T>` | `[fromClassForModeledCustomHeader](#fromClassForModeledCustomHeader(java.lang.Class,akka.http.scaladsl.model.headers.ModeledCustomHeaderCompanion))​(java.lang.Class<T> clazz,  [ModeledCustomHeaderCompanion](../../model/headers/ModeledCustomHeaderCompanion.html "class in akka.http.scaladsl.model.headers")<T> companion)` |  |
	| `<T extends [ModeledCustomHeader](../../model/headers/ModeledCustomHeader.html "class in akka.http.scaladsl.model.headers")<T>,​H extends [ModeledCustomHeaderCompanion](../../model/headers/ModeledCustomHeaderCompanion.html "class in akka.http.scaladsl.model.headers")<T>>[HeaderMagnet](HeaderMagnet.html "interface in akka.http.scaladsl.server.directives")<T>` | `[fromClassTagForModeledCustomHeader](#fromClassTagForModeledCustomHeader(scala.reflect.ClassTag,akka.http.scaladsl.model.headers.ModeledCustomHeaderCompanion))​(scala.reflect.ClassTag<T> tag,  [ModeledCustomHeaderCompanion](../../model/headers/ModeledCustomHeaderCompanion.html "class in akka.http.scaladsl.model.headers")<T> companion)` |  |
	| `<T extends [ModeledCustomHeader](../../model/headers/ModeledCustomHeader.html "class in akka.http.scaladsl.model.headers")<T>,​H extends [ModeledCustomHeaderCompanion](../../model/headers/ModeledCustomHeaderCompanion.html "class in akka.http.scaladsl.model.headers")<T>>[HeaderMagnet](HeaderMagnet.html "interface in akka.http.scaladsl.server.directives")<T>` | `[fromCompanionForModeledCustomHeader](#fromCompanionForModeledCustomHeader(akka.http.scaladsl.model.headers.ModeledCustomHeaderCompanion,scala.reflect.ClassTag))​([ModeledCustomHeaderCompanion](../../model/headers/ModeledCustomHeaderCompanion.html "class in akka.http.scaladsl.model.headers")<T> companion,  scala.reflect.ClassTag<T> tag)` | If possible we want to apply the special logic for `ModeledCustomHeader` to extract custom headers by type,  otherwise the default `fromCompanion` is good enough (for headers that the parser emits in the right type already). |
	| `<T extends [ModeledCustomHeader](../../model/headers/ModeledCustomHeader.html "class in akka.http.scaladsl.model.headers")<T>,​H extends [ModeledCustomHeaderCompanion](../../model/headers/ModeledCustomHeaderCompanion.html "class in akka.http.scaladsl.model.headers")<T>>[HeaderMagnet](HeaderMagnet.html "interface in akka.http.scaladsl.server.directives")<T>` | `[fromUnitForModeledCustomHeader](#fromUnitForModeledCustomHeader(scala.runtime.BoxedUnit,scala.reflect.ClassTag,akka.http.scaladsl.model.headers.ModeledCustomHeaderCompanion))​(scala.runtime.BoxedUnit u,  scala.reflect.ClassTag<T> tag,  [ModeledCustomHeaderCompanion](../../model/headers/ModeledCustomHeaderCompanion.html "class in akka.http.scaladsl.model.headers")<T> companion)` | Deprecated. Pass the companion object to headerValueByType as a parameter instead, e.g. |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`
		- ### Methods inherited from interface akka.http.scaladsl.server.directives.[LowPriorityHeaderMagnetImplicits](LowPriorityHeaderMagnetImplicits.html "interface in akka.http.scaladsl.server.directives")
		
		
		`[fromClassNormalHeader](LowPriorityHeaderMagnetImplicits.html#fromClassNormalHeader(java.lang.Class)), [fromClassNormalJavaHeader](LowPriorityHeaderMagnetImplicits.html#fromClassNormalJavaHeader(java.lang.Class)), [fromClassTagNormalHeader](LowPriorityHeaderMagnetImplicits.html#fromClassTagNormalHeader(scala.reflect.ClassTag)), [fromCompanionNormalHeader](LowPriorityHeaderMagnetImplicits.html#fromCompanionNormalHeader(akka.http.scaladsl.model.headers.ModeledCompanion,scala.reflect.ClassTag)), [fromUnitNormalHeader](LowPriorityHeaderMagnetImplicits.html#fromUnitNormalHeader(scala.runtime.BoxedUnit,scala.reflect.ClassTag))`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [HeaderMagnet$](HeaderMagnet$.html "class in akka.http.scaladsl.server.directives") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### HeaderMagnet$
		
		
		
		```
		public HeaderMagnet$()
		```

	- ### Method Detail
	
	
	
		- #### fromCompanionForModeledCustomHeader
		
		
		
		```
		public <T extends [ModeledCustomHeader](../../model/headers/ModeledCustomHeader.html "class in akka.http.scaladsl.model.headers")<T>,​H extends [ModeledCustomHeaderCompanion](../../model/headers/ModeledCustomHeaderCompanion.html "class in akka.http.scaladsl.model.headers")<T>> [HeaderMagnet](HeaderMagnet.html "interface in akka.http.scaladsl.server.directives")<T> fromCompanionForModeledCustomHeader​([ModeledCustomHeaderCompanion](../../model/headers/ModeledCustomHeaderCompanion.html "class in akka.http.scaladsl.model.headers")<T> companion,
		                                                                                                                                              scala.reflect.ClassTag<T> tag)
		```
		
		If possible we want to apply the special logic for `ModeledCustomHeader` to extract custom headers by type,
		 otherwise the default `fromCompanion` is good enough (for headers that the parser emits in the right type already).
		
		Parameters:
		`companion` \- (undocumented)
		`tag` \- (undocumented)
		Returns:
		(undocumented)
		- #### fromUnitForModeledCustomHeader
		
		
		
		```
		public <T extends [ModeledCustomHeader](../../model/headers/ModeledCustomHeader.html "class in akka.http.scaladsl.model.headers")<T>,​H extends [ModeledCustomHeaderCompanion](../../model/headers/ModeledCustomHeaderCompanion.html "class in akka.http.scaladsl.model.headers")<T>> [HeaderMagnet](HeaderMagnet.html "interface in akka.http.scaladsl.server.directives")<T> fromUnitForModeledCustomHeader​(scala.runtime.BoxedUnit u,
		                                                                                                                                         scala.reflect.ClassTag<T> tag,
		                                                                                                                                         [ModeledCustomHeaderCompanion](../../model/headers/ModeledCustomHeaderCompanion.html "class in akka.http.scaladsl.model.headers")<T> companion)
		```
		
		Deprecated.
		Pass the companion object to headerValueByType as a parameter instead, e.g. \`headerValueByType(Origin)\` instead of \`headerValueByType\[Origin](())\`. Since 10\.2\.0\.
		- #### fromClassForModeledCustomHeader
		
		
		
		```
		public <T extends [ModeledCustomHeader](../../model/headers/ModeledCustomHeader.html "class in akka.http.scaladsl.model.headers")<T>,​H extends [ModeledCustomHeaderCompanion](../../model/headers/ModeledCustomHeaderCompanion.html "class in akka.http.scaladsl.model.headers")<T>> [HeaderMagnet](HeaderMagnet.html "interface in akka.http.scaladsl.server.directives")<T> fromClassForModeledCustomHeader​(java.lang.Class<T> clazz,
		                                                                                                                                          [ModeledCustomHeaderCompanion](../../model/headers/ModeledCustomHeaderCompanion.html "class in akka.http.scaladsl.model.headers")<T> companion)
		```
		- #### fromClassTagForModeledCustomHeader
		
		
		
		```
		public <T extends [ModeledCustomHeader](../../model/headers/ModeledCustomHeader.html "class in akka.http.scaladsl.model.headers")<T>,​H extends [ModeledCustomHeaderCompanion](../../model/headers/ModeledCustomHeaderCompanion.html "class in akka.http.scaladsl.model.headers")<T>> [HeaderMagnet](HeaderMagnet.html "interface in akka.http.scaladsl.server.directives")<T> fromClassTagForModeledCustomHeader​(scala.reflect.ClassTag<T> tag,
		                                                                                                                                             [ModeledCustomHeaderCompanion](../../model/headers/ModeledCustomHeaderCompanion.html "class in akka.http.scaladsl.model.headers")<T> companion)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/ModeledCustomHeader.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/ModeledCustomHeaderCompanion.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/directives/HeaderMagnet$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/directives/HeaderMagnet.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/directives/LowPriorityHeaderMagnetImplicits.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/directives/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/directives/HeaderMagnet$.html](https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/directives/HeaderMagnet$.html)*