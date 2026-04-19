---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T00:31:16Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/HttpEntity.Strict$.html
title: HttpEntity.Strict$
---

# HttpEntity.Strict$

## Content

Package [akka.http.scaladsl.model](package-summary.html)
## Class HttpEntity.Strict$

- java.lang.Object
- - scala.runtime.AbstractFunction2\<[ContentType](ContentType.html "interface in akka.http.scaladsl.model"),​akka.util.ByteString,​[HttpEntity.Strict](HttpEntity.Strict.html "class in akka.http.scaladsl.model")\>
	- - akka.http.scaladsl.model.HttpEntity.Strict$

- All Implemented Interfaces:
`java.io.Serializable`, `scala.Function2<[ContentType](ContentType.html "interface in akka.http.scaladsl.model"),​akka.util.ByteString,​[HttpEntity.Strict](HttpEntity.Strict.html "class in akka.http.scaladsl.model")>`

Enclosing interface:
[HttpEntity](HttpEntity.html "interface in akka.http.scaladsl.model")

---

```
public static class HttpEntity.Strict$
extends scala.runtime.AbstractFunction2<[ContentType](ContentType.html "interface in akka.http.scaladsl.model"),​akka.util.ByteString,​[HttpEntity.Strict](HttpEntity.Strict.html "class in akka.http.scaladsl.model")>
implements java.io.Serializable
```

See Also:
[Serialized Form](../../../../serialized-form.html#akka.http.scaladsl.model.HttpEntity.Strict$)

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [HttpEntity.Strict$](HttpEntity.Strict$.html "class in akka.http.scaladsl.model")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[Strict$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[HttpEntity.Strict](HttpEntity.Strict.html "class in akka.http.scaladsl.model")` | `[apply](#apply(akka.http.scaladsl.model.ContentType,akka.util.ByteString))​([ContentType](ContentType.html "interface in akka.http.scaladsl.model") contentType,  akka.util.ByteString data)` |  |
	| `[HttpEntity.Strict](HttpEntity.Strict.html "class in akka.http.scaladsl.model")` | `[apply](#apply(akka.http.scaladsl.model.ContentType,akka.util.ByteString,boolean))​([ContentType](ContentType.html "interface in akka.http.scaladsl.model") contentType,  akka.util.ByteString data,  boolean reportContentLength)` |  |
	| `scala.Option<scala.Tuple2<[ContentType](ContentType.html "interface in akka.http.scaladsl.model"),​akka.util.ByteString>>` | `[unapply](#unapply(akka.http.scaladsl.model.HttpEntity.Strict))​([HttpEntity.Strict](HttpEntity.Strict.html "class in akka.http.scaladsl.model") strict)` |  |
	
	
		- ### Methods inherited from class scala.runtime.AbstractFunction2
		
		
		`apply$mcDDD$sp, apply$mcDDI$sp, apply$mcDDJ$sp, apply$mcDID$sp, apply$mcDII$sp, apply$mcDIJ$sp, apply$mcDJD$sp, apply$mcDJI$sp, apply$mcDJJ$sp, apply$mcFDD$sp, apply$mcFDI$sp, apply$mcFDJ$sp, apply$mcFID$sp, apply$mcFII$sp, apply$mcFIJ$sp, apply$mcFJD$sp, apply$mcFJI$sp, apply$mcFJJ$sp, apply$mcIDD$sp, apply$mcIDI$sp, apply$mcIDJ$sp, apply$mcIID$sp, apply$mcIII$sp, apply$mcIIJ$sp, apply$mcIJD$sp, apply$mcIJI$sp, apply$mcIJJ$sp, apply$mcJDD$sp, apply$mcJDI$sp, apply$mcJDJ$sp, apply$mcJID$sp, apply$mcJII$sp, apply$mcJIJ$sp, apply$mcJJD$sp, apply$mcJJI$sp, apply$mcJJJ$sp, apply$mcVDD$sp, apply$mcVDI$sp, apply$mcVDJ$sp, apply$mcVID$sp, apply$mcVII$sp, apply$mcVIJ$sp, apply$mcVJD$sp, apply$mcVJI$sp, apply$mcVJJ$sp, apply$mcZDD$sp, apply$mcZDI$sp, apply$mcZDJ$sp, apply$mcZID$sp, apply$mcZII$sp, apply$mcZIJ$sp, apply$mcZJD$sp, apply$mcZJI$sp, apply$mcZJJ$sp, curried, toString, tupled`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [HttpEntity.Strict$](HttpEntity.Strict$.html "class in akka.http.scaladsl.model") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### Strict$
		
		
		
		```
		public Strict$()
		```

	- ### Method Detail
	
	
	
		- #### apply
		
		
		
		```
		public [HttpEntity.Strict](HttpEntity.Strict.html "class in akka.http.scaladsl.model") apply​([ContentType](ContentType.html "interface in akka.http.scaladsl.model") contentType,
		                               akka.util.ByteString data)
		```
		
		
		Specified by:
		`apply` in interface `scala.Function2<[ContentType](ContentType.html "interface in akka.http.scaladsl.model"),​akka.util.ByteString,​[HttpEntity.Strict](HttpEntity.Strict.html "class in akka.http.scaladsl.model")>`
		- #### apply
		
		
		
		```
		public [HttpEntity.Strict](HttpEntity.Strict.html "class in akka.http.scaladsl.model") apply​([ContentType](ContentType.html "interface in akka.http.scaladsl.model") contentType,
		                               akka.util.ByteString data,
		                               boolean reportContentLength)
		```
		- #### unapply
		
		
		
		```
		public scala.Option<scala.Tuple2<[ContentType](ContentType.html "interface in akka.http.scaladsl.model"),​akka.util.ByteString>> unapply​([HttpEntity.Strict](HttpEntity.Strict.html "class in akka.http.scaladsl.model") strict)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/ContentType.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/HttpEntity.Strict$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/HttpEntity.Strict.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/HttpEntity.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/package-summary.html
- https://doc.akka.io/japi/akka-http/current/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/HttpEntity.Strict$.html](https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/HttpEntity.Strict$.html)*