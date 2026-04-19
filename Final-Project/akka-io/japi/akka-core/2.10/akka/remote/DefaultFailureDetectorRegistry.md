---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T13:09:45Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/remote/DefaultFailureDetectorRegistry.html
title: DefaultFailureDetectorRegistry
---

# DefaultFailureDetectorRegistry

## Content

Package [akka.remote](package-summary.html)
## Class DefaultFailureDetectorRegistry\<A\>

- java.lang.Object
- - akka.remote.DefaultFailureDetectorRegistry\<A\>

- All Implemented Interfaces:
`[FailureDetectorRegistry](FailureDetectorRegistry.html "interface in akka.remote")<A>`

---

```
public class DefaultFailureDetectorRegistry<A>
extends java.lang.Object
implements [FailureDetectorRegistry](FailureDetectorRegistry.html "interface in akka.remote")<A>
```

A lock\-less thread\-safe implementation of [`FailureDetectorRegistry`](FailureDetectorRegistry.html "interface in akka.remote").
 
 param: detectorFactory
 By\-name parameter that returns the failure detector instance to be used by a newly registered resource

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[DefaultFailureDetectorRegistry](#%3Cinit%3E(scala.Function0))​(scala.Function0<[FailureDetector](FailureDetector.html "interface in akka.remote")> detectorFactory)` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `void` | `[heartbeat](#heartbeat(A))​([A](DefaultFailureDetectorRegistry.html "type parameter in DefaultFailureDetectorRegistry") resource)` | Records a heartbeat for a resource. |
	| `boolean` | `[isAvailable](#isAvailable(A))​([A](DefaultFailureDetectorRegistry.html "type parameter in DefaultFailureDetectorRegistry") resource)` | Returns true if the resource is considered to be up and healthy and returns false otherwise. |
	| `boolean` | `[isMonitoring](#isMonitoring(A))​([A](DefaultFailureDetectorRegistry.html "type parameter in DefaultFailureDetectorRegistry") resource)` | Returns true if the failure detector has received any heartbeats and started monitoring  of the resource. |
	| `void` | `[remove](#remove(A))​([A](DefaultFailureDetectorRegistry.html "type parameter in DefaultFailureDetectorRegistry") resource)` | Removes the heartbeat management for a resource. |
	| `void` | `[reset](#reset())()` | Removes all resources and any associated failure detector state. |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### DefaultFailureDetectorRegistry
		
		
		
		```
		public DefaultFailureDetectorRegistry​(scala.Function0<[FailureDetector](FailureDetector.html "interface in akka.remote")> detectorFactory)
		```

	- ### Method Detail
	
	
	
		- #### heartbeat
		
		
		
		```
		public final void heartbeat​([A](DefaultFailureDetectorRegistry.html "type parameter in DefaultFailureDetectorRegistry") resource)
		```
		
		Description copied from interface: `[FailureDetectorRegistry](FailureDetectorRegistry.html#heartbeat(A))`
		Records a heartbeat for a resource. If the resource is not yet registered (i.e. this is the first heartbeat) then
		 it is automatically registered.
		
		Specified by:
		`[heartbeat](FailureDetectorRegistry.html#heartbeat(A))` in interface `[FailureDetectorRegistry](FailureDetectorRegistry.html "interface in akka.remote")<[A](DefaultFailureDetectorRegistry.html "type parameter in DefaultFailureDetectorRegistry")>`
		- #### isAvailable
		
		
		
		```
		public final boolean isAvailable​([A](DefaultFailureDetectorRegistry.html "type parameter in DefaultFailureDetectorRegistry") resource)
		```
		
		Description copied from interface: `[FailureDetectorRegistry](FailureDetectorRegistry.html#isAvailable(A))`
		Returns true if the resource is considered to be up and healthy and returns false otherwise.
		 For unregistered resources it returns true.
		
		Specified by:
		`[isAvailable](FailureDetectorRegistry.html#isAvailable(A))` in interface `[FailureDetectorRegistry](FailureDetectorRegistry.html "interface in akka.remote")<[A](DefaultFailureDetectorRegistry.html "type parameter in DefaultFailureDetectorRegistry")>`
		- #### isMonitoring
		
		
		
		```
		public final boolean isMonitoring​([A](DefaultFailureDetectorRegistry.html "type parameter in DefaultFailureDetectorRegistry") resource)
		```
		
		Description copied from interface: `[FailureDetectorRegistry](FailureDetectorRegistry.html#isMonitoring(A))`
		Returns true if the failure detector has received any heartbeats and started monitoring
		 of the resource.
		
		Specified by:
		`[isMonitoring](FailureDetectorRegistry.html#isMonitoring(A))` in interface `[FailureDetectorRegistry](FailureDetectorRegistry.html "interface in akka.remote")<[A](DefaultFailureDetectorRegistry.html "type parameter in DefaultFailureDetectorRegistry")>`
		- #### remove
		
		
		
		```
		public final void remove​([A](DefaultFailureDetectorRegistry.html "type parameter in DefaultFailureDetectorRegistry") resource)
		```
		
		Description copied from interface: `[FailureDetectorRegistry](FailureDetectorRegistry.html#remove(A))`
		Removes the heartbeat management for a resource.
		
		Specified by:
		`[remove](FailureDetectorRegistry.html#remove(A))` in interface `[FailureDetectorRegistry](FailureDetectorRegistry.html "interface in akka.remote")<[A](DefaultFailureDetectorRegistry.html "type parameter in DefaultFailureDetectorRegistry")>`
		- #### reset
		
		
		
		```
		public final void reset()
		```
		
		Description copied from interface: `[FailureDetectorRegistry](FailureDetectorRegistry.html#reset())`
		Removes all resources and any associated failure detector state.
		
		Specified by:
		`[reset](FailureDetectorRegistry.html#reset())` in interface `[FailureDetectorRegistry](FailureDetectorRegistry.html "interface in akka.remote")<[A](DefaultFailureDetectorRegistry.html "type parameter in DefaultFailureDetectorRegistry")>`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/remote/DefaultFailureDetectorRegistry.html
- https://doc.akka.io/japi/akka-core/2.10/akka/remote/FailureDetector.html
- https://doc.akka.io/japi/akka-core/2.10/akka/remote/FailureDetectorRegistry.html
- https://doc.akka.io/japi/akka-core/2.10/akka/remote/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/remote/DefaultFailureDetectorRegistry.html](https://doc.akka.io/japi/akka-core/2.10/akka/remote/DefaultFailureDetectorRegistry.html)*