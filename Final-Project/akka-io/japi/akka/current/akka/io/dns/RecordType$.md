---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:18:54Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/io/dns/RecordType$.html
title: RecordType$
---

# RecordType$

## Content

Package [akka.io.dns](package-summary.html)
## Class RecordType$

- java.lang.Object
- - akka.io.dns.RecordType$

- All Implemented Interfaces:
`java.io.Serializable`

---

```
public class RecordType$
extends java.lang.Object
implements java.io.Serializable
```

See Also:
[Serialized Form](../../../serialized-form.html#akka.io.dns.RecordType$)

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [RecordType$](RecordType$.html "class in akka.io.dns")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[RecordType$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[RecordType](RecordType.html "class in akka.io.dns")` | `[A](#A())()` | A host address |
	| `[RecordType](RecordType.html "class in akka.io.dns")` | `[AAAA](#AAAA())()` | The AAAA resource record type is a record specific to the Internet class that stores a single IPv6 address. |
	| `<any>` | `[apply](#apply(short))​(short id)` |  |
	| `[RecordType](RecordType.html "class in akka.io.dns")` | `[apply](#apply(short,java.lang.String))​(short code,  java.lang.String name)` |  |
	| `[RecordType](RecordType.html "class in akka.io.dns")` | `[AXFR](#AXFR())()` |  |
	| `[RecordType](RecordType.html "class in akka.io.dns")` | `[CNAME](#CNAME())()` | the canonical name for an alias |
	| `[RecordType](RecordType.html "class in akka.io.dns")` | `[HINFO](#HINFO())()` | host information |
	| `[RecordType](RecordType.html "class in akka.io.dns")` | `[MAILA](#MAILA())()` |  |
	| `[RecordType](RecordType.html "class in akka.io.dns")` | `[MAILB](#MAILB())()` |  |
	| `[RecordType](RecordType.html "class in akka.io.dns")` | `[MB](#MB())()` | A mailbox domain name (EXPERIMENTAL) |
	| `[RecordType](RecordType.html "class in akka.io.dns")` | `[MD](#MD())()` | A mail destination (Obsolete \- use MX) |
	| `[RecordType](RecordType.html "class in akka.io.dns")` | `[MF](#MF())()` | A mail forwarder (Obsolete \- use MX) |
	| `[RecordType](RecordType.html "class in akka.io.dns")` | `[MG](#MG())()` | A mail group member (EXPERIMENTAL) |
	| `[RecordType](RecordType.html "class in akka.io.dns")` | `[MINFO](#MINFO())()` | mailbox or mail list information |
	| `[RecordType](RecordType.html "class in akka.io.dns")` | `[MR](#MR())()` | A mail rename domain name (EXPERIMENTAL) |
	| `[RecordType](RecordType.html "class in akka.io.dns")` | `[MX](#MX())()` | mail exchange |
	| `[RecordType](RecordType.html "class in akka.io.dns")` | `[NS](#NS())()` | An authoritative name server |
	| `[RecordType](RecordType.html "class in akka.io.dns")` | `[NULL](#NULL())()` | A null RR (EXPERIMENTAL) |
	| `[RecordType](RecordType.html "class in akka.io.dns")` | `[PTR](#PTR())()` | A domain name pointer |
	| `[RecordType](RecordType.html "class in akka.io.dns")` | `[SOA](#SOA())()` | marks the start of a zone of authority |
	| `[RecordType](RecordType.html "class in akka.io.dns")` | `[SRV](#SRV())()` | The SRV RR allows administrators to use several servers for a single  domain, to move services from host to host with little fuss, and to  designate some hosts as primary servers for a service and others as  backups. |
	| `[RecordType](RecordType.html "class in akka.io.dns")` | `[TXT](#TXT())()` | text strings |
	| `scala.Option<scala.Tuple2<java.lang.Object,​java.lang.String>>` | `[unapply](#unapply(akka.io.dns.RecordType))​([RecordType](RecordType.html "class in akka.io.dns") x$0)` |  |
	| `[RecordType](RecordType.html "class in akka.io.dns")` | `[WILDCARD](#WILDCARD())()` |  |
	| `[RecordType](RecordType.html "class in akka.io.dns")` | `[WKS](#WKS())()` | A well known service description |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [RecordType$](RecordType$.html "class in akka.io.dns") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### RecordType$
		
		
		
		```
		public RecordType$()
		```

	- ### Method Detail
	
	
	
		- #### apply
		
		
		
		```
		public <any> apply​(short id)
		```
		- #### A
		
		
		
		```
		public final [RecordType](RecordType.html "class in akka.io.dns") A()
		```
		
		A host address
		- #### NS
		
		
		
		```
		public final [RecordType](RecordType.html "class in akka.io.dns") NS()
		```
		
		An authoritative name server
		- #### MD
		
		
		
		```
		public final [RecordType](RecordType.html "class in akka.io.dns") MD()
		```
		
		A mail destination (Obsolete \- use MX)
		- #### MF
		
		
		
		```
		public final [RecordType](RecordType.html "class in akka.io.dns") MF()
		```
		
		A mail forwarder (Obsolete \- use MX)
		- #### CNAME
		
		
		
		```
		public final [RecordType](RecordType.html "class in akka.io.dns") CNAME()
		```
		
		the canonical name for an alias
		- #### SOA
		
		
		
		```
		public final [RecordType](RecordType.html "class in akka.io.dns") SOA()
		```
		
		marks the start of a zone of authority
		- #### MB
		
		
		
		```
		public final [RecordType](RecordType.html "class in akka.io.dns") MB()
		```
		
		A mailbox domain name (EXPERIMENTAL)
		- #### MG
		
		
		
		```
		public final [RecordType](RecordType.html "class in akka.io.dns") MG()
		```
		
		A mail group member (EXPERIMENTAL)
		- #### MR
		
		
		
		```
		public final [RecordType](RecordType.html "class in akka.io.dns") MR()
		```
		
		A mail rename domain name (EXPERIMENTAL)
		- #### NULL
		
		
		
		```
		public final [RecordType](RecordType.html "class in akka.io.dns") NULL()
		```
		
		A null RR (EXPERIMENTAL)
		- #### WKS
		
		
		
		```
		public final [RecordType](RecordType.html "class in akka.io.dns") WKS()
		```
		
		A well known service description
		- #### PTR
		
		
		
		```
		public final [RecordType](RecordType.html "class in akka.io.dns") PTR()
		```
		
		A domain name pointer
		- #### HINFO
		
		
		
		```
		public final [RecordType](RecordType.html "class in akka.io.dns") HINFO()
		```
		
		host information
		- #### MINFO
		
		
		
		```
		public final [RecordType](RecordType.html "class in akka.io.dns") MINFO()
		```
		
		mailbox or mail list information
		- #### MX
		
		
		
		```
		public final [RecordType](RecordType.html "class in akka.io.dns") MX()
		```
		
		mail exchange
		- #### TXT
		
		
		
		```
		public final [RecordType](RecordType.html "class in akka.io.dns") TXT()
		```
		
		text strings
		- #### AAAA
		
		
		
		```
		public final [RecordType](RecordType.html "class in akka.io.dns") AAAA()
		```
		
		The AAAA resource record type is a record specific to the Internet class that stores a single IPv6 address.
		- #### SRV
		
		
		
		```
		public final [RecordType](RecordType.html "class in akka.io.dns") SRV()
		```
		
		The SRV RR allows administrators to use several servers for a single
		 domain, to move services from host to host with little fuss, and to
		 designate some hosts as primary servers for a service and others as
		 backups.
		- #### AXFR
		
		
		
		```
		public final [RecordType](RecordType.html "class in akka.io.dns") AXFR()
		```
		- #### MAILB
		
		
		
		```
		public final [RecordType](RecordType.html "class in akka.io.dns") MAILB()
		```
		- #### MAILA
		
		
		
		```
		public final [RecordType](RecordType.html "class in akka.io.dns") MAILA()
		```
		- #### WILDCARD
		
		
		
		```
		public final [RecordType](RecordType.html "class in akka.io.dns") WILDCARD()
		```
		- #### apply
		
		
		
		```
		public [RecordType](RecordType.html "class in akka.io.dns") apply​(short code,
		                        java.lang.String name)
		```
		- #### unapply
		
		
		
		```
		public scala.Option<scala.Tuple2<java.lang.Object,​java.lang.String>> unapply​([RecordType](RecordType.html "class in akka.io.dns") x$0)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/io/dns/RecordType$.html
- https://doc.akka.io/japi/akka/current/akka/io/dns/RecordType.html
- https://doc.akka.io/japi/akka/current/akka/io/dns/package-summary.html
- https://doc.akka.io/japi/akka/current/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/io/dns/RecordType$.html](https://doc.akka.io/japi/akka/current/akka/io/dns/RecordType$.html)*