### Running tests on local emulator

```shell
./gradlew :app:localDeviceDebugAndroidTest
```

Only `MyLargeTest` gets executed, as expected:

| Class       | Tests | Failures | Skipped | Duration | Success rate |
|-------------|-------|----------|---------|----------|--------------|
| MyLargeTest | 1     | 0        | 0       | 0.010s   | 100%         |

### Running tests on Firebase Test Lab

```shell
./gradlew :app:ftlDeviceDebugAndroidTest
```

Both `MyLargeTest` and `MySmallTest` get executed:

| Class       | Tests | Failures | Skipped | Duration | Success rate |
|-------------|-------|----------|---------|----------|--------------|
| MyLargeTest | 1     | 0        | 0       | 0.008s   | 100%         |
| MySmallTest | 2     | 0        | 0       | 0.011s   | 100%         |
