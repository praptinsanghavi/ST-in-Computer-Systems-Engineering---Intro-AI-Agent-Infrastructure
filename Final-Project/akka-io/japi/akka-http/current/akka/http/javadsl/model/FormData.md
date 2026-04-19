---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T23:46:16Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/FormData.html
title: FormData
---

# FormData

## Content

Package [akka.http.javadsl.model](package-summary.html)
## Class FormData

- java.lang.Object
- - akka.http.javadsl.model.FormData

- ---

```
public final class FormData
extends java.lang.Object
```

Simple model for \`application/x\-www\-form\-urlencoded\` form data.

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [FormData](FormData.html "class in akka.http.javadsl.model")` | `[EMPTY](#EMPTY)` | Returns empty FormData. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[FormData](#%3Cinit%3E(akka.http.javadsl.model.Query))​([Query](Query.html "class in akka.http.javadsl.model") fields)` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) [Deprecated Methods](javascript:show(32);) 
	| Modifier and Type | Method | Description |
	| `static [FormData](FormData.html "class in akka.http.javadsl.model")` | `[create](#create(akka.japi.Pair...))​(akka.japi.Pair<java.lang.String,​java.lang.String>... params)` | Creates the FormData from the given parameters. |
	| `static [FormData](FormData.html "class in akka.http.javadsl.model")` | `[create](#create(java.lang.Iterable))​(java.lang.Iterable<akka.japi.Pair<java.lang.String,​java.lang.String>> params)` | Creates a FormData from the given parameters. |
	| `static [FormData](FormData.html "class in akka.http.javadsl.model")` | `[create](#create(java.util.Map))​(java.util.Map<java.lang.String,​java.lang.String> params)` | Creates the FormData from the given parameters. |
	| `[Query](Query.html "class in akka.http.javadsl.model")` | `[getFields](#getFields())()` |  |
	| `[RequestEntity](RequestEntity.html "interface in akka.http.javadsl.model")` | `[toEntity](#toEntity())()` | Converts this FormData to a RequestEntity using UTF8 encoding. |
	| `[RequestEntity](RequestEntity.html "interface in akka.http.javadsl.model")` | `[toEntity](#toEntity(akka.http.javadsl.model.HttpCharset))​([HttpCharset](HttpCharset.html "class in akka.http.javadsl.model") charset)` | Deprecated. FormData always uses charset UTF\-8 without appending the charset to  'Content\-Type: application/x\-www\-form\-urlencoded', use toEntity() instead. |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### EMPTY
		
		
		
		```
		public static final [FormData](FormData.html "class in akka.http.javadsl.model") EMPTY
		```
		
		Returns empty FormData.

	- ### Constructor Detail
	
	
	
		- #### FormData
		
		
		
		```
		public FormData​([Query](Query.html "class in akka.http.javadsl.model") fields)
		```

	- ### Method Detail
	
	
	
		- #### getFields
		
		
		
		```
		public [Query](Query.html "class in akka.http.javadsl.model") getFields()
		```
		- #### toEntity
		
		
		
		```
		public [RequestEntity](RequestEntity.html "interface in akka.http.javadsl.model") toEntity()
		```
		
		Converts this FormData to a RequestEntity using UTF8 encoding.
		- #### toEntity
		
		
		
		```
		@Deprecated
		public [RequestEntity](RequestEntity.html "interface in akka.http.javadsl.model") toEntity​([HttpCharset](HttpCharset.html "class in akka.http.javadsl.model") charset)
		```
		
		Deprecated.
		FormData always uses charset UTF\-8 without appending the charset to
		 'Content\-Type: application/x\-www\-form\-urlencoded', use toEntity() instead.
		
		Converts this FormData to a RequestEntity using the given encoding.
		- #### create
		
		
		
		```
		@SafeVarargs
		public static [FormData](FormData.html "class in akka.http.javadsl.model") create​(akka.japi.Pair<java.lang.String,​java.lang.String>... params)
		```
		
		Creates the FormData from the given parameters.
		- #### create
		
		
		
		```
		public static [FormData](FormData.html "class in akka.http.javadsl.model") create​(java.util.Map<java.lang.String,​java.lang.String> params)
		```
		
		Creates the FormData from the given parameters.
		- #### create
		
		
		
		```
		public static [FormData](FormData.html "class in akka.http.javadsl.model") create​(java.lang.Iterable<akka.japi.Pair<java.lang.String,​java.lang.String>> params)
		```
		
		Creates a FormData from the given parameters.

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/FormData.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/HttpCharset.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/Query.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/RequestEntity.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/FormData.html](https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/FormData.html)*