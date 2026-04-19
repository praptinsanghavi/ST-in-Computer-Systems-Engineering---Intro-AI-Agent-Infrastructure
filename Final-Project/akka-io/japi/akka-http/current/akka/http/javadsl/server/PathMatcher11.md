---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T23:47:25Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/server/PathMatcher11.html
title: PathMatcher11
---

# PathMatcher11

## Content

Package [akka.http.javadsl.server](package-summary.html)
## Class PathMatcher11\<T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11\>

- java.lang.Object
- - akka.http.javadsl.server.PathMatcher11\<T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11\>

- ---

```
public final class PathMatcher11<T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11>
extends java.lang.Object
```

A PathMatcher tries to match a prefix of a given string and returns either a PathMatcher.Matched instance
 if matched, otherwise PathMatchers.Unmatched.

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[PathMatcher11](#%3Cinit%3E(akka.http.scaladsl.server.PathMatcher))​([PathMatcher](../../scaladsl/server/PathMatcher.html "class in akka.http.scaladsl.server")<scala.Tuple11<[T1](PathMatcher11.html "type parameter in PathMatcher11"),​[T2](PathMatcher11.html "type parameter in PathMatcher11"),​[T3](PathMatcher11.html "type parameter in PathMatcher11"),​[T4](PathMatcher11.html "type parameter in PathMatcher11"),​[T5](PathMatcher11.html "type parameter in PathMatcher11"),​[T6](PathMatcher11.html "type parameter in PathMatcher11"),​[T7](PathMatcher11.html "type parameter in PathMatcher11"),​[T8](PathMatcher11.html "type parameter in PathMatcher11"),​[T9](PathMatcher11.html "type parameter in PathMatcher11"),​[T10](PathMatcher11.html "type parameter in PathMatcher11"),​[T11](PathMatcher11.html "type parameter in PathMatcher11")>> toScala)` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[PathMatcher11](PathMatcher11.html "class in akka.http.javadsl.server")<[T1](PathMatcher11.html "type parameter in PathMatcher11"),​[T2](PathMatcher11.html "type parameter in PathMatcher11"),​[T3](PathMatcher11.html "type parameter in PathMatcher11"),​[T4](PathMatcher11.html "type parameter in PathMatcher11"),​[T5](PathMatcher11.html "type parameter in PathMatcher11"),​[T6](PathMatcher11.html "type parameter in PathMatcher11"),​[T7](PathMatcher11.html "type parameter in PathMatcher11"),​[T8](PathMatcher11.html "type parameter in PathMatcher11"),​[T9](PathMatcher11.html "type parameter in PathMatcher11"),​[T10](PathMatcher11.html "type parameter in PathMatcher11"),​[T11](PathMatcher11.html "type parameter in PathMatcher11")>` | `[concat](#concat(akka.http.javadsl.server.PathMatcher0))​([PathMatcher0](PathMatcher0.html "class in akka.http.javadsl.server") next)` |  |
	| `<N> [PathMatcher12](PathMatcher12.html "class in akka.http.javadsl.server")<[T1](PathMatcher11.html "type parameter in PathMatcher11"),​[T2](PathMatcher11.html "type parameter in PathMatcher11"),​[T3](PathMatcher11.html "type parameter in PathMatcher11"),​[T4](PathMatcher11.html "type parameter in PathMatcher11"),​[T5](PathMatcher11.html "type parameter in PathMatcher11"),​[T6](PathMatcher11.html "type parameter in PathMatcher11"),​[T7](PathMatcher11.html "type parameter in PathMatcher11"),​[T8](PathMatcher11.html "type parameter in PathMatcher11"),​[T9](PathMatcher11.html "type parameter in PathMatcher11"),​[T10](PathMatcher11.html "type parameter in PathMatcher11"),​[T11](PathMatcher11.html "type parameter in PathMatcher11"),​N>` | `[concat](#concat(akka.http.javadsl.server.PathMatcher1))​([PathMatcher1](PathMatcher1.html "class in akka.http.javadsl.server")<N> next)` |  |
	| `<N1,​N2>[PathMatcher13](PathMatcher13.html "class in akka.http.javadsl.server")<[T1](PathMatcher11.html "type parameter in PathMatcher11"),​[T2](PathMatcher11.html "type parameter in PathMatcher11"),​[T3](PathMatcher11.html "type parameter in PathMatcher11"),​[T4](PathMatcher11.html "type parameter in PathMatcher11"),​[T5](PathMatcher11.html "type parameter in PathMatcher11"),​[T6](PathMatcher11.html "type parameter in PathMatcher11"),​[T7](PathMatcher11.html "type parameter in PathMatcher11"),​[T8](PathMatcher11.html "type parameter in PathMatcher11"),​[T9](PathMatcher11.html "type parameter in PathMatcher11"),​[T10](PathMatcher11.html "type parameter in PathMatcher11"),​[T11](PathMatcher11.html "type parameter in PathMatcher11"),​N1,​N2>` | `[concat](#concat(akka.http.javadsl.server.PathMatcher2))​([PathMatcher2](PathMatcher2.html "class in akka.http.javadsl.server")<N1,​N2> next)` |  |
	| `[PathMatcher11](PathMatcher11.html "class in akka.http.javadsl.server")<[T1](PathMatcher11.html "type parameter in PathMatcher11"),​[T2](PathMatcher11.html "type parameter in PathMatcher11"),​[T3](PathMatcher11.html "type parameter in PathMatcher11"),​[T4](PathMatcher11.html "type parameter in PathMatcher11"),​[T5](PathMatcher11.html "type parameter in PathMatcher11"),​[T6](PathMatcher11.html "type parameter in PathMatcher11"),​[T7](PathMatcher11.html "type parameter in PathMatcher11"),​[T8](PathMatcher11.html "type parameter in PathMatcher11"),​[T9](PathMatcher11.html "type parameter in PathMatcher11"),​[T10](PathMatcher11.html "type parameter in PathMatcher11"),​[T11](PathMatcher11.html "type parameter in PathMatcher11")>` | `[concat](#concat(java.lang.String))​(java.lang.String segment)` |  |
	| `[PathMatcher0](PathMatcher0.html "class in akka.http.javadsl.server")` | `[invert](#invert())()` |  |
	| `[PathMatcher11](PathMatcher11.html "class in akka.http.javadsl.server")<[T1](PathMatcher11.html "type parameter in PathMatcher11"),​[T2](PathMatcher11.html "type parameter in PathMatcher11"),​[T3](PathMatcher11.html "type parameter in PathMatcher11"),​[T4](PathMatcher11.html "type parameter in PathMatcher11"),​[T5](PathMatcher11.html "type parameter in PathMatcher11"),​[T6](PathMatcher11.html "type parameter in PathMatcher11"),​[T7](PathMatcher11.html "type parameter in PathMatcher11"),​[T8](PathMatcher11.html "type parameter in PathMatcher11"),​[T9](PathMatcher11.html "type parameter in PathMatcher11"),​[T10](PathMatcher11.html "type parameter in PathMatcher11"),​[T11](PathMatcher11.html "type parameter in PathMatcher11")>` | `[orElse](#orElse(akka.http.javadsl.server.PathMatcher11))​([PathMatcher11](PathMatcher11.html "class in akka.http.javadsl.server")<[T1](PathMatcher11.html "type parameter in PathMatcher11"),​[T2](PathMatcher11.html "type parameter in PathMatcher11"),​[T3](PathMatcher11.html "type parameter in PathMatcher11"),​[T4](PathMatcher11.html "type parameter in PathMatcher11"),​[T5](PathMatcher11.html "type parameter in PathMatcher11"),​[T6](PathMatcher11.html "type parameter in PathMatcher11"),​[T7](PathMatcher11.html "type parameter in PathMatcher11"),​[T8](PathMatcher11.html "type parameter in PathMatcher11"),​[T9](PathMatcher11.html "type parameter in PathMatcher11"),​[T10](PathMatcher11.html "type parameter in PathMatcher11"),​[T11](PathMatcher11.html "type parameter in PathMatcher11")> alternative)` |  |
	| `[PathMatcher11](PathMatcher11.html "class in akka.http.javadsl.server")<[T1](PathMatcher11.html "type parameter in PathMatcher11"),​[T2](PathMatcher11.html "type parameter in PathMatcher11"),​[T3](PathMatcher11.html "type parameter in PathMatcher11"),​[T4](PathMatcher11.html "type parameter in PathMatcher11"),​[T5](PathMatcher11.html "type parameter in PathMatcher11"),​[T6](PathMatcher11.html "type parameter in PathMatcher11"),​[T7](PathMatcher11.html "type parameter in PathMatcher11"),​[T8](PathMatcher11.html "type parameter in PathMatcher11"),​[T9](PathMatcher11.html "type parameter in PathMatcher11"),​[T10](PathMatcher11.html "type parameter in PathMatcher11"),​[T11](PathMatcher11.html "type parameter in PathMatcher11")>` | `[slash](#slash())()` |  |
	| `[PathMatcher11](PathMatcher11.html "class in akka.http.javadsl.server")<[T1](PathMatcher11.html "type parameter in PathMatcher11"),​[T2](PathMatcher11.html "type parameter in PathMatcher11"),​[T3](PathMatcher11.html "type parameter in PathMatcher11"),​[T4](PathMatcher11.html "type parameter in PathMatcher11"),​[T5](PathMatcher11.html "type parameter in PathMatcher11"),​[T6](PathMatcher11.html "type parameter in PathMatcher11"),​[T7](PathMatcher11.html "type parameter in PathMatcher11"),​[T8](PathMatcher11.html "type parameter in PathMatcher11"),​[T9](PathMatcher11.html "type parameter in PathMatcher11"),​[T10](PathMatcher11.html "type parameter in PathMatcher11"),​[T11](PathMatcher11.html "type parameter in PathMatcher11")>` | `[slash](#slash(akka.http.javadsl.server.PathMatcher0))​([PathMatcher0](PathMatcher0.html "class in akka.http.javadsl.server") next)` |  |
	| `<N> [PathMatcher12](PathMatcher12.html "class in akka.http.javadsl.server")<[T1](PathMatcher11.html "type parameter in PathMatcher11"),​[T2](PathMatcher11.html "type parameter in PathMatcher11"),​[T3](PathMatcher11.html "type parameter in PathMatcher11"),​[T4](PathMatcher11.html "type parameter in PathMatcher11"),​[T5](PathMatcher11.html "type parameter in PathMatcher11"),​[T6](PathMatcher11.html "type parameter in PathMatcher11"),​[T7](PathMatcher11.html "type parameter in PathMatcher11"),​[T8](PathMatcher11.html "type parameter in PathMatcher11"),​[T9](PathMatcher11.html "type parameter in PathMatcher11"),​[T10](PathMatcher11.html "type parameter in PathMatcher11"),​[T11](PathMatcher11.html "type parameter in PathMatcher11"),​N>` | `[slash](#slash(akka.http.javadsl.server.PathMatcher1))​([PathMatcher1](PathMatcher1.html "class in akka.http.javadsl.server")<N> next)` |  |
	| `<N1,​N2>[PathMatcher13](PathMatcher13.html "class in akka.http.javadsl.server")<[T1](PathMatcher11.html "type parameter in PathMatcher11"),​[T2](PathMatcher11.html "type parameter in PathMatcher11"),​[T3](PathMatcher11.html "type parameter in PathMatcher11"),​[T4](PathMatcher11.html "type parameter in PathMatcher11"),​[T5](PathMatcher11.html "type parameter in PathMatcher11"),​[T6](PathMatcher11.html "type parameter in PathMatcher11"),​[T7](PathMatcher11.html "type parameter in PathMatcher11"),​[T8](PathMatcher11.html "type parameter in PathMatcher11"),​[T9](PathMatcher11.html "type parameter in PathMatcher11"),​[T10](PathMatcher11.html "type parameter in PathMatcher11"),​[T11](PathMatcher11.html "type parameter in PathMatcher11"),​N1,​N2>` | `[slash](#slash(akka.http.javadsl.server.PathMatcher2))​([PathMatcher2](PathMatcher2.html "class in akka.http.javadsl.server")<N1,​N2> next)` |  |
	| `[PathMatcher11](PathMatcher11.html "class in akka.http.javadsl.server")<[T1](PathMatcher11.html "type parameter in PathMatcher11"),​[T2](PathMatcher11.html "type parameter in PathMatcher11"),​[T3](PathMatcher11.html "type parameter in PathMatcher11"),​[T4](PathMatcher11.html "type parameter in PathMatcher11"),​[T5](PathMatcher11.html "type parameter in PathMatcher11"),​[T6](PathMatcher11.html "type parameter in PathMatcher11"),​[T7](PathMatcher11.html "type parameter in PathMatcher11"),​[T8](PathMatcher11.html "type parameter in PathMatcher11"),​[T9](PathMatcher11.html "type parameter in PathMatcher11"),​[T10](PathMatcher11.html "type parameter in PathMatcher11"),​[T11](PathMatcher11.html "type parameter in PathMatcher11")>` | `[slash](#slash(java.lang.String))​(java.lang.String segment)` |  |
	| `[PathMatcher](../../scaladsl/server/PathMatcher.html "class in akka.http.scaladsl.server")<scala.Tuple11<[T1](PathMatcher11.html "type parameter in PathMatcher11"),​[T2](PathMatcher11.html "type parameter in PathMatcher11"),​[T3](PathMatcher11.html "type parameter in PathMatcher11"),​[T4](PathMatcher11.html "type parameter in PathMatcher11"),​[T5](PathMatcher11.html "type parameter in PathMatcher11"),​[T6](PathMatcher11.html "type parameter in PathMatcher11"),​[T7](PathMatcher11.html "type parameter in PathMatcher11"),​[T8](PathMatcher11.html "type parameter in PathMatcher11"),​[T9](PathMatcher11.html "type parameter in PathMatcher11"),​[T10](PathMatcher11.html "type parameter in PathMatcher11"),​[T11](PathMatcher11.html "type parameter in PathMatcher11")>>` | `[toScala](#toScala())()` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### PathMatcher11
		
		
		
		```
		public PathMatcher11​([PathMatcher](../../scaladsl/server/PathMatcher.html "class in akka.http.scaladsl.server")<scala.Tuple11<[T1](PathMatcher11.html "type parameter in PathMatcher11"),​[T2](PathMatcher11.html "type parameter in PathMatcher11"),​[T3](PathMatcher11.html "type parameter in PathMatcher11"),​[T4](PathMatcher11.html "type parameter in PathMatcher11"),​[T5](PathMatcher11.html "type parameter in PathMatcher11"),​[T6](PathMatcher11.html "type parameter in PathMatcher11"),​[T7](PathMatcher11.html "type parameter in PathMatcher11"),​[T8](PathMatcher11.html "type parameter in PathMatcher11"),​[T9](PathMatcher11.html "type parameter in PathMatcher11"),​[T10](PathMatcher11.html "type parameter in PathMatcher11"),​[T11](PathMatcher11.html "type parameter in PathMatcher11")>> toScala)
		```

	- ### Method Detail
	
	
	
		- #### concat
		
		
		
		```
		public [PathMatcher11](PathMatcher11.html "class in akka.http.javadsl.server")<[T1](PathMatcher11.html "type parameter in PathMatcher11"),​[T2](PathMatcher11.html "type parameter in PathMatcher11"),​[T3](PathMatcher11.html "type parameter in PathMatcher11"),​[T4](PathMatcher11.html "type parameter in PathMatcher11"),​[T5](PathMatcher11.html "type parameter in PathMatcher11"),​[T6](PathMatcher11.html "type parameter in PathMatcher11"),​[T7](PathMatcher11.html "type parameter in PathMatcher11"),​[T8](PathMatcher11.html "type parameter in PathMatcher11"),​[T9](PathMatcher11.html "type parameter in PathMatcher11"),​[T10](PathMatcher11.html "type parameter in PathMatcher11"),​[T11](PathMatcher11.html "type parameter in PathMatcher11")> concat​(java.lang.String segment)
		```
		- #### concat
		
		
		
		```
		public [PathMatcher11](PathMatcher11.html "class in akka.http.javadsl.server")<[T1](PathMatcher11.html "type parameter in PathMatcher11"),​[T2](PathMatcher11.html "type parameter in PathMatcher11"),​[T3](PathMatcher11.html "type parameter in PathMatcher11"),​[T4](PathMatcher11.html "type parameter in PathMatcher11"),​[T5](PathMatcher11.html "type parameter in PathMatcher11"),​[T6](PathMatcher11.html "type parameter in PathMatcher11"),​[T7](PathMatcher11.html "type parameter in PathMatcher11"),​[T8](PathMatcher11.html "type parameter in PathMatcher11"),​[T9](PathMatcher11.html "type parameter in PathMatcher11"),​[T10](PathMatcher11.html "type parameter in PathMatcher11"),​[T11](PathMatcher11.html "type parameter in PathMatcher11")> concat​([PathMatcher0](PathMatcher0.html "class in akka.http.javadsl.server") next)
		```
		- #### concat
		
		
		
		```
		public <N> [PathMatcher12](PathMatcher12.html "class in akka.http.javadsl.server")<[T1](PathMatcher11.html "type parameter in PathMatcher11"),​[T2](PathMatcher11.html "type parameter in PathMatcher11"),​[T3](PathMatcher11.html "type parameter in PathMatcher11"),​[T4](PathMatcher11.html "type parameter in PathMatcher11"),​[T5](PathMatcher11.html "type parameter in PathMatcher11"),​[T6](PathMatcher11.html "type parameter in PathMatcher11"),​[T7](PathMatcher11.html "type parameter in PathMatcher11"),​[T8](PathMatcher11.html "type parameter in PathMatcher11"),​[T9](PathMatcher11.html "type parameter in PathMatcher11"),​[T10](PathMatcher11.html "type parameter in PathMatcher11"),​[T11](PathMatcher11.html "type parameter in PathMatcher11"),​N> concat​([PathMatcher1](PathMatcher1.html "class in akka.http.javadsl.server")<N> next)
		```
		- #### concat
		
		
		
		```
		public <N1,​N2> [PathMatcher13](PathMatcher13.html "class in akka.http.javadsl.server")<[T1](PathMatcher11.html "type parameter in PathMatcher11"),​[T2](PathMatcher11.html "type parameter in PathMatcher11"),​[T3](PathMatcher11.html "type parameter in PathMatcher11"),​[T4](PathMatcher11.html "type parameter in PathMatcher11"),​[T5](PathMatcher11.html "type parameter in PathMatcher11"),​[T6](PathMatcher11.html "type parameter in PathMatcher11"),​[T7](PathMatcher11.html "type parameter in PathMatcher11"),​[T8](PathMatcher11.html "type parameter in PathMatcher11"),​[T9](PathMatcher11.html "type parameter in PathMatcher11"),​[T10](PathMatcher11.html "type parameter in PathMatcher11"),​[T11](PathMatcher11.html "type parameter in PathMatcher11"),​N1,​N2> concat​([PathMatcher2](PathMatcher2.html "class in akka.http.javadsl.server")<N1,​N2> next)
		```
		- #### invert
		
		
		
		```
		public [PathMatcher0](PathMatcher0.html "class in akka.http.javadsl.server") invert()
		```
		- #### orElse
		
		
		
		```
		public [PathMatcher11](PathMatcher11.html "class in akka.http.javadsl.server")<[T1](PathMatcher11.html "type parameter in PathMatcher11"),​[T2](PathMatcher11.html "type parameter in PathMatcher11"),​[T3](PathMatcher11.html "type parameter in PathMatcher11"),​[T4](PathMatcher11.html "type parameter in PathMatcher11"),​[T5](PathMatcher11.html "type parameter in PathMatcher11"),​[T6](PathMatcher11.html "type parameter in PathMatcher11"),​[T7](PathMatcher11.html "type parameter in PathMatcher11"),​[T8](PathMatcher11.html "type parameter in PathMatcher11"),​[T9](PathMatcher11.html "type parameter in PathMatcher11"),​[T10](PathMatcher11.html "type parameter in PathMatcher11"),​[T11](PathMatcher11.html "type parameter in PathMatcher11")> orElse​([PathMatcher11](PathMatcher11.html "class in akka.http.javadsl.server")<[T1](PathMatcher11.html "type parameter in PathMatcher11"),​[T2](PathMatcher11.html "type parameter in PathMatcher11"),​[T3](PathMatcher11.html "type parameter in PathMatcher11"),​[T4](PathMatcher11.html "type parameter in PathMatcher11"),​[T5](PathMatcher11.html "type parameter in PathMatcher11"),​[T6](PathMatcher11.html "type parameter in PathMatcher11"),​[T7](PathMatcher11.html "type parameter in PathMatcher11"),​[T8](PathMatcher11.html "type parameter in PathMatcher11"),​[T9](PathMatcher11.html "type parameter in PathMatcher11"),​[T10](PathMatcher11.html "type parameter in PathMatcher11"),​[T11](PathMatcher11.html "type parameter in PathMatcher11")> alternative)
		```
		- #### slash
		
		
		
		```
		public [PathMatcher11](PathMatcher11.html "class in akka.http.javadsl.server")<[T1](PathMatcher11.html "type parameter in PathMatcher11"),​[T2](PathMatcher11.html "type parameter in PathMatcher11"),​[T3](PathMatcher11.html "type parameter in PathMatcher11"),​[T4](PathMatcher11.html "type parameter in PathMatcher11"),​[T5](PathMatcher11.html "type parameter in PathMatcher11"),​[T6](PathMatcher11.html "type parameter in PathMatcher11"),​[T7](PathMatcher11.html "type parameter in PathMatcher11"),​[T8](PathMatcher11.html "type parameter in PathMatcher11"),​[T9](PathMatcher11.html "type parameter in PathMatcher11"),​[T10](PathMatcher11.html "type parameter in PathMatcher11"),​[T11](PathMatcher11.html "type parameter in PathMatcher11")> slash()
		```
		- #### slash
		
		
		
		```
		public [PathMatcher11](PathMatcher11.html "class in akka.http.javadsl.server")<[T1](PathMatcher11.html "type parameter in PathMatcher11"),​[T2](PathMatcher11.html "type parameter in PathMatcher11"),​[T3](PathMatcher11.html "type parameter in PathMatcher11"),​[T4](PathMatcher11.html "type parameter in PathMatcher11"),​[T5](PathMatcher11.html "type parameter in PathMatcher11"),​[T6](PathMatcher11.html "type parameter in PathMatcher11"),​[T7](PathMatcher11.html "type parameter in PathMatcher11"),​[T8](PathMatcher11.html "type parameter in PathMatcher11"),​[T9](PathMatcher11.html "type parameter in PathMatcher11"),​[T10](PathMatcher11.html "type parameter in PathMatcher11"),​[T11](PathMatcher11.html "type parameter in PathMatcher11")> slash​(java.lang.String segment)
		```
		- #### slash
		
		
		
		```
		public [PathMatcher11](PathMatcher11.html "class in akka.http.javadsl.server")<[T1](PathMatcher11.html "type parameter in PathMatcher11"),​[T2](PathMatcher11.html "type parameter in PathMatcher11"),​[T3](PathMatcher11.html "type parameter in PathMatcher11"),​[T4](PathMatcher11.html "type parameter in PathMatcher11"),​[T5](PathMatcher11.html "type parameter in PathMatcher11"),​[T6](PathMatcher11.html "type parameter in PathMatcher11"),​[T7](PathMatcher11.html "type parameter in PathMatcher11"),​[T8](PathMatcher11.html "type parameter in PathMatcher11"),​[T9](PathMatcher11.html "type parameter in PathMatcher11"),​[T10](PathMatcher11.html "type parameter in PathMatcher11"),​[T11](PathMatcher11.html "type parameter in PathMatcher11")> slash​([PathMatcher0](PathMatcher0.html "class in akka.http.javadsl.server") next)
		```
		- #### slash
		
		
		
		```
		public <N> [PathMatcher12](PathMatcher12.html "class in akka.http.javadsl.server")<[T1](PathMatcher11.html "type parameter in PathMatcher11"),​[T2](PathMatcher11.html "type parameter in PathMatcher11"),​[T3](PathMatcher11.html "type parameter in PathMatcher11"),​[T4](PathMatcher11.html "type parameter in PathMatcher11"),​[T5](PathMatcher11.html "type parameter in PathMatcher11"),​[T6](PathMatcher11.html "type parameter in PathMatcher11"),​[T7](PathMatcher11.html "type parameter in PathMatcher11"),​[T8](PathMatcher11.html "type parameter in PathMatcher11"),​[T9](PathMatcher11.html "type parameter in PathMatcher11"),​[T10](PathMatcher11.html "type parameter in PathMatcher11"),​[T11](PathMatcher11.html "type parameter in PathMatcher11"),​N> slash​([PathMatcher1](PathMatcher1.html "class in akka.http.javadsl.server")<N> next)
		```
		- #### slash
		
		
		
		```
		public <N1,​N2> [PathMatcher13](PathMatcher13.html "class in akka.http.javadsl.server")<[T1](PathMatcher11.html "type parameter in PathMatcher11"),​[T2](PathMatcher11.html "type parameter in PathMatcher11"),​[T3](PathMatcher11.html "type parameter in PathMatcher11"),​[T4](PathMatcher11.html "type parameter in PathMatcher11"),​[T5](PathMatcher11.html "type parameter in PathMatcher11"),​[T6](PathMatcher11.html "type parameter in PathMatcher11"),​[T7](PathMatcher11.html "type parameter in PathMatcher11"),​[T8](PathMatcher11.html "type parameter in PathMatcher11"),​[T9](PathMatcher11.html "type parameter in PathMatcher11"),​[T10](PathMatcher11.html "type parameter in PathMatcher11"),​[T11](PathMatcher11.html "type parameter in PathMatcher11"),​N1,​N2> slash​([PathMatcher2](PathMatcher2.html "class in akka.http.javadsl.server")<N1,​N2> next)
		```
		- #### toScala
		
		
		
		```
		public [PathMatcher](../../scaladsl/server/PathMatcher.html "class in akka.http.scaladsl.server")<scala.Tuple11<[T1](PathMatcher11.html "type parameter in PathMatcher11"),​[T2](PathMatcher11.html "type parameter in PathMatcher11"),​[T3](PathMatcher11.html "type parameter in PathMatcher11"),​[T4](PathMatcher11.html "type parameter in PathMatcher11"),​[T5](PathMatcher11.html "type parameter in PathMatcher11"),​[T6](PathMatcher11.html "type parameter in PathMatcher11"),​[T7](PathMatcher11.html "type parameter in PathMatcher11"),​[T8](PathMatcher11.html "type parameter in PathMatcher11"),​[T9](PathMatcher11.html "type parameter in PathMatcher11"),​[T10](PathMatcher11.html "type parameter in PathMatcher11"),​[T11](PathMatcher11.html "type parameter in PathMatcher11")>> toScala()
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/server/PathMatcher0.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/server/PathMatcher1.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/server/PathMatcher11.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/server/PathMatcher12.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/server/PathMatcher13.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/server/PathMatcher2.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/server/package-summary.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/PathMatcher.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/server/PathMatcher11.html](https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/server/PathMatcher11.html)*