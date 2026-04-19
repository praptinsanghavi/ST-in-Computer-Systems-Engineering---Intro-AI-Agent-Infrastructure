---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T23:46:21Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/HttpHeader.html
title: HttpHeader
---

# HttpHeader

## Content

Package [akka.http.javadsl.model](package-summary.html)
## Class HttpHeader

- java.lang.Object
- - akka.http.javadsl.model.HttpHeader

- Direct Known Subclasses:
`[HttpHeader](../../scaladsl/model/HttpHeader.html "class in akka.http.scaladsl.model")`

---

```
@DoNotInherit
public abstract class HttpHeader
extends java.lang.Object
```

The base type representing Http headers. All actual header values will be instances
 of one of the subtypes defined in the \`headers\` packages. Unknown headers will be subtypes
 of [`RawHeader`](headers/RawHeader.html "class in akka.http.javadsl.model.headers"). Not for user extension.

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[HttpHeader](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `abstract boolean` | `[is](#is(java.lang.String))​(java.lang.String nameInLowerCase)` | Returns true if and only if nameInLowerCase.equals(lowercaseName()). |
	| `abstract boolean` | `[isNot](#isNot(java.lang.String))​(java.lang.String nameInLowerCase)` | Returns ! |
	| `abstract java.lang.String` | `[lowercaseName](#lowercaseName())()` | Returns the lower\-cased name of the header. |
	| `abstract java.lang.String` | `[name](#name())()` | Returns the name of the header. |
	| `static [HttpHeader](HttpHeader.html "class in akka.http.javadsl.model")` | `[parse](#parse(java.lang.String,java.lang.String))​(java.lang.String name,  java.lang.String value)` | Attempts to parse the given header name and value string into a header model instance. |
	| `abstract boolean` | `[renderInRequests](#renderInRequests())()` | Returns true if and only if the header is to be rendered in requests. |
	| `abstract boolean` | `[renderInResponses](#renderInResponses())()` | Returns true if and only if the header is to be rendered in responses. |
	| `abstract java.lang.String` | `[value](#value())()` | Returns the String representation of the value of the header. |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### HttpHeader
		
		
		
		```
		public HttpHeader()
		```

	- ### Method Detail
	
	
	
		- #### name
		
		
		
		```
		public abstract java.lang.String name()
		```
		
		Returns the name of the header.
		- #### value
		
		
		
		```
		public abstract java.lang.String value()
		```
		
		Returns the String representation of the value of the header.
		- #### lowercaseName
		
		
		
		```
		public abstract java.lang.String lowercaseName()
		```
		
		Returns the lower\-cased name of the header.
		- #### is
		
		
		
		```
		public abstract boolean is​(java.lang.String nameInLowerCase)
		```
		
		Returns true if and only if nameInLowerCase.equals(lowercaseName()).
		- #### isNot
		
		
		
		```
		public abstract boolean isNot​(java.lang.String nameInLowerCase)
		```
		
		Returns !is(nameInLowerCase).
		- #### renderInRequests
		
		
		
		```
		public abstract boolean renderInRequests()
		```
		
		Returns true if and only if the header is to be rendered in requests.
		- #### renderInResponses
		
		
		
		```
		public abstract boolean renderInResponses()
		```
		
		Returns true if and only if the header is to be rendered in responses.
		- #### parse
		
		
		
		```
		public static [HttpHeader](HttpHeader.html "class in akka.http.javadsl.model") parse​(java.lang.String name,
		                               java.lang.String value)
		```
		
		Attempts to parse the given header name and value string into a header model instance.
		
		Throws:
		`java.lang.IllegalArgumentException` \- if parsing is unsuccessful.

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/HttpHeader.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/headers/RawHeader.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/package-summary.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/HttpHeader.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/HttpHeader.html](https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/HttpHeader.html)*