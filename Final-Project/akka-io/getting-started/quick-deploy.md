---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:19:07Z'
section: getting-started
site: akka-io
source_url: https://doc.akka.io/getting-started/quick-deploy.html
title: 'Deploy to akka.io :: Akka Documentation'
---

# Deploy to akka.io :: Akka Documentation

## Content

# Deploy to akka.io

|  | **New to Akka? Start here:**   Use the [Build your first agent](author-your-first-service.html) guide to get a simple agentic service running locally and interact with it. |
| --- | --- |

You’ve built and tried the service locally, it’s time to run it on the Akka Agentic Platform without having to change any code.

1. If you have not already done so, [install the Akka CLI](../operations/cli/installation.html).
2. Authenticate the CLI with your Akka account:

```
akka auth login
```
3. Build a container image of your service:

|  | The `mvn install` command of the Maven Docker plugin connects to the locally running Docker daemon. Check your active Docker context with `docker context list`. You may overwrite it through the `DOCKER_HOST` environment value. |
| --- | --- |

```
mvn clean install -DskipTests
```
4. Take note of the container name and tag from the last line in the output, for example:

```
DOCKER> Tagging image helloworld-agent:1.0-SNAPSHOT-20250630102843 successful!
```
5. Set up secret containing the API key:

```
akka secret create generic openai-api --literal key=$OPENAI_API_KEY
```
6. Deploy your service, replacing:

	- `container-name` with the container name from the `mvn install` output in the previous step
	- `tag-name` with the tag name from the `mvn install` output in the previous step

```
akka service deploy helloworld-service helloworld-agent:tag-name --push \
  --secret-env OPENAI_API_KEY=openai-api/key
```

Your service named `helloworld-service` will now begin deploying.
7. Verify the deployment status of your service:

```
akka service list
```

A service status can be one of the following:

	- **Ready**: All service instances are up\-to\-date and fully available.
	- **UpdateInProgress**: Service is updating.
	- **Unavailable**: No service instances are available.
	- **PartiallyReady**: Some, but not all, service instances are available.
	Approximately one minute after deploying, your service status should become **Ready**.
8. Expose your service to the internet:

```
akka service expose helloworld-service
```

Should respond with something similar to (the exact address will be unique to your service):

```
Service 'helloworld-service' was successfully exposed at: spring-tooth-3406.gcp-us-east1.akka.services
```

Congratulations! You have successfully deployed your service. You can now access it using the hostname described in the output of the command above.

## Invoke your deployed service

You can use [cURL](https://curl.se) to invoke your service, replacing URL with the hostname from the previous step.

Make an HTTP request to the service:

```
curl -i -XPOST --location "https://spring-tooth-3406.gcp-us-east1.akka.services[http://localhost:9000]/hello" \
    --header "Content-Type: application/json" \
    --data '{"user": "alice", "text": "Hello, I am Alice"}'
```

## Explore the console

1. Open the [**Akka Console**](https://console.akka.io).
2. Navigate to the **Project** where the Service is deployed.
3. Click on the **Service** card of the Service. It shows detailed information about the running service.

## Next steps

1. Read about other deployment options in [Operating](../operations/index.html)
2. Learn more details about [Deploy and manage services](../operations/services/deploy-service.html)

## Code Examples

### Example 1: Deploy to akka.io

```command
akka auth login
```

### Example 2: Deploy to akka.io

```command
mvn clean install -DskipTests
```

### Example 3: Deploy to akka.io

```command
DOCKER> Tagging image helloworld-agent:1.0-SNAPSHOT-20250630102843 successful!
```

### Example 4: Deploy to akka.io

```command
akka secret create generic openai-api --literal key=$OPENAI_API_KEY
```

### Example 5: Deploy to akka.io

```command
akka service deploy helloworld-service helloworld-agent:tag-name --push \
  --secret-env OPENAI_API_KEY=openai-api/key
```

### Example 6: Deploy to akka.io

```command
akka service list
```

### Example 7: Deploy to akka.io

```command
akka service expose helloworld-service
```

### Example 8: Deploy to akka.io

```command
Service 'helloworld-service' was successfully exposed at: spring-tooth-3406.gcp-us-east1.akka.services
```

### Example 9: Invoke your deployed service

```command
curl -i -XPOST --location "https://spring-tooth-3406.gcp-us-east1.akka.services[http://localhost:9000]/hello" \
    --header "Content-Type: application/json" \
    --data '{"user": "alice", "text": "Hello, I am Alice"}'
```

## Related Pages (Internal Links)

- https://doc.akka.io/getting-started/author-your-first-service.html
- https://doc.akka.io/operations/cli/installation.html
- https://doc.akka.io/operations/index.html
- https://doc.akka.io/operations/services/deploy-service.html

---
*Source: [https://doc.akka.io/getting-started/quick-deploy.html](https://doc.akka.io/getting-started/quick-deploy.html)*