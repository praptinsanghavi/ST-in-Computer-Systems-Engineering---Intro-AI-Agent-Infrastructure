---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T00:32:56Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/TransferEncoding.html
title: TransferEncoding
---

# TransferEncoding

## Content

Package [akka.http.scaladsl.model](package-summary.html)
## Class TransferEncoding

- java.lang.Object
- - [akka.http.javadsl.model.TransferEncoding](../../javadsl/model/TransferEncoding.html "class in akka.http.javadsl.model")
	- - akka.http.scaladsl.model.TransferEncoding

- All Implemented Interfaces:
`[Renderable](../../impl/util/Renderable.html "interface in akka.http.impl.util")`

Direct Known Subclasses:
`[TransferEncodings.Extension](TransferEncodings.Extension.html "class in akka.http.scaladsl.model")`, `[TransferEncodings.Predefined](TransferEncodings.Predefined.html "class in akka.http.scaladsl.model")`

---

```
public abstract class TransferEncoding
extends [TransferEncoding](../../javadsl/model/TransferEncoding.html "class in akka.http.javadsl.model")
implements [Renderable](../../impl/util/Renderable.html "interface in akka.http.impl.util")
```

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[TransferEncoding](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `java.util.Map<java.lang.String,​java.lang.String>` | `[getParams](#getParams())()` |  |
	| `abstract java.lang.String` | `[name](#name())()` |  |
	| `abstract scala.collection.immutable.Map<java.lang.String,​java.lang.String>` | `[params](#params())()` |  |
	
	
		- ### Methods inherited from class akka.http.javadsl.model.[TransferEncoding](../../javadsl/model/TransferEncoding.html "class in akka.http.javadsl.model")
		
		
		`[createExtension](../../javadsl/model/TransferEncoding.html#createExtension(java.lang.String)), [createExtension](../../javadsl/model/TransferEncoding.html#createExtension(java.lang.String,java.util.Map))`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`
		- ### Methods inherited from interface akka.http.impl.util.[Renderable](../../impl/util/Renderable.html "interface in akka.http.impl.util")
		
		
		`[render](../../impl/util/Renderable.html#render(R))`

- - ### Constructor Detail
	
	
	
		- #### TransferEncoding
		
		
		
		```
		public TransferEncoding()
		```

	- ### Method Detail
	
	
	
		- #### getParams
		
		
		
		```
		public java.util.Map<java.lang.String,​java.lang.String> getParams()
		```
		
		
		Specified by:
		`[getParams](../../javadsl/model/TransferEncoding.html#getParams())` in class `[TransferEncoding](../../javadsl/model/TransferEncoding.html "class in akka.http.javadsl.model")`
		- #### name
		
		
		
		```
		public abstract java.lang.String name()
		```
		
		
		Specified by:
		`[name](../../javadsl/model/TransferEncoding.html#name())` in class `[TransferEncoding](../../javadsl/model/TransferEncoding.html "class in akka.http.javadsl.model")`
		- #### params
		
		
		
		```
		public abstract scala.collection.immutable.Map<java.lang.String,​java.lang.String> params()
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/impl/util/Renderable.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/TransferEncoding.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/TransferEncodings.Extension.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/TransferEncodings.Predefined.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/TransferEncoding.html](https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/TransferEncoding.html)*