---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T02:09:12Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/PathMatcher13.html
title: PathMatcher13
---

# PathMatcher13

## Content

Package [akka.http.javadsl.server](package-summary.html)
## Class PathMatcher13\<T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11,​T12,​T13\>

- java.lang.Object
- - akka.http.javadsl.server.PathMatcher13\<T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11,​T12,​T13\>

- ---

```
public final class PathMatcher13<T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11,​T12,​T13>
extends java.lang.Object
```

A PathMatcher tries to match a prefix of a given string and returns either a PathMatcher.Matched instance
 if matched, otherwise PathMatchers.Unmatched.

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[PathMatcher13](#%3Cinit%3E(akka.http.scaladsl.server.PathMatcher))​([PathMatcher](../../scaladsl/server/PathMatcher.html "class in akka.http.scaladsl.server")<scala.Tuple13<[T1](PathMatcher13.html "type parameter in PathMatcher13"),​[T2](PathMatcher13.html "type parameter in PathMatcher13"),​[T3](PathMatcher13.html "type parameter in PathMatcher13"),​[T4](PathMatcher13.html "type parameter in PathMatcher13"),​[T5](PathMatcher13.html "type parameter in PathMatcher13"),​[T6](PathMatcher13.html "type parameter in PathMatcher13"),​[T7](PathMatcher13.html "type parameter in PathMatcher13"),​[T8](PathMatcher13.html "type parameter in PathMatcher13"),​[T9](PathMatcher13.html "type parameter in PathMatcher13"),​[T10](PathMatcher13.html "type parameter in PathMatcher13"),​[T11](PathMatcher13.html "type parameter in PathMatcher13"),​[T12](PathMatcher13.html "type parameter in PathMatcher13"),​[T13](PathMatcher13.html "type parameter in PathMatcher13")>> toScala)` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[PathMatcher13](PathMatcher13.html "class in akka.http.javadsl.server")<[T1](PathMatcher13.html "type parameter in PathMatcher13"),​[T2](PathMatcher13.html "type parameter in PathMatcher13"),​[T3](PathMatcher13.html "type parameter in PathMatcher13"),​[T4](PathMatcher13.html "type parameter in PathMatcher13"),​[T5](PathMatcher13.html "type parameter in PathMatcher13"),​[T6](PathMatcher13.html "type parameter in PathMatcher13"),​[T7](PathMatcher13.html "type parameter in PathMatcher13"),​[T8](PathMatcher13.html "type parameter in PathMatcher13"),​[T9](PathMatcher13.html "type parameter in PathMatcher13"),​[T10](PathMatcher13.html "type parameter in PathMatcher13"),​[T11](PathMatcher13.html "type parameter in PathMatcher13"),​[T12](PathMatcher13.html "type parameter in PathMatcher13"),​[T13](PathMatcher13.html "type parameter in PathMatcher13")>` | `[concat](#concat(akka.http.javadsl.server.PathMatcher0))​([PathMatcher0](PathMatcher0.html "class in akka.http.javadsl.server") next)` |  |
	| `<N> [PathMatcher14](PathMatcher14.html "class in akka.http.javadsl.server")<[T1](PathMatcher13.html "type parameter in PathMatcher13"),​[T2](PathMatcher13.html "type parameter in PathMatcher13"),​[T3](PathMatcher13.html "type parameter in PathMatcher13"),​[T4](PathMatcher13.html "type parameter in PathMatcher13"),​[T5](PathMatcher13.html "type parameter in PathMatcher13"),​[T6](PathMatcher13.html "type parameter in PathMatcher13"),​[T7](PathMatcher13.html "type parameter in PathMatcher13"),​[T8](PathMatcher13.html "type parameter in PathMatcher13"),​[T9](PathMatcher13.html "type parameter in PathMatcher13"),​[T10](PathMatcher13.html "type parameter in PathMatcher13"),​[T11](PathMatcher13.html "type parameter in PathMatcher13"),​[T12](PathMatcher13.html "type parameter in PathMatcher13"),​[T13](PathMatcher13.html "type parameter in PathMatcher13"),​N>` | `[concat](#concat(akka.http.javadsl.server.PathMatcher1))​([PathMatcher1](PathMatcher1.html "class in akka.http.javadsl.server")<N> next)` |  |
	| `<N1,​N2>[PathMatcher15](PathMatcher15.html "class in akka.http.javadsl.server")<[T1](PathMatcher13.html "type parameter in PathMatcher13"),​[T2](PathMatcher13.html "type parameter in PathMatcher13"),​[T3](PathMatcher13.html "type parameter in PathMatcher13"),​[T4](PathMatcher13.html "type parameter in PathMatcher13"),​[T5](PathMatcher13.html "type parameter in PathMatcher13"),​[T6](PathMatcher13.html "type parameter in PathMatcher13"),​[T7](PathMatcher13.html "type parameter in PathMatcher13"),​[T8](PathMatcher13.html "type parameter in PathMatcher13"),​[T9](PathMatcher13.html "type parameter in PathMatcher13"),​[T10](PathMatcher13.html "type parameter in PathMatcher13"),​[T11](PathMatcher13.html "type parameter in PathMatcher13"),​[T12](PathMatcher13.html "type parameter in PathMatcher13"),​[T13](PathMatcher13.html "type parameter in PathMatcher13"),​N1,​N2>` | `[concat](#concat(akka.http.javadsl.server.PathMatcher2))​([PathMatcher2](PathMatcher2.html "class in akka.http.javadsl.server")<N1,​N2> next)` |  |
	| `[PathMatcher13](PathMatcher13.html "class in akka.http.javadsl.server")<[T1](PathMatcher13.html "type parameter in PathMatcher13"),​[T2](PathMatcher13.html "type parameter in PathMatcher13"),​[T3](PathMatcher13.html "type parameter in PathMatcher13"),​[T4](PathMatcher13.html "type parameter in PathMatcher13"),​[T5](PathMatcher13.html "type parameter in PathMatcher13"),​[T6](PathMatcher13.html "type parameter in PathMatcher13"),​[T7](PathMatcher13.html "type parameter in PathMatcher13"),​[T8](PathMatcher13.html "type parameter in PathMatcher13"),​[T9](PathMatcher13.html "type parameter in PathMatcher13"),​[T10](PathMatcher13.html "type parameter in PathMatcher13"),​[T11](PathMatcher13.html "type parameter in PathMatcher13"),​[T12](PathMatcher13.html "type parameter in PathMatcher13"),​[T13](PathMatcher13.html "type parameter in PathMatcher13")>` | `[concat](#concat(java.lang.String))​(java.lang.String segment)` |  |
	| `[PathMatcher0](PathMatcher0.html "class in akka.http.javadsl.server")` | `[invert](#invert())()` |  |
	| `[PathMatcher13](PathMatcher13.html "class in akka.http.javadsl.server")<[T1](PathMatcher13.html "type parameter in PathMatcher13"),​[T2](PathMatcher13.html "type parameter in PathMatcher13"),​[T3](PathMatcher13.html "type parameter in PathMatcher13"),​[T4](PathMatcher13.html "type parameter in PathMatcher13"),​[T5](PathMatcher13.html "type parameter in PathMatcher13"),​[T6](PathMatcher13.html "type parameter in PathMatcher13"),​[T7](PathMatcher13.html "type parameter in PathMatcher13"),​[T8](PathMatcher13.html "type parameter in PathMatcher13"),​[T9](PathMatcher13.html "type parameter in PathMatcher13"),​[T10](PathMatcher13.html "type parameter in PathMatcher13"),​[T11](PathMatcher13.html "type parameter in PathMatcher13"),​[T12](PathMatcher13.html "type parameter in PathMatcher13"),​[T13](PathMatcher13.html "type parameter in PathMatcher13")>` | `[orElse](#orElse(akka.http.javadsl.server.PathMatcher13))​([PathMatcher13](PathMatcher13.html "class in akka.http.javadsl.server")<[T1](PathMatcher13.html "type parameter in PathMatcher13"),​[T2](PathMatcher13.html "type parameter in PathMatcher13"),​[T3](PathMatcher13.html "type parameter in PathMatcher13"),​[T4](PathMatcher13.html "type parameter in PathMatcher13"),​[T5](PathMatcher13.html "type parameter in PathMatcher13"),​[T6](PathMatcher13.html "type parameter in PathMatcher13"),​[T7](PathMatcher13.html "type parameter in PathMatcher13"),​[T8](PathMatcher13.html "type parameter in PathMatcher13"),​[T9](PathMatcher13.html "type parameter in PathMatcher13"),​[T10](PathMatcher13.html "type parameter in PathMatcher13"),​[T11](PathMatcher13.html "type parameter in PathMatcher13"),​[T12](PathMatcher13.html "type parameter in PathMatcher13"),​[T13](PathMatcher13.html "type parameter in PathMatcher13")> alternative)` |  |
	| `[PathMatcher13](PathMatcher13.html "class in akka.http.javadsl.server")<[T1](PathMatcher13.html "type parameter in PathMatcher13"),​[T2](PathMatcher13.html "type parameter in PathMatcher13"),​[T3](PathMatcher13.html "type parameter in PathMatcher13"),​[T4](PathMatcher13.html "type parameter in PathMatcher13"),​[T5](PathMatcher13.html "type parameter in PathMatcher13"),​[T6](PathMatcher13.html "type parameter in PathMatcher13"),​[T7](PathMatcher13.html "type parameter in PathMatcher13"),​[T8](PathMatcher13.html "type parameter in PathMatcher13"),​[T9](PathMatcher13.html "type parameter in PathMatcher13"),​[T10](PathMatcher13.html "type parameter in PathMatcher13"),​[T11](PathMatcher13.html "type parameter in PathMatcher13"),​[T12](PathMatcher13.html "type parameter in PathMatcher13"),​[T13](PathMatcher13.html "type parameter in PathMatcher13")>` | `[slash](#slash())()` |  |
	| `[PathMatcher13](PathMatcher13.html "class in akka.http.javadsl.server")<[T1](PathMatcher13.html "type parameter in PathMatcher13"),​[T2](PathMatcher13.html "type parameter in PathMatcher13"),​[T3](PathMatcher13.html "type parameter in PathMatcher13"),​[T4](PathMatcher13.html "type parameter in PathMatcher13"),​[T5](PathMatcher13.html "type parameter in PathMatcher13"),​[T6](PathMatcher13.html "type parameter in PathMatcher13"),​[T7](PathMatcher13.html "type parameter in PathMatcher13"),​[T8](PathMatcher13.html "type parameter in PathMatcher13"),​[T9](PathMatcher13.html "type parameter in PathMatcher13"),​[T10](PathMatcher13.html "type parameter in PathMatcher13"),​[T11](PathMatcher13.html "type parameter in PathMatcher13"),​[T12](PathMatcher13.html "type parameter in PathMatcher13"),​[T13](PathMatcher13.html "type parameter in PathMatcher13")>` | `[slash](#slash(akka.http.javadsl.server.PathMatcher0))​([PathMatcher0](PathMatcher0.html "class in akka.http.javadsl.server") next)` |  |
	| `<N> [PathMatcher14](PathMatcher14.html "class in akka.http.javadsl.server")<[T1](PathMatcher13.html "type parameter in PathMatcher13"),​[T2](PathMatcher13.html "type parameter in PathMatcher13"),​[T3](PathMatcher13.html "type parameter in PathMatcher13"),​[T4](PathMatcher13.html "type parameter in PathMatcher13"),​[T5](PathMatcher13.html "type parameter in PathMatcher13"),​[T6](PathMatcher13.html "type parameter in PathMatcher13"),​[T7](PathMatcher13.html "type parameter in PathMatcher13"),​[T8](PathMatcher13.html "type parameter in PathMatcher13"),​[T9](PathMatcher13.html "type parameter in PathMatcher13"),​[T10](PathMatcher13.html "type parameter in PathMatcher13"),​[T11](PathMatcher13.html "type parameter in PathMatcher13"),​[T12](PathMatcher13.html "type parameter in PathMatcher13"),​[T13](PathMatcher13.html "type parameter in PathMatcher13"),​N>` | `[slash](#slash(akka.http.javadsl.server.PathMatcher1))​([PathMatcher1](PathMatcher1.html "class in akka.http.javadsl.server")<N> next)` |  |
	| `<N1,​N2>[PathMatcher15](PathMatcher15.html "class in akka.http.javadsl.server")<[T1](PathMatcher13.html "type parameter in PathMatcher13"),​[T2](PathMatcher13.html "type parameter in PathMatcher13"),​[T3](PathMatcher13.html "type parameter in PathMatcher13"),​[T4](PathMatcher13.html "type parameter in PathMatcher13"),​[T5](PathMatcher13.html "type parameter in PathMatcher13"),​[T6](PathMatcher13.html "type parameter in PathMatcher13"),​[T7](PathMatcher13.html "type parameter in PathMatcher13"),​[T8](PathMatcher13.html "type parameter in PathMatcher13"),​[T9](PathMatcher13.html "type parameter in PathMatcher13"),​[T10](PathMatcher13.html "type parameter in PathMatcher13"),​[T11](PathMatcher13.html "type parameter in PathMatcher13"),​[T12](PathMatcher13.html "type parameter in PathMatcher13"),​[T13](PathMatcher13.html "type parameter in PathMatcher13"),​N1,​N2>` | `[slash](#slash(akka.http.javadsl.server.PathMatcher2))​([PathMatcher2](PathMatcher2.html "class in akka.http.javadsl.server")<N1,​N2> next)` |  |
	| `[PathMatcher13](PathMatcher13.html "class in akka.http.javadsl.server")<[T1](PathMatcher13.html "type parameter in PathMatcher13"),​[T2](PathMatcher13.html "type parameter in PathMatcher13"),​[T3](PathMatcher13.html "type parameter in PathMatcher13"),​[T4](PathMatcher13.html "type parameter in PathMatcher13"),​[T5](PathMatcher13.html "type parameter in PathMatcher13"),​[T6](PathMatcher13.html "type parameter in PathMatcher13"),​[T7](PathMatcher13.html "type parameter in PathMatcher13"),​[T8](PathMatcher13.html "type parameter in PathMatcher13"),​[T9](PathMatcher13.html "type parameter in PathMatcher13"),​[T10](PathMatcher13.html "type parameter in PathMatcher13"),​[T11](PathMatcher13.html "type parameter in PathMatcher13"),​[T12](PathMatcher13.html "type parameter in PathMatcher13"),​[T13](PathMatcher13.html "type parameter in PathMatcher13")>` | `[slash](#slash(java.lang.String))​(java.lang.String segment)` |  |
	| `[PathMatcher](../../scaladsl/server/PathMatcher.html "class in akka.http.scaladsl.server")<scala.Tuple13<[T1](PathMatcher13.html "type parameter in PathMatcher13"),​[T2](PathMatcher13.html "type parameter in PathMatcher13"),​[T3](PathMatcher13.html "type parameter in PathMatcher13"),​[T4](PathMatcher13.html "type parameter in PathMatcher13"),​[T5](PathMatcher13.html "type parameter in PathMatcher13"),​[T6](PathMatcher13.html "type parameter in PathMatcher13"),​[T7](PathMatcher13.html "type parameter in PathMatcher13"),​[T8](PathMatcher13.html "type parameter in PathMatcher13"),​[T9](PathMatcher13.html "type parameter in PathMatcher13"),​[T10](PathMatcher13.html "type parameter in PathMatcher13"),​[T11](PathMatcher13.html "type parameter in PathMatcher13"),​[T12](PathMatcher13.html "type parameter in PathMatcher13"),​[T13](PathMatcher13.html "type parameter in PathMatcher13")>>` | `[toScala](#toScala())()` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### PathMatcher13
		
		
		
		```
		public PathMatcher13​([PathMatcher](../../scaladsl/server/PathMatcher.html "class in akka.http.scaladsl.server")<scala.Tuple13<[T1](PathMatcher13.html "type parameter in PathMatcher13"),​[T2](PathMatcher13.html "type parameter in PathMatcher13"),​[T3](PathMatcher13.html "type parameter in PathMatcher13"),​[T4](PathMatcher13.html "type parameter in PathMatcher13"),​[T5](PathMatcher13.html "type parameter in PathMatcher13"),​[T6](PathMatcher13.html "type parameter in PathMatcher13"),​[T7](PathMatcher13.html "type parameter in PathMatcher13"),​[T8](PathMatcher13.html "type parameter in PathMatcher13"),​[T9](PathMatcher13.html "type parameter in PathMatcher13"),​[T10](PathMatcher13.html "type parameter in PathMatcher13"),​[T11](PathMatcher13.html "type parameter in PathMatcher13"),​[T12](PathMatcher13.html "type parameter in PathMatcher13"),​[T13](PathMatcher13.html "type parameter in PathMatcher13")>> toScala)
		```

	- ### Method Detail
	
	
	
		- #### concat
		
		
		
		```
		public [PathMatcher13](PathMatcher13.html "class in akka.http.javadsl.server")<[T1](PathMatcher13.html "type parameter in PathMatcher13"),​[T2](PathMatcher13.html "type parameter in PathMatcher13"),​[T3](PathMatcher13.html "type parameter in PathMatcher13"),​[T4](PathMatcher13.html "type parameter in PathMatcher13"),​[T5](PathMatcher13.html "type parameter in PathMatcher13"),​[T6](PathMatcher13.html "type parameter in PathMatcher13"),​[T7](PathMatcher13.html "type parameter in PathMatcher13"),​[T8](PathMatcher13.html "type parameter in PathMatcher13"),​[T9](PathMatcher13.html "type parameter in PathMatcher13"),​[T10](PathMatcher13.html "type parameter in PathMatcher13"),​[T11](PathMatcher13.html "type parameter in PathMatcher13"),​[T12](PathMatcher13.html "type parameter in PathMatcher13"),​[T13](PathMatcher13.html "type parameter in PathMatcher13")> concat​(java.lang.String segment)
		```
		- #### concat
		
		
		
		```
		public [PathMatcher13](PathMatcher13.html "class in akka.http.javadsl.server")<[T1](PathMatcher13.html "type parameter in PathMatcher13"),​[T2](PathMatcher13.html "type parameter in PathMatcher13"),​[T3](PathMatcher13.html "type parameter in PathMatcher13"),​[T4](PathMatcher13.html "type parameter in PathMatcher13"),​[T5](PathMatcher13.html "type parameter in PathMatcher13"),​[T6](PathMatcher13.html "type parameter in PathMatcher13"),​[T7](PathMatcher13.html "type parameter in PathMatcher13"),​[T8](PathMatcher13.html "type parameter in PathMatcher13"),​[T9](PathMatcher13.html "type parameter in PathMatcher13"),​[T10](PathMatcher13.html "type parameter in PathMatcher13"),​[T11](PathMatcher13.html "type parameter in PathMatcher13"),​[T12](PathMatcher13.html "type parameter in PathMatcher13"),​[T13](PathMatcher13.html "type parameter in PathMatcher13")> concat​([PathMatcher0](PathMatcher0.html "class in akka.http.javadsl.server") next)
		```
		- #### concat
		
		
		
		```
		public <N> [PathMatcher14](PathMatcher14.html "class in akka.http.javadsl.server")<[T1](PathMatcher13.html "type parameter in PathMatcher13"),​[T2](PathMatcher13.html "type parameter in PathMatcher13"),​[T3](PathMatcher13.html "type parameter in PathMatcher13"),​[T4](PathMatcher13.html "type parameter in PathMatcher13"),​[T5](PathMatcher13.html "type parameter in PathMatcher13"),​[T6](PathMatcher13.html "type parameter in PathMatcher13"),​[T7](PathMatcher13.html "type parameter in PathMatcher13"),​[T8](PathMatcher13.html "type parameter in PathMatcher13"),​[T9](PathMatcher13.html "type parameter in PathMatcher13"),​[T10](PathMatcher13.html "type parameter in PathMatcher13"),​[T11](PathMatcher13.html "type parameter in PathMatcher13"),​[T12](PathMatcher13.html "type parameter in PathMatcher13"),​[T13](PathMatcher13.html "type parameter in PathMatcher13"),​N> concat​([PathMatcher1](PathMatcher1.html "class in akka.http.javadsl.server")<N> next)
		```
		- #### concat
		
		
		
		```
		public <N1,​N2> [PathMatcher15](PathMatcher15.html "class in akka.http.javadsl.server")<[T1](PathMatcher13.html "type parameter in PathMatcher13"),​[T2](PathMatcher13.html "type parameter in PathMatcher13"),​[T3](PathMatcher13.html "type parameter in PathMatcher13"),​[T4](PathMatcher13.html "type parameter in PathMatcher13"),​[T5](PathMatcher13.html "type parameter in PathMatcher13"),​[T6](PathMatcher13.html "type parameter in PathMatcher13"),​[T7](PathMatcher13.html "type parameter in PathMatcher13"),​[T8](PathMatcher13.html "type parameter in PathMatcher13"),​[T9](PathMatcher13.html "type parameter in PathMatcher13"),​[T10](PathMatcher13.html "type parameter in PathMatcher13"),​[T11](PathMatcher13.html "type parameter in PathMatcher13"),​[T12](PathMatcher13.html "type parameter in PathMatcher13"),​[T13](PathMatcher13.html "type parameter in PathMatcher13"),​N1,​N2> concat​([PathMatcher2](PathMatcher2.html "class in akka.http.javadsl.server")<N1,​N2> next)
		```
		- #### invert
		
		
		
		```
		public [PathMatcher0](PathMatcher0.html "class in akka.http.javadsl.server") invert()
		```
		- #### orElse
		
		
		
		```
		public [PathMatcher13](PathMatcher13.html "class in akka.http.javadsl.server")<[T1](PathMatcher13.html "type parameter in PathMatcher13"),​[T2](PathMatcher13.html "type parameter in PathMatcher13"),​[T3](PathMatcher13.html "type parameter in PathMatcher13"),​[T4](PathMatcher13.html "type parameter in PathMatcher13"),​[T5](PathMatcher13.html "type parameter in PathMatcher13"),​[T6](PathMatcher13.html "type parameter in PathMatcher13"),​[T7](PathMatcher13.html "type parameter in PathMatcher13"),​[T8](PathMatcher13.html "type parameter in PathMatcher13"),​[T9](PathMatcher13.html "type parameter in PathMatcher13"),​[T10](PathMatcher13.html "type parameter in PathMatcher13"),​[T11](PathMatcher13.html "type parameter in PathMatcher13"),​[T12](PathMatcher13.html "type parameter in PathMatcher13"),​[T13](PathMatcher13.html "type parameter in PathMatcher13")> orElse​([PathMatcher13](PathMatcher13.html "class in akka.http.javadsl.server")<[T1](PathMatcher13.html "type parameter in PathMatcher13"),​[T2](PathMatcher13.html "type parameter in PathMatcher13"),​[T3](PathMatcher13.html "type parameter in PathMatcher13"),​[T4](PathMatcher13.html "type parameter in PathMatcher13"),​[T5](PathMatcher13.html "type parameter in PathMatcher13"),​[T6](PathMatcher13.html "type parameter in PathMatcher13"),​[T7](PathMatcher13.html "type parameter in PathMatcher13"),​[T8](PathMatcher13.html "type parameter in PathMatcher13"),​[T9](PathMatcher13.html "type parameter in PathMatcher13"),​[T10](PathMatcher13.html "type parameter in PathMatcher13"),​[T11](PathMatcher13.html "type parameter in PathMatcher13"),​[T12](PathMatcher13.html "type parameter in PathMatcher13"),​[T13](PathMatcher13.html "type parameter in PathMatcher13")> alternative)
		```
		- #### slash
		
		
		
		```
		public [PathMatcher13](PathMatcher13.html "class in akka.http.javadsl.server")<[T1](PathMatcher13.html "type parameter in PathMatcher13"),​[T2](PathMatcher13.html "type parameter in PathMatcher13"),​[T3](PathMatcher13.html "type parameter in PathMatcher13"),​[T4](PathMatcher13.html "type parameter in PathMatcher13"),​[T5](PathMatcher13.html "type parameter in PathMatcher13"),​[T6](PathMatcher13.html "type parameter in PathMatcher13"),​[T7](PathMatcher13.html "type parameter in PathMatcher13"),​[T8](PathMatcher13.html "type parameter in PathMatcher13"),​[T9](PathMatcher13.html "type parameter in PathMatcher13"),​[T10](PathMatcher13.html "type parameter in PathMatcher13"),​[T11](PathMatcher13.html "type parameter in PathMatcher13"),​[T12](PathMatcher13.html "type parameter in PathMatcher13"),​[T13](PathMatcher13.html "type parameter in PathMatcher13")> slash()
		```
		- #### slash
		
		
		
		```
		public [PathMatcher13](PathMatcher13.html "class in akka.http.javadsl.server")<[T1](PathMatcher13.html "type parameter in PathMatcher13"),​[T2](PathMatcher13.html "type parameter in PathMatcher13"),​[T3](PathMatcher13.html "type parameter in PathMatcher13"),​[T4](PathMatcher13.html "type parameter in PathMatcher13"),​[T5](PathMatcher13.html "type parameter in PathMatcher13"),​[T6](PathMatcher13.html "type parameter in PathMatcher13"),​[T7](PathMatcher13.html "type parameter in PathMatcher13"),​[T8](PathMatcher13.html "type parameter in PathMatcher13"),​[T9](PathMatcher13.html "type parameter in PathMatcher13"),​[T10](PathMatcher13.html "type parameter in PathMatcher13"),​[T11](PathMatcher13.html "type parameter in PathMatcher13"),​[T12](PathMatcher13.html "type parameter in PathMatcher13"),​[T13](PathMatcher13.html "type parameter in PathMatcher13")> slash​(java.lang.String segment)
		```
		- #### slash
		
		
		
		```
		public [PathMatcher13](PathMatcher13.html "class in akka.http.javadsl.server")<[T1](PathMatcher13.html "type parameter in PathMatcher13"),​[T2](PathMatcher13.html "type parameter in PathMatcher13"),​[T3](PathMatcher13.html "type parameter in PathMatcher13"),​[T4](PathMatcher13.html "type parameter in PathMatcher13"),​[T5](PathMatcher13.html "type parameter in PathMatcher13"),​[T6](PathMatcher13.html "type parameter in PathMatcher13"),​[T7](PathMatcher13.html "type parameter in PathMatcher13"),​[T8](PathMatcher13.html "type parameter in PathMatcher13"),​[T9](PathMatcher13.html "type parameter in PathMatcher13"),​[T10](PathMatcher13.html "type parameter in PathMatcher13"),​[T11](PathMatcher13.html "type parameter in PathMatcher13"),​[T12](PathMatcher13.html "type parameter in PathMatcher13"),​[T13](PathMatcher13.html "type parameter in PathMatcher13")> slash​([PathMatcher0](PathMatcher0.html "class in akka.http.javadsl.server") next)
		```
		- #### slash
		
		
		
		```
		public <N> [PathMatcher14](PathMatcher14.html "class in akka.http.javadsl.server")<[T1](PathMatcher13.html "type parameter in PathMatcher13"),​[T2](PathMatcher13.html "type parameter in PathMatcher13"),​[T3](PathMatcher13.html "type parameter in PathMatcher13"),​[T4](PathMatcher13.html "type parameter in PathMatcher13"),​[T5](PathMatcher13.html "type parameter in PathMatcher13"),​[T6](PathMatcher13.html "type parameter in PathMatcher13"),​[T7](PathMatcher13.html "type parameter in PathMatcher13"),​[T8](PathMatcher13.html "type parameter in PathMatcher13"),​[T9](PathMatcher13.html "type parameter in PathMatcher13"),​[T10](PathMatcher13.html "type parameter in PathMatcher13"),​[T11](PathMatcher13.html "type parameter in PathMatcher13"),​[T12](PathMatcher13.html "type parameter in PathMatcher13"),​[T13](PathMatcher13.html "type parameter in PathMatcher13"),​N> slash​([PathMatcher1](PathMatcher1.html "class in akka.http.javadsl.server")<N> next)
		```
		- #### slash
		
		
		
		```
		public <N1,​N2> [PathMatcher15](PathMatcher15.html "class in akka.http.javadsl.server")<[T1](PathMatcher13.html "type parameter in PathMatcher13"),​[T2](PathMatcher13.html "type parameter in PathMatcher13"),​[T3](PathMatcher13.html "type parameter in PathMatcher13"),​[T4](PathMatcher13.html "type parameter in PathMatcher13"),​[T5](PathMatcher13.html "type parameter in PathMatcher13"),​[T6](PathMatcher13.html "type parameter in PathMatcher13"),​[T7](PathMatcher13.html "type parameter in PathMatcher13"),​[T8](PathMatcher13.html "type parameter in PathMatcher13"),​[T9](PathMatcher13.html "type parameter in PathMatcher13"),​[T10](PathMatcher13.html "type parameter in PathMatcher13"),​[T11](PathMatcher13.html "type parameter in PathMatcher13"),​[T12](PathMatcher13.html "type parameter in PathMatcher13"),​[T13](PathMatcher13.html "type parameter in PathMatcher13"),​N1,​N2> slash​([PathMatcher2](PathMatcher2.html "class in akka.http.javadsl.server")<N1,​N2> next)
		```
		- #### toScala
		
		
		
		```
		public [PathMatcher](../../scaladsl/server/PathMatcher.html "class in akka.http.scaladsl.server")<scala.Tuple13<[T1](PathMatcher13.html "type parameter in PathMatcher13"),​[T2](PathMatcher13.html "type parameter in PathMatcher13"),​[T3](PathMatcher13.html "type parameter in PathMatcher13"),​[T4](PathMatcher13.html "type parameter in PathMatcher13"),​[T5](PathMatcher13.html "type parameter in PathMatcher13"),​[T6](PathMatcher13.html "type parameter in PathMatcher13"),​[T7](PathMatcher13.html "type parameter in PathMatcher13"),​[T8](PathMatcher13.html "type parameter in PathMatcher13"),​[T9](PathMatcher13.html "type parameter in PathMatcher13"),​[T10](PathMatcher13.html "type parameter in PathMatcher13"),​[T11](PathMatcher13.html "type parameter in PathMatcher13"),​[T12](PathMatcher13.html "type parameter in PathMatcher13"),​[T13](PathMatcher13.html "type parameter in PathMatcher13")>> toScala()
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/PathMatcher0.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/PathMatcher1.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/PathMatcher13.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/PathMatcher14.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/PathMatcher15.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/PathMatcher2.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/package-summary.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/server/PathMatcher.html

---
*Source: [https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/PathMatcher13.html](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/PathMatcher13.html)*