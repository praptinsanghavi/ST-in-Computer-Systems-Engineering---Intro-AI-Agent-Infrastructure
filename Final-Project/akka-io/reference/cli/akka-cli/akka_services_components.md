---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:20:53Z'
section: reference
site: akka-io
source_url: https://doc.akka.io/reference/cli/akka-cli/akka_services_components.html
title: 'akka services components :: Akka Documentation'
---

# akka services components :: Akka Documentation

## Content

# akka services components

Inspect components of a service.

## Synopsis

The `akka service components` commands provides a way to inspect the components of a service but also to peek at the data stored in the different entities.

## Options

```
  -h, --help   help for components
```

## Options inherited from parent commands

```
      --cache-file string   location of cache file (default "~/.akka/cache.yaml")
      --config string       location of config file (default "~/.akka/config.yaml")
      --context string      configuration context to use
      --disable-prompt      Disable all interactive prompts when running akka commands. If input is required, defaults will be used, or an error will be raised.
                            This is equivalent to setting the environment variable AKKA_DISABLE_PROMPTS to true.
  -o, --output string       set output format to one of [text,json,json-compact,go-template=] (default "text")
      --page-mode string    the mode for paging, either paged, buffered or auto. (default "auto")
  -q, --quiet               set quiet output (helpful when used as part of a script)
      --timeout duration    client command timeout (default 10s)
      --use-grpc-web        use grpc-web when talking to Akka APIs. This is useful when behind corporate firewalls that decrypt traffic but don't support HTTP/2.
  -v, --verbose             set verbose output
```

## SEE ALSO

- [akka services](akka_services.html) \- Manage and deploy services on Akka.
- [akka services components get\-state](akka_services_components_get-state.html) \- List the state for the given service, stateful component and id.
- [akka services components get\-workflow](akka_services_components_get-workflow.html) \- Get workflow execution details for the specified service, workflow component id and workflow id
- [akka services components list](akka_services_components_list.html) \- List the components served by this service.
- [akka services components list\-events](akka_services_components_list-events.html) \- List events from the Event Sourced Entity for the given service, component and entity id.
- [akka services components list\-ids](akka_services_components_list-ids.html) \- List the IDs for the given stateful component served by this service.
- [akka services components list\-interactions](akka_services_components_list-interactions.html) \- List interactions from the Agent for the given service and Agent id.
- [akka services components list\-timers](akka_services_components_list-timers.html) \- List the timers registered in this service.

## Related Pages (Internal Links)

- https://doc.akka.io/reference/cli/akka-cli/akka_services.html
- https://doc.akka.io/reference/cli/akka-cli/akka_services_components_get-state.html
- https://doc.akka.io/reference/cli/akka-cli/akka_services_components_get-workflow.html
- https://doc.akka.io/reference/cli/akka-cli/akka_services_components_list-events.html
- https://doc.akka.io/reference/cli/akka-cli/akka_services_components_list-ids.html
- https://doc.akka.io/reference/cli/akka-cli/akka_services_components_list-interactions.html
- https://doc.akka.io/reference/cli/akka-cli/akka_services_components_list-timers.html
- https://doc.akka.io/reference/cli/akka-cli/akka_services_components_list.html

---
*Source: [https://doc.akka.io/reference/cli/akka-cli/akka_services_components.html](https://doc.akka.io/reference/cli/akka-cli/akka_services_components.html)*