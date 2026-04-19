---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T23:30:19Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/client/pool/SlotContext.html
title: SlotContext
---

# SlotContext

## Content

Package [akka.http.impl.engine.client.pool](package-summary.html)
## Class SlotContext

- java.lang.Object
- - akka.http.impl.engine.client.pool.SlotContext

- All Implemented Interfaces:
`akka.macros.LogHelper`, `akka.macros.LogHelperMacro`

---

```
public abstract class SlotContext
extends java.lang.Object
implements akka.macros.LogHelper
```

Internal API
 
 Interface between slot states and the actual slot.

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[SlotContext](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `abstract void` | `[dispatchResponseResult](#dispatchResponseResult(akka.http.impl.engine.client.PoolFlow.RequestContext,scala.util.Try))​([PoolFlow.RequestContext](../PoolFlow.RequestContext.html "class in akka.http.impl.engine.client") req,  scala.util.Try<[HttpResponse](../../../../scaladsl/model/HttpResponse.html "class in akka.http.scaladsl.model")> result)` |  |
	| `abstract boolean` | `[isConnectionClosed](#isConnectionClosed())()` |  |
	| `abstract void` | `[openConnection](#openConnection())()` |  |
	| `abstract [ConnectionPoolSettings](../../../../scaladsl/settings/ConnectionPoolSettings.html "class in akka.http.scaladsl.settings")` | `[settings](#settings())()` |  |
	| `abstract boolean` | `[willCloseAfter](#willCloseAfter(akka.http.scaladsl.model.HttpResponse))​([HttpResponse](../../../../scaladsl/model/HttpResponse.html "class in akka.http.scaladsl.model") res)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`
		- ### Methods inherited from interface akka.macros.LogHelper
		
		
		`isDebugEnabled, isInfoEnabled, isWarningEnabled, log, prefixString`

- - ### Constructor Detail
	
	
	
		- #### SlotContext
		
		
		
		```
		public SlotContext()
		```

	- ### Method Detail
	
	
	
		- #### dispatchResponseResult
		
		
		
		```
		public abstract void dispatchResponseResult​([PoolFlow.RequestContext](../PoolFlow.RequestContext.html "class in akka.http.impl.engine.client") req,
		                                            scala.util.Try<[HttpResponse](../../../../scaladsl/model/HttpResponse.html "class in akka.http.scaladsl.model")> result)
		```
		- #### isConnectionClosed
		
		
		
		```
		public abstract boolean isConnectionClosed()
		```
		- #### openConnection
		
		
		
		```
		public abstract void openConnection()
		```
		- #### settings
		
		
		
		```
		public abstract [ConnectionPoolSettings](../../../../scaladsl/settings/ConnectionPoolSettings.html "class in akka.http.scaladsl.settings") settings()
		```
		- #### willCloseAfter
		
		
		
		```
		public abstract boolean willCloseAfter​([HttpResponse](../../../../scaladsl/model/HttpResponse.html "class in akka.http.scaladsl.model") res)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/client/PoolFlow.RequestContext.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/client/pool/package-summary.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/HttpResponse.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/settings/ConnectionPoolSettings.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/client/pool/SlotContext.html](https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/client/pool/SlotContext.html)*