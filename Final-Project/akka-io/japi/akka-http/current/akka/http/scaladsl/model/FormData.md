---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T00:30:54Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/FormData.html
title: FormData
---

# FormData

## Content

Package [akka.http.scaladsl.model](package-summary.html)
## Class FormData

- java.lang.Object
- - akka.http.scaladsl.model.FormData

- All Implemented Interfaces:
`java.io.Serializable`, `scala.Equals`, `scala.Product`

---

```
public final class FormData
extends java.lang.Object
implements scala.Product, java.io.Serializable
```

Simple model for `application/x-www-form-urlencoded` form data.

See Also:
[Serialized Form](../../../../serialized-form.html#akka.http.scaladsl.model.FormData)

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[FormData](#%3Cinit%3E(akka.http.scaladsl.model.Uri.Query))​([Uri.Query](Uri.Query.html "class in akka.http.scaladsl.model") fields)` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) [Deprecated Methods](javascript:show(32);) 
	| Modifier and Type | Method | Description |
	| `static [FormData](FormData.html "class in akka.http.scaladsl.model")` | `[apply](#apply(scala.collection.immutable.Map))​(scala.collection.immutable.Map<java.lang.String,​java.lang.String> fields)` |  |
	| `static [FormData](FormData.html "class in akka.http.scaladsl.model")` | `[apply](#apply(scala.collection.immutable.Seq))​(scala.collection.immutable.Seq<scala.Tuple2<java.lang.String,​java.lang.String>> fields)` |  |
	| `static [FormData](FormData.html "class in akka.http.scaladsl.model")` | `[Empty](#Empty())()` |  |
	| `[Uri.Query](Uri.Query.html "class in akka.http.scaladsl.model")` | `[fields](#fields())()` |  |
	| `[RequestEntity](RequestEntity.html "interface in akka.http.scaladsl.model")` | `[toEntity](#toEntity())()` |  |
	| `[RequestEntity](RequestEntity.html "interface in akka.http.scaladsl.model")` | `[toEntity](#toEntity(akka.http.scaladsl.model.HttpCharset))​([HttpCharset](HttpCharset.html "class in akka.http.scaladsl.model") charset)` | Deprecated. FormData always uses charset UTF\-8 without appending the charset to 'Content\-Type: application/x\-www\-form\-urlencoded', use toEntity instead. |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`
		- ### Methods inherited from interface scala.Equals
		
		
		`canEqual, equals`
		- ### Methods inherited from interface scala.Product
		
		
		`productArity, productElement, productElementName, productElementNames, productIterator, productPrefix`

- - ### Constructor Detail
	
	
	
		- #### FormData
		
		
		
		```
		public FormData​([Uri.Query](Uri.Query.html "class in akka.http.scaladsl.model") fields)
		```

	- ### Method Detail
	
	
	
		- #### Empty
		
		
		
		```
		public static [FormData](FormData.html "class in akka.http.scaladsl.model") Empty()
		```
		- #### apply
		
		
		
		```
		public static [FormData](FormData.html "class in akka.http.scaladsl.model") apply​(scala.collection.immutable.Map<java.lang.String,​java.lang.String> fields)
		```
		- #### apply
		
		
		
		```
		public static [FormData](FormData.html "class in akka.http.scaladsl.model") apply​(scala.collection.immutable.Seq<scala.Tuple2<java.lang.String,​java.lang.String>> fields)
		```
		- #### fields
		
		
		
		```
		public [Uri.Query](Uri.Query.html "class in akka.http.scaladsl.model") fields()
		```
		- #### toEntity
		
		
		
		```
		public [RequestEntity](RequestEntity.html "interface in akka.http.scaladsl.model") toEntity()
		```
		- #### toEntity
		
		
		
		```
		public [RequestEntity](RequestEntity.html "interface in akka.http.scaladsl.model") toEntity​([HttpCharset](HttpCharset.html "class in akka.http.scaladsl.model") charset)
		```
		
		Deprecated.
		FormData always uses charset UTF\-8 without appending the charset to 'Content\-Type: application/x\-www\-form\-urlencoded', use toEntity instead. Since 10\.1\.7\.

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/FormData.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/HttpCharset.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/RequestEntity.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/Uri.Query.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/package-summary.html
- https://doc.akka.io/japi/akka-http/current/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/FormData.html](https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/FormData.html)*