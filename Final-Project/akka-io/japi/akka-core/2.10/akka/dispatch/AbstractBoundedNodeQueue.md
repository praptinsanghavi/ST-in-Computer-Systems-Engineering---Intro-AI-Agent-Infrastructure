---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T15:21:01Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/dispatch/AbstractBoundedNodeQueue.Node.html
title: AbstractBoundedNodeQueue.Node
---

# AbstractBoundedNodeQueue.Node

## Content

Package [akka.dispatch](package-summary.html)
## Class AbstractBoundedNodeQueue.Node\<T\>

- java.lang.Object
- - akka.dispatch.AbstractBoundedNodeQueue.Node\<T\>

- Enclosing class:
[AbstractBoundedNodeQueue](AbstractBoundedNodeQueue.html "class in akka.dispatch")\<[T](AbstractBoundedNodeQueue.html "type parameter in AbstractBoundedNodeQueue")\>

---

```
public static class AbstractBoundedNodeQueue.Node<T>
extends java.lang.Object
```

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `protected int` | `[count](#count)` |  |
	| `protected [T](AbstractBoundedNodeQueue.Node.html "type parameter in AbstractBoundedNodeQueue.Node")` | `[value](#value)` |  |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[Node](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[AbstractBoundedNodeQueue.Node](AbstractBoundedNodeQueue.Node.html "class in akka.dispatch")<[T](AbstractBoundedNodeQueue.Node.html "type parameter in AbstractBoundedNodeQueue.Node")>` | `[next](#next())()` |  |
	| `protected void` | `[setNext](#setNext(akka.dispatch.AbstractBoundedNodeQueue.Node))​([AbstractBoundedNodeQueue.Node](AbstractBoundedNodeQueue.Node.html "class in akka.dispatch")<[T](AbstractBoundedNodeQueue.Node.html "type parameter in AbstractBoundedNodeQueue.Node")> newNext)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### value
		
		
		
		```
		protected [T](AbstractBoundedNodeQueue.Node.html "type parameter in AbstractBoundedNodeQueue.Node") value
		```
		- #### count
		
		
		
		```
		protected int count
		```

	- ### Constructor Detail
	
	
	
		- #### Node
		
		
		
		```
		public Node()
		```

	- ### Method Detail
	
	
	
		- #### next
		
		
		
		```
		public final [AbstractBoundedNodeQueue.Node](AbstractBoundedNodeQueue.Node.html "class in akka.dispatch")<[T](AbstractBoundedNodeQueue.Node.html "type parameter in AbstractBoundedNodeQueue.Node")> next()
		```
		- #### setNext
		
		
		
		```
		protected final void setNext​([AbstractBoundedNodeQueue.Node](AbstractBoundedNodeQueue.Node.html "class in akka.dispatch")<[T](AbstractBoundedNodeQueue.Node.html "type parameter in AbstractBoundedNodeQueue.Node")> newNext)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/dispatch/AbstractBoundedNodeQueue.Node.html
- https://doc.akka.io/japi/akka-core/2.10/akka/dispatch/AbstractBoundedNodeQueue.html
- https://doc.akka.io/japi/akka-core/2.10/akka/dispatch/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/dispatch/AbstractBoundedNodeQueue.Node.html](https://doc.akka.io/japi/akka-core/2.10/akka/dispatch/AbstractBoundedNodeQueue.Node.html)*