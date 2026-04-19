---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T00:36:47Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/ModeledCustomHeaderCompanion.html
title: ModeledCustomHeaderCompanion
---

# ModeledCustomHeaderCompanion

## Content

Package [akka.http.scaladsl.model.headers](package-summary.html)
## Class ModeledCustomHeaderCompanion\<H extends [ModeledCustomHeader](ModeledCustomHeader.html "class in akka.http.scaladsl.model.headers")\<H\>\>

- java.lang.Object
- - akka.http.scaladsl.model.headers.ModeledCustomHeaderCompanion\<H\>

- ---

```
public abstract class ModeledCustomHeaderCompanion<H extends [ModeledCustomHeader](ModeledCustomHeader.html "class in akka.http.scaladsl.model.headers")<H>>
extends java.lang.Object
```

To be extended by companion object of a custom header extending [`ModeledCustomHeader`](ModeledCustomHeader.html "class in akka.http.scaladsl.model.headers").
 Implements necessary apply and unapply methods to make the such defined header feel "native".

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[ModeledCustomHeaderCompanion](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[H](ModeledCustomHeaderCompanion.html "type parameter in ModeledCustomHeaderCompanion")` | `[apply](#apply(java.lang.String))​(java.lang.String value)` |  |
	| `[ModeledCustomHeaderCompanion](ModeledCustomHeaderCompanion.html "class in akka.http.scaladsl.model.headers")<[H](ModeledCustomHeaderCompanion.html "type parameter in ModeledCustomHeaderCompanion")>` | `[implicitlyLocatableCompanion](#implicitlyLocatableCompanion())()` |  |
	| `java.lang.String` | `[lowercaseName](#lowercaseName())()` |  |
	| `abstract java.lang.String` | `[name](#name())()` |  |
	| `abstract scala.util.Try<[H](ModeledCustomHeaderCompanion.html "type parameter in ModeledCustomHeaderCompanion")>` | `[parse](#parse(java.lang.String))​(java.lang.String value)` |  |
	| `scala.Option<java.lang.String>` | `[unapply](#unapply(akka.http.scaladsl.model.HttpHeader))​([HttpHeader](../HttpHeader.html "class in akka.http.scaladsl.model") h)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### ModeledCustomHeaderCompanion
		
		
		
		```
		public ModeledCustomHeaderCompanion()
		```

	- ### Method Detail
	
	
	
		- #### apply
		
		
		
		```
		public [H](ModeledCustomHeaderCompanion.html "type parameter in ModeledCustomHeaderCompanion") apply​(java.lang.String value)
		```
		- #### implicitlyLocatableCompanion
		
		
		
		```
		public final [ModeledCustomHeaderCompanion](ModeledCustomHeaderCompanion.html "class in akka.http.scaladsl.model.headers")<[H](ModeledCustomHeaderCompanion.html "type parameter in ModeledCustomHeaderCompanion")> implicitlyLocatableCompanion()
		```
		- #### lowercaseName
		
		
		
		```
		public java.lang.String lowercaseName()
		```
		- #### name
		
		
		
		```
		public abstract java.lang.String name()
		```
		- #### parse
		
		
		
		```
		public abstract scala.util.Try<[H](ModeledCustomHeaderCompanion.html "type parameter in ModeledCustomHeaderCompanion")> parse​(java.lang.String value)
		```
		- #### unapply
		
		
		
		```
		public scala.Option<java.lang.String> unapply​([HttpHeader](../HttpHeader.html "class in akka.http.scaladsl.model") h)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/HttpHeader.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/ModeledCustomHeader.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/ModeledCustomHeaderCompanion.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/ModeledCustomHeaderCompanion.html](https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/ModeledCustomHeaderCompanion.html)*