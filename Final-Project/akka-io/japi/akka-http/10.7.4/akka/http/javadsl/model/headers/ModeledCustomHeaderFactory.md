---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T02:46:47Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/headers/ModeledCustomHeaderFactory.html
title: ModeledCustomHeaderFactory
---

# ModeledCustomHeaderFactory

## Content

Package [akka.http.javadsl.model.headers](package-summary.html)
## Class ModeledCustomHeaderFactory\<H extends [ModeledCustomHeader](ModeledCustomHeader.html "class in akka.http.javadsl.model.headers")\>

- java.lang.Object
- - akka.http.javadsl.model.headers.ModeledCustomHeaderFactory\<H\>

- ---

```
public abstract class ModeledCustomHeaderFactory<H extends [ModeledCustomHeader](ModeledCustomHeader.html "class in akka.http.javadsl.model.headers")>
extends java.lang.Object
```

Companion class for the [`ModeledCustomHeader`](ModeledCustomHeader.html "class in akka.http.javadsl.model.headers") class. It offers methods to create [`ModeledCustomHeader`](ModeledCustomHeader.html "class in akka.http.javadsl.model.headers")
 from `String` or [`HttpHeader`](../HttpHeader.html "class in akka.http.javadsl.model").

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[ModeledCustomHeaderFactory](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[H](ModeledCustomHeaderFactory.html "type parameter in ModeledCustomHeaderFactory")` | `[create](#create(java.lang.String))​(java.lang.String value)` | Creates a new `ModeledCustomHeader` from the value checking that the format is correct. |
	| `java.util.Optional<[H](ModeledCustomHeaderFactory.html "type parameter in ModeledCustomHeaderFactory")>` | `[from](#from(akka.http.javadsl.model.HttpHeader))​([HttpHeader](../HttpHeader.html "class in akka.http.javadsl.model") header)` | Transforms an `HttpHeader` to this `ModeledCustomHeader` if the name and value are correct. |
	| `java.lang.String` | `[lowercaseName](#lowercaseName())()` |  |
	| `abstract java.lang.String` | `[name](#name())()` |  |
	| `protected abstract [H](ModeledCustomHeaderFactory.html "type parameter in ModeledCustomHeaderFactory")` | `[parse](#parse(java.lang.String))​(java.lang.String value)` | Parses the value checking that the format is correct. |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### ModeledCustomHeaderFactory
		
		
		
		```
		public ModeledCustomHeaderFactory()
		```

	- ### Method Detail
	
	
	
		- #### name
		
		
		
		```
		public abstract java.lang.String name()
		```
		- #### lowercaseName
		
		
		
		```
		public java.lang.String lowercaseName()
		```
		- #### parse
		
		
		
		```
		protected abstract [H](ModeledCustomHeaderFactory.html "type parameter in ModeledCustomHeaderFactory") parse​(java.lang.String value)
		```
		
		Parses the value checking that the format is correct.
		 It may throw if value is not correct
		- #### create
		
		
		
		```
		public [H](ModeledCustomHeaderFactory.html "type parameter in ModeledCustomHeaderFactory") create​(java.lang.String value)
		```
		
		Creates a new `ModeledCustomHeader` from the value checking that the format is correct.
		 It may throw if value is not correct
		- #### from
		
		
		
		```
		public java.util.Optional<[H](ModeledCustomHeaderFactory.html "type parameter in ModeledCustomHeaderFactory")> from​([HttpHeader](../HttpHeader.html "class in akka.http.javadsl.model") header)
		```
		
		Transforms an `HttpHeader` to this `ModeledCustomHeader` if the name and value are correct.
		 It may throw in case of malformed headers

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/HttpHeader.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/headers/ModeledCustomHeader.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/headers/ModeledCustomHeaderFactory.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/headers/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/headers/ModeledCustomHeaderFactory.html](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/headers/ModeledCustomHeaderFactory.html)*