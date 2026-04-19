---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:13:33Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/coordination/lease/javadsl/Lease.html
title: Lease
---

# Lease

## Content

Package [akka.coordination.lease.javadsl](package-summary.html)
## Class Lease

- java.lang.Object
- - akka.coordination.lease.javadsl.Lease

- ---

```
public abstract class Lease
extends java.lang.Object
```

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[Lease](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `abstract java.util.concurrent.CompletionStage<java.lang.Boolean>` | `[acquire](#acquire())()` | Try to acquire the lease. |
	| `abstract java.util.concurrent.CompletionStage<java.lang.Boolean>` | `[acquire](#acquire(java.util.function.Consumer))​(java.util.function.Consumer<java.util.Optional<java.lang.Throwable>> leaseLostCallback)` | Same as acquire with an additional callback  that is called if the lease is lost. |
	| `abstract boolean` | `[checkLease](#checkLease())()` | Check if the owner still holds the lease. |
	| `abstract [LeaseSettings](../LeaseSettings.html "class in akka.coordination.lease")` | `[getSettings](#getSettings())()` |  |
	| `abstract java.util.concurrent.CompletionStage<java.lang.Boolean>` | `[release](#release())()` | Release the lease so some other owner can acquire it. |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### Lease
		
		
		
		```
		public Lease()
		```

	- ### Method Detail
	
	
	
		- #### acquire
		
		
		
		```
		public abstract java.util.concurrent.CompletionStage<java.lang.Boolean> acquire()
		```
		
		Try to acquire the lease. The returned `CompletionStage` will be completed with `true`
		 if the lease could be acquired, i.e. no other owner is holding the lease.
		 
		 The returned `Future` will be completed with `false` if the lease for certain couldn't be
		 acquired, e.g. because some other owner is holding it. It's completed with [`LeaseException`](../LeaseException.html "class in akka.coordination.lease")
		 failure if it might not have been able to acquire the lease, e.g. communication timeout
		 with the lease resource.
		 
		
		
		 The lease will be held by the `LeaseSettings.ownerName` until it is released
		 with `Lease.release`. A Lease implementation will typically also loose the ownership
		 if it can't maintain its authority, e.g. if it crashes or is partitioned from the lease
		 resource for too long.
		 
		
		
		`Lease.checkLease` can be used to verify that the owner still has the lease.
		- #### acquire
		
		
		
		```
		public abstract java.util.concurrent.CompletionStage<java.lang.Boolean> acquire​(java.util.function.Consumer<java.util.Optional<java.lang.Throwable>> leaseLostCallback)
		```
		
		Same as acquire with an additional callback
		 that is called if the lease is lost. The lease can be lose due to being unable
		 to communicate with the lease provider.
		 Implementations should not call leaseLostCallback until after the returned future
		 has been completed
		- #### checkLease
		
		
		
		```
		public abstract boolean checkLease()
		```
		
		Check if the owner still holds the lease.
		 `true` means that it certainly holds the lease.
		 `false` means that it might not hold the lease, but it could, and for more certain
		 response you would have to use {@link Lease\#acquire()\*} or [`release()`](#release()).
		- #### getSettings
		
		
		
		```
		public abstract [LeaseSettings](../LeaseSettings.html "class in akka.coordination.lease") getSettings()
		```
		- #### release
		
		
		
		```
		public abstract java.util.concurrent.CompletionStage<java.lang.Boolean> release()
		```
		
		Release the lease so some other owner can acquire it.

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/coordination/lease/LeaseException.html
- https://doc.akka.io/japi/akka/current/akka/coordination/lease/LeaseSettings.html
- https://doc.akka.io/japi/akka/current/akka/coordination/lease/javadsl/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/coordination/lease/javadsl/Lease.html](https://doc.akka.io/japi/akka/current/akka/coordination/lease/javadsl/Lease.html)*