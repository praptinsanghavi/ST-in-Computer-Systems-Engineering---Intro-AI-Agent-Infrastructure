---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T13:43:37Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10.17/akka/discovery/Lookup$.html
title: Lookup$
---

# Lookup$

## Content

Package [akka.discovery](package-summary.html)
## Class Lookup$

- java.lang.Object
- - akka.discovery.Lookup$

- All Implemented Interfaces:
`java.io.Serializable`, `scala.Equals`, `scala.Product`

---

```
public class Lookup$
extends java.lang.Object
implements scala.Product, java.io.Serializable
```

See Also:
[Serialized Form](../../serialized-form.html#akka.discovery.Lookup$)

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [Lookup$](Lookup$.html "class in akka.discovery")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[Lookup$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[Lookup](Lookup.html "class in akka.discovery")` | `[apply](#apply(java.lang.String))​(java.lang.String serviceName)` | Create a service Lookup with only a serviceName. |
	| `[Lookup](Lookup.html "class in akka.discovery")` | `[apply](#apply(java.lang.String,scala.Option,scala.Option))​(java.lang.String serviceName,  scala.Option<java.lang.String> portName,  scala.Option<java.lang.String> protocol)` | Create a service Lookup with `serviceName`, optional `portName` and optional `protocol`. |
	| `boolean` | `[canEqual](#canEqual(java.lang.Object))​(java.lang.Object x$1)` |  |
	| `[Lookup](Lookup.html "class in akka.discovery")` | `[create](#create(java.lang.String))​(java.lang.String serviceName)` | Java API |
	| `int` | `[hashCode](#hashCode())()` |  |
	| `boolean` | `[isValidSrv](#isValidSrv(java.lang.String))​(java.lang.String srv)` | Returns true if passed string conforms with SRV format. |
	| `[Lookup](Lookup.html "class in akka.discovery")` | `[parseSrv](#parseSrv(java.lang.String))​(java.lang.String str)` | Create a service Lookup from a string with format:  \_portName.\_protocol.serviceName. |
	| `int` | `[productArity](#productArity())()` |  |
	| `java.lang.Object` | `[productElement](#productElement(int))​(int x$1)` |  |
	| `scala.collection.Iterator<java.lang.Object>` | `[productIterator](#productIterator())()` |  |
	| `java.lang.String` | `[productPrefix](#productPrefix())()` |  |
	| `java.lang.String` | `[toString](#toString())()` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, notify, notifyAll, wait, wait, wait`
		- ### Methods inherited from interface scala.Equals
		
		
		`equals`
		- ### Methods inherited from interface scala.Product
		
		
		`productElementName, productElementNames`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [Lookup$](Lookup$.html "class in akka.discovery") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### Lookup$
		
		
		
		```
		public Lookup$()
		```

	- ### Method Detail
	
	
	
		- #### apply
		
		
		
		```
		public [Lookup](Lookup.html "class in akka.discovery") apply​(java.lang.String serviceName)
		```
		
		Create a service Lookup with only a serviceName.
		 Use withPortName and withProtocol to provide optional portName
		 and protocol
		- #### apply
		
		
		
		```
		public [Lookup](Lookup.html "class in akka.discovery") apply​(java.lang.String serviceName,
		                    scala.Option<java.lang.String> portName,
		                    scala.Option<java.lang.String> protocol)
		```
		
		Create a service Lookup with `serviceName`, optional `portName` and optional `protocol`.
		- #### create
		
		
		
		```
		public [Lookup](Lookup.html "class in akka.discovery") create​(java.lang.String serviceName)
		```
		
		Java API
		 
		 Create a service Lookup with only a serviceName.
		 Use withPortName and withProtocol to provide optional portName
		 and protocol
		- #### parseSrv
		
		
		
		```
		public [Lookup](Lookup.html "class in akka.discovery") parseSrv​(java.lang.String str)
		```
		
		Create a service Lookup from a string with format:
		 \_portName.\_protocol.serviceName.
		 (as specified by https://www.ietf.org/rfc/rfc2782\.txt)
		 
		 If the passed string conforms with this format, a SRV Lookup is returned.
		 The serviceName part must be a valid domain name.
		 (as defined in https://tools.ietf.org/html/rfc1034\)
		 
		
		
		 The string is parsed and dismembered to build a Lookup as following:
		 Lookup(serviceName).withPortName(portName).withProtocol(protocol)
		 
		
		
		
		Throws:
		`java.lang.NullPointerException` \- If the passed string is null
		`java.lang.IllegalArgumentException` \- If the string doesn't not conform with the SRV format
		- #### isValidSrv
		
		
		
		```
		public boolean isValidSrv​(java.lang.String srv)
		```
		
		Returns true if passed string conforms with SRV format. Otherwise returns false.
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

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10.17/akka/discovery/Lookup$.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/discovery/Lookup.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/discovery/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10.17/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10.17/akka/discovery/Lookup$.html](https://doc.akka.io/japi/akka-core/2.10.17/akka/discovery/Lookup$.html)*