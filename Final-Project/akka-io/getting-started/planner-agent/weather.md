---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:18:50Z'
section: getting-started
site: akka-io
source_url: https://doc.akka.io/getting-started/planner-agent/weather.html
title: 'Weather agent :: Akka Documentation'
---

# Weather agent :: Akka Documentation

## Content

# Weather agent

|  | **New to Akka? Start here:**   Use the [Build your first agent](../author-your-first-service.html) guide to get a simple agentic service running locally and interact with it. |
| --- | --- |

## Overview

Activities may depend on the weather, so let’s add an agent that retrieves a weather forecast.

In this part of the guide you will:

- Create an agent for the weather forecast that uses an external service as a function tool
- Make a request to the external `api.weatherapi.com` service

## Prerequisites

- Java 21, we recommend [Eclipse Adoptium](https://adoptium.net/marketplace/)
- [Apache Maven](https://maven.apache.org/install.html) version 3\.9 or later
- [`curl` command\-line tool](https://curl.se/download.html)
- [OpenAI API key](https://platform.openai.com/api-keys)

## Add the agent

Add a new file `WeatherAgent.java` to `src/main/java/com/example/application/`

WeatherAgent.java

```
import akka.javasdk.agent.Agent;
import akka.javasdk.annotations.Component;
import akka.javasdk.annotations.Description;
import akka.javasdk.annotations.FunctionTool;
import akka.javasdk.http.HttpClient;
import akka.javasdk.http.HttpClientProvider;
import java.nio.charset.StandardCharsets;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Component(id = "weather-agent")
public class WeatherAgent extends Agent {

  private static final String SYSTEM_MESSAGE = (1)
    """
    You are a weather agent.
    Your job is to provide weather information.
    You provide current weather, forecasts, and other related information.

    The responses from the weather services are in json format. You need to digest
    it into human language. Be aware that Celsius temperature is in temp_c field.
    Fahrenheit temperature is in temp_f field.
    """.stripIndent();

  private final HttpClient httpClient;

  public WeatherAgent(HttpClientProvider httpClientProvider) { (2)
    this.httpClient = httpClientProvider.httpClientFor("https://api.weatherapi.com");
  }

  public Effect<String> query(String message) {
    return effects().systemMessage(SYSTEM_MESSAGE).userMessage(message).thenReply();
  }

  @FunctionTool(description = "Returns the current weather forecast for a given city.")
  private String getCurrentWeather( (3)
    @Description("A location or city name.") String location
  ) {
    var date = LocalDateTime.now().format(DateTimeFormatter.ISO_LOCAL_DATE);

    var encodedLocation = java.net.URLEncoder.encode(location, StandardCharsets.UTF_8);
    var apiKey = System.getenv("WEATHER_API_KEY");
    if (apiKey == null || apiKey.isBlank()) {
      throw new RuntimeException(
        "Make sure you have WEATHER_API_KEY defined as environment variable."
      );
    }

    String url = String.format(
      "/v1/current.json?&q=%s&aqi=no&key=%s&dt=%s",
      encodedLocation,
      apiKey,
      date
    );
    return httpClient.GET(url).invoke().body().utf8String();
  }
}
```

| **1** | Instructions for the weather agent. |
| --- | --- |
| **2** | Inject the `HttpClientProvider`. |
| **3** | Provide the weather forecast as a function tool. |

Methods annotated with `@FunctionTool` in the agent will automatically be made available to the AI model, which will extract the location from the original query and request to execute the tool to retrieve the forecast.

If you don’t want to use the real weather service, you can change the implementation to return a hard\-coded weather, such as `"It’s always sunny"`.

We could make a request to the `WeatherAgent` from the endpoint before calling the `ActivityAgent` but a better approach is to introduce a workflow that orchestrates the calls between the agents.

## Test the agent

Before introducing the workflow we would like to see that the `WeatherAgent` works in isolation.

Add a new file `WeatherAgentIntegrationTest.java` to `src/test/com/example/application/`

WeatherAgentIntegrationTest.java

```
import akka.javasdk.testkit.TestKitSupport;
import java.util.UUID;
import org.junit.jupiter.api.Test;

public class WeatherAgentIntegrationTest extends TestKitSupport { (1)

  @Test
  public void testAgent() {
    var sessionId = UUID.randomUUID().toString();
    var message = "I am in Madrid";
    var forecast = componentClient
      .forAgent()
      .inSession(sessionId)
      .method(WeatherAgent::query) (2)
      .invoke(message);

    System.out.println(forecast); (3)
    assertThat(forecast).isNotBlank();
  }
}
```

| **1** | Extend `TestKitSupport`. |
| --- | --- |
| **2** | Use the component client to call the agent. |
| **3** | Not much we can assert, since the weather is different every day, but at least we can see the result and that it doesn’t fail. |

You can sign up for a free API for the weather service at <https://www.weatherapi.com> and then expose it as an environment variable:

Linux or macOS

```
export WEATHER_API_KEY=your-openai-api-key
```

Windows 10\+

```
set WEATHER_API_KEY=your-openai-api-key
```

This test is using real LLM requests, and you must set your [OpenAI API key](https://platform.openai.com/api-keys) as an environment variable:

Linux or macOS

```
export OPENAI_API_KEY=your-openai-api-key
```

Windows 10\+

```
set OPENAI_API_KEY=your-openai-api-key
```

Run the test with

```
mvn verify
```

## Next steps

- Introduce a workflow that orchestrates the calls between the agents. Continue with [Orchestrate the agents](team.html)
- Learn more about more possibilities of [extending agents with function tools](../../sdk/agents.html#tools).

## Code Examples

### Example 1: Add the agent

```java
import akka.javasdk.agent.Agent;
import akka.javasdk.annotations.Component;
import akka.javasdk.annotations.Description;
import akka.javasdk.annotations.FunctionTool;
import akka.javasdk.http.HttpClient;
import akka.javasdk.http.HttpClientProvider;
import java.nio.charset.StandardCharsets;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Component(id = "weather-agent")
public class WeatherAgent extends Agent {

  private static final String SYSTEM_MESSAGE = (1)
    """
    You are a weather agent.
    Your job is to provide weather information.
    You provide current weather, forecasts, and other related information.

    The responses from the weather services are in json format. You need to digest
    it into human language. Be aware that Celsius temperature is in temp_c field.
    Fahrenheit temperature is in temp_f field.
    """.stripIndent();

  private final HttpClient httpClient;

  public WeatherAgent(HttpClientProvider httpClientProvider) { (2)
    this.httpClient = httpClientProvider.httpClientFor("https://api.weatherapi.com");
  }

  public Effect<String> query(String message) {
    return effects().systemMessage(SYSTEM_MESSAGE).userMessage(message).thenReply();
  }

  @FunctionTool(description = "Returns the current weather forecast for a given city.")
  private String getCurrentWeather( (3)
    @Description("A location or city name.") String location
  ) {
    var date = LocalDateTime.now().format(DateTimeFormatter.ISO_LOCAL_DATE);

    var encodedLocation = java.net.URLEncoder.encode(location, StandardCharsets.UTF_8);
    var apiKey = System.getenv("WEATHER_API_KEY");
    if (apiKey == null || apiKey.isBlank()) {
      throw new RuntimeException(
        "Make sure you have WEATHER_API_KEY defined as environment variable."
      );
    }

    String url = String.format(
      "/v1/current.json?&q=%s&aqi=no&key=%s&dt=%s",
      encodedLocation,
      apiKey,
      date
    );
    return httpClient.GET(url).invoke().body().utf8String();
  }
}
```

### Example 2: Test the agent

```java
import akka.javasdk.testkit.TestKitSupport;
import java.util.UUID;
import org.junit.jupiter.api.Test;

public class WeatherAgentIntegrationTest extends TestKitSupport { (1)

  @Test
  public void testAgent() {
    var sessionId = UUID.randomUUID().toString();
    var message = "I am in Madrid";
    var forecast = componentClient
      .forAgent()
      .inSession(sessionId)
      .method(WeatherAgent::query) (2)
      .invoke(message);

    System.out.println(forecast); (3)
    assertThat(forecast).isNotBlank();
  }
}
```

### Example 3: Test the agent

```command
export WEATHER_API_KEY=your-openai-api-key
```

### Example 4: Test the agent

```command
set WEATHER_API_KEY=your-openai-api-key
```

### Example 5: Test the agent

```command
export OPENAI_API_KEY=your-openai-api-key
```

### Example 6: Test the agent

```command
set OPENAI_API_KEY=your-openai-api-key
```

### Example 7: Test the agent

```command
mvn verify
```

## Related Pages (Internal Links)

- https://doc.akka.io/getting-started/author-your-first-service.html
- https://doc.akka.io/getting-started/planner-agent/team.html
- https://doc.akka.io/sdk/agents.html

---
*Source: [https://doc.akka.io/getting-started/planner-agent/weather.html](https://doc.akka.io/getting-started/planner-agent/weather.html)*