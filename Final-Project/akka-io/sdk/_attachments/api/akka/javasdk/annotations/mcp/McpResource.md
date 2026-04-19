---
description: 'declaration: package: akka.javasdk.annotations.mcp, annotation type:
  McpResource'
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:32:16Z'
section: sdk
site: akka-io
source_url: https://doc.akka.io/sdk/_attachments/api/akka/javasdk/annotations/mcp/McpResource.html
title: McpResource
---

# McpResource

> **Summary:** declaration: package: akka.javasdk.annotations.mcp, annotation type: McpResource

## Content

Package [akka.javasdk.annotations.mcp](package-summary.html)
# Annotation Interface McpResource

---

[@Target](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/annotation/Target.html "class or interface in java.lang.annotation")([METHOD](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/annotation/ElementType.html#METHOD "class or interface in java.lang.annotation"))
[@Retention](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/annotation/Retention.html "class or interface in java.lang.annotation")([RUNTIME](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/annotation/RetentionPolicy.html#RUNTIME "class or interface in java.lang.annotation"))
[@Documented](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/annotation/Documented.html "class or interface in java.lang.annotation")
public @interface McpResource
Annotation to expose a method as an MCP resource that clients can fetch.

 MCP resources provide static or dynamic content that AI models can access to gather
 information. Resources can be static files, configuration data, or dynamically generated content
 based on parameters.

 

**Resource Types:**

- **Static Resources:** Use [`uri()`](#uri()) for fixed content with no parameters
- **Dynamic Resources:** Use [`uriTemplate()`](#uriTemplate()) for parameterized content

**Method Requirements:**

- Must be public
- For static resources (`uri`): no parameters allowed
- For dynamic resources (`uriTemplate`): parameters must match template placeholders
- Must be in a class annotated with [`McpEndpoint`](McpEndpoint.html "annotation interface in akka.javasdk.annotations.mcp")

**Return Types:**

- `String`: Returns as UTF\-8 encoded text resource
- `byte[]`: Returns as base64 encoded binary resource
- Other types: Encoded to JSON with `application/json` MIME type

**URI Templates:** Templates can contain named placeholders for entire path
 segments only. Each placeholder must match a method parameter name. For example: `"file:///images/{category}/{file}"` matches `file:///images/bicycles/tall_bike.jpg` and
 passes `"bicycles"` as `category` and `"tall_bike.jpg"` as `file`.

 

**Security:** Always validate input parameters to prevent path traversal attacks
 or unauthorized access.

- ## Required Element Summary

Required Elements

Modifier and Type
Required Element
Description
`[String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang")`
`[name](#name())`
- ## Optional Element Summary

Optional Elements

Modifier and Type
Optional Element
Description
`[String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang")`
`[description](#description())`
 
`[String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang")`
`[mimeType](#mimeType())`
 
`[String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang")`
`[uri](#uri())`
 
`[String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang")`
`[uriTemplate](#uriTemplate())`

- ## Element Details

	- ### uri
	
	
	[String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang") uri
	
	Returns:
	A unique URI identifying the resource. If this is defined `uriTemplate` must be
	 empty.
	
	
	Default:
	`""`
	- ### uriTemplate
	
	
	[String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang") uriTemplate
	
	Returns:
	A resource template path that can be used to create a URI that will identify a
	 resource. If defined, `uri` must be empty, the URI template string can contain named
	 variable placeholders for entire segments only. Each variable name must match a method
	 parameter name. The method parameters must be of type `String`. For example: `"file:///images/{category}/{file}"` will match a resource request for `file:///images/bicycles/tall_bike.jpg` and pass `bicycles` as the `category`
	 parameter and `tall_bike.jpg` as the `file` parameter.
	
	
	Default:
	`""`
	- ### name
	
	
	[String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang") name
	
	Returns:
	A human\-readable name for this resource. Clients can use this to populate UI elements,
	 for example.
	- ### description
	
	
	[String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang") description
	
	Returns:
	A description of what this resource represents. Clients can use this to improve the
	 LLM's understanding of available resources. It can be thought of as a "hint" to the model.
	
	
	Default:
	`""`
	- ### mimeType
	
	
	[String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang") mimeType
	
	Returns:
	The MIME type of this resource. If not defined, String output will be presented as
	 `text/plain` and byte arrays as `appli`
	
	
	Default:
	`""`

## Related Pages (Internal Links)

- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/annotations/mcp/McpEndpoint.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/annotations/mcp/package-summary.html

---
*Source: [https://doc.akka.io/sdk/_attachments/api/akka/javasdk/annotations/mcp/McpResource.html](https://doc.akka.io/sdk/_attachments/api/akka/javasdk/annotations/mcp/McpResource.html)*