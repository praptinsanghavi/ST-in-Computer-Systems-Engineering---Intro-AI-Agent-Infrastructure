---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T00:30:43Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/ContentType$.html
title: ContentType$
---

# ContentType$

## Content

Package [akka.http.scaladsl.model](package-summary.html)
## Class ContentType$

- java.lang.Object
- - akka.http.scaladsl.model.ContentType$

- ---

```
public class ContentType$
extends java.lang.Object
```

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [ContentType$](ContentType$.html "class in akka.http.scaladsl.model")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[ContentType$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[ContentType.Binary](ContentType.Binary.html "class in akka.http.scaladsl.model")` | `[apply](#apply(akka.http.scaladsl.model.MediaType.Binary))​([MediaType.Binary](MediaType.Binary.html "class in akka.http.scaladsl.model") mediaType)` |  |
	| `[ContentType.WithFixedCharset](ContentType.WithFixedCharset.html "class in akka.http.scaladsl.model")` | `[apply](#apply(akka.http.scaladsl.model.MediaType.WithFixedCharset))​([MediaType.WithFixedCharset](MediaType.WithFixedCharset.html "class in akka.http.scaladsl.model") mediaType)` |  |
	| `[ContentType.WithCharset](ContentType.WithCharset.html "class in akka.http.scaladsl.model")` | `[apply](#apply(akka.http.scaladsl.model.MediaType.WithOpenCharset,akka.http.scaladsl.model.HttpCharset))​([MediaType.WithOpenCharset](MediaType.WithOpenCharset.html "class in akka.http.scaladsl.model") mediaType,  [HttpCharset](HttpCharset.html "class in akka.http.scaladsl.model") charset)` |  |
	| `[ContentType](ContentType.html "interface in akka.http.scaladsl.model")` | `[apply](#apply(akka.http.scaladsl.model.MediaType,scala.Function0))​([MediaType](MediaType.html "class in akka.http.scaladsl.model") mediaType,  scala.Function0<[HttpCharset](HttpCharset.html "class in akka.http.scaladsl.model")> charset)` |  |
	| `scala.util.Either<scala.collection.immutable.List<[ErrorInfo](ErrorInfo.html "class in akka.http.scaladsl.model")>,​[ContentType](ContentType.html "interface in akka.http.scaladsl.model")>` | `[parse](#parse(java.lang.String))​(java.lang.String value)` | Tries to parse a `ContentType` value from the given String. |
	| `scala.Option<scala.Tuple2<[MediaType](MediaType.html "class in akka.http.scaladsl.model"),​scala.Option<[HttpCharset](HttpCharset.html "class in akka.http.scaladsl.model")>>>` | `[unapply](#unapply(akka.http.scaladsl.model.ContentType))​([ContentType](ContentType.html "interface in akka.http.scaladsl.model") contentType)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [ContentType$](ContentType$.html "class in akka.http.scaladsl.model") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### ContentType$
		
		
		
		```
		public ContentType$()
		```

	- ### Method Detail
	
	
	
		- #### apply
		
		
		
		```
		public [ContentType.Binary](ContentType.Binary.html "class in akka.http.scaladsl.model") apply​([MediaType.Binary](MediaType.Binary.html "class in akka.http.scaladsl.model") mediaType)
		```
		- #### apply
		
		
		
		```
		public [ContentType.WithFixedCharset](ContentType.WithFixedCharset.html "class in akka.http.scaladsl.model") apply​([MediaType.WithFixedCharset](MediaType.WithFixedCharset.html "class in akka.http.scaladsl.model") mediaType)
		```
		- #### apply
		
		
		
		```
		public [ContentType.WithCharset](ContentType.WithCharset.html "class in akka.http.scaladsl.model") apply​([MediaType.WithOpenCharset](MediaType.WithOpenCharset.html "class in akka.http.scaladsl.model") mediaType,
		                                     [HttpCharset](HttpCharset.html "class in akka.http.scaladsl.model") charset)
		```
		- #### apply
		
		
		
		```
		public [ContentType](ContentType.html "interface in akka.http.scaladsl.model") apply​([MediaType](MediaType.html "class in akka.http.scaladsl.model") mediaType,
		                         scala.Function0<[HttpCharset](HttpCharset.html "class in akka.http.scaladsl.model")> charset)
		```
		- #### unapply
		
		
		
		```
		public scala.Option<scala.Tuple2<[MediaType](MediaType.html "class in akka.http.scaladsl.model"),​scala.Option<[HttpCharset](HttpCharset.html "class in akka.http.scaladsl.model")>>> unapply​([ContentType](ContentType.html "interface in akka.http.scaladsl.model") contentType)
		```
		- #### parse
		
		
		
		```
		public scala.util.Either<scala.collection.immutable.List<[ErrorInfo](ErrorInfo.html "class in akka.http.scaladsl.model")>,​[ContentType](ContentType.html "interface in akka.http.scaladsl.model")> parse​(java.lang.String value)
		```
		
		Tries to parse a `ContentType` value from the given String. Returns `Right(contentType)` if successful and
		 `Left(errors)` otherwise.
		
		Parameters:
		`value` \- (undocumented)
		Returns:
		(undocumented)

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/ContentType$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/ContentType.Binary.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/ContentType.WithCharset.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/ContentType.WithFixedCharset.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/ContentType.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/ErrorInfo.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/HttpCharset.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/MediaType.Binary.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/MediaType.WithFixedCharset.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/MediaType.WithOpenCharset.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/MediaType.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/ContentType$.html](https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/ContentType$.html)*