---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:16:57Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/io/Dns.Resolved$.html
title: Dns.Resolved$
---

# Dns.Resolved$

## Content

Package [akka.io](package-summary.html)
## Class Dns.Resolved$

- java.lang.Object
- - akka.io.Dns.Resolved$

- All Implemented Interfaces:
`java.io.Serializable`

Enclosing class:
[Dns](Dns.html "class in akka.io")

---

```
public static class Dns.Resolved$
extends java.lang.Object
implements java.io.Serializable
```

Deprecated.
Use cached(DnsProtocol.Resolved). Since 2\.6\.0\.

See Also:
[Serialized Form](../../serialized-form.html#akka.io.Dns.Resolved$)

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [Dns.Resolved$](Dns.Resolved$.html "class in akka.io")` | `[MODULE$](#MODULE$)` | Deprecated. Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[Resolved$](#%3Cinit%3E())()` | Deprecated. |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) [Deprecated Methods](javascript:show(32);) 
	| Modifier and Type | Method | Description |
	| `[Dns.Resolved](Dns.Resolved.html "class in akka.io")` | `[apply](#apply(akka.io.dns.DnsProtocol.Resolved))​([DnsProtocol.Resolved](dns/DnsProtocol.Resolved.html "class in akka.io.dns") newProtocol)` | Deprecated. Use cached(DnsProtocol.Resolve). |
	| `[Dns.Resolved](Dns.Resolved.html "class in akka.io")` | `[apply](#apply(java.lang.String,scala.collection.immutable.Seq,scala.collection.immutable.Seq))​(java.lang.String name,  scala.collection.immutable.Seq<java.net.Inet4Address> ipv4,  scala.collection.immutable.Seq<java.net.Inet6Address> ipv6)` | Deprecated. |
	| `[Dns.Resolved](Dns.Resolved.html "class in akka.io")` | `[apply](#apply(java.lang.String,scala.collection.Iterable))​(java.lang.String name,  scala.collection.Iterable<java.net.InetAddress> addresses)` | Deprecated. |
	| `scala.Option<scala.Tuple3<java.lang.String,​scala.collection.immutable.Seq<java.net.Inet4Address>,​scala.collection.immutable.Seq<java.net.Inet6Address>>>` | `[unapply](#unapply(akka.io.Dns.Resolved))​([Dns.Resolved](Dns.Resolved.html "class in akka.io") x$0)` | Deprecated. |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [Dns.Resolved$](Dns.Resolved$.html "class in akka.io") MODULE$
		```
		
		Deprecated.
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### Resolved$
		
		
		
		```
		public Resolved$()
		```
		
		Deprecated.

	- ### Method Detail
	
	
	
		- #### apply
		
		
		
		```
		public [Dns.Resolved](Dns.Resolved.html "class in akka.io") apply​(java.lang.String name,
		                          scala.collection.Iterable<java.net.InetAddress> addresses)
		```
		
		Deprecated.
		- #### apply
		
		
		
		```
		public [Dns.Resolved](Dns.Resolved.html "class in akka.io") apply​([DnsProtocol.Resolved](dns/DnsProtocol.Resolved.html "class in akka.io.dns") newProtocol)
		```
		
		Deprecated.
		Use cached(DnsProtocol.Resolve). Since 2\.6\.0\.
		- #### apply
		
		
		
		```
		public [Dns.Resolved](Dns.Resolved.html "class in akka.io") apply​(java.lang.String name,
		                          scala.collection.immutable.Seq<java.net.Inet4Address> ipv4,
		                          scala.collection.immutable.Seq<java.net.Inet6Address> ipv6)
		```
		
		Deprecated.
		- #### unapply
		
		
		
		```
		public scala.Option<scala.Tuple3<java.lang.String,​scala.collection.immutable.Seq<java.net.Inet4Address>,​scala.collection.immutable.Seq<java.net.Inet6Address>>> unapply​([Dns.Resolved](Dns.Resolved.html "class in akka.io") x$0)
		```
		
		Deprecated.

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/io/Dns.Resolved$.html
- https://doc.akka.io/japi/akka/current/akka/io/Dns.Resolved.html
- https://doc.akka.io/japi/akka/current/akka/io/Dns.html
- https://doc.akka.io/japi/akka/current/akka/io/dns/DnsProtocol.Resolved.html
- https://doc.akka.io/japi/akka/current/akka/io/package-summary.html
- https://doc.akka.io/japi/akka/current/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/io/Dns.Resolved$.html](https://doc.akka.io/japi/akka/current/akka/io/Dns.Resolved$.html)*