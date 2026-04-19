---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:57:09Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/settings/RoutingSettings.html
title: RoutingSettings
---

# RoutingSettings

## Content

Package [akka.http.javadsl.settings](package-summary.html)
## Class RoutingSettings

- java.lang.Object
- - akka.http.javadsl.settings.RoutingSettings

- Direct Known Subclasses:
`[RoutingSettings](../../scaladsl/settings/RoutingSettings.html "class in akka.http.scaladsl.settings")`

---

```
public abstract class RoutingSettings
extends java.lang.Object
```

Public API but not intended for subclassing

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[RoutingSettings](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) [Concrete Methods](javascript:show(8);) [Deprecated Methods](javascript:show(32);) 
	| Modifier and Type | Method | Description |
	| `static [RoutingSettings](RoutingSettings.html "class in akka.http.javadsl.settings")` | `[create](#create(akka.actor.ActorSystem))​(akka.actor.ActorSystem system)` |  |
	| `static [RoutingSettings](RoutingSettings.html "class in akka.http.javadsl.settings")` | `[create](#create(com.typesafe.config.Config))​(com.typesafe.config.Config config)` |  |
	| `static [RoutingSettings](RoutingSettings.html "class in akka.http.javadsl.settings")` | `[create](#create(java.lang.String))​(java.lang.String configOverrides)` |  |
	| `abstract int` | `[getDecodeMaxBytesPerChunk](#getDecodeMaxBytesPerChunk())()` |  |
	| `abstract boolean` | `[getFileGetConditional](#getFileGetConditional())()` |  |
	| `abstract java.lang.String` | `[getFileIODispatcher](#getFileIODispatcher())()` | Deprecated. binary compatibility method. |
	| `abstract long` | `[getRangeCoalescingThreshold](#getRangeCoalescingThreshold())()` |  |
	| `abstract int` | `[getRangeCountLimit](#getRangeCountLimit())()` |  |
	| `abstract boolean` | `[getRenderVanityFooter](#getRenderVanityFooter())()` |  |
	| `abstract boolean` | `[getVerboseErrorMessages](#getVerboseErrorMessages())()` |  |
	| `[RoutingSettings](RoutingSettings.html "class in akka.http.javadsl.settings")` | `[withDecodeMaxBytesPerChunk](#withDecodeMaxBytesPerChunk(int))​(int decodeMaxBytesPerChunk)` |  |
	| `[RoutingSettings](RoutingSettings.html "class in akka.http.javadsl.settings")` | `[withDecodeMaxSize](#withDecodeMaxSize(long))​(long decodeMaxSize)` |  |
	| `[RoutingSettings](RoutingSettings.html "class in akka.http.javadsl.settings")` | `[withFileGetConditional](#withFileGetConditional(boolean))​(boolean fileGetConditional)` |  |
	| `[RoutingSettings](RoutingSettings.html "class in akka.http.javadsl.settings")` | `[withFileIODispatcher](#withFileIODispatcher(java.lang.String))​(java.lang.String fileIODispatcher)` | Deprecated. binary compatibility method. |
	| `[RoutingSettings](RoutingSettings.html "class in akka.http.javadsl.settings")` | `[withRangeCoalescingThreshold](#withRangeCoalescingThreshold(long))​(long rangeCoalescingThreshold)` |  |
	| `[RoutingSettings](RoutingSettings.html "class in akka.http.javadsl.settings")` | `[withRangeCountLimit](#withRangeCountLimit(int))​(int rangeCountLimit)` |  |
	| `[RoutingSettings](RoutingSettings.html "class in akka.http.javadsl.settings")` | `[withRenderVanityFooter](#withRenderVanityFooter(boolean))​(boolean renderVanityFooter)` |  |
	| `[RoutingSettings](RoutingSettings.html "class in akka.http.javadsl.settings")` | `[withVerboseErrorMessages](#withVerboseErrorMessages(boolean))​(boolean verboseErrorMessages)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### RoutingSettings
		
		
		
		```
		public RoutingSettings()
		```

	- ### Method Detail
	
	
	
		- #### create
		
		
		
		```
		public static [RoutingSettings](RoutingSettings.html "class in akka.http.javadsl.settings") create​(com.typesafe.config.Config config)
		```
		- #### create
		
		
		
		```
		public static [RoutingSettings](RoutingSettings.html "class in akka.http.javadsl.settings") create​(java.lang.String configOverrides)
		```
		- #### create
		
		
		
		```
		public static [RoutingSettings](RoutingSettings.html "class in akka.http.javadsl.settings") create​(akka.actor.ActorSystem system)
		```
		- #### getVerboseErrorMessages
		
		
		
		```
		public abstract boolean getVerboseErrorMessages()
		```
		- #### getFileGetConditional
		
		
		
		```
		public abstract boolean getFileGetConditional()
		```
		- #### getRenderVanityFooter
		
		
		
		```
		public abstract boolean getRenderVanityFooter()
		```
		- #### getRangeCountLimit
		
		
		
		```
		public abstract int getRangeCountLimit()
		```
		- #### getRangeCoalescingThreshold
		
		
		
		```
		public abstract long getRangeCoalescingThreshold()
		```
		- #### getDecodeMaxBytesPerChunk
		
		
		
		```
		public abstract int getDecodeMaxBytesPerChunk()
		```
		- #### getFileIODispatcher
		
		
		
		```
		public abstract java.lang.String getFileIODispatcher()
		```
		
		Deprecated.
		binary compatibility method. Use \`akka.stream.materializer.blocking\-io\-dispatcher\` to configure the dispatcher. Since 10\.1\.6\.
		- #### withVerboseErrorMessages
		
		
		
		```
		public [RoutingSettings](RoutingSettings.html "class in akka.http.javadsl.settings") withVerboseErrorMessages​(boolean verboseErrorMessages)
		```
		- #### withFileGetConditional
		
		
		
		```
		public [RoutingSettings](RoutingSettings.html "class in akka.http.javadsl.settings") withFileGetConditional​(boolean fileGetConditional)
		```
		- #### withRenderVanityFooter
		
		
		
		```
		public [RoutingSettings](RoutingSettings.html "class in akka.http.javadsl.settings") withRenderVanityFooter​(boolean renderVanityFooter)
		```
		- #### withRangeCountLimit
		
		
		
		```
		public [RoutingSettings](RoutingSettings.html "class in akka.http.javadsl.settings") withRangeCountLimit​(int rangeCountLimit)
		```
		- #### withRangeCoalescingThreshold
		
		
		
		```
		public [RoutingSettings](RoutingSettings.html "class in akka.http.javadsl.settings") withRangeCoalescingThreshold​(long rangeCoalescingThreshold)
		```
		- #### withDecodeMaxBytesPerChunk
		
		
		
		```
		public [RoutingSettings](RoutingSettings.html "class in akka.http.javadsl.settings") withDecodeMaxBytesPerChunk​(int decodeMaxBytesPerChunk)
		```
		- #### withDecodeMaxSize
		
		
		
		```
		public [RoutingSettings](RoutingSettings.html "class in akka.http.javadsl.settings") withDecodeMaxSize​(long decodeMaxSize)
		```
		- #### withFileIODispatcher
		
		
		
		```
		public [RoutingSettings](RoutingSettings.html "class in akka.http.javadsl.settings") withFileIODispatcher​(java.lang.String fileIODispatcher)
		```
		
		Deprecated.
		binary compatibility method. Use \`akka.stream.materializer.blocking\-io\-dispatcher\` to configure the dispatcher. Since 10\.1\.6\.

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/settings/RoutingSettings.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/settings/package-summary.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/settings/RoutingSettings.html

---
*Source: [https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/settings/RoutingSettings.html](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/settings/RoutingSettings.html)*