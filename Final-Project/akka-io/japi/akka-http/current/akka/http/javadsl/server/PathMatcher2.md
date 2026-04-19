---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T23:47:33Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/server/PathMatcher2.html
title: PathMatcher2
---

# PathMatcher2

## Content

Package [akka.http.javadsl.server](package-summary.html)
## Class PathMatcher2\<T1,​T2\>

- java.lang.Object
- - akka.http.javadsl.server.PathMatcher2\<T1,​T2\>

- ---

```
public final class PathMatcher2<T1,​T2>
extends java.lang.Object
```

A PathMatcher tries to match a prefix of a given string and returns either a PathMatcher.Matched instance
 if matched, otherwise PathMatchers.Unmatched.

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[PathMatcher2](#%3Cinit%3E(akka.http.scaladsl.server.PathMatcher))​([PathMatcher](../../scaladsl/server/PathMatcher.html "class in akka.http.scaladsl.server")<scala.Tuple2<[T1](PathMatcher2.html "type parameter in PathMatcher2"),​[T2](PathMatcher2.html "type parameter in PathMatcher2")>> toScala)` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[PathMatcher2](PathMatcher2.html "class in akka.http.javadsl.server")<[T1](PathMatcher2.html "type parameter in PathMatcher2"),​[T2](PathMatcher2.html "type parameter in PathMatcher2")>` | `[concat](#concat(akka.http.javadsl.server.PathMatcher0))​([PathMatcher0](PathMatcher0.html "class in akka.http.javadsl.server") next)` |  |
	| `<N> [PathMatcher3](PathMatcher3.html "class in akka.http.javadsl.server")<[T1](PathMatcher2.html "type parameter in PathMatcher2"),​[T2](PathMatcher2.html "type parameter in PathMatcher2"),​N>` | `[concat](#concat(akka.http.javadsl.server.PathMatcher1))​([PathMatcher1](PathMatcher1.html "class in akka.http.javadsl.server")<N> next)` |  |
	| `<N1,​N2>[PathMatcher4](PathMatcher4.html "class in akka.http.javadsl.server")<[T1](PathMatcher2.html "type parameter in PathMatcher2"),​[T2](PathMatcher2.html "type parameter in PathMatcher2"),​N1,​N2>` | `[concat](#concat(akka.http.javadsl.server.PathMatcher2))​([PathMatcher2](PathMatcher2.html "class in akka.http.javadsl.server")<N1,​N2> next)` |  |
	| `[PathMatcher2](PathMatcher2.html "class in akka.http.javadsl.server")<[T1](PathMatcher2.html "type parameter in PathMatcher2"),​[T2](PathMatcher2.html "type parameter in PathMatcher2")>` | `[concat](#concat(java.lang.String))​(java.lang.String segment)` |  |
	| `[PathMatcher0](PathMatcher0.html "class in akka.http.javadsl.server")` | `[invert](#invert())()` |  |
	| `[PathMatcher2](PathMatcher2.html "class in akka.http.javadsl.server")<[T1](PathMatcher2.html "type parameter in PathMatcher2"),​[T2](PathMatcher2.html "type parameter in PathMatcher2")>` | `[orElse](#orElse(akka.http.javadsl.server.PathMatcher2))​([PathMatcher2](PathMatcher2.html "class in akka.http.javadsl.server")<[T1](PathMatcher2.html "type parameter in PathMatcher2"),​[T2](PathMatcher2.html "type parameter in PathMatcher2")> alternative)` |  |
	| `[PathMatcher2](PathMatcher2.html "class in akka.http.javadsl.server")<[T1](PathMatcher2.html "type parameter in PathMatcher2"),​[T2](PathMatcher2.html "type parameter in PathMatcher2")>` | `[slash](#slash())()` |  |
	| `[PathMatcher2](PathMatcher2.html "class in akka.http.javadsl.server")<[T1](PathMatcher2.html "type parameter in PathMatcher2"),​[T2](PathMatcher2.html "type parameter in PathMatcher2")>` | `[slash](#slash(akka.http.javadsl.server.PathMatcher0))​([PathMatcher0](PathMatcher0.html "class in akka.http.javadsl.server") next)` |  |
	| `<N> [PathMatcher3](PathMatcher3.html "class in akka.http.javadsl.server")<[T1](PathMatcher2.html "type parameter in PathMatcher2"),​[T2](PathMatcher2.html "type parameter in PathMatcher2"),​N>` | `[slash](#slash(akka.http.javadsl.server.PathMatcher1))​([PathMatcher1](PathMatcher1.html "class in akka.http.javadsl.server")<N> next)` |  |
	| `<N1,​N2>[PathMatcher4](PathMatcher4.html "class in akka.http.javadsl.server")<[T1](PathMatcher2.html "type parameter in PathMatcher2"),​[T2](PathMatcher2.html "type parameter in PathMatcher2"),​N1,​N2>` | `[slash](#slash(akka.http.javadsl.server.PathMatcher2))​([PathMatcher2](PathMatcher2.html "class in akka.http.javadsl.server")<N1,​N2> next)` |  |
	| `[PathMatcher2](PathMatcher2.html "class in akka.http.javadsl.server")<[T1](PathMatcher2.html "type parameter in PathMatcher2"),​[T2](PathMatcher2.html "type parameter in PathMatcher2")>` | `[slash](#slash(java.lang.String))​(java.lang.String segment)` |  |
	| `[PathMatcher](../../scaladsl/server/PathMatcher.html "class in akka.http.scaladsl.server")<scala.Tuple2<[T1](PathMatcher2.html "type parameter in PathMatcher2"),​[T2](PathMatcher2.html "type parameter in PathMatcher2")>>` | `[toScala](#toScala())()` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### PathMatcher2
		
		
		
		```
		public PathMatcher2​([PathMatcher](../../scaladsl/server/PathMatcher.html "class in akka.http.scaladsl.server")<scala.Tuple2<[T1](PathMatcher2.html "type parameter in PathMatcher2"),​[T2](PathMatcher2.html "type parameter in PathMatcher2")>> toScala)
		```

	- ### Method Detail
	
	
	
		- #### concat
		
		
		
		```
		public [PathMatcher2](PathMatcher2.html "class in akka.http.javadsl.server")<[T1](PathMatcher2.html "type parameter in PathMatcher2"),​[T2](PathMatcher2.html "type parameter in PathMatcher2")> concat​(java.lang.String segment)
		```
		- #### concat
		
		
		
		```
		public [PathMatcher2](PathMatcher2.html "class in akka.http.javadsl.server")<[T1](PathMatcher2.html "type parameter in PathMatcher2"),​[T2](PathMatcher2.html "type parameter in PathMatcher2")> concat​([PathMatcher0](PathMatcher0.html "class in akka.http.javadsl.server") next)
		```
		- #### concat
		
		
		
		```
		public <N> [PathMatcher3](PathMatcher3.html "class in akka.http.javadsl.server")<[T1](PathMatcher2.html "type parameter in PathMatcher2"),​[T2](PathMatcher2.html "type parameter in PathMatcher2"),​N> concat​([PathMatcher1](PathMatcher1.html "class in akka.http.javadsl.server")<N> next)
		```
		- #### concat
		
		
		
		```
		public <N1,​N2> [PathMatcher4](PathMatcher4.html "class in akka.http.javadsl.server")<[T1](PathMatcher2.html "type parameter in PathMatcher2"),​[T2](PathMatcher2.html "type parameter in PathMatcher2"),​N1,​N2> concat​([PathMatcher2](PathMatcher2.html "class in akka.http.javadsl.server")<N1,​N2> next)
		```
		- #### invert
		
		
		
		```
		public [PathMatcher0](PathMatcher0.html "class in akka.http.javadsl.server") invert()
		```
		- #### orElse
		
		
		
		```
		public [PathMatcher2](PathMatcher2.html "class in akka.http.javadsl.server")<[T1](PathMatcher2.html "type parameter in PathMatcher2"),​[T2](PathMatcher2.html "type parameter in PathMatcher2")> orElse​([PathMatcher2](PathMatcher2.html "class in akka.http.javadsl.server")<[T1](PathMatcher2.html "type parameter in PathMatcher2"),​[T2](PathMatcher2.html "type parameter in PathMatcher2")> alternative)
		```
		- #### slash
		
		
		
		```
		public [PathMatcher2](PathMatcher2.html "class in akka.http.javadsl.server")<[T1](PathMatcher2.html "type parameter in PathMatcher2"),​[T2](PathMatcher2.html "type parameter in PathMatcher2")> slash()
		```
		- #### slash
		
		
		
		```
		public [PathMatcher2](PathMatcher2.html "class in akka.http.javadsl.server")<[T1](PathMatcher2.html "type parameter in PathMatcher2"),​[T2](PathMatcher2.html "type parameter in PathMatcher2")> slash​(java.lang.String segment)
		```
		- #### slash
		
		
		
		```
		public [PathMatcher2](PathMatcher2.html "class in akka.http.javadsl.server")<[T1](PathMatcher2.html "type parameter in PathMatcher2"),​[T2](PathMatcher2.html "type parameter in PathMatcher2")> slash​([PathMatcher0](PathMatcher0.html "class in akka.http.javadsl.server") next)
		```
		- #### slash
		
		
		
		```
		public <N> [PathMatcher3](PathMatcher3.html "class in akka.http.javadsl.server")<[T1](PathMatcher2.html "type parameter in PathMatcher2"),​[T2](PathMatcher2.html "type parameter in PathMatcher2"),​N> slash​([PathMatcher1](PathMatcher1.html "class in akka.http.javadsl.server")<N> next)
		```
		- #### slash
		
		
		
		```
		public <N1,​N2> [PathMatcher4](PathMatcher4.html "class in akka.http.javadsl.server")<[T1](PathMatcher2.html "type parameter in PathMatcher2"),​[T2](PathMatcher2.html "type parameter in PathMatcher2"),​N1,​N2> slash​([PathMatcher2](PathMatcher2.html "class in akka.http.javadsl.server")<N1,​N2> next)
		```
		- #### toScala
		
		
		
		```
		public [PathMatcher](../../scaladsl/server/PathMatcher.html "class in akka.http.scaladsl.server")<scala.Tuple2<[T1](PathMatcher2.html "type parameter in PathMatcher2"),​[T2](PathMatcher2.html "type parameter in PathMatcher2")>> toScala()
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/server/PathMatcher0.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/server/PathMatcher1.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/server/PathMatcher2.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/server/PathMatcher3.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/server/PathMatcher4.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/server/package-summary.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/PathMatcher.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/server/PathMatcher2.html](https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/server/PathMatcher2.html)*