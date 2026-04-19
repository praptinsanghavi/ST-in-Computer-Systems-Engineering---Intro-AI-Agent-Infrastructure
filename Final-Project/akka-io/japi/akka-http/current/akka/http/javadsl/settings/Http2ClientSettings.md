---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T23:48:06Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/settings/Http2ClientSettings.html
title: Http2ClientSettings
---

# Http2ClientSettings

## Content

Package [akka.http.javadsl.settings](package-summary.html)
## Interface Http2ClientSettings

- All Known Subinterfaces:
`[Http2ClientSettings](../../scaladsl/settings/Http2ClientSettings.html "interface in akka.http.scaladsl.settings")`

All Known Implementing Classes:
`[Http2ClientSettings.Http2ClientSettingsImpl](../../scaladsl/settings/Http2ClientSettings.Http2ClientSettingsImpl.html "class in akka.http.scaladsl.settings")`

---

```
public interface Http2ClientSettings
```

- - ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `java.time.Duration` | `[getBaseConnectionBackoff](#getBaseConnectionBackoff())()` |  |
	| `java.time.Duration` | `[getCompletionTimeout](#getCompletionTimeout())()` |  |
	| `java.time.Duration` | `[getGoawayGracePeriod](#getGoawayGracePeriod())()` |  |
	| `java.time.Duration` | `[getMaxConnectionBackoff](#getMaxConnectionBackoff())()` |  |
	| `int` | `[getMaxPersistentAttempts](#getMaxPersistentAttempts())()` |  |
	| `java.time.Duration` | `[getPingInterval](#getPingInterval())()` |  |
	| `java.time.Duration` | `[getPingTimeout](#getPingTimeout())()` |  |
	| `int` | `[incomingConnectionLevelBufferSize](#incomingConnectionLevelBufferSize())()` |  |
	| `int` | `[incomingStreamLevelBufferSize](#incomingStreamLevelBufferSize())()` |  |
	| `boolean` | `[logFrames](#logFrames())()` |  |
	| `int` | `[maxConcurrentStreams](#maxConcurrentStreams())()` |  |
	| `int` | `[outgoingControlFrameBufferSize](#outgoingControlFrameBufferSize())()` |  |
	| `int` | `[requestEntityChunkSize](#requestEntityChunkSize())()` |  |
	| `[Http2ClientSettings](Http2ClientSettings.html "interface in akka.http.javadsl.settings")` | `[withBaseConnectionBackoff](#withBaseConnectionBackoff(java.time.Duration))​(java.time.Duration backoff)` |  |
	| `[Http2ClientSettings](Http2ClientSettings.html "interface in akka.http.javadsl.settings")` | `[withCompletionTimeout](#withCompletionTimeout(java.time.Duration))​(java.time.Duration timeout)` |  |
	| `[Http2ClientSettings](Http2ClientSettings.html "interface in akka.http.javadsl.settings")` | `[withGoawayGracePeriod](#withGoawayGracePeriod(java.time.Duration))​(java.time.Duration duration)` |  |
	| `[Http2ClientSettings](Http2ClientSettings.html "interface in akka.http.javadsl.settings")` | `[withIncomingConnectionLevelBufferSize](#withIncomingConnectionLevelBufferSize(int))​(int newValue)` |  |
	| `[Http2ClientSettings](Http2ClientSettings.html "interface in akka.http.javadsl.settings")` | `[withIncomingStreamLevelBufferSize](#withIncomingStreamLevelBufferSize(int))​(int newValue)` |  |
	| `[Http2ClientSettings](Http2ClientSettings.html "interface in akka.http.javadsl.settings")` | `[withLogFrames](#withLogFrames(boolean))​(boolean shouldLog)` |  |
	| `[Http2ClientSettings](Http2ClientSettings.html "interface in akka.http.javadsl.settings")` | `[withMaxConcurrentStreams](#withMaxConcurrentStreams(int))​(int newValue)` |  |
	| `[Http2ClientSettings](Http2ClientSettings.html "interface in akka.http.javadsl.settings")` | `[withMaxConnectionBackoff](#withMaxConnectionBackoff(java.time.Duration))​(java.time.Duration backoff)` |  |
	| `[Http2ClientSettings](Http2ClientSettings.html "interface in akka.http.javadsl.settings")` | `[withMaxPersistentAttempts](#withMaxPersistentAttempts(int))​(int max)` |  |
	| `[Http2ClientSettings](Http2ClientSettings.html "interface in akka.http.javadsl.settings")` | `[withOutgoingControlFrameBufferSize](#withOutgoingControlFrameBufferSize(int))​(int newValue)` |  |
	| `[Http2ClientSettings](Http2ClientSettings.html "interface in akka.http.javadsl.settings")` | `[withPingInterval](#withPingInterval(java.time.Duration))​(java.time.Duration interval)` |  |
	| `[Http2ClientSettings](Http2ClientSettings.html "interface in akka.http.javadsl.settings")` | `[withPingTimeout](#withPingTimeout(java.time.Duration))​(java.time.Duration timeout)` |  |
	| `[Http2ClientSettings](Http2ClientSettings.html "interface in akka.http.javadsl.settings")` | `[withRequestEntityChunkSize](#withRequestEntityChunkSize(int))​(int newValue)` |  |

