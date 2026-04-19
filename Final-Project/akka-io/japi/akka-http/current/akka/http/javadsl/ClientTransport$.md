---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T23:44:35Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/ClientTransport$.html
title: ClientTransport$
---

# ClientTransport$

## Content

Package [akka.http.javadsl](package-summary.html)
## Class ClientTransport$

- java.lang.Object
- - akka.http.javadsl.ClientTransport$

- ---

```
public class ClientTransport$
extends java.lang.Object
```

Entry point to create or access predefined client transports.

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [ClientTransport$](ClientTransport$.html "class in akka.http.javadsl")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[ClientTransport$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[ClientTransport](ClientTransport.html "class in akka.http.javadsl")` | `[fromScala](#fromScala(akka.http.scaladsl.ClientTransport))​([ClientTransport](../scaladsl/ClientTransport.html "interface in akka.http.scaladsl") scalaTransport)` |  |
	| `[ClientTransport](ClientTransport.html "class in akka.http.javadsl")` | `[httpsProxy](#httpsProxy(akka.actor.ActorSystem))​(akka.actor.ActorSystem system)` | Returns a [`ClientTransport`](ClientTransport.html "class in akka.http.javadsl") that runs all connection through the given HTTP(S) proxy using the  HTTP CONNECT method. |
	| `[ClientTransport](ClientTransport.html "class in akka.http.javadsl")` | `[httpsProxy](#httpsProxy(akka.http.javadsl.model.headers.HttpCredentials,akka.actor.ActorSystem))​([HttpCredentials](model/headers/HttpCredentials.html "class in akka.http.javadsl.model.headers") proxyCredentials,  akka.actor.ActorSystem system)` | Returns a [`ClientTransport`](ClientTransport.html "class in akka.http.javadsl") that runs all connection through the given HTTP(S) proxy using the  HTTP CONNECT method. |
	| `[ClientTransport](ClientTransport.html "class in akka.http.javadsl")` | `[httpsProxy](#httpsProxy(java.net.InetSocketAddress))​(java.net.InetSocketAddress proxyAddress)` | Returns a [`ClientTransport`](ClientTransport.html "class in akka.http.javadsl") that runs all connection through the given HTTP(S) proxy using the  HTTP CONNECT method. |
	| `[ClientTransport](ClientTransport.html "class in akka.http.javadsl")` | `[httpsProxy](#httpsProxy(java.net.InetSocketAddress,akka.http.javadsl.model.headers.HttpCredentials))​(java.net.InetSocketAddress proxyAddress,  [HttpCredentials](model/headers/HttpCredentials.html "class in akka.http.javadsl.model.headers") proxyCredentials)` | Returns a [`ClientTransport`](ClientTransport.html "class in akka.http.javadsl") that runs all connection through the given HTTP(S) proxy using the  HTTP CONNECT method. |
	| `[ClientTransport](ClientTransport.html "class in akka.http.javadsl")` | `[TCP](#TCP())()` |  |
	| `[ClientTransport](../scaladsl/ClientTransport.html "interface in akka.http.scaladsl")` | `[toScala](#toScala(akka.http.javadsl.ClientTransport))​([ClientTransport](ClientTransport.html "class in akka.http.javadsl") javaTransport)` |  |
	| `[ClientTransport](ClientTransport.html "class in akka.http.javadsl")` | `[withCustomResolver](#withCustomResolver(java.util.function.BiFunction))​(java.util.function.BiFunction<java.lang.String,​java.lang.Object,​java.util.concurrent.CompletionStage<java.net.InetSocketAddress>> lookup)` | Returns a [`ClientTransport`](ClientTransport.html "class in akka.http.javadsl") that allows to customize host name resolution. |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [ClientTransport$](ClientTransport$.html "class in akka.http.javadsl") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### ClientTransport$
		
		
		
		```
		public ClientTransport$()
		```

	- ### Method Detail
	
	
	
		- #### TCP
		
		
		
		```
		public [ClientTransport](ClientTransport.html "class in akka.http.javadsl") TCP()
		```
		- #### httpsProxy
		
		
		
		```
		public [ClientTransport](ClientTransport.html "class in akka.http.javadsl") httpsProxy​(java.net.InetSocketAddress proxyAddress)
		```
		
		Returns a [`ClientTransport`](ClientTransport.html "class in akka.http.javadsl") that runs all connection through the given HTTP(S) proxy using the
		 HTTP CONNECT method.
		 
		 An HTTP(S) proxy is a proxy that will create one TCP connection to the HTTP(S) proxy for each target connection. The
		 proxy transparently forwards the TCP connection to the target host.
		 
		
		
		 For more information about HTTP CONNECT tunnelling see https://tools.ietf.org/html/rfc7231\#section\-4\.3\.6\.
		
		
		
		Parameters:
		`proxyAddress` \- (undocumented)
		Returns:
		(undocumented)
		- #### httpsProxy
		
		
		
		```
		public [ClientTransport](ClientTransport.html "class in akka.http.javadsl") httpsProxy​(akka.actor.ActorSystem system)
		```
		
		Returns a [`ClientTransport`](ClientTransport.html "class in akka.http.javadsl") that runs all connection through the given HTTP(S) proxy using the
		 HTTP CONNECT method.
		 
		 Pulls the host/port pair from the application.conf: akka.client.proxy.https.{host, port}
		
		
		
		Parameters:
		`system` \- (undocumented)
		Returns:
		(undocumented)
		- #### httpsProxy
		
		
		
		```
		public [ClientTransport](ClientTransport.html "class in akka.http.javadsl") httpsProxy​(java.net.InetSocketAddress proxyAddress,
		                                  [HttpCredentials](model/headers/HttpCredentials.html "class in akka.http.javadsl.model.headers") proxyCredentials)
		```
		
		Returns a [`ClientTransport`](ClientTransport.html "class in akka.http.javadsl") that runs all connection through the given HTTP(S) proxy using the
		 HTTP CONNECT method. This call also takes `HttpCredentials` to base proxy credentials along with
		 the request.
		 
		 An HTTP(S) proxy is a proxy that will create one TCP connection to the HTTP(S) proxy for each target connection. The
		 proxy transparently forwards the TCP connection to the target host.
		 
		
		
		 For more information about HTTP CONNECT tunnelling see https://tools.ietf.org/html/rfc7231\#section\-4\.3\.6\.
		
		
		
		Parameters:
		`proxyAddress` \- (undocumented)
		`proxyCredentials` \- (undocumented)
		Returns:
		(undocumented)
		- #### httpsProxy
		
		
		
		```
		public [ClientTransport](ClientTransport.html "class in akka.http.javadsl") httpsProxy​([HttpCredentials](model/headers/HttpCredentials.html "class in akka.http.javadsl.model.headers") proxyCredentials,
		                                  akka.actor.ActorSystem system)
		```
		
		Returns a [`ClientTransport`](ClientTransport.html "class in akka.http.javadsl") that runs all connection through the given HTTP(S) proxy using the
		 HTTP CONNECT method. This method also takes `HttpCredentials` in order to pass along to the proxy.
		 
		 Pulls the host/port pair from the application.conf: akka.client.proxy.https.{host, port}
		
		
		
		Parameters:
		`proxyCredentials` \- (undocumented)
		`system` \- (undocumented)
		Returns:
		(undocumented)
		- #### withCustomResolver
		
		
		
		```
		public [ClientTransport](ClientTransport.html "class in akka.http.javadsl") withCustomResolver​(java.util.function.BiFunction<java.lang.String,​java.lang.Object,​java.util.concurrent.CompletionStage<java.net.InetSocketAddress>> lookup)
		```
		
		Returns a [`ClientTransport`](ClientTransport.html "class in akka.http.javadsl") that allows to customize host name resolution.
		
		Parameters:
		`lookup` \- A function that will be called with hostname and port and that should (potentially asynchronously resolve the given host/port
		 to an `InetSocketAddress`
		Returns:
		(undocumented)
		- #### fromScala
		
		
		
		```
		public [ClientTransport](ClientTransport.html "class in akka.http.javadsl") fromScala​([ClientTransport](../scaladsl/ClientTransport.html "interface in akka.http.scaladsl") scalaTransport)
		```
		- #### toScala
		
		
		
		```
		public [ClientTransport](../scaladsl/ClientTransport.html "interface in akka.http.scaladsl") toScala​([ClientTransport](ClientTransport.html "class in akka.http.javadsl") javaTransport)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/ClientTransport$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/ClientTransport.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/headers/HttpCredentials.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/package-summary.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/ClientTransport.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/ClientTransport$.html](https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/ClientTransport$.html)*