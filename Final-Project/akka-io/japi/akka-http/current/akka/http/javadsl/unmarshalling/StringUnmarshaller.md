---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T00:28:00Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/unmarshalling/StringUnmarshaller.html
title: StringUnmarshaller
---

# StringUnmarshaller

## Content

Package [akka.http.javadsl.unmarshalling](package-summary.html)
## Class StringUnmarshaller

- java.lang.Object
- - akka.http.javadsl.unmarshalling.StringUnmarshaller

- ---

```
public class StringUnmarshaller
extends java.lang.Object
```

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[StringUnmarshaller](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `static <B> [Unmarshaller](Unmarshaller.html "class in akka.http.javadsl.unmarshalling")<java.lang.String,​B>` | `[async](#async(java.util.function.Function))​(java.util.function.Function<java.lang.String,​java.util.concurrent.CompletionStage<B>> f)` | Turns the given asynchronous function into an unmarshaller from String to B. |
	| `static <B> [Unmarshaller](Unmarshaller.html "class in akka.http.javadsl.unmarshalling")<java.lang.String,​B>` | `[sync](#sync(java.util.function.Function))​(java.util.function.Function<java.lang.String,​B> f)` | Turns the given function into an unmarshaller from String to B. |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### StringUnmarshaller
		
		
		
		```
		public StringUnmarshaller()
		```

	- ### Method Detail
	
	
	
		- #### async
		
		
		
		```
		public static <B> [Unmarshaller](Unmarshaller.html "class in akka.http.javadsl.unmarshalling")<java.lang.String,​B> async​(java.util.function.Function<java.lang.String,​java.util.concurrent.CompletionStage<B>> f)
		```
		
		Turns the given asynchronous function into an unmarshaller from String to B.
		
		Parameters:
		`f` \- (undocumented)
		Returns:
		(undocumented)
		- #### sync
		
		
		
		```
		public static <B> [Unmarshaller](Unmarshaller.html "class in akka.http.javadsl.unmarshalling")<java.lang.String,​B> sync​(java.util.function.Function<java.lang.String,​B> f)
		```
		
		Turns the given function into an unmarshaller from String to B.
		
		Parameters:
		`f` \- (undocumented)
		Returns:
		(undocumented)

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/unmarshalling/Unmarshaller.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/unmarshalling/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/unmarshalling/StringUnmarshaller.html](https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/unmarshalling/StringUnmarshaller.html)*