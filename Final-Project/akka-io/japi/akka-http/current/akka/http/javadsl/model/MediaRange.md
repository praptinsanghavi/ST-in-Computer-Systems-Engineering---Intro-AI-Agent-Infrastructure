---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T23:46:27Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/MediaRange.html
title: MediaRange
---

# MediaRange

## Content

Package [akka.http.javadsl.model](package-summary.html)
## Class MediaRange

- java.lang.Object
- - akka.http.javadsl.model.MediaRange

- Direct Known Subclasses:
`[MediaRange](../../scaladsl/model/MediaRange.html "class in akka.http.scaladsl.model")`

---

```
public abstract class MediaRange
extends java.lang.Object
```

Represents an Http media\-range. A media\-range either matches a single media\-type
 or it matches all media\-types of a given main\-type. Each range can specify a qValue
 or other parameters.

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[MediaRange](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `abstract java.util.Map<java.lang.String,​java.lang.String>` | `[getParams](#getParams())()` | Returns a Map of the parameters of this media\-range. |
	| `abstract java.lang.String` | `[mainType](#mainType())()` | Returns the main\-type this media\-range matches. |
	| `abstract boolean` | `[matches](#matches(akka.http.javadsl.model.MediaType))​([MediaType](MediaType.html "interface in akka.http.javadsl.model") mediaType)` | Checks if this range matches a given media\-type. |
	| `abstract float` | `[qValue](#qValue())()` | Returns the qValue of this media\-range. |
	| `abstract [MediaRange](MediaRange.html "class in akka.http.javadsl.model")` | `[withQValue](#withQValue(float))​(float qValue)` | Returns a copy of this instance with a changed qValue. |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### MediaRange
		
		
		
		```
		public MediaRange()
		```

	- ### Method Detail
	
	
	
		- #### mainType
		
		
		
		```
		public abstract java.lang.String mainType()
		```
		
		Returns the main\-type this media\-range matches.
		- #### qValue
		
		
		
		```
		public abstract float qValue()
		```
		
		Returns the qValue of this media\-range.
		- #### matches
		
		
		
		```
		public abstract boolean matches​([MediaType](MediaType.html "interface in akka.http.javadsl.model") mediaType)
		```
		
		Checks if this range matches a given media\-type.
		- #### getParams
		
		
		
		```
		public abstract java.util.Map<java.lang.String,​java.lang.String> getParams()
		```
		
		Returns a Map of the parameters of this media\-range.
		- #### withQValue
		
		
		
		```
		public abstract [MediaRange](MediaRange.html "class in akka.http.javadsl.model") withQValue​(float qValue)
		```
		
		Returns a copy of this instance with a changed qValue.

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/MediaRange.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/MediaType.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/package-summary.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/MediaRange.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/MediaRange.html](https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/MediaRange.html)*