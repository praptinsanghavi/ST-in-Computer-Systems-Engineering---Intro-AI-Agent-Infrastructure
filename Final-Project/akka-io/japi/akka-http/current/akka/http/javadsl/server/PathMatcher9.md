---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T23:47:46Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/server/PathMatcher9.html
title: PathMatcher9
---

# PathMatcher9

## Content

Package [akka.http.javadsl.server](package-summary.html)
## Class PathMatcher9\<T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9\>

- java.lang.Object
- - akka.http.javadsl.server.PathMatcher9\<T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9\>

- ---

```
public final class PathMatcher9<T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9>
extends java.lang.Object
```

A PathMatcher tries to match a prefix of a given string and returns either a PathMatcher.Matched instance
 if matched, otherwise PathMatchers.Unmatched.

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[PathMatcher9](#%3Cinit%3E(akka.http.scaladsl.server.PathMatcher))​([PathMatcher](../../scaladsl/server/PathMatcher.html "class in akka.http.scaladsl.server")<scala.Tuple9<[T1](PathMatcher9.html "type parameter in PathMatcher9"),​[T2](PathMatcher9.html "type parameter in PathMatcher9"),​[T3](PathMatcher9.html "type parameter in PathMatcher9"),​[T4](PathMatcher9.html "type parameter in PathMatcher9"),​[T5](PathMatcher9.html "type parameter in PathMatcher9"),​[T6](PathMatcher9.html "type parameter in PathMatcher9"),​[T7](PathMatcher9.html "type parameter in PathMatcher9"),​[T8](PathMatcher9.html "type parameter in PathMatcher9"),​[T9](PathMatcher9.html "type parameter in PathMatcher9")>> toScala)` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[PathMatcher9](PathMatcher9.html "class in akka.http.javadsl.server")<[T1](PathMatcher9.html "type parameter in PathMatcher9"),​[T2](PathMatcher9.html "type parameter in PathMatcher9"),​[T3](PathMatcher9.html "type parameter in PathMatcher9"),​[T4](PathMatcher9.html "type parameter in PathMatcher9"),​[T5](PathMatcher9.html "type parameter in PathMatcher9"),​[T6](PathMatcher9.html "type parameter in PathMatcher9"),​[T7](PathMatcher9.html "type parameter in PathMatcher9"),​[T8](PathMatcher9.html "type parameter in PathMatcher9"),​[T9](PathMatcher9.html "type parameter in PathMatcher9")>` | `[concat](#concat(akka.http.javadsl.server.PathMatcher0))​([PathMatcher0](PathMatcher0.html "class in akka.http.javadsl.server") next)` |  |
	| `<N> [PathMatcher10](PathMatcher10.html "class in akka.http.javadsl.server")<[T1](PathMatcher9.html "type parameter in PathMatcher9"),​[T2](PathMatcher9.html "type parameter in PathMatcher9"),​[T3](PathMatcher9.html "type parameter in PathMatcher9"),​[T4](PathMatcher9.html "type parameter in PathMatcher9"),​[T5](PathMatcher9.html "type parameter in PathMatcher9"),​[T6](PathMatcher9.html "type parameter in PathMatcher9"),​[T7](PathMatcher9.html "type parameter in PathMatcher9"),​[T8](PathMatcher9.html "type parameter in PathMatcher9"),​[T9](PathMatcher9.html "type parameter in PathMatcher9"),​N>` | `[concat](#concat(akka.http.javadsl.server.PathMatcher1))​([PathMatcher1](PathMatcher1.html "class in akka.http.javadsl.server")<N> next)` |  |
	| `<N1,​N2>[PathMatcher11](PathMatcher11.html "class in akka.http.javadsl.server")<[T1](PathMatcher9.html "type parameter in PathMatcher9"),​[T2](PathMatcher9.html "type parameter in PathMatcher9"),​[T3](PathMatcher9.html "type parameter in PathMatcher9"),​[T4](PathMatcher9.html "type parameter in PathMatcher9"),​[T5](PathMatcher9.html "type parameter in PathMatcher9"),​[T6](PathMatcher9.html "type parameter in PathMatcher9"),​[T7](PathMatcher9.html "type parameter in PathMatcher9"),​[T8](PathMatcher9.html "type parameter in PathMatcher9"),​[T9](PathMatcher9.html "type parameter in PathMatcher9"),​N1,​N2>` | `[concat](#concat(akka.http.javadsl.server.PathMatcher2))​([PathMatcher2](PathMatcher2.html "class in akka.http.javadsl.server")<N1,​N2> next)` |  |
	| `[PathMatcher9](PathMatcher9.html "class in akka.http.javadsl.server")<[T1](PathMatcher9.html "type parameter in PathMatcher9"),​[T2](PathMatcher9.html "type parameter in PathMatcher9"),​[T3](PathMatcher9.html "type parameter in PathMatcher9"),​[T4](PathMatcher9.html "type parameter in PathMatcher9"),​[T5](PathMatcher9.html "type parameter in PathMatcher9"),​[T6](PathMatcher9.html "type parameter in PathMatcher9"),​[T7](PathMatcher9.html "type parameter in PathMatcher9"),​[T8](PathMatcher9.html "type parameter in PathMatcher9"),​[T9](PathMatcher9.html "type parameter in PathMatcher9")>` | `[concat](#concat(java.lang.String))​(java.lang.String segment)` |  |
	| `[PathMatcher0](PathMatcher0.html "class in akka.http.javadsl.server")` | `[invert](#invert())()` |  |
	| `[PathMatcher9](PathMatcher9.html "class in akka.http.javadsl.server")<[T1](PathMatcher9.html "type parameter in PathMatcher9"),​[T2](PathMatcher9.html "type parameter in PathMatcher9"),​[T3](PathMatcher9.html "type parameter in PathMatcher9"),​[T4](PathMatcher9.html "type parameter in PathMatcher9"),​[T5](PathMatcher9.html "type parameter in PathMatcher9"),​[T6](PathMatcher9.html "type parameter in PathMatcher9"),​[T7](PathMatcher9.html "type parameter in PathMatcher9"),​[T8](PathMatcher9.html "type parameter in PathMatcher9"),​[T9](PathMatcher9.html "type parameter in PathMatcher9")>` | `[orElse](#orElse(akka.http.javadsl.server.PathMatcher9))​([PathMatcher9](PathMatcher9.html "class in akka.http.javadsl.server")<[T1](PathMatcher9.html "type parameter in PathMatcher9"),​[T2](PathMatcher9.html "type parameter in PathMatcher9"),​[T3](PathMatcher9.html "type parameter in PathMatcher9"),​[T4](PathMatcher9.html "type parameter in PathMatcher9"),​[T5](PathMatcher9.html "type parameter in PathMatcher9"),​[T6](PathMatcher9.html "type parameter in PathMatcher9"),​[T7](PathMatcher9.html "type parameter in PathMatcher9"),​[T8](PathMatcher9.html "type parameter in PathMatcher9"),​[T9](PathMatcher9.html "type parameter in PathMatcher9")> alternative)` |  |
	| `[PathMatcher9](PathMatcher9.html "class in akka.http.javadsl.server")<[T1](PathMatcher9.html "type parameter in PathMatcher9"),​[T2](PathMatcher9.html "type parameter in PathMatcher9"),​[T3](PathMatcher9.html "type parameter in PathMatcher9"),​[T4](PathMatcher9.html "type parameter in PathMatcher9"),​[T5](PathMatcher9.html "type parameter in PathMatcher9"),​[T6](PathMatcher9.html "type parameter in PathMatcher9"),​[T7](PathMatcher9.html "type parameter in PathMatcher9"),​[T8](PathMatcher9.html "type parameter in PathMatcher9"),​[T9](PathMatcher9.html "type parameter in PathMatcher9")>` | `[slash](#slash())()` |  |
	| `[PathMatcher9](PathMatcher9.html "class in akka.http.javadsl.server")<[T1](PathMatcher9.html "type parameter in PathMatcher9"),​[T2](PathMatcher9.html "type parameter in PathMatcher9"),​[T3](PathMatcher9.html "type parameter in PathMatcher9"),​[T4](PathMatcher9.html "type parameter in PathMatcher9"),​[T5](PathMatcher9.html "type parameter in PathMatcher9"),​[T6](PathMatcher9.html "type parameter in PathMatcher9"),​[T7](PathMatcher9.html "type parameter in PathMatcher9"),​[T8](PathMatcher9.html "type parameter in PathMatcher9"),​[T9](PathMatcher9.html "type parameter in PathMatcher9")>` | `[slash](#slash(akka.http.javadsl.server.PathMatcher0))​([PathMatcher0](PathMatcher0.html "class in akka.http.javadsl.server") next)` |  |
	| `<N> [PathMatcher10](PathMatcher10.html "class in akka.http.javadsl.server")<[T1](PathMatcher9.html "type parameter in PathMatcher9"),​[T2](PathMatcher9.html "type parameter in PathMatcher9"),​[T3](PathMatcher9.html "type parameter in PathMatcher9"),​[T4](PathMatcher9.html "type parameter in PathMatcher9"),​[T5](PathMatcher9.html "type parameter in PathMatcher9"),​[T6](PathMatcher9.html "type parameter in PathMatcher9"),​[T7](PathMatcher9.html "type parameter in PathMatcher9"),​[T8](PathMatcher9.html "type parameter in PathMatcher9"),​[T9](PathMatcher9.html "type parameter in PathMatcher9"),​N>` | `[slash](#slash(akka.http.javadsl.server.PathMatcher1))​([PathMatcher1](PathMatcher1.html "class in akka.http.javadsl.server")<N> next)` |  |
	| `<N1,​N2>[PathMatcher11](PathMatcher11.html "class in akka.http.javadsl.server")<[T1](PathMatcher9.html "type parameter in PathMatcher9"),​[T2](PathMatcher9.html "type parameter in PathMatcher9"),​[T3](PathMatcher9.html "type parameter in PathMatcher9"),​[T4](PathMatcher9.html "type parameter in PathMatcher9"),​[T5](PathMatcher9.html "type parameter in PathMatcher9"),​[T6](PathMatcher9.html "type parameter in PathMatcher9"),​[T7](PathMatcher9.html "type parameter in PathMatcher9"),​[T8](PathMatcher9.html "type parameter in PathMatcher9"),​[T9](PathMatcher9.html "type parameter in PathMatcher9"),​N1,​N2>` | `[slash](#slash(akka.http.javadsl.server.PathMatcher2))​([PathMatcher2](PathMatcher2.html "class in akka.http.javadsl.server")<N1,​N2> next)` |  |
	| `[PathMatcher9](PathMatcher9.html "class in akka.http.javadsl.server")<[T1](PathMatcher9.html "type parameter in PathMatcher9"),​[T2](PathMatcher9.html "type parameter in PathMatcher9"),​[T3](PathMatcher9.html "type parameter in PathMatcher9"),​[T4](PathMatcher9.html "type parameter in PathMatcher9"),​[T5](PathMatcher9.html "type parameter in PathMatcher9"),​[T6](PathMatcher9.html "type parameter in PathMatcher9"),​[T7](PathMatcher9.html "type parameter in PathMatcher9"),​[T8](PathMatcher9.html "type parameter in PathMatcher9"),​[T9](PathMatcher9.html "type parameter in PathMatcher9")>` | `[slash](#slash(java.lang.String))​(java.lang.String segment)` |  |
	| `[PathMatcher](../../scaladsl/server/PathMatcher.html "class in akka.http.scaladsl.server")<scala.Tuple9<[T1](PathMatcher9.html "type parameter in PathMatcher9"),​[T2](PathMatcher9.html "type parameter in PathMatcher9"),​[T3](PathMatcher9.html "type parameter in PathMatcher9"),​[T4](PathMatcher9.html "type parameter in PathMatcher9"),​[T5](PathMatcher9.html "type parameter in PathMatcher9"),​[T6](PathMatcher9.html "type parameter in PathMatcher9"),​[T7](PathMatcher9.html "type parameter in PathMatcher9"),​[T8](PathMatcher9.html "type parameter in PathMatcher9"),​[T9](PathMatcher9.html "type parameter in PathMatcher9")>>` | `[toScala](#toScala())()` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### PathMatcher9
		
		
		
		```
		public PathMatcher9​([PathMatcher](../../scaladsl/server/PathMatcher.html "class in akka.http.scaladsl.server")<scala.Tuple9<[T1](PathMatcher9.html "type parameter in PathMatcher9"),​[T2](PathMatcher9.html "type parameter in PathMatcher9"),​[T3](PathMatcher9.html "type parameter in PathMatcher9"),​[T4](PathMatcher9.html "type parameter in PathMatcher9"),​[T5](PathMatcher9.html "type parameter in PathMatcher9"),​[T6](PathMatcher9.html "type parameter in PathMatcher9"),​[T7](PathMatcher9.html "type parameter in PathMatcher9"),​[T8](PathMatcher9.html "type parameter in PathMatcher9"),​[T9](PathMatcher9.html "type parameter in PathMatcher9")>> toScala)
		```

	- ### Method Detail
	
	
	
		- #### concat
		
		
		
		```
		public [PathMatcher9](PathMatcher9.html "class in akka.http.javadsl.server")<[T1](PathMatcher9.html "type parameter in PathMatcher9"),​[T2](PathMatcher9.html "type parameter in PathMatcher9"),​[T3](PathMatcher9.html "type parameter in PathMatcher9"),​[T4](PathMatcher9.html "type parameter in PathMatcher9"),​[T5](PathMatcher9.html "type parameter in PathMatcher9"),​[T6](PathMatcher9.html "type parameter in PathMatcher9"),​[T7](PathMatcher9.html "type parameter in PathMatcher9"),​[T8](PathMatcher9.html "type parameter in PathMatcher9"),​[T9](PathMatcher9.html "type parameter in PathMatcher9")> concat​(java.lang.String segment)
		```
		- #### concat
		
		
		
		```
		public [PathMatcher9](PathMatcher9.html "class in akka.http.javadsl.server")<[T1](PathMatcher9.html "type parameter in PathMatcher9"),​[T2](PathMatcher9.html "type parameter in PathMatcher9"),​[T3](PathMatcher9.html "type parameter in PathMatcher9"),​[T4](PathMatcher9.html "type parameter in PathMatcher9"),​[T5](PathMatcher9.html "type parameter in PathMatcher9"),​[T6](PathMatcher9.html "type parameter in PathMatcher9"),​[T7](PathMatcher9.html "type parameter in PathMatcher9"),​[T8](PathMatcher9.html "type parameter in PathMatcher9"),​[T9](PathMatcher9.html "type parameter in PathMatcher9")> concat​([PathMatcher0](PathMatcher0.html "class in akka.http.javadsl.server") next)
		```
		- #### concat
		
		
		
		```
		public <N> [PathMatcher10](PathMatcher10.html "class in akka.http.javadsl.server")<[T1](PathMatcher9.html "type parameter in PathMatcher9"),​[T2](PathMatcher9.html "type parameter in PathMatcher9"),​[T3](PathMatcher9.html "type parameter in PathMatcher9"),​[T4](PathMatcher9.html "type parameter in PathMatcher9"),​[T5](PathMatcher9.html "type parameter in PathMatcher9"),​[T6](PathMatcher9.html "type parameter in PathMatcher9"),​[T7](PathMatcher9.html "type parameter in PathMatcher9"),​[T8](PathMatcher9.html "type parameter in PathMatcher9"),​[T9](PathMatcher9.html "type parameter in PathMatcher9"),​N> concat​([PathMatcher1](PathMatcher1.html "class in akka.http.javadsl.server")<N> next)
		```
		- #### concat
		
		
		
		```
		public <N1,​N2> [PathMatcher11](PathMatcher11.html "class in akka.http.javadsl.server")<[T1](PathMatcher9.html "type parameter in PathMatcher9"),​[T2](PathMatcher9.html "type parameter in PathMatcher9"),​[T3](PathMatcher9.html "type parameter in PathMatcher9"),​[T4](PathMatcher9.html "type parameter in PathMatcher9"),​[T5](PathMatcher9.html "type parameter in PathMatcher9"),​[T6](PathMatcher9.html "type parameter in PathMatcher9"),​[T7](PathMatcher9.html "type parameter in PathMatcher9"),​[T8](PathMatcher9.html "type parameter in PathMatcher9"),​[T9](PathMatcher9.html "type parameter in PathMatcher9"),​N1,​N2> concat​([PathMatcher2](PathMatcher2.html "class in akka.http.javadsl.server")<N1,​N2> next)
		```
		- #### invert
		
		
		
		```
		public [PathMatcher0](PathMatcher0.html "class in akka.http.javadsl.server") invert()
		```
		- #### orElse
		
		
		
		```
		public [PathMatcher9](PathMatcher9.html "class in akka.http.javadsl.server")<[T1](PathMatcher9.html "type parameter in PathMatcher9"),​[T2](PathMatcher9.html "type parameter in PathMatcher9"),​[T3](PathMatcher9.html "type parameter in PathMatcher9"),​[T4](PathMatcher9.html "type parameter in PathMatcher9"),​[T5](PathMatcher9.html "type parameter in PathMatcher9"),​[T6](PathMatcher9.html "type parameter in PathMatcher9"),​[T7](PathMatcher9.html "type parameter in PathMatcher9"),​[T8](PathMatcher9.html "type parameter in PathMatcher9"),​[T9](PathMatcher9.html "type parameter in PathMatcher9")> orElse​([PathMatcher9](PathMatcher9.html "class in akka.http.javadsl.server")<[T1](PathMatcher9.html "type parameter in PathMatcher9"),​[T2](PathMatcher9.html "type parameter in PathMatcher9"),​[T3](PathMatcher9.html "type parameter in PathMatcher9"),​[T4](PathMatcher9.html "type parameter in PathMatcher9"),​[T5](PathMatcher9.html "type parameter in PathMatcher9"),​[T6](PathMatcher9.html "type parameter in PathMatcher9"),​[T7](PathMatcher9.html "type parameter in PathMatcher9"),​[T8](PathMatcher9.html "type parameter in PathMatcher9"),​[T9](PathMatcher9.html "type parameter in PathMatcher9")> alternative)
		```
		- #### slash
		
		
		
		```
		public [PathMatcher9](PathMatcher9.html "class in akka.http.javadsl.server")<[T1](PathMatcher9.html "type parameter in PathMatcher9"),​[T2](PathMatcher9.html "type parameter in PathMatcher9"),​[T3](PathMatcher9.html "type parameter in PathMatcher9"),​[T4](PathMatcher9.html "type parameter in PathMatcher9"),​[T5](PathMatcher9.html "type parameter in PathMatcher9"),​[T6](PathMatcher9.html "type parameter in PathMatcher9"),​[T7](PathMatcher9.html "type parameter in PathMatcher9"),​[T8](PathMatcher9.html "type parameter in PathMatcher9"),​[T9](PathMatcher9.html "type parameter in PathMatcher9")> slash()
		```
		- #### slash
		
		
		
		```
		public [PathMatcher9](PathMatcher9.html "class in akka.http.javadsl.server")<[T1](PathMatcher9.html "type parameter in PathMatcher9"),​[T2](PathMatcher9.html "type parameter in PathMatcher9"),​[T3](PathMatcher9.html "type parameter in PathMatcher9"),​[T4](PathMatcher9.html "type parameter in PathMatcher9"),​[T5](PathMatcher9.html "type parameter in PathMatcher9"),​[T6](PathMatcher9.html "type parameter in PathMatcher9"),​[T7](PathMatcher9.html "type parameter in PathMatcher9"),​[T8](PathMatcher9.html "type parameter in PathMatcher9"),​[T9](PathMatcher9.html "type parameter in PathMatcher9")> slash​(java.lang.String segment)
		```
		- #### slash
		
		
		
		```
		public [PathMatcher9](PathMatcher9.html "class in akka.http.javadsl.server")<[T1](PathMatcher9.html "type parameter in PathMatcher9"),​[T2](PathMatcher9.html "type parameter in PathMatcher9"),​[T3](PathMatcher9.html "type parameter in PathMatcher9"),​[T4](PathMatcher9.html "type parameter in PathMatcher9"),​[T5](PathMatcher9.html "type parameter in PathMatcher9"),​[T6](PathMatcher9.html "type parameter in PathMatcher9"),​[T7](PathMatcher9.html "type parameter in PathMatcher9"),​[T8](PathMatcher9.html "type parameter in PathMatcher9"),​[T9](PathMatcher9.html "type parameter in PathMatcher9")> slash​([PathMatcher0](PathMatcher0.html "class in akka.http.javadsl.server") next)
		```
		- #### slash
		
		
		
		```
		public <N> [PathMatcher10](PathMatcher10.html "class in akka.http.javadsl.server")<[T1](PathMatcher9.html "type parameter in PathMatcher9"),​[T2](PathMatcher9.html "type parameter in PathMatcher9"),​[T3](PathMatcher9.html "type parameter in PathMatcher9"),​[T4](PathMatcher9.html "type parameter in PathMatcher9"),​[T5](PathMatcher9.html "type parameter in PathMatcher9"),​[T6](PathMatcher9.html "type parameter in PathMatcher9"),​[T7](PathMatcher9.html "type parameter in PathMatcher9"),​[T8](PathMatcher9.html "type parameter in PathMatcher9"),​[T9](PathMatcher9.html "type parameter in PathMatcher9"),​N> slash​([PathMatcher1](PathMatcher1.html "class in akka.http.javadsl.server")<N> next)
		```
		- #### slash
		
		
		
		```
		public <N1,​N2> [PathMatcher11](PathMatcher11.html "class in akka.http.javadsl.server")<[T1](PathMatcher9.html "type parameter in PathMatcher9"),​[T2](PathMatcher9.html "type parameter in PathMatcher9"),​[T3](PathMatcher9.html "type parameter in PathMatcher9"),​[T4](PathMatcher9.html "type parameter in PathMatcher9"),​[T5](PathMatcher9.html "type parameter in PathMatcher9"),​[T6](PathMatcher9.html "type parameter in PathMatcher9"),​[T7](PathMatcher9.html "type parameter in PathMatcher9"),​[T8](PathMatcher9.html "type parameter in PathMatcher9"),​[T9](PathMatcher9.html "type parameter in PathMatcher9"),​N1,​N2> slash​([PathMatcher2](PathMatcher2.html "class in akka.http.javadsl.server")<N1,​N2> next)
		```
		- #### toScala
		
		
		
		```
		public [PathMatcher](../../scaladsl/server/PathMatcher.html "class in akka.http.scaladsl.server")<scala.Tuple9<[T1](PathMatcher9.html "type parameter in PathMatcher9"),​[T2](PathMatcher9.html "type parameter in PathMatcher9"),​[T3](PathMatcher9.html "type parameter in PathMatcher9"),​[T4](PathMatcher9.html "type parameter in PathMatcher9"),​[T5](PathMatcher9.html "type parameter in PathMatcher9"),​[T6](PathMatcher9.html "type parameter in PathMatcher9"),​[T7](PathMatcher9.html "type parameter in PathMatcher9"),​[T8](PathMatcher9.html "type parameter in PathMatcher9"),​[T9](PathMatcher9.html "type parameter in PathMatcher9")>> toScala()
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/server/PathMatcher0.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/server/PathMatcher1.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/server/PathMatcher10.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/server/PathMatcher11.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/server/PathMatcher2.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/server/PathMatcher9.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/server/package-summary.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/PathMatcher.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/server/PathMatcher9.html](https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/server/PathMatcher9.html)*