---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T02:09:13Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/PathMatcher15.html
title: PathMatcher15
---

# PathMatcher15

## Content

Package [akka.http.javadsl.server](package-summary.html)
## Class PathMatcher15\<T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11,​T12,​T13,​T14,​T15\>

- java.lang.Object
- - akka.http.javadsl.server.PathMatcher15\<T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11,​T12,​T13,​T14,​T15\>

- ---

```
public final class PathMatcher15<T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11,​T12,​T13,​T14,​T15>
extends java.lang.Object
```

A PathMatcher tries to match a prefix of a given string and returns either a PathMatcher.Matched instance
 if matched, otherwise PathMatchers.Unmatched.

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[PathMatcher15](#%3Cinit%3E(akka.http.scaladsl.server.PathMatcher))​([PathMatcher](../../scaladsl/server/PathMatcher.html "class in akka.http.scaladsl.server")<scala.Tuple15<[T1](PathMatcher15.html "type parameter in PathMatcher15"),​[T2](PathMatcher15.html "type parameter in PathMatcher15"),​[T3](PathMatcher15.html "type parameter in PathMatcher15"),​[T4](PathMatcher15.html "type parameter in PathMatcher15"),​[T5](PathMatcher15.html "type parameter in PathMatcher15"),​[T6](PathMatcher15.html "type parameter in PathMatcher15"),​[T7](PathMatcher15.html "type parameter in PathMatcher15"),​[T8](PathMatcher15.html "type parameter in PathMatcher15"),​[T9](PathMatcher15.html "type parameter in PathMatcher15"),​[T10](PathMatcher15.html "type parameter in PathMatcher15"),​[T11](PathMatcher15.html "type parameter in PathMatcher15"),​[T12](PathMatcher15.html "type parameter in PathMatcher15"),​[T13](PathMatcher15.html "type parameter in PathMatcher15"),​[T14](PathMatcher15.html "type parameter in PathMatcher15"),​[T15](PathMatcher15.html "type parameter in PathMatcher15")>> toScala)` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[PathMatcher15](PathMatcher15.html "class in akka.http.javadsl.server")<[T1](PathMatcher15.html "type parameter in PathMatcher15"),​[T2](PathMatcher15.html "type parameter in PathMatcher15"),​[T3](PathMatcher15.html "type parameter in PathMatcher15"),​[T4](PathMatcher15.html "type parameter in PathMatcher15"),​[T5](PathMatcher15.html "type parameter in PathMatcher15"),​[T6](PathMatcher15.html "type parameter in PathMatcher15"),​[T7](PathMatcher15.html "type parameter in PathMatcher15"),​[T8](PathMatcher15.html "type parameter in PathMatcher15"),​[T9](PathMatcher15.html "type parameter in PathMatcher15"),​[T10](PathMatcher15.html "type parameter in PathMatcher15"),​[T11](PathMatcher15.html "type parameter in PathMatcher15"),​[T12](PathMatcher15.html "type parameter in PathMatcher15"),​[T13](PathMatcher15.html "type parameter in PathMatcher15"),​[T14](PathMatcher15.html "type parameter in PathMatcher15"),​[T15](PathMatcher15.html "type parameter in PathMatcher15")>` | `[concat](#concat(akka.http.javadsl.server.PathMatcher0))​([PathMatcher0](PathMatcher0.html "class in akka.http.javadsl.server") next)` |  |
	| `<N> [PathMatcher16](PathMatcher16.html "class in akka.http.javadsl.server")<[T1](PathMatcher15.html "type parameter in PathMatcher15"),​[T2](PathMatcher15.html "type parameter in PathMatcher15"),​[T3](PathMatcher15.html "type parameter in PathMatcher15"),​[T4](PathMatcher15.html "type parameter in PathMatcher15"),​[T5](PathMatcher15.html "type parameter in PathMatcher15"),​[T6](PathMatcher15.html "type parameter in PathMatcher15"),​[T7](PathMatcher15.html "type parameter in PathMatcher15"),​[T8](PathMatcher15.html "type parameter in PathMatcher15"),​[T9](PathMatcher15.html "type parameter in PathMatcher15"),​[T10](PathMatcher15.html "type parameter in PathMatcher15"),​[T11](PathMatcher15.html "type parameter in PathMatcher15"),​[T12](PathMatcher15.html "type parameter in PathMatcher15"),​[T13](PathMatcher15.html "type parameter in PathMatcher15"),​[T14](PathMatcher15.html "type parameter in PathMatcher15"),​[T15](PathMatcher15.html "type parameter in PathMatcher15"),​N>` | `[concat](#concat(akka.http.javadsl.server.PathMatcher1))​([PathMatcher1](PathMatcher1.html "class in akka.http.javadsl.server")<N> next)` |  |
	| `<N1,​N2>[PathMatcher17](PathMatcher17.html "class in akka.http.javadsl.server")<[T1](PathMatcher15.html "type parameter in PathMatcher15"),​[T2](PathMatcher15.html "type parameter in PathMatcher15"),​[T3](PathMatcher15.html "type parameter in PathMatcher15"),​[T4](PathMatcher15.html "type parameter in PathMatcher15"),​[T5](PathMatcher15.html "type parameter in PathMatcher15"),​[T6](PathMatcher15.html "type parameter in PathMatcher15"),​[T7](PathMatcher15.html "type parameter in PathMatcher15"),​[T8](PathMatcher15.html "type parameter in PathMatcher15"),​[T9](PathMatcher15.html "type parameter in PathMatcher15"),​[T10](PathMatcher15.html "type parameter in PathMatcher15"),​[T11](PathMatcher15.html "type parameter in PathMatcher15"),​[T12](PathMatcher15.html "type parameter in PathMatcher15"),​[T13](PathMatcher15.html "type parameter in PathMatcher15"),​[T14](PathMatcher15.html "type parameter in PathMatcher15"),​[T15](PathMatcher15.html "type parameter in PathMatcher15"),​N1,​N2>` | `[concat](#concat(akka.http.javadsl.server.PathMatcher2))​([PathMatcher2](PathMatcher2.html "class in akka.http.javadsl.server")<N1,​N2> next)` |  |
	| `[PathMatcher15](PathMatcher15.html "class in akka.http.javadsl.server")<[T1](PathMatcher15.html "type parameter in PathMatcher15"),​[T2](PathMatcher15.html "type parameter in PathMatcher15"),​[T3](PathMatcher15.html "type parameter in PathMatcher15"),​[T4](PathMatcher15.html "type parameter in PathMatcher15"),​[T5](PathMatcher15.html "type parameter in PathMatcher15"),​[T6](PathMatcher15.html "type parameter in PathMatcher15"),​[T7](PathMatcher15.html "type parameter in PathMatcher15"),​[T8](PathMatcher15.html "type parameter in PathMatcher15"),​[T9](PathMatcher15.html "type parameter in PathMatcher15"),​[T10](PathMatcher15.html "type parameter in PathMatcher15"),​[T11](PathMatcher15.html "type parameter in PathMatcher15"),​[T12](PathMatcher15.html "type parameter in PathMatcher15"),​[T13](PathMatcher15.html "type parameter in PathMatcher15"),​[T14](PathMatcher15.html "type parameter in PathMatcher15"),​[T15](PathMatcher15.html "type parameter in PathMatcher15")>` | `[concat](#concat(java.lang.String))​(java.lang.String segment)` |  |
	| `[PathMatcher0](PathMatcher0.html "class in akka.http.javadsl.server")` | `[invert](#invert())()` |  |
	| `[PathMatcher15](PathMatcher15.html "class in akka.http.javadsl.server")<[T1](PathMatcher15.html "type parameter in PathMatcher15"),​[T2](PathMatcher15.html "type parameter in PathMatcher15"),​[T3](PathMatcher15.html "type parameter in PathMatcher15"),​[T4](PathMatcher15.html "type parameter in PathMatcher15"),​[T5](PathMatcher15.html "type parameter in PathMatcher15"),​[T6](PathMatcher15.html "type parameter in PathMatcher15"),​[T7](PathMatcher15.html "type parameter in PathMatcher15"),​[T8](PathMatcher15.html "type parameter in PathMatcher15"),​[T9](PathMatcher15.html "type parameter in PathMatcher15"),​[T10](PathMatcher15.html "type parameter in PathMatcher15"),​[T11](PathMatcher15.html "type parameter in PathMatcher15"),​[T12](PathMatcher15.html "type parameter in PathMatcher15"),​[T13](PathMatcher15.html "type parameter in PathMatcher15"),​[T14](PathMatcher15.html "type parameter in PathMatcher15"),​[T15](PathMatcher15.html "type parameter in PathMatcher15")>` | `[orElse](#orElse(akka.http.javadsl.server.PathMatcher15))​([PathMatcher15](PathMatcher15.html "class in akka.http.javadsl.server")<[T1](PathMatcher15.html "type parameter in PathMatcher15"),​[T2](PathMatcher15.html "type parameter in PathMatcher15"),​[T3](PathMatcher15.html "type parameter in PathMatcher15"),​[T4](PathMatcher15.html "type parameter in PathMatcher15"),​[T5](PathMatcher15.html "type parameter in PathMatcher15"),​[T6](PathMatcher15.html "type parameter in PathMatcher15"),​[T7](PathMatcher15.html "type parameter in PathMatcher15"),​[T8](PathMatcher15.html "type parameter in PathMatcher15"),​[T9](PathMatcher15.html "type parameter in PathMatcher15"),​[T10](PathMatcher15.html "type parameter in PathMatcher15"),​[T11](PathMatcher15.html "type parameter in PathMatcher15"),​[T12](PathMatcher15.html "type parameter in PathMatcher15"),​[T13](PathMatcher15.html "type parameter in PathMatcher15"),​[T14](PathMatcher15.html "type parameter in PathMatcher15"),​[T15](PathMatcher15.html "type parameter in PathMatcher15")> alternative)` |  |
	| `[PathMatcher15](PathMatcher15.html "class in akka.http.javadsl.server")<[T1](PathMatcher15.html "type parameter in PathMatcher15"),​[T2](PathMatcher15.html "type parameter in PathMatcher15"),​[T3](PathMatcher15.html "type parameter in PathMatcher15"),​[T4](PathMatcher15.html "type parameter in PathMatcher15"),​[T5](PathMatcher15.html "type parameter in PathMatcher15"),​[T6](PathMatcher15.html "type parameter in PathMatcher15"),​[T7](PathMatcher15.html "type parameter in PathMatcher15"),​[T8](PathMatcher15.html "type parameter in PathMatcher15"),​[T9](PathMatcher15.html "type parameter in PathMatcher15"),​[T10](PathMatcher15.html "type parameter in PathMatcher15"),​[T11](PathMatcher15.html "type parameter in PathMatcher15"),​[T12](PathMatcher15.html "type parameter in PathMatcher15"),​[T13](PathMatcher15.html "type parameter in PathMatcher15"),​[T14](PathMatcher15.html "type parameter in PathMatcher15"),​[T15](PathMatcher15.html "type parameter in PathMatcher15")>` | `[slash](#slash())()` |  |
	| `[PathMatcher15](PathMatcher15.html "class in akka.http.javadsl.server")<[T1](PathMatcher15.html "type parameter in PathMatcher15"),​[T2](PathMatcher15.html "type parameter in PathMatcher15"),​[T3](PathMatcher15.html "type parameter in PathMatcher15"),​[T4](PathMatcher15.html "type parameter in PathMatcher15"),​[T5](PathMatcher15.html "type parameter in PathMatcher15"),​[T6](PathMatcher15.html "type parameter in PathMatcher15"),​[T7](PathMatcher15.html "type parameter in PathMatcher15"),​[T8](PathMatcher15.html "type parameter in PathMatcher15"),​[T9](PathMatcher15.html "type parameter in PathMatcher15"),​[T10](PathMatcher15.html "type parameter in PathMatcher15"),​[T11](PathMatcher15.html "type parameter in PathMatcher15"),​[T12](PathMatcher15.html "type parameter in PathMatcher15"),​[T13](PathMatcher15.html "type parameter in PathMatcher15"),​[T14](PathMatcher15.html "type parameter in PathMatcher15"),​[T15](PathMatcher15.html "type parameter in PathMatcher15")>` | `[slash](#slash(akka.http.javadsl.server.PathMatcher0))​([PathMatcher0](PathMatcher0.html "class in akka.http.javadsl.server") next)` |  |
	| `<N> [PathMatcher16](PathMatcher16.html "class in akka.http.javadsl.server")<[T1](PathMatcher15.html "type parameter in PathMatcher15"),​[T2](PathMatcher15.html "type parameter in PathMatcher15"),​[T3](PathMatcher15.html "type parameter in PathMatcher15"),​[T4](PathMatcher15.html "type parameter in PathMatcher15"),​[T5](PathMatcher15.html "type parameter in PathMatcher15"),​[T6](PathMatcher15.html "type parameter in PathMatcher15"),​[T7](PathMatcher15.html "type parameter in PathMatcher15"),​[T8](PathMatcher15.html "type parameter in PathMatcher15"),​[T9](PathMatcher15.html "type parameter in PathMatcher15"),​[T10](PathMatcher15.html "type parameter in PathMatcher15"),​[T11](PathMatcher15.html "type parameter in PathMatcher15"),​[T12](PathMatcher15.html "type parameter in PathMatcher15"),​[T13](PathMatcher15.html "type parameter in PathMatcher15"),​[T14](PathMatcher15.html "type parameter in PathMatcher15"),​[T15](PathMatcher15.html "type parameter in PathMatcher15"),​N>` | `[slash](#slash(akka.http.javadsl.server.PathMatcher1))​([PathMatcher1](PathMatcher1.html "class in akka.http.javadsl.server")<N> next)` |  |
	| `<N1,​N2>[PathMatcher17](PathMatcher17.html "class in akka.http.javadsl.server")<[T1](PathMatcher15.html "type parameter in PathMatcher15"),​[T2](PathMatcher15.html "type parameter in PathMatcher15"),​[T3](PathMatcher15.html "type parameter in PathMatcher15"),​[T4](PathMatcher15.html "type parameter in PathMatcher15"),​[T5](PathMatcher15.html "type parameter in PathMatcher15"),​[T6](PathMatcher15.html "type parameter in PathMatcher15"),​[T7](PathMatcher15.html "type parameter in PathMatcher15"),​[T8](PathMatcher15.html "type parameter in PathMatcher15"),​[T9](PathMatcher15.html "type parameter in PathMatcher15"),​[T10](PathMatcher15.html "type parameter in PathMatcher15"),​[T11](PathMatcher15.html "type parameter in PathMatcher15"),​[T12](PathMatcher15.html "type parameter in PathMatcher15"),​[T13](PathMatcher15.html "type parameter in PathMatcher15"),​[T14](PathMatcher15.html "type parameter in PathMatcher15"),​[T15](PathMatcher15.html "type parameter in PathMatcher15"),​N1,​N2>` | `[slash](#slash(akka.http.javadsl.server.PathMatcher2))​([PathMatcher2](PathMatcher2.html "class in akka.http.javadsl.server")<N1,​N2> next)` |  |
	| `[PathMatcher15](PathMatcher15.html "class in akka.http.javadsl.server")<[T1](PathMatcher15.html "type parameter in PathMatcher15"),​[T2](PathMatcher15.html "type parameter in PathMatcher15"),​[T3](PathMatcher15.html "type parameter in PathMatcher15"),​[T4](PathMatcher15.html "type parameter in PathMatcher15"),​[T5](PathMatcher15.html "type parameter in PathMatcher15"),​[T6](PathMatcher15.html "type parameter in PathMatcher15"),​[T7](PathMatcher15.html "type parameter in PathMatcher15"),​[T8](PathMatcher15.html "type parameter in PathMatcher15"),​[T9](PathMatcher15.html "type parameter in PathMatcher15"),​[T10](PathMatcher15.html "type parameter in PathMatcher15"),​[T11](PathMatcher15.html "type parameter in PathMatcher15"),​[T12](PathMatcher15.html "type parameter in PathMatcher15"),​[T13](PathMatcher15.html "type parameter in PathMatcher15"),​[T14](PathMatcher15.html "type parameter in PathMatcher15"),​[T15](PathMatcher15.html "type parameter in PathMatcher15")>` | `[slash](#slash(java.lang.String))​(java.lang.String segment)` |  |
	| `[PathMatcher](../../scaladsl/server/PathMatcher.html "class in akka.http.scaladsl.server")<scala.Tuple15<[T1](PathMatcher15.html "type parameter in PathMatcher15"),​[T2](PathMatcher15.html "type parameter in PathMatcher15"),​[T3](PathMatcher15.html "type parameter in PathMatcher15"),​[T4](PathMatcher15.html "type parameter in PathMatcher15"),​[T5](PathMatcher15.html "type parameter in PathMatcher15"),​[T6](PathMatcher15.html "type parameter in PathMatcher15"),​[T7](PathMatcher15.html "type parameter in PathMatcher15"),​[T8](PathMatcher15.html "type parameter in PathMatcher15"),​[T9](PathMatcher15.html "type parameter in PathMatcher15"),​[T10](PathMatcher15.html "type parameter in PathMatcher15"),​[T11](PathMatcher15.html "type parameter in PathMatcher15"),​[T12](PathMatcher15.html "type parameter in PathMatcher15"),​[T13](PathMatcher15.html "type parameter in PathMatcher15"),​[T14](PathMatcher15.html "type parameter in PathMatcher15"),​[T15](PathMatcher15.html "type parameter in PathMatcher15")>>` | `[toScala](#toScala())()` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### PathMatcher15
		
		
		
		```
		public PathMatcher15​([PathMatcher](../../scaladsl/server/PathMatcher.html "class in akka.http.scaladsl.server")<scala.Tuple15<[T1](PathMatcher15.html "type parameter in PathMatcher15"),​[T2](PathMatcher15.html "type parameter in PathMatcher15"),​[T3](PathMatcher15.html "type parameter in PathMatcher15"),​[T4](PathMatcher15.html "type parameter in PathMatcher15"),​[T5](PathMatcher15.html "type parameter in PathMatcher15"),​[T6](PathMatcher15.html "type parameter in PathMatcher15"),​[T7](PathMatcher15.html "type parameter in PathMatcher15"),​[T8](PathMatcher15.html "type parameter in PathMatcher15"),​[T9](PathMatcher15.html "type parameter in PathMatcher15"),​[T10](PathMatcher15.html "type parameter in PathMatcher15"),​[T11](PathMatcher15.html "type parameter in PathMatcher15"),​[T12](PathMatcher15.html "type parameter in PathMatcher15"),​[T13](PathMatcher15.html "type parameter in PathMatcher15"),​[T14](PathMatcher15.html "type parameter in PathMatcher15"),​[T15](PathMatcher15.html "type parameter in PathMatcher15")>> toScala)
		```

	- ### Method Detail
	
	
	
		- #### concat
		
		
		
		```
		public [PathMatcher15](PathMatcher15.html "class in akka.http.javadsl.server")<[T1](PathMatcher15.html "type parameter in PathMatcher15"),​[T2](PathMatcher15.html "type parameter in PathMatcher15"),​[T3](PathMatcher15.html "type parameter in PathMatcher15"),​[T4](PathMatcher15.html "type parameter in PathMatcher15"),​[T5](PathMatcher15.html "type parameter in PathMatcher15"),​[T6](PathMatcher15.html "type parameter in PathMatcher15"),​[T7](PathMatcher15.html "type parameter in PathMatcher15"),​[T8](PathMatcher15.html "type parameter in PathMatcher15"),​[T9](PathMatcher15.html "type parameter in PathMatcher15"),​[T10](PathMatcher15.html "type parameter in PathMatcher15"),​[T11](PathMatcher15.html "type parameter in PathMatcher15"),​[T12](PathMatcher15.html "type parameter in PathMatcher15"),​[T13](PathMatcher15.html "type parameter in PathMatcher15"),​[T14](PathMatcher15.html "type parameter in PathMatcher15"),​[T15](PathMatcher15.html "type parameter in PathMatcher15")> concat​(java.lang.String segment)
		```
		- #### concat
		
		
		
		```
		public [PathMatcher15](PathMatcher15.html "class in akka.http.javadsl.server")<[T1](PathMatcher15.html "type parameter in PathMatcher15"),​[T2](PathMatcher15.html "type parameter in PathMatcher15"),​[T3](PathMatcher15.html "type parameter in PathMatcher15"),​[T4](PathMatcher15.html "type parameter in PathMatcher15"),​[T5](PathMatcher15.html "type parameter in PathMatcher15"),​[T6](PathMatcher15.html "type parameter in PathMatcher15"),​[T7](PathMatcher15.html "type parameter in PathMatcher15"),​[T8](PathMatcher15.html "type parameter in PathMatcher15"),​[T9](PathMatcher15.html "type parameter in PathMatcher15"),​[T10](PathMatcher15.html "type parameter in PathMatcher15"),​[T11](PathMatcher15.html "type parameter in PathMatcher15"),​[T12](PathMatcher15.html "type parameter in PathMatcher15"),​[T13](PathMatcher15.html "type parameter in PathMatcher15"),​[T14](PathMatcher15.html "type parameter in PathMatcher15"),​[T15](PathMatcher15.html "type parameter in PathMatcher15")> concat​([PathMatcher0](PathMatcher0.html "class in akka.http.javadsl.server") next)
		```
		- #### concat
		
		
		
		```
		public <N> [PathMatcher16](PathMatcher16.html "class in akka.http.javadsl.server")<[T1](PathMatcher15.html "type parameter in PathMatcher15"),​[T2](PathMatcher15.html "type parameter in PathMatcher15"),​[T3](PathMatcher15.html "type parameter in PathMatcher15"),​[T4](PathMatcher15.html "type parameter in PathMatcher15"),​[T5](PathMatcher15.html "type parameter in PathMatcher15"),​[T6](PathMatcher15.html "type parameter in PathMatcher15"),​[T7](PathMatcher15.html "type parameter in PathMatcher15"),​[T8](PathMatcher15.html "type parameter in PathMatcher15"),​[T9](PathMatcher15.html "type parameter in PathMatcher15"),​[T10](PathMatcher15.html "type parameter in PathMatcher15"),​[T11](PathMatcher15.html "type parameter in PathMatcher15"),​[T12](PathMatcher15.html "type parameter in PathMatcher15"),​[T13](PathMatcher15.html "type parameter in PathMatcher15"),​[T14](PathMatcher15.html "type parameter in PathMatcher15"),​[T15](PathMatcher15.html "type parameter in PathMatcher15"),​N> concat​([PathMatcher1](PathMatcher1.html "class in akka.http.javadsl.server")<N> next)
		```
		- #### concat
		
		
		
		```
		public <N1,​N2> [PathMatcher17](PathMatcher17.html "class in akka.http.javadsl.server")<[T1](PathMatcher15.html "type parameter in PathMatcher15"),​[T2](PathMatcher15.html "type parameter in PathMatcher15"),​[T3](PathMatcher15.html "type parameter in PathMatcher15"),​[T4](PathMatcher15.html "type parameter in PathMatcher15"),​[T5](PathMatcher15.html "type parameter in PathMatcher15"),​[T6](PathMatcher15.html "type parameter in PathMatcher15"),​[T7](PathMatcher15.html "type parameter in PathMatcher15"),​[T8](PathMatcher15.html "type parameter in PathMatcher15"),​[T9](PathMatcher15.html "type parameter in PathMatcher15"),​[T10](PathMatcher15.html "type parameter in PathMatcher15"),​[T11](PathMatcher15.html "type parameter in PathMatcher15"),​[T12](PathMatcher15.html "type parameter in PathMatcher15"),​[T13](PathMatcher15.html "type parameter in PathMatcher15"),​[T14](PathMatcher15.html "type parameter in PathMatcher15"),​[T15](PathMatcher15.html "type parameter in PathMatcher15"),​N1,​N2> concat​([PathMatcher2](PathMatcher2.html "class in akka.http.javadsl.server")<N1,​N2> next)
		```
		- #### invert
		
		
		
		```
		public [PathMatcher0](PathMatcher0.html "class in akka.http.javadsl.server") invert()
		```
		- #### orElse
		
		
		
		```
		public [PathMatcher15](PathMatcher15.html "class in akka.http.javadsl.server")<[T1](PathMatcher15.html "type parameter in PathMatcher15"),​[T2](PathMatcher15.html "type parameter in PathMatcher15"),​[T3](PathMatcher15.html "type parameter in PathMatcher15"),​[T4](PathMatcher15.html "type parameter in PathMatcher15"),​[T5](PathMatcher15.html "type parameter in PathMatcher15"),​[T6](PathMatcher15.html "type parameter in PathMatcher15"),​[T7](PathMatcher15.html "type parameter in PathMatcher15"),​[T8](PathMatcher15.html "type parameter in PathMatcher15"),​[T9](PathMatcher15.html "type parameter in PathMatcher15"),​[T10](PathMatcher15.html "type parameter in PathMatcher15"),​[T11](PathMatcher15.html "type parameter in PathMatcher15"),​[T12](PathMatcher15.html "type parameter in PathMatcher15"),​[T13](PathMatcher15.html "type parameter in PathMatcher15"),​[T14](PathMatcher15.html "type parameter in PathMatcher15"),​[T15](PathMatcher15.html "type parameter in PathMatcher15")> orElse​([PathMatcher15](PathMatcher15.html "class in akka.http.javadsl.server")<[T1](PathMatcher15.html "type parameter in PathMatcher15"),​[T2](PathMatcher15.html "type parameter in PathMatcher15"),​[T3](PathMatcher15.html "type parameter in PathMatcher15"),​[T4](PathMatcher15.html "type parameter in PathMatcher15"),​[T5](PathMatcher15.html "type parameter in PathMatcher15"),​[T6](PathMatcher15.html "type parameter in PathMatcher15"),​[T7](PathMatcher15.html "type parameter in PathMatcher15"),​[T8](PathMatcher15.html "type parameter in PathMatcher15"),​[T9](PathMatcher15.html "type parameter in PathMatcher15"),​[T10](PathMatcher15.html "type parameter in PathMatcher15"),​[T11](PathMatcher15.html "type parameter in PathMatcher15"),​[T12](PathMatcher15.html "type parameter in PathMatcher15"),​[T13](PathMatcher15.html "type parameter in PathMatcher15"),​[T14](PathMatcher15.html "type parameter in PathMatcher15"),​[T15](PathMatcher15.html "type parameter in PathMatcher15")> alternative)
		```
		- #### slash
		
		
		
		```
		public [PathMatcher15](PathMatcher15.html "class in akka.http.javadsl.server")<[T1](PathMatcher15.html "type parameter in PathMatcher15"),​[T2](PathMatcher15.html "type parameter in PathMatcher15"),​[T3](PathMatcher15.html "type parameter in PathMatcher15"),​[T4](PathMatcher15.html "type parameter in PathMatcher15"),​[T5](PathMatcher15.html "type parameter in PathMatcher15"),​[T6](PathMatcher15.html "type parameter in PathMatcher15"),​[T7](PathMatcher15.html "type parameter in PathMatcher15"),​[T8](PathMatcher15.html "type parameter in PathMatcher15"),​[T9](PathMatcher15.html "type parameter in PathMatcher15"),​[T10](PathMatcher15.html "type parameter in PathMatcher15"),​[T11](PathMatcher15.html "type parameter in PathMatcher15"),​[T12](PathMatcher15.html "type parameter in PathMatcher15"),​[T13](PathMatcher15.html "type parameter in PathMatcher15"),​[T14](PathMatcher15.html "type parameter in PathMatcher15"),​[T15](PathMatcher15.html "type parameter in PathMatcher15")> slash()
		```
		- #### slash
		
		
		
		```
		public [PathMatcher15](PathMatcher15.html "class in akka.http.javadsl.server")<[T1](PathMatcher15.html "type parameter in PathMatcher15"),​[T2](PathMatcher15.html "type parameter in PathMatcher15"),​[T3](PathMatcher15.html "type parameter in PathMatcher15"),​[T4](PathMatcher15.html "type parameter in PathMatcher15"),​[T5](PathMatcher15.html "type parameter in PathMatcher15"),​[T6](PathMatcher15.html "type parameter in PathMatcher15"),​[T7](PathMatcher15.html "type parameter in PathMatcher15"),​[T8](PathMatcher15.html "type parameter in PathMatcher15"),​[T9](PathMatcher15.html "type parameter in PathMatcher15"),​[T10](PathMatcher15.html "type parameter in PathMatcher15"),​[T11](PathMatcher15.html "type parameter in PathMatcher15"),​[T12](PathMatcher15.html "type parameter in PathMatcher15"),​[T13](PathMatcher15.html "type parameter in PathMatcher15"),​[T14](PathMatcher15.html "type parameter in PathMatcher15"),​[T15](PathMatcher15.html "type parameter in PathMatcher15")> slash​(java.lang.String segment)
		```
		- #### slash
		
		
		
		```
		public [PathMatcher15](PathMatcher15.html "class in akka.http.javadsl.server")<[T1](PathMatcher15.html "type parameter in PathMatcher15"),​[T2](PathMatcher15.html "type parameter in PathMatcher15"),​[T3](PathMatcher15.html "type parameter in PathMatcher15"),​[T4](PathMatcher15.html "type parameter in PathMatcher15"),​[T5](PathMatcher15.html "type parameter in PathMatcher15"),​[T6](PathMatcher15.html "type parameter in PathMatcher15"),​[T7](PathMatcher15.html "type parameter in PathMatcher15"),​[T8](PathMatcher15.html "type parameter in PathMatcher15"),​[T9](PathMatcher15.html "type parameter in PathMatcher15"),​[T10](PathMatcher15.html "type parameter in PathMatcher15"),​[T11](PathMatcher15.html "type parameter in PathMatcher15"),​[T12](PathMatcher15.html "type parameter in PathMatcher15"),​[T13](PathMatcher15.html "type parameter in PathMatcher15"),​[T14](PathMatcher15.html "type parameter in PathMatcher15"),​[T15](PathMatcher15.html "type parameter in PathMatcher15")> slash​([PathMatcher0](PathMatcher0.html "class in akka.http.javadsl.server") next)
		```
		- #### slash
		
		
		
		```
		public <N> [PathMatcher16](PathMatcher16.html "class in akka.http.javadsl.server")<[T1](PathMatcher15.html "type parameter in PathMatcher15"),​[T2](PathMatcher15.html "type parameter in PathMatcher15"),​[T3](PathMatcher15.html "type parameter in PathMatcher15"),​[T4](PathMatcher15.html "type parameter in PathMatcher15"),​[T5](PathMatcher15.html "type parameter in PathMatcher15"),​[T6](PathMatcher15.html "type parameter in PathMatcher15"),​[T7](PathMatcher15.html "type parameter in PathMatcher15"),​[T8](PathMatcher15.html "type parameter in PathMatcher15"),​[T9](PathMatcher15.html "type parameter in PathMatcher15"),​[T10](PathMatcher15.html "type parameter in PathMatcher15"),​[T11](PathMatcher15.html "type parameter in PathMatcher15"),​[T12](PathMatcher15.html "type parameter in PathMatcher15"),​[T13](PathMatcher15.html "type parameter in PathMatcher15"),​[T14](PathMatcher15.html "type parameter in PathMatcher15"),​[T15](PathMatcher15.html "type parameter in PathMatcher15"),​N> slash​([PathMatcher1](PathMatcher1.html "class in akka.http.javadsl.server")<N> next)
		```
		- #### slash
		
		
		
		```
		public <N1,​N2> [PathMatcher17](PathMatcher17.html "class in akka.http.javadsl.server")<[T1](PathMatcher15.html "type parameter in PathMatcher15"),​[T2](PathMatcher15.html "type parameter in PathMatcher15"),​[T3](PathMatcher15.html "type parameter in PathMatcher15"),​[T4](PathMatcher15.html "type parameter in PathMatcher15"),​[T5](PathMatcher15.html "type parameter in PathMatcher15"),​[T6](PathMatcher15.html "type parameter in PathMatcher15"),​[T7](PathMatcher15.html "type parameter in PathMatcher15"),​[T8](PathMatcher15.html "type parameter in PathMatcher15"),​[T9](PathMatcher15.html "type parameter in PathMatcher15"),​[T10](PathMatcher15.html "type parameter in PathMatcher15"),​[T11](PathMatcher15.html "type parameter in PathMatcher15"),​[T12](PathMatcher15.html "type parameter in PathMatcher15"),​[T13](PathMatcher15.html "type parameter in PathMatcher15"),​[T14](PathMatcher15.html "type parameter in PathMatcher15"),​[T15](PathMatcher15.html "type parameter in PathMatcher15"),​N1,​N2> slash​([PathMatcher2](PathMatcher2.html "class in akka.http.javadsl.server")<N1,​N2> next)
		```
		- #### toScala
		
		
		
		```
		public [PathMatcher](../../scaladsl/server/PathMatcher.html "class in akka.http.scaladsl.server")<scala.Tuple15<[T1](PathMatcher15.html "type parameter in PathMatcher15"),​[T2](PathMatcher15.html "type parameter in PathMatcher15"),​[T3](PathMatcher15.html "type parameter in PathMatcher15"),​[T4](PathMatcher15.html "type parameter in PathMatcher15"),​[T5](PathMatcher15.html "type parameter in PathMatcher15"),​[T6](PathMatcher15.html "type parameter in PathMatcher15"),​[T7](PathMatcher15.html "type parameter in PathMatcher15"),​[T8](PathMatcher15.html "type parameter in PathMatcher15"),​[T9](PathMatcher15.html "type parameter in PathMatcher15"),​[T10](PathMatcher15.html "type parameter in PathMatcher15"),​[T11](PathMatcher15.html "type parameter in PathMatcher15"),​[T12](PathMatcher15.html "type parameter in PathMatcher15"),​[T13](PathMatcher15.html "type parameter in PathMatcher15"),​[T14](PathMatcher15.html "type parameter in PathMatcher15"),​[T15](PathMatcher15.html "type parameter in PathMatcher15")>> toScala()
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/PathMatcher0.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/PathMatcher1.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/PathMatcher15.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/PathMatcher16.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/PathMatcher17.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/PathMatcher2.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/package-summary.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/server/PathMatcher.html

---
*Source: [https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/PathMatcher15.html](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/PathMatcher15.html)*