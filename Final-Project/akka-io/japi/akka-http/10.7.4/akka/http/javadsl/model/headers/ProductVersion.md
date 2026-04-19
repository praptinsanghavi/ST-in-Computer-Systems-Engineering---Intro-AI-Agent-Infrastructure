---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T16:58:48Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/headers/ProductVersion.html
title: ProductVersion
---

# ProductVersion

## Content

Package [akka.http.javadsl.model.headers](package-summary.html)
## Class ProductVersion

- java.lang.Object
- - akka.http.javadsl.model.headers.ProductVersion

- Direct Known Subclasses:
`[ProductVersion](../../../scaladsl/model/headers/ProductVersion.html "class in akka.http.scaladsl.model.headers")`

---

```
public abstract class ProductVersion
extends java.lang.Object
```

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[ProductVersion](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `abstract java.lang.String` | `[comment](#comment())()` |  |
	| `static [ProductVersion](ProductVersion.html "class in akka.http.javadsl.model.headers")` | `[create](#create(java.lang.String,java.lang.String))​(java.lang.String product,  java.lang.String version)` |  |
	| `static [ProductVersion](ProductVersion.html "class in akka.http.javadsl.model.headers")` | `[create](#create(java.lang.String,java.lang.String,java.lang.String))​(java.lang.String product,  java.lang.String version,  java.lang.String comment)` |  |
	| `abstract java.lang.String` | `[product](#product())()` |  |
	| `abstract java.lang.String` | `[version](#version())()` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### ProductVersion
		
		
		
		```
		public ProductVersion()
		```

	- ### Method Detail
	
	
	
		- #### product
		
		
		
		```
		public abstract java.lang.String product()
		```
		- #### version
		
		
		
		```
		public abstract java.lang.String version()
		```
		- #### comment
		
		
		
		```
		public abstract java.lang.String comment()
		```
		- #### create
		
		
		
		```
		public static [ProductVersion](ProductVersion.html "class in akka.http.javadsl.model.headers") create​(java.lang.String product,
		                                    java.lang.String version,
		                                    java.lang.String comment)
		```
		- #### create
		
		
		
		```
		public static [ProductVersion](ProductVersion.html "class in akka.http.javadsl.model.headers") create​(java.lang.String product,
		                                    java.lang.String version)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/headers/ProductVersion.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/headers/package-summary.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/model/headers/ProductVersion.html

---
*Source: [https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/headers/ProductVersion.html](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/headers/ProductVersion.html)*