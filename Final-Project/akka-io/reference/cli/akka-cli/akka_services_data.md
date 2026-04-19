---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:20:55Z'
section: reference
site: akka-io
source_url: https://doc.akka.io/reference/cli/akka-cli/akka_services_data.html
title: 'akka services data :: Akka Documentation'
---

# akka services data :: Akka Documentation

## Content

# akka services data

Manage the data of a service.

## Options

```
  -h, --help   help for data
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
- [akka services data cancel\-task](akka_services_data_cancel-task.html) \- Cancel a data operation task for a service
- [akka services data export](akka_services_data_export.html) \- Export the data of a service.
- [akka services data get\-task](akka_services_data_get-task.html) \- Get a data operation task for a service
- [akka services data import](akka_services_data_import.html) \- Import data to a service.
- [akka services data list\-tasks](akka_services_data_list-tasks.html) \- List data operation tasks for a service
- [akka services data watch\-task](akka_services_data_watch-task.html) \- Watch a data operation task for a service

## Related Pages (Internal Links)

- https://doc.akka.io/reference/cli/akka-cli/akka_services.html
- https://doc.akka.io/reference/cli/akka-cli/akka_services_data_cancel-task.html
- https://doc.akka.io/reference/cli/akka-cli/akka_services_data_export.html
- https://doc.akka.io/reference/cli/akka-cli/akka_services_data_get-task.html
- https://doc.akka.io/reference/cli/akka-cli/akka_services_data_import.html
- https://doc.akka.io/reference/cli/akka-cli/akka_services_data_list-tasks.html
- https://doc.akka.io/reference/cli/akka-cli/akka_services_data_watch-task.html

---
*Source: [https://doc.akka.io/reference/cli/akka-cli/akka_services_data.html](https://doc.akka.io/reference/cli/akka-cli/akka_services_data.html)*