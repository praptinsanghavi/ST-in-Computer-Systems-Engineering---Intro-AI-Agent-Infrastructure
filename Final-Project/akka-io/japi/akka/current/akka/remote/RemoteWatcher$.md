---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:34:07Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/remote/RemoteWatcher$.html
title: RemoteWatcher$
---

# RemoteWatcher$

## Content

Package [akka.remote](package-summary.html)
## Class RemoteWatcher$

- java.lang.Object
- - akka.remote.RemoteWatcher$

- ---

```
public class RemoteWatcher$
extends java.lang.Object
```

INTERNAL API

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [RemoteWatcher$](RemoteWatcher$.html "class in akka.remote")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[RemoteWatcher$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[Props](../actor/Props.html "class in akka.actor")` | `[props](#props(akka.remote.RemoteSettings,akka.remote.FailureDetectorRegistry))​([RemoteSettings](RemoteSettings.html "class in akka.remote") settings,  [FailureDetectorRegistry](FailureDetectorRegistry.html "interface in akka.remote")<[Address](../actor/Address.html "class in akka.actor")> failureDetector)` | Factory method for `RemoteWatcher` [`Props`](../actor/Props.html "class in akka.actor"). |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [RemoteWatcher$](RemoteWatcher$.html "class in akka.remote") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### RemoteWatcher$
		
		
		
		```
		public RemoteWatcher$()
		```

	- ### Method Detail
	
	
	
		- #### props
		
		
		
		```
		public [Props](../actor/Props.html "class in akka.actor") props​([RemoteSettings](RemoteSettings.html "class in akka.remote") settings,
		                   [FailureDetectorRegistry](FailureDetectorRegistry.html "interface in akka.remote")<[Address](../actor/Address.html "class in akka.actor")> failureDetector)
		```
		
		Factory method for `RemoteWatcher` [`Props`](../actor/Props.html "class in akka.actor").

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/actor/Address.html
- https://doc.akka.io/japi/akka/current/akka/actor/Props.html
- https://doc.akka.io/japi/akka/current/akka/remote/FailureDetectorRegistry.html
- https://doc.akka.io/japi/akka/current/akka/remote/RemoteSettings.html
- https://doc.akka.io/japi/akka/current/akka/remote/RemoteWatcher$.html
- https://doc.akka.io/japi/akka/current/akka/remote/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/remote/RemoteWatcher$.html](https://doc.akka.io/japi/akka/current/akka/remote/RemoteWatcher$.html)*