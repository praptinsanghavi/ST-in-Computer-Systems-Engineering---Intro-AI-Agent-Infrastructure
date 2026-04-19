---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T00:41:22Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/settings/Http2CommonSettings.html
title: Http2CommonSettings
---

# Http2CommonSettings

## Content

Package [akka.http.scaladsl.settings](package-summary.html)
## Interface Http2CommonSettings

- All Known Subinterfaces:
`[Http2ClientSettings](Http2ClientSettings.html "interface in akka.http.scaladsl.settings")`, `[Http2ServerSettings](Http2ServerSettings.html "interface in akka.http.scaladsl.settings")`

All Known Implementing Classes:
`[Http2ClientSettings.Http2ClientSettingsImpl](Http2ClientSettings.Http2ClientSettingsImpl.html "class in akka.http.scaladsl.settings")`, `[Http2ServerSettings.Http2ServerSettingsImpl](Http2ServerSettings.Http2ServerSettingsImpl.html "class in akka.http.scaladsl.settings")`

---

```
public interface Http2CommonSettings
```

INTERNAL API
 
 Settings which are common for server and client side.

- - ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `scala.concurrent.duration.FiniteDuration` | `[goawayGracePeriod](#goawayGracePeriod())()` |  |
	| `int` | `[incomingConnectionLevelBufferSize](#incomingConnectionLevelBufferSize())()` |  |
	| `int` | `[incomingStreamLevelBufferSize](#incomingStreamLevelBufferSize())()` |  |
	| `boolean` | `[logFrames](#logFrames())()` |  |
	| `int` | `[maxConcurrentStreams](#maxConcurrentStreams())()` |  |
	| `int` | `[minCollectStrictEntitySize](#minCollectStrictEntitySize())()` |  |
	| `int` | `[outgoingControlFrameBufferSize](#outgoingControlFrameBufferSize())()` |  |
	| `scala.concurrent.duration.FiniteDuration` | `[pingInterval](#pingInterval())()` |  |
	| `scala.concurrent.duration.FiniteDuration` | `[pingTimeout](#pingTimeout())()` |  |
	| `int` | `[requestEntityChunkSize](#requestEntityChunkSize())()` |  |

- - ### Method Detail
	
	
	
		- #### requestEntityChunkSize
		
		
		
		```
		int requestEntityChunkSize()
		```
		- #### incomingConnectionLevelBufferSize
		
		
		
		```
		int incomingConnectionLevelBufferSize()
		```
		- #### incomingStreamLevelBufferSize
		
		
		
		```
		int incomingStreamLevelBufferSize()
		```
		- #### minCollectStrictEntitySize
		
		
		
		```
		int minCollectStrictEntitySize()
		```
		- #### logFrames
		
		
		
		```
		boolean logFrames()
		```
		- #### maxConcurrentStreams
		
		
		
		```
		int maxConcurrentStreams()
		```
		- #### outgoingControlFrameBufferSize
		
		
		
		```
		int outgoingControlFrameBufferSize()
		```
		- #### pingInterval
		
		
		
		```
		scala.concurrent.duration.FiniteDuration pingInterval()
		```
		- #### pingTimeout
		
		
		
		```
		scala.concurrent.duration.FiniteDuration pingTimeout()
		```
		- #### goawayGracePeriod
		
		
		
		```
		scala.concurrent.duration.FiniteDuration goawayGracePeriod()
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/settings/Http2ClientSettings.Http2ClientSettingsImpl.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/settings/Http2ClientSettings.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/settings/Http2ServerSettings.Http2ServerSettingsImpl.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/settings/Http2ServerSettings.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/settings/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/settings/Http2CommonSettings.html](https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/settings/Http2CommonSettings.html)*