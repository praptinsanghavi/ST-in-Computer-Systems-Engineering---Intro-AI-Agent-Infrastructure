---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T00:28:28Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/ClientTransport.html
title: ClientTransport
---

# ClientTransport

## Content

Package [akka.http.scaladsl](package-summary.html)
## Interface ClientTransport

- ---

```
public interface ClientTransport
```

Abstraction to allow the creation of alternative transports to run HTTP on.
 
 SPI for implementors of custom client transports.

- - ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `akka.stream.scaladsl.Flow<akka.util.ByteString,​akka.util.ByteString,​scala.concurrent.Future<[Http.OutgoingConnection](Http.OutgoingConnection.html "class in akka.http.scaladsl")>>` | `[connectTo](#connectTo(java.lang.String,int,akka.http.scaladsl.settings.ClientConnectionSettings,akka.actor.ActorSystem))​(java.lang.String host,  int port,  [ClientConnectionSettings](settings/ClientConnectionSettings.html "class in akka.http.scaladsl.settings") settings,  akka.actor.ActorSystem system)` |  |

- - ### Method Detail
	
	
	
		- #### connectTo
		
		
		
		```
		akka.stream.scaladsl.Flow<akka.util.ByteString,​akka.util.ByteString,​scala.concurrent.Future<[Http.OutgoingConnection](Http.OutgoingConnection.html "class in akka.http.scaladsl")>> connectTo​(java.lang.String host,
		                                                                                                                                            int port,
		                                                                                                                                            [ClientConnectionSettings](settings/ClientConnectionSettings.html "class in akka.http.scaladsl.settings") settings,
		                                                                                                                                            akka.actor.ActorSystem system)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/Http.OutgoingConnection.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/package-summary.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/settings/ClientConnectionSettings.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/ClientTransport.html](https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/ClientTransport.html)*