---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T16:08:15Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/io/dns/DnsProtocol.html
title: DnsProtocol
---

# DnsProtocol

## Content

Package [akka.io.dns](package-summary.html)
## Class DnsProtocol

- java.lang.Object
- - akka.io.dns.DnsProtocol

- ---

```
public class DnsProtocol
extends java.lang.Object
```

Supersedes [`Dns`](../Dns.html "class in akka.io") protocol.
 
 Note that one MUST configure `akka.io.dns.resolver = async-dns` to make use of this protocol and resolver.
 

 Allows for more detailed lookups, by specifying which records should be checked,
 and responses can more information than plain IP addresses (e.g. ports for SRV records).

- - ### Nested Class Summary
	
	
	
	Nested Classes 
	| Modifier and Type | Class | Description |
	| `static class` | `[DnsProtocol.Ip](DnsProtocol.Ip.html "class in akka.io.dns")` |  |
	| `static class` | `[DnsProtocol.Ip$](DnsProtocol.Ip$.html "class in akka.io.dns")` |  |
	| `static interface` | `[DnsProtocol.RequestType](DnsProtocol.RequestType.html "interface in akka.io.dns")` |  |
	| `static class` | `[DnsProtocol.Resolve](DnsProtocol.Resolve.html "class in akka.io.dns")` | Sending this to the `AsyncDnsManager` will either lead to a [`DnsProtocol.Resolved`](DnsProtocol.Resolved.html "class in akka.io.dns") or a [`Status.Failure`](../../actor/Status.Failure.html "class in akka.actor") response. |
	| `static class` | `[DnsProtocol.Resolve$](DnsProtocol.Resolve$.html "class in akka.io.dns")` |  |
	| `static class` | `[DnsProtocol.Resolved](DnsProtocol.Resolved.html "class in akka.io.dns")` | param: name of the record  param: records resource records for the query  param: additionalRecords records that relate to the query but are not strictly answers |
	| `static class` | `[DnsProtocol.Resolved$](DnsProtocol.Resolved$.html "class in akka.io.dns")` |  |
	| `static class` | `[DnsProtocol.Srv$](DnsProtocol.Srv$.html "class in akka.io.dns")` |  |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[DnsProtocol](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `static [DnsProtocol.RequestType](DnsProtocol.RequestType.html "interface in akka.io.dns")` | `[ipRequestType](#ipRequestType())()` | Java API |
	| `static [DnsProtocol.RequestType](DnsProtocol.RequestType.html "interface in akka.io.dns")` | `[ipRequestType](#ipRequestType(boolean,boolean))​(boolean ipv4,  boolean ipv6)` | Java API |
	| `static [DnsProtocol.Resolve](DnsProtocol.Resolve.html "class in akka.io.dns")` | `[resolve](#resolve(java.lang.String))​(java.lang.String name)` | Java API |
	| `static [DnsProtocol.Resolve](DnsProtocol.Resolve.html "class in akka.io.dns")` | `[resolve](#resolve(java.lang.String,akka.io.dns.DnsProtocol.RequestType))​(java.lang.String name,  [DnsProtocol.RequestType](DnsProtocol.RequestType.html "interface in akka.io.dns") requestType)` | Java API |
	| `static [DnsProtocol.RequestType](DnsProtocol.RequestType.html "interface in akka.io.dns")` | `[srvRequestType](#srvRequestType())()` | Java API |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### DnsProtocol
		
		
		
		```
		public DnsProtocol()
		```

	- ### Method Detail
	
	
	
		- #### ipRequestType
		
		
		
		```
		public static [DnsProtocol.RequestType](DnsProtocol.RequestType.html "interface in akka.io.dns") ipRequestType​(boolean ipv4,
		                                                    boolean ipv6)
		```
		
		Java API
		- #### ipRequestType
		
		
		
		```
		public static [DnsProtocol.RequestType](DnsProtocol.RequestType.html "interface in akka.io.dns") ipRequestType()
		```
		
		Java API
		- #### srvRequestType
		
		
		
		```
		public static [DnsProtocol.RequestType](DnsProtocol.RequestType.html "interface in akka.io.dns") srvRequestType()
		```
		
		Java API
		- #### resolve
		
		
		
		```
		public static [DnsProtocol.Resolve](DnsProtocol.Resolve.html "class in akka.io.dns") resolve​(java.lang.String name)
		```
		
		Java API
		- #### resolve
		
		
		
		```
		public static [DnsProtocol.Resolve](DnsProtocol.Resolve.html "class in akka.io.dns") resolve​(java.lang.String name,
		                                          [DnsProtocol.RequestType](DnsProtocol.RequestType.html "interface in akka.io.dns") requestType)
		```
		
		Java API

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/actor/Status.Failure.html
- https://doc.akka.io/japi/akka-core/2.10/akka/io/Dns.html
- https://doc.akka.io/japi/akka-core/2.10/akka/io/dns/DnsProtocol.Ip$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/io/dns/DnsProtocol.Ip.html
- https://doc.akka.io/japi/akka-core/2.10/akka/io/dns/DnsProtocol.RequestType.html
- https://doc.akka.io/japi/akka-core/2.10/akka/io/dns/DnsProtocol.Resolve$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/io/dns/DnsProtocol.Resolve.html
- https://doc.akka.io/japi/akka-core/2.10/akka/io/dns/DnsProtocol.Resolved$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/io/dns/DnsProtocol.Resolved.html
- https://doc.akka.io/japi/akka-core/2.10/akka/io/dns/DnsProtocol.Srv$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/io/dns/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/io/dns/DnsProtocol.html](https://doc.akka.io/japi/akka-core/2.10/akka/io/dns/DnsProtocol.html)*