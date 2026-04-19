---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T23:48:12Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/settings/SettingsCompanion.html
title: SettingsCompanion
---

# SettingsCompanion

## Content

Package [akka.http.javadsl.settings](package-summary.html)
## Interface SettingsCompanion\<T\>

- All Known Implementing Classes:
`[CachingSettings$](../../caching/javadsl/CachingSettings$.html "class in akka.http.caching.javadsl")`, `[ClientConnectionSettings$](ClientConnectionSettings$.html "class in akka.http.javadsl.settings")`, `[ConnectionPoolSettings$](ConnectionPoolSettings$.html "class in akka.http.javadsl.settings")`, `[Http2ServerSettings$](Http2ServerSettings$.html "class in akka.http.javadsl.settings")`, `[HttpsProxySettings$](HttpsProxySettings$.html "class in akka.http.javadsl.settings")`, `[LfuCacheSettings$](../../caching/javadsl/LfuCacheSettings$.html "class in akka.http.caching.javadsl")`, `[ParserSettings$](ParserSettings$.html "class in akka.http.javadsl.settings")`, `[PreviewServerSettings$](PreviewServerSettings$.html "class in akka.http.javadsl.settings")`, `[RoutingSettings$](RoutingSettings$.html "class in akka.http.javadsl.settings")`, `[ServerSettings$](ServerSettings$.html "class in akka.http.javadsl.settings")`

---

```
public interface SettingsCompanion<T>
```

- - ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `[T](SettingsCompanion.html "type parameter in SettingsCompanion")` | `[create](#create(akka.actor.ActorSystem))​(akka.actor.ActorSystem system)` | WARNING: This MUST overridden in sub\-classes as otherwise won't be usable (return type) from Java. |
	| `[T](SettingsCompanion.html "type parameter in SettingsCompanion")` | `[create](#create(com.typesafe.config.Config))​(com.typesafe.config.Config config)` | Creates an instance of settings using the given Config. |
	| `[T](SettingsCompanion.html "type parameter in SettingsCompanion")` | `[create](#create(java.lang.String))​(java.lang.String configOverrides)` | Create an instance of settings using the given String of config overrides to override  settings set in the class loader of this class (i.e. by application.conf or reference.conf files in  the class loader of this class). |

- - ### Method Detail
	
	
	
		- #### create
		
		
		
		```
		[T](SettingsCompanion.html "type parameter in SettingsCompanion") create​(akka.actor.ActorSystem system)
		```
		
		WARNING: This MUST overridden in sub\-classes as otherwise won't be usable (return type) from Java.
		 Creates an instance of settings using the configuration provided by the given ActorSystem.
		 
		 Java API
		
		
		
		Parameters:
		`system` \- (undocumented)
		Returns:
		(undocumented)
		- #### create
		
		
		
		```
		[T](SettingsCompanion.html "type parameter in SettingsCompanion") create​(com.typesafe.config.Config config)
		```
		
		Creates an instance of settings using the given Config.
		 
		 Java API
		
		
		
		Parameters:
		`config` \- (undocumented)
		Returns:
		(undocumented)
		- #### create
		
		
		
		```
		[T](SettingsCompanion.html "type parameter in SettingsCompanion") create​(java.lang.String configOverrides)
		```
		
		Create an instance of settings using the given String of config overrides to override
		 settings set in the class loader of this class (i.e. by application.conf or reference.conf files in
		 the class loader of this class).
		 
		 Java API
		
		
		
		Parameters:
		`configOverrides` \- (undocumented)
		Returns:
		(undocumented)

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/caching/javadsl/CachingSettings$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/caching/javadsl/LfuCacheSettings$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/settings/ClientConnectionSettings$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/settings/ConnectionPoolSettings$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/settings/Http2ServerSettings$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/settings/HttpsProxySettings$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/settings/ParserSettings$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/settings/PreviewServerSettings$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/settings/RoutingSettings$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/settings/ServerSettings$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/settings/SettingsCompanion.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/settings/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/settings/SettingsCompanion.html](https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/settings/SettingsCompanion.html)*