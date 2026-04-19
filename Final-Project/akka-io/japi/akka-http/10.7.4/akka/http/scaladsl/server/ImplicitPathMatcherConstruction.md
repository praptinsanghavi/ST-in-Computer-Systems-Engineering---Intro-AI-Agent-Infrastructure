---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T02:09:46Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/server/ImplicitPathMatcherConstruction.html
title: ImplicitPathMatcherConstruction
---

# ImplicitPathMatcherConstruction

## Content

Package [akka.http.scaladsl.server](package-summary.html)
## Interface ImplicitPathMatcherConstruction

- All Known Subinterfaces:
`[Directives](Directives.html "interface in akka.http.scaladsl.server")`, `[PathDirectives](directives/PathDirectives.html "interface in akka.http.scaladsl.server.directives")`

All Known Implementing Classes:
`[Directives$](Directives$.html "class in akka.http.scaladsl.server")`, `[HttpApp](HttpApp.html "class in akka.http.scaladsl.server")`, `[PathDirectives$](directives/PathDirectives$.html "class in akka.http.scaladsl.server.directives")`, `[PathMatcher$](PathMatcher$.html "class in akka.http.scaladsl.server")`

---

```
public interface ImplicitPathMatcherConstruction
```

- - ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `[PathMatcher](PathMatcher.html "class in akka.http.scaladsl.server")<scala.Tuple1<java.lang.String>>` | `[_regex2PathMatcher](#_regex2PathMatcher(scala.util.matching.Regex))​(scala.util.matching.Regex regex)` | Creates a PathMatcher that consumes (a prefix of) the first path segment  if the path begins with a segment (a prefix of) which matches the given regex. |
	| `[PathMatcher](PathMatcher.html "class in akka.http.scaladsl.server")<scala.runtime.BoxedUnit>` | `[_segmentStringToPathMatcher](#_segmentStringToPathMatcher(java.lang.String))​(java.lang.String segment)` | Creates a PathMatcher that consumes (a prefix of) the first path segment  (if the path begins with a segment). |
	| `<T> [PathMatcher](PathMatcher.html "class in akka.http.scaladsl.server")<scala.Tuple1<T>>` | `[_stringExtractionPair2PathMatcher](#_stringExtractionPair2PathMatcher(scala.Tuple2))​(scala.Tuple2<java.lang.String,​T> tuple)` | Creates a PathMatcher that consumes (a prefix of) the first path segment  (if the path begins with a segment) and extracts a given value. |
	| `[PathMatcher](PathMatcher.html "class in akka.http.scaladsl.server")<scala.runtime.BoxedUnit>` | `[_stringNameOptionReceptacle2PathMatcher](#_stringNameOptionReceptacle2PathMatcher(akka.http.scaladsl.common.NameOptionReceptacle))​([NameOptionReceptacle](../common/NameOptionReceptacle.html "class in akka.http.scaladsl.common")<java.lang.String> nr)` |  |
	| `<T> [PathMatcher](PathMatcher.html "class in akka.http.scaladsl.server")<scala.Tuple1<T>>` | `[_valueMap2PathMatcher](#_valueMap2PathMatcher(scala.collection.immutable.Map))​(scala.collection.immutable.Map<java.lang.String,​T> valueMap)` | Creates a PathMatcher from the given Map of path segments (prefixes) to extracted values. |

- - ### Method Detail
	
	
	
		- #### \_regex2PathMatcher
		
		
		
		```
		[PathMatcher](PathMatcher.html "class in akka.http.scaladsl.server")<scala.Tuple1<java.lang.String>> _regex2PathMatcher​(scala.util.matching.Regex regex)
		```
		
		Creates a PathMatcher that consumes (a prefix of) the first path segment
		 if the path begins with a segment (a prefix of) which matches the given regex.
		 Extracts either the complete match (if the regex doesn't contain a capture group) or
		 the capture group (if the regex contains exactly one).
		 If the regex contains more than one capture group the method throws an IllegalArgumentException.
		 
		
		Parameters:
		`regex` \- (undocumented)
		Returns:
		(undocumented)
		- #### \_segmentStringToPathMatcher
		
		
		
		```
		[PathMatcher](PathMatcher.html "class in akka.http.scaladsl.server")<scala.runtime.BoxedUnit> _segmentStringToPathMatcher​(java.lang.String segment)
		```
		
		Creates a PathMatcher that consumes (a prefix of) the first path segment
		 (if the path begins with a segment).
		 
		
		Parameters:
		`segment` \- (undocumented)
		Returns:
		(undocumented)
		- #### \_stringExtractionPair2PathMatcher
		
		
		
		```
		<T> [PathMatcher](PathMatcher.html "class in akka.http.scaladsl.server")<scala.Tuple1<T>> _stringExtractionPair2PathMatcher​(scala.Tuple2<java.lang.String,​T> tuple)
		```
		
		Creates a PathMatcher that consumes (a prefix of) the first path segment
		 (if the path begins with a segment) and extracts a given value.
		 
		
		Parameters:
		`tuple` \- (undocumented)
		Returns:
		(undocumented)
		- #### \_stringNameOptionReceptacle2PathMatcher
		
		
		
		```
		[PathMatcher](PathMatcher.html "class in akka.http.scaladsl.server")<scala.runtime.BoxedUnit> _stringNameOptionReceptacle2PathMatcher​([NameOptionReceptacle](../common/NameOptionReceptacle.html "class in akka.http.scaladsl.common")<java.lang.String> nr)
		```
		
		
		Parameters:
		`nr` \- (undocumented)
		Returns:
		(undocumented)
		- #### \_valueMap2PathMatcher
		
		
		
		```
		<T> [PathMatcher](PathMatcher.html "class in akka.http.scaladsl.server")<scala.Tuple1<T>> _valueMap2PathMatcher​(scala.collection.immutable.Map<java.lang.String,​T> valueMap)
		```
		
		Creates a PathMatcher from the given Map of path segments (prefixes) to extracted values.
		 If the unmatched path starts with a segment having one of the maps keys as a prefix
		 the matcher consumes this path segment (prefix) and extracts the corresponding map value.
		 For keys sharing a common prefix the longest matching prefix is selected.
		 
		
		Parameters:
		`valueMap` \- (undocumented)
		Returns:
		(undocumented)

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/common/NameOptionReceptacle.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/server/Directives$.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/server/Directives.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/server/HttpApp.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/server/PathMatcher$.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/server/PathMatcher.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/server/directives/PathDirectives$.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/server/directives/PathDirectives.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/server/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/server/ImplicitPathMatcherConstruction.html](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/server/ImplicitPathMatcherConstruction.html)*