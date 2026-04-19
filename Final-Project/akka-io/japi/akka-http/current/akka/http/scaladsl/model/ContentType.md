---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T00:30:44Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/ContentType.WithMissingCharset.html
title: ContentType.WithMissingCharset
---

# ContentType.WithMissingCharset

## Content

Package [akka.http.scaladsl.model](package-summary.html)
## Class ContentType.WithMissingCharset

- java.lang.Object
- - akka.http.scaladsl.model.ContentType.WithMissingCharset

- All Implemented Interfaces:
`[Renderable](../../impl/util/Renderable.html "interface in akka.http.impl.util")`, `[ToStringRenderable](../../impl/util/ToStringRenderable.html "interface in akka.http.impl.util")`, `[ValueRenderable](../../impl/util/ValueRenderable.html "interface in akka.http.impl.util")`, `[ContentType](../../javadsl/model/ContentType.html "interface in akka.http.javadsl.model")`, `[ContentType.WithMissingCharset](../../javadsl/model/ContentType.WithMissingCharset.html "interface in akka.http.javadsl.model")`, `[ContentType](ContentType.html "interface in akka.http.scaladsl.model")`, `java.io.Serializable`, `scala.Equals`, `scala.Product`

Enclosing interface:
[ContentType](ContentType.html "interface in akka.http.scaladsl.model")

---

```
public static final class ContentType.WithMissingCharset
extends java.lang.Object
implements [ContentType.WithMissingCharset](../../javadsl/model/ContentType.WithMissingCharset.html "interface in akka.http.javadsl.model"), [ContentType](ContentType.html "interface in akka.http.scaladsl.model"), scala.Product, java.io.Serializable
```

Represents a content\-type which we know to contain text, and would be better off having a charset,
 but the client or server hasn't provided that. For example, "text/xml" without a charset parameter.

