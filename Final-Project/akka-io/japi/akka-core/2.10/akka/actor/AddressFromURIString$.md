---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T15:12:07Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/actor/AddressFromURIString$.html
title: AddressFromURIString$
---

# AddressFromURIString$

## Content

Package [akka.actor](package-summary.html)
## Class AddressFromURIString$

- java.lang.Object
- - akka.actor.AddressFromURIString$

- ---

```
public class AddressFromURIString$
extends java.lang.Object
```

This object serves as extractor for Scala and as address parser for Java.

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [AddressFromURIString$](AddressFromURIString$.html "class in akka.actor")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[AddressFromURIString$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[Address](Address.html "class in akka.actor")` | `[apply](#apply(java.lang.String))​(java.lang.String addr)` | Try to construct an Address from the given String or throw a java.net.MalformedURLException. |
	| `[Address](Address.html "class in akka.actor")` | `[parse](#parse(java.lang.String))​(java.lang.String addr)` | Java API: Try to construct an Address from the given String or throw a java.net.MalformedURLException. |
	| `scala.Option<[Address](Address.html "class in akka.actor")>` | `[unapply](#unapply(java.lang.String))​(java.lang.String addr)` |  |
	| `scala.Option<[Address](Address.html "class in akka.actor")>` | `[unapply](#unapply(java.net.URI))​(java.net.URI uri)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [AddressFromURIString$](AddressFromURIString$.html "class in akka.actor") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### AddressFromURIString$
		
		
		
		```
		public AddressFromURIString$()
		```

	- ### Method Detail
	
	
	
		- #### unapply
		
		
		
		```
		public scala.Option<[Address](Address.html "class in akka.actor")> unapply​(java.lang.String addr)
		```
		- #### unapply
		
		
		
		```
		public scala.Option<[Address](Address.html "class in akka.actor")> unapply​(java.net.URI uri)
		```
		- #### apply
		
		
		
		```
		public [Address](Address.html "class in akka.actor") apply​(java.lang.String addr)
		```
		
		Try to construct an Address from the given String or throw a java.net.MalformedURLException.
		- #### parse
		
		
		
		```
		public [Address](Address.html "class in akka.actor") parse​(java.lang.String addr)
		```
		
		Java API: Try to construct an Address from the given String or throw a java.net.MalformedURLException.

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/actor/Address.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/AddressFromURIString$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/actor/AddressFromURIString$.html](https://doc.akka.io/japi/akka-core/2.10/akka/actor/AddressFromURIString$.html)*