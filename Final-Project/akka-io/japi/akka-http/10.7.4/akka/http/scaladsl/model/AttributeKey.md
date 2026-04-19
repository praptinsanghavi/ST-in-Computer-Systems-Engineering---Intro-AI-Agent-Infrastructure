---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T02:10:28Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/model/AttributeKey.html
title: AttributeKey
---

# AttributeKey

## Content

Package [akka.http.scaladsl.model](package-summary.html)
## Class AttributeKey\<T\>

- java.lang.Object
- - [akka.http.javadsl.model.AttributeKey](../../javadsl/model/AttributeKey.html "class in akka.http.javadsl.model")\<T\>
	- - akka.http.scaladsl.model.AttributeKey\<T\>

- All Implemented Interfaces:
`java.io.Serializable`, `scala.Equals`, `scala.Product`

---

```
public class AttributeKey<T>
extends [AttributeKey](../../javadsl/model/AttributeKey.html "class in akka.http.javadsl.model")<T>
implements scala.Product, java.io.Serializable
```

See Also:
[Serialized Form](../../../../serialized-form.html#akka.http.scaladsl.model.AttributeKey)

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[AttributeKey](#%3Cinit%3E(java.lang.String,java.lang.Class))​(java.lang.String name,  java.lang.Class<?> clazz)` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `static <T> [AttributeKey](AttributeKey.html "class in akka.http.scaladsl.model")<T>` | `[apply](#apply(java.lang.String,scala.reflect.ClassTag))​(java.lang.String name,  scala.reflect.ClassTag<T> evidence$1)` |  |
	| `java.lang.String` | `[name](#name())()` |  |
	
	
		- ### Methods inherited from class akka.http.javadsl.model.[AttributeKey](../../javadsl/model/AttributeKey.html "class in akka.http.javadsl.model")
		
		
		`[create](../../javadsl/model/AttributeKey.html#create(java.lang.String,java.lang.Class))`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`
		- ### Methods inherited from interface scala.Equals
		
		
		`canEqual, equals`
		- ### Methods inherited from interface scala.Product
		
		
		`productArity, productElement, productElementName, productElementNames, productIterator, productPrefix`

- - ### Constructor Detail
	
	
	
		- #### AttributeKey
		
		
		
		```
		public AttributeKey​(java.lang.String name,
		                    java.lang.Class<?> clazz)
		```

	- ### Method Detail
	
	
	
		- #### apply
		
		
		
		```
		public static <T> [AttributeKey](AttributeKey.html "class in akka.http.scaladsl.model")<T> apply​(java.lang.String name,
		                                        scala.reflect.ClassTag<T> evidence$1)
		```
		- #### name
		
		
		
		```
		public java.lang.String name()
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/AttributeKey.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/model/AttributeKey.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/model/package-summary.html
- https://doc.akka.io/japi/akka-http/10.7.4/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/model/AttributeKey.html](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/model/AttributeKey.html)*