See Also:
[Serialized Form](../../../../serialized-form.html#akka.http.scaladsl.model.ContentType.WithMissingCharset)

- - ### Nested Class Summary
	
	
		- ### Nested classes/interfaces inherited from interface akka.http.javadsl.model.[ContentType](../../javadsl/model/ContentType.html "interface in akka.http.javadsl.model")
		
		
		`[ContentType.Binary](../../javadsl/model/ContentType.Binary.html "interface in akka.http.javadsl.model"), [ContentType.NonBinary](../../javadsl/model/ContentType.NonBinary.html "interface in akka.http.javadsl.model"), [ContentType.WithCharset](../../javadsl/model/ContentType.WithCharset.html "interface in akka.http.javadsl.model"), [ContentType.WithFixedCharset](../../javadsl/model/ContentType.WithFixedCharset.html "interface in akka.http.javadsl.model"), [ContentType.WithMissingCharset](../../javadsl/model/ContentType.WithMissingCharset.html "interface in akka.http.javadsl.model")`
		- ### Nested classes/interfaces inherited from interface akka.http.scaladsl.model.[ContentType](ContentType.html "interface in akka.http.scaladsl.model")
		
		
		`[ContentType.$u003B$u0020charset$eq$](ContentType.$u003B$u0020charset$eq$.html "class in akka.http.scaladsl.model"), [ContentType.Binary](ContentType.Binary.html "class in akka.http.scaladsl.model"), [ContentType.Binary$](ContentType.Binary$.html "class in akka.http.scaladsl.model"), [ContentType.NonBinary](ContentType.NonBinary.html "interface in akka.http.scaladsl.model"), [ContentType.WithCharset](ContentType.WithCharset.html "class in akka.http.scaladsl.model"), [ContentType.WithCharset$](ContentType.WithCharset$.html "class in akka.http.scaladsl.model"), [ContentType.WithFixedCharset](ContentType.WithFixedCharset.html "class in akka.http.scaladsl.model"), [ContentType.WithFixedCharset$](ContentType.WithFixedCharset$.html "class in akka.http.scaladsl.model"), [ContentType.WithMissingCharset](ContentType.WithMissingCharset.html "class in akka.http.scaladsl.model"), [ContentType.WithMissingCharset$](ContentType.WithMissingCharset$.html "class in akka.http.scaladsl.model")`

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[WithMissingCharset](#%3Cinit%3E(akka.http.scaladsl.model.MediaType.WithOpenCharset))​([MediaType.WithOpenCharset](MediaType.WithOpenCharset.html "class in akka.http.scaladsl.model") mediaType)` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `boolean` | `[binary](#binary())()` | True if this ContentType is non\-textual. |
	| `scala.None$` | `[charsetOption](#charsetOption())()` |  |
	| `[MediaType.WithOpenCharset](MediaType.WithOpenCharset.html "class in akka.http.scaladsl.model")` | `[mediaType](#mediaType())()` | The media\-type of this content\-type. |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`
		- ### Methods inherited from interface akka.http.scaladsl.model.[ContentType](ContentType.html "interface in akka.http.scaladsl.model")
		
		
		`[getCharsetOption](ContentType.html#getCharsetOption()), [render](ContentType.html#render(R)), [toString](ContentType.html#toString())`
		- ### Methods inherited from interface scala.Equals
		
		
		`canEqual, equals`
		- ### Methods inherited from interface scala.Product
		
		
		`productArity, productElement, productElementName, productElementNames, productIterator, productPrefix`
		- ### Methods inherited from interface akka.http.impl.util.[ValueRenderable](../../impl/util/ValueRenderable.html "interface in akka.http.impl.util")
		
		
		`[value](../../impl/util/ValueRenderable.html#value())`

- - ### Constructor Detail
	
	
	
		- #### WithMissingCharset
		
		
		
		```
		public WithMissingCharset​([MediaType.WithOpenCharset](MediaType.WithOpenCharset.html "class in akka.http.scaladsl.model") mediaType)
		```

	- ### Method Detail
	
	
	
		- #### mediaType
		
		
		
		```
		public [MediaType.WithOpenCharset](MediaType.WithOpenCharset.html "class in akka.http.scaladsl.model") mediaType()
		```
		
		Description copied from interface: `[ContentType](../../javadsl/model/ContentType.html#mediaType())`
		The media\-type of this content\-type.
		
		Specified by:
		`[mediaType](../../javadsl/model/ContentType.html#mediaType())` in interface `[ContentType](../../javadsl/model/ContentType.html "interface in akka.http.javadsl.model")`
		Specified by:
		`[mediaType](ContentType.html#mediaType())` in interface `[ContentType](ContentType.html "interface in akka.http.scaladsl.model")`
		Returns:
		(undocumented)
		- #### binary
		
		
		
		```
		public boolean binary()
		```
		
		Description copied from interface: `[ContentType](../../javadsl/model/ContentType.html#binary())`
		True if this ContentType is non\-textual.
		
		Specified by:
		`[binary](../../javadsl/model/ContentType.html#binary())` in interface `[ContentType](../../javadsl/model/ContentType.html "interface in akka.http.javadsl.model")`
		Returns:
		(undocumented)
		- #### charsetOption
		
		
		
		```
		public scala.None$ charsetOption()
		```
		
		
		Specified by:
		`[charsetOption](ContentType.html#charsetOption())` in interface `[ContentType](ContentType.html "interface in akka.http.scaladsl.model")`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/impl/util/Renderable.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/util/ToStringRenderable.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/util/ValueRenderable.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/ContentType.Binary.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/ContentType.NonBinary.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/ContentType.WithCharset.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/ContentType.WithFixedCharset.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/ContentType.WithMissingCharset.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/ContentType.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/ContentType.$u003B$u0020charset$eq$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/ContentType.Binary$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/ContentType.Binary.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/ContentType.NonBinary.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/ContentType.WithCharset$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/ContentType.WithCharset.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/ContentType.WithFixedCharset$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/ContentType.WithFixedCharset.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/ContentType.WithMissingCharset$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/ContentType.WithMissingCharset.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/ContentType.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/MediaType.WithOpenCharset.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/package-summary.html
- https://doc.akka.io/japi/akka-http/current/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/ContentType.WithMissingCharset.html](https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/ContentType.WithMissingCharset.html)*