---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:14:46Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/dispatch/Mailbox$.html
title: Mailbox$
---

# Mailbox$

## Content

Package [akka.dispatch](package-summary.html)
## Class Mailbox$

- java.lang.Object
- - akka.dispatch.Mailbox$

- All Implemented Interfaces:
`java.io.Serializable`

---

```
public class Mailbox$
extends java.lang.Object
implements java.io.Serializable
```

INTERNAL API

See Also:
[Serialized Form](../../serialized-form.html#akka.dispatch.Mailbox$)

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [Mailbox$](Mailbox$.html "class in akka.dispatch")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[Mailbox$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `int` | `[Closed](#Closed())()` |  |
	| `boolean` | `[debug](#debug())()` |  |
	| `int` | `[Open](#Open())()` |  |
	| `int` | `[Scheduled](#Scheduled())()` |  |
	| `int` | `[shouldNotProcessMask](#shouldNotProcessMask())()` |  |
	| `int` | `[shouldScheduleMask](#shouldScheduleMask())()` |  |
	| `int` | `[suspendMask](#suspendMask())()` |  |
	| `int` | `[suspendUnit](#suspendUnit())()` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [Mailbox$](Mailbox$.html "class in akka.dispatch") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### Mailbox$
		
		
		
		```
		public Mailbox$()
		```

	- ### Method Detail
	
	
	
		- #### Open
		
		
		
		```
		public final int Open()
		```
		- #### Closed
		
		
		
		```
		public final int Closed()
		```
		- #### Scheduled
		
		
		
		```
		public final int Scheduled()
		```
		- #### shouldScheduleMask
		
		
		
		```
		public final int shouldScheduleMask()
		```
		- #### shouldNotProcessMask
		
		
		
		```
		public final int shouldNotProcessMask()
		```
		- #### suspendMask
		
		
		
		```
		public final int suspendMask()
		```
		- #### suspendUnit
		
		
		
		```
		public final int suspendUnit()
		```
		- #### debug
		
		
		
		```
		public final boolean debug()
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/dispatch/Mailbox$.html
- https://doc.akka.io/japi/akka/current/akka/dispatch/package-summary.html
- https://doc.akka.io/japi/akka/current/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/dispatch/Mailbox$.html](https://doc.akka.io/japi/akka/current/akka/dispatch/Mailbox$.html)*