---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T23:48:08Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/settings/Http2ServerSettings.html
title: Http2ServerSettings
---

# Http2ServerSettings

## Content

Package [akka.http.javadsl.settings](package-summary.html)
## Interface Http2ServerSettings

- All Known Subinterfaces:
`[Http2ServerSettings](../../scaladsl/settings/Http2ServerSettings.html "interface in akka.http.scaladsl.settings")`

All Known Implementing Classes:
`[Http2ServerSettings.Http2ServerSettingsImpl](../../scaladsl/settings/Http2ServerSettings.Http2ServerSettingsImpl.html "class in akka.http.scaladsl.settings")`

---

```
public interface Http2ServerSettings
```

- - ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `java.time.Duration` | `[getGoawayGracePeriod](#getGoawayGracePeriod())()` |  |
	| `int` | `[getIncomingConnectionLevelBufferSize](#getIncomingConnectionLevelBufferSize())()` |  |
	| `int` | `[getIncomingStreamLevelBufferSize](#getIncomingStreamLevelBufferSize())()` |  |
	| `int` | `[getMaxConcurrentStreams](#getMaxConcurrentStreams())()` |  |
	| `java.time.Duration` | `[getMaxResetsInterval](#getMaxResetsInterval())()` |  |
	| `int` | `[getOutgoingControlFrameBufferSize](#getOutgoingControlFrameBufferSize())()` |  |
	| `java.time.Duration` | `[getPingInterval](#getPingInterval())()` |  |
	| `java.time.Duration` | `[getPingTimeout](#getPingTimeout())()` |  |
	| `int` | `[getRequestEntityChunkSize](#getRequestEntityChunkSize())()` |  |
	| `boolean` | `[logFrames](#logFrames())()` |  |
	| `int` | `[maxResets](#maxResets())()` |  |
	| `int` | `[minCollectStrictEntitySize](#minCollectStrictEntitySize())()` |  |
	| `[Http2ServerSettings](Http2ServerSettings.html "interface in akka.http.javadsl.settings")` | `[withGoawayGracePeriod](#withGoawayGracePeriod(java.time.Duration))​(java.time.Duration duration)` |  |
	| `[Http2ServerSettings](Http2ServerSettings.html "interface in akka.http.javadsl.settings")` | `[withIncomingConnectionLevelBufferSize](#withIncomingConnectionLevelBufferSize(int))​(int newIncomingConnectionLevelBufferSize)` |  |
	| `[Http2ServerSettings](Http2ServerSettings.html "interface in akka.http.javadsl.settings")` | `[withIncomingStreamLevelBufferSize](#withIncomingStreamLevelBufferSize(int))​(int newIncomingStreamLevelBufferSize)` |  |
	| `[Http2ServerSettings](Http2ServerSettings.html "interface in akka.http.javadsl.settings")` | `[withLogFrames](#withLogFrames(boolean))​(boolean shouldLog)` |  |
	| `[Http2ServerSettings](Http2ServerSettings.html "interface in akka.http.javadsl.settings")` | `[withMaxConcurrentStreams](#withMaxConcurrentStreams(int))​(int newValue)` |  |
	| `[Http2ServerSettings](Http2ServerSettings.html "interface in akka.http.javadsl.settings")` | `[withMaxResets](#withMaxResets(int))​(int n)` |  |
	| `[Http2ServerSettings](Http2ServerSettings.html "interface in akka.http.javadsl.settings")` | `[withMaxResetsInterval](#withMaxResetsInterval(java.time.Duration))​(java.time.Duration interval)` |  |
	| `[Http2ServerSettings](Http2ServerSettings.html "interface in akka.http.javadsl.settings")` | `[withMinCollectStrictEntitySize](#withMinCollectStrictEntitySize(int))​(int newValue)` |  |
	| `[Http2ServerSettings](Http2ServerSettings.html "interface in akka.http.javadsl.settings")` | `[withOutgoingControlFrameBufferSize](#withOutgoingControlFrameBufferSize(int))​(int newValue)` |  |
	| `[Http2ServerSettings](Http2ServerSettings.html "interface in akka.http.javadsl.settings")` | `[withPingInterval](#withPingInterval(java.time.Duration))​(java.time.Duration interval)` |  |
	| `[Http2ServerSettings](Http2ServerSettings.html "interface in akka.http.javadsl.settings")` | `[withPingTimeout](#withPingTimeout(java.time.Duration))​(java.time.Duration timeout)` |  |
	| `[Http2ServerSettings](Http2ServerSettings.html "interface in akka.http.javadsl.settings")` | `[withRequestEntityChunkSize](#withRequestEntityChunkSize(int))​(int newRequestEntityChunkSize)` |  |

