---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T23:46:42Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/TransferEncoding.html
title: TransferEncoding
---

# TransferEncoding

## Content

Package [akka.http.javadsl.model](package-summary.html)
## Class TransferEncoding

- java.lang.Object
- - akka.http.javadsl.model.TransferEncoding

- Direct Known Subclasses:
`[TransferEncoding](../../scaladsl/model/TransferEncoding.html "class in akka.http.scaladsl.model")`

---

```
public abstract class TransferEncoding
extends java.lang.Object
```

See Also:
[`for convenience access to often used values.`](TransferEncodings.html "class in akka.http.javadsl.model")

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[TransferEncoding](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `static [TransferEncoding](TransferEncoding.html "class in akka.http.javadsl.model")` | `[createExtension](#createExtension(java.lang.String))​(java.lang.String name)` |  |
	| `static [TransferEncoding](TransferEncoding.html "class in akka.http.javadsl.model")` | `[createExtension](#createExtension(java.lang.String,java.util.Map))​(java.lang.String name,  java.util.Map<java.lang.String,​java.lang.String> params)` |  |
	| `abstract java.util.Map<java.lang.String,​java.lang.String>` | `[getParams](#getParams())()` |  |
	| `abstract java.lang.String` | `[name](#name())()` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### TransferEncoding
		
		
		
		```
		public TransferEncoding()
		```

	- ### Method Detail
	
	
	
		- #### name
		
		
		
		```
		public abstract java.lang.String name()
		```
		- #### getParams
		
		
		
		```
		public abstract java.util.Map<java.lang.String,​java.lang.String> getParams()
		```
		- #### createExtension
		
		
		
		```
		public static [TransferEncoding](TransferEncoding.html "class in akka.http.javadsl.model") createExtension​(java.lang.String name)
		```
		- #### createExtension
		
		
		
		```
		public static [TransferEncoding](TransferEncoding.html "class in akka.http.javadsl.model") createExtension​(java.lang.String name,
		                                               java.util.Map<java.lang.String,​java.lang.String> params)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/TransferEncoding.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/TransferEncodings.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/package-summary.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/TransferEncoding.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/TransferEncoding.html](https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/TransferEncoding.html)*