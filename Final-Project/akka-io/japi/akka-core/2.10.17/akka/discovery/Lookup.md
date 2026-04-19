---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T13:43:35Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10.17/akka/discovery/Lookup.html
title: Lookup
---

# Lookup

## Content

Package [akka.discovery](package-summary.html)
## Class Lookup

- java.lang.Object
- - akka.discovery.Lookup

- All Implemented Interfaces:
`[NoSerializationVerificationNeeded](../actor/NoSerializationVerificationNeeded.html "interface in akka.actor")`

---

```
public final class Lookup
extends java.lang.Object
implements [NoSerializationVerificationNeeded](../actor/NoSerializationVerificationNeeded.html "interface in akka.actor")
```

A service lookup. It is up to each method to decide
 what to do with the optional portName and protocol fields.
 For example `portName` could be used to distinguish between
 Akka remoting ports and HTTP ports.
 
 param: serviceName must not be 'null' or an empty String
 param: discardCache Ask the discovery implementation to drop any cached result and do a new resolution.
 Optionally supported by implementations.

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[Lookup](#%3Cinit%3E(java.lang.String,scala.Option,scala.Option))​(java.lang.String serviceName,  scala.Option<java.lang.String> portName,  scala.Option<java.lang.String> protocol)` |  |
	| `[Lookup](#%3Cinit%3E(java.lang.String,scala.Option,scala.Option,boolean))​(java.lang.String serviceName,  scala.Option<java.lang.String> portName,  scala.Option<java.lang.String> protocol,  boolean discardCache)` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `static [Lookup](Lookup.html "class in akka.discovery")` | `[apply](#apply(java.lang.String))​(java.lang.String serviceName)` | Create a service Lookup with only a serviceName. |
	| `static [Lookup](Lookup.html "class in akka.discovery")` | `[apply](#apply(java.lang.String,scala.Option,scala.Option))​(java.lang.String serviceName,  scala.Option<java.lang.String> portName,  scala.Option<java.lang.String> protocol)` | Create a service Lookup with `serviceName`, optional `portName` and optional `protocol`. |
	| `static boolean` | `[canEqual](#canEqual(java.lang.Object))​(java.lang.Object x$1)` |  |
	| `static [Lookup](Lookup.html "class in akka.discovery")` | `[create](#create(java.lang.String))​(java.lang.String serviceName)` | Java API |
	| `boolean` | `[discardCache](#discardCache())()` |  |
	| `boolean` | `[equals](#equals(java.lang.Object))​(java.lang.Object obj)` |  |
	| `java.util.Optional<java.lang.String>` | `[getPortName](#getPortName())()` | Java API |
	| `java.util.Optional<java.lang.String>` | `[getProtocol](#getProtocol())()` | Java API |
	| `int` | `[hashCode](#hashCode())()` |  |
	| `static boolean` | `[isValidSrv](#isValidSrv(java.lang.String))​(java.lang.String srv)` | Returns true if passed string conforms with SRV format. |
	| `static [Lookup](Lookup.html "class in akka.discovery")` | `[parseSrv](#parseSrv(java.lang.String))​(java.lang.String str)` | Create a service Lookup from a string with format:  \_portName.\_protocol.serviceName. |
	| `scala.Option<java.lang.String>` | `[portName](#portName())()` |  |
	| `static int` | `[productArity](#productArity())()` |  |
	| `static java.lang.Object` | `[productElement](#productElement(int))​(int x$1)` |  |
	| `static java.lang.String` | `[productElementName](#productElementName(int))​(int n)` |  |
	| `static scala.collection.Iterator<java.lang.String>` | `[productElementNames](#productElementNames())()` |  |
	| `static scala.collection.Iterator<java.lang.Object>` | `[productIterator](#productIterator())()` |  |
	| `static java.lang.String` | `[productPrefix](#productPrefix())()` |  |
	| `scala.Option<java.lang.String>` | `[protocol](#protocol())()` |  |
	| `java.lang.String` | `[serviceName](#serviceName())()` |  |
	| `java.lang.String` | `[toString](#toString())()` |  |
	| `[Lookup](Lookup.html "class in akka.discovery")` | `[withDiscardCache](#withDiscardCache())()` | Ask the discovery implementation to drop any cached result and do a new resolution. |
	| `[Lookup](Lookup.html "class in akka.discovery")` | `[withPortName](#withPortName(java.lang.String))​(java.lang.String value)` | Which port for a service e.g. |
	| `[Lookup](Lookup.html "class in akka.discovery")` | `[withProtocol](#withProtocol(java.lang.String))​(java.lang.String value)` | Which protocol e.g. |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, finalize, getClass, notify, notifyAll, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### Lookup
		
		
		
		```
		public Lookup​(java.lang.String serviceName,
		              scala.Option<java.lang.String> portName,
		              scala.Option<java.lang.String> protocol,
		              boolean discardCache)
		```
		- #### Lookup
		
		
		
		```
		public Lookup​(java.lang.String serviceName,
		              scala.Option<java.lang.String> portName,
		              scala.Option<java.lang.String> protocol)
		```

	- ### Method Detail
	
	
	
		- #### apply
		
		
		
		```
		public static [Lookup](Lookup.html "class in akka.discovery") apply​(java.lang.String serviceName)
		```
		
		Create a service Lookup with only a serviceName.
		 Use withPortName and withProtocol to provide optional portName
		 and protocol
		- #### apply
		
		
		
		```
		public static [Lookup](Lookup.html "class in akka.discovery") apply​(java.lang.String serviceName,
		                           scala.Option<java.lang.String> portName,
		                           scala.Option<java.lang.String> protocol)
		```
		
		Create a service Lookup with `serviceName`, optional `portName` and optional `protocol`.
		- #### create
		
		
		
		```
		public static [Lookup](Lookup.html "class in akka.discovery") create​(java.lang.String serviceName)
		```
		
		Java API
		 
		 Create a service Lookup with only a serviceName.
		 Use withPortName and withProtocol to provide optional portName
		 and protocol
		- #### parseSrv
		
		
		
		```
		public static [Lookup](Lookup.html "class in akka.discovery") parseSrv​(java.lang.String str)
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
		public static boolean isValidSrv​(java.lang.String srv)
		```
		
		Returns true if passed string conforms with SRV format. Otherwise returns false.
		- #### productPrefix
		
		
		
		```
		public static java.lang.String productPrefix()
		```
		- #### productArity
		
		
		
		```
		public static int productArity()
		```
		- #### productElement
		
		
		
		```
		public static java.lang.Object productElement​(int x$1)
		```
		- #### productIterator
		
		
		
		```
		public static scala.collection.Iterator<java.lang.Object> productIterator()
		```
		- #### canEqual
		
		
		
		```
		public static boolean canEqual​(java.lang.Object x$1)
		```
		- #### productElementName
		
		
		
		```
		public static java.lang.String productElementName​(int n)
		```
		- #### productElementNames
		
		
		
		```
		public static scala.collection.Iterator<java.lang.String> productElementNames()
		```
		- #### serviceName
		
		
		
		```
		public java.lang.String serviceName()
		```
		- #### portName
		
		
		
		```
		public scala.Option<java.lang.String> portName()
		```
		- #### protocol
		
		
		
		```
		public scala.Option<java.lang.String> protocol()
		```
		- #### discardCache
		
		
		
		```
		public boolean discardCache()
		```
		- #### withPortName
		
		
		
		```
		public [Lookup](Lookup.html "class in akka.discovery") withPortName​(java.lang.String value)
		```
		
		Which port for a service e.g. Akka remoting or HTTP.
		 Maps to "service" for an SRV records.
		- #### withProtocol
		
		
		
		```
		public [Lookup](Lookup.html "class in akka.discovery") withProtocol​(java.lang.String value)
		```
		
		Which protocol e.g. TCP or UDP.
		 Maps to "protocol" for SRV records.
		- #### withDiscardCache
		
		
		
		```
		public [Lookup](Lookup.html "class in akka.discovery") withDiscardCache()
		```
		
		Ask the discovery implementation to drop any cached result and do a new resolution.
		 Optionally supported by implementations.
		- #### getPortName
		
		
		
		```
		public java.util.Optional<java.lang.String> getPortName()
		```
		
		Java API
		- #### getProtocol
		
		
		
		```
		public java.util.Optional<java.lang.String> getProtocol()
		```
		
		Java API
		- #### toString
		
		
		
		```
		public java.lang.String toString()
		```
		
		
		Overrides:
		`toString` in class `java.lang.Object`
		- #### equals
		
		
		
		```
		public boolean equals​(java.lang.Object obj)
		```
		
		
		Overrides:
		`equals` in class `java.lang.Object`
		- #### hashCode
		
		
		
		```
		public int hashCode()
		```
		
		
		Overrides:
		`hashCode` in class `java.lang.Object`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/NoSerializationVerificationNeeded.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/discovery/Lookup.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/discovery/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10.17/akka/discovery/Lookup.html](https://doc.akka.io/japi/akka-core/2.10.17/akka/discovery/Lookup.html)*