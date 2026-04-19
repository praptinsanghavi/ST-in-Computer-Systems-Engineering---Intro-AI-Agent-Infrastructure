---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T23:45:37Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/headers/SameSite.html
title: SameSite
---

# SameSite

## Content

Package [akka.http.javadsl.model.headers](package-summary.html)
## Enum SameSite

- java.lang.Object
- - java.lang.Enum\<[SameSite](SameSite.html "enum in akka.http.javadsl.model.headers")\>
	- - akka.http.javadsl.model.headers.SameSite

- All Implemented Interfaces:
`java.io.Serializable`, `java.lang.Comparable<[SameSite](SameSite.html "enum in akka.http.javadsl.model.headers")>`

---

```
public enum SameSite
extends java.lang.Enum<[SameSite](SameSite.html "enum in akka.http.javadsl.model.headers")>
```

The Cookie SameSite attribute as defined by [RFC6265bis](https://tools.ietf.org/html/draft-ietf-httpbis-cookie-same-site-00)
 and [Incrementally Better Cookies](https://tools.ietf.org/html/draft-west-cookie-incrementalism-00).

- - ### Enum Constant Summary
	
	
	
	Enum Constants 
	| Enum Constant | Description |
	| `[Lax](#Lax)` |  |
	| `[None](#None)` |  |
	| `[Strict](#Strict)` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[SameSite](../../../scaladsl/model/headers/SameSite.html "interface in akka.http.scaladsl.model.headers")` | `[asScala](#asScala())()` |  |
	| `static [SameSite](SameSite.html "enum in akka.http.javadsl.model.headers")` | `[valueOf](#valueOf(java.lang.String))​(java.lang.String name)` | Returns the enum constant of this type with the specified name. |
	| `static [SameSite](SameSite.html "enum in akka.http.javadsl.model.headers")[]` | `[values](#values())()` | Returns an array containing the constants of this enum type, in the order they are declared. |
	
	
		- ### Methods inherited from class java.lang.Enum
		
		
		`clone, compareTo, equals, finalize, getDeclaringClass, hashCode, name, ordinal, toString, valueOf`
		- ### Methods inherited from class java.lang.Object
		
		
		`getClass, notify, notifyAll, wait, wait, wait`

- - ### Enum Constant Detail
	
	
	
		- #### Strict
		
		
		
		```
		public static final [SameSite](SameSite.html "enum in akka.http.javadsl.model.headers") Strict
		```
		- #### Lax
		
		
		
		```
		public static final [SameSite](SameSite.html "enum in akka.http.javadsl.model.headers") Lax
		```
		- #### None
		
		
		
		```
		public static final [SameSite](SameSite.html "enum in akka.http.javadsl.model.headers") None
		```

	- ### Method Detail
	
	
	
		- #### values
		
		
		
		```
		public static [SameSite](SameSite.html "enum in akka.http.javadsl.model.headers")[] values()
		```
		
		Returns an array containing the constants of this enum type, in
		the order they are declared. This method may be used to iterate
		over the constants as follows:
		
		```
		
		for (SameSite c : SameSite.values())
		    System.out.println(c);
		
		```
		
		
		Returns:
		an array containing the constants of this enum type, in the order they are declared
		- #### valueOf
		
		
		
		```
		public static [SameSite](SameSite.html "enum in akka.http.javadsl.model.headers") valueOf​(java.lang.String name)
		```
		
		Returns the enum constant of this type with the specified name.
		The string must match *exactly* an identifier used to declare an
		enum constant in this type. (Extraneous whitespace characters are 
		not permitted.)
		
		Parameters:
		`name` \- the name of the enum constant to be returned.
		Returns:
		the enum constant with the specified name
		Throws:
		`java.lang.IllegalArgumentException` \- if this enum type has no constant with the specified name
		`java.lang.NullPointerException` \- if the argument is null
		- #### asScala
		
		
		
		```
		public [SameSite](../../../scaladsl/model/headers/SameSite.html "interface in akka.http.scaladsl.model.headers") asScala()
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/headers/SameSite.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/headers/package-summary.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/SameSite.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/headers/SameSite.html](https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/headers/SameSite.html)*