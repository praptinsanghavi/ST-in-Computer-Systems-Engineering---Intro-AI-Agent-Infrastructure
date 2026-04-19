---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T15:11:56Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/actor/AbstractExtensionId.html
title: AbstractExtensionId
---

# AbstractExtensionId

## Content

Package [akka.actor](package-summary.html)
## Class AbstractExtensionId\<T extends [Extension](Extension.html "interface in akka.actor")\>

- java.lang.Object
- - akka.actor.AbstractExtensionId\<T\>

- All Implemented Interfaces:
`[ExtensionId](ExtensionId.html "interface in akka.actor")<T>`

---

```
public abstract class AbstractExtensionId<T extends [Extension](Extension.html "interface in akka.actor")>
extends java.lang.Object
implements [ExtensionId](ExtensionId.html "interface in akka.actor")<T>
```

Java API for ExtensionId

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[AbstractExtensionId](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`
		- ### Methods inherited from interface akka.actor.[ExtensionId](ExtensionId.html "interface in akka.actor")
		
		
		`[apply](ExtensionId.html#apply(akka.actor.ActorSystem)), [apply](ExtensionId.html#apply(akka.actor.ClassicActorSystemProvider)), [createExtension](ExtensionId.html#createExtension(akka.actor.ExtendedActorSystem)), [equals](ExtensionId.html#equals(java.lang.Object)), [get](ExtensionId.html#get(akka.actor.ActorSystem)), [get](ExtensionId.html#get(akka.actor.ClassicActorSystemProvider)), [hashCode](ExtensionId.html#hashCode())`

- - ### Constructor Detail
	
	
	
		- #### AbstractExtensionId
		
		
		
		```
		public AbstractExtensionId()
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/actor/Extension.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/ExtensionId.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/actor/AbstractExtensionId.html](https://doc.akka.io/japi/akka-core/2.10/akka/actor/AbstractExtensionId.html)*