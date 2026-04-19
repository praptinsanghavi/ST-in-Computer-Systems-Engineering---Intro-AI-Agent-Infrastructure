---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T02:11:52Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/model/headers/Language.html
title: Language
---

# Language

## Content

Package [akka.http.scaladsl.model.headers](package-summary.html)
## Class Language

- java.lang.Object
- - [akka.http.javadsl.model.headers.Language](../../../javadsl/model/headers/Language.html "class in akka.http.javadsl.model.headers")
	- - akka.http.scaladsl.model.headers.Language

- All Implemented Interfaces:
`[Renderable](../../../impl/util/Renderable.html "interface in akka.http.impl.util")`, `[ToStringRenderable](../../../impl/util/ToStringRenderable.html "interface in akka.http.impl.util")`, `[ValueRenderable](../../../impl/util/ValueRenderable.html "interface in akka.http.impl.util")`, `[WithQValue](../WithQValue.html "interface in akka.http.scaladsl.model")<[LanguageRange](LanguageRange.html "interface in akka.http.scaladsl.model.headers")>`, `java.io.Serializable`, `scala.Equals`, `scala.Product`

---

```
public final class Language
extends [Language](../../../javadsl/model/headers/Language.html "class in akka.http.javadsl.model.headers")
implements [ValueRenderable](../../../impl/util/ValueRenderable.html "interface in akka.http.impl.util"), [WithQValue](../WithQValue.html "interface in akka.http.scaladsl.model")<[LanguageRange](LanguageRange.html "interface in akka.http.scaladsl.model.headers")>, scala.Product, java.io.Serializable
```

See Also:
[Serialized Form](../../../../../serialized-form.html#akka.http.scaladsl.model.headers.Language)

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[Language](#%3Cinit%3E(java.lang.String,scala.collection.immutable.Seq))​(java.lang.String primaryTag,  scala.collection.immutable.Seq<java.lang.String> subTags)` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `static [Language](Language.html "class in akka.http.scaladsl.model.headers")` | `[apply](#apply(java.lang.String))​(java.lang.String compoundTag)` |  |
	| `static [Language](Language.html "class in akka.http.scaladsl.model.headers")` | `[apply](#apply(java.lang.String,java.lang.String,scala.collection.immutable.Seq))​(java.lang.String primaryTag,  java.lang.String firstSubTag,  scala.collection.immutable.Seq<java.lang.String> otherSubTags)` |  |
	| `java.lang.Iterable<java.lang.String>` | `[getSubTags](#getSubTags())()` | Java API |
	| `java.lang.String` | `[primaryTag](#primaryTag())()` |  |
	| `<R extends [Rendering](../../../impl/util/Rendering.html "interface in akka.http.impl.util")>[Rendering](../../../impl/util/Rendering.html "interface in akka.http.impl.util")` | `[render](#render(R))​(R r)` |  |
	| `scala.collection.immutable.Seq<java.lang.String>` | `[subTags](#subTags())()` |  |
	| `[LanguageRange](LanguageRange.html "interface in akka.http.scaladsl.model.headers")` | `[withQValue](#withQValue(float))​(float qValue)` |  |
	
	
		- ### Methods inherited from class akka.http.javadsl.model.headers.[Language](../../../javadsl/model/headers/Language.html "class in akka.http.javadsl.model.headers")
		
		
		`[create](../../../javadsl/model/headers/Language.html#create(java.lang.String,java.lang.String...))`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`
		- ### Methods inherited from interface scala.Equals
		
		
		`canEqual, equals`
		- ### Methods inherited from interface scala.Product
		
		
		`productArity, productElement, productElementName, productElementNames, productIterator, productPrefix`
		- ### Methods inherited from interface akka.http.impl.util.[ToStringRenderable](../../../impl/util/ToStringRenderable.html "interface in akka.http.impl.util")
		
		
		`[toString](../../../impl/util/ToStringRenderable.html#toString())`
		- ### Methods inherited from interface akka.http.impl.util.[ValueRenderable](../../../impl/util/ValueRenderable.html "interface in akka.http.impl.util")
		
		
		`[value](../../../impl/util/ValueRenderable.html#value())`
		- ### Methods inherited from interface akka.http.scaladsl.model.[WithQValue](../WithQValue.html "interface in akka.http.scaladsl.model")
		
		
		`[withQValue](../WithQValue.html#withQValue(double))`

- - ### Constructor Detail
	
	
	
		- #### Language
		
		
		
		```
		public Language​(java.lang.String primaryTag,
		                scala.collection.immutable.Seq<java.lang.String> subTags)
		```

	- ### Method Detail
	
	
	
		- #### apply
		
		
		
		```
		public static [Language](Language.html "class in akka.http.scaladsl.model.headers") apply​(java.lang.String compoundTag)
		```
		- #### apply
		
		
		
		```
		public static [Language](Language.html "class in akka.http.scaladsl.model.headers") apply​(java.lang.String primaryTag,
		                             java.lang.String firstSubTag,
		                             scala.collection.immutable.Seq<java.lang.String> otherSubTags)
		```
		- #### primaryTag
		
		
		
		```
		public java.lang.String primaryTag()
		```
		
		
		Specified by:
		`[primaryTag](../../../javadsl/model/headers/Language.html#primaryTag())` in class `[Language](../../../javadsl/model/headers/Language.html "class in akka.http.javadsl.model.headers")`
		- #### subTags
		
		
		
		```
		public scala.collection.immutable.Seq<java.lang.String> subTags()
		```
		- #### withQValue
		
		
		
		```
		public [LanguageRange](LanguageRange.html "interface in akka.http.scaladsl.model.headers") withQValue​(float qValue)
		```
		
		
		Specified by:
		`[withQValue](../WithQValue.html#withQValue(float))` in interface `[WithQValue](../WithQValue.html "interface in akka.http.scaladsl.model")<[LanguageRange](LanguageRange.html "interface in akka.http.scaladsl.model.headers")>`
		Specified by:
		`[withQValue](../../../javadsl/model/headers/Language.html#withQValue(float))` in class `[Language](../../../javadsl/model/headers/Language.html "class in akka.http.javadsl.model.headers")`
		- #### render
		
		
		
		```
		public <R extends [Rendering](../../../impl/util/Rendering.html "interface in akka.http.impl.util")> [Rendering](../../../impl/util/Rendering.html "interface in akka.http.impl.util") render​(R r)
		```
		
		
		Specified by:
		`[render](../../../impl/util/Renderable.html#render(R))` in interface `[Renderable](../../../impl/util/Renderable.html "interface in akka.http.impl.util")`
		- #### getSubTags
		
		
		
		```
		public java.lang.Iterable<java.lang.String> getSubTags()
		```
		
		Java API
		
		Specified by:
		`[getSubTags](../../../javadsl/model/headers/Language.html#getSubTags())` in class `[Language](../../../javadsl/model/headers/Language.html "class in akka.http.javadsl.model.headers")`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/impl/util/Renderable.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/impl/util/Rendering.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/impl/util/ToStringRenderable.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/impl/util/ValueRenderable.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/headers/Language.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/model/WithQValue.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/model/headers/Language.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/model/headers/LanguageRange.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/model/headers/package-summary.html
- https://doc.akka.io/japi/akka-http/10.7.4/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/model/headers/Language.html](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/model/headers/Language.html)*