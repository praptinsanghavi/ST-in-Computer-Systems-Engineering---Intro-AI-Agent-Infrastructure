---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T20:50:01Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/actor/AddressFromURIString.html
title: AddressFromURIString
---

# AddressFromURIString

## Content

Package [akka.actor](package-summary.html)
## Class AddressFromURIString

- java.lang.Object
- - akka.actor.AddressFromURIString

- ---

```
public class AddressFromURIString
extends java.lang.Object
```

This object serves as extractor for Scala and as address parser for Java.

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[AddressFromURIString](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `static [Address](Address.html "class in akka.actor")` | `[apply](#apply(java.lang.String))​(java.lang.String addr)` | Try to construct an Address from the given String or throw a java.net.MalformedURLException. |
	| `static [Address](Address.html "class in akka.actor")` | `[parse](#parse(java.lang.String))​(java.lang.String addr)` | Java API: Try to construct an Address from the given String or throw a java.net.MalformedURLException. |
	| `static scala.Option<[Address](Address.html "class in akka.actor")>` | `[unapply](#unapply(java.lang.String))​(java.lang.String addr)` |  |
	| `static scala.Option<[Address](Address.html "class in akka.actor")>` | `[unapply](#unapply(java.net.URI))​(java.net.URI uri)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### AddressFromURIString
		
		
		
		```
		public AddressFromURIString()
		```

	- ### Method Detail
	
	
	
		- #### unapply
		
		
		
		```
		public static scala.Option<[Address](Address.html "class in akka.actor")> unapply​(java.lang.String addr)
		```
		- #### unapply
		
		
		
		```
		public static scala.Option<[Address](Address.html "class in akka.actor")> unapply​(java.net.URI uri)
		```
		- #### apply
		
		
		
		```
		public static [Address](Address.html "class in akka.actor") apply​(java.lang.String addr)
		```
		
		Try to construct an Address from the given String or throw a java.net.MalformedURLException.
		- #### parse
		
		
		
		```
		public static [Address](Address.html "class in akka.actor") parse​(java.lang.String addr)
		```
		
		Java API: Try to construct an Address from the given String or throw a java.net.MalformedURLException.

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/actor/Address.html
- https://doc.akka.io/japi/akka/current/akka/actor/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/actor/AddressFromURIString.html](https://doc.akka.io/japi/akka/current/akka/actor/AddressFromURIString.html)*