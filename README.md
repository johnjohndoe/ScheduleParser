# ScheduleParser

A Java library containing a parser and models for the congress API available here:

* http://api.republica.bitfever.de/
* http://api.republica.bitfever.de/events
* http://api.republica.bitfever.de/30c3/sessions - *Attention: Large file*


## Usage

The library can be accessed via the `ApiModule` class.

```java
ScheduleService scheduleService = ApiModule.getScheduleService();
scheduleService.getSessionsResponse(new Callback<SessionsResponse>() {
    // Handle response
}
```

Make sure to define the following `packagingOptions` in the  `build.gradle` of you app.

```groovy
packagingOptions {
    exclude 'META-INF/LICENSE'
    exclude 'META-INF/NOTICE'
}
```

There is a **demo application** to checkout a working a example.



### Gradle build

To install the sample application to your device run the following task:

```bash
$ ./gradlew installDebug
```

To deploy the library to your local Maven repository run the following task:

```bash
$ ./gradlew install
```

Then, to use the library in your project add the following to your `build.gradle`:

```groovy
dependencies {
    compile 'info.metadude.android.library.schedule.parser:scheduleparser:1.0.0'
}
```



## Author

* [Tobias Preuss][tobias-preuss]

## License

    Copyright 2014 Tobias Preuss

    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.


[tobias-preuss]: https://github.com/johnjohndoe
