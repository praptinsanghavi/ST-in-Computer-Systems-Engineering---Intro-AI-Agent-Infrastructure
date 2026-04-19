---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:24:59Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/persistence/query/journal/leveldb/Buffer.html
title: Buffer
---

# Buffer

## Content

Package [akka.persistence.query.journal.leveldb](package-summary.html)
## Interface Buffer\<T\>

- ---

```
public interface Buffer<T>
```

INTERNAL API

- - ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `void` | `[buffer](#buffer(scala.collection.immutable.Set))​(scala.collection.immutable.Set<[T](Buffer.html "type parameter in Buffer")> all)` |  |
	| `void` | `[buffer](#buffer(T))​([T](Buffer.html "type parameter in Buffer") element)` |  |
	| `boolean` | `[bufferEmpty](#bufferEmpty())()` |  |
	| `int` | `[bufferSize](#bufferSize())()` |  |
	| `void` | `[deliverBuf](#deliverBuf(akka.stream.Outlet))​([Outlet](../../../../stream/Outlet.html "class in akka.stream")<[T](Buffer.html "type parameter in Buffer")> out)` |  |
	| `void` | `[doPush](#doPush(akka.stream.Outlet,T))​([Outlet](../../../../stream/Outlet.html "class in akka.stream")<[T](Buffer.html "type parameter in Buffer")> out,  [T](Buffer.html "type parameter in Buffer") elem)` |  |

- - ### Method Detail
	
	
	
		- #### buffer
		
		
		
		```
		void buffer​([T](Buffer.html "type parameter in Buffer") element)
		```
		- #### buffer
		
		
		
		```
		void buffer​(scala.collection.immutable.Set<[T](Buffer.html "type parameter in Buffer")> all)
		```
		- #### bufferEmpty
		
		
		
		```
		boolean bufferEmpty()
		```
		- #### bufferSize
		
		
		
		```
		int bufferSize()
		```
		- #### deliverBuf
		
		
		
		```
		void deliverBuf​([Outlet](../../../../stream/Outlet.html "class in akka.stream")<[T](Buffer.html "type parameter in Buffer")> out)
		```
		- #### doPush
		
		
		
		```
		void doPush​([Outlet](../../../../stream/Outlet.html "class in akka.stream")<[T](Buffer.html "type parameter in Buffer")> out,
		            [T](Buffer.html "type parameter in Buffer") elem)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/persistence/query/journal/leveldb/Buffer.html
- https://doc.akka.io/japi/akka/current/akka/persistence/query/journal/leveldb/package-summary.html
- https://doc.akka.io/japi/akka/current/akka/stream/Outlet.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/persistence/query/journal/leveldb/Buffer.html](https://doc.akka.io/japi/akka/current/akka/persistence/query/journal/leveldb/Buffer.html)*