---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T23:44:46Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/common/EntityStreamingSupport$.html
title: EntityStreamingSupport$
---

# EntityStreamingSupport$

## Content

Package [akka.http.javadsl.common](package-summary.html)
## Class EntityStreamingSupport$

- java.lang.Object
- - akka.http.javadsl.common.EntityStreamingSupport$

- ---

```
public class EntityStreamingSupport$
extends java.lang.Object
```

Entity streaming support, independent of used Json parsing library etc.

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [EntityStreamingSupport$](EntityStreamingSupport$.html "class in akka.http.javadsl.common")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[EntityStreamingSupport$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[CsvEntityStreamingSupport](CsvEntityStreamingSupport.html "class in akka.http.javadsl.common")` | `[csv](#csv())()` | Default `text/csv(UTF-8)` entity streaming support. |
	| `[CsvEntityStreamingSupport](CsvEntityStreamingSupport.html "class in akka.http.javadsl.common")` | `[csv](#csv(int))​(int maxLineLength)` | Default `text/csv(UTF-8)` entity streaming support. |
	| `[JsonEntityStreamingSupport](JsonEntityStreamingSupport.html "class in akka.http.javadsl.common")` | `[json](#json())()` | Default `application/json` entity streaming support. |
	| `[JsonEntityStreamingSupport](JsonEntityStreamingSupport.html "class in akka.http.javadsl.common")` | `[json](#json(int))​(int maxObjectLength)` | Default `application/json` entity streaming support. |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [EntityStreamingSupport$](EntityStreamingSupport$.html "class in akka.http.javadsl.common") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### EntityStreamingSupport$
		
		
		
		```
		public EntityStreamingSupport$()
		```

	- ### Method Detail
	
	
	
		- #### json
		
		
		
		```
		public [JsonEntityStreamingSupport](JsonEntityStreamingSupport.html "class in akka.http.javadsl.common") json()
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
		public [JsonEntityStreamingSupport](JsonEntityStreamingSupport.html "class in akka.http.javadsl.common") json​(int maxObjectLength)
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
		- #### csv
		
		
		
		```
		public [CsvEntityStreamingSupport](CsvEntityStreamingSupport.html "class in akka.http.javadsl.common") csv()
		```
		
		Default `text/csv(UTF-8)` entity streaming support.
		 Provides framing and rendering of `\n` separated lines and marshalling Sources into such values.
		 
		 Limits the maximum line\-length to 8KB, if you want to increase this limit provide a value explicitly.
		
		
		
		Returns:
		(undocumented)
		- #### csv
		
		
		
		```
		public [CsvEntityStreamingSupport](CsvEntityStreamingSupport.html "class in akka.http.javadsl.common") csv​(int maxLineLength)
		```
		
		Default `text/csv(UTF-8)` entity streaming support.
		 Provides framing and rendering of `\n` separated lines and marshalling Sources into such values.
		
		Parameters:
		`maxLineLength` \- (undocumented)
		Returns:
		(undocumented)

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/common/CsvEntityStreamingSupport.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/common/EntityStreamingSupport$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/common/JsonEntityStreamingSupport.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/common/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/common/EntityStreamingSupport$.html](https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/common/EntityStreamingSupport$.html)*