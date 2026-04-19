---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T20:50:01Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/actor/Address$.html
title: Address$
---

# Address$

## Content

Package [akka.actor](package-summary.html)
## Class Address$

- java.lang.Object
- - akka.actor.Address$

- All Implemented Interfaces:
`java.io.Serializable`

---

```
public class Address$
extends java.lang.Object
implements java.io.Serializable
```

See Also:
[Serialized Form](../../serialized-form.html#akka.actor.Address$)

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [Address$](Address$.html "class in akka.actor")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[Address$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `scala.math.Ordering<[Address](Address.html "class in akka.actor")>` | `[addressOrdering](#addressOrdering())()` | `Address` ordering type class, sorts addresses by protocol, name, host and port. |
	| `[Address](Address.html "class in akka.actor")` | `[apply](#apply(java.lang.String,java.lang.String))​(java.lang.String protocol,  java.lang.String system)` | Constructs a new Address with the specified protocol and system name |
	| `[Address](Address.html "class in akka.actor")` | `[apply](#apply(java.lang.String,java.lang.String,java.lang.String,int))​(java.lang.String protocol,  java.lang.String system,  java.lang.String host,  int port)` | Constructs a new Address with the specified protocol, system name, host and port |
	| `[Address](Address.html "class in akka.actor")` | `[apply](#apply(java.lang.String,java.lang.String,scala.Option,scala.Option))​(java.lang.String protocol,  java.lang.String system,  scala.Option<java.lang.String> host,  scala.Option<java.lang.Object> port)` |  |
	| `scala.util.matching.Regex` | `[InvalidHostRegex](#InvalidHostRegex())()` |  |
	| `scala.Option<scala.Tuple4<java.lang.String,​java.lang.String,​scala.Option<java.lang.String>,​scala.Option<java.lang.Object>>>` | `[unapply](#unapply(akka.actor.Address))​([Address](Address.html "class in akka.actor") x$0)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [Address$](Address$.html "class in akka.actor") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### Address$
		
		
		
		```
		public Address$()
		```

	- ### Method Detail
	
	
	
		- #### InvalidHostRegex
		
		
		
		```
		public scala.util.matching.Regex InvalidHostRegex()
		```
		- #### apply
		
		
		
		```
		public [Address](Address.html "class in akka.actor") apply​(java.lang.String protocol,
		                     java.lang.String system)
		```
		
		Constructs a new Address with the specified protocol and system name
		- #### apply
		
		
		
		```
		public [Address](Address.html "class in akka.actor") apply​(java.lang.String protocol,
		                     java.lang.String system,
		                     java.lang.String host,
		                     int port)
		```
		
		Constructs a new Address with the specified protocol, system name, host and port
		- #### addressOrdering
		
		
		
		```
		public scala.math.Ordering<[Address](Address.html "class in akka.actor")> addressOrdering()
		```
		
		`Address` ordering type class, sorts addresses by protocol, name, host and port.
		- #### apply
		
		
		
		```
		public [Address](Address.html "class in akka.actor") apply​(java.lang.String protocol,
		                     java.lang.String system,
		                     scala.Option<java.lang.String> host,
		                     scala.Option<java.lang.Object> port)
		```
		- #### unapply
		
		
		
		```
		public scala.Option<scala.Tuple4<java.lang.String,​java.lang.String,​scala.Option<java.lang.String>,​scala.Option<java.lang.Object>>> unapply​([Address](Address.html "class in akka.actor") x$0)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/actor/Address$.html
- https://doc.akka.io/japi/akka/current/akka/actor/Address.html
- https://doc.akka.io/japi/akka/current/akka/actor/package-summary.html
- https://doc.akka.io/japi/akka/current/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/actor/Address$.html](https://doc.akka.io/japi/akka/current/akka/actor/Address$.html)*