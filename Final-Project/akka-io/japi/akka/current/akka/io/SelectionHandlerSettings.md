---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:17:07Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/io/SelectionHandlerSettings.html
title: SelectionHandlerSettings
---

# SelectionHandlerSettings

## Content

Package [akka.io](package-summary.html)
## Class SelectionHandlerSettings

- java.lang.Object
- - akka.io.SelectionHandlerSettings

- Direct Known Subclasses:
`[TcpExt.Settings](TcpExt.Settings.html "class in akka.io")`

---

```
public abstract class SelectionHandlerSettings
extends java.lang.Object
```

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[SelectionHandlerSettings](#%3Cinit%3E(com.typesafe.config.Config))​(com.typesafe.config.Config config)` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `int` | `[MaxChannels](#MaxChannels())()` |  |
	| `abstract int` | `[MaxChannelsPerSelector](#MaxChannelsPerSelector())()` |  |
	| `int` | `[SelectorAssociationRetries](#SelectorAssociationRetries())()` |  |
	| `java.lang.String` | `[SelectorDispatcher](#SelectorDispatcher())()` |  |
	| `boolean` | `[TraceLogging](#TraceLogging())()` |  |
	| `java.lang.String` | `[WorkerDispatcher](#WorkerDispatcher())()` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### SelectionHandlerSettings
		
		
		
		```
		public SelectionHandlerSettings​(com.typesafe.config.Config config)
		```

	- ### Method Detail
	
	
	
		- #### MaxChannels
		
		
		
		```
		public int MaxChannels()
		```
		- #### MaxChannelsPerSelector
		
		
		
		```
		public abstract int MaxChannelsPerSelector()
		```
		- #### SelectorAssociationRetries
		
		
		
		```
		public int SelectorAssociationRetries()
		```
		- #### SelectorDispatcher
		
		
		
		```
		public java.lang.String SelectorDispatcher()
		```
		- #### TraceLogging
		
		
		
		```
		public boolean TraceLogging()
		```
		- #### WorkerDispatcher
		
		
		
		```
		public java.lang.String WorkerDispatcher()
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/io/TcpExt.Settings.html
- https://doc.akka.io/japi/akka/current/akka/io/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/io/SelectionHandlerSettings.html](https://doc.akka.io/japi/akka/current/akka/io/SelectionHandlerSettings.html)*