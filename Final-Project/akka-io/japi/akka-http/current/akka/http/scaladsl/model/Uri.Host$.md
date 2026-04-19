---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T00:33:09Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/Uri.Host$.Empty$.html
title: Uri.Host$.Empty$
---

# Uri.Host$.Empty$

## Content

Package [akka.http.scaladsl.model](package-summary.html)
## Class Uri.Host$.Empty$

- java.lang.Object
- - [akka.http.javadsl.model.Host](../../javadsl/model/Host.html "class in akka.http.javadsl.model")
	- - [akka.http.scaladsl.model.Uri.Host](Uri.Host.html "class in akka.http.scaladsl.model")
		- - akka.http.scaladsl.model.Uri.Host$.Empty$

- All Implemented Interfaces:
`java.io.Serializable`, `scala.Equals`, `scala.Product`

Enclosing class:
[Uri.Host$](Uri.Host$.html "class in akka.http.scaladsl.model")

---

```
public static class Uri.Host$.Empty$
extends [Uri.Host](Uri.Host.html "class in akka.http.scaladsl.model")
implements scala.Product, java.io.Serializable
```

See Also:
[Serialized Form](../../../../serialized-form.html#akka.http.scaladsl.model.Uri.Host$.Empty$)

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [Uri.Host$.Empty$](Uri.Host$.Empty$.html "class in akka.http.scaladsl.model")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |
	
	
		- ### Fields inherited from class akka.http.javadsl.model.[Host](../../javadsl/model/Host.html "class in akka.http.javadsl.model")
		
		
		`[EMPTY](../../javadsl/model/Host.html#EMPTY)`

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[Empty$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `java.lang.String` | `[address](#address())()` | Returns a String representation of the address. |
	| `boolean` | `[equalsIgnoreCase](#equalsIgnoreCase(akka.http.scaladsl.model.Uri.Host))​([Uri.Host](Uri.Host.html "class in akka.http.scaladsl.model") other)` |  |
	| `scala.collection.immutable.Seq<java.net.InetAddress>` | `[inetAddresses](#inetAddresses())()` |  |
	| `boolean` | `[isEmpty](#isEmpty())()` |  |
	| `scala.None$` | `[toOption](#toOption())()` |  |
	
	
		- ### Methods inherited from class akka.http.scaladsl.model.[Uri.Host](Uri.Host.html "class in akka.http.scaladsl.model")
		
		
		`[getInetAddresses](Uri.Host.html#getInetAddresses()), [isIPv4](Uri.Host.html#isIPv4()), [isIPv6](Uri.Host.html#isIPv6()), [isNamedHost](Uri.Host.html#isNamedHost()), [toString](Uri.Host.html#toString())`
		- ### Methods inherited from class akka.http.javadsl.model.[Host](../../javadsl/model/Host.html "class in akka.http.javadsl.model")
		
		
		`[create](../../javadsl/model/Host.html#create(java.lang.String)), [create](../../javadsl/model/Host.html#create(java.lang.String,akka.http.scaladsl.model.Uri.ParsingMode)), [create](../../javadsl/model/Host.html#create(java.lang.String,java.nio.charset.Charset,akka.http.scaladsl.model.Uri.ParsingMode))`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, wait, wait, wait`
		- ### Methods inherited from interface scala.Equals
		
		
		`canEqual, equals`
		- ### Methods inherited from interface scala.Product
		
		
		`productArity, productElement, productElementName, productElementNames, productIterator, productPrefix`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [Uri.Host$.Empty$](Uri.Host$.Empty$.html "class in akka.http.scaladsl.model") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### Empty$
		
		
		
		```
		public Empty$()
		```

	- ### Method Detail
	
	
	
		- #### address
		
		
		
		```
		public java.lang.String address()
		```
		
		Description copied from class: `[Host](../../javadsl/model/Host.html#address())`
		Returns a String representation of the address.
		
		Specified by:
		`[address](Uri.Host.html#address())` in class `[Uri.Host](Uri.Host.html "class in akka.http.scaladsl.model")`
		- #### isEmpty
		
		
		
		```
		public boolean isEmpty()
		```
		
		
		Specified by:
		`[isEmpty](Uri.Host.html#isEmpty())` in class `[Uri.Host](Uri.Host.html "class in akka.http.scaladsl.model")`
		- #### toOption
		
		
		
		```
		public scala.None$ toOption()
		```
		- #### inetAddresses
		
		
		
		```
		public scala.collection.immutable.Seq<java.net.InetAddress> inetAddresses()
		```
		
		
		Specified by:
		`[inetAddresses](Uri.Host.html#inetAddresses())` in class `[Uri.Host](Uri.Host.html "class in akka.http.scaladsl.model")`
		- #### equalsIgnoreCase
		
		
		
		```
		public boolean equalsIgnoreCase​([Uri.Host](Uri.Host.html "class in akka.http.scaladsl.model") other)
		```
		
		
		Specified by:
		`[equalsIgnoreCase](Uri.Host.html#equalsIgnoreCase(akka.http.scaladsl.model.Uri.Host))` in class `[Uri.Host](Uri.Host.html "class in akka.http.scaladsl.model")`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/Host.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/Uri.Host$.Empty$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/Uri.Host$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/Uri.Host.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/package-summary.html
- https://doc.akka.io/japi/akka-http/current/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/Uri.Host$.Empty$.html](https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/Uri.Host$.Empty$.html)*