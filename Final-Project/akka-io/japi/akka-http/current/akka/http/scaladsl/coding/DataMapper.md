---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T00:29:22Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/coding/DataMapper.html
title: DataMapper
---

# DataMapper

## Content

Package [akka.http.scaladsl.coding](package-summary.html)
## Interface DataMapper\<T\>

- ---

```
public interface DataMapper<T>
```

An abstraction to transform data bytes of HttpMessages or HttpEntities

- - ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `[T](DataMapper.html "type parameter in DataMapper")` | `[transformDataBytes](#transformDataBytes(T,akka.stream.scaladsl.Flow))​([T](DataMapper.html "type parameter in DataMapper") t,  akka.stream.scaladsl.Flow<akka.util.ByteString,​akka.util.ByteString,​?> transformer)` |  |

- - ### Method Detail
	
	
	
		- #### transformDataBytes
		
		
		
		```
		[T](DataMapper.html "type parameter in DataMapper") transformDataBytes​([T](DataMapper.html "type parameter in DataMapper") t,
		                     akka.stream.scaladsl.Flow<akka.util.ByteString,​akka.util.ByteString,​?> transformer)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/coding/DataMapper.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/coding/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/coding/DataMapper.html](https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/coding/DataMapper.html)*