---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T00:31:57Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/MediaType.WithOpenCharset.html
title: MediaType.WithOpenCharset
---

# MediaType.WithOpenCharset

## Content

Package [akka.http.scaladsl.model](package-summary.html)
## Class MediaType.WithOpenCharset

- java.lang.Object
- - [akka.http.scaladsl.model.MediaType](MediaType.html "class in akka.http.scaladsl.model")
	- - [akka.http.scaladsl.model.MediaType.NonBinary](MediaType.NonBinary.html "class in akka.http.scaladsl.model")
		- - akka.http.scaladsl.model.MediaType.WithOpenCharset

- All Implemented Interfaces:
`[LazyValueBytesRenderable](../../impl/util/LazyValueBytesRenderable.html "interface in akka.http.impl.util")`, `[Renderable](../../impl/util/Renderable.html "interface in akka.http.impl.util")`, `[MediaType](../../javadsl/model/MediaType.html "interface in akka.http.javadsl.model")`, `[MediaType.NonBinary](../../javadsl/model/MediaType.NonBinary.html "interface in akka.http.javadsl.model")`, `[MediaType.WithOpenCharset](../../javadsl/model/MediaType.WithOpenCharset.html "interface in akka.http.javadsl.model")`, `[WithQValue](WithQValue.html "interface in akka.http.scaladsl.model")<[MediaRange](MediaRange.html "class in akka.http.scaladsl.model")>`

Direct Known Subclasses:
`[MediaType.NonMultipartWithOpenCharset](MediaType.NonMultipartWithOpenCharset.html "class in akka.http.scaladsl.model")`

Enclosing class:
[MediaType](MediaType.html "class in akka.http.scaladsl.model")

---

```
public abstract static class MediaType.WithOpenCharset
extends [MediaType.NonBinary](MediaType.NonBinary.html "class in akka.http.scaladsl.model")
implements [MediaType.WithOpenCharset](../../javadsl/model/MediaType.WithOpenCharset.html "interface in akka.http.javadsl.model")
```

