This project demonstrates performance issue when migrating from JUnit `Vintage` to JUnit `Jupiter`.

# What are the results?

With a simple test class (which contains 15 tests):

- `Vintage` version takes **50ms**
- `Jupiter` version takes **800ms** :warning: x16

Produced with `JUnit 5.2.0` and `Mockito 2.19.0` on my laptop.

# How to run this benchmark myself?

```bash
./gradlew test
```

Open `build/reports/tests/test/index.html`.
