---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T23:34:23Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/impl/settings/PreviewServerSettingsImpl.html
title: PreviewServerSettingsImpl
---

# PreviewServerSettingsImpl

## Content

Package [akka.http.impl.settings](package-summary.html)
## Class PreviewServerSettingsImpl

- java.lang.Object
- - [akka.http.javadsl.settings.PreviewServerSettings](../../javadsl/settings/PreviewServerSettings.html "class in akka.http.javadsl.settings")
	- - [akka.http.scaladsl.settings.PreviewServerSettings](../../scaladsl/settings/PreviewServerSettings.html "class in akka.http.scaladsl.settings")
		- - akka.http.impl.settings.PreviewServerSettingsImpl

- All Implemented Interfaces:
`java.io.Serializable`, `scala.Equals`, `scala.Product`

---

```
public final class PreviewServerSettingsImpl
extends [PreviewServerSettings](../../scaladsl/settings/PreviewServerSettings.html "class in akka.http.scaladsl.settings")
implements scala.Product, java.io.Serializable
```

See Also:
[Serialized Form](../../../../serialized-form.html#akka.http.impl.settings.PreviewServerSettingsImpl)

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[PreviewServerSettingsImpl](#%3Cinit%3E(boolean))​(boolean enableHttp2)` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `static T` | `[apply](#apply(akka.actor.ActorSystem))​(akka.actor.ActorSystem system)` |  |
	| `static T` | `[apply](#apply(com.typesafe.config.Config))​(com.typesafe.config.Config config)` |  |
	| `static T` | `[apply](#apply(java.lang.String))​(java.lang.String configOverrides)` |  |
	| `boolean` | `[enableHttp2](#enableHttp2())()` | Configures the Http extension to bind using HTTP/2 if given an  [`HttpsConnectionContext`](../../scaladsl/HttpsConnectionContext.html "class in akka.http.scaladsl"). |
	| `static [PreviewServerSettingsImpl](PreviewServerSettingsImpl.html "class in akka.http.impl.settings")` | `[fromSubConfig](#fromSubConfig(com.typesafe.config.Config,com.typesafe.config.Config))​(com.typesafe.config.Config root,  com.typesafe.config.Config c)` |  |
	| `protected static java.lang.String` | `[prefix](#prefix())()` |  |
	| `java.lang.String` | `[productPrefix](#productPrefix())()` |  |
	
	
		- ### Methods inherited from class akka.http.scaladsl.settings.[PreviewServerSettings](../../scaladsl/settings/PreviewServerSettings.html "class in akka.http.scaladsl.settings")
		
		
		`[withEnableHttp2](../../scaladsl/settings/PreviewServerSettings.html#withEnableHttp2(boolean))`
		- ### Methods inherited from class akka.http.javadsl.settings.[PreviewServerSettings](../../javadsl/settings/PreviewServerSettings.html "class in akka.http.javadsl.settings")
		
		
		`[create](../../javadsl/settings/PreviewServerSettings.html#create(akka.actor.ActorSystem)), [create](../../javadsl/settings/PreviewServerSettings.html#create(com.typesafe.config.Config)), [create](../../javadsl/settings/PreviewServerSettings.html#create(java.lang.String))`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`
		- ### Methods inherited from interface scala.Equals
		
		
		`canEqual, equals`
		- ### Methods inherited from interface scala.Product
		
		
		`productArity, productElement, productElementName, productElementNames, productIterator`

- - ### Constructor Detail
	
	
	
		- #### PreviewServerSettingsImpl
		
		
		
		```
		public PreviewServerSettingsImpl​(boolean enableHttp2)
		```

	- ### Method Detail
	
	
	
		- #### fromSubConfig
		
		
		
		```
		public static [PreviewServerSettingsImpl](PreviewServerSettingsImpl.html "class in akka.http.impl.settings") fromSubConfig​(com.typesafe.config.Config root,
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
		- #### enableHttp2
		
		
		
		```
		public boolean enableHttp2()
		```
		
		Description copied from class: `[PreviewServerSettings](../../javadsl/settings/PreviewServerSettings.html#enableHttp2())`
		Configures the Http extension to bind using HTTP/2 if given an
		 [`HttpsConnectionContext`](../../scaladsl/HttpsConnectionContext.html "class in akka.http.scaladsl"). Otherwise binds as plain HTTP.
		
		Specified by:
		`[enableHttp2](../../scaladsl/settings/PreviewServerSettings.html#enableHttp2())` in class `[PreviewServerSettings](../../scaladsl/settings/PreviewServerSettings.html "class in akka.http.scaladsl.settings")`
		Returns:
		(undocumented)
		- #### productPrefix
		
		
		
		```
		public java.lang.String productPrefix()
		```
		
		
		Specified by:
		`productPrefix` in interface `scala.Product`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/impl/settings/PreviewServerSettingsImpl.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/settings/package-summary.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/settings/PreviewServerSettings.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/HttpsConnectionContext.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/settings/PreviewServerSettings.html
- https://doc.akka.io/japi/akka-http/current/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/impl/settings/PreviewServerSettingsImpl.html](https://doc.akka.io/japi/akka-http/current/akka/http/impl/settings/PreviewServerSettingsImpl.html)*