---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:32:31Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/remote/FailureDetectorRegistry.html
title: FailureDetectorRegistry
---

# FailureDetectorRegistry

## Content

Package [akka.remote](package-summary.html)
## Interface FailureDetectorRegistry\<A\>

- All Known Implementing Classes:
`[DefaultFailureDetectorRegistry](DefaultFailureDetectorRegistry.html "class in akka.remote")`

---

```
public interface FailureDetectorRegistry<A>
```

Interface for a registry of Akka failure detectors. New resources are implicitly registered when heartbeat is first
 called with the resource given as parameter.
 
 type parameter A:
 \- The type of the key that identifies a resource to be monitored by a failure detector

- - ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `void` | `[heartbeat](#heartbeat(A))​([A](FailureDetectorRegistry.html "type parameter in FailureDetectorRegistry") resource)` | Records a heartbeat for a resource. |
	| `boolean` | `[isAvailable](#isAvailable(A))​([A](FailureDetectorRegistry.html "type parameter in FailureDetectorRegistry") resource)` | Returns true if the resource is considered to be up and healthy and returns false otherwise. |
	| `boolean` | `[isMonitoring](#isMonitoring(A))​([A](FailureDetectorRegistry.html "type parameter in FailureDetectorRegistry") resource)` | Returns true if the failure detector has received any heartbeats and started monitoring  of the resource. |
	| `void` | `[remove](#remove(A))​([A](FailureDetectorRegistry.html "type parameter in FailureDetectorRegistry") resource)` | Removes the heartbeat management for a resource. |
	| `void` | `[reset](#reset())()` | Removes all resources and any associated failure detector state. |

- - ### Method Detail
	
	
	
		- #### heartbeat
		
		
		
		```
		void heartbeat​([A](FailureDetectorRegistry.html "type parameter in FailureDetectorRegistry") resource)
		```
		
		Records a heartbeat for a resource. If the resource is not yet registered (i.e. this is the first heartbeat) then
		 it is automatically registered.
		- #### isAvailable
		
		
		
		```
		boolean isAvailable​([A](FailureDetectorRegistry.html "type parameter in FailureDetectorRegistry") resource)
		```
		
		Returns true if the resource is considered to be up and healthy and returns false otherwise.
		 For unregistered resources it returns true.
		- #### isMonitoring
		
		
		
		```
		boolean isMonitoring​([A](FailureDetectorRegistry.html "type parameter in FailureDetectorRegistry") resource)
		```
		
		Returns true if the failure detector has received any heartbeats and started monitoring
		 of the resource.
		- #### remove
		
		
		
		```
		void remove​([A](FailureDetectorRegistry.html "type parameter in FailureDetectorRegistry") resource)
		```
		
		Removes the heartbeat management for a resource.
		- #### reset
		
		
		
		```
		void reset()
		```
		
		Removes all resources and any associated failure detector state.

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/remote/DefaultFailureDetectorRegistry.html
- https://doc.akka.io/japi/akka/current/akka/remote/FailureDetectorRegistry.html
- https://doc.akka.io/japi/akka/current/akka/remote/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/remote/FailureDetectorRegistry.html](https://doc.akka.io/japi/akka/current/akka/remote/FailureDetectorRegistry.html)*