- - ### Method Detail
	
	
	
		- #### getRequestEntityChunkSize
		
		
		
		```
		int getRequestEntityChunkSize()
		```
		- #### withRequestEntityChunkSize
		
		
		
		```
		[Http2ServerSettings](Http2ServerSettings.html "interface in akka.http.javadsl.settings") withRequestEntityChunkSize​(int newRequestEntityChunkSize)
		```
		- #### getIncomingConnectionLevelBufferSize
		
		
		
		```
		int getIncomingConnectionLevelBufferSize()
		```
		- #### withIncomingConnectionLevelBufferSize
		
		
		
		```
		[Http2ServerSettings](Http2ServerSettings.html "interface in akka.http.javadsl.settings") withIncomingConnectionLevelBufferSize​(int newIncomingConnectionLevelBufferSize)
		```
		- #### getIncomingStreamLevelBufferSize
		
		
		
		```
		int getIncomingStreamLevelBufferSize()
		```
		- #### withIncomingStreamLevelBufferSize
		
		
		
		```
		[Http2ServerSettings](Http2ServerSettings.html "interface in akka.http.javadsl.settings") withIncomingStreamLevelBufferSize​(int newIncomingStreamLevelBufferSize)
		```
		- #### minCollectStrictEntitySize
		
		
		
		```
		int minCollectStrictEntitySize()
		```
		- #### withMinCollectStrictEntitySize
		
		
		
		```
		[Http2ServerSettings](Http2ServerSettings.html "interface in akka.http.javadsl.settings") withMinCollectStrictEntitySize​(int newValue)
		```
		- #### getMaxConcurrentStreams
		
		
		
		```
		int getMaxConcurrentStreams()
		```
		- #### withMaxConcurrentStreams
		
		
		
		```
		[Http2ServerSettings](Http2ServerSettings.html "interface in akka.http.javadsl.settings") withMaxConcurrentStreams​(int newValue)
		```
		- #### getOutgoingControlFrameBufferSize
		
		
		
		```
		int getOutgoingControlFrameBufferSize()
		```
		- #### withOutgoingControlFrameBufferSize
		
		
		
		```
		[Http2ServerSettings](Http2ServerSettings.html "interface in akka.http.javadsl.settings") withOutgoingControlFrameBufferSize​(int newValue)
		```
		- #### logFrames
		
		
		
		```
		boolean logFrames()
		```
		- #### withLogFrames
		
		
		
		```
		[Http2ServerSettings](Http2ServerSettings.html "interface in akka.http.javadsl.settings") withLogFrames​(boolean shouldLog)
		```
		- #### getPingInterval
		
		
		
		```
		java.time.Duration getPingInterval()
		```
		- #### withPingInterval
		
		
		
		```
		[Http2ServerSettings](Http2ServerSettings.html "interface in akka.http.javadsl.settings") withPingInterval​(java.time.Duration interval)
		```
		- #### getPingTimeout
		
		
		
		```
		java.time.Duration getPingTimeout()
		```
		- #### withPingTimeout
		
		
		
		```
		[Http2ServerSettings](Http2ServerSettings.html "interface in akka.http.javadsl.settings") withPingTimeout​(java.time.Duration timeout)
		```
		- #### maxResets
		
		
		
		```
		int maxResets()
		```
		- #### withMaxResets
		
		
		
		```
		[Http2ServerSettings](Http2ServerSettings.html "interface in akka.http.javadsl.settings") withMaxResets​(int n)
		```
		- #### getMaxResetsInterval
		
		
		
		```
		java.time.Duration getMaxResetsInterval()
		```
		- #### withMaxResetsInterval
		
		
		
		```
		[Http2ServerSettings](Http2ServerSettings.html "interface in akka.http.javadsl.settings") withMaxResetsInterval​(java.time.Duration interval)
		```
		- #### getGoawayGracePeriod
		
		
		
		```
		java.time.Duration getGoawayGracePeriod()
		```
		- #### withGoawayGracePeriod
		
		
		
		```
		[Http2ServerSettings](Http2ServerSettings.html "interface in akka.http.javadsl.settings") withGoawayGracePeriod​(java.time.Duration duration)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/settings/Http2ServerSettings.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/settings/package-summary.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/settings/Http2ServerSettings.Http2ServerSettingsImpl.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/settings/Http2ServerSettings.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/settings/Http2ServerSettings.html](https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/settings/Http2ServerSettings.html)*