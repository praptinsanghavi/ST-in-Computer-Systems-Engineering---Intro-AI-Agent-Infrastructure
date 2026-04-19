---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T16:10:36Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/routing/ConsistentHashingRouter.ConsistentHashMapper.html
title: ConsistentHashingRouter.ConsistentHashMapper
---

# ConsistentHashingRouter.ConsistentHashMapper

## Content

Package [akka.routing](package-summary.html)
## Interface ConsistentHashingRouter.ConsistentHashMapper

- Enclosing class:
[ConsistentHashingRouter](ConsistentHashingRouter.html "class in akka.routing")

---

```
public static interface ConsistentHashingRouter.ConsistentHashMapper
```

JAVA API
 Mapping from message to the data to use for the consistent hash key.
 Note that it's not the hash that is to be returned, but the data to be
 hashed.
 
 May return `null` to indicate that the message is not handled by
 this mapping.
 

 If returning an `Array[Byte]` or String it will be used as is,
 otherwise the configured [`Serializer`](../serialization/Serializer.html "interface in akka.serialization")
 will be applied to the returned data.

- - ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `java.lang.Object` | `[hashKey](#hashKey(java.lang.Object))​(java.lang.Object message)` |  |

- - ### Method Detail
	
	
	
		- #### hashKey
		
		
		
		```
		java.lang.Object hashKey​(java.lang.Object message)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/routing/ConsistentHashingRouter.html
- https://doc.akka.io/japi/akka-core/2.10/akka/routing/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10/akka/serialization/Serializer.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/routing/ConsistentHashingRouter.ConsistentHashMapper.html](https://doc.akka.io/japi/akka-core/2.10/akka/routing/ConsistentHashingRouter.ConsistentHashMapper.html)*