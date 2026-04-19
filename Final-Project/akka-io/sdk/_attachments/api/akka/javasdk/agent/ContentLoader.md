---
description: 'declaration: package: akka.javasdk.agent, interface: ContentLoader'
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:31:04Z'
section: sdk
site: akka-io
source_url: https://doc.akka.io/sdk/_attachments/api/akka/javasdk/agent/ContentLoader.html
title: ContentLoader
---

# ContentLoader

> **Summary:** declaration: package: akka.javasdk.agent, interface: ContentLoader

## Content

Package [akka.javasdk.agent](package-summary.html)
# Interface ContentLoader

All Known Subinterfaces:
`[ImageLoader](ImageLoader.html "interface in akka.javasdk.agent")`

---

public interface ContentLoader
Interface for loading content from URIs.

 Implement this interface to provide custom content loading logic for [`MessageContent.LoadableMessageContent`](MessageContent.LoadableMessageContent.html "interface in akka.javasdk.agent") types. This is useful when content must
 be fetched from custom sources such as cloud storage, databases, or authenticated endpoints.

 

Example implementation:

 

```

 public class MyContentLoader implements ContentLoader {
   @Override
   public LoadedContent load(MessageContent.LoadableMessageContent content) {
     return switch (content) {
       case MessageContent.ImageUrlMessageContent image -> {
         byte[] data = fetchFromStorage(image.url());
         String mimeType = image.mimeType().orElse("image/jpeg");
         yield new LoadedContent(data, Optional.of(mimeType));
       }
       case MessageContent.PdfUrlMessageContent pdf -> {
         byte[] data = fetchFromStorage(pdf.url());
         yield new LoadedContent(data);
       }
     };
   }
 }
 
```

To use the content loader, pass it to the agent effect builder:

 

```

 return effects()
     .contentLoader(new MyContentLoader())
     .userMessage(UserMessage.from(
         MessageContent.TextMessageContent.from("Describe this image"),
         MessageContent.ImageMessageContent.fromUrl(imageUrl)))
     .thenReply();
 
```

The instance used could be a new one for each agent request, to for example allow per\-request
 credentials, or it could be created globally in the service bootstrap, and made available to each
 agent via dependency injection.

 

In case of a shared instance, care must be taken that it is thread safe since it can be used
 by multiple separate agent interactions concurrently.

See Also:

- [`Agent.Effect.Builder.contentLoader(ContentLoader)`](Agent.Effect.Builder.html#contentLoader(akka.javasdk.agent.ContentLoader))

- ## Nested Class Summary

Nested Classes

Modifier and Type
Interface
Description
`static final record`
`[ContentLoader.LoadedContent](ContentLoader.LoadedContent.html "class in akka.javasdk.agent")`

Represents loaded content with its binary data and MIME type.
- ## Method Summary

Modifier and Type
Method
Description
`[ContentLoader.LoadedContent](ContentLoader.LoadedContent.html "class in akka.javasdk.agent")`
`[load](#load(akka.javasdk.agent.MessageContent.LoadableMessageContent))([MessageContent.LoadableMessageContent](MessageContent.LoadableMessageContent.html "interface in akka.javasdk.agent") content)`

Loads content from the given loadable message content.

- ## Method Details

	- ### load
	
	
	[ContentLoader.LoadedContent](ContentLoader.LoadedContent.html "class in akka.javasdk.agent") load([MessageContent.LoadableMessageContent](MessageContent.LoadableMessageContent.html "interface in akka.javasdk.agent") content)
	Loads content from the given loadable message content.
	
	 This method is called by the runtime when processing multimodal messages that contain
	 URL\-referenced content. The implementation should fetch the content data and return it along
	 with the appropriate MIME type.
	
	 
	
	Use pattern matching on the content parameter to handle different content types:
	
	 
	
	
		- [`MessageContent.ImageUrlMessageContent`](MessageContent.ImageUrlMessageContent.html "class in akka.javasdk.agent") — provides the URL, detail level, and
		 optional MIME type hint
		- [`MessageContent.PdfUrlMessageContent`](MessageContent.PdfUrlMessageContent.html "class in akka.javasdk.agent") — provides the URL of the PDF
	If the method throws, the entire agent request is failed.
	
	
	
	Parameters:
	`content` \- The loadable message content containing the URL and metadata
	Returns:
	The loaded content data and MIME type

## Code Examples

### Example 1: Interface ContentLoader

```text
public class MyContentLoader implements ContentLoader {
   @Override
   public LoadedContent load(MessageContent.LoadableMessageContent content) {
     return switch (content) {
       case MessageContent.ImageUrlMessageContent image -> {
         byte[] data = fetchFromStorage(image.url());
         String mimeType = image.mimeType().orElse("image/jpeg");
         yield new LoadedContent(data, Optional.of(mimeType));
       }
       case MessageContent.PdfUrlMessageContent pdf -> {
         byte[] data = fetchFromStorage(pdf.url());
         yield new LoadedContent(data);
       }
     };
   }
 }
```

### Example 2: Interface ContentLoader

```text
return effects()
     .contentLoader(new MyContentLoader())
     .userMessage(UserMessage.from(
         MessageContent.TextMessageContent.from("Describe this image"),
         MessageContent.ImageMessageContent.fromUrl(imageUrl)))
     .thenReply();
```

## Related Pages (Internal Links)

- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/agent/Agent.Effect.Builder.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/agent/ContentLoader.LoadedContent.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/agent/ImageLoader.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/agent/MessageContent.ImageUrlMessageContent.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/agent/MessageContent.LoadableMessageContent.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/agent/MessageContent.PdfUrlMessageContent.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/agent/package-summary.html

---
*Source: [https://doc.akka.io/sdk/_attachments/api/akka/javasdk/agent/ContentLoader.html](https://doc.akka.io/sdk/_attachments/api/akka/javasdk/agent/ContentLoader.html)*