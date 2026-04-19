---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T23:45:53Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/HttpMessage.DiscardedEntity.html
title: HttpMessage.DiscardedEntity
---

# HttpMessage.DiscardedEntity

## Content

Package [akka.http.javadsl.model](package-summary.html)
## Interface HttpMessage.DiscardedEntity

- All Superinterfaces:
`[HttpEntity.DiscardedEntity](HttpEntity.DiscardedEntity.html "interface in akka.http.javadsl.model")`

All Known Implementing Classes:
`[HttpEntity.DiscardedEntity](../../scaladsl/model/HttpEntity.DiscardedEntity.html "class in akka.http.scaladsl.model")`, `[HttpMessage.DiscardedEntity](../../scaladsl/model/HttpMessage.DiscardedEntity.html "class in akka.http.scaladsl.model")`

Enclosing interface:
[HttpMessage](HttpMessage.html "interface in akka.http.javadsl.model")

---

```
public static interface HttpMessage.DiscardedEntity
extends [HttpEntity.DiscardedEntity](HttpEntity.DiscardedEntity.html "interface in akka.http.javadsl.model")
```

Represents the currently being\-drained HTTP Entity which triggers completion of the contained
 Future once the entity has been drained for the given HttpMessage completely.

- - ### Method Summary
	
	
		- ### Methods inherited from interface akka.http.javadsl.model.[HttpEntity.DiscardedEntity](HttpEntity.DiscardedEntity.html "interface in akka.http.javadsl.model")
		
		
		`[completionStage](HttpEntity.DiscardedEntity.html#completionStage()), [future](HttpEntity.DiscardedEntity.html#future())`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/HttpEntity.DiscardedEntity.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/HttpMessage.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/package-summary.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/HttpEntity.DiscardedEntity.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/HttpMessage.DiscardedEntity.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/HttpMessage.DiscardedEntity.html](https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/HttpMessage.DiscardedEntity.html)*