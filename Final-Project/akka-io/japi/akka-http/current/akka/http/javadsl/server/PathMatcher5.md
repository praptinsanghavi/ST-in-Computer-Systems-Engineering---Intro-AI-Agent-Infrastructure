---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T23:47:41Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/server/PathMatcher5.html
title: PathMatcher5
---

# PathMatcher5

## Content

Package [akka.http.javadsl.server](package-summary.html)
## Class PathMatcher5\<T1,​T2,​T3,​T4,​T5\>

- java.lang.Object
- - akka.http.javadsl.server.PathMatcher5\<T1,​T2,​T3,​T4,​T5\>

- ---

```
public final class PathMatcher5<T1,​T2,​T3,​T4,​T5>
extends java.lang.Object
```

A PathMatcher tries to match a prefix of a given string and returns either a PathMatcher.Matched instance
 if matched, otherwise PathMatchers.Unmatched.

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[PathMatcher5](#%3Cinit%3E(akka.http.scaladsl.server.PathMatcher))​([PathMatcher](../../scaladsl/server/PathMatcher.html "class in akka.http.scaladsl.server")<scala.Tuple5<[T1](PathMatcher5.html "type parameter in PathMatcher5"),​[T2](PathMatcher5.html "type parameter in PathMatcher5"),​[T3](PathMatcher5.html "type parameter in PathMatcher5"),​[T4](PathMatcher5.html "type parameter in PathMatcher5"),​[T5](PathMatcher5.html "type parameter in PathMatcher5")>> toScala)` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[PathMatcher5](PathMatcher5.html "class in akka.http.javadsl.server")<[T1](PathMatcher5.html "type parameter in PathMatcher5"),​[T2](PathMatcher5.html "type parameter in PathMatcher5"),​[T3](PathMatcher5.html "type parameter in PathMatcher5"),​[T4](PathMatcher5.html "type parameter in PathMatcher5"),​[T5](PathMatcher5.html "type parameter in PathMatcher5")>` | `[concat](#concat(akka.http.javadsl.server.PathMatcher0))​([PathMatcher0](PathMatcher0.html "class in akka.http.javadsl.server") next)` |  |
	| `<N> [PathMatcher6](PathMatcher6.html "class in akka.http.javadsl.server")<[T1](PathMatcher5.html "type parameter in PathMatcher5"),​[T2](PathMatcher5.html "type parameter in PathMatcher5"),​[T3](PathMatcher5.html "type parameter in PathMatcher5"),​[T4](PathMatcher5.html "type parameter in PathMatcher5"),​[T5](PathMatcher5.html "type parameter in PathMatcher5"),​N>` | `[concat](#concat(akka.http.javadsl.server.PathMatcher1))​([PathMatcher1](PathMatcher1.html "class in akka.http.javadsl.server")<N> next)` |  |
	| `<N1,​N2>[PathMatcher7](PathMatcher7.html "class in akka.http.javadsl.server")<[T1](PathMatcher5.html "type parameter in PathMatcher5"),​[T2](PathMatcher5.html "type parameter in PathMatcher5"),​[T3](PathMatcher5.html "type parameter in PathMatcher5"),​[T4](PathMatcher5.html "type parameter in PathMatcher5"),​[T5](PathMatcher5.html "type parameter in PathMatcher5"),​N1,​N2>` | `[concat](#concat(akka.http.javadsl.server.PathMatcher2))​([PathMatcher2](PathMatcher2.html "class in akka.http.javadsl.server")<N1,​N2> next)` |  |
	| `[PathMatcher5](PathMatcher5.html "class in akka.http.javadsl.server")<[T1](PathMatcher5.html "type parameter in PathMatcher5"),​[T2](PathMatcher5.html "type parameter in PathMatcher5"),​[T3](PathMatcher5.html "type parameter in PathMatcher5"),​[T4](PathMatcher5.html "type parameter in PathMatcher5"),​[T5](PathMatcher5.html "type parameter in PathMatcher5")>` | `[concat](#concat(java.lang.String))​(java.lang.String segment)` |  |
	| `[PathMatcher0](PathMatcher0.html "class in akka.http.javadsl.server")` | `[invert](#invert())()` |  |
	| `[PathMatcher5](PathMatcher5.html "class in akka.http.javadsl.server")<[T1](PathMatcher5.html "type parameter in PathMatcher5"),​[T2](PathMatcher5.html "type parameter in PathMatcher5"),​[T3](PathMatcher5.html "type parameter in PathMatcher5"),​[T4](PathMatcher5.html "type parameter in PathMatcher5"),​[T5](PathMatcher5.html "type parameter in PathMatcher5")>` | `[orElse](#orElse(akka.http.javadsl.server.PathMatcher5))​([PathMatcher5](PathMatcher5.html "class in akka.http.javadsl.server")<[T1](PathMatcher5.html "type parameter in PathMatcher5"),​[T2](PathMatcher5.html "type parameter in PathMatcher5"),​[T3](PathMatcher5.html "type parameter in PathMatcher5"),​[T4](PathMatcher5.html "type parameter in PathMatcher5"),​[T5](PathMatcher5.html "type parameter in PathMatcher5")> alternative)` |  |
	| `[PathMatcher5](PathMatcher5.html "class in akka.http.javadsl.server")<[T1](PathMatcher5.html "type parameter in PathMatcher5"),​[T2](PathMatcher5.html "type parameter in PathMatcher5"),​[T3](PathMatcher5.html "type parameter in PathMatcher5"),​[T4](PathMatcher5.html "type parameter in PathMatcher5"),​[T5](PathMatcher5.html "type parameter in PathMatcher5")>` | `[slash](#slash())()` |  |
	| `[PathMatcher5](PathMatcher5.html "class in akka.http.javadsl.server")<[T1](PathMatcher5.html "type parameter in PathMatcher5"),​[T2](PathMatcher5.html "type parameter in PathMatcher5"),​[T3](PathMatcher5.html "type parameter in PathMatcher5"),​[T4](PathMatcher5.html "type parameter in PathMatcher5"),​[T5](PathMatcher5.html "type parameter in PathMatcher5")>` | `[slash](#slash(akka.http.javadsl.server.PathMatcher0))​([PathMatcher0](PathMatcher0.html "class in akka.http.javadsl.server") next)` |  |
	| `<N> [PathMatcher6](PathMatcher6.html "class in akka.http.javadsl.server")<[T1](PathMatcher5.html "type parameter in PathMatcher5"),​[T2](PathMatcher5.html "type parameter in PathMatcher5"),​[T3](PathMatcher5.html "type parameter in PathMatcher5"),​[T4](PathMatcher5.html "type parameter in PathMatcher5"),​[T5](PathMatcher5.html "type parameter in PathMatcher5"),​N>` | `[slash](#slash(akka.http.javadsl.server.PathMatcher1))​([PathMatcher1](PathMatcher1.html "class in akka.http.javadsl.server")<N> next)` |  |
	| `<N1,​N2>[PathMatcher7](PathMatcher7.html "class in akka.http.javadsl.server")<[T1](PathMatcher5.html "type parameter in PathMatcher5"),​[T2](PathMatcher5.html "type parameter in PathMatcher5"),​[T3](PathMatcher5.html "type parameter in PathMatcher5"),​[T4](PathMatcher5.html "type parameter in PathMatcher5"),​[T5](PathMatcher5.html "type parameter in PathMatcher5"),​N1,​N2>` | `[slash](#slash(akka.http.javadsl.server.PathMatcher2))​([PathMatcher2](PathMatcher2.html "class in akka.http.javadsl.server")<N1,​N2> next)` |  |
	| `[PathMatcher5](PathMatcher5.html "class in akka.http.javadsl.server")<[T1](PathMatcher5.html "type parameter in PathMatcher5"),​[T2](PathMatcher5.html "type parameter in PathMatcher5"),​[T3](PathMatcher5.html "type parameter in PathMatcher5"),​[T4](PathMatcher5.html "type parameter in PathMatcher5"),​[T5](PathMatcher5.html "type parameter in PathMatcher5")>` | `[slash](#slash(java.lang.String))​(java.lang.String segment)` |  |
	| `[PathMatcher](../../scaladsl/server/PathMatcher.html "class in akka.http.scaladsl.server")<scala.Tuple5<[T1](PathMatcher5.html "type parameter in PathMatcher5"),​[T2](PathMatcher5.html "type parameter in PathMatcher5"),​[T3](PathMatcher5.html "type parameter in PathMatcher5"),​[T4](PathMatcher5.html "type parameter in PathMatcher5"),​[T5](PathMatcher5.html "type parameter in PathMatcher5")>>` | `[toScala](#toScala())()` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### PathMatcher5
		
		
		
		```
		public PathMatcher5​([PathMatcher](../../scaladsl/server/PathMatcher.html "class in akka.http.scaladsl.server")<scala.Tuple5<[T1](PathMatcher5.html "type parameter in PathMatcher5"),​[T2](PathMatcher5.html "type parameter in PathMatcher5"),​[T3](PathMatcher5.html "type parameter in PathMatcher5"),​[T4](PathMatcher5.html "type parameter in PathMatcher5"),​[T5](PathMatcher5.html "type parameter in PathMatcher5")>> toScala)
		```

	- ### Method Detail
	
	
	
		- #### concat
		
		
		
		```
		public [PathMatcher5](PathMatcher5.html "class in akka.http.javadsl.server")<[T1](PathMatcher5.html "type parameter in PathMatcher5"),​[T2](PathMatcher5.html "type parameter in PathMatcher5"),​[T3](PathMatcher5.html "type parameter in PathMatcher5"),​[T4](PathMatcher5.html "type parameter in PathMatcher5"),​[T5](PathMatcher5.html "type parameter in PathMatcher5")> concat​(java.lang.String segment)
		```
		- #### concat
		
		
		
		```
		public [PathMatcher5](PathMatcher5.html "class in akka.http.javadsl.server")<[T1](PathMatcher5.html "type parameter in PathMatcher5"),​[T2](PathMatcher5.html "type parameter in PathMatcher5"),​[T3](PathMatcher5.html "type parameter in PathMatcher5"),​[T4](PathMatcher5.html "type parameter in PathMatcher5"),​[T5](PathMatcher5.html "type parameter in PathMatcher5")> concat​([PathMatcher0](PathMatcher0.html "class in akka.http.javadsl.server") next)
		```
		- #### concat
		
		
		
		```
		public <N> [PathMatcher6](PathMatcher6.html "class in akka.http.javadsl.server")<[T1](PathMatcher5.html "type parameter in PathMatcher5"),​[T2](PathMatcher5.html "type parameter in PathMatcher5"),​[T3](PathMatcher5.html "type parameter in PathMatcher5"),​[T4](PathMatcher5.html "type parameter in PathMatcher5"),​[T5](PathMatcher5.html "type parameter in PathMatcher5"),​N> concat​([PathMatcher1](PathMatcher1.html "class in akka.http.javadsl.server")<N> next)
		```
		- #### concat
		
		
		
		```
		public <N1,​N2> [PathMatcher7](PathMatcher7.html "class in akka.http.javadsl.server")<[T1](PathMatcher5.html "type parameter in PathMatcher5"),​[T2](PathMatcher5.html "type parameter in PathMatcher5"),​[T3](PathMatcher5.html "type parameter in PathMatcher5"),​[T4](PathMatcher5.html "type parameter in PathMatcher5"),​[T5](PathMatcher5.html "type parameter in PathMatcher5"),​N1,​N2> concat​([PathMatcher2](PathMatcher2.html "class in akka.http.javadsl.server")<N1,​N2> next)
		```
		- #### invert
		
		
		
		```
		public [PathMatcher0](PathMatcher0.html "class in akka.http.javadsl.server") invert()
		```
		- #### orElse
		
		
		
		```
		public [PathMatcher5](PathMatcher5.html "class in akka.http.javadsl.server")<[T1](PathMatcher5.html "type parameter in PathMatcher5"),​[T2](PathMatcher5.html "type parameter in PathMatcher5"),​[T3](PathMatcher5.html "type parameter in PathMatcher5"),​[T4](PathMatcher5.html "type parameter in PathMatcher5"),​[T5](PathMatcher5.html "type parameter in PathMatcher5")> orElse​([PathMatcher5](PathMatcher5.html "class in akka.http.javadsl.server")<[T1](PathMatcher5.html "type parameter in PathMatcher5"),​[T2](PathMatcher5.html "type parameter in PathMatcher5"),​[T3](PathMatcher5.html "type parameter in PathMatcher5"),​[T4](PathMatcher5.html "type parameter in PathMatcher5"),​[T5](PathMatcher5.html "type parameter in PathMatcher5")> alternative)
		```
		- #### slash
		
		
		
		```
		public [PathMatcher5](PathMatcher5.html "class in akka.http.javadsl.server")<[T1](PathMatcher5.html "type parameter in PathMatcher5"),​[T2](PathMatcher5.html "type parameter in PathMatcher5"),​[T3](PathMatcher5.html "type parameter in PathMatcher5"),​[T4](PathMatcher5.html "type parameter in PathMatcher5"),​[T5](PathMatcher5.html "type parameter in PathMatcher5")> slash()
		```
		- #### slash
		
		
		
		```
		public [PathMatcher5](PathMatcher5.html "class in akka.http.javadsl.server")<[T1](PathMatcher5.html "type parameter in PathMatcher5"),​[T2](PathMatcher5.html "type parameter in PathMatcher5"),​[T3](PathMatcher5.html "type parameter in PathMatcher5"),​[T4](PathMatcher5.html "type parameter in PathMatcher5"),​[T5](PathMatcher5.html "type parameter in PathMatcher5")> slash​(java.lang.String segment)
		```
		- #### slash
		
		
		
		```
		public [PathMatcher5](PathMatcher5.html "class in akka.http.javadsl.server")<[T1](PathMatcher5.html "type parameter in PathMatcher5"),​[T2](PathMatcher5.html "type parameter in PathMatcher5"),​[T3](PathMatcher5.html "type parameter in PathMatcher5"),​[T4](PathMatcher5.html "type parameter in PathMatcher5"),​[T5](PathMatcher5.html "type parameter in PathMatcher5")> slash​([PathMatcher0](PathMatcher0.html "class in akka.http.javadsl.server") next)
		```
		- #### slash
		
		
		
		```
		public <N> [PathMatcher6](PathMatcher6.html "class in akka.http.javadsl.server")<[T1](PathMatcher5.html "type parameter in PathMatcher5"),​[T2](PathMatcher5.html "type parameter in PathMatcher5"),​[T3](PathMatcher5.html "type parameter in PathMatcher5"),​[T4](PathMatcher5.html "type parameter in PathMatcher5"),​[T5](PathMatcher5.html "type parameter in PathMatcher5"),​N> slash​([PathMatcher1](PathMatcher1.html "class in akka.http.javadsl.server")<N> next)
		```
		- #### slash
		
		
		
		```
		public <N1,​N2> [PathMatcher7](PathMatcher7.html "class in akka.http.javadsl.server")<[T1](PathMatcher5.html "type parameter in PathMatcher5"),​[T2](PathMatcher5.html "type parameter in PathMatcher5"),​[T3](PathMatcher5.html "type parameter in PathMatcher5"),​[T4](PathMatcher5.html "type parameter in PathMatcher5"),​[T5](PathMatcher5.html "type parameter in PathMatcher5"),​N1,​N2> slash​([PathMatcher2](PathMatcher2.html "class in akka.http.javadsl.server")<N1,​N2> next)
		```
		- #### toScala
		
		
		
		```
		public [PathMatcher](../../scaladsl/server/PathMatcher.html "class in akka.http.scaladsl.server")<scala.Tuple5<[T1](PathMatcher5.html "type parameter in PathMatcher5"),​[T2](PathMatcher5.html "type parameter in PathMatcher5"),​[T3](PathMatcher5.html "type parameter in PathMatcher5"),​[T4](PathMatcher5.html "type parameter in PathMatcher5"),​[T5](PathMatcher5.html "type parameter in PathMatcher5")>> toScala()
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/server/PathMatcher0.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/server/PathMatcher1.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/server/PathMatcher2.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/server/PathMatcher5.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/server/PathMatcher6.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/server/PathMatcher7.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/server/package-summary.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/PathMatcher.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/server/PathMatcher5.html](https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/server/PathMatcher5.html)*