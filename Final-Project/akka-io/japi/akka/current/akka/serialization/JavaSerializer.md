---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:39:53Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/serialization/JavaSerializer.CurrentSystem.html
title: JavaSerializer.CurrentSystem
---

# JavaSerializer.CurrentSystem

## Content

Package [akka.serialization](package-summary.html)
## Class JavaSerializer.CurrentSystem

- java.lang.Object
- - scala.util.DynamicVariable\<[ExtendedActorSystem](../actor/ExtendedActorSystem.html "class in akka.actor")\>
	- - akka.serialization.JavaSerializer.CurrentSystem

- Enclosing class:
[JavaSerializer](JavaSerializer.html "class in akka.serialization")

---

```
public static final class JavaSerializer.CurrentSystem
extends scala.util.DynamicVariable<[ExtendedActorSystem](../actor/ExtendedActorSystem.html "class in akka.actor")>
```

- - ### Field Summary
	
	
		- ### Fields inherited from class scala.util.DynamicVariable
		
		
		`scala$util$DynamicVariable$$init`

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[CurrentSystem](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `<S> S` | `[withValue](#withValue(akka.actor.ExtendedActorSystem,java.util.concurrent.Callable))​([ExtendedActorSystem](../actor/ExtendedActorSystem.html "class in akka.actor") value,  java.util.concurrent.Callable<S> callable)` | Java API: invoke the callable with the current system being set to the given value for this thread. |
	
	
		- ### Methods inherited from class scala.util.DynamicVariable
		
		
		`toString, value, value_$eq, withValue`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### CurrentSystem
		
		
		
		```
		public CurrentSystem()
		```

	- ### Method Detail
	
	
	
		- #### withValue
		
		
		
		```
		public <S> S withValue​([ExtendedActorSystem](../actor/ExtendedActorSystem.html "class in akka.actor") value,
		                       java.util.concurrent.Callable<S> callable)
		```
		
		Java API: invoke the callable with the current system being set to the given value for this thread.
		 
		
		Parameters:
		`value` \- \- the current value under the call to callable.call()
		`callable` \- \- the operation to be performed
		Returns:
		the result of callable.call()

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/actor/ExtendedActorSystem.html
- https://doc.akka.io/japi/akka/current/akka/serialization/JavaSerializer.html
- https://doc.akka.io/japi/akka/current/akka/serialization/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/serialization/JavaSerializer.CurrentSystem.html](https://doc.akka.io/japi/akka/current/akka/serialization/JavaSerializer.CurrentSystem.html)*