---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T23:34:25Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/impl/settings/RoutingSettingsImpl.html
title: RoutingSettingsImpl
---

# RoutingSettingsImpl

## Content

Package [akka.http.impl.settings](package-summary.html)
## Class RoutingSettingsImpl

- java.lang.Object
- - [akka.http.javadsl.settings.RoutingSettings](../../javadsl/settings/RoutingSettings.html "class in akka.http.javadsl.settings")
	- - [akka.http.scaladsl.settings.RoutingSettings](../../scaladsl/settings/RoutingSettings.html "class in akka.http.scaladsl.settings")
		- - akka.http.impl.settings.RoutingSettingsImpl

- All Implemented Interfaces:
`java.io.Serializable`, `scala.Equals`, `scala.Product`

---

```
public final class RoutingSettingsImpl
extends [RoutingSettings](../../scaladsl/settings/RoutingSettings.html "class in akka.http.scaladsl.settings")
implements scala.Product, java.io.Serializable
```

INTERNAL API

See Also:
[Serialized Form](../../../../serialized-form.html#akka.http.impl.settings.RoutingSettingsImpl)

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[RoutingSettingsImpl](#%3Cinit%3E(boolean,boolean,boolean,int,long,int,long))​(boolean verboseErrorMessages,  boolean fileGetConditional,  boolean renderVanityFooter,  int rangeCountLimit,  long rangeCoalescingThreshold,  int decodeMaxBytesPerChunk,  long decodeMaxSize)` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) [Deprecated Methods](javascript:show(32);) 
	| Modifier and Type | Method | Description |
	| `static T` | `[apply](#apply(akka.actor.ActorSystem))​(akka.actor.ActorSystem system)` |  |
	| `static T` | `[apply](#apply(com.typesafe.config.Config))​(com.typesafe.config.Config config)` |  |
	| `static T` | `[apply](#apply(java.lang.String))​(java.lang.String configOverrides)` |  |
	| `int` | `[decodeMaxBytesPerChunk](#decodeMaxBytesPerChunk())()` |  |
	| `long` | `[decodeMaxSize](#decodeMaxSize())()` |  |
	| `boolean` | `[fileGetConditional](#fileGetConditional())()` |  |
	| `java.lang.String` | `[fileIODispatcher](#fileIODispatcher())()` | Deprecated. binary compatibility method. |
	| `static [RoutingSettingsImpl](RoutingSettingsImpl.html "class in akka.http.impl.settings")` | `[fromSubConfig](#fromSubConfig(com.typesafe.config.Config,com.typesafe.config.Config))​(com.typesafe.config.Config root,  com.typesafe.config.Config c)` |  |
	| `protected static java.lang.String` | `[prefix](#prefix())()` |  |
	| `java.lang.String` | `[productPrefix](#productPrefix())()` |  |
	| `long` | `[rangeCoalescingThreshold](#rangeCoalescingThreshold())()` |  |
	| `int` | `[rangeCountLimit](#rangeCountLimit())()` |  |
	| `boolean` | `[renderVanityFooter](#renderVanityFooter())()` |  |
	| `boolean` | `[verboseErrorMessages](#verboseErrorMessages())()` |  |
	
	
		- ### Methods inherited from class akka.http.scaladsl.settings.[RoutingSettings](../../scaladsl/settings/RoutingSettings.html "class in akka.http.scaladsl.settings")
		
		
		`[getDecodeMaxBytesPerChunk](../../scaladsl/settings/RoutingSettings.html#getDecodeMaxBytesPerChunk()), [getDecodeMaxSize](../../scaladsl/settings/RoutingSettings.html#getDecodeMaxSize()), [getFileGetConditional](../../scaladsl/settings/RoutingSettings.html#getFileGetConditional()), [getFileIODispatcher](../../scaladsl/settings/RoutingSettings.html#getFileIODispatcher()), [getRangeCoalescingThreshold](../../scaladsl/settings/RoutingSettings.html#getRangeCoalescingThreshold()), [getRangeCountLimit](../../scaladsl/settings/RoutingSettings.html#getRangeCountLimit()), [getRenderVanityFooter](../../scaladsl/settings/RoutingSettings.html#getRenderVanityFooter()), [getVerboseErrorMessages](../../scaladsl/settings/RoutingSettings.html#getVerboseErrorMessages()), [withDecodeMaxBytesPerChunk](../../scaladsl/settings/RoutingSettings.html#withDecodeMaxBytesPerChunk(int)), [withDecodeMaxSize](../../scaladsl/settings/RoutingSettings.html#withDecodeMaxSize(long)), [withFileGetConditional](../../scaladsl/settings/RoutingSettings.html#withFileGetConditional(boolean)), [withFileIODispatcher](../../scaladsl/settings/RoutingSettings.html#withFileIODispatcher(java.lang.String)), [withRangeCoalescingThreshold](../../scaladsl/settings/RoutingSettings.html#withRangeCoalescingThreshold(long)), [withRangeCountLimit](../../scaladsl/settings/RoutingSettings.html#withRangeCountLimit(int)), [withRenderVanityFooter](../../scaladsl/settings/RoutingSettings.html#withRenderVanityFooter(boolean)), [withVerboseErrorMessages](../../scaladsl/settings/RoutingSettings.html#withVerboseErrorMessages(boolean))`
		- ### Methods inherited from class akka.http.javadsl.settings.[RoutingSettings](../../javadsl/settings/RoutingSettings.html "class in akka.http.javadsl.settings")
		
		
		`[create](../../javadsl/settings/RoutingSettings.html#create(akka.actor.ActorSystem)), [create](../../javadsl/settings/RoutingSettings.html#create(com.typesafe.config.Config)), [create](../../javadsl/settings/RoutingSettings.html#create(java.lang.String))`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`
		- ### Methods inherited from interface scala.Equals
		
		
		`canEqual, equals`
		- ### Methods inherited from interface scala.Product
		
		
		`productArity, productElement, productElementName, productElementNames, productIterator`

- - ### Constructor Detail
	
	
	
		- #### RoutingSettingsImpl
		
		
		
		```
		public RoutingSettingsImpl​(boolean verboseErrorMessages,
		                           boolean fileGetConditional,
		                           boolean renderVanityFooter,
		                           int rangeCountLimit,
		                           long rangeCoalescingThreshold,
		                           int decodeMaxBytesPerChunk,
		                           long decodeMaxSize)
		```

	- ### Method Detail
	
	
	
		- #### fromSubConfig
		
		
		
		```
		public static [RoutingSettingsImpl](RoutingSettingsImpl.html "class in akka.http.impl.settings") fromSubConfig​(com.typesafe.config.Config root,
		                                                com.typesafe.config.Config c)
		```
		- #### prefix
		
		
		
		```
		protected static java.lang.String prefix()
		```
		- #### apply
		
		
		
		```
		public static T apply​(akka.actor.ActorSystem system)
		```
		- #### apply
		
		
		
		```
		public static T apply​(java.lang.String configOverrides)
		```
		- #### apply
		
		
		
		```
		public static T apply​(com.typesafe.config.Config config)
		```
		- #### verboseErrorMessages
		
		
		
		```
		public boolean verboseErrorMessages()
		```
		
		
		Specified by:
		`[verboseErrorMessages](../../scaladsl/settings/RoutingSettings.html#verboseErrorMessages())` in class `[RoutingSettings](../../scaladsl/settings/RoutingSettings.html "class in akka.http.scaladsl.settings")`
		- #### fileGetConditional
		
		
		
		```
		public boolean fileGetConditional()
		```
		
		
		Specified by:
		`[fileGetConditional](../../scaladsl/settings/RoutingSettings.html#fileGetConditional())` in class `[RoutingSettings](../../scaladsl/settings/RoutingSettings.html "class in akka.http.scaladsl.settings")`
		- #### renderVanityFooter
		
		
		
		```
		public boolean renderVanityFooter()
		```
		
		
		Specified by:
		`[renderVanityFooter](../../scaladsl/settings/RoutingSettings.html#renderVanityFooter())` in class `[RoutingSettings](../../scaladsl/settings/RoutingSettings.html "class in akka.http.scaladsl.settings")`
		- #### rangeCountLimit
		
		
		
		```
		public int rangeCountLimit()
		```
		
		
		Specified by:
		`[rangeCountLimit](../../scaladsl/settings/RoutingSettings.html#rangeCountLimit())` in class `[RoutingSettings](../../scaladsl/settings/RoutingSettings.html "class in akka.http.scaladsl.settings")`
		- #### rangeCoalescingThreshold
		
		
		
		```
		public long rangeCoalescingThreshold()
		```
		
		
		Specified by:
		`[rangeCoalescingThreshold](../../scaladsl/settings/RoutingSettings.html#rangeCoalescingThreshold())` in class `[RoutingSettings](../../scaladsl/settings/RoutingSettings.html "class in akka.http.scaladsl.settings")`
		- #### decodeMaxBytesPerChunk
		
		
		
		```
		public int decodeMaxBytesPerChunk()
		```
		
		
		Specified by:
		`[decodeMaxBytesPerChunk](../../scaladsl/settings/RoutingSettings.html#decodeMaxBytesPerChunk())` in class `[RoutingSettings](../../scaladsl/settings/RoutingSettings.html "class in akka.http.scaladsl.settings")`
		- #### decodeMaxSize
		
		
		
		```
		public long decodeMaxSize()
		```
		
		
		Specified by:
		`[decodeMaxSize](../../scaladsl/settings/RoutingSettings.html#decodeMaxSize())` in class `[RoutingSettings](../../scaladsl/settings/RoutingSettings.html "class in akka.http.scaladsl.settings")`
		- #### fileIODispatcher
		
		
		
		```
		public java.lang.String fileIODispatcher()
		```
		
		Deprecated.
		binary compatibility method. Use \`akka.stream.materializer.blocking\-io\-dispatcher\` to configure the dispatcher. Since 10\.1\.6\.
		
		
		Specified by:
		`[fileIODispatcher](../../scaladsl/settings/RoutingSettings.html#fileIODispatcher())` in class `[RoutingSettings](../../scaladsl/settings/RoutingSettings.html "class in akka.http.scaladsl.settings")`
		- #### productPrefix
		
		
		
		```
		public java.lang.String productPrefix()
		```
		
		
		Specified by:
		`productPrefix` in interface `scala.Product`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/impl/settings/RoutingSettingsImpl.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/settings/package-summary.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/settings/RoutingSettings.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/settings/RoutingSettings.html
- https://doc.akka.io/japi/akka-http/current/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/impl/settings/RoutingSettingsImpl.html](https://doc.akka.io/japi/akka-http/current/akka/http/impl/settings/RoutingSettingsImpl.html)*