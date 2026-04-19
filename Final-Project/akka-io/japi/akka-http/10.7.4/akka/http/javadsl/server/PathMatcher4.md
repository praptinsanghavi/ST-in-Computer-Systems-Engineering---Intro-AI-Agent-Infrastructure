---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T02:09:19Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/PathMatcher4.html
title: PathMatcher4
---

# PathMatcher4

## Content

Package [akka.http.javadsl.server](package-summary.html)
## Class PathMatcher4\<T1,​T2,​T3,​T4\>

- java.lang.Object
- - akka.http.javadsl.server.PathMatcher4\<T1,​T2,​T3,​T4\>

- ---

```
public final class PathMatcher4<T1,​T2,​T3,​T4>
extends java.lang.Object
```

A PathMatcher tries to match a prefix of a given string and returns either a PathMatcher.Matched instance
 if matched, otherwise PathMatchers.Unmatched.

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[PathMatcher4](#%3Cinit%3E(akka.http.scaladsl.server.PathMatcher))​([PathMatcher](../../scaladsl/server/PathMatcher.html "class in akka.http.scaladsl.server")<scala.Tuple4<[T1](PathMatcher4.html "type parameter in PathMatcher4"),​[T2](PathMatcher4.html "type parameter in PathMatcher4"),​[T3](PathMatcher4.html "type parameter in PathMatcher4"),​[T4](PathMatcher4.html "type parameter in PathMatcher4")>> toScala)` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[PathMatcher4](PathMatcher4.html "class in akka.http.javadsl.server")<[T1](PathMatcher4.html "type parameter in PathMatcher4"),​[T2](PathMatcher4.html "type parameter in PathMatcher4"),​[T3](PathMatcher4.html "type parameter in PathMatcher4"),​[T4](PathMatcher4.html "type parameter in PathMatcher4")>` | `[concat](#concat(akka.http.javadsl.server.PathMatcher0))​([PathMatcher0](PathMatcher0.html "class in akka.http.javadsl.server") next)` |  |
	| `<N> [PathMatcher5](PathMatcher5.html "class in akka.http.javadsl.server")<[T1](PathMatcher4.html "type parameter in PathMatcher4"),​[T2](PathMatcher4.html "type parameter in PathMatcher4"),​[T3](PathMatcher4.html "type parameter in PathMatcher4"),​[T4](PathMatcher4.html "type parameter in PathMatcher4"),​N>` | `[concat](#concat(akka.http.javadsl.server.PathMatcher1))​([PathMatcher1](PathMatcher1.html "class in akka.http.javadsl.server")<N> next)` |  |
	| `<N1,​N2>[PathMatcher6](PathMatcher6.html "class in akka.http.javadsl.server")<[T1](PathMatcher4.html "type parameter in PathMatcher4"),​[T2](PathMatcher4.html "type parameter in PathMatcher4"),​[T3](PathMatcher4.html "type parameter in PathMatcher4"),​[T4](PathMatcher4.html "type parameter in PathMatcher4"),​N1,​N2>` | `[concat](#concat(akka.http.javadsl.server.PathMatcher2))​([PathMatcher2](PathMatcher2.html "class in akka.http.javadsl.server")<N1,​N2> next)` |  |
	| `[PathMatcher4](PathMatcher4.html "class in akka.http.javadsl.server")<[T1](PathMatcher4.html "type parameter in PathMatcher4"),​[T2](PathMatcher4.html "type parameter in PathMatcher4"),​[T3](PathMatcher4.html "type parameter in PathMatcher4"),​[T4](PathMatcher4.html "type parameter in PathMatcher4")>` | `[concat](#concat(java.lang.String))​(java.lang.String segment)` |  |
	| `[PathMatcher0](PathMatcher0.html "class in akka.http.javadsl.server")` | `[invert](#invert())()` |  |
	| `[PathMatcher4](PathMatcher4.html "class in akka.http.javadsl.server")<[T1](PathMatcher4.html "type parameter in PathMatcher4"),​[T2](PathMatcher4.html "type parameter in PathMatcher4"),​[T3](PathMatcher4.html "type parameter in PathMatcher4"),​[T4](PathMatcher4.html "type parameter in PathMatcher4")>` | `[orElse](#orElse(akka.http.javadsl.server.PathMatcher4))​([PathMatcher4](PathMatcher4.html "class in akka.http.javadsl.server")<[T1](PathMatcher4.html "type parameter in PathMatcher4"),​[T2](PathMatcher4.html "type parameter in PathMatcher4"),​[T3](PathMatcher4.html "type parameter in PathMatcher4"),​[T4](PathMatcher4.html "type parameter in PathMatcher4")> alternative)` |  |
	| `[PathMatcher4](PathMatcher4.html "class in akka.http.javadsl.server")<[T1](PathMatcher4.html "type parameter in PathMatcher4"),​[T2](PathMatcher4.html "type parameter in PathMatcher4"),​[T3](PathMatcher4.html "type parameter in PathMatcher4"),​[T4](PathMatcher4.html "type parameter in PathMatcher4")>` | `[slash](#slash())()` |  |
	| `[PathMatcher4](PathMatcher4.html "class in akka.http.javadsl.server")<[T1](PathMatcher4.html "type parameter in PathMatcher4"),​[T2](PathMatcher4.html "type parameter in PathMatcher4"),​[T3](PathMatcher4.html "type parameter in PathMatcher4"),​[T4](PathMatcher4.html "type parameter in PathMatcher4")>` | `[slash](#slash(akka.http.javadsl.server.PathMatcher0))​([PathMatcher0](PathMatcher0.html "class in akka.http.javadsl.server") next)` |  |
	| `<N> [PathMatcher5](PathMatcher5.html "class in akka.http.javadsl.server")<[T1](PathMatcher4.html "type parameter in PathMatcher4"),​[T2](PathMatcher4.html "type parameter in PathMatcher4"),​[T3](PathMatcher4.html "type parameter in PathMatcher4"),​[T4](PathMatcher4.html "type parameter in PathMatcher4"),​N>` | `[slash](#slash(akka.http.javadsl.server.PathMatcher1))​([PathMatcher1](PathMatcher1.html "class in akka.http.javadsl.server")<N> next)` |  |
	| `<N1,​N2>[PathMatcher6](PathMatcher6.html "class in akka.http.javadsl.server")<[T1](PathMatcher4.html "type parameter in PathMatcher4"),​[T2](PathMatcher4.html "type parameter in PathMatcher4"),​[T3](PathMatcher4.html "type parameter in PathMatcher4"),​[T4](PathMatcher4.html "type parameter in PathMatcher4"),​N1,​N2>` | `[slash](#slash(akka.http.javadsl.server.PathMatcher2))​([PathMatcher2](PathMatcher2.html "class in akka.http.javadsl.server")<N1,​N2> next)` |  |
	| `[PathMatcher4](PathMatcher4.html "class in akka.http.javadsl.server")<[T1](PathMatcher4.html "type parameter in PathMatcher4"),​[T2](PathMatcher4.html "type parameter in PathMatcher4"),​[T3](PathMatcher4.html "type parameter in PathMatcher4"),​[T4](PathMatcher4.html "type parameter in PathMatcher4")>` | `[slash](#slash(java.lang.String))​(java.lang.String segment)` |  |
	| `[PathMatcher](../../scaladsl/server/PathMatcher.html "class in akka.http.scaladsl.server")<scala.Tuple4<[T1](PathMatcher4.html "type parameter in PathMatcher4"),​[T2](PathMatcher4.html "type parameter in PathMatcher4"),​[T3](PathMatcher4.html "type parameter in PathMatcher4"),​[T4](PathMatcher4.html "type parameter in PathMatcher4")>>` | `[toScala](#toScala())()` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### PathMatcher4
		
		
		
		```
		public PathMatcher4​([PathMatcher](../../scaladsl/server/PathMatcher.html "class in akka.http.scaladsl.server")<scala.Tuple4<[T1](PathMatcher4.html "type parameter in PathMatcher4"),​[T2](PathMatcher4.html "type parameter in PathMatcher4"),​[T3](PathMatcher4.html "type parameter in PathMatcher4"),​[T4](PathMatcher4.html "type parameter in PathMatcher4")>> toScala)
		```

	- ### Method Detail
	
	
	
		- #### concat
		
		
		
		```
		public [PathMatcher4](PathMatcher4.html "class in akka.http.javadsl.server")<[T1](PathMatcher4.html "type parameter in PathMatcher4"),​[T2](PathMatcher4.html "type parameter in PathMatcher4"),​[T3](PathMatcher4.html "type parameter in PathMatcher4"),​[T4](PathMatcher4.html "type parameter in PathMatcher4")> concat​(java.lang.String segment)
		```
		- #### concat
		
		
		
		```
		public [PathMatcher4](PathMatcher4.html "class in akka.http.javadsl.server")<[T1](PathMatcher4.html "type parameter in PathMatcher4"),​[T2](PathMatcher4.html "type parameter in PathMatcher4"),​[T3](PathMatcher4.html "type parameter in PathMatcher4"),​[T4](PathMatcher4.html "type parameter in PathMatcher4")> concat​([PathMatcher0](PathMatcher0.html "class in akka.http.javadsl.server") next)
		```
		- #### concat
		
		
		
		```
		public <N> [PathMatcher5](PathMatcher5.html "class in akka.http.javadsl.server")<[T1](PathMatcher4.html "type parameter in PathMatcher4"),​[T2](PathMatcher4.html "type parameter in PathMatcher4"),​[T3](PathMatcher4.html "type parameter in PathMatcher4"),​[T4](PathMatcher4.html "type parameter in PathMatcher4"),​N> concat​([PathMatcher1](PathMatcher1.html "class in akka.http.javadsl.server")<N> next)
		```
		- #### concat
		
		
		
		```
		public <N1,​N2> [PathMatcher6](PathMatcher6.html "class in akka.http.javadsl.server")<[T1](PathMatcher4.html "type parameter in PathMatcher4"),​[T2](PathMatcher4.html "type parameter in PathMatcher4"),​[T3](PathMatcher4.html "type parameter in PathMatcher4"),​[T4](PathMatcher4.html "type parameter in PathMatcher4"),​N1,​N2> concat​([PathMatcher2](PathMatcher2.html "class in akka.http.javadsl.server")<N1,​N2> next)
		```
		- #### invert
		
		
		
		```
		public [PathMatcher0](PathMatcher0.html "class in akka.http.javadsl.server") invert()
		```
		- #### orElse
		
		
		
		```
		public [PathMatcher4](PathMatcher4.html "class in akka.http.javadsl.server")<[T1](PathMatcher4.html "type parameter in PathMatcher4"),​[T2](PathMatcher4.html "type parameter in PathMatcher4"),​[T3](PathMatcher4.html "type parameter in PathMatcher4"),​[T4](PathMatcher4.html "type parameter in PathMatcher4")> orElse​([PathMatcher4](PathMatcher4.html "class in akka.http.javadsl.server")<[T1](PathMatcher4.html "type parameter in PathMatcher4"),​[T2](PathMatcher4.html "type parameter in PathMatcher4"),​[T3](PathMatcher4.html "type parameter in PathMatcher4"),​[T4](PathMatcher4.html "type parameter in PathMatcher4")> alternative)
		```
		- #### slash
		
		
		
		```
		public [PathMatcher4](PathMatcher4.html "class in akka.http.javadsl.server")<[T1](PathMatcher4.html "type parameter in PathMatcher4"),​[T2](PathMatcher4.html "type parameter in PathMatcher4"),​[T3](PathMatcher4.html "type parameter in PathMatcher4"),​[T4](PathMatcher4.html "type parameter in PathMatcher4")> slash()
		```
		- #### slash
		
		
		
		```
		public [PathMatcher4](PathMatcher4.html "class in akka.http.javadsl.server")<[T1](PathMatcher4.html "type parameter in PathMatcher4"),​[T2](PathMatcher4.html "type parameter in PathMatcher4"),​[T3](PathMatcher4.html "type parameter in PathMatcher4"),​[T4](PathMatcher4.html "type parameter in PathMatcher4")> slash​(java.lang.String segment)
		```
		- #### slash
		
		
		
		```
		public [PathMatcher4](PathMatcher4.html "class in akka.http.javadsl.server")<[T1](PathMatcher4.html "type parameter in PathMatcher4"),​[T2](PathMatcher4.html "type parameter in PathMatcher4"),​[T3](PathMatcher4.html "type parameter in PathMatcher4"),​[T4](PathMatcher4.html "type parameter in PathMatcher4")> slash​([PathMatcher0](PathMatcher0.html "class in akka.http.javadsl.server") next)
		```
		- #### slash
		
		
		
		```
		public <N> [PathMatcher5](PathMatcher5.html "class in akka.http.javadsl.server")<[T1](PathMatcher4.html "type parameter in PathMatcher4"),​[T2](PathMatcher4.html "type parameter in PathMatcher4"),​[T3](PathMatcher4.html "type parameter in PathMatcher4"),​[T4](PathMatcher4.html "type parameter in PathMatcher4"),​N> slash​([PathMatcher1](PathMatcher1.html "class in akka.http.javadsl.server")<N> next)
		```
		- #### slash
		
		
		
		```
		public <N1,​N2> [PathMatcher6](PathMatcher6.html "class in akka.http.javadsl.server")<[T1](PathMatcher4.html "type parameter in PathMatcher4"),​[T2](PathMatcher4.html "type parameter in PathMatcher4"),​[T3](PathMatcher4.html "type parameter in PathMatcher4"),​[T4](PathMatcher4.html "type parameter in PathMatcher4"),​N1,​N2> slash​([PathMatcher2](PathMatcher2.html "class in akka.http.javadsl.server")<N1,​N2> next)
		```
		- #### toScala
		
		
		
		```
		public [PathMatcher](../../scaladsl/server/PathMatcher.html "class in akka.http.scaladsl.server")<scala.Tuple4<[T1](PathMatcher4.html "type parameter in PathMatcher4"),​[T2](PathMatcher4.html "type parameter in PathMatcher4"),​[T3](PathMatcher4.html "type parameter in PathMatcher4"),​[T4](PathMatcher4.html "type parameter in PathMatcher4")>> toScala()
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/PathMatcher0.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/PathMatcher1.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/PathMatcher2.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/PathMatcher4.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/PathMatcher5.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/PathMatcher6.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/package-summary.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/server/PathMatcher.html

---
*Source: [https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/PathMatcher4.html](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/PathMatcher4.html)*