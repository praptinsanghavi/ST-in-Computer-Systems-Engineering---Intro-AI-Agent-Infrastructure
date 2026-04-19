---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T23:44:32Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/coding/Coder.html
title: Coder
---

# Coder

## Content

Package [akka.http.javadsl.coding](package-summary.html)
## Enum Coder

- java.lang.Object
- - java.lang.Enum\<[Coder](Coder.html "enum in akka.http.javadsl.coding")\>
	- - akka.http.javadsl.coding.Coder

- All Implemented Interfaces:
`java.io.Serializable`, `java.lang.Comparable<[Coder](Coder.html "enum in akka.http.javadsl.coding")>`

---

```
public enum Coder
extends java.lang.Enum<[Coder](Coder.html "enum in akka.http.javadsl.coding")>
```

A coder is an implementation of the predefined encoders/decoders defined for HTTP.

- - ### Enum Constant Summary
	
	
	
	Enum Constants 
	| Enum Constant | Description |
	| `[Deflate](#Deflate)` |  |
	| `[DeflateLevel1](#DeflateLevel1)` |  |
	| `[DeflateLevel9](#DeflateLevel9)` |  |
	| `[Gzip](#Gzip)` |  |
	| `[GzipLevel1](#GzipLevel1)` |  |
	| `[GzipLevel9](#GzipLevel9)` |  |
	| `[NoCoding](#NoCoding)` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) [Deprecated Methods](javascript:show(32);) 
	| Modifier and Type | Method | Description |
	| `[Coder](../../scaladsl/coding/Coder.html "interface in akka.http.scaladsl.coding")` | `[_underlyingScalaCoder](#_underlyingScalaCoder())()` |  |
	| `java.util.concurrent.CompletionStage<akka.util.ByteString>` | `[decode](#decode(akka.util.ByteString,akka.stream.Materializer))​(akka.util.ByteString input,  akka.stream.Materializer mat)` |  |
	| `[HttpRequest](../model/HttpRequest.html "class in akka.http.javadsl.model")` | `[decodeMessage](#decodeMessage(akka.http.javadsl.model.HttpRequest))​([HttpRequest](../model/HttpRequest.html "class in akka.http.javadsl.model") message)` |  |
	| `[HttpResponse](../model/HttpResponse.html "class in akka.http.javadsl.model")` | `[decodeMessage](#decodeMessage(akka.http.javadsl.model.HttpResponse))​([HttpResponse](../model/HttpResponse.html "class in akka.http.javadsl.model") message)` |  |
	| `akka.util.ByteString` | `[encode](#encode(akka.util.ByteString))​(akka.util.ByteString input)` | Deprecated. Synchronous encoding is deprecated since 10\.2\.0 |
	| `[HttpRequest](../model/HttpRequest.html "class in akka.http.javadsl.model")` | `[encodeMessage](#encodeMessage(akka.http.javadsl.model.HttpRequest))​([HttpRequest](../model/HttpRequest.html "class in akka.http.javadsl.model") message)` |  |
	| `[HttpResponse](../model/HttpResponse.html "class in akka.http.javadsl.model")` | `[encodeMessage](#encodeMessage(akka.http.javadsl.model.HttpResponse))​([HttpResponse](../model/HttpResponse.html "class in akka.http.javadsl.model") message)` |  |
	| `static [Coder](Coder.html "enum in akka.http.javadsl.coding")` | `[valueOf](#valueOf(java.lang.String))​(java.lang.String name)` | Returns the enum constant of this type with the specified name. |
	| `static [Coder](Coder.html "enum in akka.http.javadsl.coding")[]` | `[values](#values())()` | Returns an array containing the constants of this enum type, in the order they are declared. |
	
	
		- ### Methods inherited from class java.lang.Enum
		
		
		`clone, compareTo, equals, finalize, getDeclaringClass, hashCode, name, ordinal, toString, valueOf`
		- ### Methods inherited from class java.lang.Object
		
		
		`getClass, notify, notifyAll, wait, wait, wait`

