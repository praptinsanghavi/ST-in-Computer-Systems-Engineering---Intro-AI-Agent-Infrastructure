---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T23:29:49Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/client/HttpsProxyGraphStage$.html
title: HttpsProxyGraphStage$
---

# HttpsProxyGraphStage$

## Content

Package [akka.http.impl.engine.client](package-summary.html)
## Class HttpsProxyGraphStage$

- java.lang.Object
- - akka.http.impl.engine.client.HttpsProxyGraphStage$

- ---

```
public class HttpsProxyGraphStage$
extends java.lang.Object
```

INTERNAL API

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [HttpsProxyGraphStage$](HttpsProxyGraphStage$.html "class in akka.http.impl.engine.client")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[HttpsProxyGraphStage$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `akka.stream.scaladsl.BidiFlow<akka.util.ByteString,​akka.util.ByteString,​akka.util.ByteString,​akka.util.ByteString,​akka.NotUsed>` | `[apply](#apply(java.lang.String,int,akka.http.scaladsl.settings.ClientConnectionSettings,scala.Option))​(java.lang.String targetHostName,  int targetPort,  [ClientConnectionSettings](../../../scaladsl/settings/ClientConnectionSettings.html "class in akka.http.scaladsl.settings") settings,  scala.Option<[HttpCredentials](../../../scaladsl/model/headers/HttpCredentials.html "class in akka.http.scaladsl.model.headers")> proxyAuth)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [HttpsProxyGraphStage$](HttpsProxyGraphStage$.html "class in akka.http.impl.engine.client") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### HttpsProxyGraphStage$
		
		
		
		```
		public HttpsProxyGraphStage$()
		```

	- ### Method Detail
	
	
	
		- #### apply
		
		
		
		```
		public akka.stream.scaladsl.BidiFlow<akka.util.ByteString,​akka.util.ByteString,​akka.util.ByteString,​akka.util.ByteString,​akka.NotUsed> apply​(java.lang.String targetHostName,
		                                                                                                                                                                     int targetPort,
		                                                                                                                                                                     [ClientConnectionSettings](../../../scaladsl/settings/ClientConnectionSettings.html "class in akka.http.scaladsl.settings") settings,
		                                                                                                                                                                     scala.Option<[HttpCredentials](../../../scaladsl/model/headers/HttpCredentials.html "class in akka.http.scaladsl.model.headers")> proxyAuth)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/client/HttpsProxyGraphStage$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/client/package-summary.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/HttpCredentials.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/settings/ClientConnectionSettings.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/client/HttpsProxyGraphStage$.html](https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/client/HttpsProxyGraphStage$.html)*