- - ### Nested Class Summary
	
	
		- ### Nested classes/interfaces inherited from class akka.http.scaladsl.model.[MediaType](MediaType.html "class in akka.http.scaladsl.model")
		
		
		`[MediaType.Binary](MediaType.Binary.html "class in akka.http.scaladsl.model"), [MediaType.Compressibility](MediaType.Compressibility.html "class in akka.http.scaladsl.model"), [MediaType.Compressible$](MediaType.Compressible$.html "class in akka.http.scaladsl.model"), [MediaType.Gzipped$](MediaType.Gzipped$.html "class in akka.http.scaladsl.model"), [MediaType.Multipart](MediaType.Multipart.html "class in akka.http.scaladsl.model"), [MediaType.NonBinary](MediaType.NonBinary.html "class in akka.http.scaladsl.model"), [MediaType.NonMultipartWithOpenCharset](MediaType.NonMultipartWithOpenCharset.html "class in akka.http.scaladsl.model"), [MediaType.NotCompressible$](MediaType.NotCompressible$.html "class in akka.http.scaladsl.model"), [MediaType.WithFixedCharset](MediaType.WithFixedCharset.html "class in akka.http.scaladsl.model"), [MediaType.WithOpenCharset](MediaType.WithOpenCharset.html "class in akka.http.scaladsl.model")`
		- ### Nested classes/interfaces inherited from interface akka.http.javadsl.model.[MediaType](../../javadsl/model/MediaType.html "interface in akka.http.javadsl.model")
		
		
		`[MediaType.Binary](../../javadsl/model/MediaType.Binary.html "interface in akka.http.javadsl.model"), [MediaType.Compressibility](../../javadsl/model/MediaType.Compressibility.html "interface in akka.http.javadsl.model"), [MediaType.Multipart](../../javadsl/model/MediaType.Multipart.html "interface in akka.http.javadsl.model"), [MediaType.NonBinary](../../javadsl/model/MediaType.NonBinary.html "interface in akka.http.javadsl.model"), [MediaType.WithFixedCharset](../../javadsl/model/MediaType.WithFixedCharset.html "interface in akka.http.javadsl.model"), [MediaType.WithOpenCharset](../../javadsl/model/MediaType.WithOpenCharset.html "interface in akka.http.javadsl.model")`

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[WithOpenCharset](#%3Cinit%3E(java.lang.String,java.lang.String))​(java.lang.String _mainType,  java.lang.String _subType)` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[ContentType.WithCharset](ContentType.WithCharset.html "class in akka.http.scaladsl.model")` | `[toContentType](#toContentType(akka.http.javadsl.model.HttpCharset))​([HttpCharset](../../javadsl/model/HttpCharset.html "class in akka.http.javadsl.model") charset)` | Turns the media type into a content type with the given charset. |
	| `[ContentType.WithMissingCharset](ContentType.WithMissingCharset.html "class in akka.http.scaladsl.model")` | `[toContentTypeWithMissingCharset](#toContentTypeWithMissingCharset())()` | Turns the media type into a content type without specifying a charset. |
	| `[ContentType.WithCharset](ContentType.WithCharset.html "class in akka.http.scaladsl.model")` | `[withCharset](#withCharset(akka.http.scaladsl.model.HttpCharset))​([HttpCharset](HttpCharset.html "class in akka.http.scaladsl.model") charset)` |  |
	| `[ContentType.WithMissingCharset](ContentType.WithMissingCharset.html "class in akka.http.scaladsl.model")` | `[withMissingCharset](#withMissingCharset())()` | Turns the media type into a content type without specifying a charset. |
	| `[MediaType.WithOpenCharset](MediaType.WithOpenCharset.html "class in akka.http.scaladsl.model")` | `[withParams](#withParams(scala.collection.immutable.Map))​(scala.collection.immutable.Map<java.lang.String,​java.lang.String> params)` |  |
	
	
		- ### Methods inherited from class akka.http.scaladsl.model.[MediaType.NonBinary](MediaType.NonBinary.html "class in akka.http.scaladsl.model")
		
		
		`[binary](MediaType.NonBinary.html#binary()), [comp](MediaType.NonBinary.html#comp()), [withComp](MediaType.NonBinary.html#withComp(akka.http.scaladsl.model.MediaType.Compressibility))`
		- ### Methods inherited from class akka.http.scaladsl.model.[MediaType](MediaType.html "class in akka.http.scaladsl.model")
		
		
		`[applicationBinary](MediaType.html#applicationBinary(java.lang.String,akka.http.scaladsl.model.MediaType.Compressibility,scala.collection.immutable.Seq)), [applicationWithFixedCharset](MediaType.html#applicationWithFixedCharset(java.lang.String,akka.http.scaladsl.model.HttpCharset,scala.collection.immutable.Seq)), [applicationWithOpenCharset](MediaType.html#applicationWithOpenCharset(java.lang.String,scala.collection.immutable.Seq)), [audio](MediaType.html#audio(java.lang.String,akka.http.scaladsl.model.MediaType.Compressibility,scala.collection.immutable.Seq)), [custom](MediaType.html#custom(java.lang.String,boolean,akka.http.scaladsl.model.MediaType.Compressibility,scala.collection.immutable.List)), [customBinary](MediaType.html#customBinary(java.lang.String,java.lang.String,akka.http.scaladsl.model.MediaType.Compressibility,scala.collection.immutable.List,scala.collection.immutable.Map,boolean)), [customMultipart](MediaType.html#customMultipart(java.lang.String,scala.collection.immutable.Map)), [customWithFixedCharset](MediaType.html#customWithFixedCharset(java.lang.String,java.lang.String,akka.http.scaladsl.model.HttpCharset,scala.collection.immutable.List,scala.collection.immutable.Map,boolean)), [customWithOpenCharset](MediaType.html#customWithOpenCharset(java.lang.String,java.lang.String,scala.collection.immutable.List,scala.collection.immutable.Map,boolean)), [equals](MediaType.html#equals(java.lang.Object)), [fileExtensions](MediaType.html#fileExtensions()), [font](MediaType.html#font(java.lang.String,akka.http.scaladsl.model.MediaType.Compressibility,scala.collection.immutable.Seq)), [hashCode](MediaType.html#hashCode()), [image](MediaType.html#image(java.lang.String,akka.http.scaladsl.model.MediaType.Compressibility,scala.collection.immutable.Seq)), [isApplication](MediaType.html#isApplication()), [isAudio](MediaType.html#isAudio()), [isCompressible](MediaType.html#isCompressible()), [isImage](MediaType.html#isImage()), [isMessage](MediaType.html#isMessage()), [isMultipart](MediaType.html#isMultipart()), [isText](MediaType.html#isText()), [isVideo](MediaType.html#isVideo()), [mainType](MediaType.html#mainType()), [message](MediaType.html#message(java.lang.String,akka.http.scaladsl.model.MediaType.Compressibility,scala.collection.immutable.Seq)), [params](MediaType.html#params()), [parse](MediaType.html#parse(java.lang.String)), [subType](MediaType.html#subType()), [text](MediaType.html#text(java.lang.String,scala.collection.immutable.Seq)), [textWithFixedCharset](MediaType.html#textWithFixedCharset(java.lang.String,akka.http.scaladsl.model.HttpCharset,scala.collection.immutable.Seq)), [toRange](MediaType.html#toRange()), [toRange](MediaType.html#toRange(float)), [unapply](MediaType.html#unapply(akka.http.scaladsl.model.MediaType)), [video](MediaType.html#video(java.lang.String,akka.http.scaladsl.model.MediaType.Compressibility,scala.collection.immutable.Seq)), [withQValue](MediaType.html#withQValue(float))`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, finalize, getClass, notify, notifyAll, toString, wait, wait, wait`
		- ### Methods inherited from interface akka.http.impl.util.[LazyValueBytesRenderable](../../impl/util/LazyValueBytesRenderable.html "interface in akka.http.impl.util")
		
		
		`[render](../../impl/util/LazyValueBytesRenderable.html#render(R)), [toString](../../impl/util/LazyValueBytesRenderable.html#toString()), [value](../../impl/util/LazyValueBytesRenderable.html#value()), [valueBytes](../../impl/util/LazyValueBytesRenderable.html#valueBytes())`
		- ### Methods inherited from interface akka.http.javadsl.model.[MediaType](../../javadsl/model/MediaType.html "interface in akka.http.javadsl.model")
		
		
		`[binary](../../javadsl/model/MediaType.html#binary()), [isApplication](../../javadsl/model/MediaType.html#isApplication()), [isAudio](../../javadsl/model/MediaType.html#isAudio()), [isCompressible](../../javadsl/model/MediaType.html#isCompressible()), [isImage](../../javadsl/model/MediaType.html#isImage()), [isMessage](../../javadsl/model/MediaType.html#isMessage()), [isMultipart](../../javadsl/model/MediaType.html#isMultipart()), [isText](../../javadsl/model/MediaType.html#isText()), [isVideo](../../javadsl/model/MediaType.html#isVideo()), [mainType](../../javadsl/model/MediaType.html#mainType()), [subType](../../javadsl/model/MediaType.html#subType()), [toRange](../../javadsl/model/MediaType.html#toRange()), [toRange](../../javadsl/model/MediaType.html#toRange(float))`
		- ### Methods inherited from interface akka.http.scaladsl.model.[WithQValue](WithQValue.html "interface in akka.http.scaladsl.model")
		
		
		`[withQValue](WithQValue.html#withQValue(double))`

- - ### Constructor Detail
	
	
	
		- #### WithOpenCharset
		
		
		
		```
		public WithOpenCharset​(java.lang.String _mainType,
		                       java.lang.String _subType)
		```

	- ### Method Detail
	
	
	
		- #### toContentType
		
		
		
		```
		public [ContentType.WithCharset](ContentType.WithCharset.html "class in akka.http.scaladsl.model") toContentType​([HttpCharset](../../javadsl/model/HttpCharset.html "class in akka.http.javadsl.model") charset)
		```
		
		Turns the media type into a content type with the given charset.
		 
		 JAVA API
		
		
		
		Specified by:
		`[toContentType](../../javadsl/model/MediaType.WithOpenCharset.html#toContentType(akka.http.javadsl.model.HttpCharset))` in interface `[MediaType.WithOpenCharset](../../javadsl/model/MediaType.WithOpenCharset.html "interface in akka.http.javadsl.model")`
		Parameters:
		`charset` \- (undocumented)
		Returns:
		(undocumented)
		- #### toContentTypeWithMissingCharset
		
		
		
		```
		public [ContentType.WithMissingCharset](ContentType.WithMissingCharset.html "class in akka.http.scaladsl.model") toContentTypeWithMissingCharset()
		```
		
		Turns the media type into a content type without specifying a charset.
		 
		 This is generally NOT what you want, since you're hiding the actual character encoding of your content, making
		 decoding it possibly ambiguous.
		 
		
		
		 Consider using toContentType(charset: HttpCharset) instead.
		 
		
		
		 JAVA API
		
		
		
		Specified by:
		`[toContentTypeWithMissingCharset](../../javadsl/model/MediaType.WithOpenCharset.html#toContentTypeWithMissingCharset())` in interface `[MediaType.WithOpenCharset](../../javadsl/model/MediaType.WithOpenCharset.html "interface in akka.http.javadsl.model")`
		Returns:
		(undocumented)
		- #### withCharset
		
		
		
		```
		public [ContentType.WithCharset](ContentType.WithCharset.html "class in akka.http.scaladsl.model") withCharset​([HttpCharset](HttpCharset.html "class in akka.http.scaladsl.model") charset)
		```
		- #### withMissingCharset
		
		
		
		```
		public [ContentType.WithMissingCharset](ContentType.WithMissingCharset.html "class in akka.http.scaladsl.model") withMissingCharset()
		```
		
		Turns the media type into a content type without specifying a charset.
		 
		 This is generally NOT what you want, since you're hiding the actual character encoding of your content, making
		 decoding it possibly ambiguous.
		 
		
		
		 Consider using toContentType(charset: HttpCharset) instead.
		
		
		
		Returns:
		(undocumented)
		- #### withParams
		
		
		
		```
		public [MediaType.WithOpenCharset](MediaType.WithOpenCharset.html "class in akka.http.scaladsl.model") withParams​(scala.collection.immutable.Map<java.lang.String,​java.lang.String> params)
		```
		
		
		Specified by:
		`[withParams](MediaType.html#withParams(scala.collection.immutable.Map))` in class `[MediaType](MediaType.html "class in akka.http.scaladsl.model")`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/impl/util/LazyValueBytesRenderable.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/util/Renderable.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/HttpCharset.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/MediaType.Binary.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/MediaType.Compressibility.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/MediaType.Multipart.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/MediaType.NonBinary.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/MediaType.WithFixedCharset.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/MediaType.WithOpenCharset.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/MediaType.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/ContentType.WithCharset.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/ContentType.WithMissingCharset.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/HttpCharset.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/MediaRange.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/MediaType.Binary.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/MediaType.Compressibility.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/MediaType.Compressible$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/MediaType.Gzipped$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/MediaType.Multipart.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/MediaType.NonBinary.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/MediaType.NonMultipartWithOpenCharset.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/MediaType.NotCompressible$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/MediaType.WithFixedCharset.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/MediaType.WithOpenCharset.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/MediaType.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/WithQValue.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/MediaType.WithOpenCharset.html](https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/MediaType.WithOpenCharset.html)*