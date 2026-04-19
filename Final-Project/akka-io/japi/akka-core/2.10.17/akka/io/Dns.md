---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T15:43:48Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10.17/akka/io/Dns.Resolved.html
title: Dns.Resolved
---

# Dns.Resolved

## Content

Package [akka.io](package-summary.html)
## Class Dns.Resolved

- java.lang.Object
- - akka.io.Dns.Resolved

- All Implemented Interfaces:
`[Dns.Command](Dns.Command.html "interface in akka.io")`, `java.io.Serializable`, `scala.Equals`, `scala.Product`

Enclosing class:
[Dns](Dns.html "class in akka.io")

---

```
public static class Dns.Resolved
extends java.lang.Object
implements [Dns.Command](Dns.Command.html "interface in akka.io"), scala.Product, java.io.Serializable
```

Deprecated.
Use cached(DnsProtocol.Resolved). Since 2\.6\.0\.

See Also:
[Serialized Form](../../serialized-form.html#akka.io.Dns.Resolved)

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[Resolved](#%3Cinit%3E(java.lang.String,scala.collection.immutable.Seq,scala.collection.immutable.Seq))​(java.lang.String name,  scala.collection.immutable.Seq<java.net.Inet4Address> ipv4,  scala.collection.immutable.Seq<java.net.Inet6Address> ipv6)` | Deprecated. |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) [Deprecated Methods](javascript:show(32);) 
	| Modifier and Type | Method | Description |
	| `java.net.InetAddress` | `[addr](#addr())()` | Deprecated. |
	| `scala.Option<java.net.InetAddress>` | `[addrOption](#addrOption())()` | Deprecated. |
	| `boolean` | `[canEqual](#canEqual(java.lang.Object))​(java.lang.Object x$1)` | Deprecated. |
	| `[Dns.Resolved](Dns.Resolved.html "class in akka.io")` | `[copy](#copy(java.lang.String,scala.collection.immutable.Seq,scala.collection.immutable.Seq))​(java.lang.String name,  scala.collection.immutable.Seq<java.net.Inet4Address> ipv4,  scala.collection.immutable.Seq<java.net.Inet6Address> ipv6)` | Deprecated. |
	| `java.lang.String` | `[copy$default$1](#copy$default$1())()` | Deprecated. |
	| `scala.collection.immutable.Seq<java.net.Inet4Address>` | `[copy$default$2](#copy$default$2())()` | Deprecated. |
	| `scala.collection.immutable.Seq<java.net.Inet6Address>` | `[copy$default$3](#copy$default$3())()` | Deprecated. |
	| `boolean` | `[equals](#equals(java.lang.Object))​(java.lang.Object x$1)` | Deprecated. |
	| `int` | `[hashCode](#hashCode())()` | Deprecated. |
	| `scala.collection.immutable.Seq<java.net.Inet4Address>` | `[ipv4](#ipv4())()` | Deprecated. |
	| `scala.collection.immutable.Seq<java.net.Inet6Address>` | `[ipv6](#ipv6())()` | Deprecated. |
	| `java.lang.String` | `[name](#name())()` | Deprecated. |
	| `int` | `[productArity](#productArity())()` | Deprecated. |
	| `java.lang.Object` | `[productElement](#productElement(int))​(int x$1)` | Deprecated. |
	| `java.lang.String` | `[productElementName](#productElementName(int))​(int x$1)` | Deprecated. |
	| `scala.collection.Iterator<java.lang.Object>` | `[productIterator](#productIterator())()` | Deprecated. |
	| `java.lang.String` | `[productPrefix](#productPrefix())()` | Deprecated. |
	| `java.lang.String` | `[toString](#toString())()` | Deprecated. |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, finalize, getClass, notify, notifyAll, wait, wait, wait`
		- ### Methods inherited from interface scala.Product
		
		
		`productElementNames`

- - ### Constructor Detail
	
	
	
		- #### Resolved
		
		
		
		```
		public Resolved​(java.lang.String name,
		                scala.collection.immutable.Seq<java.net.Inet4Address> ipv4,
		                scala.collection.immutable.Seq<java.net.Inet6Address> ipv6)
		```
		
		Deprecated.

	- ### Method Detail
	
	
	
		- #### name
		
		
		
		```
		public java.lang.String name()
		```
		
		Deprecated.
		- #### ipv4
		
		
		
		```
		public scala.collection.immutable.Seq<java.net.Inet4Address> ipv4()
		```
		
		Deprecated.
		- #### ipv6
		
		
		
		```
		public scala.collection.immutable.Seq<java.net.Inet6Address> ipv6()
		```
		
		Deprecated.
		- #### addrOption
		
		
		
		```
		public scala.Option<java.net.InetAddress> addrOption()
		```
		
		Deprecated.
		- #### addr
		
		
		
		```
		public java.net.InetAddress addr()
		                          throws java.net.UnknownHostException
		```
		
		Deprecated.
		
		Throws:
		`java.net.UnknownHostException`
		- #### copy
		
		
		
		```
		public [Dns.Resolved](Dns.Resolved.html "class in akka.io") copy​(java.lang.String name,
		                         scala.collection.immutable.Seq<java.net.Inet4Address> ipv4,
		                         scala.collection.immutable.Seq<java.net.Inet6Address> ipv6)
		```
		
		Deprecated.
		- #### copy$default$1
		
		
		
		```
		public java.lang.String copy$default$1()
		```
		
		Deprecated.
		- #### copy$default$2
		
		
		
		```
		public scala.collection.immutable.Seq<java.net.Inet4Address> copy$default$2()
		```
		
		Deprecated.
		- #### copy$default$3
		
		
		
		```
		public scala.collection.immutable.Seq<java.net.Inet6Address> copy$default$3()
		```
		
		Deprecated.
		- #### productPrefix
		
		
		
		```
		public java.lang.String productPrefix()
		```
		
		Deprecated.
		
		Specified by:
		`productPrefix` in interface `scala.Product`
		- #### productArity
		
		
		
		```
		public int productArity()
		```
		
		Deprecated.
		
		Specified by:
		`productArity` in interface `scala.Product`
		- #### productElement
		
		
		
		```
		public java.lang.Object productElement​(int x$1)
		```
		
		Deprecated.
		
		Specified by:
		`productElement` in interface `scala.Product`
		- #### productIterator
		
		
		
		```
		public scala.collection.Iterator<java.lang.Object> productIterator()
		```
		
		Deprecated.
		
		Specified by:
		`productIterator` in interface `scala.Product`
		- #### canEqual
		
		
		
		```
		public boolean canEqual​(java.lang.Object x$1)
		```
		
		Deprecated.
		
		Specified by:
		`canEqual` in interface `scala.Equals`
		- #### productElementName
		
		
		
		```
		public java.lang.String productElementName​(int x$1)
		```
		
		Deprecated.
		
		Specified by:
		`productElementName` in interface `scala.Product`
		- #### hashCode
		
		
		
		```
		public int hashCode()
		```
		
		Deprecated.
		
		Overrides:
		`hashCode` in class `java.lang.Object`
		- #### toString
		
		
		
		```
		public java.lang.String toString()
		```
		
		Deprecated.
		
		Overrides:
		`toString` in class `java.lang.Object`
		- #### equals
		
		
		
		```
		public boolean equals​(java.lang.Object x$1)
		```
		
		Deprecated.
		
		Specified by:
		`equals` in interface `scala.Equals`
		Overrides:
		`equals` in class `java.lang.Object`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10.17/akka/io/Dns.Command.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/io/Dns.Resolved.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/io/Dns.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/io/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10.17/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10.17/akka/io/Dns.Resolved.html](https://doc.akka.io/japi/akka-core/2.10.17/akka/io/Dns.Resolved.html)*