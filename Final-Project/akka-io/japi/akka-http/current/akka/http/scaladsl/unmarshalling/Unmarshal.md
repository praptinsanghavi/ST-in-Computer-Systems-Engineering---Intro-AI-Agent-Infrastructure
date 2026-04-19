---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T00:42:41Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/unmarshalling/Unmarshal.html
title: Unmarshal
---

# Unmarshal

## Content

Package [akka.http.scaladsl.unmarshalling](package-summary.html)
## Class Unmarshal\<A\>

- java.lang.Object
- - akka.http.scaladsl.unmarshalling.Unmarshal\<A\>

- ---

```
public class Unmarshal<A>
extends java.lang.Object
```

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[Unmarshal](#%3Cinit%3E(A))​([A](Unmarshal.html "type parameter in Unmarshal") value)` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `static <T> [Unmarshal](Unmarshal.html "class in akka.http.scaladsl.unmarshalling")<T>` | `[apply](#apply(T))​(T value)` |  |
	| `<B> scala.concurrent.Future<B>` | `[to](#to(akka.http.scaladsl.unmarshalling.Unmarshaller,scala.concurrent.ExecutionContext,akka.stream.Materializer))​([Unmarshaller](Unmarshaller.html "interface in akka.http.scaladsl.unmarshalling")<[A](Unmarshal.html "type parameter in Unmarshal"),​B> um,  scala.concurrent.ExecutionContext ec,  akka.stream.Materializer mat)` | Unmarshals the value to the given Type using the in\-scope Unmarshaller. |
	| `[A](Unmarshal.html "type parameter in Unmarshal")` | `[value](#value())()` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### Unmarshal
		
		
		
		```
		public Unmarshal​([A](Unmarshal.html "type parameter in Unmarshal") value)
		```

	- ### Method Detail
	
	
	
		- #### apply
		
		
		
		```
		public static <T> [Unmarshal](Unmarshal.html "class in akka.http.scaladsl.unmarshalling")<T> apply​(T value)
		```
		- #### value
		
		
		
		```
		public [A](Unmarshal.html "type parameter in Unmarshal") value()
		```
		- #### to
		
		
		
		```
		public <B> scala.concurrent.Future<B> to​([Unmarshaller](Unmarshaller.html "interface in akka.http.scaladsl.unmarshalling")<[A](Unmarshal.html "type parameter in Unmarshal"),​B> um,
		                                         scala.concurrent.ExecutionContext ec,
		                                         akka.stream.Materializer mat)
		```
		
		Unmarshals the value to the given Type using the in\-scope Unmarshaller.
		 
		 Uses the default materializer `ExecutionContext` if no implicit execution context is provided.
		 If you expect the marshalling to be heavy, it is suggested to provide a specialized context for those operations.
		
		
		
		Parameters:
		`um` \- (undocumented)
		`ec` \- (undocumented)
		`mat` \- (undocumented)
		Returns:
		(undocumented)

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/unmarshalling/Unmarshal.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/unmarshalling/Unmarshaller.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/unmarshalling/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/unmarshalling/Unmarshal.html](https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/unmarshalling/Unmarshal.html)*