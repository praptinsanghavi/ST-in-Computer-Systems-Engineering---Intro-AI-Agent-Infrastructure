---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T23:47:30Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/server/PathMatcher16.html
title: PathMatcher16
---

# PathMatcher16

## Content

Package [akka.http.javadsl.server](package-summary.html)
## Class PathMatcher16\<T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11,​T12,​T13,​T14,​T15,​T16\>

- java.lang.Object
- - akka.http.javadsl.server.PathMatcher16\<T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11,​T12,​T13,​T14,​T15,​T16\>

- ---

```
public final class PathMatcher16<T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11,​T12,​T13,​T14,​T15,​T16>
extends java.lang.Object
```

A PathMatcher tries to match a prefix of a given string and returns either a PathMatcher.Matched instance
 if matched, otherwise PathMatchers.Unmatched.

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[PathMatcher16](#%3Cinit%3E(akka.http.scaladsl.server.PathMatcher))​([PathMatcher](../../scaladsl/server/PathMatcher.html "class in akka.http.scaladsl.server")<scala.Tuple16<[T1](PathMatcher16.html "type parameter in PathMatcher16"),​[T2](PathMatcher16.html "type parameter in PathMatcher16"),​[T3](PathMatcher16.html "type parameter in PathMatcher16"),​[T4](PathMatcher16.html "type parameter in PathMatcher16"),​[T5](PathMatcher16.html "type parameter in PathMatcher16"),​[T6](PathMatcher16.html "type parameter in PathMatcher16"),​[T7](PathMatcher16.html "type parameter in PathMatcher16"),​[T8](PathMatcher16.html "type parameter in PathMatcher16"),​[T9](PathMatcher16.html "type parameter in PathMatcher16"),​[T10](PathMatcher16.html "type parameter in PathMatcher16"),​[T11](PathMatcher16.html "type parameter in PathMatcher16"),​[T12](PathMatcher16.html "type parameter in PathMatcher16"),​[T13](PathMatcher16.html "type parameter in PathMatcher16"),​[T14](PathMatcher16.html "type parameter in PathMatcher16"),​[T15](PathMatcher16.html "type parameter in PathMatcher16"),​[T16](PathMatcher16.html "type parameter in PathMatcher16")>> toScala)` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[PathMatcher16](PathMatcher16.html "class in akka.http.javadsl.server")<[T1](PathMatcher16.html "type parameter in PathMatcher16"),​[T2](PathMatcher16.html "type parameter in PathMatcher16"),​[T3](PathMatcher16.html "type parameter in PathMatcher16"),​[T4](PathMatcher16.html "type parameter in PathMatcher16"),​[T5](PathMatcher16.html "type parameter in PathMatcher16"),​[T6](PathMatcher16.html "type parameter in PathMatcher16"),​[T7](PathMatcher16.html "type parameter in PathMatcher16"),​[T8](PathMatcher16.html "type parameter in PathMatcher16"),​[T9](PathMatcher16.html "type parameter in PathMatcher16"),​[T10](PathMatcher16.html "type parameter in PathMatcher16"),​[T11](PathMatcher16.html "type parameter in PathMatcher16"),​[T12](PathMatcher16.html "type parameter in PathMatcher16"),​[T13](PathMatcher16.html "type parameter in PathMatcher16"),​[T14](PathMatcher16.html "type parameter in PathMatcher16"),​[T15](PathMatcher16.html "type parameter in PathMatcher16"),​[T16](PathMatcher16.html "type parameter in PathMatcher16")>` | `[concat](#concat(akka.http.javadsl.server.PathMatcher0))​([PathMatcher0](PathMatcher0.html "class in akka.http.javadsl.server") next)` |  |
	| `<N> [PathMatcher17](PathMatcher17.html "class in akka.http.javadsl.server")<[T1](PathMatcher16.html "type parameter in PathMatcher16"),​[T2](PathMatcher16.html "type parameter in PathMatcher16"),​[T3](PathMatcher16.html "type parameter in PathMatcher16"),​[T4](PathMatcher16.html "type parameter in PathMatcher16"),​[T5](PathMatcher16.html "type parameter in PathMatcher16"),​[T6](PathMatcher16.html "type parameter in PathMatcher16"),​[T7](PathMatcher16.html "type parameter in PathMatcher16"),​[T8](PathMatcher16.html "type parameter in PathMatcher16"),​[T9](PathMatcher16.html "type parameter in PathMatcher16"),​[T10](PathMatcher16.html "type parameter in PathMatcher16"),​[T11](PathMatcher16.html "type parameter in PathMatcher16"),​[T12](PathMatcher16.html "type parameter in PathMatcher16"),​[T13](PathMatcher16.html "type parameter in PathMatcher16"),​[T14](PathMatcher16.html "type parameter in PathMatcher16"),​[T15](PathMatcher16.html "type parameter in PathMatcher16"),​[T16](PathMatcher16.html "type parameter in PathMatcher16"),​N>` | `[concat](#concat(akka.http.javadsl.server.PathMatcher1))​([PathMatcher1](PathMatcher1.html "class in akka.http.javadsl.server")<N> next)` |  |
	| `<N1,​N2>[PathMatcher18](PathMatcher18.html "class in akka.http.javadsl.server")<[T1](PathMatcher16.html "type parameter in PathMatcher16"),​[T2](PathMatcher16.html "type parameter in PathMatcher16"),​[T3](PathMatcher16.html "type parameter in PathMatcher16"),​[T4](PathMatcher16.html "type parameter in PathMatcher16"),​[T5](PathMatcher16.html "type parameter in PathMatcher16"),​[T6](PathMatcher16.html "type parameter in PathMatcher16"),​[T7](PathMatcher16.html "type parameter in PathMatcher16"),​[T8](PathMatcher16.html "type parameter in PathMatcher16"),​[T9](PathMatcher16.html "type parameter in PathMatcher16"),​[T10](PathMatcher16.html "type parameter in PathMatcher16"),​[T11](PathMatcher16.html "type parameter in PathMatcher16"),​[T12](PathMatcher16.html "type parameter in PathMatcher16"),​[T13](PathMatcher16.html "type parameter in PathMatcher16"),​[T14](PathMatcher16.html "type parameter in PathMatcher16"),​[T15](PathMatcher16.html "type parameter in PathMatcher16"),​[T16](PathMatcher16.html "type parameter in PathMatcher16"),​N1,​N2>` | `[concat](#concat(akka.http.javadsl.server.PathMatcher2))​([PathMatcher2](PathMatcher2.html "class in akka.http.javadsl.server")<N1,​N2> next)` |  |
	| `[PathMatcher16](PathMatcher16.html "class in akka.http.javadsl.server")<[T1](PathMatcher16.html "type parameter in PathMatcher16"),​[T2](PathMatcher16.html "type parameter in PathMatcher16"),​[T3](PathMatcher16.html "type parameter in PathMatcher16"),​[T4](PathMatcher16.html "type parameter in PathMatcher16"),​[T5](PathMatcher16.html "type parameter in PathMatcher16"),​[T6](PathMatcher16.html "type parameter in PathMatcher16"),​[T7](PathMatcher16.html "type parameter in PathMatcher16"),​[T8](PathMatcher16.html "type parameter in PathMatcher16"),​[T9](PathMatcher16.html "type parameter in PathMatcher16"),​[T10](PathMatcher16.html "type parameter in PathMatcher16"),​[T11](PathMatcher16.html "type parameter in PathMatcher16"),​[T12](PathMatcher16.html "type parameter in PathMatcher16"),​[T13](PathMatcher16.html "type parameter in PathMatcher16"),​[T14](PathMatcher16.html "type parameter in PathMatcher16"),​[T15](PathMatcher16.html "type parameter in PathMatcher16"),​[T16](PathMatcher16.html "type parameter in PathMatcher16")>` | `[concat](#concat(java.lang.String))​(java.lang.String segment)` |  |
	| `[PathMatcher0](PathMatcher0.html "class in akka.http.javadsl.server")` | `[invert](#invert())()` |  |
	| `[PathMatcher16](PathMatcher16.html "class in akka.http.javadsl.server")<[T1](PathMatcher16.html "type parameter in PathMatcher16"),​[T2](PathMatcher16.html "type parameter in PathMatcher16"),​[T3](PathMatcher16.html "type parameter in PathMatcher16"),​[T4](PathMatcher16.html "type parameter in PathMatcher16"),​[T5](PathMatcher16.html "type parameter in PathMatcher16"),​[T6](PathMatcher16.html "type parameter in PathMatcher16"),​[T7](PathMatcher16.html "type parameter in PathMatcher16"),​[T8](PathMatcher16.html "type parameter in PathMatcher16"),​[T9](PathMatcher16.html "type parameter in PathMatcher16"),​[T10](PathMatcher16.html "type parameter in PathMatcher16"),​[T11](PathMatcher16.html "type parameter in PathMatcher16"),​[T12](PathMatcher16.html "type parameter in PathMatcher16"),​[T13](PathMatcher16.html "type parameter in PathMatcher16"),​[T14](PathMatcher16.html "type parameter in PathMatcher16"),​[T15](PathMatcher16.html "type parameter in PathMatcher16"),​[T16](PathMatcher16.html "type parameter in PathMatcher16")>` | `[orElse](#orElse(akka.http.javadsl.server.PathMatcher16))​([PathMatcher16](PathMatcher16.html "class in akka.http.javadsl.server")<[T1](PathMatcher16.html "type parameter in PathMatcher16"),​[T2](PathMatcher16.html "type parameter in PathMatcher16"),​[T3](PathMatcher16.html "type parameter in PathMatcher16"),​[T4](PathMatcher16.html "type parameter in PathMatcher16"),​[T5](PathMatcher16.html "type parameter in PathMatcher16"),​[T6](PathMatcher16.html "type parameter in PathMatcher16"),​[T7](PathMatcher16.html "type parameter in PathMatcher16"),​[T8](PathMatcher16.html "type parameter in PathMatcher16"),​[T9](PathMatcher16.html "type parameter in PathMatcher16"),​[T10](PathMatcher16.html "type parameter in PathMatcher16"),​[T11](PathMatcher16.html "type parameter in PathMatcher16"),​[T12](PathMatcher16.html "type parameter in PathMatcher16"),​[T13](PathMatcher16.html "type parameter in PathMatcher16"),​[T14](PathMatcher16.html "type parameter in PathMatcher16"),​[T15](PathMatcher16.html "type parameter in PathMatcher16"),​[T16](PathMatcher16.html "type parameter in PathMatcher16")> alternative)` |  |
	| `[PathMatcher16](PathMatcher16.html "class in akka.http.javadsl.server")<[T1](PathMatcher16.html "type parameter in PathMatcher16"),​[T2](PathMatcher16.html "type parameter in PathMatcher16"),​[T3](PathMatcher16.html "type parameter in PathMatcher16"),​[T4](PathMatcher16.html "type parameter in PathMatcher16"),​[T5](PathMatcher16.html "type parameter in PathMatcher16"),​[T6](PathMatcher16.html "type parameter in PathMatcher16"),​[T7](PathMatcher16.html "type parameter in PathMatcher16"),​[T8](PathMatcher16.html "type parameter in PathMatcher16"),​[T9](PathMatcher16.html "type parameter in PathMatcher16"),​[T10](PathMatcher16.html "type parameter in PathMatcher16"),​[T11](PathMatcher16.html "type parameter in PathMatcher16"),​[T12](PathMatcher16.html "type parameter in PathMatcher16"),​[T13](PathMatcher16.html "type parameter in PathMatcher16"),​[T14](PathMatcher16.html "type parameter in PathMatcher16"),​[T15](PathMatcher16.html "type parameter in PathMatcher16"),​[T16](PathMatcher16.html "type parameter in PathMatcher16")>` | `[slash](#slash())()` |  |
	| `[PathMatcher16](PathMatcher16.html "class in akka.http.javadsl.server")<[T1](PathMatcher16.html "type parameter in PathMatcher16"),​[T2](PathMatcher16.html "type parameter in PathMatcher16"),​[T3](PathMatcher16.html "type parameter in PathMatcher16"),​[T4](PathMatcher16.html "type parameter in PathMatcher16"),​[T5](PathMatcher16.html "type parameter in PathMatcher16"),​[T6](PathMatcher16.html "type parameter in PathMatcher16"),​[T7](PathMatcher16.html "type parameter in PathMatcher16"),​[T8](PathMatcher16.html "type parameter in PathMatcher16"),​[T9](PathMatcher16.html "type parameter in PathMatcher16"),​[T10](PathMatcher16.html "type parameter in PathMatcher16"),​[T11](PathMatcher16.html "type parameter in PathMatcher16"),​[T12](PathMatcher16.html "type parameter in PathMatcher16"),​[T13](PathMatcher16.html "type parameter in PathMatcher16"),​[T14](PathMatcher16.html "type parameter in PathMatcher16"),​[T15](PathMatcher16.html "type parameter in PathMatcher16"),​[T16](PathMatcher16.html "type parameter in PathMatcher16")>` | `[slash](#slash(akka.http.javadsl.server.PathMatcher0))​([PathMatcher0](PathMatcher0.html "class in akka.http.javadsl.server") next)` |  |
	| `<N> [PathMatcher17](PathMatcher17.html "class in akka.http.javadsl.server")<[T1](PathMatcher16.html "type parameter in PathMatcher16"),​[T2](PathMatcher16.html "type parameter in PathMatcher16"),​[T3](PathMatcher16.html "type parameter in PathMatcher16"),​[T4](PathMatcher16.html "type parameter in PathMatcher16"),​[T5](PathMatcher16.html "type parameter in PathMatcher16"),​[T6](PathMatcher16.html "type parameter in PathMatcher16"),​[T7](PathMatcher16.html "type parameter in PathMatcher16"),​[T8](PathMatcher16.html "type parameter in PathMatcher16"),​[T9](PathMatcher16.html "type parameter in PathMatcher16"),​[T10](PathMatcher16.html "type parameter in PathMatcher16"),​[T11](PathMatcher16.html "type parameter in PathMatcher16"),​[T12](PathMatcher16.html "type parameter in PathMatcher16"),​[T13](PathMatcher16.html "type parameter in PathMatcher16"),​[T14](PathMatcher16.html "type parameter in PathMatcher16"),​[T15](PathMatcher16.html "type parameter in PathMatcher16"),​[T16](PathMatcher16.html "type parameter in PathMatcher16"),​N>` | `[slash](#slash(akka.http.javadsl.server.PathMatcher1))​([PathMatcher1](PathMatcher1.html "class in akka.http.javadsl.server")<N> next)` |  |
	| `<N1,​N2>[PathMatcher18](PathMatcher18.html "class in akka.http.javadsl.server")<[T1](PathMatcher16.html "type parameter in PathMatcher16"),​[T2](PathMatcher16.html "type parameter in PathMatcher16"),​[T3](PathMatcher16.html "type parameter in PathMatcher16"),​[T4](PathMatcher16.html "type parameter in PathMatcher16"),​[T5](PathMatcher16.html "type parameter in PathMatcher16"),​[T6](PathMatcher16.html "type parameter in PathMatcher16"),​[T7](PathMatcher16.html "type parameter in PathMatcher16"),​[T8](PathMatcher16.html "type parameter in PathMatcher16"),​[T9](PathMatcher16.html "type parameter in PathMatcher16"),​[T10](PathMatcher16.html "type parameter in PathMatcher16"),​[T11](PathMatcher16.html "type parameter in PathMatcher16"),​[T12](PathMatcher16.html "type parameter in PathMatcher16"),​[T13](PathMatcher16.html "type parameter in PathMatcher16"),​[T14](PathMatcher16.html "type parameter in PathMatcher16"),​[T15](PathMatcher16.html "type parameter in PathMatcher16"),​[T16](PathMatcher16.html "type parameter in PathMatcher16"),​N1,​N2>` | `[slash](#slash(akka.http.javadsl.server.PathMatcher2))​([PathMatcher2](PathMatcher2.html "class in akka.http.javadsl.server")<N1,​N2> next)` |  |
	| `[PathMatcher16](PathMatcher16.html "class in akka.http.javadsl.server")<[T1](PathMatcher16.html "type parameter in PathMatcher16"),​[T2](PathMatcher16.html "type parameter in PathMatcher16"),​[T3](PathMatcher16.html "type parameter in PathMatcher16"),​[T4](PathMatcher16.html "type parameter in PathMatcher16"),​[T5](PathMatcher16.html "type parameter in PathMatcher16"),​[T6](PathMatcher16.html "type parameter in PathMatcher16"),​[T7](PathMatcher16.html "type parameter in PathMatcher16"),​[T8](PathMatcher16.html "type parameter in PathMatcher16"),​[T9](PathMatcher16.html "type parameter in PathMatcher16"),​[T10](PathMatcher16.html "type parameter in PathMatcher16"),​[T11](PathMatcher16.html "type parameter in PathMatcher16"),​[T12](PathMatcher16.html "type parameter in PathMatcher16"),​[T13](PathMatcher16.html "type parameter in PathMatcher16"),​[T14](PathMatcher16.html "type parameter in PathMatcher16"),​[T15](PathMatcher16.html "type parameter in PathMatcher16"),​[T16](PathMatcher16.html "type parameter in PathMatcher16")>` | `[slash](#slash(java.lang.String))​(java.lang.String segment)` |  |
	| `[PathMatcher](../../scaladsl/server/PathMatcher.html "class in akka.http.scaladsl.server")<scala.Tuple16<[T1](PathMatcher16.html "type parameter in PathMatcher16"),​[T2](PathMatcher16.html "type parameter in PathMatcher16"),​[T3](PathMatcher16.html "type parameter in PathMatcher16"),​[T4](PathMatcher16.html "type parameter in PathMatcher16"),​[T5](PathMatcher16.html "type parameter in PathMatcher16"),​[T6](PathMatcher16.html "type parameter in PathMatcher16"),​[T7](PathMatcher16.html "type parameter in PathMatcher16"),​[T8](PathMatcher16.html "type parameter in PathMatcher16"),​[T9](PathMatcher16.html "type parameter in PathMatcher16"),​[T10](PathMatcher16.html "type parameter in PathMatcher16"),​[T11](PathMatcher16.html "type parameter in PathMatcher16"),​[T12](PathMatcher16.html "type parameter in PathMatcher16"),​[T13](PathMatcher16.html "type parameter in PathMatcher16"),​[T14](PathMatcher16.html "type parameter in PathMatcher16"),​[T15](PathMatcher16.html "type parameter in PathMatcher16"),​[T16](PathMatcher16.html "type parameter in PathMatcher16")>>` | `[toScala](#toScala())()` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### PathMatcher16
		
		
		
		```
		public PathMatcher16​([PathMatcher](../../scaladsl/server/PathMatcher.html "class in akka.http.scaladsl.server")<scala.Tuple16<[T1](PathMatcher16.html "type parameter in PathMatcher16"),​[T2](PathMatcher16.html "type parameter in PathMatcher16"),​[T3](PathMatcher16.html "type parameter in PathMatcher16"),​[T4](PathMatcher16.html "type parameter in PathMatcher16"),​[T5](PathMatcher16.html "type parameter in PathMatcher16"),​[T6](PathMatcher16.html "type parameter in PathMatcher16"),​[T7](PathMatcher16.html "type parameter in PathMatcher16"),​[T8](PathMatcher16.html "type parameter in PathMatcher16"),​[T9](PathMatcher16.html "type parameter in PathMatcher16"),​[T10](PathMatcher16.html "type parameter in PathMatcher16"),​[T11](PathMatcher16.html "type parameter in PathMatcher16"),​[T12](PathMatcher16.html "type parameter in PathMatcher16"),​[T13](PathMatcher16.html "type parameter in PathMatcher16"),​[T14](PathMatcher16.html "type parameter in PathMatcher16"),​[T15](PathMatcher16.html "type parameter in PathMatcher16"),​[T16](PathMatcher16.html "type parameter in PathMatcher16")>> toScala)
		```

	- ### Method Detail
	
	
	
		- #### concat
		
		
		
		```
		public [PathMatcher16](PathMatcher16.html "class in akka.http.javadsl.server")<[T1](PathMatcher16.html "type parameter in PathMatcher16"),​[T2](PathMatcher16.html "type parameter in PathMatcher16"),​[T3](PathMatcher16.html "type parameter in PathMatcher16"),​[T4](PathMatcher16.html "type parameter in PathMatcher16"),​[T5](PathMatcher16.html "type parameter in PathMatcher16"),​[T6](PathMatcher16.html "type parameter in PathMatcher16"),​[T7](PathMatcher16.html "type parameter in PathMatcher16"),​[T8](PathMatcher16.html "type parameter in PathMatcher16"),​[T9](PathMatcher16.html "type parameter in PathMatcher16"),​[T10](PathMatcher16.html "type parameter in PathMatcher16"),​[T11](PathMatcher16.html "type parameter in PathMatcher16"),​[T12](PathMatcher16.html "type parameter in PathMatcher16"),​[T13](PathMatcher16.html "type parameter in PathMatcher16"),​[T14](PathMatcher16.html "type parameter in PathMatcher16"),​[T15](PathMatcher16.html "type parameter in PathMatcher16"),​[T16](PathMatcher16.html "type parameter in PathMatcher16")> concat​(java.lang.String segment)
		```
		- #### concat
		
		
		
		```
		public [PathMatcher16](PathMatcher16.html "class in akka.http.javadsl.server")<[T1](PathMatcher16.html "type parameter in PathMatcher16"),​[T2](PathMatcher16.html "type parameter in PathMatcher16"),​[T3](PathMatcher16.html "type parameter in PathMatcher16"),​[T4](PathMatcher16.html "type parameter in PathMatcher16"),​[T5](PathMatcher16.html "type parameter in PathMatcher16"),​[T6](PathMatcher16.html "type parameter in PathMatcher16"),​[T7](PathMatcher16.html "type parameter in PathMatcher16"),​[T8](PathMatcher16.html "type parameter in PathMatcher16"),​[T9](PathMatcher16.html "type parameter in PathMatcher16"),​[T10](PathMatcher16.html "type parameter in PathMatcher16"),​[T11](PathMatcher16.html "type parameter in PathMatcher16"),​[T12](PathMatcher16.html "type parameter in PathMatcher16"),​[T13](PathMatcher16.html "type parameter in PathMatcher16"),​[T14](PathMatcher16.html "type parameter in PathMatcher16"),​[T15](PathMatcher16.html "type parameter in PathMatcher16"),​[T16](PathMatcher16.html "type parameter in PathMatcher16")> concat​([PathMatcher0](PathMatcher0.html "class in akka.http.javadsl.server") next)
		```
		- #### concat
		
		
		
		```
		public <N> [PathMatcher17](PathMatcher17.html "class in akka.http.javadsl.server")<[T1](PathMatcher16.html "type parameter in PathMatcher16"),​[T2](PathMatcher16.html "type parameter in PathMatcher16"),​[T3](PathMatcher16.html "type parameter in PathMatcher16"),​[T4](PathMatcher16.html "type parameter in PathMatcher16"),​[T5](PathMatcher16.html "type parameter in PathMatcher16"),​[T6](PathMatcher16.html "type parameter in PathMatcher16"),​[T7](PathMatcher16.html "type parameter in PathMatcher16"),​[T8](PathMatcher16.html "type parameter in PathMatcher16"),​[T9](PathMatcher16.html "type parameter in PathMatcher16"),​[T10](PathMatcher16.html "type parameter in PathMatcher16"),​[T11](PathMatcher16.html "type parameter in PathMatcher16"),​[T12](PathMatcher16.html "type parameter in PathMatcher16"),​[T13](PathMatcher16.html "type parameter in PathMatcher16"),​[T14](PathMatcher16.html "type parameter in PathMatcher16"),​[T15](PathMatcher16.html "type parameter in PathMatcher16"),​[T16](PathMatcher16.html "type parameter in PathMatcher16"),​N> concat​([PathMatcher1](PathMatcher1.html "class in akka.http.javadsl.server")<N> next)
		```
		- #### concat
		
		
		
		```
		public <N1,​N2> [PathMatcher18](PathMatcher18.html "class in akka.http.javadsl.server")<[T1](PathMatcher16.html "type parameter in PathMatcher16"),​[T2](PathMatcher16.html "type parameter in PathMatcher16"),​[T3](PathMatcher16.html "type parameter in PathMatcher16"),​[T4](PathMatcher16.html "type parameter in PathMatcher16"),​[T5](PathMatcher16.html "type parameter in PathMatcher16"),​[T6](PathMatcher16.html "type parameter in PathMatcher16"),​[T7](PathMatcher16.html "type parameter in PathMatcher16"),​[T8](PathMatcher16.html "type parameter in PathMatcher16"),​[T9](PathMatcher16.html "type parameter in PathMatcher16"),​[T10](PathMatcher16.html "type parameter in PathMatcher16"),​[T11](PathMatcher16.html "type parameter in PathMatcher16"),​[T12](PathMatcher16.html "type parameter in PathMatcher16"),​[T13](PathMatcher16.html "type parameter in PathMatcher16"),​[T14](PathMatcher16.html "type parameter in PathMatcher16"),​[T15](PathMatcher16.html "type parameter in PathMatcher16"),​[T16](PathMatcher16.html "type parameter in PathMatcher16"),​N1,​N2> concat​([PathMatcher2](PathMatcher2.html "class in akka.http.javadsl.server")<N1,​N2> next)
		```
		- #### invert
		
		
		
		```
		public [PathMatcher0](PathMatcher0.html "class in akka.http.javadsl.server") invert()
		```
		- #### orElse
		
		
		
		```
		public [PathMatcher16](PathMatcher16.html "class in akka.http.javadsl.server")<[T1](PathMatcher16.html "type parameter in PathMatcher16"),​[T2](PathMatcher16.html "type parameter in PathMatcher16"),​[T3](PathMatcher16.html "type parameter in PathMatcher16"),​[T4](PathMatcher16.html "type parameter in PathMatcher16"),​[T5](PathMatcher16.html "type parameter in PathMatcher16"),​[T6](PathMatcher16.html "type parameter in PathMatcher16"),​[T7](PathMatcher16.html "type parameter in PathMatcher16"),​[T8](PathMatcher16.html "type parameter in PathMatcher16"),​[T9](PathMatcher16.html "type parameter in PathMatcher16"),​[T10](PathMatcher16.html "type parameter in PathMatcher16"),​[T11](PathMatcher16.html "type parameter in PathMatcher16"),​[T12](PathMatcher16.html "type parameter in PathMatcher16"),​[T13](PathMatcher16.html "type parameter in PathMatcher16"),​[T14](PathMatcher16.html "type parameter in PathMatcher16"),​[T15](PathMatcher16.html "type parameter in PathMatcher16"),​[T16](PathMatcher16.html "type parameter in PathMatcher16")> orElse​([PathMatcher16](PathMatcher16.html "class in akka.http.javadsl.server")<[T1](PathMatcher16.html "type parameter in PathMatcher16"),​[T2](PathMatcher16.html "type parameter in PathMatcher16"),​[T3](PathMatcher16.html "type parameter in PathMatcher16"),​[T4](PathMatcher16.html "type parameter in PathMatcher16"),​[T5](PathMatcher16.html "type parameter in PathMatcher16"),​[T6](PathMatcher16.html "type parameter in PathMatcher16"),​[T7](PathMatcher16.html "type parameter in PathMatcher16"),​[T8](PathMatcher16.html "type parameter in PathMatcher16"),​[T9](PathMatcher16.html "type parameter in PathMatcher16"),​[T10](PathMatcher16.html "type parameter in PathMatcher16"),​[T11](PathMatcher16.html "type parameter in PathMatcher16"),​[T12](PathMatcher16.html "type parameter in PathMatcher16"),​[T13](PathMatcher16.html "type parameter in PathMatcher16"),​[T14](PathMatcher16.html "type parameter in PathMatcher16"),​[T15](PathMatcher16.html "type parameter in PathMatcher16"),​[T16](PathMatcher16.html "type parameter in PathMatcher16")> alternative)
		```
		- #### slash
		
		
		
		```
		public [PathMatcher16](PathMatcher16.html "class in akka.http.javadsl.server")<[T1](PathMatcher16.html "type parameter in PathMatcher16"),​[T2](PathMatcher16.html "type parameter in PathMatcher16"),​[T3](PathMatcher16.html "type parameter in PathMatcher16"),​[T4](PathMatcher16.html "type parameter in PathMatcher16"),​[T5](PathMatcher16.html "type parameter in PathMatcher16"),​[T6](PathMatcher16.html "type parameter in PathMatcher16"),​[T7](PathMatcher16.html "type parameter in PathMatcher16"),​[T8](PathMatcher16.html "type parameter in PathMatcher16"),​[T9](PathMatcher16.html "type parameter in PathMatcher16"),​[T10](PathMatcher16.html "type parameter in PathMatcher16"),​[T11](PathMatcher16.html "type parameter in PathMatcher16"),​[T12](PathMatcher16.html "type parameter in PathMatcher16"),​[T13](PathMatcher16.html "type parameter in PathMatcher16"),​[T14](PathMatcher16.html "type parameter in PathMatcher16"),​[T15](PathMatcher16.html "type parameter in PathMatcher16"),​[T16](PathMatcher16.html "type parameter in PathMatcher16")> slash()
		```
		- #### slash
		
		
		
		```
		public [PathMatcher16](PathMatcher16.html "class in akka.http.javadsl.server")<[T1](PathMatcher16.html "type parameter in PathMatcher16"),​[T2](PathMatcher16.html "type parameter in PathMatcher16"),​[T3](PathMatcher16.html "type parameter in PathMatcher16"),​[T4](PathMatcher16.html "type parameter in PathMatcher16"),​[T5](PathMatcher16.html "type parameter in PathMatcher16"),​[T6](PathMatcher16.html "type parameter in PathMatcher16"),​[T7](PathMatcher16.html "type parameter in PathMatcher16"),​[T8](PathMatcher16.html "type parameter in PathMatcher16"),​[T9](PathMatcher16.html "type parameter in PathMatcher16"),​[T10](PathMatcher16.html "type parameter in PathMatcher16"),​[T11](PathMatcher16.html "type parameter in PathMatcher16"),​[T12](PathMatcher16.html "type parameter in PathMatcher16"),​[T13](PathMatcher16.html "type parameter in PathMatcher16"),​[T14](PathMatcher16.html "type parameter in PathMatcher16"),​[T15](PathMatcher16.html "type parameter in PathMatcher16"),​[T16](PathMatcher16.html "type parameter in PathMatcher16")> slash​(java.lang.String segment)
		```
		- #### slash
		
		
		
		```
		public [PathMatcher16](PathMatcher16.html "class in akka.http.javadsl.server")<[T1](PathMatcher16.html "type parameter in PathMatcher16"),​[T2](PathMatcher16.html "type parameter in PathMatcher16"),​[T3](PathMatcher16.html "type parameter in PathMatcher16"),​[T4](PathMatcher16.html "type parameter in PathMatcher16"),​[T5](PathMatcher16.html "type parameter in PathMatcher16"),​[T6](PathMatcher16.html "type parameter in PathMatcher16"),​[T7](PathMatcher16.html "type parameter in PathMatcher16"),​[T8](PathMatcher16.html "type parameter in PathMatcher16"),​[T9](PathMatcher16.html "type parameter in PathMatcher16"),​[T10](PathMatcher16.html "type parameter in PathMatcher16"),​[T11](PathMatcher16.html "type parameter in PathMatcher16"),​[T12](PathMatcher16.html "type parameter in PathMatcher16"),​[T13](PathMatcher16.html "type parameter in PathMatcher16"),​[T14](PathMatcher16.html "type parameter in PathMatcher16"),​[T15](PathMatcher16.html "type parameter in PathMatcher16"),​[T16](PathMatcher16.html "type parameter in PathMatcher16")> slash​([PathMatcher0](PathMatcher0.html "class in akka.http.javadsl.server") next)
		```
		- #### slash
		
		
		
		```
		public <N> [PathMatcher17](PathMatcher17.html "class in akka.http.javadsl.server")<[T1](PathMatcher16.html "type parameter in PathMatcher16"),​[T2](PathMatcher16.html "type parameter in PathMatcher16"),​[T3](PathMatcher16.html "type parameter in PathMatcher16"),​[T4](PathMatcher16.html "type parameter in PathMatcher16"),​[T5](PathMatcher16.html "type parameter in PathMatcher16"),​[T6](PathMatcher16.html "type parameter in PathMatcher16"),​[T7](PathMatcher16.html "type parameter in PathMatcher16"),​[T8](PathMatcher16.html "type parameter in PathMatcher16"),​[T9](PathMatcher16.html "type parameter in PathMatcher16"),​[T10](PathMatcher16.html "type parameter in PathMatcher16"),​[T11](PathMatcher16.html "type parameter in PathMatcher16"),​[T12](PathMatcher16.html "type parameter in PathMatcher16"),​[T13](PathMatcher16.html "type parameter in PathMatcher16"),​[T14](PathMatcher16.html "type parameter in PathMatcher16"),​[T15](PathMatcher16.html "type parameter in PathMatcher16"),​[T16](PathMatcher16.html "type parameter in PathMatcher16"),​N> slash​([PathMatcher1](PathMatcher1.html "class in akka.http.javadsl.server")<N> next)
		```
		- #### slash
		
		
		
		```
		public <N1,​N2> [PathMatcher18](PathMatcher18.html "class in akka.http.javadsl.server")<[T1](PathMatcher16.html "type parameter in PathMatcher16"),​[T2](PathMatcher16.html "type parameter in PathMatcher16"),​[T3](PathMatcher16.html "type parameter in PathMatcher16"),​[T4](PathMatcher16.html "type parameter in PathMatcher16"),​[T5](PathMatcher16.html "type parameter in PathMatcher16"),​[T6](PathMatcher16.html "type parameter in PathMatcher16"),​[T7](PathMatcher16.html "type parameter in PathMatcher16"),​[T8](PathMatcher16.html "type parameter in PathMatcher16"),​[T9](PathMatcher16.html "type parameter in PathMatcher16"),​[T10](PathMatcher16.html "type parameter in PathMatcher16"),​[T11](PathMatcher16.html "type parameter in PathMatcher16"),​[T12](PathMatcher16.html "type parameter in PathMatcher16"),​[T13](PathMatcher16.html "type parameter in PathMatcher16"),​[T14](PathMatcher16.html "type parameter in PathMatcher16"),​[T15](PathMatcher16.html "type parameter in PathMatcher16"),​[T16](PathMatcher16.html "type parameter in PathMatcher16"),​N1,​N2> slash​([PathMatcher2](PathMatcher2.html "class in akka.http.javadsl.server")<N1,​N2> next)
		```
		- #### toScala
		
		
		
		```
		public [PathMatcher](../../scaladsl/server/PathMatcher.html "class in akka.http.scaladsl.server")<scala.Tuple16<[T1](PathMatcher16.html "type parameter in PathMatcher16"),​[T2](PathMatcher16.html "type parameter in PathMatcher16"),​[T3](PathMatcher16.html "type parameter in PathMatcher16"),​[T4](PathMatcher16.html "type parameter in PathMatcher16"),​[T5](PathMatcher16.html "type parameter in PathMatcher16"),​[T6](PathMatcher16.html "type parameter in PathMatcher16"),​[T7](PathMatcher16.html "type parameter in PathMatcher16"),​[T8](PathMatcher16.html "type parameter in PathMatcher16"),​[T9](PathMatcher16.html "type parameter in PathMatcher16"),​[T10](PathMatcher16.html "type parameter in PathMatcher16"),​[T11](PathMatcher16.html "type parameter in PathMatcher16"),​[T12](PathMatcher16.html "type parameter in PathMatcher16"),​[T13](PathMatcher16.html "type parameter in PathMatcher16"),​[T14](PathMatcher16.html "type parameter in PathMatcher16"),​[T15](PathMatcher16.html "type parameter in PathMatcher16"),​[T16](PathMatcher16.html "type parameter in PathMatcher16")>> toScala()
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/server/PathMatcher0.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/server/PathMatcher1.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/server/PathMatcher16.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/server/PathMatcher17.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/server/PathMatcher18.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/server/PathMatcher2.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/server/package-summary.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/PathMatcher.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/server/PathMatcher16.html](https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/server/PathMatcher16.html)*