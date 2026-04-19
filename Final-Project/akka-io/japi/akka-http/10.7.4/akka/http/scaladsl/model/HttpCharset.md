---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T02:11:07Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/model/HttpCharset.html
title: HttpCharset
---

# HttpCharset

## Content

Package [akka.http.scaladsl.model](package-summary.html)
## Class HttpCharset

- java.lang.Object
- - [akka.http.javadsl.model.HttpCharset](../../javadsl/model/HttpCharset.html "class in akka.http.javadsl.model")
	- - akka.http.scaladsl.model.HttpCharset

- All Implemented Interfaces:
`[Renderable](../../impl/util/Renderable.html "interface in akka.http.impl.util")`, `[SingletonValueRenderable](../../impl/util/SingletonValueRenderable.html "interface in akka.http.impl.util")`, `[WithQValue](WithQValue.html "interface in akka.http.scaladsl.model")<[HttpCharsetRange](HttpCharsetRange.html "class in akka.http.scaladsl.model")>`, `java.io.Serializable`, `scala.Equals`, `scala.Product`

---

```
public final class HttpCharset
extends [HttpCharset](../../javadsl/model/HttpCharset.html "class in akka.http.javadsl.model")
implements [SingletonValueRenderable](../../impl/util/SingletonValueRenderable.html "interface in akka.http.impl.util"), [WithQValue](WithQValue.html "interface in akka.http.scaladsl.model")<[HttpCharsetRange](HttpCharsetRange.html "class in akka.http.scaladsl.model")>, scala.Product, java.io.Serializable
```