- - ### Enum Constant Detail
	
	
	
		- #### NoCoding
		
		
		
		```
		public static final [Coder](Coder.html "enum in akka.http.javadsl.coding") NoCoding
		```
		- #### Deflate
		
		
		
		```
		public static final [Coder](Coder.html "enum in akka.http.javadsl.coding") Deflate
		```
		- #### Gzip
		
		
		
		```
		public static final [Coder](Coder.html "enum in akka.http.javadsl.coding") Gzip
		```
		- #### DeflateLevel1
		
		
		
		```
		public static final [Coder](Coder.html "enum in akka.http.javadsl.coding") DeflateLevel1
		```
		- #### DeflateLevel9
		
		
		
		```
		public static final [Coder](Coder.html "enum in akka.http.javadsl.coding") DeflateLevel9
		```
		- #### GzipLevel1
		
		
		
		```
		public static final [Coder](Coder.html "enum in akka.http.javadsl.coding") GzipLevel1
		```
		- #### GzipLevel9
		
		
		
		```
		public static final [Coder](Coder.html "enum in akka.http.javadsl.coding") GzipLevel9
		```

	- ### Method Detail
	
	
	
		- #### values
		
		
		
		```
		public static [Coder](Coder.html "enum in akka.http.javadsl.coding")[] values()
		```
		
		Returns an array containing the constants of this enum type, in
		the order they are declared. This method may be used to iterate
		over the constants as follows:
		
		```
		
		for (Coder c : Coder.values())
		    System.out.println(c);
		
		```
		
		
		Returns:
		an array containing the constants of this enum type, in the order they are declared
		- #### valueOf
		
		
		
		```
		public static [Coder](Coder.html "enum in akka.http.javadsl.coding") valueOf​(java.lang.String name)
		```
		
		Returns the enum constant of this type with the specified name.
		The string must match *exactly* an identifier used to declare an
		enum constant in this type. (Extraneous whitespace characters are 
		not permitted.)
		
		Parameters:
		`name` \- the name of the enum constant to be returned.
		Returns:
		the enum constant with the specified name
		Throws:
		`java.lang.IllegalArgumentException` \- if this enum type has no constant with the specified name
		`java.lang.NullPointerException` \- if the argument is null
		- #### encodeMessage
		
		
		
		```
		public [HttpResponse](../model/HttpResponse.html "class in akka.http.javadsl.model") encodeMessage​([HttpResponse](../model/HttpResponse.html "class in akka.http.javadsl.model") message)
		```
		- #### encodeMessage
		
		
		
		```
		public [HttpRequest](../model/HttpRequest.html "class in akka.http.javadsl.model") encodeMessage​([HttpRequest](../model/HttpRequest.html "class in akka.http.javadsl.model") message)
		```
		- #### encode
		
		
		
		```
		@Deprecated
		public akka.util.ByteString encode​(akka.util.ByteString input)
		```
		
		Deprecated.
		Synchronous encoding is deprecated since 10\.2\.0
		- #### decodeMessage
		
		
		
		```
		public [HttpResponse](../model/HttpResponse.html "class in akka.http.javadsl.model") decodeMessage​([HttpResponse](../model/HttpResponse.html "class in akka.http.javadsl.model") message)
		```
		- #### decodeMessage
		
		
		
		```
		public [HttpRequest](../model/HttpRequest.html "class in akka.http.javadsl.model") decodeMessage​([HttpRequest](../model/HttpRequest.html "class in akka.http.javadsl.model") message)
		```
		- #### decode
		
		
		
		```
		public java.util.concurrent.CompletionStage<akka.util.ByteString> decode​(akka.util.ByteString input,
		                                                                         akka.stream.Materializer mat)
		```
		- #### \_underlyingScalaCoder
		
		
		
		```
		public [Coder](../../scaladsl/coding/Coder.html "interface in akka.http.scaladsl.coding") _underlyingScalaCoder()
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/coding/Coder.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/coding/package-summary.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/HttpRequest.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/HttpResponse.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/coding/Coder.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/coding/Coder.html](https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/coding/Coder.html)*