---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:15:18Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/discovery/dns/DnsServiceDiscovery$.html
title: DnsServiceDiscovery$
---

# DnsServiceDiscovery$

## Content

Package [akka.discovery.dns](package-summary.html)
## Class DnsServiceDiscovery$

- java.lang.Object
- - akka.discovery.dns.DnsServiceDiscovery$

- ---

```
public class DnsServiceDiscovery$
extends java.lang.Object
```

INTERNAL API

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [DnsServiceDiscovery$](DnsServiceDiscovery$.html "class in akka.discovery.dns")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[DnsServiceDiscovery$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[ServiceDiscovery.Resolved](../ServiceDiscovery.Resolved.html "class in akka.discovery")` | `[srvRecordsToResolved](#srvRecordsToResolved(java.lang.String,akka.io.dns.DnsProtocol.Resolved))​(java.lang.String srvRequest,  [DnsProtocol.Resolved](../../io/dns/DnsProtocol.Resolved.html "class in akka.io.dns") resolved)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [DnsServiceDiscovery$](DnsServiceDiscovery$.html "class in akka.discovery.dns") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### DnsServiceDiscovery$
		
		
		
		```
		public DnsServiceDiscovery$()
		```

	- ### Method Detail
	
	
	
		- #### srvRecordsToResolved
		
		
		
		```
		public [ServiceDiscovery.Resolved](../ServiceDiscovery.Resolved.html "class in akka.discovery") srvRecordsToResolved​(java.lang.String srvRequest,
		                                                      [DnsProtocol.Resolved](../../io/dns/DnsProtocol.Resolved.html "class in akka.io.dns") resolved)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/discovery/ServiceDiscovery.Resolved.html
- https://doc.akka.io/japi/akka/current/akka/discovery/dns/DnsServiceDiscovery$.html
- https://doc.akka.io/japi/akka/current/akka/discovery/dns/package-summary.html
- https://doc.akka.io/japi/akka/current/akka/io/dns/DnsProtocol.Resolved.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/discovery/dns/DnsServiceDiscovery$.html](https://doc.akka.io/japi/akka/current/akka/discovery/dns/DnsServiceDiscovery$.html)*