## Add some way to execute suites of tests from the command line?

* `-Dtest` does not seem to work with inner classes
* [categories](https://github.com/junit-team/junit/wiki/Categories) only work if the category is a separate class
* but it still wants to enumerate all the tests which takes a long time
* perhaps a combination with includes/excludes and profiles? However I couldn't get this to work for now
* also see `combine.self="override"` for configurations in profiles

