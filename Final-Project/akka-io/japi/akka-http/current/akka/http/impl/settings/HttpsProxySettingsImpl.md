---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T23:34:21Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/impl/settings/HttpsProxySettingsImpl.html
title: HttpsProxySettingsImpl
---

# HttpsProxySettingsImpl

## Content

Package [akka.http.impl.settings](package-summary.html)
## Class HttpsProxySettingsImpl

- java.lang.Object
- - [akka.http.javadsl.settings.HttpsProxySettings](../../javadsl/settings/HttpsProxySettings.html "class in akka.http.javadsl.settings")
	- - [akka.http.scaladsl.settings.HttpsProxySettings](../../scaladsl/settings/HttpsProxySettings.html "class in akka.http.scaladsl.settings")
		- - akka.http.impl.settings.HttpsProxySettingsImpl

- All Implemented Interfaces:
`java.io.Serializable`, `scala.Equals`, `scala.Product`

---

```
public final class HttpsProxySettingsImpl
extends [HttpsProxySettings](../../scaladsl/settings/HttpsProxySettings.html "class in akka.http.scaladsl.settings")
implements scala.Product, java.io.Serializable
```

INTERNAL API

See Also:
[Serialized Form](../../../../serialized-form.html#akka.http.impl.settings.HttpsProxySettingsImpl)

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[HttpsProxySettingsImpl](#%3Cinit%3E(java.lang.String,int))​(java.lang.String host,  int port)` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `static T` | `[apply](#apply(akka.actor.ActorSystem))​(akka.actor.ActorSystem system)` |  |
	| `static T` | `[apply](#apply(com.typesafe.config.Config))​(com.typesafe.config.Config config)` |  |
	| `static T` | `[apply](#apply(java.lang.String))​(java.lang.String configOverrides)` |  |
	| `static [HttpsProxySettingsImpl](HttpsProxySettingsImpl.html "class in akka.http.impl.settings")` | `[fromSubConfig](#fromSubConfig(com.typesafe.config.Config,com.typesafe.config.Config))​(com.typesafe.config.Config root,  com.typesafe.config.Config c)` |  |
	| `java.lang.String` | `[host](#host())()` |  |
	| `int` | `[port](#port())()` |  |
	| `protected static java.lang.String` | `[prefix](#prefix())()` |  |
	| `java.lang.String` | `[productPrefix](#productPrefix())()` |  |
	
	
		- ### Methods inherited from class akka.http.javadsl.settings.[HttpsProxySettings](../../javadsl/settings/HttpsProxySettings.html "class in akka.http.javadsl.settings")
		
		
		`[create](../../javadsl/settings/HttpsProxySettings.html#create(akka.actor.ActorSystem)), [create](../../javadsl/settings/HttpsProxySettings.html#create(com.typesafe.config.Config)), [create](../../javadsl/settings/HttpsProxySettings.html#create(java.lang.String)), [getHost](../../javadsl/settings/HttpsProxySettings.html#getHost()), [getPort](../../javadsl/settings/HttpsProxySettings.html#getPort())`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`
		- ### Methods inherited from interface scala.Equals
		
		
		`canEqual, equals`
		- ### Methods inherited from interface scala.Product
		
		
		`productArity, productElement, productElementName, productElementNames, productIterator`

- - ### Constructor Detail
	
	
	
		- #### HttpsProxySettingsImpl
		
		
		
		```
		public HttpsProxySettingsImpl​(java.lang.String host,
		                              int port)
		```

	- ### Method Detail
	
	
	
		- #### fromSubConfig
		
		
		
		```
		public static [HttpsProxySettingsImpl](HttpsProxySettingsImpl.html "class in akka.http.impl.settings") fromSubConfig​(com.typesafe.config.Config root,
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
		- #### host
		
		
		
		```
		public java.lang.String host()
		```
		
		
		Specified by:
		`[host](../../scaladsl/settings/HttpsProxySettings.html#host())` in class `[HttpsProxySettings](../../scaladsl/settings/HttpsProxySettings.html "class in akka.http.scaladsl.settings")`
		- #### port
		
		
		
		```
		public int port()
		```
		
		
		Specified by:
		`[port](../../scaladsl/settings/HttpsProxySettings.html#port())` in class `[HttpsProxySettings](../../scaladsl/settings/HttpsProxySettings.html "class in akka.http.scaladsl.settings")`
		- #### productPrefix
		
		
		
		```
		public java.lang.String productPrefix()
		```
		
		
		Specified by:
		`productPrefix` in interface `scala.Product`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/impl/settings/HttpsProxySettingsImpl.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/settings/package-summary.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/settings/HttpsProxySettings.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/settings/HttpsProxySettings.html
- https://doc.akka.io/japi/akka-http/current/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/impl/settings/HttpsProxySettingsImpl.html](https://doc.akka.io/japi/akka-http/current/akka/http/impl/settings/HttpsProxySettingsImpl.html)*