---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:18:52Z'
section: getting-started
site: akka-io
source_url: https://doc.akka.io/getting-started/ask-akka-agent/the-agent.html
title: 'Creating the agent :: Akka Documentation'
---

# Creating the agent :: Akka Documentation

## Content

# Creating the agent

|  | **New to Akka? Start here:**   Use the [Build your first agent](../author-your-first-service.html) guide to get a simple agentic service running locally and interact with it. |
| --- | --- |

## Overview

This guide starts with creating an agent. We will incorporate Retrieval\-Augmented Generation (RAG) in the next steps.

In this part of the guide you will:

- Create a new, empty Akka project
- Create an `Agent`
- Create an HTTP endpoint to expose the agent

## Prerequisites

- Java 21, we recommend [Eclipse Adoptium](https://adoptium.net/marketplace/)
- [Apache Maven](https://maven.apache.org/install.html) version 3\.9 or later
- [`curl` command\-line tool](https://curl.se/download.html)
- [OpenAI API key](https://platform.openai.com/api-keys)

## Unfamiliar with concepts like vectors, embeddings or RAG?

We recommend reviewing our [foundational explainer on AI concepts](../../concepts/ai-agents.html#_foundational_ai_concepts_video). It offers helpful background that will deepen your understanding of the technologies and patterns used throughout this tutorial.

## Create the empty project

1. From a command line, use the Akka CLI to create a new project. See [installation instructions](../quick-install-cli.html) if you haven’t installed the CLI yet.

```
akka code init --name helloworld-agent --repo akka-samples/empty.git
```
2. Navigate to the new project directory.
3. Open it in your preferred IDE / Editor.

Alternatively, you can clone the [GitHub Repository](https://github.com/akka-samples/empty) directly:

```
git clone https://github.com/akka-samples/empty.git --depth 1
```

Then navigate to the new project directory and open it in your preferred IDE / Editor.

|  | This guide is written assuming you will follow it as a tutorial to walk through all of the components, building them on your own. If at any time you want to compare your solution with the official sample, check out the [GitHub Repository](https://github.com/akka-samples/ask-akka-agent). |
| --- | --- |

## Add the Agent

Add a new file `AskAkkaAgent.java` to `src/main/java/akka/ask/agent/application/`

AskAkkaAgent.java

```
import akka.javasdk.agent.Agent;
import akka.javasdk.annotations.Component;

@Component(
  id = "ask-akka-agent", (2)
  name = "Ask Akka",
  description = "Expert in Akka"
)
public class AskAkkaAgent extends Agent { (1)

  private static final String SYSTEM_MESSAGE =
    """
    You are a very enthusiastic Akka representative who loves to help people!
    Given the following sections from the Akka SDK documentation, answer the question
    using only that information, outputted in markdown format.
    If you are unsure and the text is not explicitly written in the documentation, say:
    Sorry, I don't know how to help with that.
    """.stripIndent(); (4)

  public StreamEffect ask(String question) { (3)
    return streamEffects()
      .systemMessage(SYSTEM_MESSAGE) (4)
      .userMessage(question) (5)
      .thenReply();
  }
}
```

| **1** | Create a class that extends `Agent`. |
| --- | --- |
| **2** | Make sure to annotate such class with `@Component` and pass a unique identifier for this agent type. |
| **3** | Define the command handler method. |
| **4** | Define the system message. |
| **5** | Define the user message for the specific request. |

The system message provides system\-level instructions to the AI model that defines its behavior and context. The system message acts as a foundational prompt that establishes the AI’s role, constraints, and operational parameters. It is processed before user messages and helps maintain consistent behavior throughout the interactions.

The user message represents the specific query, instruction, or input that will be processed by the model to generate a response.

For this agent we want immediate visual feedback, and use the `StreamEffecct` to be able to stream the response to the client using server\-sent events (SSE).

## Add an Endpoint

Add a new file `AskHttpEndpoint.java` to `src/main/java/akka/ask/agent/api/`

[AskHttpEndpoint.java](https://github.com/akka/akka-sdk/blob/main/samples/ask-akka-agent/src/main/java/akka/ask/agent/api/AskHttpEndpoint.java)

```
@Acl(allow = @Acl.Matcher(principal = Acl.Principal.INTERNET))
@HttpEndpoint("/api")
public class AskHttpEndpoint {

  public record QueryRequest(String userId, String sessionId, String question) {}

  private final ComponentClient componentClient;

  public AskHttpEndpoint(ComponentClient componentClient) { (1)
    this.componentClient = componentClient;
  }

  /**
   * This method runs the search and streams the response to the UI.
   */
  @Post("/ask")
  public HttpResponse ask(QueryRequest request) {
    var sessionId = request.userId() + "-" + request.sessionId();
    var responseStream = componentClient
      .forAgent()
      .inSession(sessionId)
      .tokenStream(AskAkkaAgent::ask)
      .source(request.question); (2)

    return HttpResponses.streamText(responseStream); (3)
  }
}
```

| **1** | Inject the `ComponentClient`, which is used to call the agent. |
| --- | --- |
| **2** | Call the \`AskAkkaAgent created in the previous step |
| **3** | Use the `serverSentEvents` function to easily send a stream via SSE |

The `userId` and `sessionId` parameters are required in `QueryRequest` along with the `question` field.

## Running the service

Akka has support for many AI providers, and this sample is using OpenAI. This is the configuration:

[application.conf](https://github.com/akka/akka-sdk/blob/main/samples/ask-akka-agent/src/main/resources/application.conf)

```
akka.javasdk {
  agent {
    # Other AI models can be configured, see https://doc.akka.io/sdk/agents.html#model
    # and https://doc.akka.io/sdk/model-provider-details.html for the reference configurations.
    model-provider = openai
    # model-provider = googleai-gemini
    # model-provider = anthropic

    openai {
      model-name = "gpt-4o-mini"
      # Environment variable override for the API key
      api-key = ${?OPENAI_API_KEY}
    }

    googleai-gemini {
      model-name = "gemini-2.5-flash"
      api-key = ${?GOOGLE_AI_GEMINI_API_KEY}
    }

    anthropic {
      model-name = "claude-opus-4-6"
      api-key = ${?ANTHROPIC_API_KEY}
      max-tokens = 5000
    }
  }
}

mongodb.uri = "mongodb://user:pass@localhost:27019/?directConnection=true"
mongodb.uri = ${?MONGODB_ATLAS_URI}
```

Set your [OpenAI API key](https://platform.openai.com/api-keys) as an environment variable:

Linux or macOS

```
export OPENAI_API_KEY=your-openai-api-key
```

Windows 10\+

```
set OPENAI_API_KEY=your-openai-api-key
```

Start your service locally:

```
mvn compile exec:java
```

Once successfully started, any defined Endpoints become available at `localhost:9000` and you will see an INFO message that the Akka Runtime has started.

In another shell, you can now use `curl` to send requests to this Endpoint.

```
curl localhost:9000/api/ask --header "Content-Type: application/json" -XPOST \
--data '{ "userId": "001", "sessionId": "foo", \
          "question":"What are the core components of Akka?"}'
```

The AI response will look something like this…​

```
Akka is a toolkit for building highly concurrent, distributed,
and resilient message-driven applications...
1. Actor System ...
2. Actors ...
...
```

This is correct for the Akka libraries, but we want to know about the components in the Akka SDK. We need to give the LLM knowledge about the latest Akka documentation, which is the reason for adding Retrieval\-Augmented Generation (RAG) to the agent.

## Next steps

It’s time to explore our first aspect of the agentic RAG flow: [Knowledge indexing](indexer.html).

## Code Examples

### Example 1: Create the empty project

```command
akka code init --name helloworld-agent --repo akka-samples/empty.git
```

### Example 2: Create the empty project

```command
git clone https://github.com/akka-samples/empty.git --depth 1
```

### Example 3: Add the Agent

```java
import akka.javasdk.agent.Agent;
import akka.javasdk.annotations.Component;

@Component(
  id = "ask-akka-agent", (2)
  name = "Ask Akka",
  description = "Expert in Akka"
)
public class AskAkkaAgent extends Agent { (1)

  private static final String SYSTEM_MESSAGE =
    """
    You are a very enthusiastic Akka representative who loves to help people!
    Given the following sections from the Akka SDK documentation, answer the question
    using only that information, outputted in markdown format.
    If you are unsure and the text is not explicitly written in the documentation, say:
    Sorry, I don't know how to help with that.
    """.stripIndent(); (4)

  public StreamEffect ask(String question) { (3)
    return streamEffects()
      .systemMessage(SYSTEM_MESSAGE) (4)
      .userMessage(question) (5)
      .thenReply();
  }
}
```

### Example 4: Add an Endpoint

```java
@Acl(allow = @Acl.Matcher(principal = Acl.Principal.INTERNET))
@HttpEndpoint("/api")
public class AskHttpEndpoint {

  public record QueryRequest(String userId, String sessionId, String question) {}

  private final ComponentClient componentClient;

  public AskHttpEndpoint(ComponentClient componentClient) { (1)
    this.componentClient = componentClient;
  }

  /**
   * This method runs the search and streams the response to the UI.
   */
  @Post("/ask")
  public HttpResponse ask(QueryRequest request) {
    var sessionId = request.userId() + "-" + request.sessionId();
    var responseStream = componentClient
      .forAgent()
      .inSession(sessionId)
      .tokenStream(AskAkkaAgent::ask)
      .source(request.question); (2)

    return HttpResponses.streamText(responseStream); (3)
  }
}
```

### Example 5: Running the service

```java
akka.javasdk {
  agent {
    # Other AI models can be configured, see https://doc.akka.io/sdk/agents.html#model
    # and https://doc.akka.io/sdk/model-provider-details.html for the reference configurations.
    model-provider = openai
    # model-provider = googleai-gemini
    # model-provider = anthropic

    openai {
      model-name = "gpt-4o-mini"
      # Environment variable override for the API key
      api-key = ${?OPENAI_API_KEY}
    }

    googleai-gemini {
      model-name = "gemini-2.5-flash"
      api-key = ${?GOOGLE_AI_GEMINI_API_KEY}
    }

    anthropic {
      model-name = "claude-opus-4-6"
      api-key = ${?ANTHROPIC_API_KEY}
      max-tokens = 5000
    }
  }
}

mongodb.uri = "mongodb://user:pass@localhost:27019/?directConnection=true"
mongodb.uri = ${?MONGODB_ATLAS_URI}
```

### Example 6: Running the service

```command
export OPENAI_API_KEY=your-openai-api-key
```

### Example 7: Running the service

```command
set OPENAI_API_KEY=your-openai-api-key
```

### Example 8: Running the service

```command
mvn compile exec:java
```

### Example 9: Running the service

```command
curl localhost:9000/api/ask --header "Content-Type: application/json" -XPOST \
--data '{ "userId": "001", "sessionId": "foo", \
          "question":"What are the core components of Akka?"}'
```

### Example 10: Running the service

```none
Akka is a toolkit for building highly concurrent, distributed,
and resilient message-driven applications...
1. Actor System ...
2. Actors ...
...
```

## Related Pages (Internal Links)

- https://doc.akka.io/concepts/ai-agents.html
- https://doc.akka.io/getting-started/ask-akka-agent/indexer.html
- https://doc.akka.io/getting-started/author-your-first-service.html
- https://doc.akka.io/getting-started/quick-install-cli.html

---
*Source: [https://doc.akka.io/getting-started/ask-akka-agent/the-agent.html](https://doc.akka.io/getting-started/ask-akka-agent/the-agent.html)*