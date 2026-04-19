---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T23:34:29Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/impl/settings/WebSocketSettingsImpl$.html
title: WebSocketSettingsImpl$
---

# WebSocketSettingsImpl$

## Content

Package [akka.http.impl.settings](package-summary.html)
## Class WebSocketSettingsImpl$

- java.lang.Object
- - akka.http.impl.settings.WebSocketSettingsImpl$

- All Implemented Interfaces:
`java.io.Serializable`

---

```
public class WebSocketSettingsImpl$
extends java.lang.Object
implements java.io.Serializable
```

INTERNAL API

See Also:
[Serialized Form](../../../../serialized-form.html#akka.http.impl.settings.WebSocketSettingsImpl$)

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [WebSocketSettingsImpl$](WebSocketSettingsImpl$.html "class in akka.http.impl.settings")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[WebSocketSettingsImpl$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[WebSocketSettingsImpl](WebSocketSettingsImpl.html "class in akka.http.impl.settings")` | `[client](#client(com.typesafe.config.Config))​(com.typesafe.config.Config config)` |  |
	| `[WebSocketSettingsImpl](WebSocketSettingsImpl.html "class in akka.http.impl.settings")` | `[clientFromRoot](#clientFromRoot(com.typesafe.config.Config))​(com.typesafe.config.Config root)` |  |
	| `boolean` | `[hasNoCustomPeriodicKeepAliveData](#hasNoCustomPeriodicKeepAliveData(akka.http.javadsl.settings.WebSocketSettings))​([WebSocketSettings](../../javadsl/settings/WebSocketSettings.html "interface in akka.http.javadsl.settings") settings)` |  |
	| `[WebSocketSettingsImpl](WebSocketSettingsImpl.html "class in akka.http.impl.settings")` | `[server](#server(com.typesafe.config.Config))​(com.typesafe.config.Config config)` |  |
	| `[WebSocketSettingsImpl](WebSocketSettingsImpl.html "class in akka.http.impl.settings")` | `[serverFromRoot](#serverFromRoot(com.typesafe.config.Config))​(com.typesafe.config.Config root)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [WebSocketSettingsImpl$](WebSocketSettingsImpl$.html "class in akka.http.impl.settings") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### WebSocketSettingsImpl$
		
		
		
		```
		public WebSocketSettingsImpl$()
		```

	- ### Method Detail
	
	
	
		- #### hasNoCustomPeriodicKeepAliveData
		
		
		
		```
		public boolean hasNoCustomPeriodicKeepAliveData​([WebSocketSettings](../../javadsl/settings/WebSocketSettings.html "interface in akka.http.javadsl.settings") settings)
		```
		- #### serverFromRoot
		
		
		
		```
		public [WebSocketSettingsImpl](WebSocketSettingsImpl.html "class in akka.http.impl.settings") serverFromRoot​(com.typesafe.config.Config root)
		```
		- #### server
		
		
		
		```
		public [WebSocketSettingsImpl](WebSocketSettingsImpl.html "class in akka.http.impl.settings") server​(com.typesafe.config.Config config)
		```
		- #### clientFromRoot
		
		
		
		```
		public [WebSocketSettingsImpl](WebSocketSettingsImpl.html "class in akka.http.impl.settings") clientFromRoot​(com.typesafe.config.Config root)
		```
		- #### client
		
		
		
		```
		public [WebSocketSettingsImpl](WebSocketSettingsImpl.html "class in akka.http.impl.settings") client​(com.typesafe.config.Config config)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/impl/settings/WebSocketSettingsImpl$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/settings/WebSocketSettingsImpl.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/settings/package-summary.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/settings/WebSocketSettings.html
- https://doc.akka.io/japi/akka-http/current/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/impl/settings/WebSocketSettingsImpl$.html](https://doc.akka.io/japi/akka-http/current/akka/http/impl/settings/WebSocketSettingsImpl$.html)*