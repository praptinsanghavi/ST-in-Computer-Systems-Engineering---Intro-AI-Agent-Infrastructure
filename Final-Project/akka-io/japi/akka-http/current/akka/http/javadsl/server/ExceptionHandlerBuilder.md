---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T23:47:17Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/server/ExceptionHandlerBuilder.html
title: ExceptionHandlerBuilder
---

# ExceptionHandlerBuilder

## Content

Package [akka.http.javadsl.server](package-summary.html)
## Class ExceptionHandlerBuilder

- java.lang.Object
- - akka.http.javadsl.server.ExceptionHandlerBuilder

- ---

```
public class ExceptionHandlerBuilder
extends java.lang.Object
```

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[ExceptionHandlerBuilder](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[ExceptionHandler](ExceptionHandler.html "class in akka.http.javadsl.server")` | `[build](#build())()` |  |
	| `<P extends java.lang.Throwable>[ExceptionHandlerBuilder](ExceptionHandlerBuilder.html "class in akka.http.javadsl.server")` | `[match](#match(java.lang.Class,akka.japi.pf.FI.Apply))​(java.lang.Class<P> type,  akka.japi.pf.FI.Apply<P,​[Route](Route.html "interface in akka.http.javadsl.server")> apply)` | Add a new case statement to this builder. |
	| `<P extends java.lang.Throwable>[ExceptionHandlerBuilder](ExceptionHandlerBuilder.html "class in akka.http.javadsl.server")` | `[match](#match(java.lang.Class,akka.japi.pf.FI.TypedPredicate,akka.japi.pf.FI.Apply))​(java.lang.Class<P> type,  akka.japi.pf.FI.TypedPredicate<P> predicate,  akka.japi.pf.FI.Apply<P,​[Route](Route.html "interface in akka.http.javadsl.server")> apply)` | Add a new case statement to this builder. |
	| `[ExceptionHandlerBuilder](ExceptionHandlerBuilder.html "class in akka.http.javadsl.server")` | `[matchAny](#matchAny(akka.japi.pf.FI.Apply))​(akka.japi.pf.FI.Apply<java.lang.Throwable,​[Route](Route.html "interface in akka.http.javadsl.server")> apply)` | Add a new case statement to this builder, that matches any argument. |
	| `<P extends java.lang.Throwable>[ExceptionHandlerBuilder](ExceptionHandlerBuilder.html "class in akka.http.javadsl.server")` | `[matchEquals](#matchEquals(P,akka.japi.pf.FI.Apply))​(P object,  akka.japi.pf.FI.Apply<P,​[Route](Route.html "interface in akka.http.javadsl.server")> apply)` | Add a new case statement to this builder. |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### ExceptionHandlerBuilder
		
		
		
		```
		public ExceptionHandlerBuilder()
		```

	- ### Method Detail
	
	
	
		- #### match
		
		
		
		```
		public <P extends java.lang.Throwable> [ExceptionHandlerBuilder](ExceptionHandlerBuilder.html "class in akka.http.javadsl.server") match​(java.lang.Class<P> type,
		                                                                     akka.japi.pf.FI.Apply<P,​[Route](Route.html "interface in akka.http.javadsl.server")> apply)
		```
		
		Add a new case statement to this builder.
		
		Parameters:
		`type` \- a type to match the argument against
		`apply` \- an action to apply to the argument if the type matches
		Returns:
		a builder with the case statement added
		- #### match
		
		
		
		```
		public <P extends java.lang.Throwable> [ExceptionHandlerBuilder](ExceptionHandlerBuilder.html "class in akka.http.javadsl.server") match​(java.lang.Class<P> type,
		                                                                     akka.japi.pf.FI.TypedPredicate<P> predicate,
		                                                                     akka.japi.pf.FI.Apply<P,​[Route](Route.html "interface in akka.http.javadsl.server")> apply)
		```
		
		Add a new case statement to this builder.
		
		Parameters:
		`type` \- a type to match the argument against
		`predicate` \- a predicate that will be evaluated on the argument if the type matches
		`apply` \- an action to apply to the argument if the type matches and the predicate returns true
		Returns:
		a builder with the case statement added
		- #### matchEquals
		
		
		
		```
		public <P extends java.lang.Throwable> [ExceptionHandlerBuilder](ExceptionHandlerBuilder.html "class in akka.http.javadsl.server") matchEquals​(P object,
		                                                                           akka.japi.pf.FI.Apply<P,​[Route](Route.html "interface in akka.http.javadsl.server")> apply)
		```
		
		Add a new case statement to this builder.
		
		Parameters:
		`object` \- the object to compare equals with
		`apply` \- an action to apply to the argument if the object compares equal
		Returns:
		a builder with the case statement added
		- #### matchAny
		
		
		
		```
		public [ExceptionHandlerBuilder](ExceptionHandlerBuilder.html "class in akka.http.javadsl.server") matchAny​(akka.japi.pf.FI.Apply<java.lang.Throwable,​[Route](Route.html "interface in akka.http.javadsl.server")> apply)
		```
		
		Add a new case statement to this builder, that matches any argument.
		
		Parameters:
		`apply` \- an action to apply to the argument
		Returns:
		a builder with the case statement added
		- #### build
		
		
		
		```
		public [ExceptionHandler](ExceptionHandler.html "class in akka.http.javadsl.server") build()
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/server/ExceptionHandler.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/server/ExceptionHandlerBuilder.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/server/Route.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/server/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/server/ExceptionHandlerBuilder.html](https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/server/ExceptionHandlerBuilder.html)*