---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T23:46:28Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/MediaRanges.html
title: MediaRanges
---

# MediaRanges

## Content

Package [akka.http.javadsl.model](package-summary.html)
## Class MediaRanges

- java.lang.Object
- - akka.http.javadsl.model.MediaRanges

- ---

```
public final class MediaRanges
extends java.lang.Object
```

Contains a set of predefined media\-ranges and static methods to create custom ones.

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [MediaRange](MediaRange.html "class in akka.http.javadsl.model")` | `[ALL](#ALL)` |  |
	| `static [MediaRange](MediaRange.html "class in akka.http.javadsl.model")` | `[ALL_APPLICATION](#ALL_APPLICATION)` |  |
	| `static [MediaRange](MediaRange.html "class in akka.http.javadsl.model")` | `[ALL_AUDIO](#ALL_AUDIO)` |  |
	| `static [MediaRange](MediaRange.html "class in akka.http.javadsl.model")` | `[ALL_IMAGE](#ALL_IMAGE)` |  |
	| `static [MediaRange](MediaRange.html "class in akka.http.javadsl.model")` | `[ALL_MESSAGE](#ALL_MESSAGE)` |  |
	| `static [MediaRange](MediaRange.html "class in akka.http.javadsl.model")` | `[ALL_MULTIPART](#ALL_MULTIPART)` |  |
	| `static [MediaRange](MediaRange.html "class in akka.http.javadsl.model")` | `[ALL_TEXT](#ALL_TEXT)` |  |
	| `static [MediaRange](MediaRange.html "class in akka.http.javadsl.model")` | `[ALL_VIDEO](#ALL_VIDEO)` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `static [MediaRange](MediaRange.html "class in akka.http.javadsl.model")` | `[create](#create(akka.http.javadsl.model.MediaType))​([MediaType](MediaType.html "interface in akka.http.javadsl.model") mediaType)` | Creates a custom universal media\-range for a given main\-type. |
	| `static [MediaRange](MediaRange.html "class in akka.http.javadsl.model")` | `[create](#create(akka.http.javadsl.model.MediaType,float))​([MediaType](MediaType.html "interface in akka.http.javadsl.model") mediaType,  float qValue)` | Creates a custom universal media\-range for a given main\-type and qValue. |
	| `static [MediaRange](MediaRange.html "class in akka.http.javadsl.model")` | `[custom](#custom(java.lang.String,java.util.Map))​(java.lang.String mainType,  java.util.Map<java.lang.String,​java.lang.String> parameters)` | Creates a custom universal media\-range for a given main\-type and a Map of parameters. |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### ALL
		
		
		
		```
		public static final [MediaRange](MediaRange.html "class in akka.http.javadsl.model") ALL
		```
		- #### ALL\_APPLICATION
		
		
		
		```
		public static final [MediaRange](MediaRange.html "class in akka.http.javadsl.model") ALL_APPLICATION
		```
		- #### ALL\_AUDIO
		
		
		
		```
		public static final [MediaRange](MediaRange.html "class in akka.http.javadsl.model") ALL_AUDIO
		```
		- #### ALL\_IMAGE
		
		
		
		```
		public static final [MediaRange](MediaRange.html "class in akka.http.javadsl.model") ALL_IMAGE
		```
		- #### ALL\_MESSAGE
		
		
		
		```
		public static final [MediaRange](MediaRange.html "class in akka.http.javadsl.model") ALL_MESSAGE
		```
		- #### ALL\_MULTIPART
		
		
		
		```
		public static final [MediaRange](MediaRange.html "class in akka.http.javadsl.model") ALL_MULTIPART
		```
		- #### ALL\_TEXT
		
		
		
		```
		public static final [MediaRange](MediaRange.html "class in akka.http.javadsl.model") ALL_TEXT
		```
		- #### ALL\_VIDEO
		
		
		
		```
		public static final [MediaRange](MediaRange.html "class in akka.http.javadsl.model") ALL_VIDEO
		```

	- ### Method Detail
	
	
	
		- #### create
		
		
		
		```
		public static [MediaRange](MediaRange.html "class in akka.http.javadsl.model") create​([MediaType](MediaType.html "interface in akka.http.javadsl.model") mediaType)
		```
		
		Creates a custom universal media\-range for a given main\-type.
		- #### custom
		
		
		
		```
		public static [MediaRange](MediaRange.html "class in akka.http.javadsl.model") custom​(java.lang.String mainType,
		                                java.util.Map<java.lang.String,​java.lang.String> parameters)
		```
		
		Creates a custom universal media\-range for a given main\-type and a Map of parameters.
		- #### create
		
		
		
		```
		public static [MediaRange](MediaRange.html "class in akka.http.javadsl.model") create​([MediaType](MediaType.html "interface in akka.http.javadsl.model") mediaType,
		                                float qValue)
		```
		
		Creates a custom universal media\-range for a given main\-type and qValue.

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/MediaRange.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/MediaType.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/MediaRanges.html](https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/MediaRanges.html)*