---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:37:06Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/remote/testconductor/RemoteConnection.html
title: RemoteConnection
---

# RemoteConnection

## Content

Package [akka.remote.testconductor](package-summary.html)
## Interface RemoteConnection

- ---

```
public interface RemoteConnection
```

INTERNAL API.

- - ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `io.netty.channel.ChannelFuture` | `[channelFuture](#channelFuture())()` | The channel future associated with this connection. |
	| `void` | `[shutdown](#shutdown())()` | Shutdown the connection and release the resources. |

- - ### Method Detail
	
	
	
		- #### channelFuture
		
		
		
		```
		io.netty.channel.ChannelFuture channelFuture()
		```
		
		The channel future associated with this connection.
		- #### shutdown
		
		
		
		```
		void shutdown()
		```
		
		Shutdown the connection and release the resources.

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/remote/testconductor/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/remote/testconductor/RemoteConnection.html](https://doc.akka.io/japi/akka/current/akka/remote/testconductor/RemoteConnection.html)*