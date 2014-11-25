package info.metadude.android.library.schedule.parser;

import retrofit.RestAdapter;

public class ApiModule {

    public static ScheduleService getScheduleService() {
        RestAdapter restAdapter = new RestAdapter.Builder()
                .setEndpoint("http://api.republica.bitfever.de")
                .setLogLevel(RestAdapter.LogLevel.HEADERS)
                .build();
        return restAdapter.create(ScheduleService.class);
    }

}
