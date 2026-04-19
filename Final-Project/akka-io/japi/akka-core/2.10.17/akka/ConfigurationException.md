---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T15:14:20Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10.17/akka/ConfigurationException.html
title: ConfigurationException
---

# ConfigurationException

## Content

Package [akka](package-summary.html)
## Class ConfigurationException

- java.lang.Object
- - java.lang.Throwable
	- - java.lang.Exception
		- - java.lang.RuntimeException
			- - [akka.AkkaException](AkkaException.html "class in akka")
				- - akka.ConfigurationException

- All Implemented Interfaces:
`java.io.Serializable`

---

```
public class ConfigurationException
extends [AkkaException](AkkaException.html "class in akka")
```

This exception is thrown when Akka detects a problem with the provided configuration

See Also:
[Serialized Form](../serialized-form.html#akka.ConfigurationException)

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[ConfigurationException](#%3Cinit%3E(java.lang.String))​(java.lang.String msg)` |  |
	| `[ConfigurationException](#%3Cinit%3E(java.lang.String,java.lang.Throwable))​(java.lang.String message,  java.lang.Throwable cause)` |  |

	- ### Method Summary
	
	
		- ### Methods inherited from class java.lang.Throwable
		
		
		`addSuppressed, fillInStackTrace, getCause, getLocalizedMessage, getMessage, getStackTrace, getSuppressed, initCause, printStackTrace, printStackTrace, printStackTrace, setStackTrace, toString`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### ConfigurationException
		
		
		
		```
		public ConfigurationException​(java.lang.String message,
		                              java.lang.Throwable cause)
		```
		- #### ConfigurationException
		
		
		
		```
		public ConfigurationException​(java.lang.String msg)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10.17/akka/AkkaException.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10.17/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10.17/akka/ConfigurationException.html](https://doc.akka.io/japi/akka-core/2.10.17/akka/ConfigurationException.html)*