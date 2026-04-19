---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:35:48Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/remote/artery/RemoteInstruments$.html
title: RemoteInstruments$
---

# RemoteInstruments$

## Content

Package [akka.remote.artery](package-summary.html)
## Class RemoteInstruments$

- java.lang.Object
- - akka.remote.artery.RemoteInstruments$

- ---

```
public class RemoteInstruments$
extends java.lang.Object
```

INTERNAL API

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [RemoteInstruments$](RemoteInstruments$.html "class in akka.remote.artery")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[RemoteInstruments$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `akka.remote.artery.RemoteInstruments` | `[apply](#apply(akka.actor.ExtendedActorSystem))​([ExtendedActorSystem](../../actor/ExtendedActorSystem.html "class in akka.actor") system)` |  |
	| `int` | `[combineKeyLength](#combineKeyLength(byte,int))​(byte k,  int l)` |  |
	| `scala.collection.immutable.Vector<[RemoteInstrument](RemoteInstrument.html "class in akka.remote.artery")>` | `[create](#create(akka.actor.ExtendedActorSystem,akka.event.LoggingAdapter))​([ExtendedActorSystem](../../actor/ExtendedActorSystem.html "class in akka.actor") system,  [LoggingAdapter](../../event/LoggingAdapter.html "interface in akka.event") log)` |  |
	| `byte` | `[getKey](#getKey(int))​(int kl)` |  |
	| `int` | `[getLength](#getLength(int))​(int kl)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [RemoteInstruments$](RemoteInstruments$.html "class in akka.remote.artery") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### RemoteInstruments$
		
		
		
		```
		public RemoteInstruments$()
		```

	- ### Method Detail
	
	
	
		- #### apply
		
		
		
		```
		public akka.remote.artery.RemoteInstruments apply​([ExtendedActorSystem](../../actor/ExtendedActorSystem.html "class in akka.actor") system)
		```
		- #### combineKeyLength
		
		
		
		```
		public int combineKeyLength​(byte k,
		                            int l)
		```
		- #### getKey
		
		
		
		```
		public byte getKey​(int kl)
		```
		- #### getLength
		
		
		
		```
		public int getLength​(int kl)
		```
		- #### create
		
		
		
		```
		public scala.collection.immutable.Vector<[RemoteInstrument](RemoteInstrument.html "class in akka.remote.artery")> create​([ExtendedActorSystem](../../actor/ExtendedActorSystem.html "class in akka.actor") system,
		                                                                  [LoggingAdapter](../../event/LoggingAdapter.html "interface in akka.event") log)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/actor/ExtendedActorSystem.html
- https://doc.akka.io/japi/akka/current/akka/event/LoggingAdapter.html
- https://doc.akka.io/japi/akka/current/akka/remote/artery/RemoteInstrument.html
- https://doc.akka.io/japi/akka/current/akka/remote/artery/RemoteInstruments$.html
- https://doc.akka.io/japi/akka/current/akka/remote/artery/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/remote/artery/RemoteInstruments$.html](https://doc.akka.io/japi/akka/current/akka/remote/artery/RemoteInstruments$.html)*