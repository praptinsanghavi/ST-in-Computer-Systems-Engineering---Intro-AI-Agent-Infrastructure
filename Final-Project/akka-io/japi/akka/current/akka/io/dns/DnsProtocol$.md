---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:18:49Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/io/dns/DnsProtocol$.html
title: DnsProtocol$
---

# DnsProtocol$

## Content

Package [akka.io.dns](package-summary.html)
## Class DnsProtocol$

- java.lang.Object
- - akka.io.dns.DnsProtocol$

- ---

```
public class DnsProtocol$
extends java.lang.Object
```

Supersedes [`Dns`](../Dns.html "class in akka.io") protocol.
 
 Note that one MUST configure `akka.io.dns.resolver = async-dns` to make use of this protocol and resolver.
 

 Allows for more detailed lookups, by specifying which records should be checked,
 and responses can more information than plain IP addresses (e.g. ports for SRV records).

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [DnsProtocol$](DnsProtocol$.html "class in akka.io.dns")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[DnsProtocol$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[DnsProtocol.RequestType](DnsProtocol.RequestType.html "interface in akka.io.dns")` | `[ipRequestType](#ipRequestType())()` | Java API |
	| `[DnsProtocol.RequestType](DnsProtocol.RequestType.html "interface in akka.io.dns")` | `[ipRequestType](#ipRequestType(boolean,boolean))​(boolean ipv4,  boolean ipv6)` | Java API |
	| `[DnsProtocol.Resolve](DnsProtocol.Resolve.html "class in akka.io.dns")` | `[resolve](#resolve(java.lang.String))​(java.lang.String name)` | Java API |
	| `[DnsProtocol.Resolve](DnsProtocol.Resolve.html "class in akka.io.dns")` | `[resolve](#resolve(java.lang.String,akka.io.dns.DnsProtocol.RequestType))​(java.lang.String name,  [DnsProtocol.RequestType](DnsProtocol.RequestType.html "interface in akka.io.dns") requestType)` | Java API |
	| `[DnsProtocol.RequestType](DnsProtocol.RequestType.html "interface in akka.io.dns")` | `[srvRequestType](#srvRequestType())()` | Java API |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [DnsProtocol$](DnsProtocol$.html "class in akka.io.dns") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### DnsProtocol$
		
		
		
		```
		public DnsProtocol$()
		```

	- ### Method Detail
	
	
	
		- #### ipRequestType
		
		
		
		```
		public [DnsProtocol.RequestType](DnsProtocol.RequestType.html "interface in akka.io.dns") ipRequestType​(boolean ipv4,
		                                             boolean ipv6)
		```
		
		Java API
		- #### ipRequestType
		
		
		
		```
		public [DnsProtocol.RequestType](DnsProtocol.RequestType.html "interface in akka.io.dns") ipRequestType()
		```
		
		Java API
		- #### srvRequestType
		
		
		
		```
		public [DnsProtocol.RequestType](DnsProtocol.RequestType.html "interface in akka.io.dns") srvRequestType()
		```
		
		Java API
		- #### resolve
		
		
		
		```
		public [DnsProtocol.Resolve](DnsProtocol.Resolve.html "class in akka.io.dns") resolve​(java.lang.String name)
		```
		
		Java API
		- #### resolve
		
		
		
		```
		public [DnsProtocol.Resolve](DnsProtocol.Resolve.html "class in akka.io.dns") resolve​(java.lang.String name,
		                                   [DnsProtocol.RequestType](DnsProtocol.RequestType.html "interface in akka.io.dns") requestType)
		```
		
		Java API

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/io/Dns.html
- https://doc.akka.io/japi/akka/current/akka/io/dns/DnsProtocol$.html
- https://doc.akka.io/japi/akka/current/akka/io/dns/DnsProtocol.RequestType.html
- https://doc.akka.io/japi/akka/current/akka/io/dns/DnsProtocol.Resolve.html
- https://doc.akka.io/japi/akka/current/akka/io/dns/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/io/dns/DnsProtocol$.html](https://doc.akka.io/japi/akka/current/akka/io/dns/DnsProtocol$.html)*