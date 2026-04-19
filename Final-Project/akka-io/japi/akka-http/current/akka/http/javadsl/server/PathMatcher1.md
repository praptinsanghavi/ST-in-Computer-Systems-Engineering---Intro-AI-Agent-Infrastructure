---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T23:47:24Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/server/PathMatcher1.html
title: PathMatcher1
---

# PathMatcher1

## Content

Package [akka.http.javadsl.server](package-summary.html)
## Class PathMatcher1\<T1\>

- java.lang.Object
- - akka.http.javadsl.server.PathMatcher1\<T1\>

- ---

```
public final class PathMatcher1<T1>
extends java.lang.Object
```

A PathMatcher tries to match a prefix of a given string and returns either a PathMatcher.Matched instance
 if matched, otherwise PathMatchers.Unmatched.

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[PathMatcher1](#%3Cinit%3E(akka.http.scaladsl.server.PathMatcher))​([PathMatcher](../../scaladsl/server/PathMatcher.html "class in akka.http.scaladsl.server")<scala.Tuple1<[T1](PathMatcher1.html "type parameter in PathMatcher1")>> toScala)` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[PathMatcher1](PathMatcher1.html "class in akka.http.javadsl.server")<[T1](PathMatcher1.html "type parameter in PathMatcher1")>` | `[concat](#concat(akka.http.javadsl.server.PathMatcher0))​([PathMatcher0](PathMatcher0.html "class in akka.http.javadsl.server") next)` |  |
	| `<N> [PathMatcher2](PathMatcher2.html "class in akka.http.javadsl.server")<[T1](PathMatcher1.html "type parameter in PathMatcher1"),​N>` | `[concat](#concat(akka.http.javadsl.server.PathMatcher1))​([PathMatcher1](PathMatcher1.html "class in akka.http.javadsl.server")<N> next)` |  |
	| `<N1,​N2>[PathMatcher3](PathMatcher3.html "class in akka.http.javadsl.server")<[T1](PathMatcher1.html "type parameter in PathMatcher1"),​N1,​N2>` | `[concat](#concat(akka.http.javadsl.server.PathMatcher2))​([PathMatcher2](PathMatcher2.html "class in akka.http.javadsl.server")<N1,​N2> next)` |  |
	| `[PathMatcher1](PathMatcher1.html "class in akka.http.javadsl.server")<[T1](PathMatcher1.html "type parameter in PathMatcher1")>` | `[concat](#concat(java.lang.String))​(java.lang.String segment)` |  |
	| `[PathMatcher0](PathMatcher0.html "class in akka.http.javadsl.server")` | `[invert](#invert())()` |  |
	| `<U> [PathMatcher1](PathMatcher1.html "class in akka.http.javadsl.server")<U>` | `[map](#map(java.util.function.Function))​(java.util.function.Function<[T1](PathMatcher1.html "type parameter in PathMatcher1"),​U> f)` |  |
	| `[PathMatcher1](PathMatcher1.html "class in akka.http.javadsl.server")<[T1](PathMatcher1.html "type parameter in PathMatcher1")>` | `[orElse](#orElse(akka.http.javadsl.server.PathMatcher1))​([PathMatcher1](PathMatcher1.html "class in akka.http.javadsl.server")<[T1](PathMatcher1.html "type parameter in PathMatcher1")> alternative)` |  |
	| `[PathMatcher1](PathMatcher1.html "class in akka.http.javadsl.server")<java.util.List<[T1](PathMatcher1.html "type parameter in PathMatcher1")>>` | `[repeat](#repeat(int,int))​(int min,  int max)` |  |
	| `[PathMatcher1](PathMatcher1.html "class in akka.http.javadsl.server")<java.util.List<[T1](PathMatcher1.html "type parameter in PathMatcher1")>>` | `[repeat](#repeat(int,int,akka.http.javadsl.server.PathMatcher0))​(int min,  int max,  [PathMatcher0](PathMatcher0.html "class in akka.http.javadsl.server") separator)` |  |
	| `[PathMatcher1](PathMatcher1.html "class in akka.http.javadsl.server")<[T1](PathMatcher1.html "type parameter in PathMatcher1")>` | `[slash](#slash())()` |  |
	| `[PathMatcher1](PathMatcher1.html "class in akka.http.javadsl.server")<[T1](PathMatcher1.html "type parameter in PathMatcher1")>` | `[slash](#slash(akka.http.javadsl.server.PathMatcher0))​([PathMatcher0](PathMatcher0.html "class in akka.http.javadsl.server") next)` |  |
	| `<N> [PathMatcher2](PathMatcher2.html "class in akka.http.javadsl.server")<[T1](PathMatcher1.html "type parameter in PathMatcher1"),​N>` | `[slash](#slash(akka.http.javadsl.server.PathMatcher1))​([PathMatcher1](PathMatcher1.html "class in akka.http.javadsl.server")<N> next)` |  |
	| `<N1,​N2>[PathMatcher3](PathMatcher3.html "class in akka.http.javadsl.server")<[T1](PathMatcher1.html "type parameter in PathMatcher1"),​N1,​N2>` | `[slash](#slash(akka.http.javadsl.server.PathMatcher2))​([PathMatcher2](PathMatcher2.html "class in akka.http.javadsl.server")<N1,​N2> next)` |  |
	| `[PathMatcher1](PathMatcher1.html "class in akka.http.javadsl.server")<[T1](PathMatcher1.html "type parameter in PathMatcher1")>` | `[slash](#slash(java.lang.String))​(java.lang.String segment)` |  |
	| `[PathMatcher](../../scaladsl/server/PathMatcher.html "class in akka.http.scaladsl.server")<scala.Tuple1<[T1](PathMatcher1.html "type parameter in PathMatcher1")>>` | `[toScala](#toScala())()` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### PathMatcher1
		
		
		
		```
		public PathMatcher1​([PathMatcher](../../scaladsl/server/PathMatcher.html "class in akka.http.scaladsl.server")<scala.Tuple1<[T1](PathMatcher1.html "type parameter in PathMatcher1")>> toScala)
		```

	- ### Method Detail
	
	
	
		- #### concat
		
		
		
		```
		public [PathMatcher1](PathMatcher1.html "class in akka.http.javadsl.server")<[T1](PathMatcher1.html "type parameter in PathMatcher1")> concat​(java.lang.String segment)
		```
		- #### concat
		
		
		
		```
		public [PathMatcher1](PathMatcher1.html "class in akka.http.javadsl.server")<[T1](PathMatcher1.html "type parameter in PathMatcher1")> concat​([PathMatcher0](PathMatcher0.html "class in akka.http.javadsl.server") next)
		```
		- #### concat
		
		
		
		```
		public <N> [PathMatcher2](PathMatcher2.html "class in akka.http.javadsl.server")<[T1](PathMatcher1.html "type parameter in PathMatcher1"),​N> concat​([PathMatcher1](PathMatcher1.html "class in akka.http.javadsl.server")<N> next)
		```
		- #### concat
		
		
		
		```
		public <N1,​N2> [PathMatcher3](PathMatcher3.html "class in akka.http.javadsl.server")<[T1](PathMatcher1.html "type parameter in PathMatcher1"),​N1,​N2> concat​([PathMatcher2](PathMatcher2.html "class in akka.http.javadsl.server")<N1,​N2> next)
		```
		- #### invert
		
		
		
		```
		public [PathMatcher0](PathMatcher0.html "class in akka.http.javadsl.server") invert()
		```
		- #### map
		
		
		
		```
		public <U> [PathMatcher1](PathMatcher1.html "class in akka.http.javadsl.server")<U> map​(java.util.function.Function<[T1](PathMatcher1.html "type parameter in PathMatcher1"),​U> f)
		```
		- #### orElse
		
		
		
		```
		public [PathMatcher1](PathMatcher1.html "class in akka.http.javadsl.server")<[T1](PathMatcher1.html "type parameter in PathMatcher1")> orElse​([PathMatcher1](PathMatcher1.html "class in akka.http.javadsl.server")<[T1](PathMatcher1.html "type parameter in PathMatcher1")> alternative)
		```
		- #### repeat
		
		
		
		```
		public [PathMatcher1](PathMatcher1.html "class in akka.http.javadsl.server")<java.util.List<[T1](PathMatcher1.html "type parameter in PathMatcher1")>> repeat​(int min,
		                                               int max)
		```
		- #### repeat
		
		
		
		```
		public [PathMatcher1](PathMatcher1.html "class in akka.http.javadsl.server")<java.util.List<[T1](PathMatcher1.html "type parameter in PathMatcher1")>> repeat​(int min,
		                                               int max,
		                                               [PathMatcher0](PathMatcher0.html "class in akka.http.javadsl.server") separator)
		```
		- #### slash
		
		
		
		```
		public [PathMatcher1](PathMatcher1.html "class in akka.http.javadsl.server")<[T1](PathMatcher1.html "type parameter in PathMatcher1")> slash()
		```
		- #### slash
		
		
		
		```
		public [PathMatcher1](PathMatcher1.html "class in akka.http.javadsl.server")<[T1](PathMatcher1.html "type parameter in PathMatcher1")> slash​(java.lang.String segment)
		```
		- #### slash
		
		
		
		```
		public [PathMatcher1](PathMatcher1.html "class in akka.http.javadsl.server")<[T1](PathMatcher1.html "type parameter in PathMatcher1")> slash​([PathMatcher0](PathMatcher0.html "class in akka.http.javadsl.server") next)
		```
		- #### slash
		
		
		
		```
		public <N> [PathMatcher2](PathMatcher2.html "class in akka.http.javadsl.server")<[T1](PathMatcher1.html "type parameter in PathMatcher1"),​N> slash​([PathMatcher1](PathMatcher1.html "class in akka.http.javadsl.server")<N> next)
		```
		- #### slash
		
		
		
		```
		public <N1,​N2> [PathMatcher3](PathMatcher3.html "class in akka.http.javadsl.server")<[T1](PathMatcher1.html "type parameter in PathMatcher1"),​N1,​N2> slash​([PathMatcher2](PathMatcher2.html "class in akka.http.javadsl.server")<N1,​N2> next)
		```
		- #### toScala
		
		
		
		```
		public [PathMatcher](../../scaladsl/server/PathMatcher.html "class in akka.http.scaladsl.server")<scala.Tuple1<[T1](PathMatcher1.html "type parameter in PathMatcher1")>> toScala()
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/server/PathMatcher0.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/server/PathMatcher1.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/server/PathMatcher2.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/server/PathMatcher3.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/server/package-summary.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/PathMatcher.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/server/PathMatcher1.html](https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/server/PathMatcher1.html)*