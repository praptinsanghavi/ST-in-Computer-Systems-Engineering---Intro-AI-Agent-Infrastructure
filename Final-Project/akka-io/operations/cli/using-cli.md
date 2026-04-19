---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:21:24Z'
section: operations
site: akka-io
source_url: https://doc.akka.io/operations/cli/using-cli.html
title: 'Using the Akka CLI :: Akka Documentation'
---

# Using the Akka CLI :: Akka Documentation

## Content

# Using the Akka CLI

The Akka command\-line interface (CLI) complements the browser\-based [Akka Console](https://console.akka.io) user interface (UI), allowing you to perform deployment and configuration operations directly from the command line. This page provides an overview of common commands.

For a full reference of all available commands, see the [reference](../../reference/cli/akka-cli/index.html) page.

|  | Check regularly to ensure you have the latest version of the `akka` CLI. You can check the installed version by running:     ``` akka version ```     For instructions on updating, see [installing and updating](installation.html). |
| --- | --- |

## Basic CLI Usage

The general structure of an Akka CLI command is:

```
akka <command> [sub-command] [parameters] --[flags]
```

Flags, which modify command behavior, are always preceded by `--`.

## Logging In

Before using the `akka` CLI, you must authenticate with your Akka account. To initiate the login process, run:

```
akka auth login
```

This command opens the Akka console login screen in your default web browser. The CLI will display `Waiting for UI login…​` while you authenticate. Once authorization is complete, the CLI returns to the command prompt.

Upon successful authentication:

- If you have one project, it is automatically set as the `current` project.
- If no projects exist, you’ll need to create one and set it manually.
- If you have multiple projects, you’ll need to specify the target project manually (see below).

To set your current project:

```
akka config set project my-project
```

For more authentication options:

```
akka auth -h
```

You can also refer to the [auth](../../reference/cli/akka-cli/akka_auth.html) page.

### Handling Proxies

In corporate environments with HTTP proxy servers that don’t support HTTP/2, you may encounter issues since the `akka` CLI uses gRPC. To bypass these limitations, you can configure the CLI to use grpc\-web, which works over HTTP/1\.1 and HTTP/2\.

Log in with grpc\-web enabled:

```
akka auth login --use-grpc-web
```

If you’re already logged in but need to switch to grpc\-web, configure it with:

```
akka config set api-server-use-grpc-web true
```

## Managing Projects

The Akka CLI allows you to create, list, and configure projects.

For more commands, see the [projects](../../reference/cli/akka-cli/akka_projects.html) page.

### Creating a New Project

To create a new project within your organization:

```
akka projects new sample-project "An example project in Akka"
```

This creates a project named `sample-project` with the description `"An example project in Akka"`.

To set this new project as your current project:

```
akka config set project sample-project
```

### Listing Projects

To list all projects accessible within your organization:

```
akka projects list
```

The CLI displays a list of available projects, with the current project marked by an asterisk (`*`).

## Managing Container Registry Credentials

To allow Akka services to pull images from private Docker registries, add container registry credentials with the following command:

```
akka docker add-credentials \
  --docker-server https://mydockerregistry.com \
  --docker-username myself \
  --docker-password secret
```

Required flags:
\* `--docker-server` (e.g., `<https://mydockerregistry.com>`)
\* `--docker-username` (your Docker username)
\* `--docker-password` (your Docker password)

TODO: For more details, see `akka docker -h` or visit [docker](../../reference/cli/akka-cli/akka_docker.html) page.

|  | For more information about using the Akka Container Registry (ACR) or external container registries, see [Configure a container registry](../projects/container-registries.html). |
| --- | --- |

## Managing Services

The `akka services` commands allow you to interact with services in your current Akka project.

### Listing Services

To list all services in the current project:

```
akka services list
```

The CLI displays a summary of all services, including their names and statuses.

### Deploying a Service

To deploy a service using a Docker image, run:

```
akka services deploy my-service my-container-uri/container-name:tag-name
```

Ensure you’ve set up your container registry credentials before deploying. For more details, see [container registry](../projects/container-registries.html) page.

### Exposing a route for inbound traffic

To expose a service for inbound traffic:

```
akka services expose my-service --enable-cors
```

This command creates a route for the specified service, with the option to enable HTTP CORS using the `--enable-cors` flag.

### Viewing Service Logs

To view logs from a specific service:

```
akka services logs my-service --follow
```

This command streams the logging output for the service.

### Viewing Service Details

To view detailed information about a service:

```
akka services get my-service
```

This command returns a detailed description of the service’s configuration and status.

### Inspecting Service Components

Akka services consist of one or more components. You can list and inspect these components using the following commands.

To list the components of a service:

```
akka services components my-service list
```

The CLI will display a list of components for the specified service:

```
NAME                                     TYPE           TYPE ID
com.example.api.ShoppingCartController   HttpEndpoint
com.example.api.ShoppingCartEntity       KeyValueEntity shopping-cart
```

This table shows the component names, their types, and any associated type IDs.

|  | If you want to view the events from an event sourced entity you can use the `akka service components list-events` command.   More information about this command in [components](../../reference/cli/akka-cli/akka_services_components_list-events.html) page. |
| --- | --- |

## Related documentation

- [Enable CLI command completion](command-completion.html)
- [CLI command reference](../../reference/cli/akka-cli/index.html)

## Code Examples

### Example 1: Using the Akka CLI

```shell
akka version
```

### Example 2: Basic CLI Usage

```shell
akka <command> [sub-command] [parameters] --[flags]
```

### Example 3: Logging In

```shell
akka auth login
```

### Example 4: Logging In

```shell
akka config set project my-project
```

### Example 5: Logging In

```shell
akka auth -h
```

### Example 6: Handling Proxies

```shell
akka auth login --use-grpc-web
```

### Example 7: Handling Proxies

```shell
akka config set api-server-use-grpc-web true
```

### Example 8: Creating a New Project

```shell
akka projects new sample-project "An example project in Akka"
```

### Example 9: Creating a New Project

```shell
akka config set project sample-project
```

### Example 10: Listing Projects

```shell
akka projects list
```

### Example 11: Managing Container Registry Credentials

```shell
akka docker add-credentials \
  --docker-server https://mydockerregistry.com \
  --docker-username myself \
  --docker-password secret
```

### Example 12: Listing Services

```shell
akka services list
```

### Example 13: Deploying a Service

```shell
akka services deploy my-service my-container-uri/container-name:tag-name
```

### Example 14: Exposing a route for inbound traffic

```shell
akka services expose my-service --enable-cors
```

### Example 15: Viewing Service Logs

```shell
akka services logs my-service --follow
```

### Example 16: Viewing Service Details

```shell
akka services get my-service
```

### Example 17: Inspecting Service Components

```shell
akka services components my-service list
```

### Example 18: Inspecting Service Components

```shell
NAME                                     TYPE           TYPE ID
com.example.api.ShoppingCartController   HttpEndpoint
com.example.api.ShoppingCartEntity       KeyValueEntity shopping-cart
```

## Related Pages (Internal Links)

- https://doc.akka.io/operations/cli/command-completion.html
- https://doc.akka.io/operations/cli/installation.html
- https://doc.akka.io/operations/projects/container-registries.html
- https://doc.akka.io/reference/cli/akka-cli/akka_auth.html
- https://doc.akka.io/reference/cli/akka-cli/akka_docker.html
- https://doc.akka.io/reference/cli/akka-cli/akka_projects.html
- https://doc.akka.io/reference/cli/akka-cli/akka_services_components_list-events.html
- https://doc.akka.io/reference/cli/akka-cli/index.html

---
*Source: [https://doc.akka.io/operations/cli/using-cli.html](https://doc.akka.io/operations/cli/using-cli.html)*