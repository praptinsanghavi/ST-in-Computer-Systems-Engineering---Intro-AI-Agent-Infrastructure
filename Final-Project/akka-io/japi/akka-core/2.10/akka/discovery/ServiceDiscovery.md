---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T16:07:48Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/discovery/ServiceDiscovery.html
title: ServiceDiscovery
---

# ServiceDiscovery

## Content

Package [akka.discovery](package-summary.html)
## Class ServiceDiscovery

- java.lang.Object
- - akka.discovery.ServiceDiscovery

- ---

```
public abstract class ServiceDiscovery
extends java.lang.Object
```

Implement to provide a service discovery method

- - ### Nested Class Summary
	
	
	
	Nested Classes 
	| Modifier and Type | Class | Description |
	| `static class` | `[ServiceDiscovery.DiscoveryTimeoutException](ServiceDiscovery.DiscoveryTimeoutException.html "class in akka.discovery")` | Future returned by resolve(name, timeout) should be failed with this exception  if the underlying mechanism was unable to resolve the name within the given timeout. |
	| `static class` | `[ServiceDiscovery.Resolved](ServiceDiscovery.Resolved.html "class in akka.discovery")` | Result of a successful resolve request |
	| `static class` | `[ServiceDiscovery.Resolved$](ServiceDiscovery.Resolved$.html "class in akka.discovery")` |  |
	| `static class` | `[ServiceDiscovery.ResolvedTarget](ServiceDiscovery.ResolvedTarget.html "class in akka.discovery")` | Resolved target host, with optional port and the IP address. |
	| `static class` | `[ServiceDiscovery.ResolvedTarget$](ServiceDiscovery.ResolvedTarget$.html "class in akka.discovery")` |  |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[ServiceDiscovery](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `java.util.concurrent.CompletionStage<[ServiceDiscovery.Resolved](ServiceDiscovery.Resolved.html "class in akka.discovery")>` | `[lookup](#lookup(akka.discovery.Lookup,java.time.Duration))​([Lookup](Lookup.html "class in akka.discovery") query,  java.time.Duration resolveTimeout)` | Java API: Perform basic lookup using underlying discovery implementation. |
	| `abstract scala.concurrent.Future<[ServiceDiscovery.Resolved](ServiceDiscovery.Resolved.html "class in akka.discovery")>` | `[lookup](#lookup(akka.discovery.Lookup,scala.concurrent.duration.FiniteDuration))​([Lookup](Lookup.html "class in akka.discovery") lookup,  scala.concurrent.duration.FiniteDuration resolveTimeout)` | Scala API: Perform lookup using underlying discovery implementation. |
	| `java.util.concurrent.CompletionStage<[ServiceDiscovery.Resolved](ServiceDiscovery.Resolved.html "class in akka.discovery")>` | `[lookup](#lookup(java.lang.String,java.time.Duration))​(java.lang.String serviceName,  java.time.Duration resolveTimeout)` | Java API |
	| `scala.concurrent.Future<[ServiceDiscovery.Resolved](ServiceDiscovery.Resolved.html "class in akka.discovery")>` | `[lookup](#lookup(java.lang.String,scala.concurrent.duration.FiniteDuration))​(java.lang.String serviceName,  scala.concurrent.duration.FiniteDuration resolveTimeout)` | Scala API: Perform lookup using underlying discovery implementation. |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### ServiceDiscovery
		
		
		
		```
		public ServiceDiscovery()
		```

	- ### Method Detail
	
	
	
		- #### lookup
		
		
		
		```
		public abstract scala.concurrent.Future<[ServiceDiscovery.Resolved](ServiceDiscovery.Resolved.html "class in akka.discovery")> lookup​([Lookup](Lookup.html "class in akka.discovery") lookup,
		                                                                          scala.concurrent.duration.FiniteDuration resolveTimeout)
		```
		
		Scala API: Perform lookup using underlying discovery implementation.
		 
		
		Parameters:
		`lookup` \- A service discovery lookup.
		`resolveTimeout` \- Timeout. Up to the discovery\-method to adhere to his
		Returns:
		Resolved future should be failed with a \[DiscoveryTimeoutException] if the `resolveTimeout` is exceeded.
		- #### lookup
		
		
		
		```
		public scala.concurrent.Future<[ServiceDiscovery.Resolved](ServiceDiscovery.Resolved.html "class in akka.discovery")> lookup​(java.lang.String serviceName,
		                                                                 scala.concurrent.duration.FiniteDuration resolveTimeout)
		```
		
		Scala API: Perform lookup using underlying discovery implementation.
		 
		 Convenience lookup accepting a name. If the name is a valid SRV entry, an SRV lookup is done, otherwise
		 a regular lookup. For more control use the overload accepting a [`Lookup`](Lookup.html "class in akka.discovery").
		- #### lookup
		
		
		
		```
		public java.util.concurrent.CompletionStage<[ServiceDiscovery.Resolved](ServiceDiscovery.Resolved.html "class in akka.discovery")> lookup​([Lookup](Lookup.html "class in akka.discovery") query,
		                                                                              java.time.Duration resolveTimeout)
		```
		
		Java API: Perform basic lookup using underlying discovery implementation.
		 
		 While the implementation may provide other settings and ways to configure timeouts,
		 the passed `resolveTimeout` should never be exceeded, as it signals the application's
		 eagerness to wait for a result for this specific lookup.
		 
		
		
		 The returned future should be failed once resolveTimeout has passed with a [`ServiceDiscovery.DiscoveryTimeoutException`](ServiceDiscovery.DiscoveryTimeoutException.html "class in akka.discovery").
		- #### lookup
		
		
		
		```
		public java.util.concurrent.CompletionStage<[ServiceDiscovery.Resolved](ServiceDiscovery.Resolved.html "class in akka.discovery")> lookup​(java.lang.String serviceName,
		                                                                              java.time.Duration resolveTimeout)
		```
		
		Java API
		 
		 Convenience lookup accepting a name. If the name is a valid SRV entry, an SRV lookup is done, otherwise
		 a regular lookup. For more control use the overload accepting a [`Lookup`](Lookup.html "class in akka.discovery").
		 
		
		
		
		Parameters:
		`serviceName` \- A name, see discovery\-method's docs for how this is interpreted
		`resolveTimeout` \- Timeout. Up to the discovery\-method to adhere to this and complete the CompletionStage with a
		 \[DiscoveryTimeoutException]

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/discovery/Lookup.html
- https://doc.akka.io/japi/akka-core/2.10/akka/discovery/ServiceDiscovery.DiscoveryTimeoutException.html
- https://doc.akka.io/japi/akka-core/2.10/akka/discovery/ServiceDiscovery.Resolved$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/discovery/ServiceDiscovery.Resolved.html
- https://doc.akka.io/japi/akka-core/2.10/akka/discovery/ServiceDiscovery.ResolvedTarget$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/discovery/ServiceDiscovery.ResolvedTarget.html
- https://doc.akka.io/japi/akka-core/2.10/akka/discovery/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/discovery/ServiceDiscovery.html](https://doc.akka.io/japi/akka-core/2.10/akka/discovery/ServiceDiscovery.html)*