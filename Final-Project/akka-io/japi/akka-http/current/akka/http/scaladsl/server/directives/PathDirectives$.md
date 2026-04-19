---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T00:40:52Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/directives/PathDirectives$.html
title: PathDirectives$
---

# PathDirectives$

## Content

Package [akka.http.scaladsl.server.directives](package-summary.html)
## Class PathDirectives$

- java.lang.Object
- - akka.http.scaladsl.server.directives.PathDirectives$

- All Implemented Interfaces:
`[ToNameReceptacleEnhancements](../../common/ToNameReceptacleEnhancements.html "interface in akka.http.scaladsl.common")`, `[PathDirectives](PathDirectives.html "interface in akka.http.scaladsl.server.directives")`, `[ImplicitPathMatcherConstruction](../ImplicitPathMatcherConstruction.html "interface in akka.http.scaladsl.server")`, `[PathMatchers](../PathMatchers.html "interface in akka.http.scaladsl.server")`

---

```
public class PathDirectives$
extends java.lang.Object
implements [PathDirectives](PathDirectives.html "interface in akka.http.scaladsl.server.directives")
```

- - ### Nested Class Summary
	
	
		- ### Nested classes/interfaces inherited from interface akka.http.scaladsl.server.directives.[PathDirectives](PathDirectives.html "interface in akka.http.scaladsl.server.directives")
		
		
		`[PathDirectives.TrailingRetryRejection$](PathDirectives.TrailingRetryRejection$.html "class in akka.http.scaladsl.server.directives")`
		- ### Nested classes/interfaces inherited from interface akka.http.scaladsl.server.[PathMatchers](../PathMatchers.html "interface in akka.http.scaladsl.server")
		
		
		`[PathMatchers.HexIntNumber$](../PathMatchers.HexIntNumber$.html "class in akka.http.scaladsl.server"), [PathMatchers.HexLongNumber$](../PathMatchers.HexLongNumber$.html "class in akka.http.scaladsl.server"), [PathMatchers.IntNumber$](../PathMatchers.IntNumber$.html "class in akka.http.scaladsl.server"), [PathMatchers.LongNumber$](../PathMatchers.LongNumber$.html "class in akka.http.scaladsl.server"), [PathMatchers.NumberMatcher](../PathMatchers.NumberMatcher.html "class in akka.http.scaladsl.server")<[T](../PathMatchers.NumberMatcher.html "type parameter in PathMatchers.NumberMatcher")>, [PathMatchers.PathEnd$](../PathMatchers.PathEnd$.html "class in akka.http.scaladsl.server"), [PathMatchers.Remaining$](../PathMatchers.Remaining$.html "class in akka.http.scaladsl.server"), [PathMatchers.RemainingPath$](../PathMatchers.RemainingPath$.html "class in akka.http.scaladsl.server"), [PathMatchers.Segment$](../PathMatchers.Segment$.html "class in akka.http.scaladsl.server"), [PathMatchers.Slash$](../PathMatchers.Slash$.html "class in akka.http.scaladsl.server")`

	- ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [PathDirectives$](PathDirectives$.html "class in akka.http.scaladsl.server.directives")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[PathDirectives$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[PathMatcher](../PathMatcher.html "class in akka.http.scaladsl.server")<scala.Tuple1<java.lang.Object>>` | `[DoubleNumber](#DoubleNumber())()` |  |
	| `[PathMatchers.HexIntNumber$](../PathMatchers.HexIntNumber$.html "class in akka.http.scaladsl.server")` | `[HexIntNumber](#HexIntNumber())()` | Accessor for nested Scala object |
	| `[PathMatchers.HexLongNumber$](../PathMatchers.HexLongNumber$.html "class in akka.http.scaladsl.server")` | `[HexLongNumber](#HexLongNumber())()` | Accessor for nested Scala object |
	| `[PathMatchers.IntNumber$](../PathMatchers.IntNumber$.html "class in akka.http.scaladsl.server")` | `[IntNumber](#IntNumber())()` | Accessor for nested Scala object |
	| `[PathMatcher](../PathMatcher.html "class in akka.http.scaladsl.server")<scala.Tuple1<java.util.UUID>>` | `[JavaUUID](#JavaUUID())()` |  |
	| `[PathMatchers.LongNumber$](../PathMatchers.LongNumber$.html "class in akka.http.scaladsl.server")` | `[LongNumber](#LongNumber())()` | Accessor for nested Scala object |
	| `[PathMatcher](../PathMatcher.html "class in akka.http.scaladsl.server")<scala.runtime.BoxedUnit>` | `[Neutral](#Neutral())()` |  |
	| `[PathMatchers.PathEnd$](../PathMatchers.PathEnd$.html "class in akka.http.scaladsl.server")` | `[PathEnd](#PathEnd())()` | Accessor for nested Scala object |
	| `[PathMatchers.Remaining$](../PathMatchers.Remaining$.html "class in akka.http.scaladsl.server")` | `[Remaining](#Remaining())()` | Accessor for nested Scala object |
	| `[PathMatchers.RemainingPath$](../PathMatchers.RemainingPath$.html "class in akka.http.scaladsl.server")` | `[RemainingPath](#RemainingPath())()` | Accessor for nested Scala object |
	| `[PathMatchers.Segment$](../PathMatchers.Segment$.html "class in akka.http.scaladsl.server")` | `[Segment](#Segment())()` | Accessor for nested Scala object |
	| `[PathMatcher](../PathMatcher.html "class in akka.http.scaladsl.server")<scala.Tuple1<scala.collection.immutable.List<java.lang.String>>>` | `[Segments](#Segments())()` |  |
	| `[PathMatchers.Slash$](../PathMatchers.Slash$.html "class in akka.http.scaladsl.server")` | `[Slash](#Slash())()` | Accessor for nested Scala object |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`
		- ### Methods inherited from interface akka.http.scaladsl.server.[ImplicitPathMatcherConstruction](../ImplicitPathMatcherConstruction.html "interface in akka.http.scaladsl.server")
		
		
		`[_regex2PathMatcher](../ImplicitPathMatcherConstruction.html#_regex2PathMatcher(scala.util.matching.Regex)), [_segmentStringToPathMatcher](../ImplicitPathMatcherConstruction.html#_segmentStringToPathMatcher(java.lang.String)), [_stringExtractionPair2PathMatcher](../ImplicitPathMatcherConstruction.html#_stringExtractionPair2PathMatcher(scala.Tuple2)), [_stringNameOptionReceptacle2PathMatcher](../ImplicitPathMatcherConstruction.html#_stringNameOptionReceptacle2PathMatcher(akka.http.scaladsl.common.NameOptionReceptacle)), [_valueMap2PathMatcher](../ImplicitPathMatcherConstruction.html#_valueMap2PathMatcher(scala.collection.immutable.Map))`
		- ### Methods inherited from interface akka.http.scaladsl.server.directives.[PathDirectives](PathDirectives.html "interface in akka.http.scaladsl.server.directives")
		
		
		`[ignoreTrailingSlash](PathDirectives.html#ignoreTrailingSlash()), [path](PathDirectives.html#path(akka.http.scaladsl.server.PathMatcher)), [pathEnd](PathDirectives.html#pathEnd()), [pathEndOrSingleSlash](PathDirectives.html#pathEndOrSingleSlash()), [pathPrefix](PathDirectives.html#pathPrefix(akka.http.scaladsl.server.PathMatcher)), [pathPrefixTest](PathDirectives.html#pathPrefixTest(akka.http.scaladsl.server.PathMatcher)), [pathSingleSlash](PathDirectives.html#pathSingleSlash()), [pathSuffix](PathDirectives.html#pathSuffix(akka.http.scaladsl.server.PathMatcher)), [pathSuffixTest](PathDirectives.html#pathSuffixTest(akka.http.scaladsl.server.PathMatcher)), [rawPathPrefix](PathDirectives.html#rawPathPrefix(akka.http.scaladsl.server.PathMatcher)), [rawPathPrefixTest](PathDirectives.html#rawPathPrefixTest(akka.http.scaladsl.server.PathMatcher)), [redirectToNoTrailingSlashIfPresent](PathDirectives.html#redirectToNoTrailingSlashIfPresent(akka.http.scaladsl.model.StatusCodes.Redirection)), [redirectToTrailingSlashIfMissing](PathDirectives.html#redirectToTrailingSlashIfMissing(akka.http.scaladsl.model.StatusCodes.Redirection))`
		- ### Methods inherited from interface akka.http.scaladsl.server.[PathMatchers](../PathMatchers.html "interface in akka.http.scaladsl.server")
		
		
		`[not](../PathMatchers.html#not(akka.http.scaladsl.server.PathMatcher)), [nothingMatcher](../PathMatchers.html#nothingMatcher(akka.http.scaladsl.server.util.Tuple)), [Segments](../PathMatchers.html#Segments(int)), [Segments](../PathMatchers.html#Segments(int,int)), [separateOnSlashes](../PathMatchers.html#separateOnSlashes(java.lang.String))`
		- ### Methods inherited from interface akka.http.scaladsl.common.[ToNameReceptacleEnhancements](../../common/ToNameReceptacleEnhancements.html "interface in akka.http.scaladsl.common")
		
		
		`[_string2NR](../../common/ToNameReceptacleEnhancements.html#_string2NR(java.lang.String)), [_symbol2NR](../../common/ToNameReceptacleEnhancements.html#_symbol2NR(scala.Symbol))`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [PathDirectives$](PathDirectives$.html "class in akka.http.scaladsl.server.directives") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### PathDirectives$
		
		
		
		```
		public PathDirectives$()
		```

	- ### Method Detail
	
	
	
		- #### Slash
		
		
		
		```
		public [PathMatchers.Slash$](../PathMatchers.Slash$.html "class in akka.http.scaladsl.server") Slash()
		```
		
		Description copied from interface: `[PathMatchers](../PathMatchers.html#Slash())`
		Accessor for nested Scala object
		
		Specified by:
		`[Slash](../PathMatchers.html#Slash())` in interface `[PathMatchers](../PathMatchers.html "interface in akka.http.scaladsl.server")`
		Returns:
		(undocumented)
		- #### PathEnd
		
		
		
		```
		public [PathMatchers.PathEnd$](../PathMatchers.PathEnd$.html "class in akka.http.scaladsl.server") PathEnd()
		```
		
		Description copied from interface: `[PathMatchers](../PathMatchers.html#PathEnd())`
		Accessor for nested Scala object
		
		Specified by:
		`[PathEnd](../PathMatchers.html#PathEnd())` in interface `[PathMatchers](../PathMatchers.html "interface in akka.http.scaladsl.server")`
		Returns:
		(undocumented)
		- #### Remaining
		
		
		
		```
		public [PathMatchers.Remaining$](../PathMatchers.Remaining$.html "class in akka.http.scaladsl.server") Remaining()
		```
		
		Description copied from interface: `[PathMatchers](../PathMatchers.html#Remaining())`
		Accessor for nested Scala object
		
		Specified by:
		`[Remaining](../PathMatchers.html#Remaining())` in interface `[PathMatchers](../PathMatchers.html "interface in akka.http.scaladsl.server")`
		Returns:
		(undocumented)
		- #### RemainingPath
		
		
		
		```
		public [PathMatchers.RemainingPath$](../PathMatchers.RemainingPath$.html "class in akka.http.scaladsl.server") RemainingPath()
		```
		
		Description copied from interface: `[PathMatchers](../PathMatchers.html#RemainingPath())`
		Accessor for nested Scala object
		
		Specified by:
		`[RemainingPath](../PathMatchers.html#RemainingPath())` in interface `[PathMatchers](../PathMatchers.html "interface in akka.http.scaladsl.server")`
		Returns:
		(undocumented)
		- #### IntNumber
		
		
		
		```
		public [PathMatchers.IntNumber$](../PathMatchers.IntNumber$.html "class in akka.http.scaladsl.server") IntNumber()
		```
		
		Description copied from interface: `[PathMatchers](../PathMatchers.html#IntNumber())`
		Accessor for nested Scala object
		
		Specified by:
		`[IntNumber](../PathMatchers.html#IntNumber())` in interface `[PathMatchers](../PathMatchers.html "interface in akka.http.scaladsl.server")`
		Returns:
		(undocumented)
		- #### LongNumber
		
		
		
		```
		public [PathMatchers.LongNumber$](../PathMatchers.LongNumber$.html "class in akka.http.scaladsl.server") LongNumber()
		```
		
		Description copied from interface: `[PathMatchers](../PathMatchers.html#LongNumber())`
		Accessor for nested Scala object
		
		Specified by:
		`[LongNumber](../PathMatchers.html#LongNumber())` in interface `[PathMatchers](../PathMatchers.html "interface in akka.http.scaladsl.server")`
		Returns:
		(undocumented)
		- #### HexIntNumber
		
		
		
		```
		public [PathMatchers.HexIntNumber$](../PathMatchers.HexIntNumber$.html "class in akka.http.scaladsl.server") HexIntNumber()
		```
		
		Description copied from interface: `[PathMatchers](../PathMatchers.html#HexIntNumber())`
		Accessor for nested Scala object
		
		Specified by:
		`[HexIntNumber](../PathMatchers.html#HexIntNumber())` in interface `[PathMatchers](../PathMatchers.html "interface in akka.http.scaladsl.server")`
		Returns:
		(undocumented)
		- #### HexLongNumber
		
		
		
		```
		public [PathMatchers.HexLongNumber$](../PathMatchers.HexLongNumber$.html "class in akka.http.scaladsl.server") HexLongNumber()
		```
		
		Description copied from interface: `[PathMatchers](../PathMatchers.html#HexLongNumber())`
		Accessor for nested Scala object
		
		Specified by:
		`[HexLongNumber](../PathMatchers.html#HexLongNumber())` in interface `[PathMatchers](../PathMatchers.html "interface in akka.http.scaladsl.server")`
		Returns:
		(undocumented)
		- #### DoubleNumber
		
		
		
		```
		public [PathMatcher](../PathMatcher.html "class in akka.http.scaladsl.server")<scala.Tuple1<java.lang.Object>> DoubleNumber()
		```
		
		
		Specified by:
		`[DoubleNumber](../PathMatchers.html#DoubleNumber())` in interface `[PathMatchers](../PathMatchers.html "interface in akka.http.scaladsl.server")`
		- #### JavaUUID
		
		
		
		```
		public [PathMatcher](../PathMatcher.html "class in akka.http.scaladsl.server")<scala.Tuple1<java.util.UUID>> JavaUUID()
		```
		
		
		Specified by:
		`[JavaUUID](../PathMatchers.html#JavaUUID())` in interface `[PathMatchers](../PathMatchers.html "interface in akka.http.scaladsl.server")`
		- #### Neutral
		
		
		
		```
		public [PathMatcher](../PathMatcher.html "class in akka.http.scaladsl.server")<scala.runtime.BoxedUnit> Neutral()
		```
		
		
		Specified by:
		`[Neutral](../PathMatchers.html#Neutral())` in interface `[PathMatchers](../PathMatchers.html "interface in akka.http.scaladsl.server")`
		- #### Segment
		
		
		
		```
		public [PathMatchers.Segment$](../PathMatchers.Segment$.html "class in akka.http.scaladsl.server") Segment()
		```
		
		Description copied from interface: `[PathMatchers](../PathMatchers.html#Segment())`
		Accessor for nested Scala object
		
		Specified by:
		`[Segment](../PathMatchers.html#Segment())` in interface `[PathMatchers](../PathMatchers.html "interface in akka.http.scaladsl.server")`
		Returns:
		(undocumented)
		- #### Segments
		
		
		
		```
		public [PathMatcher](../PathMatcher.html "class in akka.http.scaladsl.server")<scala.Tuple1<scala.collection.immutable.List<java.lang.String>>> Segments()
		```
		
		
		Specified by:
		`[Segments](../PathMatchers.html#Segments())` in interface `[PathMatchers](../PathMatchers.html "interface in akka.http.scaladsl.server")`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/common/ToNameReceptacleEnhancements.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/ImplicitPathMatcherConstruction.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/PathMatcher.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/PathMatchers.HexIntNumber$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/PathMatchers.HexLongNumber$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/PathMatchers.IntNumber$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/PathMatchers.LongNumber$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/PathMatchers.NumberMatcher.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/PathMatchers.PathEnd$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/PathMatchers.Remaining$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/PathMatchers.RemainingPath$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/PathMatchers.Segment$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/PathMatchers.Slash$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/PathMatchers.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/directives/PathDirectives$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/directives/PathDirectives.TrailingRetryRejection$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/directives/PathDirectives.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/directives/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/directives/PathDirectives$.html](https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/directives/PathDirectives$.html)*