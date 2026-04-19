---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T00:29:41Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/marshallers/sprayjson/SprayJsonEntityStreamingSupport.html
title: SprayJsonEntityStreamingSupport
---

# SprayJsonEntityStreamingSupport

## Content

Package [akka.http.scaladsl.marshallers.sprayjson](package-summary.html)
## Class SprayJsonEntityStreamingSupport

- java.lang.Object
- - akka.http.scaladsl.marshallers.sprayjson.SprayJsonEntityStreamingSupport

- ---

```
public class SprayJsonEntityStreamingSupport
extends java.lang.Object
```

Entity streaming support, implemented using spray\-json.
 
 See also [github.com/spray/spray\-json](https://github.com/spray/spray-json) for details about Spray JSON itself

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[SprayJsonEntityStreamingSupport](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `static [JsonEntityStreamingSupport](JsonEntityStreamingSupport.html "class in akka.http.scaladsl.marshallers.sprayjson")` | `[json](#json())()` | Default `application/json` entity streaming support. |
	| `static [JsonEntityStreamingSupport](JsonEntityStreamingSupport.html "class in akka.http.scaladsl.marshallers.sprayjson")` | `[json](#json(int))​(int maxObjectLength)` | Default `application/json` entity streaming support. |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### SprayJsonEntityStreamingSupport
		
		
		
		```
		public SprayJsonEntityStreamingSupport()
		```

	- ### Method Detail
	
	
	
		- #### json
		
		
		
		```
		public static [JsonEntityStreamingSupport](JsonEntityStreamingSupport.html "class in akka.http.scaladsl.marshallers.sprayjson") json()
		```
		
		Default `application/json` entity streaming support.
		 
		 Provides framing (based on scanning the incoming dataBytes for valid JSON objects, so for example uploads using arrays or
		 new\-line separated JSON objects are all parsed correctly) and rendering of Sources as JSON Arrays.
		 A different very popular style of returning streaming JSON is to separate JSON objects on a line\-by\-line basis,
		 you can configure the support trait to do so by calling `withFramingRendererFlow`.
		 
		
		
		 Limits the maximum JSON object length to 8KB, if you want to increase this limit provide a value explicitly.
		 
		
		
		 See also <https://en.wikipedia.org/wiki/JSON_Streaming>
		
		
		
		Returns:
		(undocumented)
		- #### json
		
		
		
		```
		public static [JsonEntityStreamingSupport](JsonEntityStreamingSupport.html "class in akka.http.scaladsl.marshallers.sprayjson") json​(int maxObjectLength)
		```
		
		Default `application/json` entity streaming support.
		 
		 Provides framing (based on scanning the incoming dataBytes for valid JSON objects, so for example uploads using arrays or
		 new\-line separated JSON objects are all parsed correctly) and rendering of Sources as JSON Arrays.
		 A different very popular style of returning streaming JSON is to separate JSON objects on a line\-by\-line basis,
		 you can configure the support trait to do so by calling `withFramingRendererFlow`.
		 
		
		
		 See also <https://en.wikipedia.org/wiki/JSON_Streaming>
		
		
		
		Parameters:
		`maxObjectLength` \- (undocumented)
		Returns:
		(undocumented)

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/marshallers/sprayjson/JsonEntityStreamingSupport.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/marshallers/sprayjson/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/marshallers/sprayjson/SprayJsonEntityStreamingSupport.html](https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/marshallers/sprayjson/SprayJsonEntityStreamingSupport.html)*