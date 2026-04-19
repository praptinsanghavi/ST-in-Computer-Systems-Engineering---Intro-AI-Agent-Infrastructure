---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T23:47:21Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/server/PathMatcher0.html
title: PathMatcher0
---

# PathMatcher0

## Content

Package [akka.http.javadsl.server](package-summary.html)
## Class PathMatcher0

- java.lang.Object
- - akka.http.javadsl.server.PathMatcher0

- ---

```
public final class PathMatcher0
extends java.lang.Object
```

A PathMatcher tries to match a prefix of a given string and returns either a PathMatcher.Matched instance
 if matched, otherwise PathMatchers.Unmatched.

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[PathMatcher0](#%3Cinit%3E(akka.http.scaladsl.server.PathMatcher))​([PathMatcher](../../scaladsl/server/PathMatcher.html "class in akka.http.scaladsl.server")<scala.runtime.BoxedUnit> toScala)` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[PathMatcher0](PathMatcher0.html "class in akka.http.javadsl.server")` | `[concat](#concat(akka.http.javadsl.server.PathMatcher0))​([PathMatcher0](PathMatcher0.html "class in akka.http.javadsl.server") next)` |  |
	| `<T> [PathMatcher1](PathMatcher1.html "class in akka.http.javadsl.server")<T>` | `[concat](#concat(akka.http.javadsl.server.PathMatcher1))​([PathMatcher1](PathMatcher1.html "class in akka.http.javadsl.server")<T> next)` |  |
	| `<T1,​T2>[PathMatcher2](PathMatcher2.html "class in akka.http.javadsl.server")<T1,​T2>` | `[concat](#concat(akka.http.javadsl.server.PathMatcher2))​([PathMatcher2](PathMatcher2.html "class in akka.http.javadsl.server")<T1,​T2> next)` |  |
	| `[PathMatcher0](PathMatcher0.html "class in akka.http.javadsl.server")` | `[concat](#concat(java.lang.String))​(java.lang.String segment)` |  |
	| `[PathMatcher0](PathMatcher0.html "class in akka.http.javadsl.server")` | `[invert](#invert())()` |  |
	| `[PathMatcher0](PathMatcher0.html "class in akka.http.javadsl.server")` | `[orElse](#orElse(akka.http.javadsl.server.PathMatcher0))​([PathMatcher0](PathMatcher0.html "class in akka.http.javadsl.server") alternative)` |  |
	| `[PathMatcher0](PathMatcher0.html "class in akka.http.javadsl.server")` | `[orElse](#orElse(java.lang.String))​(java.lang.String segment)` |  |
	| `[PathMatcher0](PathMatcher0.html "class in akka.http.javadsl.server")` | `[repeat](#repeat(int,int))​(int min,  int max)` |  |
	| `[PathMatcher0](PathMatcher0.html "class in akka.http.javadsl.server")` | `[repeat](#repeat(int,int,akka.http.javadsl.server.PathMatcher0))​(int min,  int max,  [PathMatcher0](PathMatcher0.html "class in akka.http.javadsl.server") separator)` |  |
	| `[PathMatcher0](PathMatcher0.html "class in akka.http.javadsl.server")` | `[slash](#slash())()` |  |
	| `[PathMatcher0](PathMatcher0.html "class in akka.http.javadsl.server")` | `[slash](#slash(akka.http.javadsl.server.PathMatcher0))​([PathMatcher0](PathMatcher0.html "class in akka.http.javadsl.server") next)` |  |
	| `<T> [PathMatcher1](PathMatcher1.html "class in akka.http.javadsl.server")<T>` | `[slash](#slash(akka.http.javadsl.server.PathMatcher1))​([PathMatcher1](PathMatcher1.html "class in akka.http.javadsl.server")<T> next)` |  |
	| `<T1,​T2>[PathMatcher2](PathMatcher2.html "class in akka.http.javadsl.server")<T1,​T2>` | `[slash](#slash(akka.http.javadsl.server.PathMatcher2))​([PathMatcher2](PathMatcher2.html "class in akka.http.javadsl.server")<T1,​T2> next)` |  |
	| `[PathMatcher0](PathMatcher0.html "class in akka.http.javadsl.server")` | `[slash](#slash(java.lang.String))​(java.lang.String segment)` |  |
	| `[PathMatcher](../../scaladsl/server/PathMatcher.html "class in akka.http.scaladsl.server")<scala.runtime.BoxedUnit>` | `[toScala](#toScala())()` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### PathMatcher0
		
		
		
		```
		public PathMatcher0​([PathMatcher](../../scaladsl/server/PathMatcher.html "class in akka.http.scaladsl.server")<scala.runtime.BoxedUnit> toScala)
		```

	- ### Method Detail
	
	
	
		- #### concat
		
		
		
		```
		public [PathMatcher0](PathMatcher0.html "class in akka.http.javadsl.server") concat​(java.lang.String segment)
		```
		- #### concat
		
		
		
		```
		public [PathMatcher0](PathMatcher0.html "class in akka.http.javadsl.server") concat​([PathMatcher0](PathMatcher0.html "class in akka.http.javadsl.server") next)
		```
		- #### concat
		
		
		
		```
		public <T> [PathMatcher1](PathMatcher1.html "class in akka.http.javadsl.server")<T> concat​([PathMatcher1](PathMatcher1.html "class in akka.http.javadsl.server")<T> next)
		```
		- #### concat
		
		
		
		```
		public <T1,​T2> [PathMatcher2](PathMatcher2.html "class in akka.http.javadsl.server")<T1,​T2> concat​([PathMatcher2](PathMatcher2.html "class in akka.http.javadsl.server")<T1,​T2> next)
		```
		- #### invert
		
		
		
		```
		public [PathMatcher0](PathMatcher0.html "class in akka.http.javadsl.server") invert()
		```
		- #### orElse
		
		
		
		```
		public [PathMatcher0](PathMatcher0.html "class in akka.http.javadsl.server") orElse​(java.lang.String segment)
		```
		- #### orElse
		
		
		
		```
		public [PathMatcher0](PathMatcher0.html "class in akka.http.javadsl.server") orElse​([PathMatcher0](PathMatcher0.html "class in akka.http.javadsl.server") alternative)
		```
		- #### repeat
		
		
		
		```
		public [PathMatcher0](PathMatcher0.html "class in akka.http.javadsl.server") repeat​(int min,
		                           int max)
		```
		- #### repeat
		
		
		
		```
		public [PathMatcher0](PathMatcher0.html "class in akka.http.javadsl.server") repeat​(int min,
		                           int max,
		                           [PathMatcher0](PathMatcher0.html "class in akka.http.javadsl.server") separator)
		```
		- #### slash
		
		
		
		```
		public [PathMatcher0](PathMatcher0.html "class in akka.http.javadsl.server") slash()
		```
		- #### slash
		
		
		
		```
		public [PathMatcher0](PathMatcher0.html "class in akka.http.javadsl.server") slash​(java.lang.String segment)
		```
		- #### slash
		
		
		
		```
		public [PathMatcher0](PathMatcher0.html "class in akka.http.javadsl.server") slash​([PathMatcher0](PathMatcher0.html "class in akka.http.javadsl.server") next)
		```
		- #### slash
		
		
		
		```
		public <T> [PathMatcher1](PathMatcher1.html "class in akka.http.javadsl.server")<T> slash​([PathMatcher1](PathMatcher1.html "class in akka.http.javadsl.server")<T> next)
		```
		- #### slash
		
		
		
		```
		public <T1,​T2> [PathMatcher2](PathMatcher2.html "class in akka.http.javadsl.server")<T1,​T2> slash​([PathMatcher2](PathMatcher2.html "class in akka.http.javadsl.server")<T1,​T2> next)
		```
		- #### toScala
		
		
		
		```
		public [PathMatcher](../../scaladsl/server/PathMatcher.html "class in akka.http.scaladsl.server")<scala.runtime.BoxedUnit> toScala()
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/server/PathMatcher0.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/server/PathMatcher1.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/server/PathMatcher2.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/server/package-summary.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/PathMatcher.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/server/PathMatcher0.html](https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/server/PathMatcher0.html)*