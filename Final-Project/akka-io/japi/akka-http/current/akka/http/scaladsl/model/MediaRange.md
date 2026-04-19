---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T00:31:44Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/MediaRange.One.html
title: MediaRange.One
---

# MediaRange.One

## Content

Package [akka.http.scaladsl.model](package-summary.html)
## Class MediaRange.One

- java.lang.Object
- - [akka.http.javadsl.model.MediaRange](../../javadsl/model/MediaRange.html "class in akka.http.javadsl.model")
	- - [akka.http.scaladsl.model.MediaRange](MediaRange.html "class in akka.http.scaladsl.model")
		- - akka.http.scaladsl.model.MediaRange.One

- All Implemented Interfaces:
`[Renderable](../../impl/util/Renderable.html "interface in akka.http.impl.util")`, `[ToStringRenderable](../../impl/util/ToStringRenderable.html "interface in akka.http.impl.util")`, `[ValueRenderable](../../impl/util/ValueRenderable.html "interface in akka.http.impl.util")`, `[WithQValue](WithQValue.html "interface in akka.http.scaladsl.model")<[MediaRange](MediaRange.html "class in akka.http.scaladsl.model")>`, `java.io.Serializable`, `scala.Equals`, `scala.Product`

Enclosing class:
[MediaRange](MediaRange.html "class in akka.http.scaladsl.model")

---

```
public static final class MediaRange.One
extends [MediaRange](MediaRange.html "class in akka.http.scaladsl.model")
implements [ValueRenderable](../../impl/util/ValueRenderable.html "interface in akka.http.impl.util"), scala.Product, java.io.Serializable
```

