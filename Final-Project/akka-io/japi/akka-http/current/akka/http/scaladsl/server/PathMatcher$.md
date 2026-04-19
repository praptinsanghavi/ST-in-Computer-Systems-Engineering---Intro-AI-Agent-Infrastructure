---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T00:38:53Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/PathMatcher$.html
title: PathMatcher$
---

# PathMatcher$

## Content

Package [akka.http.scaladsl.server](package-summary.html)
## Class PathMatcher$

- java.lang.Object
- - akka.http.scaladsl.server.PathMatcher$

- All Implemented Interfaces:
`[ImplicitPathMatcherConstruction](ImplicitPathMatcherConstruction.html "interface in akka.http.scaladsl.server")`

---

```
public class PathMatcher$
extends java.lang.Object
implements [ImplicitPathMatcherConstruction](ImplicitPathMatcherConstruction.html "interface in akka.http.scaladsl.server")
```

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [PathMatcher$](PathMatcher$.html "class in akka.http.scaladsl.server")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[PathMatcher$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `<L> [PathMatcher](PathMatcher.html "class in akka.http.scaladsl.server")<L>` | `[apply](#apply(akka.http.scaladsl.model.Uri.Path,L,akka.http.scaladsl.server.util.Tuple))​([Uri.Path](../model/Uri.Path.html "class in akka.http.scaladsl.model") prefix,  L extractions,  [Tuple](util/Tuple.html "interface in akka.http.scaladsl.server.util")<L> evidence$18)` | Creates a PathMatcher that matches and consumes the given path prefix and extracts the given list of extractions. |
	| `<L> [PathMatcher](PathMatcher.html "class in akka.http.scaladsl.server")<L>` | `[apply](#apply(akka.http.scaladsl.server.PathMatcher))​([PathMatcher](PathMatcher.html "class in akka.http.scaladsl.server")<L> magnet)` | Provoke implicit conversions to PathMatcher to be applied |
	| `[PathMatcher.Matched](PathMatcher.Matched.html "class in akka.http.scaladsl.server")<scala.Tuple1<java.lang.String>>` | `[EmptyMatch](#EmptyMatch())()` | The empty match returned when a Regex matcher matches the empty path |
	| `<L> [PathMatcher](PathMatcher.html "class in akka.http.scaladsl.server")<L>` | `[provide](#provide(L,akka.http.scaladsl.server.util.Tuple))​(L extractions,  [Tuple](util/Tuple.html "interface in akka.http.scaladsl.server.util")<L> evidence$17)` | Creates a PathMatcher that always matches, consumes nothing and extracts the given Tuple of values. |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`
		- ### Methods inherited from interface akka.http.scaladsl.server.[ImplicitPathMatcherConstruction](ImplicitPathMatcherConstruction.html "interface in akka.http.scaladsl.server")
		
		
		`[_regex2PathMatcher](ImplicitPathMatcherConstruction.html#_regex2PathMatcher(scala.util.matching.Regex)), [_segmentStringToPathMatcher](ImplicitPathMatcherConstruction.html#_segmentStringToPathMatcher(java.lang.String)), [_stringExtractionPair2PathMatcher](ImplicitPathMatcherConstruction.html#_stringExtractionPair2PathMatcher(scala.Tuple2)), [_stringNameOptionReceptacle2PathMatcher](ImplicitPathMatcherConstruction.html#_stringNameOptionReceptacle2PathMatcher(akka.http.scaladsl.common.NameOptionReceptacle)), [_valueMap2PathMatcher](ImplicitPathMatcherConstruction.html#_valueMap2PathMatcher(scala.collection.immutable.Map))`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [PathMatcher$](PathMatcher$.html "class in akka.http.scaladsl.server") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### PathMatcher$
		
		
		
		```
		public PathMatcher$()
		```

	- ### Method Detail
	
	
	
		- #### provide
		
		
		
		```
		public <L> [PathMatcher](PathMatcher.html "class in akka.http.scaladsl.server")<L> provide​(L extractions,
		                                  [Tuple](util/Tuple.html "interface in akka.http.scaladsl.server.util")<L> evidence$17)
		```
		
		Creates a PathMatcher that always matches, consumes nothing and extracts the given Tuple of values.
		
		Parameters:
		`extractions` \- (undocumented)
		`evidence$17` \- (undocumented)
		Returns:
		(undocumented)
		- #### apply
		
		
		
		```
		public <L> [PathMatcher](PathMatcher.html "class in akka.http.scaladsl.server")<L> apply​([Uri.Path](../model/Uri.Path.html "class in akka.http.scaladsl.model") prefix,
		                                L extractions,
		                                [Tuple](util/Tuple.html "interface in akka.http.scaladsl.server.util")<L> evidence$18)
		```
		
		Creates a PathMatcher that matches and consumes the given path prefix and extracts the given list of extractions.
		 If the given prefix is empty the returned PathMatcher matches always and consumes nothing.
		
		Parameters:
		`prefix` \- (undocumented)
		`extractions` \- (undocumented)
		`evidence$18` \- (undocumented)
		Returns:
		(undocumented)
		- #### apply
		
		
		
		```
		public <L> [PathMatcher](PathMatcher.html "class in akka.http.scaladsl.server")<L> apply​([PathMatcher](PathMatcher.html "class in akka.http.scaladsl.server")<L> magnet)
		```
		
		Provoke implicit conversions to PathMatcher to be applied
		- #### EmptyMatch
		
		
		
		```
		public [PathMatcher.Matched](PathMatcher.Matched.html "class in akka.http.scaladsl.server")<scala.Tuple1<java.lang.String>> EmptyMatch()
		```
		
		The empty match returned when a Regex matcher matches the empty path

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/Uri.Path.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/ImplicitPathMatcherConstruction.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/PathMatcher$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/PathMatcher.Matched.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/PathMatcher.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/package-summary.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/util/Tuple.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/PathMatcher$.html](https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/PathMatcher$.html)*