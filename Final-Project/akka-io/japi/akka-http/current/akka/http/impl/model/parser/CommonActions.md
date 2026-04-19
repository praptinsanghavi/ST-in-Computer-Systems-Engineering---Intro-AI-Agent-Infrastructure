---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T23:34:00Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/impl/model/parser/CommonActions.html
title: CommonActions
---

# CommonActions

## Content

Package [akka.http.impl.model.parser](package-summary.html)
## Interface CommonActions

- All Known Implementing Classes:
`[HeaderParser](HeaderParser.html "class in akka.http.impl.model.parser")`

---

```
public interface CommonActions
```

INTERNAL API

- - ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `scala.Function2<java.lang.String,​java.lang.String,​scala.Option<[MediaType](../../../scaladsl/model/MediaType.html "class in akka.http.scaladsl.model")>>` | `[customMediaTypes](#customMediaTypes())()` |  |
	| `boolean` | `[equalsAsciiCaseInsensitive](#equalsAsciiCaseInsensitive(java.lang.String,java.lang.String))​(java.lang.String str1,  java.lang.String str2)` | Returns true if both strings only contain ASCII characters and each character matches case insensitively. |
	| `[HttpCharset](../../../scaladsl/model/HttpCharset.html "class in akka.http.scaladsl.model")` | `[getCharset](#getCharset(java.lang.String))​(java.lang.String name)` |  |
	| `[MediaType](../../../scaladsl/model/MediaType.html "class in akka.http.scaladsl.model")` | `[getMediaType](#getMediaType(java.lang.String,java.lang.String,boolean,scala.collection.immutable.Map))​(java.lang.String mainType,  java.lang.String subType,  boolean charsetDefined,  scala.collection.immutable.Map<java.lang.String,​java.lang.String> params)` |  |

- - ### Method Detail
	
	
	
		- #### customMediaTypes
		
		
		
		```
		scala.Function2<java.lang.String,​java.lang.String,​scala.Option<[MediaType](../../../scaladsl/model/MediaType.html "class in akka.http.scaladsl.model")>> customMediaTypes()
		```
		- #### equalsAsciiCaseInsensitive
		
		
		
		```
		boolean equalsAsciiCaseInsensitive​(java.lang.String str1,
		                                   java.lang.String str2)
		```
		
		Returns true if both strings only contain ASCII characters and each character matches case insensitively.
		
		Parameters:
		`str1` \- (undocumented)
		`str2` \- (undocumented)
		Returns:
		(undocumented)
		- #### getCharset
		
		
		
		```
		[HttpCharset](../../../scaladsl/model/HttpCharset.html "class in akka.http.scaladsl.model") getCharset​(java.lang.String name)
		```
		- #### getMediaType
		
		
		
		```
		[MediaType](../../../scaladsl/model/MediaType.html "class in akka.http.scaladsl.model") getMediaType​(java.lang.String mainType,
		                       java.lang.String subType,
		                       boolean charsetDefined,
		                       scala.collection.immutable.Map<java.lang.String,​java.lang.String> params)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/impl/model/parser/HeaderParser.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/model/parser/package-summary.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/HttpCharset.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/MediaType.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/impl/model/parser/CommonActions.html](https://doc.akka.io/japi/akka-http/current/akka/http/impl/model/parser/CommonActions.html)*