---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T23:34:26Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/impl/settings/ServerSentEventSettingsImpl.html
title: ServerSentEventSettingsImpl
---

# ServerSentEventSettingsImpl

## Content

Package [akka.http.impl.settings](package-summary.html)
## Class ServerSentEventSettingsImpl

- java.lang.Object
- - [akka.http.javadsl.settings.ServerSentEventSettings](../../javadsl/settings/ServerSentEventSettings.html "class in akka.http.javadsl.settings")
	- - [akka.http.scaladsl.settings.ServerSentEventSettings](../../scaladsl/settings/ServerSentEventSettings.html "class in akka.http.scaladsl.settings")
		- - akka.http.impl.settings.ServerSentEventSettingsImpl

- All Implemented Interfaces:
`java.io.Serializable`, `scala.Equals`, `scala.Product`

---

```
public final class ServerSentEventSettingsImpl
extends [ServerSentEventSettings](../../scaladsl/settings/ServerSentEventSettings.html "class in akka.http.scaladsl.settings")
implements scala.Product, java.io.Serializable
```

See Also:
[Serialized Form](../../../../serialized-form.html#akka.http.impl.settings.ServerSentEventSettingsImpl)

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[ServerSentEventSettingsImpl](#%3Cinit%3E(int,int,boolean))​(int maxEventSize,  int maxLineSize,  boolean emitEmptyEvents)` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `static T` | `[apply](#apply(akka.actor.ActorSystem))​(akka.actor.ActorSystem system)` |  |
	| `static T` | `[apply](#apply(com.typesafe.config.Config))​(com.typesafe.config.Config config)` |  |
	| `static T` | `[apply](#apply(java.lang.String))​(java.lang.String configOverrides)` |  |
	| `boolean` | `[emitEmptyEvents](#emitEmptyEvents())()` | Should events with empty data field be passed to the application. |
	| `static [ServerSentEventSettingsImpl](ServerSentEventSettingsImpl.html "class in akka.http.impl.settings")` | `[fromSubConfig](#fromSubConfig(com.typesafe.config.Config,com.typesafe.config.Config))​(com.typesafe.config.Config root,  com.typesafe.config.Config c)` |  |
	| `int` | `[maxEventSize](#maxEventSize())()` | The maximum size for parsing server\-sent events |
	| `int` | `[maxLineSize](#maxLineSize())()` | The maximum size for parsing lines of a server\-sent event |
	| `protected static java.lang.String` | `[prefix](#prefix())()` |  |
	| `java.lang.String` | `[productPrefix](#productPrefix())()` |  |
	
	
		- ### Methods inherited from class akka.http.scaladsl.settings.[ServerSentEventSettings](../../scaladsl/settings/ServerSentEventSettings.html "class in akka.http.scaladsl.settings")
		
		
		`[withEmitEmptyEvents](../../scaladsl/settings/ServerSentEventSettings.html#withEmitEmptyEvents(boolean)), [withLineLength](../../scaladsl/settings/ServerSentEventSettings.html#withLineLength(int)), [withMaxEventSize](../../scaladsl/settings/ServerSentEventSettings.html#withMaxEventSize(int))`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`
		- ### Methods inherited from interface scala.Equals
		
		
		`canEqual, equals`
		- ### Methods inherited from interface scala.Product
		
		
		`productArity, productElement, productElementName, productElementNames, productIterator`

- - ### Constructor Detail
	
	
	
		- #### ServerSentEventSettingsImpl
		
		
		
		```
		public ServerSentEventSettingsImpl​(int maxEventSize,
		                                   int maxLineSize,
		                                   boolean emitEmptyEvents)
		```

	- ### Method Detail
	
	
	
		- #### fromSubConfig
		
		
		
		```
		public static [ServerSentEventSettingsImpl](ServerSentEventSettingsImpl.html "class in akka.http.impl.settings") fromSubConfig​(com.typesafe.config.Config root,
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
		- #### maxEventSize
		
		
		
		```
		public int maxEventSize()
		```
		
		Description copied from class: `[ServerSentEventSettings](../../javadsl/settings/ServerSentEventSettings.html#maxEventSize())`
		The maximum size for parsing server\-sent events
		
		Specified by:
		`[maxEventSize](../../scaladsl/settings/ServerSentEventSettings.html#maxEventSize())` in class `[ServerSentEventSettings](../../scaladsl/settings/ServerSentEventSettings.html "class in akka.http.scaladsl.settings")`
		Returns:
		(undocumented)
		- #### maxLineSize
		
		
		
		```
		public int maxLineSize()
		```
		
		Description copied from class: `[ServerSentEventSettings](../../javadsl/settings/ServerSentEventSettings.html#maxLineSize())`
		The maximum size for parsing lines of a server\-sent event
		
		Specified by:
		`[maxLineSize](../../scaladsl/settings/ServerSentEventSettings.html#maxLineSize())` in class `[ServerSentEventSettings](../../scaladsl/settings/ServerSentEventSettings.html "class in akka.http.scaladsl.settings")`
		Returns:
		(undocumented)
		- #### emitEmptyEvents
		
		
		
		```
		public boolean emitEmptyEvents()
		```
		
		Description copied from class: `[ServerSentEventSettings](../../javadsl/settings/ServerSentEventSettings.html#emitEmptyEvents())`
		Should events with empty data field be passed to the application.
		
		Specified by:
		`[emitEmptyEvents](../../javadsl/settings/ServerSentEventSettings.html#emitEmptyEvents())` in class `[ServerSentEventSettings](../../javadsl/settings/ServerSentEventSettings.html "class in akka.http.javadsl.settings")`
		Returns:
		(undocumented)
		- #### productPrefix
		
		
		
		```
		public java.lang.String productPrefix()
		```
		
		
		Specified by:
		`productPrefix` in interface `scala.Product`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/impl/settings/ServerSentEventSettingsImpl.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/settings/package-summary.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/settings/ServerSentEventSettings.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/settings/ServerSentEventSettings.html
- https://doc.akka.io/japi/akka-http/current/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/impl/settings/ServerSentEventSettingsImpl.html](https://doc.akka.io/japi/akka-http/current/akka/http/impl/settings/ServerSentEventSettingsImpl.html)*