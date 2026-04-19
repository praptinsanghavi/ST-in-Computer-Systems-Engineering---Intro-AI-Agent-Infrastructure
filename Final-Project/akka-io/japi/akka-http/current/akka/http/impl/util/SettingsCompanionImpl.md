---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T23:44:16Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/impl/util/SettingsCompanionImpl.html
title: SettingsCompanionImpl
---

# SettingsCompanionImpl

## Content

Package [akka.http.impl.util](package-summary.html)
## Class SettingsCompanionImpl\<T\>

- java.lang.Object
- - akka.http.impl.util.SettingsCompanionImpl\<T\>

- Direct Known Subclasses:
`[CachingSettingsImpl$](../../caching/impl/settings/CachingSettingsImpl$.html "class in akka.http.caching.impl.settings")`, `[ClientConnectionSettingsImpl$](../settings/ClientConnectionSettingsImpl$.html "class in akka.http.impl.settings")`, `[ConnectionPoolSettingsImpl$](../settings/ConnectionPoolSettingsImpl$.html "class in akka.http.impl.settings")`, `[CorsSettingsImpl$](../settings/CorsSettingsImpl$.html "class in akka.http.impl.settings")`, `[Http2ClientSettings.Http2ClientSettingsImpl$](../../scaladsl/settings/Http2ClientSettings.Http2ClientSettingsImpl$.html "class in akka.http.scaladsl.settings")`, `[Http2ServerSettings.Http2ServerSettingsImpl$](../../scaladsl/settings/Http2ServerSettings.Http2ServerSettingsImpl$.html "class in akka.http.scaladsl.settings")`, `[HttpsProxySettingsImpl$](../settings/HttpsProxySettingsImpl$.html "class in akka.http.impl.settings")`, `[JwtSettingsImpl$](../../jwt/internal/JwtSettingsImpl$.html "class in akka.http.jwt.internal")`, `[LfuCachingSettingsImpl$](../../caching/impl/settings/LfuCachingSettingsImpl$.html "class in akka.http.caching.impl.settings")`, `[ParserSettingsImpl$](../settings/ParserSettingsImpl$.html "class in akka.http.impl.settings")`, `[PreviewServerSettingsImpl$](../settings/PreviewServerSettingsImpl$.html "class in akka.http.impl.settings")`, `[RoutingSettingsImpl$](../settings/RoutingSettingsImpl$.html "class in akka.http.impl.settings")`, `[ServerSentEventSettingsImpl$](../settings/ServerSentEventSettingsImpl$.html "class in akka.http.impl.settings")`, `[ServerSettingsImpl$](../settings/ServerSettingsImpl$.html "class in akka.http.impl.settings")`

---

```
public abstract class SettingsCompanionImpl<T>
extends java.lang.Object
```

INTERNAL API

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[SettingsCompanionImpl](#%3Cinit%3E(java.lang.String))​(java.lang.String prefix)` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[T](SettingsCompanionImpl.html "type parameter in SettingsCompanionImpl")` | `[apply](#apply(akka.actor.ActorSystem))​(akka.actor.ActorSystem system)` |  |
	| `[T](SettingsCompanionImpl.html "type parameter in SettingsCompanionImpl")` | `[apply](#apply(com.typesafe.config.Config))​(com.typesafe.config.Config config)` |  |
	| `[T](SettingsCompanionImpl.html "type parameter in SettingsCompanionImpl")` | `[apply](#apply(java.lang.String))​(java.lang.String configOverrides)` |  |
	| `static com.typesafe.config.Config` | `[configAdditions](#configAdditions())()` |  |
	| `abstract [T](SettingsCompanionImpl.html "type parameter in SettingsCompanionImpl")` | `[fromSubConfig](#fromSubConfig(com.typesafe.config.Config,com.typesafe.config.Config))​(com.typesafe.config.Config root,  com.typesafe.config.Config c)` |  |
	| `protected java.lang.String` | `[prefix](#prefix())()` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### SettingsCompanionImpl
		
		
		
		```
		public SettingsCompanionImpl​(java.lang.String prefix)
		```

	- ### Method Detail
	
	
	
		- #### configAdditions
		
		
		
		```
		public static com.typesafe.config.Config configAdditions()
		```
		- #### prefix
		
		
		
		```
		protected java.lang.String prefix()
		```
		- #### apply
		
		
		
		```
		public [T](SettingsCompanionImpl.html "type parameter in SettingsCompanionImpl") apply​(akka.actor.ActorSystem system)
		```
		- #### apply
		
		
		
		```
		public [T](SettingsCompanionImpl.html "type parameter in SettingsCompanionImpl") apply​(java.lang.String configOverrides)
		```
		- #### apply
		
		
		
		```
		public [T](SettingsCompanionImpl.html "type parameter in SettingsCompanionImpl") apply​(com.typesafe.config.Config config)
		```
		- #### fromSubConfig
		
		
		
		```
		public abstract [T](SettingsCompanionImpl.html "type parameter in SettingsCompanionImpl") fromSubConfig​(com.typesafe.config.Config root,
		                                com.typesafe.config.Config c)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/caching/impl/settings/CachingSettingsImpl$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/caching/impl/settings/LfuCachingSettingsImpl$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/settings/ClientConnectionSettingsImpl$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/settings/ConnectionPoolSettingsImpl$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/settings/CorsSettingsImpl$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/settings/HttpsProxySettingsImpl$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/settings/ParserSettingsImpl$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/settings/PreviewServerSettingsImpl$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/settings/RoutingSettingsImpl$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/settings/ServerSentEventSettingsImpl$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/settings/ServerSettingsImpl$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/util/SettingsCompanionImpl.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/util/package-summary.html
- https://doc.akka.io/japi/akka-http/current/akka/http/jwt/internal/JwtSettingsImpl$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/settings/Http2ClientSettings.Http2ClientSettingsImpl$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/settings/Http2ServerSettings.Http2ServerSettingsImpl$.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/impl/util/SettingsCompanionImpl.html](https://doc.akka.io/japi/akka-http/current/akka/http/impl/util/SettingsCompanionImpl.html)*