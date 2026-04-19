---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T02:09:20Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/PathMatcher6.html
title: PathMatcher6
---

# PathMatcher6

## Content

Package [akka.http.javadsl.server](package-summary.html)
## Class PathMatcher6\<T1,​T2,​T3,​T4,​T5,​T6\>

- java.lang.Object
- - akka.http.javadsl.server.PathMatcher6\<T1,​T2,​T3,​T4,​T5,​T6\>

- ---

```
public final class PathMatcher6<T1,​T2,​T3,​T4,​T5,​T6>
extends java.lang.Object
```

A PathMatcher tries to match a prefix of a given string and returns either a PathMatcher.Matched instance
 if matched, otherwise PathMatchers.Unmatched.

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[PathMatcher6](#%3Cinit%3E(akka.http.scaladsl.server.PathMatcher))​([PathMatcher](../../scaladsl/server/PathMatcher.html "class in akka.http.scaladsl.server")<scala.Tuple6<[T1](PathMatcher6.html "type parameter in PathMatcher6"),​[T2](PathMatcher6.html "type parameter in PathMatcher6"),​[T3](PathMatcher6.html "type parameter in PathMatcher6"),​[T4](PathMatcher6.html "type parameter in PathMatcher6"),​[T5](PathMatcher6.html "type parameter in PathMatcher6"),​[T6](PathMatcher6.html "type parameter in PathMatcher6")>> toScala)` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[PathMatcher6](PathMatcher6.html "class in akka.http.javadsl.server")<[T1](PathMatcher6.html "type parameter in PathMatcher6"),​[T2](PathMatcher6.html "type parameter in PathMatcher6"),​[T3](PathMatcher6.html "type parameter in PathMatcher6"),​[T4](PathMatcher6.html "type parameter in PathMatcher6"),​[T5](PathMatcher6.html "type parameter in PathMatcher6"),​[T6](PathMatcher6.html "type parameter in PathMatcher6")>` | `[concat](#concat(akka.http.javadsl.server.PathMatcher0))​([PathMatcher0](PathMatcher0.html "class in akka.http.javadsl.server") next)` |  |
	| `<N> [PathMatcher7](PathMatcher7.html "class in akka.http.javadsl.server")<[T1](PathMatcher6.html "type parameter in PathMatcher6"),​[T2](PathMatcher6.html "type parameter in PathMatcher6"),​[T3](PathMatcher6.html "type parameter in PathMatcher6"),​[T4](PathMatcher6.html "type parameter in PathMatcher6"),​[T5](PathMatcher6.html "type parameter in PathMatcher6"),​[T6](PathMatcher6.html "type parameter in PathMatcher6"),​N>` | `[concat](#concat(akka.http.javadsl.server.PathMatcher1))​([PathMatcher1](PathMatcher1.html "class in akka.http.javadsl.server")<N> next)` |  |
	| `<N1,​N2>[PathMatcher8](PathMatcher8.html "class in akka.http.javadsl.server")<[T1](PathMatcher6.html "type parameter in PathMatcher6"),​[T2](PathMatcher6.html "type parameter in PathMatcher6"),​[T3](PathMatcher6.html "type parameter in PathMatcher6"),​[T4](PathMatcher6.html "type parameter in PathMatcher6"),​[T5](PathMatcher6.html "type parameter in PathMatcher6"),​[T6](PathMatcher6.html "type parameter in PathMatcher6"),​N1,​N2>` | `[concat](#concat(akka.http.javadsl.server.PathMatcher2))​([PathMatcher2](PathMatcher2.html "class in akka.http.javadsl.server")<N1,​N2> next)` |  |
	| `[PathMatcher6](PathMatcher6.html "class in akka.http.javadsl.server")<[T1](PathMatcher6.html "type parameter in PathMatcher6"),​[T2](PathMatcher6.html "type parameter in PathMatcher6"),​[T3](PathMatcher6.html "type parameter in PathMatcher6"),​[T4](PathMatcher6.html "type parameter in PathMatcher6"),​[T5](PathMatcher6.html "type parameter in PathMatcher6"),​[T6](PathMatcher6.html "type parameter in PathMatcher6")>` | `[concat](#concat(java.lang.String))​(java.lang.String segment)` |  |
	| `[PathMatcher0](PathMatcher0.html "class in akka.http.javadsl.server")` | `[invert](#invert())()` |  |
	| `[PathMatcher6](PathMatcher6.html "class in akka.http.javadsl.server")<[T1](PathMatcher6.html "type parameter in PathMatcher6"),​[T2](PathMatcher6.html "type parameter in PathMatcher6"),​[T3](PathMatcher6.html "type parameter in PathMatcher6"),​[T4](PathMatcher6.html "type parameter in PathMatcher6"),​[T5](PathMatcher6.html "type parameter in PathMatcher6"),​[T6](PathMatcher6.html "type parameter in PathMatcher6")>` | `[orElse](#orElse(akka.http.javadsl.server.PathMatcher6))​([PathMatcher6](PathMatcher6.html "class in akka.http.javadsl.server")<[T1](PathMatcher6.html "type parameter in PathMatcher6"),​[T2](PathMatcher6.html "type parameter in PathMatcher6"),​[T3](PathMatcher6.html "type parameter in PathMatcher6"),​[T4](PathMatcher6.html "type parameter in PathMatcher6"),​[T5](PathMatcher6.html "type parameter in PathMatcher6"),​[T6](PathMatcher6.html "type parameter in PathMatcher6")> alternative)` |  |
	| `[PathMatcher6](PathMatcher6.html "class in akka.http.javadsl.server")<[T1](PathMatcher6.html "type parameter in PathMatcher6"),​[T2](PathMatcher6.html "type parameter in PathMatcher6"),​[T3](PathMatcher6.html "type parameter in PathMatcher6"),​[T4](PathMatcher6.html "type parameter in PathMatcher6"),​[T5](PathMatcher6.html "type parameter in PathMatcher6"),​[T6](PathMatcher6.html "type parameter in PathMatcher6")>` | `[slash](#slash())()` |  |
	| `[PathMatcher6](PathMatcher6.html "class in akka.http.javadsl.server")<[T1](PathMatcher6.html "type parameter in PathMatcher6"),​[T2](PathMatcher6.html "type parameter in PathMatcher6"),​[T3](PathMatcher6.html "type parameter in PathMatcher6"),​[T4](PathMatcher6.html "type parameter in PathMatcher6"),​[T5](PathMatcher6.html "type parameter in PathMatcher6"),​[T6](PathMatcher6.html "type parameter in PathMatcher6")>` | `[slash](#slash(akka.http.javadsl.server.PathMatcher0))​([PathMatcher0](PathMatcher0.html "class in akka.http.javadsl.server") next)` |  |
	| `<N> [PathMatcher7](PathMatcher7.html "class in akka.http.javadsl.server")<[T1](PathMatcher6.html "type parameter in PathMatcher6"),​[T2](PathMatcher6.html "type parameter in PathMatcher6"),​[T3](PathMatcher6.html "type parameter in PathMatcher6"),​[T4](PathMatcher6.html "type parameter in PathMatcher6"),​[T5](PathMatcher6.html "type parameter in PathMatcher6"),​[T6](PathMatcher6.html "type parameter in PathMatcher6"),​N>` | `[slash](#slash(akka.http.javadsl.server.PathMatcher1))​([PathMatcher1](PathMatcher1.html "class in akka.http.javadsl.server")<N> next)` |  |
	| `<N1,​N2>[PathMatcher8](PathMatcher8.html "class in akka.http.javadsl.server")<[T1](PathMatcher6.html "type parameter in PathMatcher6"),​[T2](PathMatcher6.html "type parameter in PathMatcher6"),​[T3](PathMatcher6.html "type parameter in PathMatcher6"),​[T4](PathMatcher6.html "type parameter in PathMatcher6"),​[T5](PathMatcher6.html "type parameter in PathMatcher6"),​[T6](PathMatcher6.html "type parameter in PathMatcher6"),​N1,​N2>` | `[slash](#slash(akka.http.javadsl.server.PathMatcher2))​([PathMatcher2](PathMatcher2.html "class in akka.http.javadsl.server")<N1,​N2> next)` |  |
	| `[PathMatcher6](PathMatcher6.html "class in akka.http.javadsl.server")<[T1](PathMatcher6.html "type parameter in PathMatcher6"),​[T2](PathMatcher6.html "type parameter in PathMatcher6"),​[T3](PathMatcher6.html "type parameter in PathMatcher6"),​[T4](PathMatcher6.html "type parameter in PathMatcher6"),​[T5](PathMatcher6.html "type parameter in PathMatcher6"),​[T6](PathMatcher6.html "type parameter in PathMatcher6")>` | `[slash](#slash(java.lang.String))​(java.lang.String segment)` |  |
	| `[PathMatcher](../../scaladsl/server/PathMatcher.html "class in akka.http.scaladsl.server")<scala.Tuple6<[T1](PathMatcher6.html "type parameter in PathMatcher6"),​[T2](PathMatcher6.html "type parameter in PathMatcher6"),​[T3](PathMatcher6.html "type parameter in PathMatcher6"),​[T4](PathMatcher6.html "type parameter in PathMatcher6"),​[T5](PathMatcher6.html "type parameter in PathMatcher6"),​[T6](PathMatcher6.html "type parameter in PathMatcher6")>>` | `[toScala](#toScala())()` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### PathMatcher6
		
		
		
		```
		public PathMatcher6​([PathMatcher](../../scaladsl/server/PathMatcher.html "class in akka.http.scaladsl.server")<scala.Tuple6<[T1](PathMatcher6.html "type parameter in PathMatcher6"),​[T2](PathMatcher6.html "type parameter in PathMatcher6"),​[T3](PathMatcher6.html "type parameter in PathMatcher6"),​[T4](PathMatcher6.html "type parameter in PathMatcher6"),​[T5](PathMatcher6.html "type parameter in PathMatcher6"),​[T6](PathMatcher6.html "type parameter in PathMatcher6")>> toScala)
		```

	- ### Method Detail
	
	
	
		- #### concat
		
		
		
		```
		public [PathMatcher6](PathMatcher6.html "class in akka.http.javadsl.server")<[T1](PathMatcher6.html "type parameter in PathMatcher6"),​[T2](PathMatcher6.html "type parameter in PathMatcher6"),​[T3](PathMatcher6.html "type parameter in PathMatcher6"),​[T4](PathMatcher6.html "type parameter in PathMatcher6"),​[T5](PathMatcher6.html "type parameter in PathMatcher6"),​[T6](PathMatcher6.html "type parameter in PathMatcher6")> concat​(java.lang.String segment)
		```
		- #### concat
		
		
		
		```
		public [PathMatcher6](PathMatcher6.html "class in akka.http.javadsl.server")<[T1](PathMatcher6.html "type parameter in PathMatcher6"),​[T2](PathMatcher6.html "type parameter in PathMatcher6"),​[T3](PathMatcher6.html "type parameter in PathMatcher6"),​[T4](PathMatcher6.html "type parameter in PathMatcher6"),​[T5](PathMatcher6.html "type parameter in PathMatcher6"),​[T6](PathMatcher6.html "type parameter in PathMatcher6")> concat​([PathMatcher0](PathMatcher0.html "class in akka.http.javadsl.server") next)
		```
		- #### concat
		
		
		
		```
		public <N> [PathMatcher7](PathMatcher7.html "class in akka.http.javadsl.server")<[T1](PathMatcher6.html "type parameter in PathMatcher6"),​[T2](PathMatcher6.html "type parameter in PathMatcher6"),​[T3](PathMatcher6.html "type parameter in PathMatcher6"),​[T4](PathMatcher6.html "type parameter in PathMatcher6"),​[T5](PathMatcher6.html "type parameter in PathMatcher6"),​[T6](PathMatcher6.html "type parameter in PathMatcher6"),​N> concat​([PathMatcher1](PathMatcher1.html "class in akka.http.javadsl.server")<N> next)
		```
		- #### concat
		
		
		
		```
		public <N1,​N2> [PathMatcher8](PathMatcher8.html "class in akka.http.javadsl.server")<[T1](PathMatcher6.html "type parameter in PathMatcher6"),​[T2](PathMatcher6.html "type parameter in PathMatcher6"),​[T3](PathMatcher6.html "type parameter in PathMatcher6"),​[T4](PathMatcher6.html "type parameter in PathMatcher6"),​[T5](PathMatcher6.html "type parameter in PathMatcher6"),​[T6](PathMatcher6.html "type parameter in PathMatcher6"),​N1,​N2> concat​([PathMatcher2](PathMatcher2.html "class in akka.http.javadsl.server")<N1,​N2> next)
		```
		- #### invert
		
		
		
		```
		public [PathMatcher0](PathMatcher0.html "class in akka.http.javadsl.server") invert()
		```
		- #### orElse
		
		
		
		```
		public [PathMatcher6](PathMatcher6.html "class in akka.http.javadsl.server")<[T1](PathMatcher6.html "type parameter in PathMatcher6"),​[T2](PathMatcher6.html "type parameter in PathMatcher6"),​[T3](PathMatcher6.html "type parameter in PathMatcher6"),​[T4](PathMatcher6.html "type parameter in PathMatcher6"),​[T5](PathMatcher6.html "type parameter in PathMatcher6"),​[T6](PathMatcher6.html "type parameter in PathMatcher6")> orElse​([PathMatcher6](PathMatcher6.html "class in akka.http.javadsl.server")<[T1](PathMatcher6.html "type parameter in PathMatcher6"),​[T2](PathMatcher6.html "type parameter in PathMatcher6"),​[T3](PathMatcher6.html "type parameter in PathMatcher6"),​[T4](PathMatcher6.html "type parameter in PathMatcher6"),​[T5](PathMatcher6.html "type parameter in PathMatcher6"),​[T6](PathMatcher6.html "type parameter in PathMatcher6")> alternative)
		```
		- #### slash
		
		
		
		```
		public [PathMatcher6](PathMatcher6.html "class in akka.http.javadsl.server")<[T1](PathMatcher6.html "type parameter in PathMatcher6"),​[T2](PathMatcher6.html "type parameter in PathMatcher6"),​[T3](PathMatcher6.html "type parameter in PathMatcher6"),​[T4](PathMatcher6.html "type parameter in PathMatcher6"),​[T5](PathMatcher6.html "type parameter in PathMatcher6"),​[T6](PathMatcher6.html "type parameter in PathMatcher6")> slash()
		```
		- #### slash
		
		
		
		```
		public [PathMatcher6](PathMatcher6.html "class in akka.http.javadsl.server")<[T1](PathMatcher6.html "type parameter in PathMatcher6"),​[T2](PathMatcher6.html "type parameter in PathMatcher6"),​[T3](PathMatcher6.html "type parameter in PathMatcher6"),​[T4](PathMatcher6.html "type parameter in PathMatcher6"),​[T5](PathMatcher6.html "type parameter in PathMatcher6"),​[T6](PathMatcher6.html "type parameter in PathMatcher6")> slash​(java.lang.String segment)
		```
		- #### slash
		
		
		
		```
		public [PathMatcher6](PathMatcher6.html "class in akka.http.javadsl.server")<[T1](PathMatcher6.html "type parameter in PathMatcher6"),​[T2](PathMatcher6.html "type parameter in PathMatcher6"),​[T3](PathMatcher6.html "type parameter in PathMatcher6"),​[T4](PathMatcher6.html "type parameter in PathMatcher6"),​[T5](PathMatcher6.html "type parameter in PathMatcher6"),​[T6](PathMatcher6.html "type parameter in PathMatcher6")> slash​([PathMatcher0](PathMatcher0.html "class in akka.http.javadsl.server") next)
		```
		- #### slash
		
		
		
		```
		public <N> [PathMatcher7](PathMatcher7.html "class in akka.http.javadsl.server")<[T1](PathMatcher6.html "type parameter in PathMatcher6"),​[T2](PathMatcher6.html "type parameter in PathMatcher6"),​[T3](PathMatcher6.html "type parameter in PathMatcher6"),​[T4](PathMatcher6.html "type parameter in PathMatcher6"),​[T5](PathMatcher6.html "type parameter in PathMatcher6"),​[T6](PathMatcher6.html "type parameter in PathMatcher6"),​N> slash​([PathMatcher1](PathMatcher1.html "class in akka.http.javadsl.server")<N> next)
		```
		- #### slash
		
		
		
		```
		public <N1,​N2> [PathMatcher8](PathMatcher8.html "class in akka.http.javadsl.server")<[T1](PathMatcher6.html "type parameter in PathMatcher6"),​[T2](PathMatcher6.html "type parameter in PathMatcher6"),​[T3](PathMatcher6.html "type parameter in PathMatcher6"),​[T4](PathMatcher6.html "type parameter in PathMatcher6"),​[T5](PathMatcher6.html "type parameter in PathMatcher6"),​[T6](PathMatcher6.html "type parameter in PathMatcher6"),​N1,​N2> slash​([PathMatcher2](PathMatcher2.html "class in akka.http.javadsl.server")<N1,​N2> next)
		```
		- #### toScala
		
		
		
		```
		public [PathMatcher](../../scaladsl/server/PathMatcher.html "class in akka.http.scaladsl.server")<scala.Tuple6<[T1](PathMatcher6.html "type parameter in PathMatcher6"),​[T2](PathMatcher6.html "type parameter in PathMatcher6"),​[T3](PathMatcher6.html "type parameter in PathMatcher6"),​[T4](PathMatcher6.html "type parameter in PathMatcher6"),​[T5](PathMatcher6.html "type parameter in PathMatcher6"),​[T6](PathMatcher6.html "type parameter in PathMatcher6")>> toScala()
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/PathMatcher0.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/PathMatcher1.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/PathMatcher2.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/PathMatcher6.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/PathMatcher7.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/PathMatcher8.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/package-summary.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/server/PathMatcher.html

---
*Source: [https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/PathMatcher6.html](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/PathMatcher6.html)*