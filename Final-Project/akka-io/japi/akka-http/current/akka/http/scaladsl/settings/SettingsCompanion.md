---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T00:41:29Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/settings/SettingsCompanion.html
title: SettingsCompanion
---

# SettingsCompanion

## Content

Package [akka.http.scaladsl.settings](package-summary.html)
## Interface SettingsCompanion\<T\>

- All Known Implementing Classes:
`[CachingSettings$](../../caching/scaladsl/CachingSettings$.html "class in akka.http.caching.scaladsl")`, `[ClientConnectionSettings$](ClientConnectionSettings$.html "class in akka.http.scaladsl.settings")`, `[ConnectionPoolSettings$](ConnectionPoolSettings$.html "class in akka.http.scaladsl.settings")`, `[Http2ClientSettings$](Http2ClientSettings$.html "class in akka.http.scaladsl.settings")`, `[Http2ServerSettings$](Http2ServerSettings$.html "class in akka.http.scaladsl.settings")`, `[HttpsProxySettings$](HttpsProxySettings$.html "class in akka.http.scaladsl.settings")`, `[LfuCacheSettings$](../../caching/scaladsl/LfuCacheSettings$.html "class in akka.http.caching.scaladsl")`, `[ParserSettings$](ParserSettings$.html "class in akka.http.scaladsl.settings")`, `[PreviewServerSettings$](PreviewServerSettings$.html "class in akka.http.scaladsl.settings")`, `[RoutingSettings$](RoutingSettings$.html "class in akka.http.scaladsl.settings")`, `[ServerSentEventSettings$](ServerSentEventSettings$.html "class in akka.http.scaladsl.settings")`, `[ServerSettings$](ServerSettings$.html "class in akka.http.scaladsl.settings")`

---

```
public interface SettingsCompanion<T>
```

INTERNAL API

- - ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `[T](SettingsCompanion.html "type parameter in SettingsCompanion")` | `[apply](#apply(akka.actor.ActorSystem))​(akka.actor.ActorSystem system)` | Creates an instance of settings using the configuration provided by the given ActorSystem. |
	| `[T](SettingsCompanion.html "type parameter in SettingsCompanion")` | `[apply](#apply(akka.actor.ClassicActorSystemProvider))​(akka.actor.ClassicActorSystemProvider system)` |  |
	| `[T](SettingsCompanion.html "type parameter in SettingsCompanion")` | `[apply](#apply(com.typesafe.config.Config))​(com.typesafe.config.Config config)` | Creates an instance of settings using the given Config. |
	| `[T](SettingsCompanion.html "type parameter in SettingsCompanion")` | `[apply](#apply(java.lang.String))​(java.lang.String configOverrides)` | Create an instance of settings using the given String of config overrides to override  settings set in the class loader of this class (i.e. by application.conf or reference.conf files in  the class loader of this class). |

- - ### Method Detail
	
	
	
		- #### apply
		
		
		
		```
		[T](SettingsCompanion.html "type parameter in SettingsCompanion") apply​(akka.actor.ActorSystem system)
		```
		
		Creates an instance of settings using the configuration provided by the given ActorSystem.
		
		Parameters:
		`system` \- (undocumented)
		Returns:
		(undocumented)
		- #### apply
		
		
		
		```
		[T](SettingsCompanion.html "type parameter in SettingsCompanion") apply​(akka.actor.ClassicActorSystemProvider system)
		```
		- #### apply
		
		
		
		```
		[T](SettingsCompanion.html "type parameter in SettingsCompanion") apply​(com.typesafe.config.Config config)
		```
		
		Creates an instance of settings using the given Config.
		
		Parameters:
		`config` \- (undocumented)
		Returns:
		(undocumented)
		- #### apply
		
		
		
		```
		[T](SettingsCompanion.html "type parameter in SettingsCompanion") apply​(java.lang.String configOverrides)
		```
		
		Create an instance of settings using the given String of config overrides to override
		 settings set in the class loader of this class (i.e. by application.conf or reference.conf files in
		 the class loader of this class).
		
		Parameters:
		`configOverrides` \- (undocumented)
		Returns:
		(undocumented)

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/caching/scaladsl/CachingSettings$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/caching/scaladsl/LfuCacheSettings$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/settings/ClientConnectionSettings$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/settings/ConnectionPoolSettings$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/settings/Http2ClientSettings$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/settings/Http2ServerSettings$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/settings/HttpsProxySettings$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/settings/ParserSettings$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/settings/PreviewServerSettings$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/settings/RoutingSettings$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/settings/ServerSentEventSettings$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/settings/ServerSettings$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/settings/SettingsCompanion.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/settings/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/settings/SettingsCompanion.html](https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/settings/SettingsCompanion.html)*