---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T16:44:02Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/io/TcpExt.Settings.html
title: TcpExt.Settings
---

# TcpExt.Settings

## Content

Package [akka.io](package-summary.html)
## Class TcpExt.Settings

- java.lang.Object
- - [akka.io.SelectionHandlerSettings](SelectionHandlerSettings.html "class in akka.io")
	- - akka.io.TcpExt.Settings

- Enclosing class:
[TcpExt](TcpExt.html "class in akka.io")

---

```
public class TcpExt.Settings
extends [SelectionHandlerSettings](SelectionHandlerSettings.html "class in akka.io")
```

- - ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `int` | `[BatchAcceptLimit](#BatchAcceptLimit())()` |  |
	| `int` | `[DirectBufferSize](#DirectBufferSize())()` |  |
	| `java.lang.String` | `[FileIODispatcher](#FileIODispatcher())()` |  |
	| `int` | `[FinishConnectRetries](#FinishConnectRetries())()` |  |
	| `java.lang.String` | `[ManagementDispatcher](#ManagementDispatcher())()` |  |
	| `int` | `[MaxChannelsPerSelector](#MaxChannelsPerSelector())()` |  |
	| `int` | `[MaxDirectBufferPoolSize](#MaxDirectBufferPoolSize())()` |  |
	| `int` | `[NrOfSelectors](#NrOfSelectors())()` |  |
	| `int` | `[ReceivedMessageSizeLimit](#ReceivedMessageSizeLimit())()` |  |
	| `scala.concurrent.duration.Duration` | `[RegisterTimeout](#RegisterTimeout())()` |  |
	| `int` | `[TransferToLimit](#TransferToLimit())()` |  |
	| `boolean` | `[WindowsConnectionAbortWorkaroundEnabled](#WindowsConnectionAbortWorkaroundEnabled())()` |  |
	
	
		- ### Methods inherited from class akka.io.[SelectionHandlerSettings](SelectionHandlerSettings.html "class in akka.io")
		
		
		`[MaxChannels](SelectionHandlerSettings.html#MaxChannels()), [SelectorAssociationRetries](SelectionHandlerSettings.html#SelectorAssociationRetries()), [SelectorDispatcher](SelectionHandlerSettings.html#SelectorDispatcher()), [TraceLogging](SelectionHandlerSettings.html#TraceLogging()), [WorkerDispatcher](SelectionHandlerSettings.html#WorkerDispatcher())`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Method Detail
	
	
	
		- #### BatchAcceptLimit
		
		
		
		```
		public int BatchAcceptLimit()
		```
		- #### DirectBufferSize
		
		
		
		```
		public int DirectBufferSize()
		```
		- #### FileIODispatcher
		
		
		
		```
		public java.lang.String FileIODispatcher()
		```
		- #### FinishConnectRetries
		
		
		
		```
		public int FinishConnectRetries()
		```
		- #### ManagementDispatcher
		
		
		
		```
		public java.lang.String ManagementDispatcher()
		```
		- #### MaxChannelsPerSelector
		
		
		
		```
		public int MaxChannelsPerSelector()
		```
		
		
		Specified by:
		`[MaxChannelsPerSelector](SelectionHandlerSettings.html#MaxChannelsPerSelector())` in class `[SelectionHandlerSettings](SelectionHandlerSettings.html "class in akka.io")`
		- #### MaxDirectBufferPoolSize
		
		
		
		```
		public int MaxDirectBufferPoolSize()
		```
		- #### NrOfSelectors
		
		
		
		```
		public int NrOfSelectors()
		```
		- #### ReceivedMessageSizeLimit
		
		
		
		```
		public int ReceivedMessageSizeLimit()
		```
		- #### RegisterTimeout
		
		
		
		```
		public scala.concurrent.duration.Duration RegisterTimeout()
		```
		- #### TransferToLimit
		
		
		
		```
		public int TransferToLimit()
		```
		- #### WindowsConnectionAbortWorkaroundEnabled
		
		
		
		```
		public boolean WindowsConnectionAbortWorkaroundEnabled()
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/io/SelectionHandlerSettings.html
- https://doc.akka.io/japi/akka/current/akka/io/TcpExt.html
- https://doc.akka.io/japi/akka/current/akka/io/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/io/TcpExt.Settings.html](https://doc.akka.io/japi/akka/current/akka/io/TcpExt.Settings.html)*