See Also:
[Serialized Form](../../../../serialized-form.html#akka.http.scaladsl.model.MediaRange.One)

- - ### Nested Class Summary
	
	
		- ### Nested classes/interfaces inherited from class akka.http.scaladsl.model.[MediaRange](MediaRange.html "class in akka.http.scaladsl.model")
		
		
		`[MediaRange.One](MediaRange.One.html "class in akka.http.scaladsl.model"), [MediaRange.One$](MediaRange.One$.html "class in akka.http.scaladsl.model")`

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[One](#%3Cinit%3E(akka.http.scaladsl.model.MediaType,float))​([MediaType](MediaType.html "class in akka.http.scaladsl.model") mediaType,  float qValue)` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `boolean` | `[isApplication](#isApplication())()` |  |
	| `boolean` | `[isAudio](#isAudio())()` |  |
	| `boolean` | `[isImage](#isImage())()` |  |
	| `boolean` | `[isMessage](#isMessage())()` |  |
	| `boolean` | `[isMultipart](#isMultipart())()` |  |
	| `boolean` | `[isText](#isText())()` |  |
	| `boolean` | `[isVideo](#isVideo())()` |  |
	| `java.lang.String` | `[mainType](#mainType())()` | Returns the main\-type this media\-range matches. |
	| `boolean` | `[matches](#matches(akka.http.scaladsl.model.MediaType))​([MediaType](MediaType.html "class in akka.http.scaladsl.model") mediaType)` |  |
	| `[MediaType](MediaType.html "class in akka.http.scaladsl.model")` | `[mediaType](#mediaType())()` |  |
	| `scala.collection.immutable.Map<java.lang.String,​java.lang.String>` | `[params](#params())()` |  |
	| `float` | `[qValue](#qValue())()` | Returns the qValue of this media\-range. |
	| `<R extends [Rendering](../../impl/util/Rendering.html "interface in akka.http.impl.util")>[Rendering](../../impl/util/Rendering.html "interface in akka.http.impl.util")` | `[render](#render(R))​(R r)` |  |
	| `[MediaRange.One](MediaRange.One.html "class in akka.http.scaladsl.model")` | `[withParams](#withParams(scala.collection.immutable.Map))​(scala.collection.immutable.Map<java.lang.String,​java.lang.String> params)` | Returns a copy of this instance with the params replaced by the given ones. |
	| `[MediaRange.One](MediaRange.One.html "class in akka.http.scaladsl.model")` | `[withQValue](#withQValue(float))​(float qValue)` | Returns a copy of this instance with a changed qValue. |
	
	
		- ### Methods inherited from class akka.http.scaladsl.model.[MediaRange](MediaRange.html "class in akka.http.scaladsl.model")
		
		
		`[apply](MediaRange.html#apply(akka.http.scaladsl.model.MediaType)), [apply](MediaRange.html#apply(akka.http.scaladsl.model.MediaType,float)), [custom](MediaRange.html#custom(java.lang.String,scala.collection.immutable.Map,float)), [getParams](MediaRange.html#getParams()), [isWildcard](MediaRange.html#isWildcard()), [matches](MediaRange.html#matches(akka.http.javadsl.model.MediaType)), [splitOffQValue](MediaRange.html#splitOffQValue(scala.collection.immutable.Map,float)), [value](MediaRange.html#value()), [withCharsetRange](MediaRange.html#withCharsetRange(akka.http.scaladsl.model.HttpCharsetRange))`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`
		- ### Methods inherited from interface scala.Equals
		
		
		`canEqual, equals`
		- ### Methods inherited from interface scala.Product
		
		
		`productArity, productElement, productElementName, productElementNames, productIterator, productPrefix`
		- ### Methods inherited from interface akka.http.impl.util.[ToStringRenderable](../../impl/util/ToStringRenderable.html "interface in akka.http.impl.util")
		
		
		`[toString](../../impl/util/ToStringRenderable.html#toString())`
		- ### Methods inherited from interface akka.http.impl.util.[ValueRenderable](../../impl/util/ValueRenderable.html "interface in akka.http.impl.util")
		
		
		`[value](../../impl/util/ValueRenderable.html#value())`
		- ### Methods inherited from interface akka.http.scaladsl.model.[WithQValue](WithQValue.html "interface in akka.http.scaladsl.model")
		
		
		`[withQValue](WithQValue.html#withQValue(double))`

- - ### Constructor Detail
	
	
	
		- #### One
		
		
		
		```
		public One​([MediaType](MediaType.html "class in akka.http.scaladsl.model") mediaType,
		           float qValue)
		```

	- ### Method Detail
	
	
	
		- #### mediaType
		
		
		
		```
		public [MediaType](MediaType.html "class in akka.http.scaladsl.model") mediaType()
		```
		- #### qValue
		
		
		
		```
		public float qValue()
		```
		
		Description copied from class: `[MediaRange](../../javadsl/model/MediaRange.html#qValue())`
		Returns the qValue of this media\-range.
		
		Specified by:
		`[qValue](MediaRange.html#qValue())` in class `[MediaRange](MediaRange.html "class in akka.http.scaladsl.model")`
		- #### mainType
		
		
		
		```
		public java.lang.String mainType()
		```
		
		Description copied from class: `[MediaRange](../../javadsl/model/MediaRange.html#mainType())`
		Returns the main\-type this media\-range matches.
		
		Specified by:
		`[mainType](MediaRange.html#mainType())` in class `[MediaRange](MediaRange.html "class in akka.http.scaladsl.model")`
		- #### params
		
		
		
		```
		public scala.collection.immutable.Map<java.lang.String,​java.lang.String> params()
		```
		
		
		Specified by:
		`[params](MediaRange.html#params())` in class `[MediaRange](MediaRange.html "class in akka.http.scaladsl.model")`
		- #### isApplication
		
		
		
		```
		public boolean isApplication()
		```
		
		
		Overrides:
		`[isApplication](MediaRange.html#isApplication())` in class `[MediaRange](MediaRange.html "class in akka.http.scaladsl.model")`
		- #### isAudio
		
		
		
		```
		public boolean isAudio()
		```
		
		
		Overrides:
		`[isAudio](MediaRange.html#isAudio())` in class `[MediaRange](MediaRange.html "class in akka.http.scaladsl.model")`
		- #### isImage
		
		
		
		```
		public boolean isImage()
		```
		
		
		Overrides:
		`[isImage](MediaRange.html#isImage())` in class `[MediaRange](MediaRange.html "class in akka.http.scaladsl.model")`
		- #### isMessage
		
		
		
		```
		public boolean isMessage()
		```
		
		
		Overrides:
		`[isMessage](MediaRange.html#isMessage())` in class `[MediaRange](MediaRange.html "class in akka.http.scaladsl.model")`
		- #### isMultipart
		
		
		
		```
		public boolean isMultipart()
		```
		
		
		Overrides:
		`[isMultipart](MediaRange.html#isMultipart())` in class `[MediaRange](MediaRange.html "class in akka.http.scaladsl.model")`
		- #### isText
		
		
		
		```
		public boolean isText()
		```
		
		
		Overrides:
		`[isText](MediaRange.html#isText())` in class `[MediaRange](MediaRange.html "class in akka.http.scaladsl.model")`
		- #### isVideo
		
		
		
		```
		public boolean isVideo()
		```
		
		
		Overrides:
		`[isVideo](MediaRange.html#isVideo())` in class `[MediaRange](MediaRange.html "class in akka.http.scaladsl.model")`
		- #### matches
		
		
		
		```
		public boolean matches​([MediaType](MediaType.html "class in akka.http.scaladsl.model") mediaType)
		```
		
		
		Specified by:
		`[matches](MediaRange.html#matches(akka.http.scaladsl.model.MediaType))` in class `[MediaRange](MediaRange.html "class in akka.http.scaladsl.model")`
		- #### withParams
		
		
		
		```
		public [MediaRange.One](MediaRange.One.html "class in akka.http.scaladsl.model") withParams​(scala.collection.immutable.Map<java.lang.String,​java.lang.String> params)
		```
		
		Description copied from class: `[MediaRange](MediaRange.html#withParams(scala.collection.immutable.Map))`
		Returns a copy of this instance with the params replaced by the given ones.
		 If the given map contains a "q" value the `qValue` member is (also) updated.
		
		Specified by:
		`[withParams](MediaRange.html#withParams(scala.collection.immutable.Map))` in class `[MediaRange](MediaRange.html "class in akka.http.scaladsl.model")`
		Parameters:
		`params` \- (undocumented)
		Returns:
		(undocumented)
		- #### withQValue
		
		
		
		```
		public [MediaRange.One](MediaRange.One.html "class in akka.http.scaladsl.model") withQValue​(float qValue)
		```
		
		Description copied from class: `[MediaRange](../../javadsl/model/MediaRange.html#withQValue(float))`
		Returns a copy of this instance with a changed qValue.
		
		Specified by:
		`[withQValue](WithQValue.html#withQValue(float))` in interface `[WithQValue](WithQValue.html "interface in akka.http.scaladsl.model")<[MediaRange](MediaRange.html "class in akka.http.scaladsl.model")>`
		Specified by:
		`[withQValue](../../javadsl/model/MediaRange.html#withQValue(float))` in class `[MediaRange](../../javadsl/model/MediaRange.html "class in akka.http.javadsl.model")`
		- #### render
		
		
		
		```
		public <R extends [Rendering](../../impl/util/Rendering.html "interface in akka.http.impl.util")> [Rendering](../../impl/util/Rendering.html "interface in akka.http.impl.util") render​(R r)
		```
		
		
		Specified by:
		`[render](../../impl/util/Renderable.html#render(R))` in interface `[Renderable](../../impl/util/Renderable.html "interface in akka.http.impl.util")`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/impl/util/Renderable.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/util/Rendering.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/util/ToStringRenderable.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/util/ValueRenderable.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/MediaRange.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/MediaRange.One$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/MediaRange.One.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/MediaRange.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/MediaType.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/WithQValue.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/package-summary.html
- https://doc.akka.io/japi/akka-http/current/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/MediaRange.One.html](https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/MediaRange.One.html)*