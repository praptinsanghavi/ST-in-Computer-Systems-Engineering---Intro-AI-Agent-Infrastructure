---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T00:31:56Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/MediaType$.html
title: MediaType$
---

# MediaType$

## Content

Package [akka.http.scaladsl.model](package-summary.html)
## Class MediaType$

- java.lang.Object
- - akka.http.scaladsl.model.MediaType$

- ---

```
public class MediaType$
extends java.lang.Object
```

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [MediaType$](MediaType$.html "class in akka.http.scaladsl.model")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[MediaType$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[MediaType.Binary](MediaType.Binary.html "class in akka.http.scaladsl.model")` | `[applicationBinary](#applicationBinary(java.lang.String,akka.http.scaladsl.model.MediaType.Compressibility,scala.collection.immutable.Seq))​(java.lang.String subType,  [MediaType.Compressibility](MediaType.Compressibility.html "class in akka.http.scaladsl.model") comp,  scala.collection.immutable.Seq<java.lang.String> fileExtensions)` |  |
	| `[MediaType.WithFixedCharset](MediaType.WithFixedCharset.html "class in akka.http.scaladsl.model")` | `[applicationWithFixedCharset](#applicationWithFixedCharset(java.lang.String,akka.http.scaladsl.model.HttpCharset,scala.collection.immutable.Seq))​(java.lang.String subType,  [HttpCharset](HttpCharset.html "class in akka.http.scaladsl.model") charset,  scala.collection.immutable.Seq<java.lang.String> fileExtensions)` |  |
	| `[MediaType.WithOpenCharset](MediaType.WithOpenCharset.html "class in akka.http.scaladsl.model")` | `[applicationWithOpenCharset](#applicationWithOpenCharset(java.lang.String,scala.collection.immutable.Seq))​(java.lang.String subType,  scala.collection.immutable.Seq<java.lang.String> fileExtensions)` |  |
	| `[MediaType.Binary](MediaType.Binary.html "class in akka.http.scaladsl.model")` | `[audio](#audio(java.lang.String,akka.http.scaladsl.model.MediaType.Compressibility,scala.collection.immutable.Seq))​(java.lang.String subType,  [MediaType.Compressibility](MediaType.Compressibility.html "class in akka.http.scaladsl.model") comp,  scala.collection.immutable.Seq<java.lang.String> fileExtensions)` |  |
	| `[MediaType](MediaType.html "class in akka.http.scaladsl.model")` | `[custom](#custom(java.lang.String,boolean,akka.http.scaladsl.model.MediaType.Compressibility,scala.collection.immutable.List))​(java.lang.String value,  boolean binary,  [MediaType.Compressibility](MediaType.Compressibility.html "class in akka.http.scaladsl.model") comp,  scala.collection.immutable.List<java.lang.String> fileExtensions)` |  |
	| `[MediaType.Binary](MediaType.Binary.html "class in akka.http.scaladsl.model")` | `[customBinary](#customBinary(java.lang.String,java.lang.String,akka.http.scaladsl.model.MediaType.Compressibility,scala.collection.immutable.List,scala.collection.immutable.Map,boolean))​(java.lang.String mainType,  java.lang.String subType,  [MediaType.Compressibility](MediaType.Compressibility.html "class in akka.http.scaladsl.model") comp,  scala.collection.immutable.List<java.lang.String> fileExtensions,  scala.collection.immutable.Map<java.lang.String,​java.lang.String> params,  boolean allowArbitrarySubtypes)` |  |
	| `[MediaType.Multipart](MediaType.Multipart.html "class in akka.http.scaladsl.model")` | `[customMultipart](#customMultipart(java.lang.String,scala.collection.immutable.Map))​(java.lang.String subType,  scala.collection.immutable.Map<java.lang.String,​java.lang.String> params)` |  |
	| `[MediaType.WithFixedCharset](MediaType.WithFixedCharset.html "class in akka.http.scaladsl.model")` | `[customWithFixedCharset](#customWithFixedCharset(java.lang.String,java.lang.String,akka.http.scaladsl.model.HttpCharset,scala.collection.immutable.List,scala.collection.immutable.Map,boolean))​(java.lang.String mainType,  java.lang.String subType,  [HttpCharset](HttpCharset.html "class in akka.http.scaladsl.model") charset,  scala.collection.immutable.List<java.lang.String> fileExtensions,  scala.collection.immutable.Map<java.lang.String,​java.lang.String> params,  boolean allowArbitrarySubtypes)` |  |
	| `[MediaType.WithOpenCharset](MediaType.WithOpenCharset.html "class in akka.http.scaladsl.model")` | `[customWithOpenCharset](#customWithOpenCharset(java.lang.String,java.lang.String,scala.collection.immutable.List,scala.collection.immutable.Map,boolean))​(java.lang.String mainType,  java.lang.String subType,  scala.collection.immutable.List<java.lang.String> fileExtensions,  scala.collection.immutable.Map<java.lang.String,​java.lang.String> params,  boolean allowArbitrarySubtypes)` |  |
	| `[MediaType.Binary](MediaType.Binary.html "class in akka.http.scaladsl.model")` | `[font](#font(java.lang.String,akka.http.scaladsl.model.MediaType.Compressibility,scala.collection.immutable.Seq))​(java.lang.String subType,  [MediaType.Compressibility](MediaType.Compressibility.html "class in akka.http.scaladsl.model") comp,  scala.collection.immutable.Seq<java.lang.String> fileExtensions)` |  |
	| `[MediaType.Binary](MediaType.Binary.html "class in akka.http.scaladsl.model")` | `[image](#image(java.lang.String,akka.http.scaladsl.model.MediaType.Compressibility,scala.collection.immutable.Seq))​(java.lang.String subType,  [MediaType.Compressibility](MediaType.Compressibility.html "class in akka.http.scaladsl.model") comp,  scala.collection.immutable.Seq<java.lang.String> fileExtensions)` |  |
	| `[MediaType.Binary](MediaType.Binary.html "class in akka.http.scaladsl.model")` | `[message](#message(java.lang.String,akka.http.scaladsl.model.MediaType.Compressibility,scala.collection.immutable.Seq))​(java.lang.String subType,  [MediaType.Compressibility](MediaType.Compressibility.html "class in akka.http.scaladsl.model") comp,  scala.collection.immutable.Seq<java.lang.String> fileExtensions)` |  |
	| `scala.util.Either<scala.collection.immutable.List<[ErrorInfo](ErrorInfo.html "class in akka.http.scaladsl.model")>,​[MediaType](MediaType.html "class in akka.http.scaladsl.model")>` | `[parse](#parse(java.lang.String))​(java.lang.String value)` | Tries to parse a `MediaType` value from the given String. |
	| `[MediaType.WithOpenCharset](MediaType.WithOpenCharset.html "class in akka.http.scaladsl.model")` | `[text](#text(java.lang.String,scala.collection.immutable.Seq))​(java.lang.String subType,  scala.collection.immutable.Seq<java.lang.String> fileExtensions)` |  |
	| `[MediaType.WithFixedCharset](MediaType.WithFixedCharset.html "class in akka.http.scaladsl.model")` | `[textWithFixedCharset](#textWithFixedCharset(java.lang.String,akka.http.scaladsl.model.HttpCharset,scala.collection.immutable.Seq))​(java.lang.String subType,  [HttpCharset](HttpCharset.html "class in akka.http.scaladsl.model") charset,  scala.collection.immutable.Seq<java.lang.String> fileExtensions)` |  |
	| `scala.Option<java.lang.String>` | `[unapply](#unapply(akka.http.scaladsl.model.MediaType))​([MediaType](MediaType.html "class in akka.http.scaladsl.model") mediaType)` |  |
	| `[MediaType.Binary](MediaType.Binary.html "class in akka.http.scaladsl.model")` | `[video](#video(java.lang.String,akka.http.scaladsl.model.MediaType.Compressibility,scala.collection.immutable.Seq))​(java.lang.String subType,  [MediaType.Compressibility](MediaType.Compressibility.html "class in akka.http.scaladsl.model") comp,  scala.collection.immutable.Seq<java.lang.String> fileExtensions)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [MediaType$](MediaType$.html "class in akka.http.scaladsl.model") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### MediaType$
		
		
		
		```
		public MediaType$()
		```

	- ### Method Detail
	
	
	
		- #### applicationBinary
		
		
		
		```
		public [MediaType.Binary](MediaType.Binary.html "class in akka.http.scaladsl.model") applicationBinary​(java.lang.String subType,
		                                          [MediaType.Compressibility](MediaType.Compressibility.html "class in akka.http.scaladsl.model") comp,
		                                          scala.collection.immutable.Seq<java.lang.String> fileExtensions)
		```
		- #### applicationWithFixedCharset
		
		
		
		```
		public [MediaType.WithFixedCharset](MediaType.WithFixedCharset.html "class in akka.http.scaladsl.model") applicationWithFixedCharset​(java.lang.String subType,
		                                                              [HttpCharset](HttpCharset.html "class in akka.http.scaladsl.model") charset,
		                                                              scala.collection.immutable.Seq<java.lang.String> fileExtensions)
		```
		- #### applicationWithOpenCharset
		
		
		
		```
		public [MediaType.WithOpenCharset](MediaType.WithOpenCharset.html "class in akka.http.scaladsl.model") applicationWithOpenCharset​(java.lang.String subType,
		                                                            scala.collection.immutable.Seq<java.lang.String> fileExtensions)
		```
		- #### audio
		
		
		
		```
		public [MediaType.Binary](MediaType.Binary.html "class in akka.http.scaladsl.model") audio​(java.lang.String subType,
		                              [MediaType.Compressibility](MediaType.Compressibility.html "class in akka.http.scaladsl.model") comp,
		                              scala.collection.immutable.Seq<java.lang.String> fileExtensions)
		```
		- #### image
		
		
		
		```
		public [MediaType.Binary](MediaType.Binary.html "class in akka.http.scaladsl.model") image​(java.lang.String subType,
		                              [MediaType.Compressibility](MediaType.Compressibility.html "class in akka.http.scaladsl.model") comp,
		                              scala.collection.immutable.Seq<java.lang.String> fileExtensions)
		```
		- #### message
		
		
		
		```
		public [MediaType.Binary](MediaType.Binary.html "class in akka.http.scaladsl.model") message​(java.lang.String subType,
		                                [MediaType.Compressibility](MediaType.Compressibility.html "class in akka.http.scaladsl.model") comp,
		                                scala.collection.immutable.Seq<java.lang.String> fileExtensions)
		```
		- #### text
		
		
		
		```
		public [MediaType.WithOpenCharset](MediaType.WithOpenCharset.html "class in akka.http.scaladsl.model") text​(java.lang.String subType,
		                                      scala.collection.immutable.Seq<java.lang.String> fileExtensions)
		```
		- #### textWithFixedCharset
		
		
		
		```
		public [MediaType.WithFixedCharset](MediaType.WithFixedCharset.html "class in akka.http.scaladsl.model") textWithFixedCharset​(java.lang.String subType,
		                                                       [HttpCharset](HttpCharset.html "class in akka.http.scaladsl.model") charset,
		                                                       scala.collection.immutable.Seq<java.lang.String> fileExtensions)
		```
		- #### video
		
		
		
		```
		public [MediaType.Binary](MediaType.Binary.html "class in akka.http.scaladsl.model") video​(java.lang.String subType,
		                              [MediaType.Compressibility](MediaType.Compressibility.html "class in akka.http.scaladsl.model") comp,
		                              scala.collection.immutable.Seq<java.lang.String> fileExtensions)
		```
		- #### font
		
		
		
		```
		public [MediaType.Binary](MediaType.Binary.html "class in akka.http.scaladsl.model") font​(java.lang.String subType,
		                             [MediaType.Compressibility](MediaType.Compressibility.html "class in akka.http.scaladsl.model") comp,
		                             scala.collection.immutable.Seq<java.lang.String> fileExtensions)
		```
		- #### customBinary
		
		
		
		```
		public [MediaType.Binary](MediaType.Binary.html "class in akka.http.scaladsl.model") customBinary​(java.lang.String mainType,
		                                     java.lang.String subType,
		                                     [MediaType.Compressibility](MediaType.Compressibility.html "class in akka.http.scaladsl.model") comp,
		                                     scala.collection.immutable.List<java.lang.String> fileExtensions,
		                                     scala.collection.immutable.Map<java.lang.String,​java.lang.String> params,
		                                     boolean allowArbitrarySubtypes)
		```
		- #### customWithFixedCharset
		
		
		
		```
		public [MediaType.WithFixedCharset](MediaType.WithFixedCharset.html "class in akka.http.scaladsl.model") customWithFixedCharset​(java.lang.String mainType,
		                                                         java.lang.String subType,
		                                                         [HttpCharset](HttpCharset.html "class in akka.http.scaladsl.model") charset,
		                                                         scala.collection.immutable.List<java.lang.String> fileExtensions,
		                                                         scala.collection.immutable.Map<java.lang.String,​java.lang.String> params,
		                                                         boolean allowArbitrarySubtypes)
		```
		- #### customWithOpenCharset
		
		
		
		```
		public [MediaType.WithOpenCharset](MediaType.WithOpenCharset.html "class in akka.http.scaladsl.model") customWithOpenCharset​(java.lang.String mainType,
		                                                       java.lang.String subType,
		                                                       scala.collection.immutable.List<java.lang.String> fileExtensions,
		                                                       scala.collection.immutable.Map<java.lang.String,​java.lang.String> params,
		                                                       boolean allowArbitrarySubtypes)
		```
		- #### customMultipart
		
		
		
		```
		public [MediaType.Multipart](MediaType.Multipart.html "class in akka.http.scaladsl.model") customMultipart​(java.lang.String subType,
		                                           scala.collection.immutable.Map<java.lang.String,​java.lang.String> params)
		```
		- #### custom
		
		
		
		```
		public [MediaType](MediaType.html "class in akka.http.scaladsl.model") custom​(java.lang.String value,
		                        boolean binary,
		                        [MediaType.Compressibility](MediaType.Compressibility.html "class in akka.http.scaladsl.model") comp,
		                        scala.collection.immutable.List<java.lang.String> fileExtensions)
		```
		- #### parse
		
		
		
		```
		public scala.util.Either<scala.collection.immutable.List<[ErrorInfo](ErrorInfo.html "class in akka.http.scaladsl.model")>,​[MediaType](MediaType.html "class in akka.http.scaladsl.model")> parse​(java.lang.String value)
		```
		
		Tries to parse a `MediaType` value from the given String.
		 Returns `Right(mediaType)` if successful and `Left(errors)` otherwise.
		
		Parameters:
		`value` \- (undocumented)
		Returns:
		(undocumented)
		- #### unapply
		
		
		
		```
		public scala.Option<java.lang.String> unapply​([MediaType](MediaType.html "class in akka.http.scaladsl.model") mediaType)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/ErrorInfo.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/HttpCharset.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/MediaType$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/MediaType.Binary.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/MediaType.Compressibility.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/MediaType.Multipart.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/MediaType.WithFixedCharset.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/MediaType.WithOpenCharset.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/MediaType.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/MediaType$.html](https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/MediaType$.html)*