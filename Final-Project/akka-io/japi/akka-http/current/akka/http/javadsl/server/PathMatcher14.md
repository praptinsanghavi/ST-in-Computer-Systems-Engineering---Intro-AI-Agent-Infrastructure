---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T23:47:29Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/server/PathMatcher14.html
title: PathMatcher14
---

# PathMatcher14

## Content

Package [akka.http.javadsl.server](package-summary.html)
## Class PathMatcher14\<T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11,​T12,​T13,​T14\>

- java.lang.Object
- - akka.http.javadsl.server.PathMatcher14\<T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11,​T12,​T13,​T14\>

- ---

```
public final class PathMatcher14<T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11,​T12,​T13,​T14>
extends java.lang.Object
```

A PathMatcher tries to match a prefix of a given string and returns either a PathMatcher.Matched instance
 if matched, otherwise PathMatchers.Unmatched.

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[PathMatcher14](#%3Cinit%3E(akka.http.scaladsl.server.PathMatcher))​([PathMatcher](../../scaladsl/server/PathMatcher.html "class in akka.http.scaladsl.server")<scala.Tuple14<[T1](PathMatcher14.html "type parameter in PathMatcher14"),​[T2](PathMatcher14.html "type parameter in PathMatcher14"),​[T3](PathMatcher14.html "type parameter in PathMatcher14"),​[T4](PathMatcher14.html "type parameter in PathMatcher14"),​[T5](PathMatcher14.html "type parameter in PathMatcher14"),​[T6](PathMatcher14.html "type parameter in PathMatcher14"),​[T7](PathMatcher14.html "type parameter in PathMatcher14"),​[T8](PathMatcher14.html "type parameter in PathMatcher14"),​[T9](PathMatcher14.html "type parameter in PathMatcher14"),​[T10](PathMatcher14.html "type parameter in PathMatcher14"),​[T11](PathMatcher14.html "type parameter in PathMatcher14"),​[T12](PathMatcher14.html "type parameter in PathMatcher14"),​[T13](PathMatcher14.html "type parameter in PathMatcher14"),​[T14](PathMatcher14.html "type parameter in PathMatcher14")>> toScala)` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[PathMatcher14](PathMatcher14.html "class in akka.http.javadsl.server")<[T1](PathMatcher14.html "type parameter in PathMatcher14"),​[T2](PathMatcher14.html "type parameter in PathMatcher14"),​[T3](PathMatcher14.html "type parameter in PathMatcher14"),​[T4](PathMatcher14.html "type parameter in PathMatcher14"),​[T5](PathMatcher14.html "type parameter in PathMatcher14"),​[T6](PathMatcher14.html "type parameter in PathMatcher14"),​[T7](PathMatcher14.html "type parameter in PathMatcher14"),​[T8](PathMatcher14.html "type parameter in PathMatcher14"),​[T9](PathMatcher14.html "type parameter in PathMatcher14"),​[T10](PathMatcher14.html "type parameter in PathMatcher14"),​[T11](PathMatcher14.html "type parameter in PathMatcher14"),​[T12](PathMatcher14.html "type parameter in PathMatcher14"),​[T13](PathMatcher14.html "type parameter in PathMatcher14"),​[T14](PathMatcher14.html "type parameter in PathMatcher14")>` | `[concat](#concat(akka.http.javadsl.server.PathMatcher0))​([PathMatcher0](PathMatcher0.html "class in akka.http.javadsl.server") next)` |  |
	| `<N> [PathMatcher15](PathMatcher15.html "class in akka.http.javadsl.server")<[T1](PathMatcher14.html "type parameter in PathMatcher14"),​[T2](PathMatcher14.html "type parameter in PathMatcher14"),​[T3](PathMatcher14.html "type parameter in PathMatcher14"),​[T4](PathMatcher14.html "type parameter in PathMatcher14"),​[T5](PathMatcher14.html "type parameter in PathMatcher14"),​[T6](PathMatcher14.html "type parameter in PathMatcher14"),​[T7](PathMatcher14.html "type parameter in PathMatcher14"),​[T8](PathMatcher14.html "type parameter in PathMatcher14"),​[T9](PathMatcher14.html "type parameter in PathMatcher14"),​[T10](PathMatcher14.html "type parameter in PathMatcher14"),​[T11](PathMatcher14.html "type parameter in PathMatcher14"),​[T12](PathMatcher14.html "type parameter in PathMatcher14"),​[T13](PathMatcher14.html "type parameter in PathMatcher14"),​[T14](PathMatcher14.html "type parameter in PathMatcher14"),​N>` | `[concat](#concat(akka.http.javadsl.server.PathMatcher1))​([PathMatcher1](PathMatcher1.html "class in akka.http.javadsl.server")<N> next)` |  |
	| `<N1,​N2>[PathMatcher16](PathMatcher16.html "class in akka.http.javadsl.server")<[T1](PathMatcher14.html "type parameter in PathMatcher14"),​[T2](PathMatcher14.html "type parameter in PathMatcher14"),​[T3](PathMatcher14.html "type parameter in PathMatcher14"),​[T4](PathMatcher14.html "type parameter in PathMatcher14"),​[T5](PathMatcher14.html "type parameter in PathMatcher14"),​[T6](PathMatcher14.html "type parameter in PathMatcher14"),​[T7](PathMatcher14.html "type parameter in PathMatcher14"),​[T8](PathMatcher14.html "type parameter in PathMatcher14"),​[T9](PathMatcher14.html "type parameter in PathMatcher14"),​[T10](PathMatcher14.html "type parameter in PathMatcher14"),​[T11](PathMatcher14.html "type parameter in PathMatcher14"),​[T12](PathMatcher14.html "type parameter in PathMatcher14"),​[T13](PathMatcher14.html "type parameter in PathMatcher14"),​[T14](PathMatcher14.html "type parameter in PathMatcher14"),​N1,​N2>` | `[concat](#concat(akka.http.javadsl.server.PathMatcher2))​([PathMatcher2](PathMatcher2.html "class in akka.http.javadsl.server")<N1,​N2> next)` |  |
	| `[PathMatcher14](PathMatcher14.html "class in akka.http.javadsl.server")<[T1](PathMatcher14.html "type parameter in PathMatcher14"),​[T2](PathMatcher14.html "type parameter in PathMatcher14"),​[T3](PathMatcher14.html "type parameter in PathMatcher14"),​[T4](PathMatcher14.html "type parameter in PathMatcher14"),​[T5](PathMatcher14.html "type parameter in PathMatcher14"),​[T6](PathMatcher14.html "type parameter in PathMatcher14"),​[T7](PathMatcher14.html "type parameter in PathMatcher14"),​[T8](PathMatcher14.html "type parameter in PathMatcher14"),​[T9](PathMatcher14.html "type parameter in PathMatcher14"),​[T10](PathMatcher14.html "type parameter in PathMatcher14"),​[T11](PathMatcher14.html "type parameter in PathMatcher14"),​[T12](PathMatcher14.html "type parameter in PathMatcher14"),​[T13](PathMatcher14.html "type parameter in PathMatcher14"),​[T14](PathMatcher14.html "type parameter in PathMatcher14")>` | `[concat](#concat(java.lang.String))​(java.lang.String segment)` |  |
	| `[PathMatcher0](PathMatcher0.html "class in akka.http.javadsl.server")` | `[invert](#invert())()` |  |
	| `[PathMatcher14](PathMatcher14.html "class in akka.http.javadsl.server")<[T1](PathMatcher14.html "type parameter in PathMatcher14"),​[T2](PathMatcher14.html "type parameter in PathMatcher14"),​[T3](PathMatcher14.html "type parameter in PathMatcher14"),​[T4](PathMatcher14.html "type parameter in PathMatcher14"),​[T5](PathMatcher14.html "type parameter in PathMatcher14"),​[T6](PathMatcher14.html "type parameter in PathMatcher14"),​[T7](PathMatcher14.html "type parameter in PathMatcher14"),​[T8](PathMatcher14.html "type parameter in PathMatcher14"),​[T9](PathMatcher14.html "type parameter in PathMatcher14"),​[T10](PathMatcher14.html "type parameter in PathMatcher14"),​[T11](PathMatcher14.html "type parameter in PathMatcher14"),​[T12](PathMatcher14.html "type parameter in PathMatcher14"),​[T13](PathMatcher14.html "type parameter in PathMatcher14"),​[T14](PathMatcher14.html "type parameter in PathMatcher14")>` | `[orElse](#orElse(akka.http.javadsl.server.PathMatcher14))​([PathMatcher14](PathMatcher14.html "class in akka.http.javadsl.server")<[T1](PathMatcher14.html "type parameter in PathMatcher14"),​[T2](PathMatcher14.html "type parameter in PathMatcher14"),​[T3](PathMatcher14.html "type parameter in PathMatcher14"),​[T4](PathMatcher14.html "type parameter in PathMatcher14"),​[T5](PathMatcher14.html "type parameter in PathMatcher14"),​[T6](PathMatcher14.html "type parameter in PathMatcher14"),​[T7](PathMatcher14.html "type parameter in PathMatcher14"),​[T8](PathMatcher14.html "type parameter in PathMatcher14"),​[T9](PathMatcher14.html "type parameter in PathMatcher14"),​[T10](PathMatcher14.html "type parameter in PathMatcher14"),​[T11](PathMatcher14.html "type parameter in PathMatcher14"),​[T12](PathMatcher14.html "type parameter in PathMatcher14"),​[T13](PathMatcher14.html "type parameter in PathMatcher14"),​[T14](PathMatcher14.html "type parameter in PathMatcher14")> alternative)` |  |
	| `[PathMatcher14](PathMatcher14.html "class in akka.http.javadsl.server")<[T1](PathMatcher14.html "type parameter in PathMatcher14"),​[T2](PathMatcher14.html "type parameter in PathMatcher14"),​[T3](PathMatcher14.html "type parameter in PathMatcher14"),​[T4](PathMatcher14.html "type parameter in PathMatcher14"),​[T5](PathMatcher14.html "type parameter in PathMatcher14"),​[T6](PathMatcher14.html "type parameter in PathMatcher14"),​[T7](PathMatcher14.html "type parameter in PathMatcher14"),​[T8](PathMatcher14.html "type parameter in PathMatcher14"),​[T9](PathMatcher14.html "type parameter in PathMatcher14"),​[T10](PathMatcher14.html "type parameter in PathMatcher14"),​[T11](PathMatcher14.html "type parameter in PathMatcher14"),​[T12](PathMatcher14.html "type parameter in PathMatcher14"),​[T13](PathMatcher14.html "type parameter in PathMatcher14"),​[T14](PathMatcher14.html "type parameter in PathMatcher14")>` | `[slash](#slash())()` |  |
	| `[PathMatcher14](PathMatcher14.html "class in akka.http.javadsl.server")<[T1](PathMatcher14.html "type parameter in PathMatcher14"),​[T2](PathMatcher14.html "type parameter in PathMatcher14"),​[T3](PathMatcher14.html "type parameter in PathMatcher14"),​[T4](PathMatcher14.html "type parameter in PathMatcher14"),​[T5](PathMatcher14.html "type parameter in PathMatcher14"),​[T6](PathMatcher14.html "type parameter in PathMatcher14"),​[T7](PathMatcher14.html "type parameter in PathMatcher14"),​[T8](PathMatcher14.html "type parameter in PathMatcher14"),​[T9](PathMatcher14.html "type parameter in PathMatcher14"),​[T10](PathMatcher14.html "type parameter in PathMatcher14"),​[T11](PathMatcher14.html "type parameter in PathMatcher14"),​[T12](PathMatcher14.html "type parameter in PathMatcher14"),​[T13](PathMatcher14.html "type parameter in PathMatcher14"),​[T14](PathMatcher14.html "type parameter in PathMatcher14")>` | `[slash](#slash(akka.http.javadsl.server.PathMatcher0))​([PathMatcher0](PathMatcher0.html "class in akka.http.javadsl.server") next)` |  |
	| `<N> [PathMatcher15](PathMatcher15.html "class in akka.http.javadsl.server")<[T1](PathMatcher14.html "type parameter in PathMatcher14"),​[T2](PathMatcher14.html "type parameter in PathMatcher14"),​[T3](PathMatcher14.html "type parameter in PathMatcher14"),​[T4](PathMatcher14.html "type parameter in PathMatcher14"),​[T5](PathMatcher14.html "type parameter in PathMatcher14"),​[T6](PathMatcher14.html "type parameter in PathMatcher14"),​[T7](PathMatcher14.html "type parameter in PathMatcher14"),​[T8](PathMatcher14.html "type parameter in PathMatcher14"),​[T9](PathMatcher14.html "type parameter in PathMatcher14"),​[T10](PathMatcher14.html "type parameter in PathMatcher14"),​[T11](PathMatcher14.html "type parameter in PathMatcher14"),​[T12](PathMatcher14.html "type parameter in PathMatcher14"),​[T13](PathMatcher14.html "type parameter in PathMatcher14"),​[T14](PathMatcher14.html "type parameter in PathMatcher14"),​N>` | `[slash](#slash(akka.http.javadsl.server.PathMatcher1))​([PathMatcher1](PathMatcher1.html "class in akka.http.javadsl.server")<N> next)` |  |
	| `<N1,​N2>[PathMatcher16](PathMatcher16.html "class in akka.http.javadsl.server")<[T1](PathMatcher14.html "type parameter in PathMatcher14"),​[T2](PathMatcher14.html "type parameter in PathMatcher14"),​[T3](PathMatcher14.html "type parameter in PathMatcher14"),​[T4](PathMatcher14.html "type parameter in PathMatcher14"),​[T5](PathMatcher14.html "type parameter in PathMatcher14"),​[T6](PathMatcher14.html "type parameter in PathMatcher14"),​[T7](PathMatcher14.html "type parameter in PathMatcher14"),​[T8](PathMatcher14.html "type parameter in PathMatcher14"),​[T9](PathMatcher14.html "type parameter in PathMatcher14"),​[T10](PathMatcher14.html "type parameter in PathMatcher14"),​[T11](PathMatcher14.html "type parameter in PathMatcher14"),​[T12](PathMatcher14.html "type parameter in PathMatcher14"),​[T13](PathMatcher14.html "type parameter in PathMatcher14"),​[T14](PathMatcher14.html "type parameter in PathMatcher14"),​N1,​N2>` | `[slash](#slash(akka.http.javadsl.server.PathMatcher2))​([PathMatcher2](PathMatcher2.html "class in akka.http.javadsl.server")<N1,​N2> next)` |  |
	| `[PathMatcher14](PathMatcher14.html "class in akka.http.javadsl.server")<[T1](PathMatcher14.html "type parameter in PathMatcher14"),​[T2](PathMatcher14.html "type parameter in PathMatcher14"),​[T3](PathMatcher14.html "type parameter in PathMatcher14"),​[T4](PathMatcher14.html "type parameter in PathMatcher14"),​[T5](PathMatcher14.html "type parameter in PathMatcher14"),​[T6](PathMatcher14.html "type parameter in PathMatcher14"),​[T7](PathMatcher14.html "type parameter in PathMatcher14"),​[T8](PathMatcher14.html "type parameter in PathMatcher14"),​[T9](PathMatcher14.html "type parameter in PathMatcher14"),​[T10](PathMatcher14.html "type parameter in PathMatcher14"),​[T11](PathMatcher14.html "type parameter in PathMatcher14"),​[T12](PathMatcher14.html "type parameter in PathMatcher14"),​[T13](PathMatcher14.html "type parameter in PathMatcher14"),​[T14](PathMatcher14.html "type parameter in PathMatcher14")>` | `[slash](#slash(java.lang.String))​(java.lang.String segment)` |  |
	| `[PathMatcher](../../scaladsl/server/PathMatcher.html "class in akka.http.scaladsl.server")<scala.Tuple14<[T1](PathMatcher14.html "type parameter in PathMatcher14"),​[T2](PathMatcher14.html "type parameter in PathMatcher14"),​[T3](PathMatcher14.html "type parameter in PathMatcher14"),​[T4](PathMatcher14.html "type parameter in PathMatcher14"),​[T5](PathMatcher14.html "type parameter in PathMatcher14"),​[T6](PathMatcher14.html "type parameter in PathMatcher14"),​[T7](PathMatcher14.html "type parameter in PathMatcher14"),​[T8](PathMatcher14.html "type parameter in PathMatcher14"),​[T9](PathMatcher14.html "type parameter in PathMatcher14"),​[T10](PathMatcher14.html "type parameter in PathMatcher14"),​[T11](PathMatcher14.html "type parameter in PathMatcher14"),​[T12](PathMatcher14.html "type parameter in PathMatcher14"),​[T13](PathMatcher14.html "type parameter in PathMatcher14"),​[T14](PathMatcher14.html "type parameter in PathMatcher14")>>` | `[toScala](#toScala())()` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### PathMatcher14
		
		
		
		```
		public PathMatcher14​([PathMatcher](../../scaladsl/server/PathMatcher.html "class in akka.http.scaladsl.server")<scala.Tuple14<[T1](PathMatcher14.html "type parameter in PathMatcher14"),​[T2](PathMatcher14.html "type parameter in PathMatcher14"),​[T3](PathMatcher14.html "type parameter in PathMatcher14"),​[T4](PathMatcher14.html "type parameter in PathMatcher14"),​[T5](PathMatcher14.html "type parameter in PathMatcher14"),​[T6](PathMatcher14.html "type parameter in PathMatcher14"),​[T7](PathMatcher14.html "type parameter in PathMatcher14"),​[T8](PathMatcher14.html "type parameter in PathMatcher14"),​[T9](PathMatcher14.html "type parameter in PathMatcher14"),​[T10](PathMatcher14.html "type parameter in PathMatcher14"),​[T11](PathMatcher14.html "type parameter in PathMatcher14"),​[T12](PathMatcher14.html "type parameter in PathMatcher14"),​[T13](PathMatcher14.html "type parameter in PathMatcher14"),​[T14](PathMatcher14.html "type parameter in PathMatcher14")>> toScala)
		```

	- ### Method Detail
	
	
	
		- #### concat
		
		
		
		```
		public [PathMatcher14](PathMatcher14.html "class in akka.http.javadsl.server")<[T1](PathMatcher14.html "type parameter in PathMatcher14"),​[T2](PathMatcher14.html "type parameter in PathMatcher14"),​[T3](PathMatcher14.html "type parameter in PathMatcher14"),​[T4](PathMatcher14.html "type parameter in PathMatcher14"),​[T5](PathMatcher14.html "type parameter in PathMatcher14"),​[T6](PathMatcher14.html "type parameter in PathMatcher14"),​[T7](PathMatcher14.html "type parameter in PathMatcher14"),​[T8](PathMatcher14.html "type parameter in PathMatcher14"),​[T9](PathMatcher14.html "type parameter in PathMatcher14"),​[T10](PathMatcher14.html "type parameter in PathMatcher14"),​[T11](PathMatcher14.html "type parameter in PathMatcher14"),​[T12](PathMatcher14.html "type parameter in PathMatcher14"),​[T13](PathMatcher14.html "type parameter in PathMatcher14"),​[T14](PathMatcher14.html "type parameter in PathMatcher14")> concat​(java.lang.String segment)
		```
		- #### concat
		
		
		
		```
		public [PathMatcher14](PathMatcher14.html "class in akka.http.javadsl.server")<[T1](PathMatcher14.html "type parameter in PathMatcher14"),​[T2](PathMatcher14.html "type parameter in PathMatcher14"),​[T3](PathMatcher14.html "type parameter in PathMatcher14"),​[T4](PathMatcher14.html "type parameter in PathMatcher14"),​[T5](PathMatcher14.html "type parameter in PathMatcher14"),​[T6](PathMatcher14.html "type parameter in PathMatcher14"),​[T7](PathMatcher14.html "type parameter in PathMatcher14"),​[T8](PathMatcher14.html "type parameter in PathMatcher14"),​[T9](PathMatcher14.html "type parameter in PathMatcher14"),​[T10](PathMatcher14.html "type parameter in PathMatcher14"),​[T11](PathMatcher14.html "type parameter in PathMatcher14"),​[T12](PathMatcher14.html "type parameter in PathMatcher14"),​[T13](PathMatcher14.html "type parameter in PathMatcher14"),​[T14](PathMatcher14.html "type parameter in PathMatcher14")> concat​([PathMatcher0](PathMatcher0.html "class in akka.http.javadsl.server") next)
		```
		- #### concat
		
		
		
		```
		public <N> [PathMatcher15](PathMatcher15.html "class in akka.http.javadsl.server")<[T1](PathMatcher14.html "type parameter in PathMatcher14"),​[T2](PathMatcher14.html "type parameter in PathMatcher14"),​[T3](PathMatcher14.html "type parameter in PathMatcher14"),​[T4](PathMatcher14.html "type parameter in PathMatcher14"),​[T5](PathMatcher14.html "type parameter in PathMatcher14"),​[T6](PathMatcher14.html "type parameter in PathMatcher14"),​[T7](PathMatcher14.html "type parameter in PathMatcher14"),​[T8](PathMatcher14.html "type parameter in PathMatcher14"),​[T9](PathMatcher14.html "type parameter in PathMatcher14"),​[T10](PathMatcher14.html "type parameter in PathMatcher14"),​[T11](PathMatcher14.html "type parameter in PathMatcher14"),​[T12](PathMatcher14.html "type parameter in PathMatcher14"),​[T13](PathMatcher14.html "type parameter in PathMatcher14"),​[T14](PathMatcher14.html "type parameter in PathMatcher14"),​N> concat​([PathMatcher1](PathMatcher1.html "class in akka.http.javadsl.server")<N> next)
		```
		- #### concat
		
		
		
		```
		public <N1,​N2> [PathMatcher16](PathMatcher16.html "class in akka.http.javadsl.server")<[T1](PathMatcher14.html "type parameter in PathMatcher14"),​[T2](PathMatcher14.html "type parameter in PathMatcher14"),​[T3](PathMatcher14.html "type parameter in PathMatcher14"),​[T4](PathMatcher14.html "type parameter in PathMatcher14"),​[T5](PathMatcher14.html "type parameter in PathMatcher14"),​[T6](PathMatcher14.html "type parameter in PathMatcher14"),​[T7](PathMatcher14.html "type parameter in PathMatcher14"),​[T8](PathMatcher14.html "type parameter in PathMatcher14"),​[T9](PathMatcher14.html "type parameter in PathMatcher14"),​[T10](PathMatcher14.html "type parameter in PathMatcher14"),​[T11](PathMatcher14.html "type parameter in PathMatcher14"),​[T12](PathMatcher14.html "type parameter in PathMatcher14"),​[T13](PathMatcher14.html "type parameter in PathMatcher14"),​[T14](PathMatcher14.html "type parameter in PathMatcher14"),​N1,​N2> concat​([PathMatcher2](PathMatcher2.html "class in akka.http.javadsl.server")<N1,​N2> next)
		```
		- #### invert
		
		
		
		```
		public [PathMatcher0](PathMatcher0.html "class in akka.http.javadsl.server") invert()
		```
		- #### orElse
		
		
		
		```
		public [PathMatcher14](PathMatcher14.html "class in akka.http.javadsl.server")<[T1](PathMatcher14.html "type parameter in PathMatcher14"),​[T2](PathMatcher14.html "type parameter in PathMatcher14"),​[T3](PathMatcher14.html "type parameter in PathMatcher14"),​[T4](PathMatcher14.html "type parameter in PathMatcher14"),​[T5](PathMatcher14.html "type parameter in PathMatcher14"),​[T6](PathMatcher14.html "type parameter in PathMatcher14"),​[T7](PathMatcher14.html "type parameter in PathMatcher14"),​[T8](PathMatcher14.html "type parameter in PathMatcher14"),​[T9](PathMatcher14.html "type parameter in PathMatcher14"),​[T10](PathMatcher14.html "type parameter in PathMatcher14"),​[T11](PathMatcher14.html "type parameter in PathMatcher14"),​[T12](PathMatcher14.html "type parameter in PathMatcher14"),​[T13](PathMatcher14.html "type parameter in PathMatcher14"),​[T14](PathMatcher14.html "type parameter in PathMatcher14")> orElse​([PathMatcher14](PathMatcher14.html "class in akka.http.javadsl.server")<[T1](PathMatcher14.html "type parameter in PathMatcher14"),​[T2](PathMatcher14.html "type parameter in PathMatcher14"),​[T3](PathMatcher14.html "type parameter in PathMatcher14"),​[T4](PathMatcher14.html "type parameter in PathMatcher14"),​[T5](PathMatcher14.html "type parameter in PathMatcher14"),​[T6](PathMatcher14.html "type parameter in PathMatcher14"),​[T7](PathMatcher14.html "type parameter in PathMatcher14"),​[T8](PathMatcher14.html "type parameter in PathMatcher14"),​[T9](PathMatcher14.html "type parameter in PathMatcher14"),​[T10](PathMatcher14.html "type parameter in PathMatcher14"),​[T11](PathMatcher14.html "type parameter in PathMatcher14"),​[T12](PathMatcher14.html "type parameter in PathMatcher14"),​[T13](PathMatcher14.html "type parameter in PathMatcher14"),​[T14](PathMatcher14.html "type parameter in PathMatcher14")> alternative)
		```
		- #### slash
		
		
		
		```
		public [PathMatcher14](PathMatcher14.html "class in akka.http.javadsl.server")<[T1](PathMatcher14.html "type parameter in PathMatcher14"),​[T2](PathMatcher14.html "type parameter in PathMatcher14"),​[T3](PathMatcher14.html "type parameter in PathMatcher14"),​[T4](PathMatcher14.html "type parameter in PathMatcher14"),​[T5](PathMatcher14.html "type parameter in PathMatcher14"),​[T6](PathMatcher14.html "type parameter in PathMatcher14"),​[T7](PathMatcher14.html "type parameter in PathMatcher14"),​[T8](PathMatcher14.html "type parameter in PathMatcher14"),​[T9](PathMatcher14.html "type parameter in PathMatcher14"),​[T10](PathMatcher14.html "type parameter in PathMatcher14"),​[T11](PathMatcher14.html "type parameter in PathMatcher14"),​[T12](PathMatcher14.html "type parameter in PathMatcher14"),​[T13](PathMatcher14.html "type parameter in PathMatcher14"),​[T14](PathMatcher14.html "type parameter in PathMatcher14")> slash()
		```
		- #### slash
		
		
		
		```
		public [PathMatcher14](PathMatcher14.html "class in akka.http.javadsl.server")<[T1](PathMatcher14.html "type parameter in PathMatcher14"),​[T2](PathMatcher14.html "type parameter in PathMatcher14"),​[T3](PathMatcher14.html "type parameter in PathMatcher14"),​[T4](PathMatcher14.html "type parameter in PathMatcher14"),​[T5](PathMatcher14.html "type parameter in PathMatcher14"),​[T6](PathMatcher14.html "type parameter in PathMatcher14"),​[T7](PathMatcher14.html "type parameter in PathMatcher14"),​[T8](PathMatcher14.html "type parameter in PathMatcher14"),​[T9](PathMatcher14.html "type parameter in PathMatcher14"),​[T10](PathMatcher14.html "type parameter in PathMatcher14"),​[T11](PathMatcher14.html "type parameter in PathMatcher14"),​[T12](PathMatcher14.html "type parameter in PathMatcher14"),​[T13](PathMatcher14.html "type parameter in PathMatcher14"),​[T14](PathMatcher14.html "type parameter in PathMatcher14")> slash​(java.lang.String segment)
		```
		- #### slash
		
		
		
		```
		public [PathMatcher14](PathMatcher14.html "class in akka.http.javadsl.server")<[T1](PathMatcher14.html "type parameter in PathMatcher14"),​[T2](PathMatcher14.html "type parameter in PathMatcher14"),​[T3](PathMatcher14.html "type parameter in PathMatcher14"),​[T4](PathMatcher14.html "type parameter in PathMatcher14"),​[T5](PathMatcher14.html "type parameter in PathMatcher14"),​[T6](PathMatcher14.html "type parameter in PathMatcher14"),​[T7](PathMatcher14.html "type parameter in PathMatcher14"),​[T8](PathMatcher14.html "type parameter in PathMatcher14"),​[T9](PathMatcher14.html "type parameter in PathMatcher14"),​[T10](PathMatcher14.html "type parameter in PathMatcher14"),​[T11](PathMatcher14.html "type parameter in PathMatcher14"),​[T12](PathMatcher14.html "type parameter in PathMatcher14"),​[T13](PathMatcher14.html "type parameter in PathMatcher14"),​[T14](PathMatcher14.html "type parameter in PathMatcher14")> slash​([PathMatcher0](PathMatcher0.html "class in akka.http.javadsl.server") next)
		```
		- #### slash
		
		
		
		```
		public <N> [PathMatcher15](PathMatcher15.html "class in akka.http.javadsl.server")<[T1](PathMatcher14.html "type parameter in PathMatcher14"),​[T2](PathMatcher14.html "type parameter in PathMatcher14"),​[T3](PathMatcher14.html "type parameter in PathMatcher14"),​[T4](PathMatcher14.html "type parameter in PathMatcher14"),​[T5](PathMatcher14.html "type parameter in PathMatcher14"),​[T6](PathMatcher14.html "type parameter in PathMatcher14"),​[T7](PathMatcher14.html "type parameter in PathMatcher14"),​[T8](PathMatcher14.html "type parameter in PathMatcher14"),​[T9](PathMatcher14.html "type parameter in PathMatcher14"),​[T10](PathMatcher14.html "type parameter in PathMatcher14"),​[T11](PathMatcher14.html "type parameter in PathMatcher14"),​[T12](PathMatcher14.html "type parameter in PathMatcher14"),​[T13](PathMatcher14.html "type parameter in PathMatcher14"),​[T14](PathMatcher14.html "type parameter in PathMatcher14"),​N> slash​([PathMatcher1](PathMatcher1.html "class in akka.http.javadsl.server")<N> next)
		```
		- #### slash
		
		
		
		```
		public <N1,​N2> [PathMatcher16](PathMatcher16.html "class in akka.http.javadsl.server")<[T1](PathMatcher14.html "type parameter in PathMatcher14"),​[T2](PathMatcher14.html "type parameter in PathMatcher14"),​[T3](PathMatcher14.html "type parameter in PathMatcher14"),​[T4](PathMatcher14.html "type parameter in PathMatcher14"),​[T5](PathMatcher14.html "type parameter in PathMatcher14"),​[T6](PathMatcher14.html "type parameter in PathMatcher14"),​[T7](PathMatcher14.html "type parameter in PathMatcher14"),​[T8](PathMatcher14.html "type parameter in PathMatcher14"),​[T9](PathMatcher14.html "type parameter in PathMatcher14"),​[T10](PathMatcher14.html "type parameter in PathMatcher14"),​[T11](PathMatcher14.html "type parameter in PathMatcher14"),​[T12](PathMatcher14.html "type parameter in PathMatcher14"),​[T13](PathMatcher14.html "type parameter in PathMatcher14"),​[T14](PathMatcher14.html "type parameter in PathMatcher14"),​N1,​N2> slash​([PathMatcher2](PathMatcher2.html "class in akka.http.javadsl.server")<N1,​N2> next)
		```
		- #### toScala
		
		
		
		```
		public [PathMatcher](../../scaladsl/server/PathMatcher.html "class in akka.http.scaladsl.server")<scala.Tuple14<[T1](PathMatcher14.html "type parameter in PathMatcher14"),​[T2](PathMatcher14.html "type parameter in PathMatcher14"),​[T3](PathMatcher14.html "type parameter in PathMatcher14"),​[T4](PathMatcher14.html "type parameter in PathMatcher14"),​[T5](PathMatcher14.html "type parameter in PathMatcher14"),​[T6](PathMatcher14.html "type parameter in PathMatcher14"),​[T7](PathMatcher14.html "type parameter in PathMatcher14"),​[T8](PathMatcher14.html "type parameter in PathMatcher14"),​[T9](PathMatcher14.html "type parameter in PathMatcher14"),​[T10](PathMatcher14.html "type parameter in PathMatcher14"),​[T11](PathMatcher14.html "type parameter in PathMatcher14"),​[T12](PathMatcher14.html "type parameter in PathMatcher14"),​[T13](PathMatcher14.html "type parameter in PathMatcher14"),​[T14](PathMatcher14.html "type parameter in PathMatcher14")>> toScala()
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/server/PathMatcher0.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/server/PathMatcher1.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/server/PathMatcher14.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/server/PathMatcher15.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/server/PathMatcher16.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/server/PathMatcher2.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/server/package-summary.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/PathMatcher.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/server/PathMatcher14.html](https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/server/PathMatcher14.html)*