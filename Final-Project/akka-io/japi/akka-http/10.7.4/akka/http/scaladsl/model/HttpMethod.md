---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T02:11:23Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/model/HttpMethod.html
title: HttpMethod
---

# HttpMethod

## Content

Package [akka.http.scaladsl.model](package-summary.html)
## Class HttpMethod

- java.lang.Object
- - [akka.http.javadsl.model.HttpMethod](../../javadsl/model/HttpMethod.html "class in akka.http.javadsl.model")
	- - akka.http.scaladsl.model.HttpMethod

- All Implemented Interfaces:
`[Renderable](../../impl/util/Renderable.html "interface in akka.http.impl.util")`, `[SingletonValueRenderable](../../impl/util/SingletonValueRenderable.html "interface in akka.http.impl.util")`, `java.io.Serializable`, `scala.Equals`, `scala.Product`

---

```
public final class HttpMethod
extends [HttpMethod](../../javadsl/model/HttpMethod.html "class in akka.http.javadsl.model")
implements [SingletonValueRenderable](../../impl/util/SingletonValueRenderable.html "interface in akka.http.impl.util"), scala.Product, java.io.Serializable
```

The method of an HTTP request.
 param: isSafe true if the resource should not be altered on the server
 param: isIdempotent true if requests can be safely (\& automatically) repeated
 param: requestEntityAcceptance Expected if meaning of request entities is properly defined
 param: contentLengthAllowed Function defining whether the method\-statuscode combination should output the Content\-Length header.

