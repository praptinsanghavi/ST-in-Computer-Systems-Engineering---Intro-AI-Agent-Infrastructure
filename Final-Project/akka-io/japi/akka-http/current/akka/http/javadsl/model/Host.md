---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T23:46:19Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/Host.html
title: Host
---

# Host

## Content

Package [akka.http.javadsl.model](package-summary.html)
## Class Host

- java.lang.Object
- - akka.http.javadsl.model.Host

- Direct Known Subclasses:
`[Uri.Host](../../scaladsl/model/Uri.Host.html "class in akka.http.scaladsl.model")`

---

```
public abstract class Host
extends java.lang.Object
```

Represents a host in a URI or a Host header. The host can either be empty or be represented
 by an IPv4 or IPv6 address or by a host name.

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [Host](Host.html "class in akka.http.javadsl.model")` | `[EMPTY](#EMPTY)` | The constant representing an empty Host. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[Host](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `abstract java.lang.String` | `[address](#address())()` | Returns a String representation of the address. |
	| `static [Host](Host.html "class in akka.http.javadsl.model")` | `[create](#create(java.lang.String))​(java.lang.String string)` | Parse the given Host string using the default charset and parsing\-mode. |
	| `static [Host](Host.html "class in akka.http.javadsl.model")` | `[create](#create(java.lang.String,akka.http.scaladsl.model.Uri.ParsingMode))​(java.lang.String string,  [Uri.ParsingMode](../../scaladsl/model/Uri.ParsingMode.html "interface in akka.http.scaladsl.model") parsingMode)` | Parse the given Host string using the given charset and the default parsing\-mode. |
	| `static [Host](Host.html "class in akka.http.javadsl.model")` | `[create](#create(java.lang.String,java.nio.charset.Charset,akka.http.scaladsl.model.Uri.ParsingMode))​(java.lang.String string,  java.nio.charset.Charset charset,  [Uri.ParsingMode](../../scaladsl/model/Uri.ParsingMode.html "interface in akka.http.scaladsl.model") parsingMode)` | Parse the given Host string using the given charset and parsing\-mode. |
	| `abstract java.lang.Iterable<java.net.InetAddress>` | `[getInetAddresses](#getInetAddresses())()` | Returns an Iterable of InetAddresses represented by this Host. |
	| `abstract boolean` | `[isEmpty](#isEmpty())()` |  |
	| `abstract boolean` | `[isIPv4](#isIPv4())()` |  |
	| `abstract boolean` | `[isIPv6](#isIPv6())()` |  |
	| `abstract boolean` | `[isNamedHost](#isNamedHost())()` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### EMPTY
		
		
		
		```
		public static final [Host](Host.html "class in akka.http.javadsl.model") EMPTY
		```
		
		The constant representing an empty Host.

	- ### Constructor Detail
	
	
	
		- #### Host
		
		
		
		```
		public Host()
		```

	- ### Method Detail
	
	
	
		- #### address
		
		
		
		```
		public abstract java.lang.String address()
		```
		
		Returns a String representation of the address.
		- #### isEmpty
		
		
		
		```
		public abstract boolean isEmpty()
		```
		- #### isIPv4
		
		
		
		```
		public abstract boolean isIPv4()
		```
		- #### isIPv6
		
		
		
		```
		public abstract boolean isIPv6()
		```
		- #### isNamedHost
		
		
		
		```
		public abstract boolean isNamedHost()
		```
		- #### getInetAddresses
		
		
		
		```
		public abstract java.lang.Iterable<java.net.InetAddress> getInetAddresses()
		```
		
		Returns an Iterable of InetAddresses represented by this Host. If this Host is empty the
		 returned Iterable will be empty. If this is an IP address the Iterable will contain this address.
		 If this Host is represented by a host name, the name will be looked up and return all found
		 addresses for this name.
		- #### create
		
		
		
		```
		public static [Host](Host.html "class in akka.http.javadsl.model") create​(java.lang.String string)
		```
		
		Parse the given Host string using the default charset and parsing\-mode.
		- #### create
		
		
		
		```
		public static [Host](Host.html "class in akka.http.javadsl.model") create​(java.lang.String string,
		                          [Uri.ParsingMode](../../scaladsl/model/Uri.ParsingMode.html "interface in akka.http.scaladsl.model") parsingMode)
		```
		
		Parse the given Host string using the given charset and the default parsing\-mode.
		- #### create
		
		
		
		```
		public static [Host](Host.html "class in akka.http.javadsl.model") create​(java.lang.String string,
		                          java.nio.charset.Charset charset,
		                          [Uri.ParsingMode](../../scaladsl/model/Uri.ParsingMode.html "interface in akka.http.scaladsl.model") parsingMode)
		```
		
		Parse the given Host string using the given charset and parsing\-mode.

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/Host.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/package-summary.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/Uri.Host.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/Uri.ParsingMode.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/Host.html](https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/Host.html)*