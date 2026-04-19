---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T02:11:51Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/model/headers/HttpEncoding.html
title: HttpEncoding
---

# HttpEncoding

## Content

Package [akka.http.scaladsl.model.headers](package-summary.html)
## Class HttpEncoding

- java.lang.Object
- - [akka.http.javadsl.model.headers.HttpEncoding](../../../javadsl/model/headers/HttpEncoding.html "class in akka.http.javadsl.model.headers")
	- - akka.http.scaladsl.model.headers.HttpEncoding

- All Implemented Interfaces:
`[LazyValueBytesRenderable](../../../impl/util/LazyValueBytesRenderable.html "interface in akka.http.impl.util")`, `[Renderable](../../../impl/util/Renderable.html "interface in akka.http.impl.util")`, `[WithQValue](../WithQValue.html "interface in akka.http.scaladsl.model")<[HttpEncodingRange](HttpEncodingRange.html "class in akka.http.scaladsl.model.headers")>`, `java.io.Serializable`, `scala.Equals`, `scala.Product`

---

```
public final class HttpEncoding
extends [HttpEncoding](../../../javadsl/model/headers/HttpEncoding.html "class in akka.http.javadsl.model.headers")
implements [LazyValueBytesRenderable](../../../impl/util/LazyValueBytesRenderable.html "interface in akka.http.impl.util"), [WithQValue](../WithQValue.html "interface in akka.http.scaladsl.model")<[HttpEncodingRange](HttpEncodingRange.html "class in akka.http.scaladsl.model.headers")>, scala.Product, java.io.Serializable
```

See Also:
[Serialized Form](../../../../../serialized-form.html#akka.http.scaladsl.model.headers.HttpEncoding)

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[HttpEncoding](#%3Cinit%3E(java.lang.String))​(java.lang.String value)` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `static [HttpEncoding](HttpEncoding.html "class in akka.http.scaladsl.model.headers")` | `[custom](#custom(java.lang.String))​(java.lang.String value)` |  |
	| `java.lang.String` | `[value](#value())()` |  |
	| `[HttpEncodingRange](HttpEncodingRange.html "class in akka.http.scaladsl.model.headers")` | `[withQValue](#withQValue(float))​(float qValue)` |  |
	
	
		- ### Methods inherited from class akka.http.javadsl.model.headers.[HttpEncoding](../../../javadsl/model/headers/HttpEncoding.html "class in akka.http.javadsl.model.headers")
		
		
		`[toRange](../../../javadsl/model/headers/HttpEncoding.html#toRange())`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`
		- ### Methods inherited from interface scala.Equals
		
		
		`canEqual, equals`
		- ### Methods inherited from interface akka.http.impl.util.[LazyValueBytesRenderable](../../../impl/util/LazyValueBytesRenderable.html "interface in akka.http.impl.util")
		
		
		`[render](../../../impl/util/LazyValueBytesRenderable.html#render(R)), [toString](../../../impl/util/LazyValueBytesRenderable.html#toString()), [valueBytes](../../../impl/util/LazyValueBytesRenderable.html#valueBytes())`
		- ### Methods inherited from interface scala.Product
		
		
		`productArity, productElement, productElementName, productElementNames, productIterator, productPrefix`
		- ### Methods inherited from interface akka.http.scaladsl.model.[WithQValue](../WithQValue.html "interface in akka.http.scaladsl.model")
		
		
		`[withQValue](../WithQValue.html#withQValue(double))`

- - ### Constructor Detail
	
	
	
		- #### HttpEncoding
		
		
		
		```
		public HttpEncoding​(java.lang.String value)
		```

	- ### Method Detail
	
	
	
		- #### custom
		
		
		
		```
		public static [HttpEncoding](HttpEncoding.html "class in akka.http.scaladsl.model.headers") custom​(java.lang.String value)
		```
		- #### value
		
		
		
		```
		public java.lang.String value()
		```
		
		
		Specified by:
		`[value](../../../impl/util/LazyValueBytesRenderable.html#value())` in interface `[LazyValueBytesRenderable](../../../impl/util/LazyValueBytesRenderable.html "interface in akka.http.impl.util")`
		Specified by:
		`[value](../../../javadsl/model/headers/HttpEncoding.html#value())` in class `[HttpEncoding](../../../javadsl/model/headers/HttpEncoding.html "class in akka.http.javadsl.model.headers")`
		- #### withQValue
		
		
		
		```
		public [HttpEncodingRange](HttpEncodingRange.html "class in akka.http.scaladsl.model.headers") withQValue​(float qValue)
		```
		
		
		Specified by:
		`[withQValue](../WithQValue.html#withQValue(float))` in interface `[WithQValue](../WithQValue.html "interface in akka.http.scaladsl.model")<[HttpEncodingRange](HttpEncodingRange.html "class in akka.http.scaladsl.model.headers")>`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/impl/util/LazyValueBytesRenderable.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/impl/util/Renderable.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/headers/HttpEncoding.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/model/WithQValue.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/model/headers/HttpEncoding.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/model/headers/HttpEncodingRange.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/model/headers/package-summary.html
- https://doc.akka.io/japi/akka-http/10.7.4/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/model/headers/HttpEncoding.html](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/model/headers/HttpEncoding.html)*