See Also:
[Serialized Form](../../../../serialized-form.html#akka.http.scaladsl.model.HttpMethod)

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[HttpMethod](#%3Cinit%3E(java.lang.String,boolean,boolean,akka.http.scaladsl.model.RequestEntityAcceptance,scala.Function1))​(java.lang.String value,  boolean isSafe,  boolean isIdempotent,  [RequestEntityAcceptance](RequestEntityAcceptance.html "interface in akka.http.scaladsl.model") requestEntityAcceptance,  scala.Function1<[StatusCode](StatusCode.html "class in akka.http.scaladsl.model"),​java.lang.Object> contentLengthAllowed)` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) [Deprecated Methods](javascript:show(32);) 
	| Modifier and Type | Method | Description |
	| `scala.Function1<[StatusCode](StatusCode.html "class in akka.http.scaladsl.model"),​java.lang.Object>` | `[contentLengthAllowed](#contentLengthAllowed())()` |  |
	| `static [HttpMethod](HttpMethod.html "class in akka.http.scaladsl.model")` | `[custom](#custom(java.lang.String))​(java.lang.String name)` | Creates a custom method by name and assumes properties conservatively to be  safe \= false, idempotent \= false, requestEntityAcceptance \= Expected and contentLengthAllowed always true. |
	| `static [HttpMethod](HttpMethod.html "class in akka.http.scaladsl.model")` | `[custom](#custom(java.lang.String,boolean,boolean,akka.http.scaladsl.model.RequestEntityAcceptance))​(java.lang.String name,  boolean safe,  boolean idempotent,  [RequestEntityAcceptance](RequestEntityAcceptance.html "interface in akka.http.scaladsl.model") requestEntityAcceptance)` | Deprecated. The created method will compute the presence of Content\-Length headers based on deprecated logic (before issue \#4213\). |
	| `static [HttpMethod](HttpMethod.html "class in akka.http.scaladsl.model")` | `[custom](#custom(java.lang.String,boolean,boolean,akka.http.scaladsl.model.RequestEntityAcceptance,boolean))​(java.lang.String name,  boolean safe,  boolean idempotent,  [RequestEntityAcceptance](RequestEntityAcceptance.html "interface in akka.http.scaladsl.model") requestEntityAcceptance,  boolean contentLengthAllowed)` | Create a custom method type. |
	| `boolean` | `[isEntityAccepted](#isEntityAccepted())()` | Returns if requests with this method may contain an entity. |
	| `boolean` | `[isIdempotent](#isIdempotent())()` | Returns if this method is "idempotent" as defined in  http://tools.ietf.org/html/draft\-ietf\-httpbis\-p2\-semantics\-26\#section\-4\.2\.2 |
	| `boolean` | `[isSafe](#isSafe())()` | Returns if this method is "safe" as defined in  http://tools.ietf.org/html/draft\-ietf\-httpbis\-p2\-semantics\-26\#section\-4\.2\.1 |
	| `[RequestEntityAcceptance](RequestEntityAcceptance.html "interface in akka.http.scaladsl.model")` | `[requestEntityAcceptance](#requestEntityAcceptance())()` |  |
	| `java.lang.String` | `[toString](#toString())()` |  |
	| `java.lang.String` | `[value](#value())()` | Returns the name of the method. |
	
	
		- ### Methods inherited from class akka.http.javadsl.model.[HttpMethod](../../javadsl/model/HttpMethod.html "class in akka.http.javadsl.model")
		
		
		`[name](../../javadsl/model/HttpMethod.html#name())`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, wait, wait, wait`
		- ### Methods inherited from interface scala.Equals
		
		
		`canEqual, equals`
		- ### Methods inherited from interface scala.Product
		
		
		`productArity, productElement, productElementName, productElementNames, productIterator, productPrefix`
		- ### Methods inherited from interface akka.http.impl.util.[SingletonValueRenderable](../../impl/util/SingletonValueRenderable.html "interface in akka.http.impl.util")
		
		
		`[render](../../impl/util/SingletonValueRenderable.html#render(R))`

- - ### Constructor Detail
	
	
	
		- #### HttpMethod
		
		
		
		```
		public HttpMethod​(java.lang.String value,
		                  boolean isSafe,
		                  boolean isIdempotent,
		                  [RequestEntityAcceptance](RequestEntityAcceptance.html "interface in akka.http.scaladsl.model") requestEntityAcceptance,
		                  scala.Function1<[StatusCode](StatusCode.html "class in akka.http.scaladsl.model"),​java.lang.Object> contentLengthAllowed)
		```

	- ### Method Detail
	
	
	
		- #### custom
		
		
		
		```
		public static [HttpMethod](HttpMethod.html "class in akka.http.scaladsl.model") custom​(java.lang.String name,
		                                boolean safe,
		                                boolean idempotent,
		                                [RequestEntityAcceptance](RequestEntityAcceptance.html "interface in akka.http.scaladsl.model") requestEntityAcceptance)
		```
		
		Deprecated.
		The created method will compute the presence of Content\-Length headers based on deprecated logic (before issue \#4213\).
		
		Create a custom method type.
		
		Parameters:
		`name` \- (undocumented)
		`safe` \- (undocumented)
		`idempotent` \- (undocumented)
		`requestEntityAcceptance` \- (undocumented)
		Returns:
		(undocumented)
		- #### custom
		
		
		
		```
		public static [HttpMethod](HttpMethod.html "class in akka.http.scaladsl.model") custom​(java.lang.String name,
		                                boolean safe,
		                                boolean idempotent,
		                                [RequestEntityAcceptance](RequestEntityAcceptance.html "interface in akka.http.scaladsl.model") requestEntityAcceptance,
		                                boolean contentLengthAllowed)
		```
		
		Create a custom method type.
		
		Parameters:
		`name` \- (undocumented)
		`safe` \- (undocumented)
		`idempotent` \- (undocumented)
		`requestEntityAcceptance` \- (undocumented)
		`contentLengthAllowed` \- (undocumented)
		Returns:
		(undocumented)
		- #### custom
		
		
		
		```
		public static [HttpMethod](HttpMethod.html "class in akka.http.scaladsl.model") custom​(java.lang.String name)
		```
		
		Creates a custom method by name and assumes properties conservatively to be
		 safe \= false, idempotent \= false, requestEntityAcceptance \= Expected and contentLengthAllowed always true.
		
		Parameters:
		`name` \- (undocumented)
		Returns:
		(undocumented)
		- #### value
		
		
		
		```
		public java.lang.String value()
		```
		
		Description copied from class: `[HttpMethod](../../javadsl/model/HttpMethod.html#value())`
		Returns the name of the method.
		
		Specified by:
		`[value](../../impl/util/SingletonValueRenderable.html#value())` in interface `[SingletonValueRenderable](../../impl/util/SingletonValueRenderable.html "interface in akka.http.impl.util")`
		Specified by:
		`[value](../../javadsl/model/HttpMethod.html#value())` in class `[HttpMethod](../../javadsl/model/HttpMethod.html "class in akka.http.javadsl.model")`
		- #### isSafe
		
		
		
		```
		public boolean isSafe()
		```
		
		Description copied from class: `[HttpMethod](../../javadsl/model/HttpMethod.html#isSafe())`
		Returns if this method is "safe" as defined in
		 http://tools.ietf.org/html/draft\-ietf\-httpbis\-p2\-semantics\-26\#section\-4\.2\.1
		
		Specified by:
		`[isSafe](../../javadsl/model/HttpMethod.html#isSafe())` in class `[HttpMethod](../../javadsl/model/HttpMethod.html "class in akka.http.javadsl.model")`
		- #### isIdempotent
		
		
		
		```
		public boolean isIdempotent()
		```
		
		Description copied from class: `[HttpMethod](../../javadsl/model/HttpMethod.html#isIdempotent())`
		Returns if this method is "idempotent" as defined in
		 http://tools.ietf.org/html/draft\-ietf\-httpbis\-p2\-semantics\-26\#section\-4\.2\.2
		
		Specified by:
		`[isIdempotent](../../javadsl/model/HttpMethod.html#isIdempotent())` in class `[HttpMethod](../../javadsl/model/HttpMethod.html "class in akka.http.javadsl.model")`
		- #### requestEntityAcceptance
		
		
		
		```
		public [RequestEntityAcceptance](RequestEntityAcceptance.html "interface in akka.http.scaladsl.model") requestEntityAcceptance()
		```
		- #### contentLengthAllowed
		
		
		
		```
		public scala.Function1<[StatusCode](StatusCode.html "class in akka.http.scaladsl.model"),​java.lang.Object> contentLengthAllowed()
		```
		- #### isEntityAccepted
		
		
		
		```
		public boolean isEntityAccepted()
		```
		
		Description copied from class: `[HttpMethod](../../javadsl/model/HttpMethod.html#isEntityAccepted())`
		Returns if requests with this method may contain an entity.
		
		Specified by:
		`[isEntityAccepted](../../javadsl/model/HttpMethod.html#isEntityAccepted())` in class `[HttpMethod](../../javadsl/model/HttpMethod.html "class in akka.http.javadsl.model")`
		- #### toString
		
		
		
		```
		public java.lang.String toString()
		```
		
		
		Overrides:
		`toString` in class `java.lang.Object`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/impl/util/Renderable.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/impl/util/SingletonValueRenderable.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/HttpMethod.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/model/HttpMethod.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/model/RequestEntityAcceptance.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/model/StatusCode.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/model/package-summary.html
- https://doc.akka.io/japi/akka-http/10.7.4/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/model/HttpMethod.html](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/model/HttpMethod.html)*