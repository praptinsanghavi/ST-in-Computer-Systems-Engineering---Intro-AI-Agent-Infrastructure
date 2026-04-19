---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T00:42:01Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/settings/RoutingSettings.html
title: RoutingSettings
---

# RoutingSettings

## Content

Package [akka.http.scaladsl.settings](package-summary.html)
## Class RoutingSettings

- java.lang.Object
- - [akka.http.javadsl.settings.RoutingSettings](../../javadsl/settings/RoutingSettings.html "class in akka.http.javadsl.settings")
	- - akka.http.scaladsl.settings.RoutingSettings

- Direct Known Subclasses:
`[RoutingSettingsImpl](../../impl/settings/RoutingSettingsImpl.html "class in akka.http.impl.settings")`

---

```
public abstract class RoutingSettings
extends [RoutingSettings](../../javadsl/settings/RoutingSettings.html "class in akka.http.javadsl.settings")
```

Public API but not intended for subclassing

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[RoutingSettings](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) [Concrete Methods](javascript:show(8);) [Deprecated Methods](javascript:show(32);) 
	| Modifier and Type | Method | Description |
	| `static [RoutingSettings](RoutingSettings.html "class in akka.http.scaladsl.settings")` | `[apply](#apply(com.typesafe.config.Config))​(com.typesafe.config.Config config)` |  |
	| `static [RoutingSettings](RoutingSettings.html "class in akka.http.scaladsl.settings")` | `[apply](#apply(java.lang.String))​(java.lang.String configOverrides)` |  |
	| `abstract int` | `[decodeMaxBytesPerChunk](#decodeMaxBytesPerChunk())()` |  |
	| `abstract long` | `[decodeMaxSize](#decodeMaxSize())()` |  |
	| `abstract boolean` | `[fileGetConditional](#fileGetConditional())()` |  |
	| `abstract java.lang.String` | `[fileIODispatcher](#fileIODispatcher())()` | Deprecated. binary compatibility method. |
	| `int` | `[getDecodeMaxBytesPerChunk](#getDecodeMaxBytesPerChunk())()` |  |
	| `long` | `[getDecodeMaxSize](#getDecodeMaxSize())()` |  |
	| `boolean` | `[getFileGetConditional](#getFileGetConditional())()` |  |
	| `java.lang.String` | `[getFileIODispatcher](#getFileIODispatcher())()` | Deprecated. binary compatibility method. |
	| `long` | `[getRangeCoalescingThreshold](#getRangeCoalescingThreshold())()` |  |
	| `int` | `[getRangeCountLimit](#getRangeCountLimit())()` |  |
	| `boolean` | `[getRenderVanityFooter](#getRenderVanityFooter())()` |  |
	| `boolean` | `[getVerboseErrorMessages](#getVerboseErrorMessages())()` |  |
	| `abstract long` | `[rangeCoalescingThreshold](#rangeCoalescingThreshold())()` |  |
	| `abstract int` | `[rangeCountLimit](#rangeCountLimit())()` |  |
	| `abstract boolean` | `[renderVanityFooter](#renderVanityFooter())()` |  |
	| `abstract boolean` | `[verboseErrorMessages](#verboseErrorMessages())()` |  |
	| `[RoutingSettings](RoutingSettings.html "class in akka.http.scaladsl.settings")` | `[withDecodeMaxBytesPerChunk](#withDecodeMaxBytesPerChunk(int))​(int decodeMaxBytesPerChunk)` |  |
	| `[RoutingSettings](RoutingSettings.html "class in akka.http.scaladsl.settings")` | `[withDecodeMaxSize](#withDecodeMaxSize(long))​(long decodeMaxSize)` |  |
	| `[RoutingSettings](RoutingSettings.html "class in akka.http.scaladsl.settings")` | `[withFileGetConditional](#withFileGetConditional(boolean))​(boolean fileGetConditional)` |  |
	| `[RoutingSettings](RoutingSettings.html "class in akka.http.scaladsl.settings")` | `[withFileIODispatcher](#withFileIODispatcher(java.lang.String))​(java.lang.String fileIODispatcher)` | Deprecated. binary compatibility method. |
	| `[RoutingSettings](RoutingSettings.html "class in akka.http.scaladsl.settings")` | `[withRangeCoalescingThreshold](#withRangeCoalescingThreshold(long))​(long rangeCoalescingThreshold)` |  |
	| `[RoutingSettings](RoutingSettings.html "class in akka.http.scaladsl.settings")` | `[withRangeCountLimit](#withRangeCountLimit(int))​(int rangeCountLimit)` |  |
	| `[RoutingSettings](RoutingSettings.html "class in akka.http.scaladsl.settings")` | `[withRenderVanityFooter](#withRenderVanityFooter(boolean))​(boolean renderVanityFooter)` |  |
	| `[RoutingSettings](RoutingSettings.html "class in akka.http.scaladsl.settings")` | `[withVerboseErrorMessages](#withVerboseErrorMessages(boolean))​(boolean verboseErrorMessages)` |  |
	
	
		- ### Methods inherited from class akka.http.javadsl.settings.[RoutingSettings](../../javadsl/settings/RoutingSettings.html "class in akka.http.javadsl.settings")
		
		
		`[create](../../javadsl/settings/RoutingSettings.html#create(akka.actor.ActorSystem)), [create](../../javadsl/settings/RoutingSettings.html#create(com.typesafe.config.Config)), [create](../../javadsl/settings/RoutingSettings.html#create(java.lang.String))`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### RoutingSettings
		
		
		
		```
		public RoutingSettings()
		```

	- ### Method Detail
	
	
	
		- #### apply
		
		
		
		```
		public static [RoutingSettings](RoutingSettings.html "class in akka.http.scaladsl.settings") apply​(com.typesafe.config.Config config)
		```
		- #### apply
		
		
		
		```
		public static [RoutingSettings](RoutingSettings.html "class in akka.http.scaladsl.settings") apply​(java.lang.String configOverrides)
		```
		- #### verboseErrorMessages
		
		
		
		```
		public abstract boolean verboseErrorMessages()
		```
		- #### fileGetConditional
		
		
		
		```
		public abstract boolean fileGetConditional()
		```
		- #### renderVanityFooter
		
		
		
		```
		public abstract boolean renderVanityFooter()
		```
		- #### rangeCountLimit
		
		
		
		```
		public abstract int rangeCountLimit()
		```
		- #### rangeCoalescingThreshold
		
		
		
		```
		public abstract long rangeCoalescingThreshold()
		```
		- #### decodeMaxBytesPerChunk
		
		
		
		```
		public abstract int decodeMaxBytesPerChunk()
		```
		- #### decodeMaxSize
		
		
		
		```
		public abstract long decodeMaxSize()
		```
		- #### fileIODispatcher
		
		
		
		```
		public abstract java.lang.String fileIODispatcher()
		```
		
		Deprecated.
		binary compatibility method. Use \`akka.stream.materializer.blocking\-io\-dispatcher\` to configure the dispatcher. Since 10\.1\.6\.
		- #### getVerboseErrorMessages
		
		
		
		```
		public boolean getVerboseErrorMessages()
		```
		
		
		Specified by:
		`[getVerboseErrorMessages](../../javadsl/settings/RoutingSettings.html#getVerboseErrorMessages())` in class `[RoutingSettings](../../javadsl/settings/RoutingSettings.html "class in akka.http.javadsl.settings")`
		- #### getFileGetConditional
		
		
		
		```
		public boolean getFileGetConditional()
		```
		
		
		Specified by:
		`[getFileGetConditional](../../javadsl/settings/RoutingSettings.html#getFileGetConditional())` in class `[RoutingSettings](../../javadsl/settings/RoutingSettings.html "class in akka.http.javadsl.settings")`
		- #### getRenderVanityFooter
		
		
		
		```
		public boolean getRenderVanityFooter()
		```
		
		
		Specified by:
		`[getRenderVanityFooter](../../javadsl/settings/RoutingSettings.html#getRenderVanityFooter())` in class `[RoutingSettings](../../javadsl/settings/RoutingSettings.html "class in akka.http.javadsl.settings")`
		- #### getRangeCountLimit
		
		
		
		```
		public int getRangeCountLimit()
		```
		
		
		Specified by:
		`[getRangeCountLimit](../../javadsl/settings/RoutingSettings.html#getRangeCountLimit())` in class `[RoutingSettings](../../javadsl/settings/RoutingSettings.html "class in akka.http.javadsl.settings")`
		- #### getRangeCoalescingThreshold
		
		
		
		```
		public long getRangeCoalescingThreshold()
		```
		
		
		Specified by:
		`[getRangeCoalescingThreshold](../../javadsl/settings/RoutingSettings.html#getRangeCoalescingThreshold())` in class `[RoutingSettings](../../javadsl/settings/RoutingSettings.html "class in akka.http.javadsl.settings")`
		- #### getDecodeMaxBytesPerChunk
		
		
		
		```
		public int getDecodeMaxBytesPerChunk()
		```
		
		
		Specified by:
		`[getDecodeMaxBytesPerChunk](../../javadsl/settings/RoutingSettings.html#getDecodeMaxBytesPerChunk())` in class `[RoutingSettings](../../javadsl/settings/RoutingSettings.html "class in akka.http.javadsl.settings")`
		- #### getDecodeMaxSize
		
		
		
		```
		public long getDecodeMaxSize()
		```
		- #### getFileIODispatcher
		
		
		
		```
		public java.lang.String getFileIODispatcher()
		```
		
		Deprecated.
		binary compatibility method. Use \`akka.stream.materializer.blocking\-io\-dispatcher\` to configure the dispatcher. Since 10\.1\.6\.
		
		
		Specified by:
		`[getFileIODispatcher](../../javadsl/settings/RoutingSettings.html#getFileIODispatcher())` in class `[RoutingSettings](../../javadsl/settings/RoutingSettings.html "class in akka.http.javadsl.settings")`
		- #### withVerboseErrorMessages
		
		
		
		```
		public [RoutingSettings](RoutingSettings.html "class in akka.http.scaladsl.settings") withVerboseErrorMessages​(boolean verboseErrorMessages)
		```
		
		
		Overrides:
		`[withVerboseErrorMessages](../../javadsl/settings/RoutingSettings.html#withVerboseErrorMessages(boolean))` in class `[RoutingSettings](../../javadsl/settings/RoutingSettings.html "class in akka.http.javadsl.settings")`
		- #### withFileGetConditional
		
		
		
		```
		public [RoutingSettings](RoutingSettings.html "class in akka.http.scaladsl.settings") withFileGetConditional​(boolean fileGetConditional)
		```
		
		
		Overrides:
		`[withFileGetConditional](../../javadsl/settings/RoutingSettings.html#withFileGetConditional(boolean))` in class `[RoutingSettings](../../javadsl/settings/RoutingSettings.html "class in akka.http.javadsl.settings")`
		- #### withRenderVanityFooter
		
		
		
		```
		public [RoutingSettings](RoutingSettings.html "class in akka.http.scaladsl.settings") withRenderVanityFooter​(boolean renderVanityFooter)
		```
		
		
		Overrides:
		`[withRenderVanityFooter](../../javadsl/settings/RoutingSettings.html#withRenderVanityFooter(boolean))` in class `[RoutingSettings](../../javadsl/settings/RoutingSettings.html "class in akka.http.javadsl.settings")`
		- #### withRangeCountLimit
		
		
		
		```
		public [RoutingSettings](RoutingSettings.html "class in akka.http.scaladsl.settings") withRangeCountLimit​(int rangeCountLimit)
		```
		
		
		Overrides:
		`[withRangeCountLimit](../../javadsl/settings/RoutingSettings.html#withRangeCountLimit(int))` in class `[RoutingSettings](../../javadsl/settings/RoutingSettings.html "class in akka.http.javadsl.settings")`
		- #### withRangeCoalescingThreshold
		
		
		
		```
		public [RoutingSettings](RoutingSettings.html "class in akka.http.scaladsl.settings") withRangeCoalescingThreshold​(long rangeCoalescingThreshold)
		```
		
		
		Overrides:
		`[withRangeCoalescingThreshold](../../javadsl/settings/RoutingSettings.html#withRangeCoalescingThreshold(long))` in class `[RoutingSettings](../../javadsl/settings/RoutingSettings.html "class in akka.http.javadsl.settings")`
		- #### withDecodeMaxBytesPerChunk
		
		
		
		```
		public [RoutingSettings](RoutingSettings.html "class in akka.http.scaladsl.settings") withDecodeMaxBytesPerChunk​(int decodeMaxBytesPerChunk)
		```
		
		
		Overrides:
		`[withDecodeMaxBytesPerChunk](../../javadsl/settings/RoutingSettings.html#withDecodeMaxBytesPerChunk(int))` in class `[RoutingSettings](../../javadsl/settings/RoutingSettings.html "class in akka.http.javadsl.settings")`
		- #### withDecodeMaxSize
		
		
		
		```
		public [RoutingSettings](RoutingSettings.html "class in akka.http.scaladsl.settings") withDecodeMaxSize​(long decodeMaxSize)
		```
		
		
		Overrides:
		`[withDecodeMaxSize](../../javadsl/settings/RoutingSettings.html#withDecodeMaxSize(long))` in class `[RoutingSettings](../../javadsl/settings/RoutingSettings.html "class in akka.http.javadsl.settings")`
		- #### withFileIODispatcher
		
		
		
		```
		public [RoutingSettings](RoutingSettings.html "class in akka.http.scaladsl.settings") withFileIODispatcher​(java.lang.String fileIODispatcher)
		```
		
		Deprecated.
		binary compatibility method. Use \`akka.stream.materializer.blocking\-io\-dispatcher\` to configure the dispatcher. Since 10\.1\.6\.
		
		
		Overrides:
		`[withFileIODispatcher](../../javadsl/settings/RoutingSettings.html#withFileIODispatcher(java.lang.String))` in class `[RoutingSettings](../../javadsl/settings/RoutingSettings.html "class in akka.http.javadsl.settings")`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/impl/settings/RoutingSettingsImpl.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/settings/RoutingSettings.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/settings/RoutingSettings.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/settings/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/settings/RoutingSettings.html](https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/settings/RoutingSettings.html)*