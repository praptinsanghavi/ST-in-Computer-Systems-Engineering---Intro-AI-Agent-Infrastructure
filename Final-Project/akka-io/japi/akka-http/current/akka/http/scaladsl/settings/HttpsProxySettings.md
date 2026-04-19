---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T00:41:41Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/settings/HttpsProxySettings.html
title: HttpsProxySettings
---

# HttpsProxySettings

## Content

Package [akka.http.scaladsl.settings](package-summary.html)
## Class HttpsProxySettings

- java.lang.Object
- - [akka.http.javadsl.settings.HttpsProxySettings](../../javadsl/settings/HttpsProxySettings.html "class in akka.http.javadsl.settings")
	- - akka.http.scaladsl.settings.HttpsProxySettings

- Direct Known Subclasses:
`[HttpsProxySettingsImpl](../../impl/settings/HttpsProxySettingsImpl.html "class in akka.http.impl.settings")`

---

```
public abstract class HttpsProxySettings
extends [HttpsProxySettings](../../javadsl/settings/HttpsProxySettings.html "class in akka.http.javadsl.settings")
```

Public API but not intended for subclassing

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[HttpsProxySettings](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `static [HttpsProxySettings](HttpsProxySettings.html "class in akka.http.scaladsl.settings")` | `[apply](#apply(com.typesafe.config.Config))​(com.typesafe.config.Config config)` |  |
	| `static [HttpsProxySettings](HttpsProxySettings.html "class in akka.http.scaladsl.settings")` | `[apply](#apply(java.lang.String))​(java.lang.String configOverrides)` |  |
	| `abstract java.lang.String` | `[host](#host())()` |  |
	| `abstract int` | `[port](#port())()` |  |
	
	
		- ### Methods inherited from class akka.http.javadsl.settings.[HttpsProxySettings](../../javadsl/settings/HttpsProxySettings.html "class in akka.http.javadsl.settings")
		
		
		`[create](../../javadsl/settings/HttpsProxySettings.html#create(akka.actor.ActorSystem)), [create](../../javadsl/settings/HttpsProxySettings.html#create(com.typesafe.config.Config)), [create](../../javadsl/settings/HttpsProxySettings.html#create(java.lang.String)), [getHost](../../javadsl/settings/HttpsProxySettings.html#getHost()), [getPort](../../javadsl/settings/HttpsProxySettings.html#getPort())`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### HttpsProxySettings
		
		
		
		```
		public HttpsProxySettings()
		```

	- ### Method Detail
	
	
	
		- #### apply
		
		
		
		```
		public static [HttpsProxySettings](HttpsProxySettings.html "class in akka.http.scaladsl.settings") apply​(com.typesafe.config.Config config)
		```
		- #### apply
		
		
		
		```
		public static [HttpsProxySettings](HttpsProxySettings.html "class in akka.http.scaladsl.settings") apply​(java.lang.String configOverrides)
		```
		- #### host
		
		
		
		```
		public abstract java.lang.String host()
		```
		- #### port
		
		
		
		```
		public abstract int port()
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/impl/settings/HttpsProxySettingsImpl.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/settings/HttpsProxySettings.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/settings/HttpsProxySettings.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/settings/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/settings/HttpsProxySettings.html](https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/settings/HttpsProxySettings.html)*