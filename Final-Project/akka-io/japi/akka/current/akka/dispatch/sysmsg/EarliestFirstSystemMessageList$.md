---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:15:25Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/dispatch/sysmsg/EarliestFirstSystemMessageList$.html
title: EarliestFirstSystemMessageList$
---

# EarliestFirstSystemMessageList$

## Content

Package [akka.dispatch.sysmsg](package-summary.html)
## Class EarliestFirstSystemMessageList$

- java.lang.Object
- - akka.dispatch.sysmsg.EarliestFirstSystemMessageList$

- ---

```
public class EarliestFirstSystemMessageList$
extends java.lang.Object
```

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [EarliestFirstSystemMessageList$](EarliestFirstSystemMessageList$.html "class in akka.dispatch.sysmsg")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[EarliestFirstSystemMessageList$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `akka.dispatch.sysmsg.EarliestFirstSystemMessageList` | `[$colon$colon$extension](#$colon$colon$extension(akka.dispatch.sysmsg.EarliestFirstSystemMessageList,akka.dispatch.sysmsg.SystemMessage))​(akka.dispatch.sysmsg.EarliestFirstSystemMessageList $this,  [SystemMessage](SystemMessage.html "interface in akka.dispatch.sysmsg") msg)` |  |
	| `boolean` | `[equals$extension](#equals$extension(akka.dispatch.sysmsg.EarliestFirstSystemMessageList,java.lang.Object))​(akka.dispatch.sysmsg.EarliestFirstSystemMessageList $this,  java.lang.Object x$1)` |  |
	| `int` | `[hashCode$extension](#hashCode$extension(akka.dispatch.sysmsg.EarliestFirstSystemMessageList))​(akka.dispatch.sysmsg.EarliestFirstSystemMessageList $this)` |  |
	| `boolean` | `[isEmpty$extension](#isEmpty$extension(akka.dispatch.sysmsg.EarliestFirstSystemMessageList))​(akka.dispatch.sysmsg.EarliestFirstSystemMessageList $this)` |  |
	| `boolean` | `[nonEmpty$extension](#nonEmpty$extension(akka.dispatch.sysmsg.EarliestFirstSystemMessageList))​(akka.dispatch.sysmsg.EarliestFirstSystemMessageList $this)` |  |
	| `akka.dispatch.sysmsg.EarliestFirstSystemMessageList` | `[reverse_$colon$colon$colon$extension](#reverse_$colon$colon$colon$extension(akka.dispatch.sysmsg.EarliestFirstSystemMessageList,akka.dispatch.sysmsg.LatestFirstSystemMessageList))​(akka.dispatch.sysmsg.EarliestFirstSystemMessageList $this,  akka.dispatch.sysmsg.LatestFirstSystemMessageList other)` |  |
	| `akka.dispatch.sysmsg.LatestFirstSystemMessageList` | `[reverse$extension](#reverse$extension(akka.dispatch.sysmsg.EarliestFirstSystemMessageList))​(akka.dispatch.sysmsg.EarliestFirstSystemMessageList $this)` |  |
	| `akka.dispatch.sysmsg.EarliestFirstSystemMessageList` | `[reversePrepend$extension](#reversePrepend$extension(akka.dispatch.sysmsg.EarliestFirstSystemMessageList,akka.dispatch.sysmsg.LatestFirstSystemMessageList))​(akka.dispatch.sysmsg.EarliestFirstSystemMessageList $this,  akka.dispatch.sysmsg.LatestFirstSystemMessageList other)` |  |
	| `int` | `[size$extension](#size$extension(akka.dispatch.sysmsg.EarliestFirstSystemMessageList))​(akka.dispatch.sysmsg.EarliestFirstSystemMessageList $this)` |  |
	| `akka.dispatch.sysmsg.EarliestFirstSystemMessageList` | `[tail$extension](#tail$extension(akka.dispatch.sysmsg.EarliestFirstSystemMessageList))​(akka.dispatch.sysmsg.EarliestFirstSystemMessageList $this)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [EarliestFirstSystemMessageList$](EarliestFirstSystemMessageList$.html "class in akka.dispatch.sysmsg") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### EarliestFirstSystemMessageList$
		
		
		
		```
		public EarliestFirstSystemMessageList$()
		```

	- ### Method Detail
	
	
	
		- #### isEmpty$extension
		
		
		
		```
		public final boolean isEmpty$extension​(akka.dispatch.sysmsg.EarliestFirstSystemMessageList $this)
		```
		- #### nonEmpty$extension
		
		
		
		```
		public final boolean nonEmpty$extension​(akka.dispatch.sysmsg.EarliestFirstSystemMessageList $this)
		```
		- #### size$extension
		
		
		
		```
		public final int size$extension​(akka.dispatch.sysmsg.EarliestFirstSystemMessageList $this)
		```
		- #### tail$extension
		
		
		
		```
		public final akka.dispatch.sysmsg.EarliestFirstSystemMessageList tail$extension​(akka.dispatch.sysmsg.EarliestFirstSystemMessageList $this)
		```
		- #### reverse$extension
		
		
		
		```
		public final akka.dispatch.sysmsg.LatestFirstSystemMessageList reverse$extension​(akka.dispatch.sysmsg.EarliestFirstSystemMessageList $this)
		```
		- #### $colon$colon$extension
		
		
		
		```
		public final akka.dispatch.sysmsg.EarliestFirstSystemMessageList $colon$colon$extension​(akka.dispatch.sysmsg.EarliestFirstSystemMessageList $this,
		                                                                                        [SystemMessage](SystemMessage.html "interface in akka.dispatch.sysmsg") msg)
		```
		- #### reversePrepend$extension
		
		
		
		```
		public final akka.dispatch.sysmsg.EarliestFirstSystemMessageList reversePrepend$extension​(akka.dispatch.sysmsg.EarliestFirstSystemMessageList $this,
		                                                                                          akka.dispatch.sysmsg.LatestFirstSystemMessageList other)
		```
		- #### reverse\_$colon$colon$colon$extension
		
		
		
		```
		public final akka.dispatch.sysmsg.EarliestFirstSystemMessageList reverse_$colon$colon$colon$extension​(akka.dispatch.sysmsg.EarliestFirstSystemMessageList $this,
		                                                                                                      akka.dispatch.sysmsg.LatestFirstSystemMessageList other)
		```
		- #### hashCode$extension
		
		
		
		```
		public final int hashCode$extension​(akka.dispatch.sysmsg.EarliestFirstSystemMessageList $this)
		```
		- #### equals$extension
		
		
		
		```
		public final boolean equals$extension​(akka.dispatch.sysmsg.EarliestFirstSystemMessageList $this,
		                                      java.lang.Object x$1)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/dispatch/sysmsg/EarliestFirstSystemMessageList$.html
- https://doc.akka.io/japi/akka/current/akka/dispatch/sysmsg/SystemMessage.html
- https://doc.akka.io/japi/akka/current/akka/dispatch/sysmsg/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/dispatch/sysmsg/EarliestFirstSystemMessageList$.html](https://doc.akka.io/japi/akka/current/akka/dispatch/sysmsg/EarliestFirstSystemMessageList$.html)*