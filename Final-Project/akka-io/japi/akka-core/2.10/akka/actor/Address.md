---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:34:09Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/actor/Address.html
title: Address
---

# Address

## Content

Package [akka.actor](package-summary.html)
## Class Address

- java.lang.Object
- - akka.actor.Address

- All Implemented Interfaces:
`java.io.Serializable`, `scala.Equals`, `scala.Product`

---

```
public final class Address
extends java.lang.Object
implements scala.Product, java.io.Serializable
```

The address specifies the physical location under which an Actor can be
 reached. Examples are local addresses, identified by the ActorSystem\&rsquo;s
 name, and remote addresses, identified by protocol, host and port.
 
 This class is final to allow use as a case class (copy method etc.); if
 for example a remote transport would want to associate additional
 information with an address, then this must be done externally.
 

 Not for user instantiation

See Also:
[Serialized Form](../../serialized-form.html#akka.actor.Address)

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[Address](#%3Cinit%3E(java.lang.String,java.lang.String))​(java.lang.String protocol,  java.lang.String system)` |  |
	| `[Address](#%3Cinit%3E(java.lang.String,java.lang.String,java.lang.String,int))​(java.lang.String protocol,  java.lang.String system,  java.lang.String host,  int port)` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `static scala.math.Ordering<[Address](Address.html "class in akka.actor")>` | `[addressOrdering](#addressOrdering())()` | `Address` ordering type class, sorts addresses by protocol, name, host and port. |
	| `static [Address](Address.html "class in akka.actor")` | `[apply](#apply(java.lang.String,java.lang.String))​(java.lang.String protocol,  java.lang.String system)` | Constructs a new Address with the specified protocol and system name |
	| `static [Address](Address.html "class in akka.actor")` | `[apply](#apply(java.lang.String,java.lang.String,java.lang.String,int))​(java.lang.String protocol,  java.lang.String system,  java.lang.String host,  int port)` | Constructs a new Address with the specified protocol, system name, host and port |
	| `static [Address](Address.html "class in akka.actor")` | `[apply](#apply(java.lang.String,java.lang.String,scala.Option,scala.Option))​(java.lang.String protocol,  java.lang.String system,  scala.Option<java.lang.String> host,  scala.Option<java.lang.Object> port)` |  |
	| `boolean` | `[canEqual](#canEqual(java.lang.Object))​(java.lang.Object x$1)` |  |
	| `[Address](Address.html "class in akka.actor")` | `[copy](#copy(java.lang.String,java.lang.String,scala.Option,scala.Option))​(java.lang.String protocol,  java.lang.String system,  scala.Option<java.lang.String> host,  scala.Option<java.lang.Object> port)` |  |
	| `java.lang.String` | `[copy$default$1](#copy$default$1())()` |  |
	| `java.lang.String` | `[copy$default$2](#copy$default$2())()` |  |
	| `scala.Option<java.lang.String>` | `[copy$default$3](#copy$default$3())()` |  |
	| `scala.Option<java.lang.Object>` | `[copy$default$4](#copy$default$4())()` |  |
	| `boolean` | `[equals](#equals(java.lang.Object))​(java.lang.Object x$1)` |  |
	| `java.util.Optional<java.lang.String>` | `[getHost](#getHost())()` | Java API: The hostname if specified or empty optional if not |
	| `java.util.Optional<java.lang.Integer>` | `[getPort](#getPort())()` | Java API: The port if specified or empty optional if not |
	| `boolean` | `[hasGlobalScope](#hasGlobalScope())()` | Returns true if this Address is usable globally. |
	| `int` | `[hashCode](#hashCode())()` |  |
	| `boolean` | `[hasLocalScope](#hasLocalScope())()` | Returns true if this Address is only defined locally. |
	| `scala.Option<java.lang.String>` | `[host](#host())()` |  |
	| `java.lang.String` | `[hostPort](#hostPort())()` | Returns a String representation formatted as: |
	| `static scala.util.matching.Regex` | `[InvalidHostRegex](#InvalidHostRegex())()` |  |
	| `scala.Option<java.lang.Object>` | `[port](#port())()` |  |
	| `int` | `[productArity](#productArity())()` |  |
	| `java.lang.Object` | `[productElement](#productElement(int))​(int x$1)` |  |
	| `java.lang.String` | `[productElementName](#productElementName(int))​(int x$1)` |  |
	| `scala.collection.Iterator<java.lang.Object>` | `[productIterator](#productIterator())()` |  |
	| `java.lang.String` | `[productPrefix](#productPrefix())()` |  |
	| `java.lang.String` | `[protocol](#protocol())()` |  |
	| `java.lang.String` | `[system](#system())()` |  |
	| `java.lang.String` | `[toString](#toString())()` |  |
	| `static scala.Option<scala.Tuple4<java.lang.String,​java.lang.String,​scala.Option<java.lang.String>,​scala.Option<java.lang.Object>>>` | `[unapply](#unapply(akka.actor.Address))​([Address](Address.html "class in akka.actor") x$0)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, finalize, getClass, notify, notifyAll, wait, wait, wait`
		- ### Methods inherited from interface scala.Product
		
		
		`productElementNames`

- - ### Constructor Detail
	
	
	
		- #### Address
		
		
		
		```
		public Address​(java.lang.String protocol,
		               java.lang.String system)
		```
		- #### Address
		
		
		
		```
		public Address​(java.lang.String protocol,
		               java.lang.String system,
		               java.lang.String host,
		               int port)
		```

	- ### Method Detail
	
	
	
		- #### InvalidHostRegex
		
		
		
		```
		public static scala.util.matching.Regex InvalidHostRegex()
		```
		- #### apply
		
		
		
		```
		public static [Address](Address.html "class in akka.actor") apply​(java.lang.String protocol,
		                            java.lang.String system)
		```
		
		Constructs a new Address with the specified protocol and system name
		- #### apply
		
		
		
		```
		public static [Address](Address.html "class in akka.actor") apply​(java.lang.String protocol,
		                            java.lang.String system,
		                            java.lang.String host,
		                            int port)
		```
		
		Constructs a new Address with the specified protocol, system name, host and port
		- #### addressOrdering
		
		
		
		```
		public static scala.math.Ordering<[Address](Address.html "class in akka.actor")> addressOrdering()
		```
		
		`Address` ordering type class, sorts addresses by protocol, name, host and port.
		- #### apply
		
		
		
		```
		public static [Address](Address.html "class in akka.actor") apply​(java.lang.String protocol,
		                            java.lang.String system,
		                            scala.Option<java.lang.String> host,
		                            scala.Option<java.lang.Object> port)
		```
		- #### unapply
		
		
		
		```
		public static scala.Option<scala.Tuple4<java.lang.String,​java.lang.String,​scala.Option<java.lang.String>,​scala.Option<java.lang.Object>>> unapply​([Address](Address.html "class in akka.actor") x$0)
		```
		- #### protocol
		
		
		
		```
		public java.lang.String protocol()
		```
		- #### system
		
		
		
		```
		public java.lang.String system()
		```
		- #### host
		
		
		
		```
		public scala.Option<java.lang.String> host()
		```
		- #### port
		
		
		
		```
		public scala.Option<java.lang.Object> port()
		```
		- #### copy
		
		
		
		```
		public [Address](Address.html "class in akka.actor") copy​(java.lang.String protocol,
		                    java.lang.String system,
		                    scala.Option<java.lang.String> host,
		                    scala.Option<java.lang.Object> port)
		```
		- #### copy$default$1
		
		
		
		```
		public java.lang.String copy$default$1()
		```
		- #### copy$default$2
		
		
		
		```
		public java.lang.String copy$default$2()
		```
		- #### copy$default$3
		
		
		
		```
		public scala.Option<java.lang.String> copy$default$3()
		```
		- #### copy$default$4
		
		
		
		```
		public scala.Option<java.lang.Object> copy$default$4()
		```
		- #### getHost
		
		
		
		```
		public java.util.Optional<java.lang.String> getHost()
		```
		
		Java API: The hostname if specified or empty optional if not
		- #### getPort
		
		
		
		```
		public java.util.Optional<java.lang.Integer> getPort()
		```
		
		Java API: The port if specified or empty optional if not
		- #### hasLocalScope
		
		
		
		```
		public boolean hasLocalScope()
		```
		
		Returns true if this Address is only defined locally. It is not safe to send locally scoped addresses to remote
		 hosts. See also [`hasGlobalScope()`](#hasGlobalScope()).
		- #### hasGlobalScope
		
		
		
		```
		public boolean hasGlobalScope()
		```
		
		Returns true if this Address is usable globally. Unlike locally defined addresses ([`hasLocalScope()`](#hasLocalScope()))
		 addresses of global scope are safe to sent to other hosts, as they globally and uniquely identify an addressable
		 entity.
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
		- #### hostPort
		
		
		
		```
		public java.lang.String hostPort()
		```
		
		Returns a String representation formatted as:
		 
		`system@host:port`
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
		- #### equals
		
		
		
		```
		public boolean equals​(java.lang.Object x$1)
		```
		
		
		Specified by:
		`equals` in interface `scala.Equals`
		Overrides:
		`equals` in class `java.lang.Object`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/actor/Address.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/actor/Address.html](https://doc.akka.io/japi/akka-core/2.10/akka/actor/Address.html)*