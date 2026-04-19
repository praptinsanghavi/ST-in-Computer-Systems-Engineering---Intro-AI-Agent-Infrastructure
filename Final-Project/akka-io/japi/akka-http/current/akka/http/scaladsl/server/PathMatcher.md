---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T00:38:52Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/PathMatcher.Unmatched$.html
title: PathMatcher.Unmatched$
---

# PathMatcher.Unmatched$

## Content

Package [akka.http.scaladsl.server](package-summary.html)
## Class PathMatcher.Unmatched$

- java.lang.Object
- - [akka.http.scaladsl.server.PathMatcher.Matching](PathMatcher.Matching.html "class in akka.http.scaladsl.server")\<scala.runtime.Nothing$\>
	- - akka.http.scaladsl.server.PathMatcher.Unmatched$

- All Implemented Interfaces:
`java.io.Serializable`, `scala.Equals`, `scala.Product`

Enclosing class:
[PathMatcher](PathMatcher.html "class in akka.http.scaladsl.server")\<[L](PathMatcher.html "type parameter in PathMatcher")\>

---

```
public static class PathMatcher.Unmatched$
extends [PathMatcher.Matching](PathMatcher.Matching.html "class in akka.http.scaladsl.server")<scala.runtime.Nothing$>
implements scala.Product, java.io.Serializable
```

See Also:
[Serialized Form](../../../../serialized-form.html#akka.http.scaladsl.server.PathMatcher.Unmatched$)

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [PathMatcher.Unmatched$](PathMatcher.Unmatched$.html "class in akka.http.scaladsl.server")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[Unmatched$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `<R> [PathMatcher.Unmatched$](PathMatcher.Unmatched$.html "class in akka.http.scaladsl.server")` | `[andThen](#andThen(scala.Function2,akka.http.scaladsl.server.util.Tuple))​(scala.Function2<[Uri.Path](../model/Uri.Path.html "class in akka.http.scaladsl.model"),​scala.runtime.Nothing$,​[PathMatcher.Matching](PathMatcher.Matching.html "class in akka.http.scaladsl.server")<R>> f,  [Tuple](util/Tuple.html "interface in akka.http.scaladsl.server.util")<R> evidence$16)` |  |
	| `<R> [PathMatcher.Unmatched$](PathMatcher.Unmatched$.html "class in akka.http.scaladsl.server")` | `[flatMap](#flatMap(scala.Function1,akka.http.scaladsl.server.util.Tuple))​(scala.Function1<scala.runtime.Nothing$,​scala.Option<R>> f,  [Tuple](util/Tuple.html "interface in akka.http.scaladsl.server.util")<R> evidence$15)` |  |
	| `<R> [PathMatcher.Unmatched$](PathMatcher.Unmatched$.html "class in akka.http.scaladsl.server")` | `[map](#map(scala.Function1,akka.http.scaladsl.server.util.Tuple))​(scala.Function1<scala.runtime.Nothing$,​R> f,  [Tuple](util/Tuple.html "interface in akka.http.scaladsl.server.util")<R> evidence$14)` |  |
	| `<R> [PathMatcher.Matching](PathMatcher.Matching.html "class in akka.http.scaladsl.server")<R>` | `[orElse](#orElse(scala.Function0))​(scala.Function0<[PathMatcher.Matching](PathMatcher.Matching.html "class in akka.http.scaladsl.server")<R>> other)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`
		- ### Methods inherited from interface scala.Equals
		
		
		`canEqual, equals`
		- ### Methods inherited from interface scala.Product
		
		
		`productArity, productElement, productElementName, productElementNames, productIterator, productPrefix`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [PathMatcher.Unmatched$](PathMatcher.Unmatched$.html "class in akka.http.scaladsl.server") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### Unmatched$
		
		
		
		```
		public Unmatched$()
		```

	- ### Method Detail
	
	
	
		- #### map
		
		
		
		```
		public <R> [PathMatcher.Unmatched$](PathMatcher.Unmatched$.html "class in akka.http.scaladsl.server") map​(scala.Function1<scala.runtime.Nothing$,​R> f,
		                                      [Tuple](util/Tuple.html "interface in akka.http.scaladsl.server.util")<R> evidence$14)
		```
		- #### flatMap
		
		
		
		```
		public <R> [PathMatcher.Unmatched$](PathMatcher.Unmatched$.html "class in akka.http.scaladsl.server") flatMap​(scala.Function1<scala.runtime.Nothing$,​scala.Option<R>> f,
		                                          [Tuple](util/Tuple.html "interface in akka.http.scaladsl.server.util")<R> evidence$15)
		```
		- #### andThen
		
		
		
		```
		public <R> [PathMatcher.Unmatched$](PathMatcher.Unmatched$.html "class in akka.http.scaladsl.server") andThen​(scala.Function2<[Uri.Path](../model/Uri.Path.html "class in akka.http.scaladsl.model"),​scala.runtime.Nothing$,​[PathMatcher.Matching](PathMatcher.Matching.html "class in akka.http.scaladsl.server")<R>> f,
		                                          [Tuple](util/Tuple.html "interface in akka.http.scaladsl.server.util")<R> evidence$16)
		```
		- #### orElse
		
		
		
		```
		public <R> [PathMatcher.Matching](PathMatcher.Matching.html "class in akka.http.scaladsl.server")<R> orElse​(scala.Function0<[PathMatcher.Matching](PathMatcher.Matching.html "class in akka.http.scaladsl.server")<R>> other)
		```
		
		
		Specified by:
		`[orElse](PathMatcher.Matching.html#orElse(scala.Function0))` in class `[PathMatcher.Matching](PathMatcher.Matching.html "class in akka.http.scaladsl.server")<scala.runtime.Nothing$>`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/Uri.Path.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/PathMatcher.Matching.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/PathMatcher.Unmatched$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/PathMatcher.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/package-summary.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/util/Tuple.html
- https://doc.akka.io/japi/akka-http/current/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/PathMatcher.Unmatched$.html](https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/PathMatcher.Unmatched$.html)*