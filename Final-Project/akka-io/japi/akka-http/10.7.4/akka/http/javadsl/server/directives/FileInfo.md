---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:05:54Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/directives/FileInfo.html
title: FileInfo
---

# FileInfo

## Content

Package [akka.http.javadsl.server.directives](package-summary.html)
## Class FileInfo

- java.lang.Object
- - akka.http.javadsl.server.directives.FileInfo

- Direct Known Subclasses:
`[FileInfo](../../../scaladsl/server/directives/FileInfo.html "class in akka.http.scaladsl.server.directives")`

---

```
public abstract class FileInfo
extends java.lang.Object
```

Additional metadata about the file being uploaded/that was uploaded using the [`FileUploadDirectives`](FileUploadDirectives.html "class in akka.http.javadsl.server.directives")

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[FileInfo](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `abstract [ContentType](../../model/ContentType.html "interface in akka.http.javadsl.model")` | `[getContentType](#getContentType())()` | Content type of the file |
	| `abstract java.lang.String` | `[getFieldName](#getFieldName())()` | Name of the form field the file was uploaded in |
	| `abstract java.lang.String` | `[getFileName](#getFileName())()` | User specified name of the uploaded file |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### FileInfo
		
		
		
		```
		public FileInfo()
		```

	- ### Method Detail
	
	
	
		- #### getContentType
		
		
		
		```
		public abstract [ContentType](../../model/ContentType.html "interface in akka.http.javadsl.model") getContentType()
		```
		
		Content type of the file
		
		Returns:
		(undocumented)
		- #### getFieldName
		
		
		
		```
		public abstract java.lang.String getFieldName()
		```
		
		Name of the form field the file was uploaded in
		
		Returns:
		(undocumented)
		- #### getFileName
		
		
		
		```
		public abstract java.lang.String getFileName()
		```
		
		User specified name of the uploaded file
		
		Returns:
		(undocumented)

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/ContentType.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/directives/FileUploadDirectives.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/directives/package-summary.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/server/directives/FileInfo.html

---
*Source: [https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/directives/FileInfo.html](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/directives/FileInfo.html)*