---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T23:34:43Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/impl/util/EnhancedByteStringSource.html
title: EnhancedByteStringSource
---

# EnhancedByteStringSource

## Content

Package [akka.http.impl.util](package-summary.html)
## Class EnhancedByteStringSource\<Mat\>

- java.lang.Object
- - scala.AnyVal
	- - akka.http.impl.util.EnhancedByteStringSource\<Mat\>

- ---

```
public class EnhancedByteStringSource<Mat>
extends scala.AnyVal
```

INTERNAL API

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[EnhancedByteStringSource](#%3Cinit%3E(akka.stream.scaladsl.Source))​(akka.stream.scaladsl.Source<akka.util.ByteString,​[Mat](EnhancedByteStringSource.html "type parameter in EnhancedByteStringSource")> byteStringStream)` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `akka.stream.scaladsl.Source<akka.util.ByteString,​[Mat](EnhancedByteStringSource.html "type parameter in EnhancedByteStringSource")>` | `[byteStringStream](#byteStringStream())()` |  |
	| `scala.concurrent.Future<akka.util.ByteString>` | `[join](#join(akka.stream.Materializer))​(akka.stream.Materializer materializer)` |  |
	| `scala.concurrent.Future<java.lang.String>` | `[utf8String](#utf8String(akka.stream.Materializer,scala.concurrent.ExecutionContext))​(akka.stream.Materializer materializer,  scala.concurrent.ExecutionContext ec)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### EnhancedByteStringSource
		
		
		
		```
		public EnhancedByteStringSource​(akka.stream.scaladsl.Source<akka.util.ByteString,​[Mat](EnhancedByteStringSource.html "type parameter in EnhancedByteStringSource")> byteStringStream)
		```

	- ### Method Detail
	
	
	
		- #### byteStringStream
		
		
		
		```
		public akka.stream.scaladsl.Source<akka.util.ByteString,​[Mat](EnhancedByteStringSource.html "type parameter in EnhancedByteStringSource")> byteStringStream()
		```
		- #### join
		
		
		
		```
		public scala.concurrent.Future<akka.util.ByteString> join​(akka.stream.Materializer materializer)
		```
		- #### utf8String
		
		
		
		```
		public scala.concurrent.Future<java.lang.String> utf8String​(akka.stream.Materializer materializer,
		                                                            scala.concurrent.ExecutionContext ec)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/impl/util/EnhancedByteStringSource.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/util/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/impl/util/EnhancedByteStringSource.html](https://doc.akka.io/japi/akka-http/current/akka/http/impl/util/EnhancedByteStringSource.html)*