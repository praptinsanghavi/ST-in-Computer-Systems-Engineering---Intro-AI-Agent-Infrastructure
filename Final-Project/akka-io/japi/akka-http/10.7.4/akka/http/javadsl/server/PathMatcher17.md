---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T02:09:14Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/PathMatcher17.html
title: PathMatcher17
---

# PathMatcher17

## Content

Package [akka.http.javadsl.server](package-summary.html)
## Class PathMatcher17\<T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11,​T12,​T13,​T14,​T15,​T16,​T17\>

- java.lang.Object
- - akka.http.javadsl.server.PathMatcher17\<T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11,​T12,​T13,​T14,​T15,​T16,​T17\>

- ---

```
public final class PathMatcher17<T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11,​T12,​T13,​T14,​T15,​T16,​T17>
extends java.lang.Object
```

A PathMatcher tries to match a prefix of a given string and returns either a PathMatcher.Matched instance
 if matched, otherwise PathMatchers.Unmatched.

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[PathMatcher17](#%3Cinit%3E(akka.http.scaladsl.server.PathMatcher))​([PathMatcher](../../scaladsl/server/PathMatcher.html "class in akka.http.scaladsl.server")<scala.Tuple17<[T1](PathMatcher17.html "type parameter in PathMatcher17"),​[T2](PathMatcher17.html "type parameter in PathMatcher17"),​[T3](PathMatcher17.html "type parameter in PathMatcher17"),​[T4](PathMatcher17.html "type parameter in PathMatcher17"),​[T5](PathMatcher17.html "type parameter in PathMatcher17"),​[T6](PathMatcher17.html "type parameter in PathMatcher17"),​[T7](PathMatcher17.html "type parameter in PathMatcher17"),​[T8](PathMatcher17.html "type parameter in PathMatcher17"),​[T9](PathMatcher17.html "type parameter in PathMatcher17"),​[T10](PathMatcher17.html "type parameter in PathMatcher17"),​[T11](PathMatcher17.html "type parameter in PathMatcher17"),​[T12](PathMatcher17.html "type parameter in PathMatcher17"),​[T13](PathMatcher17.html "type parameter in PathMatcher17"),​[T14](PathMatcher17.html "type parameter in PathMatcher17"),​[T15](PathMatcher17.html "type parameter in PathMatcher17"),​[T16](PathMatcher17.html "type parameter in PathMatcher17"),​[T17](PathMatcher17.html "type parameter in PathMatcher17")>> toScala)` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[PathMatcher17](PathMatcher17.html "class in akka.http.javadsl.server")<[T1](PathMatcher17.html "type parameter in PathMatcher17"),​[T2](PathMatcher17.html "type parameter in PathMatcher17"),​[T3](PathMatcher17.html "type parameter in PathMatcher17"),​[T4](PathMatcher17.html "type parameter in PathMatcher17"),​[T5](PathMatcher17.html "type parameter in PathMatcher17"),​[T6](PathMatcher17.html "type parameter in PathMatcher17"),​[T7](PathMatcher17.html "type parameter in PathMatcher17"),​[T8](PathMatcher17.html "type parameter in PathMatcher17"),​[T9](PathMatcher17.html "type parameter in PathMatcher17"),​[T10](PathMatcher17.html "type parameter in PathMatcher17"),​[T11](PathMatcher17.html "type parameter in PathMatcher17"),​[T12](PathMatcher17.html "type parameter in PathMatcher17"),​[T13](PathMatcher17.html "type parameter in PathMatcher17"),​[T14](PathMatcher17.html "type parameter in PathMatcher17"),​[T15](PathMatcher17.html "type parameter in PathMatcher17"),​[T16](PathMatcher17.html "type parameter in PathMatcher17"),​[T17](PathMatcher17.html "type parameter in PathMatcher17")>` | `[concat](#concat(akka.http.javadsl.server.PathMatcher0))​([PathMatcher0](PathMatcher0.html "class in akka.http.javadsl.server") next)` |  |
	| `<N> [PathMatcher18](PathMatcher18.html "class in akka.http.javadsl.server")<[T1](PathMatcher17.html "type parameter in PathMatcher17"),​[T2](PathMatcher17.html "type parameter in PathMatcher17"),​[T3](PathMatcher17.html "type parameter in PathMatcher17"),​[T4](PathMatcher17.html "type parameter in PathMatcher17"),​[T5](PathMatcher17.html "type parameter in PathMatcher17"),​[T6](PathMatcher17.html "type parameter in PathMatcher17"),​[T7](PathMatcher17.html "type parameter in PathMatcher17"),​[T8](PathMatcher17.html "type parameter in PathMatcher17"),​[T9](PathMatcher17.html "type parameter in PathMatcher17"),​[T10](PathMatcher17.html "type parameter in PathMatcher17"),​[T11](PathMatcher17.html "type parameter in PathMatcher17"),​[T12](PathMatcher17.html "type parameter in PathMatcher17"),​[T13](PathMatcher17.html "type parameter in PathMatcher17"),​[T14](PathMatcher17.html "type parameter in PathMatcher17"),​[T15](PathMatcher17.html "type parameter in PathMatcher17"),​[T16](PathMatcher17.html "type parameter in PathMatcher17"),​[T17](PathMatcher17.html "type parameter in PathMatcher17"),​N>` | `[concat](#concat(akka.http.javadsl.server.PathMatcher1))​([PathMatcher1](PathMatcher1.html "class in akka.http.javadsl.server")<N> next)` |  |
	| `<N1,​N2>[PathMatcher19](PathMatcher19.html "class in akka.http.javadsl.server")<[T1](PathMatcher17.html "type parameter in PathMatcher17"),​[T2](PathMatcher17.html "type parameter in PathMatcher17"),​[T3](PathMatcher17.html "type parameter in PathMatcher17"),​[T4](PathMatcher17.html "type parameter in PathMatcher17"),​[T5](PathMatcher17.html "type parameter in PathMatcher17"),​[T6](PathMatcher17.html "type parameter in PathMatcher17"),​[T7](PathMatcher17.html "type parameter in PathMatcher17"),​[T8](PathMatcher17.html "type parameter in PathMatcher17"),​[T9](PathMatcher17.html "type parameter in PathMatcher17"),​[T10](PathMatcher17.html "type parameter in PathMatcher17"),​[T11](PathMatcher17.html "type parameter in PathMatcher17"),​[T12](PathMatcher17.html "type parameter in PathMatcher17"),​[T13](PathMatcher17.html "type parameter in PathMatcher17"),​[T14](PathMatcher17.html "type parameter in PathMatcher17"),​[T15](PathMatcher17.html "type parameter in PathMatcher17"),​[T16](PathMatcher17.html "type parameter in PathMatcher17"),​[T17](PathMatcher17.html "type parameter in PathMatcher17"),​N1,​N2>` | `[concat](#concat(akka.http.javadsl.server.PathMatcher2))​([PathMatcher2](PathMatcher2.html "class in akka.http.javadsl.server")<N1,​N2> next)` |  |
	| `[PathMatcher17](PathMatcher17.html "class in akka.http.javadsl.server")<[T1](PathMatcher17.html "type parameter in PathMatcher17"),​[T2](PathMatcher17.html "type parameter in PathMatcher17"),​[T3](PathMatcher17.html "type parameter in PathMatcher17"),​[T4](PathMatcher17.html "type parameter in PathMatcher17"),​[T5](PathMatcher17.html "type parameter in PathMatcher17"),​[T6](PathMatcher17.html "type parameter in PathMatcher17"),​[T7](PathMatcher17.html "type parameter in PathMatcher17"),​[T8](PathMatcher17.html "type parameter in PathMatcher17"),​[T9](PathMatcher17.html "type parameter in PathMatcher17"),​[T10](PathMatcher17.html "type parameter in PathMatcher17"),​[T11](PathMatcher17.html "type parameter in PathMatcher17"),​[T12](PathMatcher17.html "type parameter in PathMatcher17"),​[T13](PathMatcher17.html "type parameter in PathMatcher17"),​[T14](PathMatcher17.html "type parameter in PathMatcher17"),​[T15](PathMatcher17.html "type parameter in PathMatcher17"),​[T16](PathMatcher17.html "type parameter in PathMatcher17"),​[T17](PathMatcher17.html "type parameter in PathMatcher17")>` | `[concat](#concat(java.lang.String))​(java.lang.String segment)` |  |
	| `[PathMatcher0](PathMatcher0.html "class in akka.http.javadsl.server")` | `[invert](#invert())()` |  |
	| `[PathMatcher17](PathMatcher17.html "class in akka.http.javadsl.server")<[T1](PathMatcher17.html "type parameter in PathMatcher17"),​[T2](PathMatcher17.html "type parameter in PathMatcher17"),​[T3](PathMatcher17.html "type parameter in PathMatcher17"),​[T4](PathMatcher17.html "type parameter in PathMatcher17"),​[T5](PathMatcher17.html "type parameter in PathMatcher17"),​[T6](PathMatcher17.html "type parameter in PathMatcher17"),​[T7](PathMatcher17.html "type parameter in PathMatcher17"),​[T8](PathMatcher17.html "type parameter in PathMatcher17"),​[T9](PathMatcher17.html "type parameter in PathMatcher17"),​[T10](PathMatcher17.html "type parameter in PathMatcher17"),​[T11](PathMatcher17.html "type parameter in PathMatcher17"),​[T12](PathMatcher17.html "type parameter in PathMatcher17"),​[T13](PathMatcher17.html "type parameter in PathMatcher17"),​[T14](PathMatcher17.html "type parameter in PathMatcher17"),​[T15](PathMatcher17.html "type parameter in PathMatcher17"),​[T16](PathMatcher17.html "type parameter in PathMatcher17"),​[T17](PathMatcher17.html "type parameter in PathMatcher17")>` | `[orElse](#orElse(akka.http.javadsl.server.PathMatcher17))​([PathMatcher17](PathMatcher17.html "class in akka.http.javadsl.server")<[T1](PathMatcher17.html "type parameter in PathMatcher17"),​[T2](PathMatcher17.html "type parameter in PathMatcher17"),​[T3](PathMatcher17.html "type parameter in PathMatcher17"),​[T4](PathMatcher17.html "type parameter in PathMatcher17"),​[T5](PathMatcher17.html "type parameter in PathMatcher17"),​[T6](PathMatcher17.html "type parameter in PathMatcher17"),​[T7](PathMatcher17.html "type parameter in PathMatcher17"),​[T8](PathMatcher17.html "type parameter in PathMatcher17"),​[T9](PathMatcher17.html "type parameter in PathMatcher17"),​[T10](PathMatcher17.html "type parameter in PathMatcher17"),​[T11](PathMatcher17.html "type parameter in PathMatcher17"),​[T12](PathMatcher17.html "type parameter in PathMatcher17"),​[T13](PathMatcher17.html "type parameter in PathMatcher17"),​[T14](PathMatcher17.html "type parameter in PathMatcher17"),​[T15](PathMatcher17.html "type parameter in PathMatcher17"),​[T16](PathMatcher17.html "type parameter in PathMatcher17"),​[T17](PathMatcher17.html "type parameter in PathMatcher17")> alternative)` |  |
	| `[PathMatcher17](PathMatcher17.html "class in akka.http.javadsl.server")<[T1](PathMatcher17.html "type parameter in PathMatcher17"),​[T2](PathMatcher17.html "type parameter in PathMatcher17"),​[T3](PathMatcher17.html "type parameter in PathMatcher17"),​[T4](PathMatcher17.html "type parameter in PathMatcher17"),​[T5](PathMatcher17.html "type parameter in PathMatcher17"),​[T6](PathMatcher17.html "type parameter in PathMatcher17"),​[T7](PathMatcher17.html "type parameter in PathMatcher17"),​[T8](PathMatcher17.html "type parameter in PathMatcher17"),​[T9](PathMatcher17.html "type parameter in PathMatcher17"),​[T10](PathMatcher17.html "type parameter in PathMatcher17"),​[T11](PathMatcher17.html "type parameter in PathMatcher17"),​[T12](PathMatcher17.html "type parameter in PathMatcher17"),​[T13](PathMatcher17.html "type parameter in PathMatcher17"),​[T14](PathMatcher17.html "type parameter in PathMatcher17"),​[T15](PathMatcher17.html "type parameter in PathMatcher17"),​[T16](PathMatcher17.html "type parameter in PathMatcher17"),​[T17](PathMatcher17.html "type parameter in PathMatcher17")>` | `[slash](#slash())()` |  |
	| `[PathMatcher17](PathMatcher17.html "class in akka.http.javadsl.server")<[T1](PathMatcher17.html "type parameter in PathMatcher17"),​[T2](PathMatcher17.html "type parameter in PathMatcher17"),​[T3](PathMatcher17.html "type parameter in PathMatcher17"),​[T4](PathMatcher17.html "type parameter in PathMatcher17"),​[T5](PathMatcher17.html "type parameter in PathMatcher17"),​[T6](PathMatcher17.html "type parameter in PathMatcher17"),​[T7](PathMatcher17.html "type parameter in PathMatcher17"),​[T8](PathMatcher17.html "type parameter in PathMatcher17"),​[T9](PathMatcher17.html "type parameter in PathMatcher17"),​[T10](PathMatcher17.html "type parameter in PathMatcher17"),​[T11](PathMatcher17.html "type parameter in PathMatcher17"),​[T12](PathMatcher17.html "type parameter in PathMatcher17"),​[T13](PathMatcher17.html "type parameter in PathMatcher17"),​[T14](PathMatcher17.html "type parameter in PathMatcher17"),​[T15](PathMatcher17.html "type parameter in PathMatcher17"),​[T16](PathMatcher17.html "type parameter in PathMatcher17"),​[T17](PathMatcher17.html "type parameter in PathMatcher17")>` | `[slash](#slash(akka.http.javadsl.server.PathMatcher0))​([PathMatcher0](PathMatcher0.html "class in akka.http.javadsl.server") next)` |  |
	| `<N> [PathMatcher18](PathMatcher18.html "class in akka.http.javadsl.server")<[T1](PathMatcher17.html "type parameter in PathMatcher17"),​[T2](PathMatcher17.html "type parameter in PathMatcher17"),​[T3](PathMatcher17.html "type parameter in PathMatcher17"),​[T4](PathMatcher17.html "type parameter in PathMatcher17"),​[T5](PathMatcher17.html "type parameter in PathMatcher17"),​[T6](PathMatcher17.html "type parameter in PathMatcher17"),​[T7](PathMatcher17.html "type parameter in PathMatcher17"),​[T8](PathMatcher17.html "type parameter in PathMatcher17"),​[T9](PathMatcher17.html "type parameter in PathMatcher17"),​[T10](PathMatcher17.html "type parameter in PathMatcher17"),​[T11](PathMatcher17.html "type parameter in PathMatcher17"),​[T12](PathMatcher17.html "type parameter in PathMatcher17"),​[T13](PathMatcher17.html "type parameter in PathMatcher17"),​[T14](PathMatcher17.html "type parameter in PathMatcher17"),​[T15](PathMatcher17.html "type parameter in PathMatcher17"),​[T16](PathMatcher17.html "type parameter in PathMatcher17"),​[T17](PathMatcher17.html "type parameter in PathMatcher17"),​N>` | `[slash](#slash(akka.http.javadsl.server.PathMatcher1))​([PathMatcher1](PathMatcher1.html "class in akka.http.javadsl.server")<N> next)` |  |
	| `<N1,​N2>[PathMatcher19](PathMatcher19.html "class in akka.http.javadsl.server")<[T1](PathMatcher17.html "type parameter in PathMatcher17"),​[T2](PathMatcher17.html "type parameter in PathMatcher17"),​[T3](PathMatcher17.html "type parameter in PathMatcher17"),​[T4](PathMatcher17.html "type parameter in PathMatcher17"),​[T5](PathMatcher17.html "type parameter in PathMatcher17"),​[T6](PathMatcher17.html "type parameter in PathMatcher17"),​[T7](PathMatcher17.html "type parameter in PathMatcher17"),​[T8](PathMatcher17.html "type parameter in PathMatcher17"),​[T9](PathMatcher17.html "type parameter in PathMatcher17"),​[T10](PathMatcher17.html "type parameter in PathMatcher17"),​[T11](PathMatcher17.html "type parameter in PathMatcher17"),​[T12](PathMatcher17.html "type parameter in PathMatcher17"),​[T13](PathMatcher17.html "type parameter in PathMatcher17"),​[T14](PathMatcher17.html "type parameter in PathMatcher17"),​[T15](PathMatcher17.html "type parameter in PathMatcher17"),​[T16](PathMatcher17.html "type parameter in PathMatcher17"),​[T17](PathMatcher17.html "type parameter in PathMatcher17"),​N1,​N2>` | `[slash](#slash(akka.http.javadsl.server.PathMatcher2))​([PathMatcher2](PathMatcher2.html "class in akka.http.javadsl.server")<N1,​N2> next)` |  |
	| `[PathMatcher17](PathMatcher17.html "class in akka.http.javadsl.server")<[T1](PathMatcher17.html "type parameter in PathMatcher17"),​[T2](PathMatcher17.html "type parameter in PathMatcher17"),​[T3](PathMatcher17.html "type parameter in PathMatcher17"),​[T4](PathMatcher17.html "type parameter in PathMatcher17"),​[T5](PathMatcher17.html "type parameter in PathMatcher17"),​[T6](PathMatcher17.html "type parameter in PathMatcher17"),​[T7](PathMatcher17.html "type parameter in PathMatcher17"),​[T8](PathMatcher17.html "type parameter in PathMatcher17"),​[T9](PathMatcher17.html "type parameter in PathMatcher17"),​[T10](PathMatcher17.html "type parameter in PathMatcher17"),​[T11](PathMatcher17.html "type parameter in PathMatcher17"),​[T12](PathMatcher17.html "type parameter in PathMatcher17"),​[T13](PathMatcher17.html "type parameter in PathMatcher17"),​[T14](PathMatcher17.html "type parameter in PathMatcher17"),​[T15](PathMatcher17.html "type parameter in PathMatcher17"),​[T16](PathMatcher17.html "type parameter in PathMatcher17"),​[T17](PathMatcher17.html "type parameter in PathMatcher17")>` | `[slash](#slash(java.lang.String))​(java.lang.String segment)` |  |
	| `[PathMatcher](../../scaladsl/server/PathMatcher.html "class in akka.http.scaladsl.server")<scala.Tuple17<[T1](PathMatcher17.html "type parameter in PathMatcher17"),​[T2](PathMatcher17.html "type parameter in PathMatcher17"),​[T3](PathMatcher17.html "type parameter in PathMatcher17"),​[T4](PathMatcher17.html "type parameter in PathMatcher17"),​[T5](PathMatcher17.html "type parameter in PathMatcher17"),​[T6](PathMatcher17.html "type parameter in PathMatcher17"),​[T7](PathMatcher17.html "type parameter in PathMatcher17"),​[T8](PathMatcher17.html "type parameter in PathMatcher17"),​[T9](PathMatcher17.html "type parameter in PathMatcher17"),​[T10](PathMatcher17.html "type parameter in PathMatcher17"),​[T11](PathMatcher17.html "type parameter in PathMatcher17"),​[T12](PathMatcher17.html "type parameter in PathMatcher17"),​[T13](PathMatcher17.html "type parameter in PathMatcher17"),​[T14](PathMatcher17.html "type parameter in PathMatcher17"),​[T15](PathMatcher17.html "type parameter in PathMatcher17"),​[T16](PathMatcher17.html "type parameter in PathMatcher17"),​[T17](PathMatcher17.html "type parameter in PathMatcher17")>>` | `[toScala](#toScala())()` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### PathMatcher17
		
		
		
		```
		public PathMatcher17​([PathMatcher](../../scaladsl/server/PathMatcher.html "class in akka.http.scaladsl.server")<scala.Tuple17<[T1](PathMatcher17.html "type parameter in PathMatcher17"),​[T2](PathMatcher17.html "type parameter in PathMatcher17"),​[T3](PathMatcher17.html "type parameter in PathMatcher17"),​[T4](PathMatcher17.html "type parameter in PathMatcher17"),​[T5](PathMatcher17.html "type parameter in PathMatcher17"),​[T6](PathMatcher17.html "type parameter in PathMatcher17"),​[T7](PathMatcher17.html "type parameter in PathMatcher17"),​[T8](PathMatcher17.html "type parameter in PathMatcher17"),​[T9](PathMatcher17.html "type parameter in PathMatcher17"),​[T10](PathMatcher17.html "type parameter in PathMatcher17"),​[T11](PathMatcher17.html "type parameter in PathMatcher17"),​[T12](PathMatcher17.html "type parameter in PathMatcher17"),​[T13](PathMatcher17.html "type parameter in PathMatcher17"),​[T14](PathMatcher17.html "type parameter in PathMatcher17"),​[T15](PathMatcher17.html "type parameter in PathMatcher17"),​[T16](PathMatcher17.html "type parameter in PathMatcher17"),​[T17](PathMatcher17.html "type parameter in PathMatcher17")>> toScala)
		```

	- ### Method Detail
	
	
	
		- #### concat
		
		
		
		```
		public [PathMatcher17](PathMatcher17.html "class in akka.http.javadsl.server")<[T1](PathMatcher17.html "type parameter in PathMatcher17"),​[T2](PathMatcher17.html "type parameter in PathMatcher17"),​[T3](PathMatcher17.html "type parameter in PathMatcher17"),​[T4](PathMatcher17.html "type parameter in PathMatcher17"),​[T5](PathMatcher17.html "type parameter in PathMatcher17"),​[T6](PathMatcher17.html "type parameter in PathMatcher17"),​[T7](PathMatcher17.html "type parameter in PathMatcher17"),​[T8](PathMatcher17.html "type parameter in PathMatcher17"),​[T9](PathMatcher17.html "type parameter in PathMatcher17"),​[T10](PathMatcher17.html "type parameter in PathMatcher17"),​[T11](PathMatcher17.html "type parameter in PathMatcher17"),​[T12](PathMatcher17.html "type parameter in PathMatcher17"),​[T13](PathMatcher17.html "type parameter in PathMatcher17"),​[T14](PathMatcher17.html "type parameter in PathMatcher17"),​[T15](PathMatcher17.html "type parameter in PathMatcher17"),​[T16](PathMatcher17.html "type parameter in PathMatcher17"),​[T17](PathMatcher17.html "type parameter in PathMatcher17")> concat​(java.lang.String segment)
		```
		- #### concat
		
		
		
		```
		public [PathMatcher17](PathMatcher17.html "class in akka.http.javadsl.server")<[T1](PathMatcher17.html "type parameter in PathMatcher17"),​[T2](PathMatcher17.html "type parameter in PathMatcher17"),​[T3](PathMatcher17.html "type parameter in PathMatcher17"),​[T4](PathMatcher17.html "type parameter in PathMatcher17"),​[T5](PathMatcher17.html "type parameter in PathMatcher17"),​[T6](PathMatcher17.html "type parameter in PathMatcher17"),​[T7](PathMatcher17.html "type parameter in PathMatcher17"),​[T8](PathMatcher17.html "type parameter in PathMatcher17"),​[T9](PathMatcher17.html "type parameter in PathMatcher17"),​[T10](PathMatcher17.html "type parameter in PathMatcher17"),​[T11](PathMatcher17.html "type parameter in PathMatcher17"),​[T12](PathMatcher17.html "type parameter in PathMatcher17"),​[T13](PathMatcher17.html "type parameter in PathMatcher17"),​[T14](PathMatcher17.html "type parameter in PathMatcher17"),​[T15](PathMatcher17.html "type parameter in PathMatcher17"),​[T16](PathMatcher17.html "type parameter in PathMatcher17"),​[T17](PathMatcher17.html "type parameter in PathMatcher17")> concat​([PathMatcher0](PathMatcher0.html "class in akka.http.javadsl.server") next)
		```
		- #### concat
		
		
		
		```
		public <N> [PathMatcher18](PathMatcher18.html "class in akka.http.javadsl.server")<[T1](PathMatcher17.html "type parameter in PathMatcher17"),​[T2](PathMatcher17.html "type parameter in PathMatcher17"),​[T3](PathMatcher17.html "type parameter in PathMatcher17"),​[T4](PathMatcher17.html "type parameter in PathMatcher17"),​[T5](PathMatcher17.html "type parameter in PathMatcher17"),​[T6](PathMatcher17.html "type parameter in PathMatcher17"),​[T7](PathMatcher17.html "type parameter in PathMatcher17"),​[T8](PathMatcher17.html "type parameter in PathMatcher17"),​[T9](PathMatcher17.html "type parameter in PathMatcher17"),​[T10](PathMatcher17.html "type parameter in PathMatcher17"),​[T11](PathMatcher17.html "type parameter in PathMatcher17"),​[T12](PathMatcher17.html "type parameter in PathMatcher17"),​[T13](PathMatcher17.html "type parameter in PathMatcher17"),​[T14](PathMatcher17.html "type parameter in PathMatcher17"),​[T15](PathMatcher17.html "type parameter in PathMatcher17"),​[T16](PathMatcher17.html "type parameter in PathMatcher17"),​[T17](PathMatcher17.html "type parameter in PathMatcher17"),​N> concat​([PathMatcher1](PathMatcher1.html "class in akka.http.javadsl.server")<N> next)
		```
		- #### concat
		
		
		
		```
		public <N1,​N2> [PathMatcher19](PathMatcher19.html "class in akka.http.javadsl.server")<[T1](PathMatcher17.html "type parameter in PathMatcher17"),​[T2](PathMatcher17.html "type parameter in PathMatcher17"),​[T3](PathMatcher17.html "type parameter in PathMatcher17"),​[T4](PathMatcher17.html "type parameter in PathMatcher17"),​[T5](PathMatcher17.html "type parameter in PathMatcher17"),​[T6](PathMatcher17.html "type parameter in PathMatcher17"),​[T7](PathMatcher17.html "type parameter in PathMatcher17"),​[T8](PathMatcher17.html "type parameter in PathMatcher17"),​[T9](PathMatcher17.html "type parameter in PathMatcher17"),​[T10](PathMatcher17.html "type parameter in PathMatcher17"),​[T11](PathMatcher17.html "type parameter in PathMatcher17"),​[T12](PathMatcher17.html "type parameter in PathMatcher17"),​[T13](PathMatcher17.html "type parameter in PathMatcher17"),​[T14](PathMatcher17.html "type parameter in PathMatcher17"),​[T15](PathMatcher17.html "type parameter in PathMatcher17"),​[T16](PathMatcher17.html "type parameter in PathMatcher17"),​[T17](PathMatcher17.html "type parameter in PathMatcher17"),​N1,​N2> concat​([PathMatcher2](PathMatcher2.html "class in akka.http.javadsl.server")<N1,​N2> next)
		```
		- #### invert
		
		
		
		```
		public [PathMatcher0](PathMatcher0.html "class in akka.http.javadsl.server") invert()
		```
		- #### orElse
		
		
		
		```
		public [PathMatcher17](PathMatcher17.html "class in akka.http.javadsl.server")<[T1](PathMatcher17.html "type parameter in PathMatcher17"),​[T2](PathMatcher17.html "type parameter in PathMatcher17"),​[T3](PathMatcher17.html "type parameter in PathMatcher17"),​[T4](PathMatcher17.html "type parameter in PathMatcher17"),​[T5](PathMatcher17.html "type parameter in PathMatcher17"),​[T6](PathMatcher17.html "type parameter in PathMatcher17"),​[T7](PathMatcher17.html "type parameter in PathMatcher17"),​[T8](PathMatcher17.html "type parameter in PathMatcher17"),​[T9](PathMatcher17.html "type parameter in PathMatcher17"),​[T10](PathMatcher17.html "type parameter in PathMatcher17"),​[T11](PathMatcher17.html "type parameter in PathMatcher17"),​[T12](PathMatcher17.html "type parameter in PathMatcher17"),​[T13](PathMatcher17.html "type parameter in PathMatcher17"),​[T14](PathMatcher17.html "type parameter in PathMatcher17"),​[T15](PathMatcher17.html "type parameter in PathMatcher17"),​[T16](PathMatcher17.html "type parameter in PathMatcher17"),​[T17](PathMatcher17.html "type parameter in PathMatcher17")> orElse​([PathMatcher17](PathMatcher17.html "class in akka.http.javadsl.server")<[T1](PathMatcher17.html "type parameter in PathMatcher17"),​[T2](PathMatcher17.html "type parameter in PathMatcher17"),​[T3](PathMatcher17.html "type parameter in PathMatcher17"),​[T4](PathMatcher17.html "type parameter in PathMatcher17"),​[T5](PathMatcher17.html "type parameter in PathMatcher17"),​[T6](PathMatcher17.html "type parameter in PathMatcher17"),​[T7](PathMatcher17.html "type parameter in PathMatcher17"),​[T8](PathMatcher17.html "type parameter in PathMatcher17"),​[T9](PathMatcher17.html "type parameter in PathMatcher17"),​[T10](PathMatcher17.html "type parameter in PathMatcher17"),​[T11](PathMatcher17.html "type parameter in PathMatcher17"),​[T12](PathMatcher17.html "type parameter in PathMatcher17"),​[T13](PathMatcher17.html "type parameter in PathMatcher17"),​[T14](PathMatcher17.html "type parameter in PathMatcher17"),​[T15](PathMatcher17.html "type parameter in PathMatcher17"),​[T16](PathMatcher17.html "type parameter in PathMatcher17"),​[T17](PathMatcher17.html "type parameter in PathMatcher17")> alternative)
		```
		- #### slash
		
		
		
		```
		public [PathMatcher17](PathMatcher17.html "class in akka.http.javadsl.server")<[T1](PathMatcher17.html "type parameter in PathMatcher17"),​[T2](PathMatcher17.html "type parameter in PathMatcher17"),​[T3](PathMatcher17.html "type parameter in PathMatcher17"),​[T4](PathMatcher17.html "type parameter in PathMatcher17"),​[T5](PathMatcher17.html "type parameter in PathMatcher17"),​[T6](PathMatcher17.html "type parameter in PathMatcher17"),​[T7](PathMatcher17.html "type parameter in PathMatcher17"),​[T8](PathMatcher17.html "type parameter in PathMatcher17"),​[T9](PathMatcher17.html "type parameter in PathMatcher17"),​[T10](PathMatcher17.html "type parameter in PathMatcher17"),​[T11](PathMatcher17.html "type parameter in PathMatcher17"),​[T12](PathMatcher17.html "type parameter in PathMatcher17"),​[T13](PathMatcher17.html "type parameter in PathMatcher17"),​[T14](PathMatcher17.html "type parameter in PathMatcher17"),​[T15](PathMatcher17.html "type parameter in PathMatcher17"),​[T16](PathMatcher17.html "type parameter in PathMatcher17"),​[T17](PathMatcher17.html "type parameter in PathMatcher17")> slash()
		```
		- #### slash
		
		
		
		```
		public [PathMatcher17](PathMatcher17.html "class in akka.http.javadsl.server")<[T1](PathMatcher17.html "type parameter in PathMatcher17"),​[T2](PathMatcher17.html "type parameter in PathMatcher17"),​[T3](PathMatcher17.html "type parameter in PathMatcher17"),​[T4](PathMatcher17.html "type parameter in PathMatcher17"),​[T5](PathMatcher17.html "type parameter in PathMatcher17"),​[T6](PathMatcher17.html "type parameter in PathMatcher17"),​[T7](PathMatcher17.html "type parameter in PathMatcher17"),​[T8](PathMatcher17.html "type parameter in PathMatcher17"),​[T9](PathMatcher17.html "type parameter in PathMatcher17"),​[T10](PathMatcher17.html "type parameter in PathMatcher17"),​[T11](PathMatcher17.html "type parameter in PathMatcher17"),​[T12](PathMatcher17.html "type parameter in PathMatcher17"),​[T13](PathMatcher17.html "type parameter in PathMatcher17"),​[T14](PathMatcher17.html "type parameter in PathMatcher17"),​[T15](PathMatcher17.html "type parameter in PathMatcher17"),​[T16](PathMatcher17.html "type parameter in PathMatcher17"),​[T17](PathMatcher17.html "type parameter in PathMatcher17")> slash​(java.lang.String segment)
		```
		- #### slash
		
		
		
		```
		public [PathMatcher17](PathMatcher17.html "class in akka.http.javadsl.server")<[T1](PathMatcher17.html "type parameter in PathMatcher17"),​[T2](PathMatcher17.html "type parameter in PathMatcher17"),​[T3](PathMatcher17.html "type parameter in PathMatcher17"),​[T4](PathMatcher17.html "type parameter in PathMatcher17"),​[T5](PathMatcher17.html "type parameter in PathMatcher17"),​[T6](PathMatcher17.html "type parameter in PathMatcher17"),​[T7](PathMatcher17.html "type parameter in PathMatcher17"),​[T8](PathMatcher17.html "type parameter in PathMatcher17"),​[T9](PathMatcher17.html "type parameter in PathMatcher17"),​[T10](PathMatcher17.html "type parameter in PathMatcher17"),​[T11](PathMatcher17.html "type parameter in PathMatcher17"),​[T12](PathMatcher17.html "type parameter in PathMatcher17"),​[T13](PathMatcher17.html "type parameter in PathMatcher17"),​[T14](PathMatcher17.html "type parameter in PathMatcher17"),​[T15](PathMatcher17.html "type parameter in PathMatcher17"),​[T16](PathMatcher17.html "type parameter in PathMatcher17"),​[T17](PathMatcher17.html "type parameter in PathMatcher17")> slash​([PathMatcher0](PathMatcher0.html "class in akka.http.javadsl.server") next)
		```
		- #### slash
		
		
		
		```
		public <N> [PathMatcher18](PathMatcher18.html "class in akka.http.javadsl.server")<[T1](PathMatcher17.html "type parameter in PathMatcher17"),​[T2](PathMatcher17.html "type parameter in PathMatcher17"),​[T3](PathMatcher17.html "type parameter in PathMatcher17"),​[T4](PathMatcher17.html "type parameter in PathMatcher17"),​[T5](PathMatcher17.html "type parameter in PathMatcher17"),​[T6](PathMatcher17.html "type parameter in PathMatcher17"),​[T7](PathMatcher17.html "type parameter in PathMatcher17"),​[T8](PathMatcher17.html "type parameter in PathMatcher17"),​[T9](PathMatcher17.html "type parameter in PathMatcher17"),​[T10](PathMatcher17.html "type parameter in PathMatcher17"),​[T11](PathMatcher17.html "type parameter in PathMatcher17"),​[T12](PathMatcher17.html "type parameter in PathMatcher17"),​[T13](PathMatcher17.html "type parameter in PathMatcher17"),​[T14](PathMatcher17.html "type parameter in PathMatcher17"),​[T15](PathMatcher17.html "type parameter in PathMatcher17"),​[T16](PathMatcher17.html "type parameter in PathMatcher17"),​[T17](PathMatcher17.html "type parameter in PathMatcher17"),​N> slash​([PathMatcher1](PathMatcher1.html "class in akka.http.javadsl.server")<N> next)
		```
		- #### slash
		
		
		
		```
		public <N1,​N2> [PathMatcher19](PathMatcher19.html "class in akka.http.javadsl.server")<[T1](PathMatcher17.html "type parameter in PathMatcher17"),​[T2](PathMatcher17.html "type parameter in PathMatcher17"),​[T3](PathMatcher17.html "type parameter in PathMatcher17"),​[T4](PathMatcher17.html "type parameter in PathMatcher17"),​[T5](PathMatcher17.html "type parameter in PathMatcher17"),​[T6](PathMatcher17.html "type parameter in PathMatcher17"),​[T7](PathMatcher17.html "type parameter in PathMatcher17"),​[T8](PathMatcher17.html "type parameter in PathMatcher17"),​[T9](PathMatcher17.html "type parameter in PathMatcher17"),​[T10](PathMatcher17.html "type parameter in PathMatcher17"),​[T11](PathMatcher17.html "type parameter in PathMatcher17"),​[T12](PathMatcher17.html "type parameter in PathMatcher17"),​[T13](PathMatcher17.html "type parameter in PathMatcher17"),​[T14](PathMatcher17.html "type parameter in PathMatcher17"),​[T15](PathMatcher17.html "type parameter in PathMatcher17"),​[T16](PathMatcher17.html "type parameter in PathMatcher17"),​[T17](PathMatcher17.html "type parameter in PathMatcher17"),​N1,​N2> slash​([PathMatcher2](PathMatcher2.html "class in akka.http.javadsl.server")<N1,​N2> next)
		```
		- #### toScala
		
		
		
		```
		public [PathMatcher](../../scaladsl/server/PathMatcher.html "class in akka.http.scaladsl.server")<scala.Tuple17<[T1](PathMatcher17.html "type parameter in PathMatcher17"),​[T2](PathMatcher17.html "type parameter in PathMatcher17"),​[T3](PathMatcher17.html "type parameter in PathMatcher17"),​[T4](PathMatcher17.html "type parameter in PathMatcher17"),​[T5](PathMatcher17.html "type parameter in PathMatcher17"),​[T6](PathMatcher17.html "type parameter in PathMatcher17"),​[T7](PathMatcher17.html "type parameter in PathMatcher17"),​[T8](PathMatcher17.html "type parameter in PathMatcher17"),​[T9](PathMatcher17.html "type parameter in PathMatcher17"),​[T10](PathMatcher17.html "type parameter in PathMatcher17"),​[T11](PathMatcher17.html "type parameter in PathMatcher17"),​[T12](PathMatcher17.html "type parameter in PathMatcher17"),​[T13](PathMatcher17.html "type parameter in PathMatcher17"),​[T14](PathMatcher17.html "type parameter in PathMatcher17"),​[T15](PathMatcher17.html "type parameter in PathMatcher17"),​[T16](PathMatcher17.html "type parameter in PathMatcher17"),​[T17](PathMatcher17.html "type parameter in PathMatcher17")>> toScala()
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/PathMatcher0.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/PathMatcher1.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/PathMatcher17.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/PathMatcher18.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/PathMatcher19.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/PathMatcher2.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/package-summary.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/server/PathMatcher.html

---
*Source: [https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/PathMatcher17.html](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/PathMatcher17.html)*