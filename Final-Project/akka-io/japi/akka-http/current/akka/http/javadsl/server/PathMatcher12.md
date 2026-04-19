---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T23:47:25Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/server/PathMatcher12.html
title: PathMatcher12
---

# PathMatcher12

## Content

Package [akka.http.javadsl.server](package-summary.html)
## Class PathMatcher12\<T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11,​T12\>

- java.lang.Object
- - akka.http.javadsl.server.PathMatcher12\<T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11,​T12\>

- ---

```
public final class PathMatcher12<T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11,​T12>
extends java.lang.Object
```

A PathMatcher tries to match a prefix of a given string and returns either a PathMatcher.Matched instance
 if matched, otherwise PathMatchers.Unmatched.

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[PathMatcher12](#%3Cinit%3E(akka.http.scaladsl.server.PathMatcher))​([PathMatcher](../../scaladsl/server/PathMatcher.html "class in akka.http.scaladsl.server")<scala.Tuple12<[T1](PathMatcher12.html "type parameter in PathMatcher12"),​[T2](PathMatcher12.html "type parameter in PathMatcher12"),​[T3](PathMatcher12.html "type parameter in PathMatcher12"),​[T4](PathMatcher12.html "type parameter in PathMatcher12"),​[T5](PathMatcher12.html "type parameter in PathMatcher12"),​[T6](PathMatcher12.html "type parameter in PathMatcher12"),​[T7](PathMatcher12.html "type parameter in PathMatcher12"),​[T8](PathMatcher12.html "type parameter in PathMatcher12"),​[T9](PathMatcher12.html "type parameter in PathMatcher12"),​[T10](PathMatcher12.html "type parameter in PathMatcher12"),​[T11](PathMatcher12.html "type parameter in PathMatcher12"),​[T12](PathMatcher12.html "type parameter in PathMatcher12")>> toScala)` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[PathMatcher12](PathMatcher12.html "class in akka.http.javadsl.server")<[T1](PathMatcher12.html "type parameter in PathMatcher12"),​[T2](PathMatcher12.html "type parameter in PathMatcher12"),​[T3](PathMatcher12.html "type parameter in PathMatcher12"),​[T4](PathMatcher12.html "type parameter in PathMatcher12"),​[T5](PathMatcher12.html "type parameter in PathMatcher12"),​[T6](PathMatcher12.html "type parameter in PathMatcher12"),​[T7](PathMatcher12.html "type parameter in PathMatcher12"),​[T8](PathMatcher12.html "type parameter in PathMatcher12"),​[T9](PathMatcher12.html "type parameter in PathMatcher12"),​[T10](PathMatcher12.html "type parameter in PathMatcher12"),​[T11](PathMatcher12.html "type parameter in PathMatcher12"),​[T12](PathMatcher12.html "type parameter in PathMatcher12")>` | `[concat](#concat(akka.http.javadsl.server.PathMatcher0))​([PathMatcher0](PathMatcher0.html "class in akka.http.javadsl.server") next)` |  |
	| `<N> [PathMatcher13](PathMatcher13.html "class in akka.http.javadsl.server")<[T1](PathMatcher12.html "type parameter in PathMatcher12"),​[T2](PathMatcher12.html "type parameter in PathMatcher12"),​[T3](PathMatcher12.html "type parameter in PathMatcher12"),​[T4](PathMatcher12.html "type parameter in PathMatcher12"),​[T5](PathMatcher12.html "type parameter in PathMatcher12"),​[T6](PathMatcher12.html "type parameter in PathMatcher12"),​[T7](PathMatcher12.html "type parameter in PathMatcher12"),​[T8](PathMatcher12.html "type parameter in PathMatcher12"),​[T9](PathMatcher12.html "type parameter in PathMatcher12"),​[T10](PathMatcher12.html "type parameter in PathMatcher12"),​[T11](PathMatcher12.html "type parameter in PathMatcher12"),​[T12](PathMatcher12.html "type parameter in PathMatcher12"),​N>` | `[concat](#concat(akka.http.javadsl.server.PathMatcher1))​([PathMatcher1](PathMatcher1.html "class in akka.http.javadsl.server")<N> next)` |  |
	| `<N1,​N2>[PathMatcher14](PathMatcher14.html "class in akka.http.javadsl.server")<[T1](PathMatcher12.html "type parameter in PathMatcher12"),​[T2](PathMatcher12.html "type parameter in PathMatcher12"),​[T3](PathMatcher12.html "type parameter in PathMatcher12"),​[T4](PathMatcher12.html "type parameter in PathMatcher12"),​[T5](PathMatcher12.html "type parameter in PathMatcher12"),​[T6](PathMatcher12.html "type parameter in PathMatcher12"),​[T7](PathMatcher12.html "type parameter in PathMatcher12"),​[T8](PathMatcher12.html "type parameter in PathMatcher12"),​[T9](PathMatcher12.html "type parameter in PathMatcher12"),​[T10](PathMatcher12.html "type parameter in PathMatcher12"),​[T11](PathMatcher12.html "type parameter in PathMatcher12"),​[T12](PathMatcher12.html "type parameter in PathMatcher12"),​N1,​N2>` | `[concat](#concat(akka.http.javadsl.server.PathMatcher2))​([PathMatcher2](PathMatcher2.html "class in akka.http.javadsl.server")<N1,​N2> next)` |  |
	| `[PathMatcher12](PathMatcher12.html "class in akka.http.javadsl.server")<[T1](PathMatcher12.html "type parameter in PathMatcher12"),​[T2](PathMatcher12.html "type parameter in PathMatcher12"),​[T3](PathMatcher12.html "type parameter in PathMatcher12"),​[T4](PathMatcher12.html "type parameter in PathMatcher12"),​[T5](PathMatcher12.html "type parameter in PathMatcher12"),​[T6](PathMatcher12.html "type parameter in PathMatcher12"),​[T7](PathMatcher12.html "type parameter in PathMatcher12"),​[T8](PathMatcher12.html "type parameter in PathMatcher12"),​[T9](PathMatcher12.html "type parameter in PathMatcher12"),​[T10](PathMatcher12.html "type parameter in PathMatcher12"),​[T11](PathMatcher12.html "type parameter in PathMatcher12"),​[T12](PathMatcher12.html "type parameter in PathMatcher12")>` | `[concat](#concat(java.lang.String))​(java.lang.String segment)` |  |
	| `[PathMatcher0](PathMatcher0.html "class in akka.http.javadsl.server")` | `[invert](#invert())()` |  |
	| `[PathMatcher12](PathMatcher12.html "class in akka.http.javadsl.server")<[T1](PathMatcher12.html "type parameter in PathMatcher12"),​[T2](PathMatcher12.html "type parameter in PathMatcher12"),​[T3](PathMatcher12.html "type parameter in PathMatcher12"),​[T4](PathMatcher12.html "type parameter in PathMatcher12"),​[T5](PathMatcher12.html "type parameter in PathMatcher12"),​[T6](PathMatcher12.html "type parameter in PathMatcher12"),​[T7](PathMatcher12.html "type parameter in PathMatcher12"),​[T8](PathMatcher12.html "type parameter in PathMatcher12"),​[T9](PathMatcher12.html "type parameter in PathMatcher12"),​[T10](PathMatcher12.html "type parameter in PathMatcher12"),​[T11](PathMatcher12.html "type parameter in PathMatcher12"),​[T12](PathMatcher12.html "type parameter in PathMatcher12")>` | `[orElse](#orElse(akka.http.javadsl.server.PathMatcher12))​([PathMatcher12](PathMatcher12.html "class in akka.http.javadsl.server")<[T1](PathMatcher12.html "type parameter in PathMatcher12"),​[T2](PathMatcher12.html "type parameter in PathMatcher12"),​[T3](PathMatcher12.html "type parameter in PathMatcher12"),​[T4](PathMatcher12.html "type parameter in PathMatcher12"),​[T5](PathMatcher12.html "type parameter in PathMatcher12"),​[T6](PathMatcher12.html "type parameter in PathMatcher12"),​[T7](PathMatcher12.html "type parameter in PathMatcher12"),​[T8](PathMatcher12.html "type parameter in PathMatcher12"),​[T9](PathMatcher12.html "type parameter in PathMatcher12"),​[T10](PathMatcher12.html "type parameter in PathMatcher12"),​[T11](PathMatcher12.html "type parameter in PathMatcher12"),​[T12](PathMatcher12.html "type parameter in PathMatcher12")> alternative)` |  |
	| `[PathMatcher12](PathMatcher12.html "class in akka.http.javadsl.server")<[T1](PathMatcher12.html "type parameter in PathMatcher12"),​[T2](PathMatcher12.html "type parameter in PathMatcher12"),​[T3](PathMatcher12.html "type parameter in PathMatcher12"),​[T4](PathMatcher12.html "type parameter in PathMatcher12"),​[T5](PathMatcher12.html "type parameter in PathMatcher12"),​[T6](PathMatcher12.html "type parameter in PathMatcher12"),​[T7](PathMatcher12.html "type parameter in PathMatcher12"),​[T8](PathMatcher12.html "type parameter in PathMatcher12"),​[T9](PathMatcher12.html "type parameter in PathMatcher12"),​[T10](PathMatcher12.html "type parameter in PathMatcher12"),​[T11](PathMatcher12.html "type parameter in PathMatcher12"),​[T12](PathMatcher12.html "type parameter in PathMatcher12")>` | `[slash](#slash())()` |  |
	| `[PathMatcher12](PathMatcher12.html "class in akka.http.javadsl.server")<[T1](PathMatcher12.html "type parameter in PathMatcher12"),​[T2](PathMatcher12.html "type parameter in PathMatcher12"),​[T3](PathMatcher12.html "type parameter in PathMatcher12"),​[T4](PathMatcher12.html "type parameter in PathMatcher12"),​[T5](PathMatcher12.html "type parameter in PathMatcher12"),​[T6](PathMatcher12.html "type parameter in PathMatcher12"),​[T7](PathMatcher12.html "type parameter in PathMatcher12"),​[T8](PathMatcher12.html "type parameter in PathMatcher12"),​[T9](PathMatcher12.html "type parameter in PathMatcher12"),​[T10](PathMatcher12.html "type parameter in PathMatcher12"),​[T11](PathMatcher12.html "type parameter in PathMatcher12"),​[T12](PathMatcher12.html "type parameter in PathMatcher12")>` | `[slash](#slash(akka.http.javadsl.server.PathMatcher0))​([PathMatcher0](PathMatcher0.html "class in akka.http.javadsl.server") next)` |  |
	| `<N> [PathMatcher13](PathMatcher13.html "class in akka.http.javadsl.server")<[T1](PathMatcher12.html "type parameter in PathMatcher12"),​[T2](PathMatcher12.html "type parameter in PathMatcher12"),​[T3](PathMatcher12.html "type parameter in PathMatcher12"),​[T4](PathMatcher12.html "type parameter in PathMatcher12"),​[T5](PathMatcher12.html "type parameter in PathMatcher12"),​[T6](PathMatcher12.html "type parameter in PathMatcher12"),​[T7](PathMatcher12.html "type parameter in PathMatcher12"),​[T8](PathMatcher12.html "type parameter in PathMatcher12"),​[T9](PathMatcher12.html "type parameter in PathMatcher12"),​[T10](PathMatcher12.html "type parameter in PathMatcher12"),​[T11](PathMatcher12.html "type parameter in PathMatcher12"),​[T12](PathMatcher12.html "type parameter in PathMatcher12"),​N>` | `[slash](#slash(akka.http.javadsl.server.PathMatcher1))​([PathMatcher1](PathMatcher1.html "class in akka.http.javadsl.server")<N> next)` |  |
	| `<N1,​N2>[PathMatcher14](PathMatcher14.html "class in akka.http.javadsl.server")<[T1](PathMatcher12.html "type parameter in PathMatcher12"),​[T2](PathMatcher12.html "type parameter in PathMatcher12"),​[T3](PathMatcher12.html "type parameter in PathMatcher12"),​[T4](PathMatcher12.html "type parameter in PathMatcher12"),​[T5](PathMatcher12.html "type parameter in PathMatcher12"),​[T6](PathMatcher12.html "type parameter in PathMatcher12"),​[T7](PathMatcher12.html "type parameter in PathMatcher12"),​[T8](PathMatcher12.html "type parameter in PathMatcher12"),​[T9](PathMatcher12.html "type parameter in PathMatcher12"),​[T10](PathMatcher12.html "type parameter in PathMatcher12"),​[T11](PathMatcher12.html "type parameter in PathMatcher12"),​[T12](PathMatcher12.html "type parameter in PathMatcher12"),​N1,​N2>` | `[slash](#slash(akka.http.javadsl.server.PathMatcher2))​([PathMatcher2](PathMatcher2.html "class in akka.http.javadsl.server")<N1,​N2> next)` |  |
	| `[PathMatcher12](PathMatcher12.html "class in akka.http.javadsl.server")<[T1](PathMatcher12.html "type parameter in PathMatcher12"),​[T2](PathMatcher12.html "type parameter in PathMatcher12"),​[T3](PathMatcher12.html "type parameter in PathMatcher12"),​[T4](PathMatcher12.html "type parameter in PathMatcher12"),​[T5](PathMatcher12.html "type parameter in PathMatcher12"),​[T6](PathMatcher12.html "type parameter in PathMatcher12"),​[T7](PathMatcher12.html "type parameter in PathMatcher12"),​[T8](PathMatcher12.html "type parameter in PathMatcher12"),​[T9](PathMatcher12.html "type parameter in PathMatcher12"),​[T10](PathMatcher12.html "type parameter in PathMatcher12"),​[T11](PathMatcher12.html "type parameter in PathMatcher12"),​[T12](PathMatcher12.html "type parameter in PathMatcher12")>` | `[slash](#slash(java.lang.String))​(java.lang.String segment)` |  |
	| `[PathMatcher](../../scaladsl/server/PathMatcher.html "class in akka.http.scaladsl.server")<scala.Tuple12<[T1](PathMatcher12.html "type parameter in PathMatcher12"),​[T2](PathMatcher12.html "type parameter in PathMatcher12"),​[T3](PathMatcher12.html "type parameter in PathMatcher12"),​[T4](PathMatcher12.html "type parameter in PathMatcher12"),​[T5](PathMatcher12.html "type parameter in PathMatcher12"),​[T6](PathMatcher12.html "type parameter in PathMatcher12"),​[T7](PathMatcher12.html "type parameter in PathMatcher12"),​[T8](PathMatcher12.html "type parameter in PathMatcher12"),​[T9](PathMatcher12.html "type parameter in PathMatcher12"),​[T10](PathMatcher12.html "type parameter in PathMatcher12"),​[T11](PathMatcher12.html "type parameter in PathMatcher12"),​[T12](PathMatcher12.html "type parameter in PathMatcher12")>>` | `[toScala](#toScala())()` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### PathMatcher12
		
		
		
		```
		public PathMatcher12​([PathMatcher](../../scaladsl/server/PathMatcher.html "class in akka.http.scaladsl.server")<scala.Tuple12<[T1](PathMatcher12.html "type parameter in PathMatcher12"),​[T2](PathMatcher12.html "type parameter in PathMatcher12"),​[T3](PathMatcher12.html "type parameter in PathMatcher12"),​[T4](PathMatcher12.html "type parameter in PathMatcher12"),​[T5](PathMatcher12.html "type parameter in PathMatcher12"),​[T6](PathMatcher12.html "type parameter in PathMatcher12"),​[T7](PathMatcher12.html "type parameter in PathMatcher12"),​[T8](PathMatcher12.html "type parameter in PathMatcher12"),​[T9](PathMatcher12.html "type parameter in PathMatcher12"),​[T10](PathMatcher12.html "type parameter in PathMatcher12"),​[T11](PathMatcher12.html "type parameter in PathMatcher12"),​[T12](PathMatcher12.html "type parameter in PathMatcher12")>> toScala)
		```

	- ### Method Detail
	
	
	
		- #### concat
		
		
		
		```
		public [PathMatcher12](PathMatcher12.html "class in akka.http.javadsl.server")<[T1](PathMatcher12.html "type parameter in PathMatcher12"),​[T2](PathMatcher12.html "type parameter in PathMatcher12"),​[T3](PathMatcher12.html "type parameter in PathMatcher12"),​[T4](PathMatcher12.html "type parameter in PathMatcher12"),​[T5](PathMatcher12.html "type parameter in PathMatcher12"),​[T6](PathMatcher12.html "type parameter in PathMatcher12"),​[T7](PathMatcher12.html "type parameter in PathMatcher12"),​[T8](PathMatcher12.html "type parameter in PathMatcher12"),​[T9](PathMatcher12.html "type parameter in PathMatcher12"),​[T10](PathMatcher12.html "type parameter in PathMatcher12"),​[T11](PathMatcher12.html "type parameter in PathMatcher12"),​[T12](PathMatcher12.html "type parameter in PathMatcher12")> concat​(java.lang.String segment)
		```
		- #### concat
		
		
		
		```
		public [PathMatcher12](PathMatcher12.html "class in akka.http.javadsl.server")<[T1](PathMatcher12.html "type parameter in PathMatcher12"),​[T2](PathMatcher12.html "type parameter in PathMatcher12"),​[T3](PathMatcher12.html "type parameter in PathMatcher12"),​[T4](PathMatcher12.html "type parameter in PathMatcher12"),​[T5](PathMatcher12.html "type parameter in PathMatcher12"),​[T6](PathMatcher12.html "type parameter in PathMatcher12"),​[T7](PathMatcher12.html "type parameter in PathMatcher12"),​[T8](PathMatcher12.html "type parameter in PathMatcher12"),​[T9](PathMatcher12.html "type parameter in PathMatcher12"),​[T10](PathMatcher12.html "type parameter in PathMatcher12"),​[T11](PathMatcher12.html "type parameter in PathMatcher12"),​[T12](PathMatcher12.html "type parameter in PathMatcher12")> concat​([PathMatcher0](PathMatcher0.html "class in akka.http.javadsl.server") next)
		```
		- #### concat
		
		
		
		```
		public <N> [PathMatcher13](PathMatcher13.html "class in akka.http.javadsl.server")<[T1](PathMatcher12.html "type parameter in PathMatcher12"),​[T2](PathMatcher12.html "type parameter in PathMatcher12"),​[T3](PathMatcher12.html "type parameter in PathMatcher12"),​[T4](PathMatcher12.html "type parameter in PathMatcher12"),​[T5](PathMatcher12.html "type parameter in PathMatcher12"),​[T6](PathMatcher12.html "type parameter in PathMatcher12"),​[T7](PathMatcher12.html "type parameter in PathMatcher12"),​[T8](PathMatcher12.html "type parameter in PathMatcher12"),​[T9](PathMatcher12.html "type parameter in PathMatcher12"),​[T10](PathMatcher12.html "type parameter in PathMatcher12"),​[T11](PathMatcher12.html "type parameter in PathMatcher12"),​[T12](PathMatcher12.html "type parameter in PathMatcher12"),​N> concat​([PathMatcher1](PathMatcher1.html "class in akka.http.javadsl.server")<N> next)
		```
		- #### concat
		
		
		
		```
		public <N1,​N2> [PathMatcher14](PathMatcher14.html "class in akka.http.javadsl.server")<[T1](PathMatcher12.html "type parameter in PathMatcher12"),​[T2](PathMatcher12.html "type parameter in PathMatcher12"),​[T3](PathMatcher12.html "type parameter in PathMatcher12"),​[T4](PathMatcher12.html "type parameter in PathMatcher12"),​[T5](PathMatcher12.html "type parameter in PathMatcher12"),​[T6](PathMatcher12.html "type parameter in PathMatcher12"),​[T7](PathMatcher12.html "type parameter in PathMatcher12"),​[T8](PathMatcher12.html "type parameter in PathMatcher12"),​[T9](PathMatcher12.html "type parameter in PathMatcher12"),​[T10](PathMatcher12.html "type parameter in PathMatcher12"),​[T11](PathMatcher12.html "type parameter in PathMatcher12"),​[T12](PathMatcher12.html "type parameter in PathMatcher12"),​N1,​N2> concat​([PathMatcher2](PathMatcher2.html "class in akka.http.javadsl.server")<N1,​N2> next)
		```
		- #### invert
		
		
		
		```
		public [PathMatcher0](PathMatcher0.html "class in akka.http.javadsl.server") invert()
		```
		- #### orElse
		
		
		
		```
		public [PathMatcher12](PathMatcher12.html "class in akka.http.javadsl.server")<[T1](PathMatcher12.html "type parameter in PathMatcher12"),​[T2](PathMatcher12.html "type parameter in PathMatcher12"),​[T3](PathMatcher12.html "type parameter in PathMatcher12"),​[T4](PathMatcher12.html "type parameter in PathMatcher12"),​[T5](PathMatcher12.html "type parameter in PathMatcher12"),​[T6](PathMatcher12.html "type parameter in PathMatcher12"),​[T7](PathMatcher12.html "type parameter in PathMatcher12"),​[T8](PathMatcher12.html "type parameter in PathMatcher12"),​[T9](PathMatcher12.html "type parameter in PathMatcher12"),​[T10](PathMatcher12.html "type parameter in PathMatcher12"),​[T11](PathMatcher12.html "type parameter in PathMatcher12"),​[T12](PathMatcher12.html "type parameter in PathMatcher12")> orElse​([PathMatcher12](PathMatcher12.html "class in akka.http.javadsl.server")<[T1](PathMatcher12.html "type parameter in PathMatcher12"),​[T2](PathMatcher12.html "type parameter in PathMatcher12"),​[T3](PathMatcher12.html "type parameter in PathMatcher12"),​[T4](PathMatcher12.html "type parameter in PathMatcher12"),​[T5](PathMatcher12.html "type parameter in PathMatcher12"),​[T6](PathMatcher12.html "type parameter in PathMatcher12"),​[T7](PathMatcher12.html "type parameter in PathMatcher12"),​[T8](PathMatcher12.html "type parameter in PathMatcher12"),​[T9](PathMatcher12.html "type parameter in PathMatcher12"),​[T10](PathMatcher12.html "type parameter in PathMatcher12"),​[T11](PathMatcher12.html "type parameter in PathMatcher12"),​[T12](PathMatcher12.html "type parameter in PathMatcher12")> alternative)
		```
		- #### slash
		
		
		
		```
		public [PathMatcher12](PathMatcher12.html "class in akka.http.javadsl.server")<[T1](PathMatcher12.html "type parameter in PathMatcher12"),​[T2](PathMatcher12.html "type parameter in PathMatcher12"),​[T3](PathMatcher12.html "type parameter in PathMatcher12"),​[T4](PathMatcher12.html "type parameter in PathMatcher12"),​[T5](PathMatcher12.html "type parameter in PathMatcher12"),​[T6](PathMatcher12.html "type parameter in PathMatcher12"),​[T7](PathMatcher12.html "type parameter in PathMatcher12"),​[T8](PathMatcher12.html "type parameter in PathMatcher12"),​[T9](PathMatcher12.html "type parameter in PathMatcher12"),​[T10](PathMatcher12.html "type parameter in PathMatcher12"),​[T11](PathMatcher12.html "type parameter in PathMatcher12"),​[T12](PathMatcher12.html "type parameter in PathMatcher12")> slash()
		```
		- #### slash
		
		
		
		```
		public [PathMatcher12](PathMatcher12.html "class in akka.http.javadsl.server")<[T1](PathMatcher12.html "type parameter in PathMatcher12"),​[T2](PathMatcher12.html "type parameter in PathMatcher12"),​[T3](PathMatcher12.html "type parameter in PathMatcher12"),​[T4](PathMatcher12.html "type parameter in PathMatcher12"),​[T5](PathMatcher12.html "type parameter in PathMatcher12"),​[T6](PathMatcher12.html "type parameter in PathMatcher12"),​[T7](PathMatcher12.html "type parameter in PathMatcher12"),​[T8](PathMatcher12.html "type parameter in PathMatcher12"),​[T9](PathMatcher12.html "type parameter in PathMatcher12"),​[T10](PathMatcher12.html "type parameter in PathMatcher12"),​[T11](PathMatcher12.html "type parameter in PathMatcher12"),​[T12](PathMatcher12.html "type parameter in PathMatcher12")> slash​(java.lang.String segment)
		```
		- #### slash
		
		
		
		```
		public [PathMatcher12](PathMatcher12.html "class in akka.http.javadsl.server")<[T1](PathMatcher12.html "type parameter in PathMatcher12"),​[T2](PathMatcher12.html "type parameter in PathMatcher12"),​[T3](PathMatcher12.html "type parameter in PathMatcher12"),​[T4](PathMatcher12.html "type parameter in PathMatcher12"),​[T5](PathMatcher12.html "type parameter in PathMatcher12"),​[T6](PathMatcher12.html "type parameter in PathMatcher12"),​[T7](PathMatcher12.html "type parameter in PathMatcher12"),​[T8](PathMatcher12.html "type parameter in PathMatcher12"),​[T9](PathMatcher12.html "type parameter in PathMatcher12"),​[T10](PathMatcher12.html "type parameter in PathMatcher12"),​[T11](PathMatcher12.html "type parameter in PathMatcher12"),​[T12](PathMatcher12.html "type parameter in PathMatcher12")> slash​([PathMatcher0](PathMatcher0.html "class in akka.http.javadsl.server") next)
		```
		- #### slash
		
		
		
		```
		public <N> [PathMatcher13](PathMatcher13.html "class in akka.http.javadsl.server")<[T1](PathMatcher12.html "type parameter in PathMatcher12"),​[T2](PathMatcher12.html "type parameter in PathMatcher12"),​[T3](PathMatcher12.html "type parameter in PathMatcher12"),​[T4](PathMatcher12.html "type parameter in PathMatcher12"),​[T5](PathMatcher12.html "type parameter in PathMatcher12"),​[T6](PathMatcher12.html "type parameter in PathMatcher12"),​[T7](PathMatcher12.html "type parameter in PathMatcher12"),​[T8](PathMatcher12.html "type parameter in PathMatcher12"),​[T9](PathMatcher12.html "type parameter in PathMatcher12"),​[T10](PathMatcher12.html "type parameter in PathMatcher12"),​[T11](PathMatcher12.html "type parameter in PathMatcher12"),​[T12](PathMatcher12.html "type parameter in PathMatcher12"),​N> slash​([PathMatcher1](PathMatcher1.html "class in akka.http.javadsl.server")<N> next)
		```
		- #### slash
		
		
		
		```
		public <N1,​N2> [PathMatcher14](PathMatcher14.html "class in akka.http.javadsl.server")<[T1](PathMatcher12.html "type parameter in PathMatcher12"),​[T2](PathMatcher12.html "type parameter in PathMatcher12"),​[T3](PathMatcher12.html "type parameter in PathMatcher12"),​[T4](PathMatcher12.html "type parameter in PathMatcher12"),​[T5](PathMatcher12.html "type parameter in PathMatcher12"),​[T6](PathMatcher12.html "type parameter in PathMatcher12"),​[T7](PathMatcher12.html "type parameter in PathMatcher12"),​[T8](PathMatcher12.html "type parameter in PathMatcher12"),​[T9](PathMatcher12.html "type parameter in PathMatcher12"),​[T10](PathMatcher12.html "type parameter in PathMatcher12"),​[T11](PathMatcher12.html "type parameter in PathMatcher12"),​[T12](PathMatcher12.html "type parameter in PathMatcher12"),​N1,​N2> slash​([PathMatcher2](PathMatcher2.html "class in akka.http.javadsl.server")<N1,​N2> next)
		```
		- #### toScala
		
		
		
		```
		public [PathMatcher](../../scaladsl/server/PathMatcher.html "class in akka.http.scaladsl.server")<scala.Tuple12<[T1](PathMatcher12.html "type parameter in PathMatcher12"),​[T2](PathMatcher12.html "type parameter in PathMatcher12"),​[T3](PathMatcher12.html "type parameter in PathMatcher12"),​[T4](PathMatcher12.html "type parameter in PathMatcher12"),​[T5](PathMatcher12.html "type parameter in PathMatcher12"),​[T6](PathMatcher12.html "type parameter in PathMatcher12"),​[T7](PathMatcher12.html "type parameter in PathMatcher12"),​[T8](PathMatcher12.html "type parameter in PathMatcher12"),​[T9](PathMatcher12.html "type parameter in PathMatcher12"),​[T10](PathMatcher12.html "type parameter in PathMatcher12"),​[T11](PathMatcher12.html "type parameter in PathMatcher12"),​[T12](PathMatcher12.html "type parameter in PathMatcher12")>> toScala()
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/server/PathMatcher0.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/server/PathMatcher1.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/server/PathMatcher12.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/server/PathMatcher13.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/server/PathMatcher14.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/server/PathMatcher2.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/server/package-summary.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/PathMatcher.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/server/PathMatcher12.html](https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/server/PathMatcher12.html)*