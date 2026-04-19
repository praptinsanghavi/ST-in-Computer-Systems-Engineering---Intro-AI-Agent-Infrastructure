---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T02:09:22Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/PathMatchers$.html
title: PathMatchers$
---

# PathMatchers$

## Content

Package [akka.http.javadsl.server](package-summary.html)
## Class PathMatchers$

- java.lang.Object
- - akka.http.javadsl.server.PathMatchers$

- ---

```
public class PathMatchers$
extends java.lang.Object
```

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [PathMatchers$](PathMatchers$.html "class in akka.http.javadsl.server")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[PathMatchers$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[PathMatcher1](PathMatcher1.html "class in akka.http.javadsl.server")<java.lang.Double>` | `[doubleSegment](#doubleSegment())()` | A PathMatcher that matches and extracts a Double value. |
	| `[PathMatcher1](PathMatcher1.html "class in akka.http.javadsl.server")<java.lang.Integer>` | `[hexIntegerSegment](#hexIntegerSegment())()` | A PathMatcher that efficiently matches a number of hex\-digits and extracts their (non\-negative) Int value. |
	| `[PathMatcher1](PathMatcher1.html "class in akka.http.javadsl.server")<java.lang.Long>` | `[hexLongSegment](#hexLongSegment())()` | A PathMatcher that efficiently matches a number of hex\-digits and extracts their (non\-negative) Long value. |
	| `[PathMatcher1](PathMatcher1.html "class in akka.http.javadsl.server")<java.lang.Integer>` | `[integerSegment](#integerSegment())()` | A PathMatcher that efficiently matches a number of digits and extracts their (non\-negative) Int value. |
	| `[PathMatcher1](PathMatcher1.html "class in akka.http.javadsl.server")<java.lang.Long>` | `[longSegment](#longSegment())()` | A PathMatcher that efficiently matches a number of digits and extracts their (non\-negative) Long value. |
	| `[PathMatcher0](PathMatcher0.html "class in akka.http.javadsl.server")` | `[neutral](#neutral())()` | A PathMatcher that always matches, doesn't consume anything and extracts nothing. |
	| `[PathMatcher0](PathMatcher0.html "class in akka.http.javadsl.server")` | `[pathEnd](#pathEnd())()` | A PathMatcher that matches the very end of the requests URI path. |
	| `[PathMatcher1](PathMatcher1.html "class in akka.http.javadsl.server")<java.lang.String>` | `[remaining](#remaining())()` | A PathMatcher that matches and extracts the complete remaining,  unmatched part of the request's URI path as an (encoded!) |
	| `[PathMatcher1](PathMatcher1.html "class in akka.http.javadsl.server")<[Uri.Path](../../scaladsl/model/Uri.Path.html "class in akka.http.scaladsl.model")>` | `[remainingPath](#remainingPath())()` | A PathMatcher that matches and extracts the complete remaining,  unmatched part of the request's URI path. |
	| `[PathMatcher1](PathMatcher1.html "class in akka.http.javadsl.server")<java.lang.String>` | `[segment](#segment())()` | A PathMatcher that matches if the unmatched path starts with a path segment. |
	| `[PathMatcher0](PathMatcher0.html "class in akka.http.javadsl.server")` | `[segment](#segment(java.lang.String))​(java.lang.String segment)` | Creates a PathMatcher that consumes (a prefix of) the first path segment  (if the path begins with a segment). |
	| `[PathMatcher1](PathMatcher1.html "class in akka.http.javadsl.server")<java.lang.String>` | `[segment](#segment(java.util.regex.Pattern))​(java.util.regex.Pattern regex)` | Creates a PathMatcher that consumes (a prefix of) the first path segment  if the path begins with a segment (a prefix of) which matches the given regex. |
	| `[PathMatcher1](PathMatcher1.html "class in akka.http.javadsl.server")<java.util.List<java.lang.String>>` | `[segments](#segments())()` | A PathMatcher that matches up to 128 remaining segments as a List\[String]. |
	| `[PathMatcher1](PathMatcher1.html "class in akka.http.javadsl.server")<java.util.List<java.lang.String>>` | `[segments](#segments(int))​(int count)` | A PathMatcher that matches the given number of path segments (separated by slashes) as a List\[String]. |
	| `[PathMatcher1](PathMatcher1.html "class in akka.http.javadsl.server")<java.util.List<java.lang.String>>` | `[segments](#segments(int,int))​(int min,  int max)` | A PathMatcher that matches between `min` and `max` (both inclusively) path segments (separated by slashes)  as a List\[String]. |
	| `[PathMatcher0](PathMatcher0.html "class in akka.http.javadsl.server")` | `[separateOnSlashes](#separateOnSlashes(java.lang.String))​(java.lang.String segments)` | Converts a path string containing slashes into a PathMatcher that interprets slashes as  path segment separators. |
	| `[PathMatcher0](PathMatcher0.html "class in akka.http.javadsl.server")` | `[slash](#slash())()` | A PathMatcher that matches a single slash character ('/'). |
	| `[PathMatcher1](PathMatcher1.html "class in akka.http.javadsl.server")<java.util.UUID>` | `[uuidSegment](#uuidSegment())()` | A PathMatcher that matches and extracts a java.util.UUID instance. |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [PathMatchers$](PathMatchers$.html "class in akka.http.javadsl.server") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### PathMatchers$
		
		
		
		```
		public PathMatchers$()
		```

	- ### Method Detail
	
	
	
		- #### separateOnSlashes
		
		
		
		```
		public [PathMatcher0](PathMatcher0.html "class in akka.http.javadsl.server") separateOnSlashes​(java.lang.String segments)
		```
		
		Converts a path string containing slashes into a PathMatcher that interprets slashes as
		 path segment separators.
		
		Parameters:
		`segments` \- (undocumented)
		Returns:
		(undocumented)
		- #### slash
		
		
		
		```
		public [PathMatcher0](PathMatcher0.html "class in akka.http.javadsl.server") slash()
		```
		
		A PathMatcher that matches a single slash character ('/').
		
		Returns:
		(undocumented)
		- #### segment
		
		
		
		```
		public [PathMatcher0](PathMatcher0.html "class in akka.http.javadsl.server") segment​(java.lang.String segment)
		```
		
		Creates a PathMatcher that consumes (a prefix of) the first path segment
		 (if the path begins with a segment).
		
		Parameters:
		`segment` \- (undocumented)
		Returns:
		(undocumented)
		- #### segment
		
		
		
		```
		public [PathMatcher1](PathMatcher1.html "class in akka.http.javadsl.server")<java.lang.String> segment​(java.util.regex.Pattern regex)
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
		- #### segments
		
		
		
		```
		public [PathMatcher1](PathMatcher1.html "class in akka.http.javadsl.server")<java.util.List<java.lang.String>> segments​(int min,
		                                                               int max)
		```
		
		A PathMatcher that matches between `min` and `max` (both inclusively) path segments (separated by slashes)
		 as a List\[String]. If there are more than `count` segments present the remaining ones will be left unmatched.
		 If the path has a trailing slash this slash will \*not\* be matched.
		
		Parameters:
		`min` \- (undocumented)
		`max` \- (undocumented)
		Returns:
		(undocumented)
		- #### segments
		
		
		
		```
		public [PathMatcher1](PathMatcher1.html "class in akka.http.javadsl.server")<java.util.List<java.lang.String>> segments​(int count)
		```
		
		A PathMatcher that matches the given number of path segments (separated by slashes) as a List\[String].
		 If there are more than `count` segments present the remaining ones will be left unmatched.
		 If the path has a trailing slash this slash will \*not\* be matched.
		
		Parameters:
		`count` \- (undocumented)
		Returns:
		(undocumented)
		- #### integerSegment
		
		
		
		```
		public [PathMatcher1](PathMatcher1.html "class in akka.http.javadsl.server")<java.lang.Integer> integerSegment()
		```
		
		A PathMatcher that efficiently matches a number of digits and extracts their (non\-negative) Int value.
		 The matcher will not match 0 digits or a sequence of digits that would represent an Int value larger
		 than Int.MaxValue.
		
		Returns:
		(undocumented)
		- #### longSegment
		
		
		
		```
		public [PathMatcher1](PathMatcher1.html "class in akka.http.javadsl.server")<java.lang.Long> longSegment()
		```
		
		A PathMatcher that efficiently matches a number of digits and extracts their (non\-negative) Long value.
		 The matcher will not match 0 digits or a sequence of digits that would represent an Long value larger
		 than Long.MaxValue.
		
		Returns:
		(undocumented)
		- #### hexIntegerSegment
		
		
		
		```
		public [PathMatcher1](PathMatcher1.html "class in akka.http.javadsl.server")<java.lang.Integer> hexIntegerSegment()
		```
		
		A PathMatcher that efficiently matches a number of hex\-digits and extracts their (non\-negative) Int value.
		 The matcher will not match 0 digits or a sequence of digits that would represent an Int value larger
		 than Int.MaxValue.
		
		Returns:
		(undocumented)
		- #### hexLongSegment
		
		
		
		```
		public [PathMatcher1](PathMatcher1.html "class in akka.http.javadsl.server")<java.lang.Long> hexLongSegment()
		```
		
		A PathMatcher that efficiently matches a number of hex\-digits and extracts their (non\-negative) Long value.
		 The matcher will not match 0 digits or a sequence of digits that would represent an Long value larger
		 than Long.MaxValue.
		
		Returns:
		(undocumented)
		- #### doubleSegment
		
		
		
		```
		public [PathMatcher1](PathMatcher1.html "class in akka.http.javadsl.server")<java.lang.Double> doubleSegment()
		```
		
		A PathMatcher that matches and extracts a Double value. The matched string representation is the pure decimal,
		 optionally signed form of a double value, i.e. without exponent.
		
		Returns:
		(undocumented)
		- #### uuidSegment
		
		
		
		```
		public [PathMatcher1](PathMatcher1.html "class in akka.http.javadsl.server")<java.util.UUID> uuidSegment()
		```
		
		A PathMatcher that matches and extracts a java.util.UUID instance.
		
		Returns:
		(undocumented)
		- #### neutral
		
		
		
		```
		public [PathMatcher0](PathMatcher0.html "class in akka.http.javadsl.server") neutral()
		```
		
		A PathMatcher that always matches, doesn't consume anything and extracts nothing.
		 Serves mainly as a neutral element in PathMatcher composition.
		
		Returns:
		(undocumented)
		- #### pathEnd
		
		
		
		```
		public [PathMatcher0](PathMatcher0.html "class in akka.http.javadsl.server") pathEnd()
		```
		
		A PathMatcher that matches the very end of the requests URI path.
		
		Returns:
		(undocumented)
		- #### remaining
		
		
		
		```
		public [PathMatcher1](PathMatcher1.html "class in akka.http.javadsl.server")<java.lang.String> remaining()
		```
		
		A PathMatcher that matches and extracts the complete remaining,
		 unmatched part of the request's URI path as an (encoded!) String.
		
		Returns:
		(undocumented)
		- #### remainingPath
		
		
		
		```
		public [PathMatcher1](PathMatcher1.html "class in akka.http.javadsl.server")<[Uri.Path](../../scaladsl/model/Uri.Path.html "class in akka.http.scaladsl.model")> remainingPath()
		```
		
		A PathMatcher that matches and extracts the complete remaining,
		 unmatched part of the request's URI path.
		
		Returns:
		(undocumented)
		- #### segment
		
		
		
		```
		public [PathMatcher1](PathMatcher1.html "class in akka.http.javadsl.server")<java.lang.String> segment()
		```
		
		A PathMatcher that matches if the unmatched path starts with a path segment.
		 If so the path segment is extracted as a String.
		
		Returns:
		(undocumented)
		- #### segments
		
		
		
		```
		public [PathMatcher1](PathMatcher1.html "class in akka.http.javadsl.server")<java.util.List<java.lang.String>> segments()
		```
		
		A PathMatcher that matches up to 128 remaining segments as a List\[String].
		 This can also be no segments resulting in the empty list.
		 If the path has a trailing slash this slash will \*not\* be matched.
		
		Returns:
		(undocumented)

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/PathMatcher0.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/PathMatcher1.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/PathMatchers$.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/package-summary.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/model/Uri.Path.html

---
*Source: [https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/PathMatchers$.html](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/PathMatchers$.html)*