---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T02:09:22Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/PathMatcher8.html
title: PathMatcher8
---

# PathMatcher8

## Content

Package [akka.http.javadsl.server](package-summary.html)
## Class PathMatcher8\<T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8\>

- java.lang.Object
- - akka.http.javadsl.server.PathMatcher8\<T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8\>

- ---

```
public final class PathMatcher8<T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8>
extends java.lang.Object
```

A PathMatcher tries to match a prefix of a given string and returns either a PathMatcher.Matched instance
 if matched, otherwise PathMatchers.Unmatched.

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[PathMatcher8](#%3Cinit%3E(akka.http.scaladsl.server.PathMatcher))​([PathMatcher](../../scaladsl/server/PathMatcher.html "class in akka.http.scaladsl.server")<scala.Tuple8<[T1](PathMatcher8.html "type parameter in PathMatcher8"),​[T2](PathMatcher8.html "type parameter in PathMatcher8"),​[T3](PathMatcher8.html "type parameter in PathMatcher8"),​[T4](PathMatcher8.html "type parameter in PathMatcher8"),​[T5](PathMatcher8.html "type parameter in PathMatcher8"),​[T6](PathMatcher8.html "type parameter in PathMatcher8"),​[T7](PathMatcher8.html "type parameter in PathMatcher8"),​[T8](PathMatcher8.html "type parameter in PathMatcher8")>> toScala)` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[PathMatcher8](PathMatcher8.html "class in akka.http.javadsl.server")<[T1](PathMatcher8.html "type parameter in PathMatcher8"),​[T2](PathMatcher8.html "type parameter in PathMatcher8"),​[T3](PathMatcher8.html "type parameter in PathMatcher8"),​[T4](PathMatcher8.html "type parameter in PathMatcher8"),​[T5](PathMatcher8.html "type parameter in PathMatcher8"),​[T6](PathMatcher8.html "type parameter in PathMatcher8"),​[T7](PathMatcher8.html "type parameter in PathMatcher8"),​[T8](PathMatcher8.html "type parameter in PathMatcher8")>` | `[concat](#concat(akka.http.javadsl.server.PathMatcher0))​([PathMatcher0](PathMatcher0.html "class in akka.http.javadsl.server") next)` |  |
	| `<N> [PathMatcher9](PathMatcher9.html "class in akka.http.javadsl.server")<[T1](PathMatcher8.html "type parameter in PathMatcher8"),​[T2](PathMatcher8.html "type parameter in PathMatcher8"),​[T3](PathMatcher8.html "type parameter in PathMatcher8"),​[T4](PathMatcher8.html "type parameter in PathMatcher8"),​[T5](PathMatcher8.html "type parameter in PathMatcher8"),​[T6](PathMatcher8.html "type parameter in PathMatcher8"),​[T7](PathMatcher8.html "type parameter in PathMatcher8"),​[T8](PathMatcher8.html "type parameter in PathMatcher8"),​N>` | `[concat](#concat(akka.http.javadsl.server.PathMatcher1))​([PathMatcher1](PathMatcher1.html "class in akka.http.javadsl.server")<N> next)` |  |
	| `<N1,​N2>[PathMatcher10](PathMatcher10.html "class in akka.http.javadsl.server")<[T1](PathMatcher8.html "type parameter in PathMatcher8"),​[T2](PathMatcher8.html "type parameter in PathMatcher8"),​[T3](PathMatcher8.html "type parameter in PathMatcher8"),​[T4](PathMatcher8.html "type parameter in PathMatcher8"),​[T5](PathMatcher8.html "type parameter in PathMatcher8"),​[T6](PathMatcher8.html "type parameter in PathMatcher8"),​[T7](PathMatcher8.html "type parameter in PathMatcher8"),​[T8](PathMatcher8.html "type parameter in PathMatcher8"),​N1,​N2>` | `[concat](#concat(akka.http.javadsl.server.PathMatcher2))​([PathMatcher2](PathMatcher2.html "class in akka.http.javadsl.server")<N1,​N2> next)` |  |
	| `[PathMatcher8](PathMatcher8.html "class in akka.http.javadsl.server")<[T1](PathMatcher8.html "type parameter in PathMatcher8"),​[T2](PathMatcher8.html "type parameter in PathMatcher8"),​[T3](PathMatcher8.html "type parameter in PathMatcher8"),​[T4](PathMatcher8.html "type parameter in PathMatcher8"),​[T5](PathMatcher8.html "type parameter in PathMatcher8"),​[T6](PathMatcher8.html "type parameter in PathMatcher8"),​[T7](PathMatcher8.html "type parameter in PathMatcher8"),​[T8](PathMatcher8.html "type parameter in PathMatcher8")>` | `[concat](#concat(java.lang.String))​(java.lang.String segment)` |  |
	| `[PathMatcher0](PathMatcher0.html "class in akka.http.javadsl.server")` | `[invert](#invert())()` |  |
	| `[PathMatcher8](PathMatcher8.html "class in akka.http.javadsl.server")<[T1](PathMatcher8.html "type parameter in PathMatcher8"),​[T2](PathMatcher8.html "type parameter in PathMatcher8"),​[T3](PathMatcher8.html "type parameter in PathMatcher8"),​[T4](PathMatcher8.html "type parameter in PathMatcher8"),​[T5](PathMatcher8.html "type parameter in PathMatcher8"),​[T6](PathMatcher8.html "type parameter in PathMatcher8"),​[T7](PathMatcher8.html "type parameter in PathMatcher8"),​[T8](PathMatcher8.html "type parameter in PathMatcher8")>` | `[orElse](#orElse(akka.http.javadsl.server.PathMatcher8))​([PathMatcher8](PathMatcher8.html "class in akka.http.javadsl.server")<[T1](PathMatcher8.html "type parameter in PathMatcher8"),​[T2](PathMatcher8.html "type parameter in PathMatcher8"),​[T3](PathMatcher8.html "type parameter in PathMatcher8"),​[T4](PathMatcher8.html "type parameter in PathMatcher8"),​[T5](PathMatcher8.html "type parameter in PathMatcher8"),​[T6](PathMatcher8.html "type parameter in PathMatcher8"),​[T7](PathMatcher8.html "type parameter in PathMatcher8"),​[T8](PathMatcher8.html "type parameter in PathMatcher8")> alternative)` |  |
	| `[PathMatcher8](PathMatcher8.html "class in akka.http.javadsl.server")<[T1](PathMatcher8.html "type parameter in PathMatcher8"),​[T2](PathMatcher8.html "type parameter in PathMatcher8"),​[T3](PathMatcher8.html "type parameter in PathMatcher8"),​[T4](PathMatcher8.html "type parameter in PathMatcher8"),​[T5](PathMatcher8.html "type parameter in PathMatcher8"),​[T6](PathMatcher8.html "type parameter in PathMatcher8"),​[T7](PathMatcher8.html "type parameter in PathMatcher8"),​[T8](PathMatcher8.html "type parameter in PathMatcher8")>` | `[slash](#slash())()` |  |
	| `[PathMatcher8](PathMatcher8.html "class in akka.http.javadsl.server")<[T1](PathMatcher8.html "type parameter in PathMatcher8"),​[T2](PathMatcher8.html "type parameter in PathMatcher8"),​[T3](PathMatcher8.html "type parameter in PathMatcher8"),​[T4](PathMatcher8.html "type parameter in PathMatcher8"),​[T5](PathMatcher8.html "type parameter in PathMatcher8"),​[T6](PathMatcher8.html "type parameter in PathMatcher8"),​[T7](PathMatcher8.html "type parameter in PathMatcher8"),​[T8](PathMatcher8.html "type parameter in PathMatcher8")>` | `[slash](#slash(akka.http.javadsl.server.PathMatcher0))​([PathMatcher0](PathMatcher0.html "class in akka.http.javadsl.server") next)` |  |
	| `<N> [PathMatcher9](PathMatcher9.html "class in akka.http.javadsl.server")<[T1](PathMatcher8.html "type parameter in PathMatcher8"),​[T2](PathMatcher8.html "type parameter in PathMatcher8"),​[T3](PathMatcher8.html "type parameter in PathMatcher8"),​[T4](PathMatcher8.html "type parameter in PathMatcher8"),​[T5](PathMatcher8.html "type parameter in PathMatcher8"),​[T6](PathMatcher8.html "type parameter in PathMatcher8"),​[T7](PathMatcher8.html "type parameter in PathMatcher8"),​[T8](PathMatcher8.html "type parameter in PathMatcher8"),​N>` | `[slash](#slash(akka.http.javadsl.server.PathMatcher1))​([PathMatcher1](PathMatcher1.html "class in akka.http.javadsl.server")<N> next)` |  |
	| `<N1,​N2>[PathMatcher10](PathMatcher10.html "class in akka.http.javadsl.server")<[T1](PathMatcher8.html "type parameter in PathMatcher8"),​[T2](PathMatcher8.html "type parameter in PathMatcher8"),​[T3](PathMatcher8.html "type parameter in PathMatcher8"),​[T4](PathMatcher8.html "type parameter in PathMatcher8"),​[T5](PathMatcher8.html "type parameter in PathMatcher8"),​[T6](PathMatcher8.html "type parameter in PathMatcher8"),​[T7](PathMatcher8.html "type parameter in PathMatcher8"),​[T8](PathMatcher8.html "type parameter in PathMatcher8"),​N1,​N2>` | `[slash](#slash(akka.http.javadsl.server.PathMatcher2))​([PathMatcher2](PathMatcher2.html "class in akka.http.javadsl.server")<N1,​N2> next)` |  |
	| `[PathMatcher8](PathMatcher8.html "class in akka.http.javadsl.server")<[T1](PathMatcher8.html "type parameter in PathMatcher8"),​[T2](PathMatcher8.html "type parameter in PathMatcher8"),​[T3](PathMatcher8.html "type parameter in PathMatcher8"),​[T4](PathMatcher8.html "type parameter in PathMatcher8"),​[T5](PathMatcher8.html "type parameter in PathMatcher8"),​[T6](PathMatcher8.html "type parameter in PathMatcher8"),​[T7](PathMatcher8.html "type parameter in PathMatcher8"),​[T8](PathMatcher8.html "type parameter in PathMatcher8")>` | `[slash](#slash(java.lang.String))​(java.lang.String segment)` |  |
	| `[PathMatcher](../../scaladsl/server/PathMatcher.html "class in akka.http.scaladsl.server")<scala.Tuple8<[T1](PathMatcher8.html "type parameter in PathMatcher8"),​[T2](PathMatcher8.html "type parameter in PathMatcher8"),​[T3](PathMatcher8.html "type parameter in PathMatcher8"),​[T4](PathMatcher8.html "type parameter in PathMatcher8"),​[T5](PathMatcher8.html "type parameter in PathMatcher8"),​[T6](PathMatcher8.html "type parameter in PathMatcher8"),​[T7](PathMatcher8.html "type parameter in PathMatcher8"),​[T8](PathMatcher8.html "type parameter in PathMatcher8")>>` | `[toScala](#toScala())()` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### PathMatcher8
		
		
		
		```
		public PathMatcher8​([PathMatcher](../../scaladsl/server/PathMatcher.html "class in akka.http.scaladsl.server")<scala.Tuple8<[T1](PathMatcher8.html "type parameter in PathMatcher8"),​[T2](PathMatcher8.html "type parameter in PathMatcher8"),​[T3](PathMatcher8.html "type parameter in PathMatcher8"),​[T4](PathMatcher8.html "type parameter in PathMatcher8"),​[T5](PathMatcher8.html "type parameter in PathMatcher8"),​[T6](PathMatcher8.html "type parameter in PathMatcher8"),​[T7](PathMatcher8.html "type parameter in PathMatcher8"),​[T8](PathMatcher8.html "type parameter in PathMatcher8")>> toScala)
		```

	- ### Method Detail
	
	
	
		- #### concat
		
		
		
		```
		public [PathMatcher8](PathMatcher8.html "class in akka.http.javadsl.server")<[T1](PathMatcher8.html "type parameter in PathMatcher8"),​[T2](PathMatcher8.html "type parameter in PathMatcher8"),​[T3](PathMatcher8.html "type parameter in PathMatcher8"),​[T4](PathMatcher8.html "type parameter in PathMatcher8"),​[T5](PathMatcher8.html "type parameter in PathMatcher8"),​[T6](PathMatcher8.html "type parameter in PathMatcher8"),​[T7](PathMatcher8.html "type parameter in PathMatcher8"),​[T8](PathMatcher8.html "type parameter in PathMatcher8")> concat​(java.lang.String segment)
		```
		- #### concat
		
		
		
		```
		public [PathMatcher8](PathMatcher8.html "class in akka.http.javadsl.server")<[T1](PathMatcher8.html "type parameter in PathMatcher8"),​[T2](PathMatcher8.html "type parameter in PathMatcher8"),​[T3](PathMatcher8.html "type parameter in PathMatcher8"),​[T4](PathMatcher8.html "type parameter in PathMatcher8"),​[T5](PathMatcher8.html "type parameter in PathMatcher8"),​[T6](PathMatcher8.html "type parameter in PathMatcher8"),​[T7](PathMatcher8.html "type parameter in PathMatcher8"),​[T8](PathMatcher8.html "type parameter in PathMatcher8")> concat​([PathMatcher0](PathMatcher0.html "class in akka.http.javadsl.server") next)
		```
		- #### concat
		
		
		
		```
		public <N> [PathMatcher9](PathMatcher9.html "class in akka.http.javadsl.server")<[T1](PathMatcher8.html "type parameter in PathMatcher8"),​[T2](PathMatcher8.html "type parameter in PathMatcher8"),​[T3](PathMatcher8.html "type parameter in PathMatcher8"),​[T4](PathMatcher8.html "type parameter in PathMatcher8"),​[T5](PathMatcher8.html "type parameter in PathMatcher8"),​[T6](PathMatcher8.html "type parameter in PathMatcher8"),​[T7](PathMatcher8.html "type parameter in PathMatcher8"),​[T8](PathMatcher8.html "type parameter in PathMatcher8"),​N> concat​([PathMatcher1](PathMatcher1.html "class in akka.http.javadsl.server")<N> next)
		```
		- #### concat
		
		
		
		```
		public <N1,​N2> [PathMatcher10](PathMatcher10.html "class in akka.http.javadsl.server")<[T1](PathMatcher8.html "type parameter in PathMatcher8"),​[T2](PathMatcher8.html "type parameter in PathMatcher8"),​[T3](PathMatcher8.html "type parameter in PathMatcher8"),​[T4](PathMatcher8.html "type parameter in PathMatcher8"),​[T5](PathMatcher8.html "type parameter in PathMatcher8"),​[T6](PathMatcher8.html "type parameter in PathMatcher8"),​[T7](PathMatcher8.html "type parameter in PathMatcher8"),​[T8](PathMatcher8.html "type parameter in PathMatcher8"),​N1,​N2> concat​([PathMatcher2](PathMatcher2.html "class in akka.http.javadsl.server")<N1,​N2> next)
		```
		- #### invert
		
		
		
		```
		public [PathMatcher0](PathMatcher0.html "class in akka.http.javadsl.server") invert()
		```
		- #### orElse
		
		
		
		```
		public [PathMatcher8](PathMatcher8.html "class in akka.http.javadsl.server")<[T1](PathMatcher8.html "type parameter in PathMatcher8"),​[T2](PathMatcher8.html "type parameter in PathMatcher8"),​[T3](PathMatcher8.html "type parameter in PathMatcher8"),​[T4](PathMatcher8.html "type parameter in PathMatcher8"),​[T5](PathMatcher8.html "type parameter in PathMatcher8"),​[T6](PathMatcher8.html "type parameter in PathMatcher8"),​[T7](PathMatcher8.html "type parameter in PathMatcher8"),​[T8](PathMatcher8.html "type parameter in PathMatcher8")> orElse​([PathMatcher8](PathMatcher8.html "class in akka.http.javadsl.server")<[T1](PathMatcher8.html "type parameter in PathMatcher8"),​[T2](PathMatcher8.html "type parameter in PathMatcher8"),​[T3](PathMatcher8.html "type parameter in PathMatcher8"),​[T4](PathMatcher8.html "type parameter in PathMatcher8"),​[T5](PathMatcher8.html "type parameter in PathMatcher8"),​[T6](PathMatcher8.html "type parameter in PathMatcher8"),​[T7](PathMatcher8.html "type parameter in PathMatcher8"),​[T8](PathMatcher8.html "type parameter in PathMatcher8")> alternative)
		```
		- #### slash
		
		
		
		```
		public [PathMatcher8](PathMatcher8.html "class in akka.http.javadsl.server")<[T1](PathMatcher8.html "type parameter in PathMatcher8"),​[T2](PathMatcher8.html "type parameter in PathMatcher8"),​[T3](PathMatcher8.html "type parameter in PathMatcher8"),​[T4](PathMatcher8.html "type parameter in PathMatcher8"),​[T5](PathMatcher8.html "type parameter in PathMatcher8"),​[T6](PathMatcher8.html "type parameter in PathMatcher8"),​[T7](PathMatcher8.html "type parameter in PathMatcher8"),​[T8](PathMatcher8.html "type parameter in PathMatcher8")> slash()
		```
		- #### slash
		
		
		
		```
		public [PathMatcher8](PathMatcher8.html "class in akka.http.javadsl.server")<[T1](PathMatcher8.html "type parameter in PathMatcher8"),​[T2](PathMatcher8.html "type parameter in PathMatcher8"),​[T3](PathMatcher8.html "type parameter in PathMatcher8"),​[T4](PathMatcher8.html "type parameter in PathMatcher8"),​[T5](PathMatcher8.html "type parameter in PathMatcher8"),​[T6](PathMatcher8.html "type parameter in PathMatcher8"),​[T7](PathMatcher8.html "type parameter in PathMatcher8"),​[T8](PathMatcher8.html "type parameter in PathMatcher8")> slash​(java.lang.String segment)
		```
		- #### slash
		
		
		
		```
		public [PathMatcher8](PathMatcher8.html "class in akka.http.javadsl.server")<[T1](PathMatcher8.html "type parameter in PathMatcher8"),​[T2](PathMatcher8.html "type parameter in PathMatcher8"),​[T3](PathMatcher8.html "type parameter in PathMatcher8"),​[T4](PathMatcher8.html "type parameter in PathMatcher8"),​[T5](PathMatcher8.html "type parameter in PathMatcher8"),​[T6](PathMatcher8.html "type parameter in PathMatcher8"),​[T7](PathMatcher8.html "type parameter in PathMatcher8"),​[T8](PathMatcher8.html "type parameter in PathMatcher8")> slash​([PathMatcher0](PathMatcher0.html "class in akka.http.javadsl.server") next)
		```
		- #### slash
		
		
		
		```
		public <N> [PathMatcher9](PathMatcher9.html "class in akka.http.javadsl.server")<[T1](PathMatcher8.html "type parameter in PathMatcher8"),​[T2](PathMatcher8.html "type parameter in PathMatcher8"),​[T3](PathMatcher8.html "type parameter in PathMatcher8"),​[T4](PathMatcher8.html "type parameter in PathMatcher8"),​[T5](PathMatcher8.html "type parameter in PathMatcher8"),​[T6](PathMatcher8.html "type parameter in PathMatcher8"),​[T7](PathMatcher8.html "type parameter in PathMatcher8"),​[T8](PathMatcher8.html "type parameter in PathMatcher8"),​N> slash​([PathMatcher1](PathMatcher1.html "class in akka.http.javadsl.server")<N> next)
		```
		- #### slash
		
		
		
		```
		public <N1,​N2> [PathMatcher10](PathMatcher10.html "class in akka.http.javadsl.server")<[T1](PathMatcher8.html "type parameter in PathMatcher8"),​[T2](PathMatcher8.html "type parameter in PathMatcher8"),​[T3](PathMatcher8.html "type parameter in PathMatcher8"),​[T4](PathMatcher8.html "type parameter in PathMatcher8"),​[T5](PathMatcher8.html "type parameter in PathMatcher8"),​[T6](PathMatcher8.html "type parameter in PathMatcher8"),​[T7](PathMatcher8.html "type parameter in PathMatcher8"),​[T8](PathMatcher8.html "type parameter in PathMatcher8"),​N1,​N2> slash​([PathMatcher2](PathMatcher2.html "class in akka.http.javadsl.server")<N1,​N2> next)
		```
		- #### toScala
		
		
		
		```
		public [PathMatcher](../../scaladsl/server/PathMatcher.html "class in akka.http.scaladsl.server")<scala.Tuple8<[T1](PathMatcher8.html "type parameter in PathMatcher8"),​[T2](PathMatcher8.html "type parameter in PathMatcher8"),​[T3](PathMatcher8.html "type parameter in PathMatcher8"),​[T4](PathMatcher8.html "type parameter in PathMatcher8"),​[T5](PathMatcher8.html "type parameter in PathMatcher8"),​[T6](PathMatcher8.html "type parameter in PathMatcher8"),​[T7](PathMatcher8.html "type parameter in PathMatcher8"),​[T8](PathMatcher8.html "type parameter in PathMatcher8")>> toScala()
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/PathMatcher0.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/PathMatcher1.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/PathMatcher10.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/PathMatcher2.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/PathMatcher8.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/PathMatcher9.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/package-summary.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/server/PathMatcher.html

---
*Source: [https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/PathMatcher8.html](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/PathMatcher8.html)*