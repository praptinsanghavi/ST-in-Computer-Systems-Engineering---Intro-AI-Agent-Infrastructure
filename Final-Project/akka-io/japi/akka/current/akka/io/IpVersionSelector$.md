---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:17:08Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/io/IpVersionSelector$.html
title: IpVersionSelector$
---

# IpVersionSelector$

## Content

Package [akka.io](package-summary.html)
## Class IpVersionSelector$

- java.lang.Object
- - akka.io.IpVersionSelector$

- ---

```
public class IpVersionSelector$
extends java.lang.Object
```

INTERNAL API

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [IpVersionSelector$](IpVersionSelector$.html "class in akka.io")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[IpVersionSelector$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `scala.Option<java.net.InetAddress>` | `[getInetAddress](#getInetAddress(scala.Option,scala.Option))​(scala.Option<java.net.Inet4Address> ipv4,  scala.Option<java.net.Inet6Address> ipv6)` | INTERNAL API |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [IpVersionSelector$](IpVersionSelector$.html "class in akka.io") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### IpVersionSelector$
		
		
		
		```
		public IpVersionSelector$()
		```

	- ### Method Detail
	
	
	
		- #### getInetAddress
		
		
		
		```
		public scala.Option<java.net.InetAddress> getInetAddress​(scala.Option<java.net.Inet4Address> ipv4,
		                                                         scala.Option<java.net.Inet6Address> ipv6)
		```
		
		INTERNAL API

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/io/IpVersionSelector$.html
- https://doc.akka.io/japi/akka/current/akka/io/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/io/IpVersionSelector$.html](https://doc.akka.io/japi/akka/current/akka/io/IpVersionSelector$.html)*