See Also:
[Serialized Form](../../../../serialized-form.html#akka.http.scaladsl.model.HttpCharset)

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[HttpCharset](#%3Cinit%3E(java.lang.String,scala.collection.immutable.Seq))​(java.lang.String value,  scala.collection.immutable.Seq<java.lang.String> aliases)` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `scala.collection.immutable.Seq<java.lang.String>` | `[aliases](#aliases())()` |  |
	| `static [HttpCharset](HttpCharset.html "class in akka.http.scaladsl.model")` | `[custom](#custom(java.lang.String,scala.collection.immutable.Seq))​(java.lang.String value,  scala.collection.immutable.Seq<java.lang.String> aliases)` |  |
	| `static scala.util.Try<java.nio.charset.Charset>` | `[findNioCharset](#findNioCharset(java.lang.String))​(java.lang.String name)` |  |
	| `java.lang.Iterable<java.lang.String>` | `[getAliases](#getAliases())()` | Java API |
	| `java.nio.charset.Charset` | `[nioCharset](#nioCharset())()` | Returns the Charset for this charset if available or throws an exception otherwise |
	| `[HttpCharsetRange](HttpCharsetRange.html "class in akka.http.scaladsl.model")` | `[toRange](#toRange())()` | Creates a range from this charset with qValue \= 1\. |
	| `java.lang.String` | `[value](#value())()` | Returns the name of this charset. |
	| `[HttpCharsetRange](HttpCharsetRange.html "class in akka.http.scaladsl.model")` | `[withQValue](#withQValue(float))​(float qValue)` | An alias for toRange(float). |
	
	
		- ### Methods inherited from class akka.http.javadsl.model.[HttpCharset](../../javadsl/model/HttpCharset.html "class in akka.http.javadsl.model")
		
		
		`[toRange](../../javadsl/model/HttpCharset.html#toRange(float))`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`
		- ### Methods inherited from interface scala.Equals
		
		
		`canEqual, equals`
		- ### Methods inherited from interface scala.Product
		
		
		`productArity, productElement, productElementName, productElementNames, productIterator, productPrefix`
		- ### Methods inherited from interface akka.http.impl.util.[SingletonValueRenderable](../../impl/util/SingletonValueRenderable.html "interface in akka.http.impl.util")
		
		
		`[render](../../impl/util/SingletonValueRenderable.html#render(R))`
		- ### Methods inherited from interface akka.http.scaladsl.model.[WithQValue](WithQValue.html "interface in akka.http.scaladsl.model")
		
		
		`[withQValue](WithQValue.html#withQValue(double))`

- - ### Constructor Detail
	
	
	
		- #### HttpCharset
		
		
		
		```
		public HttpCharset​(java.lang.String value,
		                   scala.collection.immutable.Seq<java.lang.String> aliases)
		```

	- ### Method Detail
	
	
	
		- #### custom
		
		
		
		```
		public static [HttpCharset](HttpCharset.html "class in akka.http.scaladsl.model") custom​(java.lang.String value,
		                                 scala.collection.immutable.Seq<java.lang.String> aliases)
		```
		- #### findNioCharset
		
		
		
		```
		public static scala.util.Try<java.nio.charset.Charset> findNioCharset​(java.lang.String name)
		```
		- #### value
		
		
		
		```
		public java.lang.String value()
		```
		
		Description copied from class: `[HttpCharset](../../javadsl/model/HttpCharset.html#value())`
		Returns the name of this charset.
		
		Specified by:
		`[value](../../impl/util/SingletonValueRenderable.html#value())` in interface `[SingletonValueRenderable](../../impl/util/SingletonValueRenderable.html "interface in akka.http.impl.util")`
		Specified by:
		`[value](../../javadsl/model/HttpCharset.html#value())` in class `[HttpCharset](../../javadsl/model/HttpCharset.html "class in akka.http.javadsl.model")`
		- #### aliases
		
		
		
		```
		public scala.collection.immutable.Seq<java.lang.String> aliases()
		```
		- #### nioCharset
		
		
		
		```
		public java.nio.charset.Charset nioCharset()
		```
		
		Returns the Charset for this charset if available or throws an exception otherwise
		
		Specified by:
		`[nioCharset](../../javadsl/model/HttpCharset.html#nioCharset())` in class `[HttpCharset](../../javadsl/model/HttpCharset.html "class in akka.http.javadsl.model")`
		- #### withQValue
		
		
		
		```
		public [HttpCharsetRange](HttpCharsetRange.html "class in akka.http.scaladsl.model") withQValue​(float qValue)
		```
		
		Description copied from class: `[HttpCharset](../../javadsl/model/HttpCharset.html#withQValue(float))`
		An alias for toRange(float).
		
		Specified by:
		`[withQValue](WithQValue.html#withQValue(float))` in interface `[WithQValue](WithQValue.html "interface in akka.http.scaladsl.model")<[HttpCharsetRange](HttpCharsetRange.html "class in akka.http.scaladsl.model")>`
		Specified by:
		`[withQValue](../../javadsl/model/HttpCharset.html#withQValue(float))` in class `[HttpCharset](../../javadsl/model/HttpCharset.html "class in akka.http.javadsl.model")`
		- #### toRange
		
		
		
		```
		public [HttpCharsetRange](HttpCharsetRange.html "class in akka.http.scaladsl.model") toRange()
		```
		
		Description copied from class: `[HttpCharset](../../javadsl/model/HttpCharset.html#toRange())`
		Creates a range from this charset with qValue \= 1\.
		
		Overrides:
		`[toRange](../../javadsl/model/HttpCharset.html#toRange())` in class `[HttpCharset](../../javadsl/model/HttpCharset.html "class in akka.http.javadsl.model")`
		- #### getAliases
		
		
		
		```
		public java.lang.Iterable<java.lang.String> getAliases()
		```
		
		Java API
		
		Specified by:
		`[getAliases](../../javadsl/model/HttpCharset.html#getAliases())` in class `[HttpCharset](../../javadsl/model/HttpCharset.html "class in akka.http.javadsl.model")`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/impl/util/Renderable.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/impl/util/SingletonValueRenderable.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/HttpCharset.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/model/HttpCharset.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/model/HttpCharsetRange.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/model/WithQValue.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/model/package-summary.html
- https://doc.akka.io/japi/akka-http/10.7.4/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/model/HttpCharset.html](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/model/HttpCharset.html)*