---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:20:51Z'
section: reference
site: akka-io
source_url: https://doc.akka.io/reference/cli/akka-cli/akka_services.html
title: 'akka services :: Akka Documentation'
---

# akka services :: Akka Documentation

## Content

# akka services

Manage and deploy services on Akka.

## Synopsis

The `akka services` commands are used to manage and modify the services in your Akka project.

## Options

```
  -h, --help   help for services
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

- [akka](akka.html) \- Akka control
- [akka services apply](akka_services_apply.html) \- Apply a service descriptor to the currently configured project.
- [akka services components](akka_services_components.html) \- Inspect components of a service.
- [akka services connectivity](akka_services_connectivity.html) \- Summarize all services connectivity and status.
- [akka services data](akka_services_data.html) \- Manage the data of a service.
- [akka services delete](akka_services_delete.html) \- Delete a service.
- [akka services deploy](akka_services_deploy.html) \- Deploy a service to the currently configured project.
- [akka services edit](akka_services_edit.html) \- Edit a service descriptor in the currently configured project.
- [akka services export](akka_services_export.html) \- Export a service as its service descriptor.
- [akka services expose](akka_services_expose.html) \- Expose a service.
- [akka services get](akka_services_get.html) \- Describe a specific service.
- [akka services jwts](akka_services_jwts.html) \- Manage JWT keys of a service.
- [akka services list](akka_services_list.html) \- List all services.
- [akka services logging](akka_services_logging.html) \- Change the log level configuration of a service.
- [akka services pause](akka_services_pause.html) \- Pause a service, scaling it to zero instances.
- [akka services proxy](akka_services_proxy.html) \- Create an HTTP proxy to a service.
- [akka services remove\-config](akka_services_remove-config.html) \- Remove the service config from a service.
- [akka services restart](akka_services_restart.html) \- Restart all service instances using the newest image.
- [akka services restore](akka_services_restore.html) \- Restore a service that was deleted in the past two weeks.
- [akka services resume](akka_services_resume.html) \- Resume a service, scaling it back up.
- [akka services set\-config](akka_services_set-config.html) \- Set the service config for a service.
- [akka services unexpose](akka_services_unexpose.html) \- Unexpose a service.
- [akka services views](akka_services_views.html) \- Manage views.

## Related Pages (Internal Links)

- https://doc.akka.io/reference/cli/akka-cli/akka.html
- https://doc.akka.io/reference/cli/akka-cli/akka_services_apply.html
- https://doc.akka.io/reference/cli/akka-cli/akka_services_components.html
- https://doc.akka.io/reference/cli/akka-cli/akka_services_connectivity.html
- https://doc.akka.io/reference/cli/akka-cli/akka_services_data.html
- https://doc.akka.io/reference/cli/akka-cli/akka_services_delete.html
- https://doc.akka.io/reference/cli/akka-cli/akka_services_deploy.html
- https://doc.akka.io/reference/cli/akka-cli/akka_services_edit.html
- https://doc.akka.io/reference/cli/akka-cli/akka_services_export.html
- https://doc.akka.io/reference/cli/akka-cli/akka_services_expose.html
- https://doc.akka.io/reference/cli/akka-cli/akka_services_get.html
- https://doc.akka.io/reference/cli/akka-cli/akka_services_jwts.html
- https://doc.akka.io/reference/cli/akka-cli/akka_services_list.html
- https://doc.akka.io/reference/cli/akka-cli/akka_services_logging.html
- https://doc.akka.io/reference/cli/akka-cli/akka_services_pause.html
- https://doc.akka.io/reference/cli/akka-cli/akka_services_proxy.html
- https://doc.akka.io/reference/cli/akka-cli/akka_services_remove-config.html
- https://doc.akka.io/reference/cli/akka-cli/akka_services_restart.html
- https://doc.akka.io/reference/cli/akka-cli/akka_services_restore.html
- https://doc.akka.io/reference/cli/akka-cli/akka_services_resume.html
- https://doc.akka.io/reference/cli/akka-cli/akka_services_set-config.html
- https://doc.akka.io/reference/cli/akka-cli/akka_services_unexpose.html
- https://doc.akka.io/reference/cli/akka-cli/akka_services_views.html

---
*Source: [https://doc.akka.io/reference/cli/akka-cli/akka_services.html](https://doc.akka.io/reference/cli/akka-cli/akka_services.html)*