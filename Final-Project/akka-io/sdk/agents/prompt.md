---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:19:25Z'
section: sdk
site: akka-io
source_url: https://doc.akka.io/sdk/agents/prompt.html
title: 'Choosing the prompt :: Akka Documentation'
---

# Choosing the prompt :: Akka Documentation

## Content

# Choosing the prompt

The prompt consists of essential instructions to the model.

- The system message provides system\-level instructions to the AI model that defines its behavior and context. The system message acts as a foundational prompt that establishes the AI’s role, constraints, and operational parameters. It is processed before user messages and helps maintain consistent behavior throughout the interactions.
- The user message represents the specific query, instruction, or input that will be processed by the model to generate a response.

An agent that suggests real\-world activities may have a prompt like:

[ActivityAgent.java](https://github.com/akka/akka-sdk/blob/main/samples/doc-snippets/src/main/java/com/example/application/ActivityAgent.java)

```
@Component(id = "activity-agent")
public class ActivityAgent extends Agent {

  private static final String SYSTEM_MESSAGE = (1)
    """
    You are an activity agent. Your job is to suggest activities in the
    real world. Like for example, a team building activity, sports, an
    indoor or outdoor game, board games, a city trip, etc.
    """.stripIndent();

  public Effect<String> query(String message) {
    return effects()
      .systemMessage(SYSTEM_MESSAGE) (2)
      .userMessage(message) (3)
      .thenReply();
  }
}
```

| **1** | Define the system message as a constant, but it could also be a method that adapts the system message based on the request. |
| --- | --- |
| **2** | Use the system message in the effect builder. |
| **3** | Define the user message for the specific request, and use in the effect builder. |

Keep in mind that some models have preferences in how you wrap or label user input within the system prompt and you’ll need to take that into account when defining your system message.

## Multimodal user message

Multimodal AI models can process not only text but also images or PDF, enabling agents to analyze visual content, extract information from documents, or answer questions about images.

To send images or PDF along with text to an AI model, use the `UserMessage` class which supports multimodal content:

[ImageProcessingAgent.java](https://github.com/akka/akka-sdk/blob/main/samples/doc-snippets/src/main/java/com/example/application/ImageProcessingAgent.java)

```
public Effect<String> ask() {
  return effects()
    .systemMessage("You are image analyses tool")
    .userMessage(
      UserMessage.from( (1)
        TextMessageContent.from("What do you see?"), (2)
        ImageMessageContent.fromUrl("https://example/image.png") (3)
      )
    )
    .thenReply();
}
```

| **1** | Create a `UserMessage` with multiple content elements |
| --- | --- |
| **2** | Add text content using `TextMessageContent.from()` |
| **3** | Add image content using `ImageMessageContent.fromUrl()` |

|  | Not all AI models support vision or PDF capabilities. Ensure your configured model provider supports the input types before using multimodal messages. |
| --- | --- |

### Custom content loading

Some AI models are able to fetch images or PDF from publicly accessible URLs. When you need to load content from authenticated endpoints, private storage systems, or custom sources, you can implement a custom `ContentLoader`.

The `ContentLoader` interface provides a single `load` method that receives a `LoadableMessageContent`. Use pattern matching to handle each content type, fetch the data, and return it along with the appropriate MIME type:

[CustomContentLoadingAgent.java](https://github.com/akka/akka-sdk/blob/main/samples/doc-snippets/src/main/java/com/example/application/CustomContentLoadingAgent.java)

```
@Component(id = "custom-content-loading-agent")
public class CustomContentLoadingAgent extends Agent {

  private final HttpClient httpClient;

  public CustomContentLoadingAgent(HttpClient httpClient) {
    this.httpClient = httpClient;
  }

  public class MyContentLoader implements ContentLoader { (1)

    private final String userToken;

    public MyContentLoader(String userToken) {
      this.userToken = userToken;
    }

    @Override
    public LoadedContent load(MessageContent.LoadableMessageContent content) {
      return switch (content) {
        case MessageContent.ImageUrlMessageContent image -> {
          StrictResponse<ByteString> response = httpClient (2)
            .GET(image.url().toString())
            .addCredentials(HttpCredentials.createOAuth2BearerToken(userToken))
            .invoke();

          byte[] data = response.body().toArray();
          String actualMimeType = response
            .httpResponse()
            .entity()
            .getContentType()
            .mediaType()
            .toString(); (3)

          yield new LoadedContent(data, Optional.of(actualMimeType)); (4)
        }
        case MessageContent.PdfUrlMessageContent pdf -> throw new RuntimeException(
          "Not implemented"
        );
      };
    }
  }
```

| **1** | Implement the `ContentLoader` interface |
| --- | --- |
| **2** | Fetch image data with authentication using the URL from `ImageUrlMessageContent` |
| **3** | Extract the actual MIME type of the image from the response |
| **4** | Return `LoadedContent` with the data and MIME type |

To use your custom content loader, pass it to the agent effect builder:

[CustomContentLoadingAgent.java](https://github.com/akka/akka-sdk/blob/main/samples/doc-snippets/src/main/java/com/example/application/CustomContentLoadingAgent.java)

```
public record AnalyzeRequest(String imageUri, String pdfUri, String userToken) {}

public Effect<String> analyzeImage(AnalyzeRequest request) {
  return effects()
    .systemMessage("You are a document analysis assistant.")
    .contentLoader(new MyContentLoader(request.userToken())) (1)
    .userMessage(
      UserMessage.from(
        TextMessageContent.from("Describe this image and summarize the PDF"),
        ImageMessageContent.fromUrl(request.imageUri), (2)
        PdfMessageContent.fromUrl(request.pdfUri) (3)
      )
    )
    .thenReply();
}
```

| **1** | Register the custom content loader with the effect |
| --- | --- |
| **2** | `ImageUrlMessageContent` is passed to your loader when processing the user message |

The content loader instance can be created per\-request like in this example (to support per\-request credentials) or shared globally via dependency injection. If shared, ensure the implementation is thread\-safe as it may be used by multiple concurrent agent interactions.

|  | If the `load` method throws an exception, the entire agent request fails. |
| --- | --- |

## Using dynamic prompts with templates

As an alternative to hard\-coded prompts, there is a built\-in prompt template entity. The advantage of using the prompt template entity is that you can change the prompts at runtime without restarting or redeploying the service. Because the prompt template is managed as an entity, you retain full change history.

ActivityAgent.java

```
@Component(id = "activity-agent")
public class ActivityAgentWithTemplate extends Agent {

  public Effect<String> query(String message) {
    return effects()
      .systemMessageFromTemplate("activity-agent-prompt") (1)
      .userMessage(message) //
      .thenReply();
  }
}
```

| **1** | Define the system message prompt template key. |
| --- | --- |

In addition to the prompt template key you can optionally add parameters to `systemMessageFromTemplate`. Those will be used to format the template with `java.util.Formatter`.

Prompts are stored in the `PromptTemplate` [Event Sourced Entity](../event-sourced-entities.html). This is a built\-in entity, automatically registered at runtime if there are any Agent components in the service. To initialize the prompt or get the current value you can use component client the same way as for any other entity.

[ActivityPromptEndpoint.java](https://github.com/akka/akka-sdk/blob/main/samples/doc-snippets/src/main/java/com/example/api/ActivityPromptEndpoint.java)

```
@HttpEndpoint("/activity-prompts")
public class ActivityPromptEndpoint {

  private final ComponentClient componentClient;

  public ActivityPromptEndpoint(ComponentClient componentClient) {
    this.componentClient = componentClient;
  }

  @Put
  public HttpResponse update(String prompt) {
    componentClient
      .forEventSourcedEntity("activity-agent-prompt") (1)
      .method(PromptTemplate::update) (2)
      .invoke(prompt);

    return HttpResponses.ok();
  }

  @Get
  public String get() {
    return componentClient
      .forEventSourcedEntity("activity-agent-prompt") (1)
      .method(PromptTemplate::get) (3)
      .invoke();
  }
}
```

| **1** | Prompt key is used as entity id. |
| --- | --- |
| **2** | `PromptTemplate::update` update the prompt value. |
| **3** | `PromptTemplate::get` retrieves the current prompt value. |

Keeping the prompt in the Event Sourced Entity lets you see the history of all changes. It’s also possible to subscribe to changes in the prompt template entity, so that you can build a [View](../views.html) or react to changes in the prompt.

The following table describes all of the methods available for the `PromptTemplate` entity:

| Method | Description |
| --- | --- |
| `init` | Initializes the prompt template with a given value. If the prompt template already exists, it will not change it. Useful for setting the initial value, e.g. in the `onStartup` method of the [ServiceSetup](../setup-and-dependency-injection.html#_service_lifecycle). |
| `update` | Updates the prompt template with a new value. If the prompt template does not exist, it will create it. If the value is the same as the current value, it will not change it. |
| `get` | Retrieves the current value of the prompt template. If the prompt template does not exist, it will throw an exception. |
| `getOptional` | Retrieves the current value of the prompt template as an `Optional`. If the prompt template does not exist, it will return an empty `Optional`. |
| `delete` | Deletes the prompt template. |

Although the system message has a dedicated method to use the prompt template, you can also use it for the user message. In that case you have to use the component client to retrieve the current value of the prompt template and pass it as the user message.

## Adding more context

[RAG](../use-cases/rag-and-knowledge.html) is a technique to provide additional, relevant content in the user message.

## Code Examples

### Example 1: Choosing the prompt

```java
@Component(id = "activity-agent")
public class ActivityAgent extends Agent {

  private static final String SYSTEM_MESSAGE = (1)
    """
    You are an activity agent. Your job is to suggest activities in the
    real world. Like for example, a team building activity, sports, an
    indoor or outdoor game, board games, a city trip, etc.
    """.stripIndent();

  public Effect<String> query(String message) {
    return effects()
      .systemMessage(SYSTEM_MESSAGE) (2)
      .userMessage(message) (3)
      .thenReply();
  }
}
```

### Example 2: Multimodal user message

```java
public Effect<String> ask() {
  return effects()
    .systemMessage("You are image analyses tool")
    .userMessage(
      UserMessage.from( (1)
        TextMessageContent.from("What do you see?"), (2)
        ImageMessageContent.fromUrl("https://example/image.png") (3)
      )
    )
    .thenReply();
}
```

### Example 3: Custom content loading

```java
@Component(id = "custom-content-loading-agent")
public class CustomContentLoadingAgent extends Agent {

  private final HttpClient httpClient;

  public CustomContentLoadingAgent(HttpClient httpClient) {
    this.httpClient = httpClient;
  }

  public class MyContentLoader implements ContentLoader { (1)

    private final String userToken;

    public MyContentLoader(String userToken) {
      this.userToken = userToken;
    }

    @Override
    public LoadedContent load(MessageContent.LoadableMessageContent content) {
      return switch (content) {
        case MessageContent.ImageUrlMessageContent image -> {
          StrictResponse<ByteString> response = httpClient (2)
            .GET(image.url().toString())
            .addCredentials(HttpCredentials.createOAuth2BearerToken(userToken))
            .invoke();

          byte[] data = response.body().toArray();
          String actualMimeType = response
            .httpResponse()
            .entity()
            .getContentType()
            .mediaType()
            .toString(); (3)

          yield new LoadedContent(data, Optional.of(actualMimeType)); (4)
        }
        case MessageContent.PdfUrlMessageContent pdf -> throw new RuntimeException(
          "Not implemented"
        );
      };
    }
  }
```

### Example 4: Custom content loading

```java
public record AnalyzeRequest(String imageUri, String pdfUri, String userToken) {}

public Effect<String> analyzeImage(AnalyzeRequest request) {
  return effects()
    .systemMessage("You are a document analysis assistant.")
    .contentLoader(new MyContentLoader(request.userToken())) (1)
    .userMessage(
      UserMessage.from(
        TextMessageContent.from("Describe this image and summarize the PDF"),
        ImageMessageContent.fromUrl(request.imageUri), (2)
        PdfMessageContent.fromUrl(request.pdfUri) (3)
      )
    )
    .thenReply();
}
```

### Example 5: Using dynamic prompts with templates

```java
@Component(id = "activity-agent")
public class ActivityAgentWithTemplate extends Agent {

  public Effect<String> query(String message) {
    return effects()
      .systemMessageFromTemplate("activity-agent-prompt") (1)
      .userMessage(message) //
      .thenReply();
  }
}
```

### Example 6: Using dynamic prompts with templates

```java
@HttpEndpoint("/activity-prompts")
public class ActivityPromptEndpoint {

  private final ComponentClient componentClient;

  public ActivityPromptEndpoint(ComponentClient componentClient) {
    this.componentClient = componentClient;
  }

  @Put
  public HttpResponse update(String prompt) {
    componentClient
      .forEventSourcedEntity("activity-agent-prompt") (1)
      .method(PromptTemplate::update) (2)
      .invoke(prompt);

    return HttpResponses.ok();
  }

  @Get
  public String get() {
    return componentClient
      .forEventSourcedEntity("activity-agent-prompt") (1)
      .method(PromptTemplate::get) (3)
      .invoke();
  }
}
```

## Related Pages (Internal Links)

- https://doc.akka.io/sdk/event-sourced-entities.html
- https://doc.akka.io/sdk/setup-and-dependency-injection.html
- https://doc.akka.io/sdk/use-cases/rag-and-knowledge.html
- https://doc.akka.io/sdk/views.html

---
*Source: [https://doc.akka.io/sdk/agents/prompt.html](https://doc.akka.io/sdk/agents/prompt.html)*