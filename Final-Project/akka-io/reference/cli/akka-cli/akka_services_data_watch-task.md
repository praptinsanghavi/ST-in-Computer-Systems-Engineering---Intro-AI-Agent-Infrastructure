---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:20:58Z'
section: reference
site: akka-io
source_url: https://doc.akka.io/reference/cli/akka-cli/akka_services_data_watch-task.html
title: 'akka services data watch-task :: Akka Documentation'
---

# akka services data watch-task :: Akka Documentation

## Content

# akka services data watch\-task

Watch a data operation task for a service

## Synopsis

The `akka service data watch-task` command watches a data task for a service.

```
akka services data watch-task SERVICE TASK_UUID [flags]
```

## Options

```
  -h, --help             help for watch-task
      --owner string     the owner of the project to use, needed if you have two projects with the same name from different owners
      --project string   project to use if not using the default configured project
      --region string    region to use if project has more than one region
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

- [akka services data](akka_services_data.html) \- Manage the data of a service.

## Related Pages (Internal Links)

- https://doc.akka.io/reference/cli/akka-cli/akka_services_data.html

---
*Source: [https://doc.akka.io/reference/cli/akka-cli/akka_services_data_watch-task.html](https://doc.akka.io/reference/cli/akka-cli/akka_services_data_watch-task.html)*