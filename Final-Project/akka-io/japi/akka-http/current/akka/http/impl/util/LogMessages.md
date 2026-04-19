---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T23:34:33Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/impl/util/LogMessages.html
title: LogMessages
---

# LogMessages

## Content

Package [akka.http.impl.util](package-summary.html)
## Interface LogMessages

- All Superinterfaces:
`akka.actor.ActorLogging`

---

```
public interface LogMessages
extends akka.actor.ActorLogging
```

- - ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `scala.PartialFunction<java.lang.Object,​scala.runtime.BoxedUnit>` | `[logMessages](#logMessages(java.lang.String,scala.PartialFunction))​(java.lang.String mark,  scala.PartialFunction<java.lang.Object,​scala.runtime.BoxedUnit> r)` |  |
	
	
		- ### Methods inherited from interface akka.actor.ActorLogging
		
		
		`akka$actor$ActorLogging$$_log, akka$actor$ActorLogging$$_log_$eq, log`

- - ### Method Detail
	
	
	
		- #### logMessages
		
		
		
		```
		scala.PartialFunction<java.lang.Object,​scala.runtime.BoxedUnit> logMessages​(java.lang.String mark,
		                                                                                  scala.PartialFunction<java.lang.Object,​scala.runtime.BoxedUnit> r)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/impl/util/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/impl/util/LogMessages.html](https://doc.akka.io/japi/akka-http/current/akka/http/impl/util/LogMessages.html)*