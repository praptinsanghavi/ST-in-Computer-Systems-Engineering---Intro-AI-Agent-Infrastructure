---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:18:53Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/io/dns/RecordType.html
title: RecordType
---

# RecordType

## Content

Package [akka.io.dns](package-summary.html)
## Class RecordType

- java.lang.Object
- - akka.io.dns.RecordType

- All Implemented Interfaces:
`java.io.Serializable`, `scala.Equals`, `scala.Product`

---

```
public final class RecordType
extends java.lang.Object
implements scala.Product, java.io.Serializable
```

DNS Record Type

See Also:
[Serialized Form](../../../serialized-form.html#akka.io.dns.RecordType)

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[RecordType](#%3Cinit%3E(short,java.lang.String))​(short code,  java.lang.String name)` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `static [RecordType](RecordType.html "class in akka.io.dns")` | `[A](#A())()` | A host address |
	| `static [RecordType](RecordType.html "class in akka.io.dns")` | `[AAAA](#AAAA())()` | The AAAA resource record type is a record specific to the Internet class that stores a single IPv6 address. |
	| `static <any>` | `[apply](#apply(short))​(short id)` |  |
	| `static [RecordType](RecordType.html "class in akka.io.dns")` | `[apply](#apply(short,java.lang.String))​(short code,  java.lang.String name)` |  |
	| `static [RecordType](RecordType.html "class in akka.io.dns")` | `[AXFR](#AXFR())()` |  |
	| `boolean` | `[canEqual](#canEqual(java.lang.Object))​(java.lang.Object x$1)` |  |
	| `static [RecordType](RecordType.html "class in akka.io.dns")` | `[CNAME](#CNAME())()` | the canonical name for an alias |
	| `short` | `[code](#code())()` |  |
	| `[RecordType](RecordType.html "class in akka.io.dns")` | `[copy](#copy(short,java.lang.String))​(short code,  java.lang.String name)` |  |
	| `short` | `[copy$default$1](#copy$default$1())()` |  |
	| `java.lang.String` | `[copy$default$2](#copy$default$2())()` |  |
	| `boolean` | `[equals](#equals(java.lang.Object))​(java.lang.Object x$1)` |  |
	| `int` | `[hashCode](#hashCode())()` |  |
	| `static [RecordType](RecordType.html "class in akka.io.dns")` | `[HINFO](#HINFO())()` | host information |
	| `static [RecordType](RecordType.html "class in akka.io.dns")` | `[MAILA](#MAILA())()` |  |
	| `static [RecordType](RecordType.html "class in akka.io.dns")` | `[MAILB](#MAILB())()` |  |
	| `static [RecordType](RecordType.html "class in akka.io.dns")` | `[MB](#MB())()` | A mailbox domain name (EXPERIMENTAL) |
	| `static [RecordType](RecordType.html "class in akka.io.dns")` | `[MD](#MD())()` | A mail destination (Obsolete \- use MX) |
	| `static [RecordType](RecordType.html "class in akka.io.dns")` | `[MF](#MF())()` | A mail forwarder (Obsolete \- use MX) |
	| `static [RecordType](RecordType.html "class in akka.io.dns")` | `[MG](#MG())()` | A mail group member (EXPERIMENTAL) |
	| `static [RecordType](RecordType.html "class in akka.io.dns")` | `[MINFO](#MINFO())()` | mailbox or mail list information |
	| `static [RecordType](RecordType.html "class in akka.io.dns")` | `[MR](#MR())()` | A mail rename domain name (EXPERIMENTAL) |
	| `static [RecordType](RecordType.html "class in akka.io.dns")` | `[MX](#MX())()` | mail exchange |
	| `java.lang.String` | `[name](#name())()` |  |
	| `static [RecordType](RecordType.html "class in akka.io.dns")` | `[NS](#NS())()` | An authoritative name server |
	| `static [RecordType](RecordType.html "class in akka.io.dns")` | `[NULL](#NULL())()` | A null RR (EXPERIMENTAL) |
	| `int` | `[productArity](#productArity())()` |  |
	| `java.lang.Object` | `[productElement](#productElement(int))​(int x$1)` |  |
	| `java.lang.String` | `[productElementName](#productElementName(int))​(int x$1)` |  |
	| `scala.collection.Iterator<java.lang.Object>` | `[productIterator](#productIterator())()` |  |
	| `java.lang.String` | `[productPrefix](#productPrefix())()` |  |
	| `static [RecordType](RecordType.html "class in akka.io.dns")` | `[PTR](#PTR())()` | A domain name pointer |
	| `static [RecordType](RecordType.html "class in akka.io.dns")` | `[SOA](#SOA())()` | marks the start of a zone of authority |
	| `static [RecordType](RecordType.html "class in akka.io.dns")` | `[SRV](#SRV())()` | The SRV RR allows administrators to use several servers for a single  domain, to move services from host to host with little fuss, and to  designate some hosts as primary servers for a service and others as  backups. |
	| `java.lang.String` | `[toString](#toString())()` |  |
	| `static [RecordType](RecordType.html "class in akka.io.dns")` | `[TXT](#TXT())()` | text strings |
	| `static scala.Option<scala.Tuple2<java.lang.Object,​java.lang.String>>` | `[unapply](#unapply(akka.io.dns.RecordType))​([RecordType](RecordType.html "class in akka.io.dns") x$0)` |  |
	| `static [RecordType](RecordType.html "class in akka.io.dns")` | `[WILDCARD](#WILDCARD())()` |  |
	| `static [RecordType](RecordType.html "class in akka.io.dns")` | `[WKS](#WKS())()` | A well known service description |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, finalize, getClass, notify, notifyAll, wait, wait, wait`
		- ### Methods inherited from interface scala.Product
		
		
		`productElementNames`

- - ### Constructor Detail
	
	
	
		- #### RecordType
		
		
		
		```
		public RecordType​(short code,
		                  java.lang.String name)
		```

	- ### Method Detail
	
	
	
		- #### apply
		
		
		
		```
		public static <any> apply​(short id)
		```
		- #### A
		
		
		
		```
		public static final [RecordType](RecordType.html "class in akka.io.dns") A()
		```
		
		A host address
		- #### NS
		
		
		
		```
		public static final [RecordType](RecordType.html "class in akka.io.dns") NS()
		```
		
		An authoritative name server
		- #### MD
		
		
		
		```
		public static final [RecordType](RecordType.html "class in akka.io.dns") MD()
		```
		
		A mail destination (Obsolete \- use MX)
		- #### MF
		
		
		
		```
		public static final [RecordType](RecordType.html "class in akka.io.dns") MF()
		```
		
		A mail forwarder (Obsolete \- use MX)
		- #### CNAME
		
		
		
		```
		public static final [RecordType](RecordType.html "class in akka.io.dns") CNAME()
		```
		
		the canonical name for an alias
		- #### SOA
		
		
		
		```
		public static final [RecordType](RecordType.html "class in akka.io.dns") SOA()
		```
		
		marks the start of a zone of authority
		- #### MB
		
		
		
		```
		public static final [RecordType](RecordType.html "class in akka.io.dns") MB()
		```
		
		A mailbox domain name (EXPERIMENTAL)
		- #### MG
		
		
		
		```
		public static final [RecordType](RecordType.html "class in akka.io.dns") MG()
		```
		
		A mail group member (EXPERIMENTAL)
		- #### MR
		
		
		
		```
		public static final [RecordType](RecordType.html "class in akka.io.dns") MR()
		```
		
		A mail rename domain name (EXPERIMENTAL)
		- #### NULL
		
		
		
		```
		public static final [RecordType](RecordType.html "class in akka.io.dns") NULL()
		```
		
		A null RR (EXPERIMENTAL)
		- #### WKS
		
		
		
		```
		public static final [RecordType](RecordType.html "class in akka.io.dns") WKS()
		```
		
		A well known service description
		- #### PTR
		
		
		
		```
		public static final [RecordType](RecordType.html "class in akka.io.dns") PTR()
		```
		
		A domain name pointer
		- #### HINFO
		
		
		
		```
		public static final [RecordType](RecordType.html "class in akka.io.dns") HINFO()
		```
		
		host information
		- #### MINFO
		
		
		
		```
		public static final [RecordType](RecordType.html "class in akka.io.dns") MINFO()
		```
		
		mailbox or mail list information
		- #### MX
		
		
		
		```
		public static final [RecordType](RecordType.html "class in akka.io.dns") MX()
		```
		
		mail exchange
		- #### TXT
		
		
		
		```
		public static final [RecordType](RecordType.html "class in akka.io.dns") TXT()
		```
		
		text strings
		- #### AAAA
		
		
		
		```
		public static final [RecordType](RecordType.html "class in akka.io.dns") AAAA()
		```
		
		The AAAA resource record type is a record specific to the Internet class that stores a single IPv6 address.
		- #### SRV
		
		
		
		```
		public static final [RecordType](RecordType.html "class in akka.io.dns") SRV()
		```
		
		The SRV RR allows administrators to use several servers for a single
		 domain, to move services from host to host with little fuss, and to
		 designate some hosts as primary servers for a service and others as
		 backups.
		- #### AXFR
		
		
		
		```
		public static final [RecordType](RecordType.html "class in akka.io.dns") AXFR()
		```
		- #### MAILB
		
		
		
		```
		public static final [RecordType](RecordType.html "class in akka.io.dns") MAILB()
		```
		- #### MAILA
		
		
		
		```
		public static final [RecordType](RecordType.html "class in akka.io.dns") MAILA()
		```
		- #### WILDCARD
		
		
		
		```
		public static final [RecordType](RecordType.html "class in akka.io.dns") WILDCARD()
		```
		- #### apply
		
		
		
		```
		public static [RecordType](RecordType.html "class in akka.io.dns") apply​(short code,
		                               java.lang.String name)
		```
		- #### unapply
		
		
		
		```
		public static scala.Option<scala.Tuple2<java.lang.Object,​java.lang.String>> unapply​([RecordType](RecordType.html "class in akka.io.dns") x$0)
		```
		- #### code
		
		
		
		```
		public short code()
		```
		- #### name
		
		
		
		```
		public java.lang.String name()
		```
		- #### copy
		
		
		
		```
		public [RecordType](RecordType.html "class in akka.io.dns") copy​(short code,
		                       java.lang.String name)
		```
		- #### copy$default$1
		
		
		
		```
		public short copy$default$1()
		```
		- #### copy$default$2
		
		
		
		```
		public java.lang.String copy$default$2()
		```
		- #### productPrefix
		
		
		
		```
		public java.lang.String productPrefix()
		```
		
		
		Specified by:
		`productPrefix` in interface `scala.Product`
		- #### productArity
		
		
		
		```
		public int productArity()
		```
		
		
		Specified by:
		`productArity` in interface `scala.Product`
		- #### productElement
		
		
		
		```
		public java.lang.Object productElement​(int x$1)
		```
		
		
		Specified by:
		`productElement` in interface `scala.Product`
		- #### productIterator
		
		
		
		```
		public scala.collection.Iterator<java.lang.Object> productIterator()
		```
		
		
		Specified by:
		`productIterator` in interface `scala.Product`
		- #### canEqual
		
		
		
		```
		public boolean canEqual​(java.lang.Object x$1)
		```
		
		
		Specified by:
		`canEqual` in interface `scala.Equals`
		- #### productElementName
		
		
		
		```
		public java.lang.String productElementName​(int x$1)
		```
		
		
		Specified by:
		`productElementName` in interface `scala.Product`
		- #### hashCode
		
		
		
		```
		public int hashCode()
		```
		
		
		Overrides:
		`hashCode` in class `java.lang.Object`
		- #### toString
		
		
		
		```
		public java.lang.String toString()
		```
		
		
		Overrides:
		`toString` in class `java.lang.Object`
		- #### equals
		
		
		
		```
		public boolean equals​(java.lang.Object x$1)
		```
		
		
		Specified by:
		`equals` in interface `scala.Equals`
		Overrides:
		`equals` in class `java.lang.Object`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/io/dns/RecordType.html
- https://doc.akka.io/japi/akka/current/akka/io/dns/package-summary.html
- https://doc.akka.io/japi/akka/current/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/io/dns/RecordType.html](https://doc.akka.io/japi/akka/current/akka/io/dns/RecordType.html)*