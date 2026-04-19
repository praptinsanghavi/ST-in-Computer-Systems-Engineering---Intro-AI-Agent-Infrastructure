---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:15:43Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/event/LogSource.html
title: LogSource
---

# LogSource

## Content

Package [akka.event](package-summary.html)
## Interface LogSource\<T\>

- ---

```
public interface LogSource<T>
```

- - ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `java.lang.String` | `[genString](#genString(T))​([T](LogSource.html "type parameter in LogSource") t)` |  |
	| `java.lang.String` | `[genString](#genString(T,akka.actor.ActorSystem))​([T](LogSource.html "type parameter in LogSource") t,  [ActorSystem](../actor/ActorSystem.html "class in akka.actor") system)` |  |
	| `java.lang.Class<?>` | `[getClazz](#getClazz(T))​([T](LogSource.html "type parameter in LogSource") t)` |  |

- - ### Method Detail
	
	
	
		- #### genString
		
		
		
		```
		java.lang.String genString​([T](LogSource.html "type parameter in LogSource") t)
		```
		- #### genString
		
		
		
		```
		java.lang.String genString​([T](LogSource.html "type parameter in LogSource") t,
		                           [ActorSystem](../actor/ActorSystem.html "class in akka.actor") system)
		```
		- #### getClazz
		
		
		
		```
		java.lang.Class<?> getClazz​([T](LogSource.html "type parameter in LogSource") t)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/actor/ActorSystem.html
- https://doc.akka.io/japi/akka/current/akka/event/LogSource.html
- https://doc.akka.io/japi/akka/current/akka/event/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/event/LogSource.html](https://doc.akka.io/japi/akka/current/akka/event/LogSource.html)*