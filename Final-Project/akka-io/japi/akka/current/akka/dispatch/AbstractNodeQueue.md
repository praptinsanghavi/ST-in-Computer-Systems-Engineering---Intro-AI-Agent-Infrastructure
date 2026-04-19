---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:14:13Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/dispatch/AbstractNodeQueue.Node.html
title: AbstractNodeQueue.Node
---

# AbstractNodeQueue.Node

## Content

Package [akka.dispatch](package-summary.html)
## Class AbstractNodeQueue.Node\<T\>

- java.lang.Object
- - akka.dispatch.AbstractNodeQueue.Node\<T\>

- Enclosing class:
[AbstractNodeQueue](AbstractNodeQueue.html "class in akka.dispatch")\<[T](AbstractNodeQueue.html "type parameter in AbstractNodeQueue")\>

---

```
public static class AbstractNodeQueue.Node<T>
extends java.lang.Object
```

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `[T](AbstractNodeQueue.Node.html "type parameter in AbstractNodeQueue.Node")` | `[value](#value)` |  |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[Node](#%3Cinit%3E())()` |  |
	| `[Node](#%3Cinit%3E(T))​([T](AbstractNodeQueue.Node.html "type parameter in AbstractNodeQueue.Node") value)` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[AbstractNodeQueue.Node](AbstractNodeQueue.Node.html "class in akka.dispatch")<[T](AbstractNodeQueue.Node.html "type parameter in AbstractNodeQueue.Node")>` | `[next](#next())()` |  |
	| `protected void` | `[setNext](#setNext(akka.dispatch.AbstractNodeQueue.Node))​([AbstractNodeQueue.Node](AbstractNodeQueue.Node.html "class in akka.dispatch")<[T](AbstractNodeQueue.Node.html "type parameter in AbstractNodeQueue.Node")> newNext)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### value
		
		
		
		```
		public [T](AbstractNodeQueue.Node.html "type parameter in AbstractNodeQueue.Node") value
		```

	- ### Constructor Detail
	
	
	
		- #### Node
		
		
		
		```
		public Node()
		```
		- #### Node
		
		
		
		```
		public Node​([T](AbstractNodeQueue.Node.html "type parameter in AbstractNodeQueue.Node") value)
		```

	- ### Method Detail
	
	
	
		- #### next
		
		
		
		```
		public final [AbstractNodeQueue.Node](AbstractNodeQueue.Node.html "class in akka.dispatch")<[T](AbstractNodeQueue.Node.html "type parameter in AbstractNodeQueue.Node")> next()
		```
		- #### setNext
		
		
		
		```
		protected final void setNext​([AbstractNodeQueue.Node](AbstractNodeQueue.Node.html "class in akka.dispatch")<[T](AbstractNodeQueue.Node.html "type parameter in AbstractNodeQueue.Node")> newNext)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/dispatch/AbstractNodeQueue.Node.html
- https://doc.akka.io/japi/akka/current/akka/dispatch/AbstractNodeQueue.html
- https://doc.akka.io/japi/akka/current/akka/dispatch/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/dispatch/AbstractNodeQueue.Node.html](https://doc.akka.io/japi/akka/current/akka/dispatch/AbstractNodeQueue.Node.html)*