- - ### Method Detail
	
	
	
		- #### getBaseConnectionBackoff
		
		
		
		```
		java.time.Duration getBaseConnectionBackoff()
		```
		- #### getCompletionTimeout
		
		
		
		```
		java.time.Duration getCompletionTimeout()
		```
		- #### getGoawayGracePeriod
		
		
		
		```
		java.time.Duration getGoawayGracePeriod()
		```
		- #### getMaxConnectionBackoff
		
		
		
		```
		java.time.Duration getMaxConnectionBackoff()
		```
		- #### getMaxPersistentAttempts
		
		
		
		```
		int getMaxPersistentAttempts()
		```
		- #### getPingInterval
		
		
		
		```
		java.time.Duration getPingInterval()
		```
		- #### getPingTimeout
		
		
		
		```
		java.time.Duration getPingTimeout()
		```
		- #### incomingConnectionLevelBufferSize
		
		
		
		```
		int incomingConnectionLevelBufferSize()
		```
		- #### incomingStreamLevelBufferSize
		
		
		
		```
		int incomingStreamLevelBufferSize()
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
		- #### requestEntityChunkSize
		
		
		
		```
		int requestEntityChunkSize()
		```
		- #### withBaseConnectionBackoff
		
		
		
		```
		[Http2ClientSettings](Http2ClientSettings.html "interface in akka.http.javadsl.settings") withBaseConnectionBackoff​(java.time.Duration backoff)
		```
		- #### withCompletionTimeout
		
		
		
		```
		[Http2ClientSettings](Http2ClientSettings.html "interface in akka.http.javadsl.settings") withCompletionTimeout​(java.time.Duration timeout)
		```
		- #### withGoawayGracePeriod
		
		
		
		```
		[Http2ClientSettings](Http2ClientSettings.html "interface in akka.http.javadsl.settings") withGoawayGracePeriod​(java.time.Duration duration)
		```
		- #### withIncomingConnectionLevelBufferSize
		
		
		
		```
		[Http2ClientSettings](Http2ClientSettings.html "interface in akka.http.javadsl.settings") withIncomingConnectionLevelBufferSize​(int newValue)
		```
		- #### withIncomingStreamLevelBufferSize
		
		
		
		```
		[Http2ClientSettings](Http2ClientSettings.html "interface in akka.http.javadsl.settings") withIncomingStreamLevelBufferSize​(int newValue)
		```
		- #### withLogFrames
		
		
		
		```
		[Http2ClientSettings](Http2ClientSettings.html "interface in akka.http.javadsl.settings") withLogFrames​(boolean shouldLog)
		```
		- #### withMaxConcurrentStreams
		
		
		
		```
		[Http2ClientSettings](Http2ClientSettings.html "interface in akka.http.javadsl.settings") withMaxConcurrentStreams​(int newValue)
		```
		- #### withMaxConnectionBackoff
		
		
		
		```
		[Http2ClientSettings](Http2ClientSettings.html "interface in akka.http.javadsl.settings") withMaxConnectionBackoff​(java.time.Duration backoff)
		```
		- #### withMaxPersistentAttempts
		
		
		
		```
		[Http2ClientSettings](Http2ClientSettings.html "interface in akka.http.javadsl.settings") withMaxPersistentAttempts​(int max)
		```
		- #### withOutgoingControlFrameBufferSize
		
		
		
		```
		[Http2ClientSettings](Http2ClientSettings.html "interface in akka.http.javadsl.settings") withOutgoingControlFrameBufferSize​(int newValue)
		```
		- #### withPingInterval
		
		
		
		```
		[Http2ClientSettings](Http2ClientSettings.html "interface in akka.http.javadsl.settings") withPingInterval​(java.time.Duration interval)
		```
		- #### withPingTimeout
		
		
		
		```
		[Http2ClientSettings](Http2ClientSettings.html "interface in akka.http.javadsl.settings") withPingTimeout​(java.time.Duration timeout)
		```
		- #### withRequestEntityChunkSize
		
		
		
		```
		[Http2ClientSettings](Http2ClientSettings.html "interface in akka.http.javadsl.settings") withRequestEntityChunkSize​(int newValue)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/settings/Http2ClientSettings.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/settings/package-summary.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/settings/Http2ClientSettings.Http2ClientSettingsImpl.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/settings/Http2ClientSettings.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/settings/Http2ClientSettings.html](https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/settings/Http2ClientSettings.html)*