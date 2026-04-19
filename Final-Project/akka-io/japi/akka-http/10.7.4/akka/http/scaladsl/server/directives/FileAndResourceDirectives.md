---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T02:10:01Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/server/directives/FileAndResourceDirectives.ResourceFile.html
title: FileAndResourceDirectives.ResourceFile
---

# FileAndResourceDirectives.ResourceFile

## Content

Package [akka.http.scaladsl.server.directives](package-summary.html)
## Class FileAndResourceDirectives.ResourceFile

- java.lang.Object
- - akka.http.scaladsl.server.directives.FileAndResourceDirectives.ResourceFile

- All Implemented Interfaces:
`java.io.Serializable`, `scala.Equals`, `scala.Product`

Enclosing interface:
[FileAndResourceDirectives](FileAndResourceDirectives.html "interface in akka.http.scaladsl.server.directives")

---

```
public static class FileAndResourceDirectives.ResourceFile
extends java.lang.Object
implements scala.Product, java.io.Serializable
```

See Also:
[Serialized Form](../../../../../serialized-form.html#akka.http.scaladsl.server.directives.FileAndResourceDirectives.ResourceFile)

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[ResourceFile](#%3Cinit%3E(java.net.URL,long,long))​(java.net.URL url,  long length,  long lastModified)` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `long` | `[lastModified](#lastModified())()` |  |
	| `long` | `[length](#length())()` |  |
	| `java.net.URL` | `[url](#url())()` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`
		- ### Methods inherited from interface scala.Equals
		
		
		`canEqual, equals`
		- ### Methods inherited from interface scala.Product
		
		
		`productArity, productElement, productElementName, productElementNames, productIterator, productPrefix`

- - ### Constructor Detail
	
	
	
		- #### ResourceFile
		
		
		
		```
		public ResourceFile​(java.net.URL url,
		                    long length,
		                    long lastModified)
		```

	- ### Method Detail
	
	
	
		- #### url
		
		
		
		```
		public java.net.URL url()
		```
		- #### length
		
		
		
		```
		public long length()
		```
		- #### lastModified
		
		
		
		```
		public long lastModified()
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/server/directives/FileAndResourceDirectives.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/server/directives/package-summary.html
- https://doc.akka.io/japi/akka-http/10.7.4/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/server/directives/FileAndResourceDirectives.ResourceFile.html](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/server/directives/FileAndResourceDirectives.ResourceFile.html)*